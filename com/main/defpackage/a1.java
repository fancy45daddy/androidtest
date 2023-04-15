package defpackage;

import com.inmarket.m2m.data.Constants_BuildGenerated;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* renamed from: a1  reason: default package */
/* loaded from: classes2.dex */
public final class a1 implements u1 {

    /* renamed from: a  reason: collision with root package name */
    private final i f631a;
    final boolean b;

    /* renamed from: a1$a */
    /* loaded from: classes2.dex */
    private final class a<K, V> extends t1<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final t1<K> f632a;
        private final t1<V> b;
        private final b1<? extends Map<K, V>> c;

        public a(u uVar, Type type, t1<K> t1Var, Type type2, t1<V> t1Var2, b1<? extends Map<K, V>> b1Var) {
            this.f632a = new v1(uVar, t1Var, type);
            this.b = new v1(uVar, t1Var2, type2);
            this.c = b1Var;
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Map<K, V> a(m0 m0Var) throws IOException {
            p0 u = m0Var.u();
            if (u == p0.NULL) {
                m0Var.r();
                return null;
            }
            Map<K, V> a2 = this.c.a();
            if (u == p0.BEGIN_ARRAY) {
                m0Var.a();
                while (m0Var.k()) {
                    m0Var.a();
                    K a3 = this.f632a.a(m0Var);
                    if (a2.put(a3, this.b.a(m0Var)) == null) {
                        m0Var.f();
                    } else {
                        throw new o0("duplicate key: " + a3);
                    }
                }
                m0Var.f();
            } else {
                m0Var.b();
                while (m0Var.k()) {
                    n0.f12109a.a(m0Var);
                    K a4 = this.f632a.a(m0Var);
                    if (a2.put(a4, this.b.a(m0Var)) != null) {
                        throw new o0("duplicate key: " + a4);
                    }
                }
                m0Var.g();
            }
            return a2;
        }

        @Override // defpackage.t1
        public /* bridge */ /* synthetic */ void a(s0 s0Var, Object obj) throws IOException {
            a(s0Var, (Map) ((Map) obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void a(s0 s0Var, Map<K, V> map) throws IOException {
            if (map == null) {
                s0Var.k();
            } else if (!a1.this.b) {
                s0Var.d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    s0Var.a(String.valueOf(entry.getKey()));
                    this.b.a(s0Var, entry.getValue());
                }
                s0Var.f();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    g0 a2 = this.f632a.a((t1<K>) entry2.getKey());
                    arrayList.add(a2);
                    arrayList2.add(entry2.getValue());
                    z |= a2.d() || a2.f();
                }
                if (z) {
                    s0Var.c();
                    while (i < arrayList.size()) {
                        s0Var.c();
                        q1.a((g0) arrayList.get(i), s0Var);
                        this.b.a(s0Var, arrayList2.get(i));
                        s0Var.e();
                        i++;
                    }
                    s0Var.e();
                    return;
                }
                s0Var.d();
                while (i < arrayList.size()) {
                    s0Var.a(a((g0) arrayList.get(i)));
                    this.b.a(s0Var, arrayList2.get(i));
                    i++;
                }
                s0Var.f();
            }
        }

        private String a(g0 g0Var) {
            if (g0Var.g()) {
                l0 c = g0Var.c();
                if (c.p()) {
                    return String.valueOf(c.m());
                }
                if (c.o()) {
                    return Boolean.toString(c.h());
                }
                if (c.q()) {
                    return c.n();
                }
                throw new AssertionError();
            } else if (g0Var.e()) {
                return Constants_BuildGenerated.SS_API_HOST;
            } else {
                throw new AssertionError();
            }
        }
    }

    public a1(i iVar, boolean z) {
        this.f631a = iVar;
        this.b = z;
    }

    @Override // defpackage.u1
    public <T> t1<T> a(u uVar, x1<T> x1Var) {
        Type b = x1Var.b();
        if (Map.class.isAssignableFrom(x1Var.a())) {
            Type[] b2 = b.b(b, b.e(b));
            return new a(uVar, b2[0], a(uVar, b2[0]), b2[1], uVar.a((x1) x1.a(b2[1])), this.f631a.a(x1Var));
        }
        return null;
    }

    private t1<?> a(u uVar, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return uVar.a((x1) x1.a(type));
        }
        return w1.f;
    }
}
