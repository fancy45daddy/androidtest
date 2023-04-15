package defpackage;

import java.io.IOException;
import java.util.ArrayList;
/* renamed from: c1  reason: default package */
/* loaded from: classes3.dex */
public final class c1 extends t1<Object> {
    public static final u1 b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final u f650a;

    /* renamed from: c1$a */
    /* loaded from: classes3.dex */
    static class a implements u1 {
        a() {
        }

        @Override // defpackage.u1
        public <T> t1<T> a(u uVar, x1<T> x1Var) {
            if (x1Var.a() == Object.class) {
                return new c1(uVar);
            }
            return null;
        }
    }

    /* renamed from: c1$b */
    /* loaded from: classes3.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f651a;

        static {
            int[] iArr = new int[p0.values().length];
            f651a = iArr;
            try {
                iArr[p0.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f651a[p0.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f651a[p0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f651a[p0.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f651a[p0.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f651a[p0.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    c1(u uVar) {
        this.f650a = uVar;
    }

    @Override // defpackage.t1
    public Object a(m0 m0Var) throws IOException {
        switch (b.f651a[m0Var.u().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                m0Var.a();
                while (m0Var.k()) {
                    arrayList.add(a(m0Var));
                }
                m0Var.f();
                return arrayList;
            case 2:
                x0 x0Var = new x0();
                m0Var.b();
                while (m0Var.k()) {
                    x0Var.put(m0Var.q(), a(m0Var));
                }
                m0Var.g();
                return x0Var;
            case 3:
                return m0Var.s();
            case 4:
                return Double.valueOf(m0Var.n());
            case 5:
                return Boolean.valueOf(m0Var.m());
            case 6:
                m0Var.r();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // defpackage.t1
    public void a(s0 s0Var, Object obj) throws IOException {
        if (obj == null) {
            s0Var.k();
            return;
        }
        t1 a2 = this.f650a.a((Class) obj.getClass());
        if (a2 instanceof c1) {
            s0Var.d();
            s0Var.f();
            return;
        }
        a2.a(s0Var, obj);
    }
}
