package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* renamed from: h1  reason: default package */
/* loaded from: classes8.dex */
public final class h1 implements u1 {

    /* renamed from: a  reason: collision with root package name */
    private final i f11845a;
    private final r b;
    private final m c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1$c */
    /* loaded from: classes8.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String f11847a;
        final boolean b;
        final boolean c;

        protected c(String str, boolean z, boolean z2) {
            this.f11847a = str;
            this.b = z;
            this.c = z2;
        }

        abstract void a(m0 m0Var, Object obj) throws IOException, IllegalAccessException;

        abstract void a(s0 s0Var, Object obj) throws IOException, IllegalAccessException;

        abstract boolean a(Object obj) throws IOException, IllegalAccessException;
    }

    public h1(i iVar, r rVar, m mVar) {
        this.f11845a = iVar;
        this.b = rVar;
        this.c = mVar;
    }

    public boolean a(Field field, boolean z) {
        return a(field, z, this.c);
    }

    static boolean a(Field field, boolean z, m mVar) {
        return (mVar.a(field.getType(), z) || mVar.a(field, z)) ? false : true;
    }

    private List<String> a(Field field) {
        return a(this.b, field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h1$a */
    /* loaded from: classes8.dex */
    public class a extends c {
        final t1<?> d;
        final /* synthetic */ u e;
        final /* synthetic */ Field f;
        final /* synthetic */ x1 g;
        final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z, boolean z2, u uVar, Field field, x1 x1Var, boolean z3) {
            super(str, z, z2);
            this.e = uVar;
            this.f = field;
            this.g = x1Var;
            this.h = z3;
            this.d = h1.this.a(uVar, field, x1Var);
        }

        @Override // defpackage.h1.c
        void a(s0 s0Var, Object obj) throws IOException, IllegalAccessException {
            new v1(this.e, this.d, this.g.b()).a(s0Var, (s0) this.f.get(obj));
        }

        @Override // defpackage.h1.c
        void a(m0 m0Var, Object obj) throws IOException, IllegalAccessException {
            Object a2 = this.d.a(m0Var);
            if (a2 == null && this.h) {
                return;
            }
            this.f.set(obj, a2);
        }

        @Override // defpackage.h1.c
        public boolean a(Object obj) throws IOException, IllegalAccessException {
            return this.b && this.f.get(obj) != obj;
        }
    }

    static List<String> a(r rVar, Field field) {
        m1 m1Var = (m1) field.getAnnotation(m1.class);
        LinkedList linkedList = new LinkedList();
        if (m1Var == null) {
            linkedList.add(rVar.a(field));
        } else {
            linkedList.add(m1Var.value());
            String[] alternate = m1Var.alternate();
            for (String str : alternate) {
                linkedList.add(str);
            }
        }
        return linkedList;
    }

    @Override // defpackage.u1
    public <T> t1<T> a(u uVar, x1<T> x1Var) {
        Class<? super T> a2 = x1Var.a();
        if (Object.class.isAssignableFrom(a2)) {
            return new b(this.f11845a.a(x1Var), a(uVar, (x1<?>) x1Var, (Class<?>) a2));
        }
        return null;
    }

    private c a(u uVar, Field field, String str, x1<?> x1Var, boolean z, boolean z2) {
        return new a(str, z, z2, uVar, field, x1Var, f1.a((Type) x1Var.a()));
    }

    t1<?> a(u uVar, Field field, x1<?> x1Var) {
        t1<?> a2;
        d0 d0Var = (d0) field.getAnnotation(d0.class);
        return (d0Var == null || (a2 = e0.a(this.f11845a, uVar, x1Var, d0Var)) == null) ? uVar.a((x1) x1Var) : a2;
    }

    /* renamed from: h1$b */
    /* loaded from: classes8.dex */
    public static final class b<T> extends t1<T> {

        /* renamed from: a  reason: collision with root package name */
        private final b1<T> f11846a;
        private final Map<String, c> b;

        b(b1<T> b1Var, Map<String, c> map) {
            this.f11846a = b1Var;
            this.b = map;
        }

        @Override // defpackage.t1
        public T a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            T a2 = this.f11846a.a();
            try {
                m0Var.b();
                while (m0Var.k()) {
                    c cVar = this.b.get(m0Var.q());
                    if (cVar != null && cVar.c) {
                        cVar.a(m0Var, a2);
                    }
                    m0Var.A();
                }
                m0Var.g();
                return a2;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new o0(e2);
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, T t) throws IOException {
            if (t == null) {
                s0Var.k();
                return;
            }
            s0Var.d();
            try {
                for (c cVar : this.b.values()) {
                    if (cVar.a(t)) {
                        s0Var.a(cVar.f11847a);
                        cVar.a(s0Var, t);
                    }
                }
                s0Var.f();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    private Map<String, c> a(u uVar, x1<?> x1Var, Class<?> cls) {
        c cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b2 = x1Var.b();
        x1<?> x1Var2 = x1Var;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a2 = a(field, true);
                boolean a3 = a(field, z);
                if (a2 || a3) {
                    field.setAccessible(true);
                    Type a4 = defpackage.b.a(x1Var2.b(), cls2, field.getGenericType());
                    List<String> a5 = a(field);
                    c cVar2 = null;
                    int i2 = 0;
                    while (i2 < a5.size()) {
                        String str = a5.get(i2);
                        boolean z2 = i2 != 0 ? false : a2;
                        int i3 = i2;
                        c cVar3 = cVar2;
                        List<String> list = a5;
                        Field field2 = field;
                        cVar2 = cVar3 == null ? (c) linkedHashMap.put(str, a(uVar, field, str, x1.a(a4), z2, a3)) : cVar3;
                        i2 = i3 + 1;
                        a2 = z2;
                        a5 = list;
                        field = field2;
                    }
                    if (cVar2 != null) {
                        throw new IllegalArgumentException(b2 + " declares multiple JSON fields named " + cVar.f11847a);
                    }
                }
                i++;
                z = false;
            }
            x1Var2 = x1.a(defpackage.b.a(x1Var2.b(), cls2, cls2.getGenericSuperclass()));
            cls2 = x1Var2.a();
        }
        return linkedHashMap;
    }
}
