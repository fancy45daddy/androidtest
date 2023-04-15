package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
/* renamed from: m  reason: default package */
/* loaded from: classes8.dex */
public final class m implements u1, Cloneable {
    public static final m g = new m();
    private boolean d;

    /* renamed from: a  reason: collision with root package name */
    private double f12077a = -1.0d;
    private int b = 136;
    private boolean c = true;
    private List<n> e = Collections.emptyList();
    private List<n> f = Collections.emptyList();

    private boolean b(Class<?> cls) {
        return cls.isMemberClass() && !c(cls);
    }

    private boolean c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public m clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.u1
    public <T> t1<T> a(u uVar, x1<T> x1Var) {
        Class<? super T> a2 = x1Var.a();
        boolean a3 = a((Class<?>) a2, true);
        boolean a4 = a((Class<?>) a2, false);
        if (a3 || a4) {
            return new a(a4, a3, uVar, x1Var);
        }
        return null;
    }

    /* renamed from: m$a */
    /* loaded from: classes8.dex */
    class a extends t1<T> {

        /* renamed from: a  reason: collision with root package name */
        private t1<T> f12078a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ u d;
        final /* synthetic */ x1 e;

        a(boolean z, boolean z2, u uVar, x1 x1Var) {
            this.b = z;
            this.c = z2;
            this.d = uVar;
            this.e = x1Var;
        }

        private t1<T> b() {
            t1<T> t1Var = this.f12078a;
            if (t1Var != 0) {
                return t1Var;
            }
            t1<T> a2 = this.d.a(m.this, this.e);
            this.f12078a = a2;
            return a2;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // defpackage.t1
        public T a(m0 m0Var) throws IOException {
            if (this.b) {
                m0Var.A();
                return null;
            }
            return b().a(m0Var);
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, T t) throws IOException {
            if (this.c) {
                s0Var.k();
            } else {
                b().a(s0Var, t);
            }
        }
    }

    public boolean a(Field field, boolean z) {
        o oVar;
        if ((this.b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f12077a == -1.0d || a((o1) field.getAnnotation(o1.class), (z1) field.getAnnotation(z1.class))) && !field.isSynthetic()) {
            if (!this.d || ((oVar = (o) field.getAnnotation(o.class)) != null && (!z ? !oVar.deserialize() : !oVar.serialize()))) {
                if ((this.c || !b(field.getType())) && !a(field.getType())) {
                    List<n> list = z ? this.e : this.f;
                    if (list.isEmpty()) {
                        return false;
                    }
                    p pVar = new p(field);
                    for (n nVar : list) {
                        if (nVar.a(pVar)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean a(Class<?> cls, boolean z) {
        if (this.f12077a == -1.0d || a((o1) cls.getAnnotation(o1.class), (z1) cls.getAnnotation(z1.class))) {
            if ((this.c || !b(cls)) && !a(cls)) {
                for (n nVar : z ? this.e : this.f) {
                    if (nVar.a(cls)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    private boolean a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean a(o1 o1Var, z1 z1Var) {
        return a(o1Var) && a(z1Var);
    }

    private boolean a(o1 o1Var) {
        return o1Var == null || o1Var.value() <= this.f12077a;
    }

    private boolean a(z1 z1Var) {
        return z1Var == null || z1Var.value() > this.f12077a;
    }
}
