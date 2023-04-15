package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
/* renamed from: h  reason: default package */
/* loaded from: classes8.dex */
public final class h implements u1 {

    /* renamed from: a  reason: collision with root package name */
    private final i f11843a;

    /* renamed from: h$a */
    /* loaded from: classes8.dex */
    private static final class a<E> extends t1<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final t1<E> f11844a;
        private final b1<? extends Collection<E>> b;

        public a(u uVar, Type type, t1<E> t1Var, b1<? extends Collection<E>> b1Var) {
            this.f11844a = new v1(uVar, t1Var, type);
            this.b = b1Var;
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Collection<E> a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            Collection<E> a2 = this.b.a();
            m0Var.a();
            while (m0Var.k()) {
                a2.add(this.f11844a.a(m0Var));
            }
            m0Var.f();
            return a2;
        }

        @Override // defpackage.t1
        public /* bridge */ /* synthetic */ void a(s0 s0Var, Object obj) throws IOException {
            a(s0Var, (Collection) ((Collection) obj));
        }

        public void a(s0 s0Var, Collection<E> collection) throws IOException {
            if (collection == null) {
                s0Var.k();
                return;
            }
            s0Var.c();
            for (E e : collection) {
                this.f11844a.a(s0Var, e);
            }
            s0Var.e();
        }
    }

    public h(i iVar) {
        this.f11843a = iVar;
    }

    @Override // defpackage.u1
    public <T> t1<T> a(u uVar, x1<T> x1Var) {
        Type b = x1Var.b();
        Class<? super T> a2 = x1Var.a();
        if (Collection.class.isAssignableFrom(a2)) {
            Type a3 = b.a(b, (Class<?>) a2);
            return new a(uVar, a3, uVar.a((x1) x1.a(a3)), this.f11843a.a(x1Var));
        }
        return null;
    }
}
