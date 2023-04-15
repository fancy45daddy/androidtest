package defpackage;

import java.io.IOException;
/* renamed from: t1  reason: default package */
/* loaded from: classes8.dex */
public abstract class t1<T> {
    public abstract T a(m0 m0Var) throws IOException;

    public final t1<T> a() {
        return new a();
    }

    public abstract void a(s0 s0Var, T t) throws IOException;

    public final g0 a(T t) {
        try {
            r0 r0Var = new r0();
            a(r0Var, t);
            return r0Var.n();
        } catch (IOException e) {
            throw new h0(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t1$a */
    /* loaded from: classes8.dex */
    public class a extends t1<T> {
        a() {
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, T t) throws IOException {
            if (t == null) {
                s0Var.k();
            } else {
                t1.this.a(s0Var, t);
            }
        }

        @Override // defpackage.t1
        public T a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return (T) t1.this.a(m0Var);
        }
    }
}
