package defpackage;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: q0  reason: default package */
/* loaded from: classes8.dex */
public final class q0 extends m0 {
    private static final Object r;
    private final List<Object> q;

    /* renamed from: q0$a */
    /* loaded from: classes8.dex */
    static class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new a();
        r = new Object();
    }

    private Object B() {
        List<Object> list = this.q;
        return list.get(list.size() - 1);
    }

    private Object C() {
        List<Object> list = this.q;
        return list.remove(list.size() - 1);
    }

    @Override // defpackage.m0
    public void A() throws IOException {
        if (u() == p0.NAME) {
            q();
        } else {
            C();
        }
    }

    public void D() throws IOException {
        a(p0.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) B()).next();
        this.q.add(entry.getValue());
        this.q.add(new l0((String) entry.getKey()));
    }

    @Override // defpackage.m0
    public void a() throws IOException {
        a(p0.BEGIN_ARRAY);
        this.q.add(((f0) B()).iterator());
    }

    @Override // defpackage.m0
    public void b() throws IOException {
        a(p0.BEGIN_OBJECT);
        this.q.add(((j0) B()).h().iterator());
    }

    @Override // defpackage.m0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.q.clear();
        this.q.add(r);
    }

    @Override // defpackage.m0
    public void f() throws IOException {
        a(p0.END_ARRAY);
        C();
        C();
    }

    @Override // defpackage.m0
    public void g() throws IOException {
        a(p0.END_OBJECT);
        C();
        C();
    }

    @Override // defpackage.m0
    public boolean k() throws IOException {
        p0 u = u();
        return (u == p0.END_OBJECT || u == p0.END_ARRAY) ? false : true;
    }

    @Override // defpackage.m0
    public boolean m() throws IOException {
        a(p0.BOOLEAN);
        return ((l0) C()).h();
    }

    @Override // defpackage.m0
    public double n() throws IOException {
        p0 u = u();
        p0 p0Var = p0.NUMBER;
        if (u != p0Var && u != p0.STRING) {
            throw new IllegalStateException("Expected " + p0Var + " but was " + u);
        }
        double j = ((l0) B()).j();
        if (!l() && (Double.isNaN(j) || Double.isInfinite(j))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + j);
        }
        C();
        return j;
    }

    @Override // defpackage.m0
    public int o() throws IOException {
        p0 u = u();
        p0 p0Var = p0.NUMBER;
        if (u != p0Var && u != p0.STRING) {
            throw new IllegalStateException("Expected " + p0Var + " but was " + u);
        }
        int k = ((l0) B()).k();
        C();
        return k;
    }

    @Override // defpackage.m0
    public long p() throws IOException {
        p0 u = u();
        p0 p0Var = p0.NUMBER;
        if (u != p0Var && u != p0.STRING) {
            throw new IllegalStateException("Expected " + p0Var + " but was " + u);
        }
        long l = ((l0) B()).l();
        C();
        return l;
    }

    @Override // defpackage.m0
    public String q() throws IOException {
        a(p0.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) B()).next();
        this.q.add(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // defpackage.m0
    public void r() throws IOException {
        a(p0.NULL);
        C();
    }

    @Override // defpackage.m0
    public String s() throws IOException {
        p0 u = u();
        p0 p0Var = p0.STRING;
        if (u != p0Var && u != p0.NUMBER) {
            throw new IllegalStateException("Expected " + p0Var + " but was " + u);
        }
        return ((l0) C()).n();
    }

    @Override // defpackage.m0
    public String toString() {
        return "q0";
    }

    @Override // defpackage.m0
    public p0 u() throws IOException {
        if (this.q.isEmpty()) {
            return p0.END_DOCUMENT;
        }
        Object B = B();
        if (B instanceof Iterator) {
            List<Object> list = this.q;
            boolean z = list.get(list.size() - 2) instanceof j0;
            Iterator it = (Iterator) B;
            if (!it.hasNext()) {
                return z ? p0.END_OBJECT : p0.END_ARRAY;
            } else if (z) {
                return p0.NAME;
            } else {
                this.q.add(it.next());
                return u();
            }
        } else if (B instanceof j0) {
            return p0.BEGIN_OBJECT;
        } else {
            if (B instanceof f0) {
                return p0.BEGIN_ARRAY;
            }
            if (B instanceof l0) {
                l0 l0Var = (l0) B;
                if (l0Var.q()) {
                    return p0.STRING;
                }
                if (l0Var.o()) {
                    return p0.BOOLEAN;
                }
                if (l0Var.p()) {
                    return p0.NUMBER;
                }
                throw new AssertionError();
            } else if (B instanceof i0) {
                return p0.NULL;
            } else {
                if (B == r) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    private void a(p0 p0Var) throws IOException {
        if (u() == p0Var) {
            return;
        }
        throw new IllegalStateException("Expected " + p0Var + " but was " + u());
    }
}
