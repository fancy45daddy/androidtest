package brut.androlib.res.decoder;

import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import brut.androlib.AndrolibException;
import brut.androlib.res.xml.ResXmlEncoders;
import brut.util.ExtDataInput;
import com.mindprod.ledatastream.LEDataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes2.dex */
public class AXmlResourceParser implements XmlResourceParser {
    private static final int ATTRIBUTE_IX_NAME = 1;
    private static final int ATTRIBUTE_IX_NAMESPACE_URI = 0;
    private static final int ATTRIBUTE_IX_VALUE_DATA = 4;
    private static final int ATTRIBUTE_IX_VALUE_STRING = 2;
    private static final int ATTRIBUTE_IX_VALUE_TYPE = 3;
    private static final int ATTRIBUTE_LENGHT = 5;
    private static final int CHUNK_AXML_FILE = 524291;
    private static final int CHUNK_RESOURCEIDS = 524672;
    private static final int CHUNK_XML_END_NAMESPACE = 1048833;
    private static final int CHUNK_XML_END_TAG = 1048835;
    private static final int CHUNK_XML_FIRST = 1048832;
    private static final int CHUNK_XML_LAST = 1048836;
    private static final int CHUNK_XML_START_NAMESPACE = 1048832;
    private static final int CHUNK_XML_START_TAG = 1048834;
    private static final int CHUNK_XML_TEXT = 1048836;
    private static final String E_NOT_SUPPORTED = "Method is not supported.";
    private static final Logger LOGGER = Logger.getLogger(AXmlResourceParser.class.getName());
    private ResAttrDecoder mAttrDecoder;
    private AndrolibException mFirstError;
    private int[] m_attributes;
    private int m_classAttribute;
    private boolean m_decreaseDepth;
    private int m_event;
    private int m_idAttribute;
    private int m_lineNumber;
    private int m_name;
    private int m_namespaceUri;
    private NamespaceStack m_namespaces;
    private boolean m_operational;
    private ExtDataInput m_reader;
    private int[] m_resourceIDs;
    private StringBlock m_strings;
    private int m_styleAttribute;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class NamespaceStack {
        private int m_count;
        private int[] m_data = new int[32];
        private int m_dataLength;
        private int m_depth;

        private void ensureDataCapacity(int i) {
            int[] iArr = this.m_data;
            int length = iArr.length;
            int i2 = this.m_dataLength;
            int i3 = length - i2;
            if (i3 > i) {
                return;
            }
            int[] iArr2 = new int[(iArr.length + i3) * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.m_data = iArr2;
        }

        private final int find(int i, boolean z) {
            int i2 = this.m_dataLength;
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            for (int i4 = this.m_depth; i4 != 0; i4--) {
                i3 -= 2;
                for (int i5 = this.m_data[i3]; i5 != 0; i5--) {
                    int[] iArr = this.m_data;
                    if (z) {
                        if (iArr[i3] == i) {
                            return iArr[i3 + 1];
                        }
                    } else if (iArr[i3 + 1] == i) {
                        return iArr[i3];
                    }
                    i3 -= 2;
                }
            }
            return -1;
        }

        private final int get(int i, boolean z) {
            if (this.m_dataLength != 0 && i >= 0) {
                int i2 = 0;
                for (int i3 = this.m_depth; i3 != 0; i3--) {
                    int[] iArr = this.m_data;
                    int i4 = iArr[i2];
                    if (i < i4) {
                        int i5 = i2 + (i * 2) + 1;
                        if (!z) {
                            i5++;
                        }
                        return iArr[i5];
                    }
                    i -= i4;
                    i2 += (i4 * 2) + 2;
                }
            }
            return -1;
        }

        public final void decreaseDepth() {
            int i = this.m_dataLength;
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            int i3 = this.m_data[i2];
            int i4 = i3 * 2;
            if ((i2 - 1) - i4 == 0) {
                return;
            }
            this.m_dataLength = i - (i4 + 2);
            this.m_count -= i3;
            this.m_depth--;
        }

        public final int findPrefix(int i) {
            return find(i, false);
        }

        public final int findUri(int i) {
            return find(i, true);
        }

        public final int getAccumulatedCount(int i) {
            int i2 = 0;
            if (this.m_dataLength != 0 && i >= 0) {
                int i3 = this.m_depth;
                if (i > i3) {
                    i = i3;
                }
                int i4 = 0;
                while (i != 0) {
                    int i5 = this.m_data[i4];
                    i2 += i5;
                    i4 += (i5 * 2) + 2;
                    i--;
                }
            }
            return i2;
        }

        public final int getCurrentCount() {
            int i = this.m_dataLength;
            if (i == 0) {
                return 0;
            }
            return this.m_data[i - 1];
        }

        public final int getDepth() {
            return this.m_depth;
        }

        public final int getPrefix(int i) {
            return get(i, true);
        }

        public final int getTotalCount() {
            return this.m_count;
        }

        public final int getUri(int i) {
            return get(i, false);
        }

        public final void increaseDepth() {
            ensureDataCapacity(2);
            int i = this.m_dataLength;
            int[] iArr = this.m_data;
            iArr[i] = 0;
            iArr[i + 1] = 0;
            this.m_dataLength = i + 2;
            this.m_depth++;
        }

        public final boolean pop() {
            int i;
            int[] iArr;
            int i2;
            int i3 = this.m_dataLength;
            if (i3 == 0 || (i2 = (iArr = this.m_data)[i3 - 1]) == 0) {
                return false;
            }
            int i4 = i2 - 1;
            int i5 = i - 2;
            iArr[i5] = i4;
            iArr[i5 - ((i4 * 2) + 1)] = i4;
            this.m_dataLength = i3 - 2;
            this.m_count--;
            return true;
        }

        public final boolean pop(int i, int i2) {
            int i3 = this.m_dataLength;
            if (i3 == 0) {
                return false;
            }
            int i4 = i3 - 1;
            int i5 = this.m_data[i4];
            int i6 = i4 - 2;
            int i7 = 0;
            while (i7 != i5) {
                int[] iArr = this.m_data;
                if (iArr[i6] == i && iArr[i6 + 1] == i2) {
                    int i8 = i5 - 1;
                    if (i7 == 0) {
                        iArr[i6] = i8;
                        iArr[i6 - ((i8 * 2) + 1)] = i8;
                    } else {
                        iArr[i4] = i8;
                        iArr[i4 - ((i8 * 2) + 3)] = i8;
                        System.arraycopy(iArr, i6 + 2, iArr, i6, this.m_dataLength - i6);
                    }
                    this.m_dataLength -= 2;
                    this.m_count--;
                    return true;
                }
                i7++;
                i6 -= 2;
            }
            return false;
        }

        public final void push(int i, int i2) {
            if (this.m_depth == 0) {
                increaseDepth();
            }
            ensureDataCapacity(2);
            int i3 = this.m_dataLength;
            int i4 = i3 - 1;
            int[] iArr = this.m_data;
            int i5 = iArr[i4];
            int i6 = i5 + 1;
            iArr[(i4 - 1) - (i5 * 2)] = i6;
            iArr[i4] = i;
            iArr[i4 + 1] = i2;
            iArr[i4 + 2] = i6;
            this.m_dataLength = i3 + 2;
            this.m_count++;
        }

        public final void reset() {
            this.m_dataLength = 0;
            this.m_count = 0;
            this.m_depth = 0;
        }
    }

    public AXmlResourceParser() {
        this.mAttrDecoder = new ResAttrDecoder();
        this.m_operational = false;
        this.m_namespaces = new NamespaceStack();
        resetEventInfo();
    }

    public AXmlResourceParser(InputStream inputStream) {
        this();
        open(inputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0189, code lost:
        throw new java.io.IOException("Invalid chunk type (" + r5 + ").");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void doNext() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: brut.androlib.res.decoder.AXmlResourceParser.doNext():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
        return r0 / 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findAttribute(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            brut.androlib.res.decoder.StringBlock r0 = r5.m_strings
            r1 = -1
            if (r0 == 0) goto L32
            if (r7 != 0) goto L8
            goto L32
        L8:
            int r7 = r0.find(r7)
            if (r7 != r1) goto Lf
            return r1
        Lf:
            if (r6 == 0) goto L18
            brut.androlib.res.decoder.StringBlock r0 = r5.m_strings
            int r6 = r0.find(r6)
            goto L19
        L18:
            r6 = -1
        L19:
            r0 = 0
        L1a:
            int[] r2 = r5.m_attributes
            int r3 = r2.length
            if (r0 == r3) goto L32
            int r3 = r0 + 1
            r4 = r2[r3]
            if (r7 != r4) goto L30
            if (r6 == r1) goto L2d
            int r4 = r0 + 0
            r2 = r2[r4]
            if (r6 != r2) goto L30
        L2d:
            int r0 = r0 / 5
            return r0
        L30:
            r0 = r3
            goto L1a
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: brut.androlib.res.decoder.AXmlResourceParser.findAttribute(java.lang.String, java.lang.String):int");
    }

    private final int getAttributeOffset(int i) {
        if (this.m_event == 2) {
            int i2 = i * 5;
            if (i2 < this.m_attributes.length) {
                return i2;
            }
            throw new IndexOutOfBoundsException("Invalid attribute index (" + i + ").");
        }
        throw new IndexOutOfBoundsException("Current event is not START_TAG.");
    }

    private final void resetEventInfo() {
        this.m_event = -1;
        this.m_lineNumber = -1;
        this.m_name = -1;
        this.m_namespaceUri = -1;
        this.m_attributes = null;
        this.m_idAttribute = -1;
        this.m_classAttribute = -1;
        this.m_styleAttribute = -1;
    }

    private void setFirstError(AndrolibException androlibException) {
        if (this.mFirstError == null) {
            this.mFirstError = androlibException;
        }
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public void close() {
        if (this.m_operational) {
            this.m_operational = false;
            this.m_reader = null;
            this.m_strings = null;
            this.m_resourceIDs = null;
            this.m_namespaces.reset();
            resetEventInfo();
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        throw new XmlPullParserException(E_NOT_SUPPORTED);
    }

    public ResAttrDecoder getAttrDecoder() {
        return this.mAttrDecoder;
    }

    @Override // android.util.AttributeSet
    public boolean getAttributeBooleanValue(int i, boolean z) {
        return getAttributeIntValue(i, z ? 1 : 0) != 0;
    }

    @Override // android.util.AttributeSet
    public boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        int findAttribute = findAttribute(str, str2);
        return findAttribute == -1 ? z : getAttributeBooleanValue(findAttribute, z);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public int getAttributeCount() {
        if (this.m_event != 2) {
            return -1;
        }
        return this.m_attributes.length / 5;
    }

    @Override // android.util.AttributeSet
    public float getAttributeFloatValue(int i, float f) {
        int attributeOffset = getAttributeOffset(i);
        int[] iArr = this.m_attributes;
        return iArr[attributeOffset + 3] == 4 ? Float.intBitsToFloat(iArr[attributeOffset + 4]) : f;
    }

    @Override // android.util.AttributeSet
    public float getAttributeFloatValue(String str, String str2, float f) {
        int findAttribute = findAttribute(str, str2);
        return findAttribute == -1 ? f : getAttributeFloatValue(findAttribute, f);
    }

    @Override // android.util.AttributeSet
    public int getAttributeIntValue(int i, int i2) {
        int attributeOffset = getAttributeOffset(i);
        int[] iArr = this.m_attributes;
        int i3 = iArr[attributeOffset + 3];
        return (i3 < 16 || i3 > 31) ? i2 : iArr[attributeOffset + 4];
    }

    @Override // android.util.AttributeSet
    public int getAttributeIntValue(String str, String str2, int i) {
        int findAttribute = findAttribute(str, str2);
        return findAttribute == -1 ? i : getAttributeIntValue(findAttribute, i);
    }

    @Override // android.util.AttributeSet
    public int getAttributeListValue(int i, String[] strArr, int i2) {
        return 0;
    }

    @Override // android.util.AttributeSet
    public int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return 0;
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeName(int i) {
        int i2 = this.m_attributes[getAttributeOffset(i) + 1];
        return i2 == -1 ? "" : this.m_strings.getString(i2);
    }

    @Override // android.util.AttributeSet
    public int getAttributeNameResource(int i) {
        int i2 = this.m_attributes[getAttributeOffset(i) + 1];
        int[] iArr = this.m_resourceIDs;
        if (iArr == null || i2 < 0 || i2 >= iArr.length) {
            return 0;
        }
        return iArr[i2];
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeNamespace(int i) {
        int i2 = this.m_attributes[getAttributeOffset(i) + 0];
        return i2 == -1 ? "" : this.m_strings.getString(i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributePrefix(int i) {
        int findPrefix = this.m_namespaces.findPrefix(this.m_attributes[getAttributeOffset(i) + 0]);
        return findPrefix == -1 ? "" : this.m_strings.getString(findPrefix);
    }

    @Override // android.util.AttributeSet
    public int getAttributeResourceValue(int i, int i2) {
        int attributeOffset = getAttributeOffset(i);
        int[] iArr = this.m_attributes;
        return iArr[attributeOffset + 3] == 1 ? iArr[attributeOffset + 4] : i2;
    }

    @Override // android.util.AttributeSet
    public int getAttributeResourceValue(String str, String str2, int i) {
        int findAttribute = findAttribute(str, str2);
        return findAttribute == -1 ? i : getAttributeResourceValue(findAttribute, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeType(int i) {
        return "CDATA";
    }

    @Override // android.util.AttributeSet
    public int getAttributeUnsignedIntValue(int i, int i2) {
        return getAttributeIntValue(i, i2);
    }

    @Override // android.util.AttributeSet
    public int getAttributeUnsignedIntValue(String str, String str2, int i) {
        int findAttribute = findAttribute(str, str2);
        return findAttribute == -1 ? i : getAttributeUnsignedIntValue(findAttribute, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeValue(int i) {
        String escapeXmlChars;
        int attributeOffset = getAttributeOffset(i);
        int[] iArr = this.m_attributes;
        int i2 = iArr[attributeOffset + 3];
        int i3 = iArr[attributeOffset + 4];
        int i4 = iArr[attributeOffset + 2];
        ResAttrDecoder resAttrDecoder = this.mAttrDecoder;
        if (resAttrDecoder != null) {
            if (i4 == -1) {
                escapeXmlChars = null;
            } else {
                try {
                    escapeXmlChars = ResXmlEncoders.escapeXmlChars(this.m_strings.getString(i4));
                } catch (AndrolibException e) {
                    setFirstError(e);
                    LOGGER.log(Level.WARNING, String.format("Could not decode attr value, using undecoded value instead: ns=%s, name=%s, value=0x%08x", getAttributePrefix(i), getAttributeName(i), Integer.valueOf(i3)), (Throwable) e);
                }
            }
            return resAttrDecoder.decode(i2, i3, escapeXmlChars, getAttributeNameResource(i));
        }
        return TypedValue.coerceToString(i2, i3);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getAttributeValue(String str, String str2) {
        int findAttribute = findAttribute(str, str2);
        if (findAttribute == -1) {
            return null;
        }
        return getAttributeValue(findAttribute);
    }

    public int getAttributeValueData(int i) {
        return this.m_attributes[getAttributeOffset(i) + 4];
    }

    public int getAttributeValueType(int i) {
        return this.m_attributes[getAttributeOffset(i) + 3];
    }

    @Override // android.util.AttributeSet
    public String getClassAttribute() {
        int i = this.m_classAttribute;
        if (i == -1) {
            return null;
        }
        return this.m_strings.getString(this.m_attributes[getAttributeOffset(i) + 2]);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getColumnNumber() {
        return -1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getDepth() {
        return this.m_namespaces.getDepth() - 1;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getEventType() throws XmlPullParserException {
        return this.m_event;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean getFeature(String str) {
        return false;
    }

    public AndrolibException getFirstError() {
        return this.mFirstError;
    }

    @Override // android.util.AttributeSet
    public String getIdAttribute() {
        int i = this.m_idAttribute;
        if (i == -1) {
            return null;
        }
        return this.m_strings.getString(this.m_attributes[getAttributeOffset(i) + 2]);
    }

    @Override // android.util.AttributeSet
    public int getIdAttributeResourceValue(int i) {
        int i2 = this.m_idAttribute;
        if (i2 == -1) {
            return i;
        }
        int attributeOffset = getAttributeOffset(i2);
        int[] iArr = this.m_attributes;
        return iArr[attributeOffset + 3] != 1 ? i : iArr[attributeOffset + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getInputEncoding() {
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getLineNumber() {
        return this.m_lineNumber;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getName() {
        int i = this.m_name;
        if (i != -1) {
            int i2 = this.m_event;
            if (i2 == 2 || i2 == 3) {
                return this.m_strings.getString(i);
            }
            return null;
        }
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace() {
        return this.m_strings.getString(this.m_namespaceUri);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace(String str) {
        throw new RuntimeException(E_NOT_SUPPORTED);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getNamespaceCount(int i) throws XmlPullParserException {
        return this.m_namespaces.getAccumulatedCount(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespacePrefix(int i) throws XmlPullParserException {
        return this.m_strings.getString(this.m_namespaces.getPrefix(i));
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespaceUri(int i) throws XmlPullParserException {
        return this.m_strings.getString(this.m_namespaces.getUri(i));
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public String getPositionDescription() {
        return "XML line #" + getLineNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPrefix() {
        return this.m_strings.getString(this.m_namespaces.findPrefix(this.m_namespaceUri));
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public Object getProperty(String str) {
        return null;
    }

    final StringBlock getStrings() {
        return this.m_strings;
    }

    @Override // android.util.AttributeSet
    public int getStyleAttribute() {
        int i = this.m_styleAttribute;
        if (i == -1) {
            return 0;
        }
        return this.m_attributes[getAttributeOffset(i) + 4];
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getText() {
        int i = this.m_name;
        if (i == -1 || this.m_event != 4) {
            return null;
        }
        return this.m_strings.getString(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public char[] getTextCharacters(int[] iArr) {
        String text = getText();
        if (text == null) {
            return null;
        }
        iArr[0] = 0;
        iArr[1] = text.length();
        char[] cArr = new char[text.length()];
        text.getChars(0, text.length(), cArr, 0);
        return cArr;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isAttributeDefault(int i) {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isEmptyElementTag() throws XmlPullParserException {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isWhitespace() throws XmlPullParserException {
        return false;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int next() throws XmlPullParserException, IOException {
        if (this.m_reader != null) {
            try {
                doNext();
                return this.m_event;
            } catch (IOException e) {
                close();
                throw e;
            }
        }
        throw new XmlPullParserException("Parser is not opened.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextTag() throws XmlPullParserException, IOException {
        int next = next();
        if (next == 4 && isWhitespace()) {
            next = next();
        }
        if (next == 2 || next == 3) {
            return next;
        }
        throw new XmlPullParserException("Expected start or end tag.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String nextText() throws XmlPullParserException, IOException {
        if (getEventType() == 2) {
            int next = next();
            if (next != 4) {
                if (next == 3) {
                    return "";
                }
                throw new XmlPullParserException("Parser must be on START_TAG or TEXT to read text.", this, null);
            }
            String text = getText();
            if (next() == 3) {
                return text;
            }
            throw new XmlPullParserException("Event TEXT must be immediately followed by END_TAG.", this, null);
        }
        throw new XmlPullParserException("Parser must be on START_TAG to read next text.", this, null);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextToken() throws XmlPullParserException, IOException {
        return next();
    }

    public void open(InputStream inputStream) {
        close();
        if (inputStream != null) {
            this.m_reader = new ExtDataInput(new LEDataInputStream(inputStream));
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void require(int i, String str, String str2) throws XmlPullParserException, IOException {
        if (i == getEventType() && ((str == null || str.equals(getNamespace())) && (str2 == null || str2.equals(getName())))) {
            return;
        }
        throw new XmlPullParserException(TYPES[i] + " is expected.", this, null);
    }

    public void setAttrDecoder(ResAttrDecoder resAttrDecoder) {
        this.mAttrDecoder = resAttrDecoder;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setFeature(String str, boolean z) throws XmlPullParserException {
        throw new XmlPullParserException(E_NOT_SUPPORTED);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        open(inputStream);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(Reader reader) throws XmlPullParserException {
        throw new XmlPullParserException(E_NOT_SUPPORTED);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setProperty(String str, Object obj) throws XmlPullParserException {
        throw new XmlPullParserException(E_NOT_SUPPORTED);
    }
}
