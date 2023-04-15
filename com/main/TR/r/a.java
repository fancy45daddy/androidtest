package TR.r;

import ch.qos.logback.core.CoreConstants;
import com.facebook.stetho.dumpapp.Framer;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import kotlin.text.Typography;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public class a {
    public static final String A = "Date";
    public static final String B = "ETag";
    public static final String C = "Expires";
    public static final String D = "If-None-Match";
    public static final String E = "Last-Modified";
    public static final String F = "Location";
    public static final String G = "Proxy-Authorization";
    public static final String H = "Referer";
    public static final String I = "Server";
    public static final String J = "User-Agent";
    public static final String K = "DELETE";
    public static final String L = "GET";
    public static final String M = "HEAD";
    public static final String N = "OPTIONS";
    public static final String O = "POST";
    public static final String P = "PUT";
    public static final String Q = "TRACE";
    public static final String R = "charset";
    private static final String S = "00content0boundary00";
    private static final String T = "multipart/form-data; boundary=00content0boundary00";
    private static final String U = "\r\n";
    private static SSLSocketFactory W = null;
    private static HostnameVerifier X = null;
    public static final String o = "UTF-8";
    public static final String p = "application/x-www-form-urlencoded";
    public static final String q = "application/json";
    public static final String r = "gzip";
    public static final String s = "Accept";
    public static final String t = "Accept-Charset";
    public static final String u = "Accept-Encoding";
    public static final String v = "Authorization";
    public static final String w = "Cache-Control";
    public static final String x = "Content-Encoding";
    public static final String y = "Content-Length";
    public static final String z = "Content-Type";
    private final URL b;
    private final String c;
    private o d;
    private boolean e;
    private boolean f;
    private String l;
    private int m;
    private static final String[] V = new String[0];
    private static k Y = k.f620a;

    /* renamed from: a  reason: collision with root package name */
    private HttpURLConnection f615a = null;
    private boolean g = true;
    private boolean h = false;
    private int i = 8192;
    private long j = -1;
    private long k = 0;
    private p n = p.f624a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: TR.r.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0008a implements PrivilegedAction<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f616a;
        final /* synthetic */ String b;

        C0008a(String str, String str2) {
            this.f616a = str;
            this.b = str2;
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public String run() {
            return System.setProperty(this.f616a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements PrivilegedAction<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f617a;

        b(String str) {
            this.f617a = str;
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public String run() {
            return System.clearProperty(this.f617a);
        }
    }

    /* loaded from: classes.dex */
    class c extends j<a> {
        final /* synthetic */ OutputStream c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Closeable closeable, boolean z, OutputStream outputStream) {
            super(closeable, z);
            this.c = outputStream;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // TR.r.a.n
        /* renamed from: c */
        public a b() throws m, IOException {
            return a.this.a(this.c);
        }
    }

    /* loaded from: classes.dex */
    class d extends j<a> {
        final /* synthetic */ BufferedReader c;
        final /* synthetic */ Appendable d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Closeable closeable, boolean z, BufferedReader bufferedReader, Appendable appendable) {
            super(closeable, z);
            this.c = bufferedReader;
            this.d = appendable;
        }

        @Override // TR.r.a.n
        /* renamed from: c */
        public a b() throws IOException {
            CharBuffer allocate = CharBuffer.allocate(a.this.i);
            while (true) {
                int read = this.c.read(allocate);
                if (read == -1) {
                    return a.this;
                }
                allocate.rewind();
                this.d.append(allocate, 0, read);
                allocate.rewind();
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends j<a> {
        final /* synthetic */ BufferedReader c;
        final /* synthetic */ Writer d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Closeable closeable, boolean z, BufferedReader bufferedReader, Writer writer) {
            super(closeable, z);
            this.c = bufferedReader;
            this.d = writer;
        }

        @Override // TR.r.a.n
        /* renamed from: c */
        public a b() throws IOException {
            return a.this.a((Reader) this.c, this.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends j<a> {
        final /* synthetic */ InputStream c;
        final /* synthetic */ OutputStream d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Closeable closeable, boolean z, InputStream inputStream, OutputStream outputStream) {
            super(closeable, z);
            this.c = inputStream;
            this.d = outputStream;
        }

        @Override // TR.r.a.n
        /* renamed from: c */
        public a b() throws IOException {
            byte[] bArr = new byte[a.this.i];
            while (true) {
                int read = this.c.read(bArr);
                if (read == -1) {
                    return a.this;
                }
                this.d.write(bArr, 0, read);
                a.a(a.this, read);
                a.this.n.a(a.this.k, a.this.j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends j<a> {
        final /* synthetic */ Reader c;
        final /* synthetic */ Writer d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Closeable closeable, boolean z, Reader reader, Writer writer) {
            super(closeable, z);
            this.c = reader;
            this.d = writer;
        }

        @Override // TR.r.a.n
        /* renamed from: c */
        public a b() throws IOException {
            char[] cArr = new char[a.this.i];
            while (true) {
                int read = this.c.read(cArr);
                if (read == -1) {
                    return a.this;
                }
                this.d.write(cArr, 0, read);
                a.a(a.this, read);
                a.this.n.a(a.this.k, -1L);
            }
        }
    }

    /* loaded from: classes.dex */
    class h extends l<a> {
        final /* synthetic */ Reader b;
        final /* synthetic */ Writer c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Flushable flushable, Reader reader, Writer writer) {
            super(flushable);
            this.b = reader;
            this.c = writer;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // TR.r.a.n
        /* renamed from: c */
        public a b() throws IOException {
            return a.this.a(this.b, this.c);
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        private static final byte f618a = 61;
        private static final String b = "US-ASCII";
        private static final byte[] c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        private i() {
        }

        public static String a(String str) {
            byte[] bytes;
            try {
                bytes = str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            return a(bytes);
        }

        public static String a(byte[] bArr) {
            return a(bArr, 0, bArr.length);
        }

        public static String a(byte[] bArr, int i, int i2) {
            byte[] b2 = b(bArr, i, i2);
            try {
                return new String(b2, "US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                return new String(b2);
            }
        }

        private static byte[] a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            byte[] bArr3 = c;
            int i4 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
            if (i2 == 1) {
                bArr2[i3] = bArr3[i4 >>> 18];
                bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
                bArr2[i3 + 2] = f618a;
                bArr2[i3 + 3] = f618a;
                return bArr2;
            } else if (i2 == 2) {
                bArr2[i3] = bArr3[i4 >>> 18];
                bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
                bArr2[i3 + 3] = f618a;
                return bArr2;
            } else if (i2 != 3) {
                return bArr2;
            } else {
                bArr2[i3] = bArr3[i4 >>> 18];
                bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
                bArr2[i3 + 3] = bArr3[i4 & 63];
                return bArr2;
            }
        }

        public static byte[] b(byte[] bArr, int i, int i2) {
            if (bArr != null) {
                if (i < 0) {
                    throw new IllegalArgumentException("Cannot have negative offset: " + i);
                } else if (i2 < 0) {
                    throw new IllegalArgumentException("Cannot have length offset: " + i2);
                } else if (i + i2 <= bArr.length) {
                    int i3 = ((i2 / 3) * 4) + (i2 % 3 <= 0 ? 0 : 4);
                    byte[] bArr2 = new byte[i3];
                    int i4 = i2 - 2;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < i4) {
                        a(bArr, i5 + i, 3, bArr2, i6);
                        i5 += 3;
                        i6 += 4;
                    }
                    if (i5 < i2) {
                        a(bArr, i + i5, i2 - i5, bArr2, i6);
                        i6 += 4;
                    }
                    if (i6 <= i3 - 1) {
                        byte[] bArr3 = new byte[i6];
                        System.arraycopy(bArr2, 0, bArr3, 0, i6);
                        return bArr3;
                    }
                    return bArr2;
                } else {
                    throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
                }
            }
            throw new NullPointerException("Cannot serialize a null array.");
        }
    }

    /* loaded from: classes.dex */
    protected static abstract class j<V> extends n<V> {

        /* renamed from: a  reason: collision with root package name */
        private final Closeable f619a;
        private final boolean b;

        protected j(Closeable closeable, boolean z) {
            this.f619a = closeable;
            this.b = z;
        }

        @Override // TR.r.a.n
        protected void a() throws IOException {
            Closeable closeable = this.f619a;
            if (closeable instanceof Flushable) {
                ((Flushable) closeable).flush();
            }
            if (!this.b) {
                this.f619a.close();
                return;
            }
            try {
                this.f619a.close();
            } catch (IOException unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface k {

        /* renamed from: a  reason: collision with root package name */
        public static final k f620a = new C0009a();

        /* renamed from: TR.r.a$k$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0009a implements k {
            C0009a() {
            }

            @Override // TR.r.a.k
            public HttpURLConnection a(URL url) throws IOException {
                return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            }

            @Override // TR.r.a.k
            public HttpURLConnection a(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy)));
            }
        }

        HttpURLConnection a(URL url) throws IOException;

        HttpURLConnection a(URL url, Proxy proxy) throws IOException;
    }

    /* loaded from: classes.dex */
    protected static abstract class l<V> extends n<V> {

        /* renamed from: a  reason: collision with root package name */
        private final Flushable f621a;

        protected l(Flushable flushable) {
            this.f621a = flushable;
        }

        @Override // TR.r.a.n
        protected void a() throws IOException {
            this.f621a.flush();
        }
    }

    /* loaded from: classes.dex */
    public static class m extends RuntimeException {

        /* renamed from: a  reason: collision with root package name */
        private static final long f622a = -1170466989781746231L;

        public m(IOException iOException) {
            super(iOException);
        }

        @Override // java.lang.Throwable
        /* renamed from: c */
        public IOException getCause() {
            return (IOException) super.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static abstract class n<V> implements Callable<V> {
        protected n() {
        }

        protected abstract void a() throws IOException;

        protected abstract V b() throws m, IOException;

        @Override // java.util.concurrent.Callable
        public V call() throws m {
            boolean z;
            boolean z2 = true;
            try {
                V b = b();
                try {
                    a();
                    return b;
                } catch (IOException e) {
                    throw new m(e);
                }
            } catch (m e2) {
                try {
                    throw e2;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    boolean z3 = z;
                    th = th;
                    z2 = z3;
                    try {
                        a();
                    } catch (IOException e3) {
                        if (!z2) {
                            throw new m(e3);
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                try {
                    throw new m(e4);
                } catch (Throwable th2) {
                    th = th2;
                    a();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
                boolean z32 = z;
                th = th;
                z2 = z32;
                a();
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o extends BufferedOutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final CharsetEncoder f623a;

        public o(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f623a = Charset.forName(a.l(str)).newEncoder();
        }

        public o a(String str) throws IOException {
            ByteBuffer encode = this.f623a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface p {

        /* renamed from: a  reason: collision with root package name */
        public static final p f624a = new C0010a();

        /* renamed from: TR.r.a$p$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0010a implements p {
            C0010a() {
            }

            @Override // TR.r.a.p
            public void a(long j, long j2) {
            }
        }

        void a(long j, long j2);
    }

    public a(CharSequence charSequence, String str) throws m {
        try {
            this.b = new URL(charSequence.toString());
            this.c = str;
        } catch (MalformedURLException e2) {
            throw new m(e2);
        }
    }

    public a(URL url, String str) throws m {
        this.b = url;
        this.c = str;
    }

    static /* synthetic */ long a(a aVar, long j2) {
        long j3 = aVar.k + j2;
        aVar.k = j3;
        return j3;
    }

    public static a a(CharSequence charSequence) throws m {
        return new a(charSequence, "DELETE");
    }

    public static a a(CharSequence charSequence, Map<?, ?> map, boolean z2) {
        String a2 = a(charSequence, map);
        if (z2) {
            a2 = b((CharSequence) a2);
        }
        return a((CharSequence) a2);
    }

    public static a a(CharSequence charSequence, boolean z2, Object... objArr) {
        String a2 = a(charSequence, objArr);
        if (z2) {
            a2 = b((CharSequence) a2);
        }
        return a((CharSequence) a2);
    }

    public static a a(URL url) throws m {
        return new a(url, "DELETE");
    }

    public static String a(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        b(charSequence2, sb);
        a(charSequence2, sb);
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        while (true) {
            Map.Entry<?, ?> next = it.next();
            a(next.getKey().toString(), next.getValue(), sb);
            if (!it.hasNext()) {
                return sb.toString();
            }
            sb.append(Typography.amp);
        }
    }

    public static String a(CharSequence charSequence, Object... objArr) {
        String charSequence2 = charSequence.toString();
        if (objArr == null || objArr.length == 0) {
            return charSequence2;
        }
        if (objArr.length % 2 == 0) {
            StringBuilder sb = new StringBuilder(charSequence2);
            b(charSequence2, sb);
            a(charSequence2, sb);
            a(objArr[0], objArr[1], sb);
            for (int i2 = 2; i2 < objArr.length; i2 += 2) {
                sb.append(Typography.amp);
                a(objArr[i2], objArr[i2 + 1], sb);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Must specify an even number of parameter names/values");
    }

    private static StringBuilder a(Object obj, Object obj2, StringBuilder sb) {
        if (obj2 != null && obj2.getClass().isArray()) {
            obj2 = a(obj2);
        }
        if (obj2 instanceof Iterable) {
            Iterator it = ((Iterable) obj2).iterator();
            while (it.hasNext()) {
                sb.append(obj);
                sb.append("[]=");
                Object next = it.next();
                if (next != null) {
                    sb.append(next);
                }
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        } else {
            sb.append(obj);
            sb.append("=");
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r4 != '&') goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.StringBuilder a(java.lang.String r4, java.lang.StringBuilder r5) {
        /*
            r0 = 63
            int r1 = r4.indexOf(r0)
            int r2 = r5.length()
            int r2 = r2 + (-1)
            r3 = -1
            if (r1 != r3) goto L13
        Lf:
            r5.append(r0)
            goto L1e
        L13:
            if (r1 >= r2) goto L1e
            char r4 = r4.charAt(r2)
            r0 = 38
            if (r4 == r0) goto L1e
            goto Lf
        L1e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: TR.r.a.a(java.lang.String, java.lang.StringBuilder):java.lang.StringBuilder");
    }

    private static List<Object> a(Object obj) {
        if (obj instanceof Object[]) {
            return Arrays.asList((Object[]) obj);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i2 < length) {
                arrayList.add(Integer.valueOf(iArr[i2]));
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length2 = zArr.length;
            while (i2 < length2) {
                arrayList.add(Boolean.valueOf(zArr[i2]));
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            while (i2 < length3) {
                arrayList.add(Long.valueOf(jArr[i2]));
                i2++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length4 = fArr.length;
            while (i2 < length4) {
                arrayList.add(Float.valueOf(fArr[i2]));
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length5 = dArr.length;
            while (i2 < length5) {
                arrayList.add(Double.valueOf(dArr[i2]));
                i2++;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length6 = sArr.length;
            while (i2 < length6) {
                arrayList.add(Short.valueOf(sArr[i2]));
                i2++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length7 = bArr.length;
            while (i2 < length7) {
                arrayList.add(Byte.valueOf(bArr[i2]));
                i2++;
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length8 = cArr.length;
            while (i2 < length8) {
                arrayList.add(Character.valueOf(cArr[i2]));
                i2++;
            }
        }
        return arrayList;
    }

    public static void a(k kVar) {
        if (kVar == null) {
            kVar = k.f620a;
        }
        Y = kVar;
    }

    public static void a(String... strArr) {
        String str;
        if (strArr == null || strArr.length <= 0) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            int length = strArr.length - 1;
            for (int i2 = 0; i2 < length; i2++) {
                sb.append(strArr[i2]);
                sb.append('|');
            }
            sb.append(strArr[length]);
            str = sb.toString();
        }
        i("http.nonProxyHosts", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, SSLSession sSLSession) {
        return str.equals(sSLSession.getPeerHost());
    }

    private a b(long j2) {
        if (this.j == -1) {
            this.j = 0L;
        }
        this.j += j2;
        return this;
    }

    public static a b(CharSequence charSequence, Map<?, ?> map, boolean z2) {
        String a2 = a(charSequence, map);
        if (z2) {
            a2 = b((CharSequence) a2);
        }
        return c((CharSequence) a2);
    }

    public static a b(CharSequence charSequence, boolean z2, Object... objArr) {
        String a2 = a(charSequence, objArr);
        if (z2) {
            a2 = b((CharSequence) a2);
        }
        return c((CharSequence) a2);
    }

    public static a b(URL url) throws m {
        return new a(url, "GET");
    }

    public static String b(CharSequence charSequence) throws m {
        int port;
        int i2;
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            if (url.getPort() != -1) {
                host = host + CoreConstants.COLON_CHAR + Integer.toString(port);
            }
            try {
                String aSCIIString = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), null).toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0 || (i2 = indexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, i2) + aSCIIString.substring(i2).replace(Marker.ANY_NON_NULL_MARKER, "%2B");
            } catch (URISyntaxException e2) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e2);
                throw new m(iOException);
            }
        } catch (IOException e3) {
            throw new m(e3);
        }
    }

    private static StringBuilder b(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append(JsonPointer.SEPARATOR);
        }
        return sb;
    }

    public static a c(CharSequence charSequence) throws m {
        return new a(charSequence, "GET");
    }

    public static a c(CharSequence charSequence, Map<?, ?> map, boolean z2) {
        String a2 = a(charSequence, map);
        if (z2) {
            a2 = b((CharSequence) a2);
        }
        return d((CharSequence) a2);
    }

    public static a c(CharSequence charSequence, boolean z2, Object... objArr) {
        String a2 = a(charSequence, objArr);
        if (z2) {
            a2 = b((CharSequence) a2);
        }
        return d((CharSequence) a2);
    }

    public static a c(URL url) throws m {
        return new a(url, "HEAD");
    }

    public static void c(boolean z2) {
        i("http.keepAlive", Boolean.toString(z2));
    }

    public static a d(CharSequence charSequence) throws m {
        return new a(charSequence, "HEAD");
    }

    public static a d(CharSequence charSequence, Map<?, ?> map, boolean z2) {
        String a2 = a(charSequence, map);
        if (z2) {
            a2 = b((CharSequence) a2);
        }
        return f((CharSequence) a2);
    }

    public static a d(CharSequence charSequence, boolean z2, Object... objArr) {
        String a2 = a(charSequence, objArr);
        if (z2) {
            a2 = b((CharSequence) a2);
        }
        return f((CharSequence) a2);
    }

    public static a d(URL url) throws m {
        return new a(url, "OPTIONS");
    }

    public static a e(CharSequence charSequence) throws m {
        return new a(charSequence, "OPTIONS");
    }

    public static a e(CharSequence charSequence, Map<?, ?> map, boolean z2) {
        String a2 = a(charSequence, map);
        if (z2) {
            a2 = b((CharSequence) a2);
        }
        return g((CharSequence) a2);
    }

    public static a e(CharSequence charSequence, boolean z2, Object... objArr) {
        String a2 = a(charSequence, objArr);
        if (z2) {
            a2 = b((CharSequence) a2);
        }
        return g((CharSequence) a2);
    }

    public static a e(URL url) throws m {
        return new a(url, "POST");
    }

    public static void e(int i2) {
        i("http.maxConnections", Integer.toString(i2));
    }

    public static a f(CharSequence charSequence) throws m {
        return new a(charSequence, "POST");
    }

    public static a f(URL url) throws m {
        return new a(url, "PUT");
    }

    public static void f(int i2) {
        String num = Integer.toString(i2);
        i("http.proxyPort", num);
        i("https.proxyPort", num);
    }

    public static a g(CharSequence charSequence) throws m {
        return new a(charSequence, "PUT");
    }

    public static a g(URL url) throws m {
        return new a(url, "TRACE");
    }

    public static a i(CharSequence charSequence) throws m {
        return new a(charSequence, "TRACE");
    }

    private static String i(String str, String str2) {
        return (String) AccessController.doPrivileged(str2 != null ? new C0008a(str, str2) : new b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String l(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    private HttpURLConnection r() {
        try {
            HttpURLConnection a2 = this.l != null ? Y.a(this.b, s()) : Y.a(this.b);
            a2.setRequestMethod(this.c);
            return a2;
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    private Proxy s() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.l, this.m));
    }

    public static void s(String str) {
        i("http.proxyHost", str);
        i("https.proxyHost", str);
    }

    private static HostnameVerifier z() {
        HostnameVerifier hostnameVerifier = new HostnameVerifier() { // from class: TR.r.a$$ExternalSyntheticLambda0
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                boolean a2;
                a2 = a.a(str, sSLSession);
                return a2;
            }
        };
        X = hostnameVerifier;
        return hostnameVerifier;
    }

    public Map<String, List<String>> A() throws m {
        m();
        return y().getHeaderFields();
    }

    public boolean B() {
        return this.g;
    }

    public boolean C() throws m {
        return p() == 0;
    }

    public long D() {
        return j("Last-Modified");
    }

    public String E() {
        return m("Location");
    }

    public String F() throws m {
        try {
            l();
            return y().getResponseMessage();
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public String G() {
        return y().getRequestMethod();
    }

    public boolean H() throws m {
        return 204 == n();
    }

    public boolean I() throws m {
        return 404 == n();
    }

    public boolean J() throws m {
        return 304 == n();
    }

    public boolean K() throws m {
        return 200 == n();
    }

    protected a L() throws IOException {
        if (this.d != null) {
            return this;
        }
        y().setDoOutput(true);
        this.d = new o(y().getOutputStream(), c(y().getRequestProperty("Content-Type"), R), this.i);
        return this;
    }

    public InputStreamReader M() throws m {
        return t(k());
    }

    public String N() {
        return m("Server");
    }

    public boolean O() throws m {
        return 500 == n();
    }

    protected a P() throws IOException {
        o oVar;
        String str;
        if (this.e) {
            oVar = this.d;
            str = "\r\n--00content0boundary00\r\n";
        } else {
            this.e = true;
            i(T).L();
            oVar = this.d;
            str = "--00content0boundary00\r\n";
        }
        oVar.a(str);
        return this;
    }

    public InputStream Q() throws m {
        InputStream inputStream;
        if (n() < 400) {
            try {
                inputStream = y().getInputStream();
            } catch (IOException e2) {
                throw new m(e2);
            }
        } else {
            inputStream = y().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = y().getInputStream();
                } catch (IOException e3) {
                    if (p() > 0) {
                        throw new m(e3);
                    }
                    inputStream = new ByteArrayInputStream(new byte[0]);
                }
            }
        }
        if (this.h && "gzip".equals(o())) {
            try {
                return new GZIPInputStream(inputStream);
            } catch (IOException e4) {
                throw new m(e4);
            }
        }
        return inputStream;
    }

    public void R() {
        HttpURLConnection y2 = y();
        if (y2 instanceof HttpsURLConnection) {
            ((HttpsURLConnection) y2).setHostnameVerifier(z());
        }
    }

    public URL S() {
        return y().getURL();
    }

    public OutputStreamWriter T() throws m {
        try {
            L();
            o oVar = this.d;
            return new OutputStreamWriter(oVar, oVar.f623a.charset());
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public int a(String str, int i2) throws m {
        m();
        return y().getHeaderFieldInt(str, i2);
    }

    public long a(String str, long j2) throws m {
        m();
        return y().getHeaderFieldDate(str, j2);
    }

    public a a() {
        return c("gzip");
    }

    public a a(int i2) {
        if (i2 >= 1) {
            this.i = i2;
            return this;
        }
        throw new IllegalArgumentException("Size must be greater than zero");
    }

    public a a(long j2) {
        y().setIfModifiedSince(j2);
        return this;
    }

    public a a(p pVar) {
        if (pVar == null) {
            pVar = p.f624a;
        }
        this.n = pVar;
        return this;
    }

    public a a(File file) throws m {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.i);
            return new c(bufferedOutputStream, this.g, bufferedOutputStream).call();
        } catch (FileNotFoundException e2) {
            throw new m(e2);
        }
    }

    public a a(InputStream inputStream) throws m {
        try {
            L();
            a(inputStream, (OutputStream) this.d);
            return this;
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    protected a a(InputStream inputStream, OutputStream outputStream) throws IOException {
        return new f(inputStream, this.g, inputStream, outputStream).call();
    }

    public a a(OutputStream outputStream) throws m {
        try {
            return a((InputStream) e(), outputStream);
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public a a(PrintStream printStream) throws m {
        return a((OutputStream) printStream);
    }

    public a a(Reader reader) throws m {
        try {
            L();
            o oVar = this.d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(oVar, oVar.f623a.charset());
            return new h(outputStreamWriter, reader, outputStreamWriter).call();
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    protected a a(Reader reader, Writer writer) throws IOException {
        return new g(reader, this.g, reader, writer).call();
    }

    public a a(Writer writer) throws m {
        BufferedReader g2 = g();
        return new e(g2, this.g, g2, writer).call();
    }

    public a a(Appendable appendable) throws m {
        BufferedReader g2 = g();
        return new d(g2, this.g, g2, appendable).call();
    }

    public a a(Object obj, Object obj2) throws m {
        return a(obj, obj2, "UTF-8");
    }

    public a a(Object obj, Object obj2, String str) throws m {
        boolean z2 = !this.f;
        if (z2) {
            b("application/x-www-form-urlencoded", str);
            this.f = true;
        }
        String l2 = l(str);
        try {
            L();
            if (!z2) {
                this.d.write(38);
            }
            this.d.a(URLEncoder.encode(obj.toString(), l2));
            this.d.write(61);
            if (obj2 != null) {
                this.d.a(URLEncoder.encode(obj2.toString(), l2));
            }
            return this;
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public a a(String str) {
        return d("Accept", str);
    }

    public a a(String str, File file) throws m {
        return a(str, (String) null, file);
    }

    public a a(String str, InputStream inputStream) throws m {
        return a(str, (String) null, (String) null, inputStream);
    }

    public a a(String str, Number number) {
        return d(str, number != null ? number.toString() : null);
    }

    public a a(String str, String str2) {
        return e("Basic " + i.a(str + CoreConstants.COLON_CHAR + str2));
    }

    public a a(String str, String str2, File file) throws m {
        return a(str, str2, (String) null, file);
    }

    public a a(String str, String str2, Number number) throws m {
        return a(str, str2, number != null ? number.toString() : null);
    }

    public a a(String str, String str2, String str3) throws m {
        return a(str, str2, (String) null, str3);
    }

    public a a(String str, String str2, String str3, File file) throws m {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            b(file.length());
            return a(str, str2, str3, bufferedInputStream);
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public a a(String str, String str2, String str3, InputStream inputStream) throws m {
        try {
            P();
            b(str, str2, str3);
            a(inputStream, (OutputStream) this.d);
            return this;
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public a a(String str, String str2, String str3, String str4) throws m {
        try {
            P();
            b(str, str2, str3);
            this.d.a(str4);
            return this;
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public a a(Map.Entry<?, ?> entry) throws m {
        return a(entry, "UTF-8");
    }

    public a a(Map.Entry<?, ?> entry, String str) throws m {
        return a(entry.getKey(), entry.getValue(), str);
    }

    public a a(Map<?, ?> map) throws m {
        return a(map, "UTF-8");
    }

    public a a(Map<?, ?> map, String str) throws m {
        if (!map.isEmpty()) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                a(entry, str);
            }
        }
        return this;
    }

    public a a(AtomicInteger atomicInteger) throws m {
        atomicInteger.set(n());
        return this;
    }

    public a a(AtomicReference<String> atomicReference) throws m {
        atomicReference.set(d());
        return this;
    }

    public a a(AtomicReference<String> atomicReference, String str) throws m {
        atomicReference.set(f(str));
        return this;
    }

    public a a(boolean z2) {
        y().setInstanceFollowRedirects(z2);
        return this;
    }

    public a a(byte[] bArr) throws m {
        if (bArr != null) {
            b(bArr.length);
        }
        return a((InputStream) new ByteArrayInputStream(bArr));
    }

    public a b() {
        return a("application/json");
    }

    public a b(int i2) {
        y().setChunkedStreamingMode(i2);
        return this;
    }

    public a b(File file) throws m {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            b(file.length());
            return a((InputStream) bufferedInputStream);
        } catch (FileNotFoundException e2) {
            throw new m(e2);
        }
    }

    public a b(String str) {
        return d("Accept-Charset", str);
    }

    public a b(String str, int i2) {
        if (this.f615a == null) {
            this.l = str;
            this.m = i2;
            return this;
        }
        throw new IllegalStateException("The connection has already been created. This method must be called before reading or writing to the request.");
    }

    public a b(String str, Number number) throws m {
        return a(str, (String) null, number);
    }

    public a b(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return d("Content-Type", str);
        }
        return d("Content-Type", str + "; charset=" + str2);
    }

    protected a b(String str, String str2, String str3) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; mName=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append('\"');
        g("Content-Disposition", sb.toString());
        if (str3 != null) {
            g("Content-Type", str3);
        }
        return h("\r\n");
    }

    public a b(Map.Entry<String, String> entry) {
        return d(entry.getKey(), entry.getValue());
    }

    public a b(Map<String, String> map) {
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b(entry);
            }
        }
        return this;
    }

    public a b(boolean z2) {
        this.g = z2;
        return this;
    }

    public a c(int i2) {
        y().setConnectTimeout(i2);
        return this;
    }

    public a c(String str) {
        return d("Accept-Encoding", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x006e -> B:13:0x0023). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.String c(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L73
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L73
        Lb:
            int r1 = r9.length()
            r2 = 59
            int r3 = r9.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L73
            if (r3 != r1) goto L1c
            goto L73
        L1c:
            int r5 = r9.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L25
        L23:
            r5 = r1
            goto L71
        L25:
            if (r3 >= r5) goto L73
            r7 = 61
            int r7 = r9.indexOf(r7, r3)
            if (r7 == r6) goto L68
            if (r7 >= r5) goto L68
            java.lang.String r3 = r9.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L68
            int r7 = r7 + 1
            java.lang.String r3 = r9.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L68
            r9 = 2
            if (r7 <= r9) goto L67
            r9 = 0
            char r9 = r3.charAt(r9)
            r10 = 34
            if (r10 != r9) goto L67
            int r7 = r7 - r4
            char r9 = r3.charAt(r7)
            if (r10 != r9) goto L67
            java.lang.String r9 = r3.substring(r4, r7)
            return r9
        L67:
            return r3
        L68:
            int r3 = r5 + 1
            int r5 = r9.indexOf(r2, r3)
            if (r5 != r6) goto L25
            goto L23
        L71:
            r1 = r5
            goto L25
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: TR.r.a.c(java.lang.String, java.lang.String):java.lang.String");
    }

    public boolean c() throws m {
        return 400 == n();
    }

    public a d(int i2) {
        y().setFixedLengthStreamingMode(i2);
        return this;
    }

    public a d(String str, String str2) {
        y().setRequestProperty(str, str2);
        return this;
    }

    public a d(boolean z2) {
        this.h = z2;
        return this;
    }

    public String d() throws m {
        return f(k());
    }

    public a e(String str) {
        return d("Authorization", str);
    }

    public a e(boolean z2) {
        y().setUseCaches(z2);
        return this;
    }

    public BufferedInputStream e() throws m {
        return new BufferedInputStream(Q(), this.i);
    }

    public String e(String str, String str2) {
        return c(m(str), str2);
    }

    public int f() {
        return this.i;
    }

    public a f(String str, String str2) {
        return a(str, (String) null, str2);
    }

    public String f(String str) throws m {
        ByteArrayOutputStream h2 = h();
        try {
            a((InputStream) e(), (OutputStream) h2);
            return h2.toString(l(str));
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public a g(int i2) {
        y().setReadTimeout(i2);
        return this;
    }

    public a g(String str, String str2) throws m {
        return h((CharSequence) str).h(": ").h((CharSequence) str2).h("\r\n");
    }

    public BufferedReader g() throws m {
        return g(k());
    }

    public BufferedReader g(String str) throws m {
        return new BufferedReader(t(str), this.i);
    }

    public a h(CharSequence charSequence) throws m {
        try {
            L();
            this.d.a(charSequence.toString());
            return this;
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public a h(String str) {
        return d(Integer.parseInt(str));
    }

    public a h(String str, String str2) {
        return r("Basic " + i.a(str + CoreConstants.COLON_CHAR + str2));
    }

    protected ByteArrayOutputStream h() {
        int p2 = p();
        return p2 > 0 ? new ByteArrayOutputStream(p2) : new ByteArrayOutputStream();
    }

    public a i(String str) {
        return b(str, (String) null);
    }

    public byte[] i() throws m {
        ByteArrayOutputStream h2 = h();
        try {
            a((InputStream) e(), (OutputStream) h2);
            return h2.toByteArray();
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public long j(String str) throws m {
        return a(str, -1L);
    }

    protected a j(String str, String str2) throws IOException {
        return b(str, str2, (String) null);
    }

    public String j() {
        return m("Cache-Control");
    }

    public String k() {
        return e("Content-Type", R);
    }

    protected Map<String, String> k(String str) {
        String trim;
        int length;
        if (str == null || str.length() == 0) {
            return Collections.emptyMap();
        }
        int length2 = str.length();
        int indexOf = str.indexOf(59) + 1;
        if (indexOf == 0 || indexOf == length2) {
            return Collections.emptyMap();
        }
        int indexOf2 = str.indexOf(59, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = length2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (indexOf < indexOf2) {
            int indexOf3 = str.indexOf(61, indexOf);
            if (indexOf3 != -1 && indexOf3 < indexOf2) {
                String trim2 = str.substring(indexOf, indexOf3).trim();
                if (trim2.length() > 0 && (length = (trim = str.substring(indexOf3 + 1, indexOf2).trim()).length()) != 0) {
                    if (length > 2 && '\"' == trim.charAt(0)) {
                        int i2 = length - 1;
                        if ('\"' == trim.charAt(i2)) {
                            trim = trim.substring(1, i2);
                        }
                    }
                    linkedHashMap.put(trim2, trim);
                }
            }
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(59, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = length2;
            }
        }
        return linkedHashMap;
    }

    protected a l() throws IOException {
        a((p) null);
        o oVar = this.d;
        if (oVar == null) {
            return this;
        }
        if (this.e) {
            oVar.a("\r\n--00content0boundary00--\r\n");
        }
        if (this.g) {
            try {
                this.d.close();
            } catch (IOException unused) {
            }
        } else {
            this.d.close();
        }
        this.d = null;
        return this;
    }

    protected a m() throws m {
        try {
            return l();
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public String m(String str) throws m {
        m();
        return y().getHeaderField(str);
    }

    public int n() throws m {
        try {
            l();
            return y().getResponseCode();
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public String[] n(String str) {
        Map<String, List<String>> A2 = A();
        if (A2 == null || A2.isEmpty()) {
            return V;
        }
        List<String> list = A2.get(str);
        return (list == null || list.isEmpty()) ? V : (String[]) list.toArray(new String[list.size()]);
    }

    public a o(String str) {
        return d("If-None-Match", str);
    }

    public String o() {
        return m("Content-Encoding");
    }

    public int p() {
        return p("Content-Length");
    }

    public int p(String str) throws m {
        return a(str, -1);
    }

    public String q() {
        return m("Content-Type");
    }

    public Map<String, String> q(String str) {
        return k(m(str));
    }

    public a r(String str) {
        return d("Proxy-Authorization", str);
    }

    public InputStreamReader t(String str) throws m {
        try {
            return new InputStreamReader(Q(), l(str));
        } catch (UnsupportedEncodingException e2) {
            throw new m(e2);
        }
    }

    public boolean t() throws m {
        return 201 == n();
    }

    public String toString() {
        return G() + ' ' + S();
    }

    public long u() {
        return j("Date");
    }

    public a u(String str) {
        return d("Referer", str);
    }

    public a v() {
        y().disconnect();
        return this;
    }

    public a v(String str) {
        return d("User-Agent", str);
    }

    public String w() {
        return m("ETag");
    }

    public long x() {
        return j("Expires");
    }

    public HttpURLConnection y() {
        if (this.f615a == null) {
            this.f615a = r();
        }
        return this.f615a;
    }
}
