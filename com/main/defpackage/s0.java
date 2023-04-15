package defpackage;

import com.inmarket.m2m.data.Constants_BuildGenerated;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import org.apache.commons.math3.geometry.VectorFormat;
/* renamed from: s0  reason: default package */
/* loaded from: classes8.dex */
public class s0 implements Closeable, Flushable {
    private static final String[] j = new String[128];
    private static final String[] k;

    /* renamed from: a  reason: collision with root package name */
    private final Writer f12138a;
    private int[] b = new int[32];
    private int c = 0;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private String h;
    private boolean i;

    static {
        for (int i = 0; i <= 31; i++) {
            j[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public s0(Writer writer) {
        a(6);
        this.e = ":";
        this.i = true;
        if (writer != null) {
            this.f12138a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void j() throws IOException {
        if (this.d == null) {
            return;
        }
        this.f12138a.write("\n");
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            this.f12138a.write(this.d);
        }
    }

    private int l() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void m() throws IOException {
        if (this.h != null) {
            a();
            c(this.h);
            this.h = null;
        }
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final void b(String str) {
        if (str.length() == 0) {
            this.d = null;
            this.e = ":";
            return;
        }
        this.d = str;
        this.e = ": ";
    }

    public final void c(boolean z) {
        this.i = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12138a.close();
        int i = this.c;
        if (i <= 1 && (i != 1 || this.b[i - 1] == 7)) {
            this.c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public s0 d() throws IOException {
        m();
        return a(3, VectorFormat.DEFAULT_PREFIX);
    }

    public s0 e() throws IOException {
        return a(1, 2, "]");
    }

    public s0 f() throws IOException {
        return a(3, 5, VectorFormat.DEFAULT_SUFFIX);
    }

    public void flush() throws IOException {
        if (this.c != 0) {
            this.f12138a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final boolean g() {
        return this.i;
    }

    public final boolean h() {
        return this.g;
    }

    public boolean i() {
        return this.f;
    }

    public s0 k() throws IOException {
        if (this.h != null) {
            if (this.i) {
                m();
            } else {
                this.h = null;
                return this;
            }
        }
        b();
        this.f12138a.write(Constants_BuildGenerated.SS_API_HOST);
        return this;
    }

    private s0 a(int i, String str) throws IOException {
        b();
        a(i);
        this.f12138a.write(str);
        return this;
    }

    public s0 c() throws IOException {
        m();
        return a(1, "[");
    }

    public s0 d(String str) throws IOException {
        if (str == null) {
            return k();
        }
        m();
        b();
        c(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.s0.k
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.s0.j
        L9:
            java.io.Writer r1 = r8.f12138a
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f12138a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f12138a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f12138a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f12138a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s0.c(java.lang.String):void");
    }

    private s0 a(int i, int i2, String str) throws IOException {
        int l = l();
        if (l != i2 && l != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.h == null) {
            this.c--;
            if (l == i2) {
                j();
            }
            this.f12138a.write(str);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.h);
    }

    public final void b(boolean z) {
        this.f = z;
    }

    private void b(int i) {
        this.b[this.c - 1] = i;
    }

    public s0 d(boolean z) throws IOException {
        m();
        b();
        this.f12138a.write(z ? "true" : "false");
        return this;
    }

    private void b() throws IOException {
        int l = l();
        if (l == 1) {
            b(2);
            j();
        } else if (l == 2) {
            this.f12138a.append(',');
            j();
        } else if (l != 4) {
            if (l != 6) {
                if (l != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            b(7);
        } else {
            this.f12138a.append((CharSequence) this.e);
            b(5);
        }
    }

    private void a(int i) {
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr3[i3] = i;
    }

    public s0 a(String str) throws IOException {
        if (str != null) {
            if (this.h == null) {
                if (this.c != 0) {
                    this.h = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public s0 a(long j2) throws IOException {
        m();
        b();
        this.f12138a.write(Long.toString(j2));
        return this;
    }

    public s0 a(Number number) throws IOException {
        if (number == null) {
            return k();
        }
        m();
        String obj = number.toString();
        if (!this.f && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        b();
        this.f12138a.append((CharSequence) obj);
        return this;
    }

    private void a() throws IOException {
        int l = l();
        if (l == 5) {
            this.f12138a.write(44);
        } else if (l != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        j();
        b(4);
    }
}
