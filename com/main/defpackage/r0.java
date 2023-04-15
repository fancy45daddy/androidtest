package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
/* renamed from: r0  reason: default package */
/* loaded from: classes8.dex */
public final class r0 extends s0 {
    private static final Writer o = new a();
    private static final l0 p = new l0("closed");
    private final List<g0> l;
    private String m;
    private g0 n;

    /* renamed from: r0$a */
    /* loaded from: classes8.dex */
    static class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public r0() {
        super(o);
        this.l = new ArrayList();
        this.n = i0.f11854a;
    }

    private void a(g0 g0Var) {
        if (this.m != null) {
            if (!g0Var.e() || g()) {
                ((j0) o()).a(this.m, g0Var);
            }
            this.m = null;
        } else if (this.l.isEmpty()) {
            this.n = g0Var;
        } else {
            g0 o2 = o();
            if (o2 instanceof f0) {
                ((f0) o2).a(g0Var);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private g0 o() {
        List<g0> list = this.l;
        return list.get(list.size() - 1);
    }

    @Override // defpackage.s0
    public s0 c() throws IOException {
        f0 f0Var = new f0();
        a(f0Var);
        this.l.add(f0Var);
        return this;
    }

    @Override // defpackage.s0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.l.isEmpty()) {
            this.l.add(p);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // defpackage.s0
    public s0 d() throws IOException {
        j0 j0Var = new j0();
        a(j0Var);
        this.l.add(j0Var);
        return this;
    }

    @Override // defpackage.s0
    public s0 e() throws IOException {
        if (!this.l.isEmpty() && this.m == null) {
            if (o() instanceof f0) {
                List<g0> list = this.l;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.s0
    public s0 f() throws IOException {
        if (!this.l.isEmpty() && this.m == null) {
            if (o() instanceof j0) {
                List<g0> list = this.l;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.s0, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // defpackage.s0
    public s0 k() throws IOException {
        a(i0.f11854a);
        return this;
    }

    public g0 n() {
        if (this.l.isEmpty()) {
            return this.n;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.l);
    }

    @Override // defpackage.s0
    public s0 d(String str) throws IOException {
        if (str == null) {
            return k();
        }
        a(new l0(str));
        return this;
    }

    @Override // defpackage.s0
    public s0 d(boolean z) throws IOException {
        a(new l0(Boolean.valueOf(z)));
        return this;
    }

    @Override // defpackage.s0
    public s0 a(String str) throws IOException {
        if (!this.l.isEmpty() && this.m == null) {
            if (o() instanceof j0) {
                this.m = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.s0
    public s0 a(long j) throws IOException {
        a(new l0(Long.valueOf(j)));
        return this;
    }

    @Override // defpackage.s0
    public s0 a(Number number) throws IOException {
        if (number == null) {
            return k();
        }
        if (!i()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a(new l0(number));
        return this;
    }
}
