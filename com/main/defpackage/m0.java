package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.inmarket.m2m.data.Constants_BuildGenerated;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;
/* renamed from: m0  reason: default package */
/* loaded from: classes8.dex */
public class m0 implements Closeable {
    private static final char[] p = ")]}'\n".toCharArray();

    /* renamed from: a  reason: collision with root package name */
    private final Reader f12079a;
    private long i;
    private int j;
    private String k;
    private int[] l;
    private String[] n;
    private int[] o;
    private boolean b = false;
    private final char[] c = new char[1024];
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    int h = 0;
    private int m = 1;

    /* renamed from: m0$a */
    /* loaded from: classes8.dex */
    static class a extends n0 {
        a() {
        }

        @Override // defpackage.n0
        public void a(m0 m0Var) throws IOException {
            if (m0Var instanceof q0) {
                ((q0) m0Var).D();
                return;
            }
            int i = m0Var.h;
            if (i == 0) {
                i = m0Var.e();
            }
            if (i == 13) {
                m0Var.h = 9;
            } else if (i == 12) {
                m0Var.h = 8;
            } else if (i == 14) {
                m0Var.h = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + m0Var.u() + StringUtils.SPACE + " at line " + m0Var.i() + " column " + m0Var.h() + " path " + m0Var.j());
            }
        }
    }

    static {
        n0.f12109a = new a();
    }

    public m0(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        if (reader != null) {
            this.f12079a = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void c(char c) throws IOException {
        char[] cArr = this.c;
        do {
            int i = this.d;
            int i2 = this.e;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.d = i3;
                    return;
                } else if (c2 == '\\') {
                    this.d = i3;
                    x();
                    i = this.d;
                    i2 = this.e;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.g = i3;
                    }
                    i = i3;
                }
            }
            this.d = i;
        } while (a(1));
        throw b("Unterminated string");
    }

    private void d() throws IOException {
        a(true);
        int i = this.d - 1;
        this.d = i;
        char[] cArr = p;
        if (i + cArr.length > this.e && !a(cArr.length)) {
            return;
        }
        int i2 = 0;
        while (true) {
            char[] cArr2 = p;
            if (i2 < cArr2.length) {
                if (this.c[this.d + i2] != cArr2[i2]) {
                    return;
                }
                i2++;
            } else {
                this.d += cArr2.length;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
        c();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String t() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r5.d
            int r3 = r3 + r2
            int r4 = r5.e
            if (r3 >= r4) goto L4c
            char[] r4 = r5.c
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L48;
                case 93: goto L5a;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.c()
            goto L5a
        L4c:
            char[] r3 = r5.c
            int r3 = r3.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r5.a(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r0 = r2
            goto L76
        L5c:
            if (r1 != 0) goto L63
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L63:
            char[] r3 = r5.c
            int r4 = r5.d
            r1.append(r3, r4, r2)
            int r3 = r5.d
            int r3 = r3 + r2
            r5.d = r3
            r2 = 1
            boolean r2 = r5.a(r2)
            if (r2 != 0) goto L2
        L76:
            if (r1 != 0) goto L82
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.c
            int r3 = r5.d
            r1.<init>(r2, r3, r0)
            goto L8d
        L82:
            char[] r2 = r5.c
            int r3 = r5.d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L8d:
            int r2 = r5.d
            int r2 = r2 + r0
            r5.d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.t():java.lang.String");
    }

    private int v() throws IOException {
        int i;
        String str;
        String str2;
        char c = this.c[this.d];
        if (c == 't' || c == 'T') {
            i = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str = Constants_BuildGenerated.SS_API_HOST;
            str2 = ActionConst.NULL;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.d + i2 >= this.e && !a(i2 + 1)) {
                return 0;
            }
            char c2 = this.c[this.d + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.d + length < this.e || a(length + 1)) && a(this.c[this.d + length])) {
            return 0;
        }
        this.d += length;
        this.h = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0097, code lost:
        if (a(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        if (r9 != 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r13 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a1, code lost:
        if (r10 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a3, code lost:
        if (r12 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
        if (r12 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a8, code lost:
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a9, code lost:
        r18.i = r10;
        r18.d += r8;
        r18.h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b4, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b5, code lost:
        if (r9 == 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b8, code lost:
        if (r9 == 4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bb, code lost:
        if (r9 != 7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00be, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
        r18.j = r8;
        r18.h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c6, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c7, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int w() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.w():int");
    }

    private char x() throws IOException {
        int i;
        int i2;
        if (this.d == this.e && !a(1)) {
            throw b("Unterminated escape sequence");
        }
        char[] cArr = this.c;
        int i3 = this.d;
        int i4 = i3 + 1;
        this.d = i4;
        char c = cArr[i3];
        if (c == '\n') {
            this.f++;
            this.g = i4;
        } else if (c == 'b') {
            return '\b';
        } else {
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return CharUtils.CR;
            }
            if (c == 't') {
                return '\t';
            }
            if (c == 'u') {
                if (i4 + 4 > this.e && !a(4)) {
                    throw b("Unterminated escape sequence");
                }
                char c2 = 0;
                int i5 = this.d;
                int i6 = i5 + 4;
                while (i5 < i6) {
                    char c3 = this.c[i5];
                    char c4 = (char) (c2 << 4);
                    if (c3 < '0' || c3 > '9') {
                        if (c3 >= 'a' && c3 <= 'f') {
                            i = c3 - 'a';
                        } else if (c3 < 'A' || c3 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.c, this.d, 4));
                        } else {
                            i = c3 - 'A';
                        }
                        i2 = i + 10;
                    } else {
                        i2 = c3 - '0';
                    }
                    c2 = (char) (c4 + i2);
                    i5++;
                }
                this.d += 4;
                return c2;
            }
        }
        return c;
    }

    private void y() throws IOException {
        char c;
        do {
            if (this.d >= this.e && !a(1)) {
                return;
            }
            char[] cArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            c = cArr[i];
            if (c == '\n') {
                this.f++;
                this.g = i2;
                return;
            }
        } while (c != '\r');
    }

    private void z() throws IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.d + i;
                if (i2 < this.e) {
                    char c = this.c[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.d = i2;
                }
            }
            c();
            this.d += i;
            return;
        } while (a(1));
    }

    public void A() throws IOException {
        int i = 0;
        do {
            int i2 = this.h;
            if (i2 == 0) {
                i2 = e();
            }
            if (i2 == 3) {
                b(1);
            } else if (i2 == 1) {
                b(3);
            } else {
                if (i2 == 4) {
                    this.m--;
                } else if (i2 == 2) {
                    this.m--;
                } else {
                    if (i2 == 14 || i2 == 10) {
                        z();
                    } else if (i2 == 8 || i2 == 12) {
                        c(CoreConstants.SINGLE_QUOTE_CHAR);
                    } else if (i2 == 9 || i2 == 13) {
                        c('\"');
                    } else if (i2 == 16) {
                        this.d += this.j;
                    }
                    this.h = 0;
                }
                i--;
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.o;
        int i3 = this.m - 1;
        iArr[i3] = iArr[i3] + 1;
        this.n[i3] = Constants_BuildGenerated.SS_API_HOST;
    }

    public void a() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 3) {
            b(1);
            this.o[this.m - 1] = 0;
            this.h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + u() + " at line " + i() + " column " + h() + " path " + j());
    }

    public final void b(boolean z) {
        this.b = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.f12079a.close();
    }

    int e() throws IOException {
        int a2;
        int[] iArr = this.l;
        int i = this.m - 1;
        int i2 = iArr[i];
        if (i2 == 1) {
            iArr[i] = 2;
        } else if (i2 == 2) {
            int a3 = a(true);
            if (a3 != 44) {
                if (a3 != 59) {
                    if (a3 == 93) {
                        this.h = 4;
                        return 4;
                    }
                    throw b("Unterminated array");
                }
                c();
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i] = 4;
            if (i2 == 5 && (a2 = a(true)) != 44) {
                if (a2 != 59) {
                    if (a2 == 125) {
                        this.h = 2;
                        return 2;
                    }
                    throw b("Unterminated object");
                }
                c();
            }
            int a4 = a(true);
            if (a4 == 34) {
                this.h = 13;
                return 13;
            } else if (a4 == 39) {
                c();
                this.h = 12;
                return 12;
            } else if (a4 == 125) {
                if (i2 != 5) {
                    this.h = 2;
                    return 2;
                }
                throw b("Expected name");
            } else {
                c();
                this.d--;
                if (a((char) a4)) {
                    this.h = 14;
                    return 14;
                }
                throw b("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i] = 5;
            int a5 = a(true);
            if (a5 != 58) {
                if (a5 == 61) {
                    c();
                    if (this.d < this.e || a(1)) {
                        char[] cArr = this.c;
                        int i3 = this.d;
                        if (cArr[i3] == '>') {
                            this.d = i3 + 1;
                        }
                    }
                } else {
                    throw b("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.b) {
                d();
            }
            this.l[this.m - 1] = 7;
        } else if (i2 == 7) {
            if (a(false) == -1) {
                this.h = 17;
                return 17;
            }
            c();
            this.d--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int a6 = a(true);
        if (a6 == 34) {
            this.h = 9;
            return 9;
        } else if (a6 == 39) {
            c();
            this.h = 8;
            return 8;
        } else {
            if (a6 != 44 && a6 != 59) {
                if (a6 == 91) {
                    this.h = 3;
                    return 3;
                } else if (a6 != 93) {
                    if (a6 != 123) {
                        this.d--;
                        int v = v();
                        if (v != 0) {
                            return v;
                        }
                        int w = w();
                        if (w != 0) {
                            return w;
                        }
                        if (a(this.c[this.d])) {
                            c();
                            this.h = 10;
                            return 10;
                        }
                        throw b("Expected value");
                    }
                    this.h = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.h = 4;
                    return 4;
                }
            }
            if (i2 != 1 && i2 != 2) {
                throw b("Unexpected value");
            }
            c();
            this.d--;
            this.h = 7;
            return 7;
        }
    }

    public void f() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 4) {
            int i2 = this.m - 1;
            this.m = i2;
            int[] iArr = this.o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + u() + " at line " + i() + " column " + h() + " path " + j());
    }

    public void g() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 2) {
            int i2 = this.m - 1;
            this.m = i2;
            this.n[i2] = null;
            int[] iArr = this.o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + u() + " at line " + i() + " column " + h() + " path " + j());
    }

    int h() {
        return (this.d - this.g) + 1;
    }

    int i() {
        return this.f + 1;
    }

    public String j() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.o[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.n[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean k() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public final boolean l() {
        return this.b;
    }

    public boolean m() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.h = 0;
            int[] iArr2 = this.o;
            int i3 = this.m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + u() + " at line " + i() + " column " + h() + " path " + j());
        }
    }

    public double n() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else if (i == 8 || i == 9) {
            this.k = b(i == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : '\"');
        } else if (i == 10) {
            this.k = t();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + u() + " at line " + i() + " column " + h() + " path " + j());
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        if (!this.b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new z0("JSON forbids NaN and infinities: " + parseDouble + " at line " + i() + " column " + h() + " path " + j());
        }
        this.k = null;
        this.h = 0;
        int[] iArr2 = this.o;
        int i3 = this.m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int o() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            long j = this.i;
            int i2 = (int) j;
            if (j == i2) {
                this.h = 0;
                int[] iArr = this.o;
                int i3 = this.m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.i + " at line " + i() + " column " + h() + " path " + j());
        }
        if (i == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else if (i != 8 && i != 9) {
            throw new IllegalStateException("Expected an int but was " + u() + " at line " + i() + " column " + h() + " path " + j());
        } else {
            String b = b(i == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : '\"');
            this.k = b;
            try {
                int parseInt = Integer.parseInt(b);
                this.h = 0;
                int[] iArr2 = this.o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.o;
            int i6 = this.m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.k + " at line " + i() + " column " + h() + " path " + j());
    }

    public long p() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            this.k = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else if (i != 8 && i != 9) {
            throw new IllegalStateException("Expected a long but was " + u() + " at line " + i() + " column " + h() + " path " + j());
        } else {
            String b = b(i == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : '\"');
            this.k = b;
            try {
                long parseLong = Long.parseLong(b);
                this.h = 0;
                int[] iArr2 = this.o;
                int i3 = this.m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.o;
            int i4 = this.m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.k + " at line " + i() + " column " + h() + " path " + j());
    }

    public String q() throws IOException {
        String b;
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 14) {
            b = t();
        } else if (i == 12) {
            b = b(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i == 13) {
            b = b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + u() + " at line " + i() + " column " + h() + " path " + j());
        }
        this.h = 0;
        this.n[this.m - 1] = b;
        return b;
    }

    public void r() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 7) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + u() + " at line " + i() + " column " + h() + " path " + j());
    }

    public String s() throws IOException {
        String str;
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 10) {
            str = t();
        } else if (i == 8) {
            str = b(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i == 9) {
            str = b('\"');
        } else if (i == 11) {
            str = this.k;
            this.k = null;
        } else if (i == 15) {
            str = Long.toString(this.i);
        } else if (i == 16) {
            str = new String(this.c, this.d, this.j);
            this.d += this.j;
        } else {
            throw new IllegalStateException("Expected a string but was " + u() + " at line " + i() + " column " + h() + " path " + j());
        }
        this.h = 0;
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public String toString() {
        return getClass().getSimpleName() + " at line " + i() + " column " + h();
    }

    public p0 u() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        switch (i) {
            case 1:
                return p0.BEGIN_OBJECT;
            case 2:
                return p0.END_OBJECT;
            case 3:
                return p0.BEGIN_ARRAY;
            case 4:
                return p0.END_ARRAY;
            case 5:
            case 6:
                return p0.BOOLEAN;
            case 7:
                return p0.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return p0.STRING;
            case 12:
            case 13:
            case 14:
                return p0.NAME;
            case 15:
            case 16:
                return p0.NUMBER;
            case 17:
                return p0.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void b() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = e();
        }
        if (i == 1) {
            b(3);
            this.h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + u() + " at line " + i() + " column " + h() + " path " + j());
    }

    private boolean a(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        c();
        return false;
    }

    private String b(char c) throws IOException {
        char[] cArr = this.c;
        StringBuilder sb = new StringBuilder();
        do {
            int i = this.d;
            int i2 = this.e;
            int i3 = i;
            while (i < i2) {
                int i4 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.d = i4;
                    sb.append(cArr, i3, (i4 - i3) - 1);
                    return sb.toString();
                } else if (c2 == '\\') {
                    this.d = i4;
                    sb.append(cArr, i3, (i4 - i3) - 1);
                    sb.append(x());
                    i3 = this.d;
                    i2 = this.e;
                    i = i3;
                } else {
                    if (c2 == '\n') {
                        this.f++;
                        this.g = i4;
                    }
                    i = i4;
                }
            }
            sb.append(cArr, i3, i - i3);
            this.d = i;
        } while (a(1));
        throw b("Unterminated string");
    }

    private boolean a(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.c;
        int i4 = this.g;
        int i5 = this.d;
        this.g = i4 - i5;
        int i6 = this.e;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.e = 0;
        }
        this.d = 0;
        do {
            Reader reader = this.f12079a;
            int i8 = this.e;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.e + read;
            this.e = i2;
            if (this.f == 0 && (i3 = this.g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d++;
                this.g = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private void c() throws IOException {
        if (!this.b) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int a(boolean z) throws IOException {
        char[] cArr = this.c;
        int i = this.d;
        int i2 = this.e;
        while (true) {
            if (i == i2) {
                this.d = i;
                if (!a(1)) {
                    if (z) {
                        throw new EOFException("End of input at line " + i() + " column " + h());
                    }
                    return -1;
                }
                i = this.d;
                i2 = this.e;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f++;
                this.g = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.d = i3;
                    if (i3 == i2) {
                        this.d = i3 - 1;
                        boolean a2 = a(2);
                        this.d++;
                        if (!a2) {
                            return c;
                        }
                    }
                    c();
                    int i4 = this.d;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.d = i4 + 1;
                        if (a("*/")) {
                            i = this.d + 2;
                            i2 = this.e;
                        } else {
                            throw b("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.d = i4 + 1;
                        y();
                        i = this.d;
                        i2 = this.e;
                    }
                } else if (c == '#') {
                    this.d = i3;
                    c();
                    y();
                    i = this.d;
                    i2 = this.e;
                } else {
                    this.d = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private void b(int i) {
        int i2 = this.m;
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            String[] strArr = new String[i3];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.o, 0, iArr3, 0, this.m);
            System.arraycopy(this.n, 0, strArr, 0, this.m);
            this.l = iArr2;
            this.o = iArr3;
            this.n = strArr;
        }
        int[] iArr4 = this.l;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr4[i4] = i;
    }

    private IOException b(String str) throws IOException {
        throw new z0(str + " at line " + i() + " column " + h() + " path " + j());
    }

    private boolean a(String str) throws IOException {
        while (true) {
            if (this.d + str.length() > this.e && !a(str.length())) {
                return false;
            }
            char[] cArr = this.c;
            int i = this.d;
            if (cArr[i] == '\n') {
                this.f++;
                this.g = i + 1;
            } else {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (this.c[this.d + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.d++;
        }
    }
}
