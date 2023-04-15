package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* renamed from: c  reason: default package */
/* loaded from: classes2.dex */
public final class c<E> extends t1<Object> {
    public static final u1 c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Class<E> f642a;
    private final t1<E> b;

    /* renamed from: c$a */
    /* loaded from: classes2.dex */
    static class a implements u1 {
        a() {
        }

        @Override // defpackage.u1
        public <T> t1<T> a(u uVar, x1<T> x1Var) {
            Type b = x1Var.b();
            if ((b instanceof GenericArrayType) || ((b instanceof Class) && ((Class) b).isArray())) {
                Type d = b.d(b);
                return new c(uVar, uVar.a((x1) x1.a(d)), b.e(d));
            }
            return null;
        }
    }

    public c(u uVar, t1<E> t1Var, Class<E> cls) {
        this.b = new v1(uVar, t1Var, cls);
        this.f642a = cls;
    }

    @Override // defpackage.t1
    public Object a(m0 m0Var) throws IOException {
        if (m0Var.u() == p0.NULL) {
            m0Var.r();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        m0Var.a();
        while (m0Var.k()) {
            arrayList.add(this.b.a(m0Var));
        }
        m0Var.f();
        Object newInstance = Array.newInstance((Class<?>) this.f642a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.t1
    public void a(s0 s0Var, Object obj) throws IOException {
        if (obj == null) {
            s0Var.k();
            return;
        }
        s0Var.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.a(s0Var, Array.get(obj, i));
        }
        s0Var.e();
    }
}
