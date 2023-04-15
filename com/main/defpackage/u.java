package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.apache.commons.math3.geometry.VectorFormat;
/* renamed from: u  reason: default package */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Map<x1<?>, h<?>>> f12143a;
    private final Map<x1<?>, t1<?>> b;
    private final List<u1> c;
    private final i d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    /* renamed from: u$a */
    /* loaded from: classes8.dex */
    class a {
        a(u uVar) {
        }
    }

    /* renamed from: u$b */
    /* loaded from: classes8.dex */
    class b {
        b(u uVar) {
        }
    }

    public u() {
        this(m.g, q.f12134a, Collections.emptyMap(), false, false, false, true, false, false, false, y0.f12171a, Collections.emptyList());
    }

    private t1<Number> a(boolean z) {
        if (z) {
            return w1.v;
        }
        return new c(this);
    }

    private t1<Number> b(boolean z) {
        if (z) {
            return w1.u;
        }
        return new d(this);
    }

    public String toString() {
        return "{serializeNulls:" + this.e + "factories:" + this.c + ",instanceCreators:" + this.d + VectorFormat.DEFAULT_SUFFIX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u$c */
    /* loaded from: classes8.dex */
    public class c extends t1<Number> {
        c(u uVar) {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Double a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return Double.valueOf(m0Var.n());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Number number) throws IOException {
            if (number == null) {
                s0Var.k();
                return;
            }
            u.a(number.doubleValue());
            s0Var.a(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u$d */
    /* loaded from: classes8.dex */
    public class d extends t1<Number> {
        d(u uVar) {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Float a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return Float.valueOf((float) m0Var.n());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Number number) throws IOException {
            if (number == null) {
                s0Var.k();
                return;
            }
            u.a(number.floatValue());
            s0Var.a(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u$e */
    /* loaded from: classes8.dex */
    public static class e extends t1<Number> {
        e() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Number a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return Long.valueOf(m0Var.p());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Number number) throws IOException {
            if (number == null) {
                s0Var.k();
            } else {
                s0Var.d(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u$f */
    /* loaded from: classes8.dex */
    public static class f extends t1<AtomicLong> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t1 f12144a;

        f(t1 t1Var) {
            this.f12144a = t1Var;
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public AtomicLong a(m0 m0Var) throws IOException {
            return new AtomicLong(((Number) this.f12144a.a(m0Var)).longValue());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, AtomicLong atomicLong) throws IOException {
            this.f12144a.a(s0Var, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u$g */
    /* loaded from: classes8.dex */
    public static class g extends t1<AtomicLongArray> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t1 f12145a;

        g(t1 t1Var) {
            this.f12145a = t1Var;
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public AtomicLongArray a(m0 m0Var) throws IOException {
            ArrayList arrayList = new ArrayList();
            m0Var.a();
            while (m0Var.k()) {
                arrayList.add(Long.valueOf(((Number) this.f12145a.a(m0Var)).longValue()));
            }
            m0Var.f();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, AtomicLongArray atomicLongArray) throws IOException {
            s0Var.c();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f12145a.a(s0Var, Long.valueOf(atomicLongArray.get(i)));
            }
            s0Var.e();
        }
    }

    static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private static t1<AtomicLongArray> b(t1<Number> t1Var) {
        return new g(t1Var).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u$h */
    /* loaded from: classes8.dex */
    public static class h<T> extends t1<T> {

        /* renamed from: a  reason: collision with root package name */
        private t1<T> f12146a;

        h() {
        }

        public void a(t1<T> t1Var) {
            if (this.f12146a == null) {
                this.f12146a = t1Var;
                return;
            }
            throw new AssertionError();
        }

        @Override // defpackage.t1
        public T a(m0 m0Var) throws IOException {
            t1<T> t1Var = this.f12146a;
            if (t1Var != null) {
                return t1Var.a(m0Var);
            }
            throw new IllegalStateException();
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, T t) throws IOException {
            t1<T> t1Var = this.f12146a;
            if (t1Var != null) {
                t1Var.a(s0Var, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private static t1<Number> a(y0 y0Var) {
        if (y0Var == y0.f12171a) {
            return w1.t;
        }
        return new e();
    }

    u(m mVar, r rVar, Map<Type, x<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, y0 y0Var, List<u1> list) {
        this.f12143a = new ThreadLocal<>();
        this.b = Collections.synchronizedMap(new HashMap());
        new a(this);
        new b(this);
        i iVar = new i(map);
        this.d = iVar;
        this.e = z;
        this.g = z3;
        this.f = z4;
        this.h = z5;
        this.i = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(w1.Y);
        arrayList.add(c1.b);
        arrayList.add(mVar);
        arrayList.addAll(list);
        arrayList.add(w1.D);
        arrayList.add(w1.m);
        arrayList.add(w1.g);
        arrayList.add(w1.i);
        arrayList.add(w1.k);
        t1<Number> a2 = a(y0Var);
        arrayList.add(w1.a(Long.TYPE, Long.class, a2));
        arrayList.add(w1.a(Double.TYPE, Double.class, a(z7)));
        arrayList.add(w1.a(Float.TYPE, Float.class, b(z7)));
        arrayList.add(w1.x);
        arrayList.add(w1.o);
        arrayList.add(w1.q);
        arrayList.add(w1.a(AtomicLong.class, a(a2)));
        arrayList.add(w1.a(AtomicLongArray.class, b(a2)));
        arrayList.add(w1.s);
        arrayList.add(w1.z);
        arrayList.add(w1.F);
        arrayList.add(w1.H);
        arrayList.add(w1.a(BigDecimal.class, w1.B));
        arrayList.add(w1.a(BigInteger.class, w1.C));
        arrayList.add(w1.J);
        arrayList.add(w1.L);
        arrayList.add(w1.P);
        arrayList.add(w1.R);
        arrayList.add(w1.W);
        arrayList.add(w1.N);
        arrayList.add(w1.d);
        arrayList.add(j.c);
        arrayList.add(w1.U);
        arrayList.add(s1.b);
        arrayList.add(p1.b);
        arrayList.add(w1.S);
        arrayList.add(defpackage.c.c);
        arrayList.add(w1.b);
        arrayList.add(new defpackage.h(iVar));
        arrayList.add(new a1(iVar, z2));
        arrayList.add(new e0(iVar));
        arrayList.add(w1.Z);
        arrayList.add(new h1(iVar, rVar, mVar));
        this.c = Collections.unmodifiableList(arrayList);
    }

    private static t1<AtomicLong> a(t1<Number> t1Var) {
        return new f(t1Var).a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> t1<T> a(x1<T> x1Var) {
        t1<T> t1Var = (t1<T>) this.b.get(x1Var);
        if (t1Var != null) {
            return t1Var;
        }
        Map<x1<?>, h<?>> map = this.f12143a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f12143a.set(map);
            z = true;
        }
        h<?> hVar = map.get(x1Var);
        if (hVar != null) {
            return hVar;
        }
        try {
            h<?> hVar2 = new h<>();
            map.put(x1Var, hVar2);
            for (u1 u1Var : this.c) {
                t1 t1Var2 = (t1<T>) u1Var.a(this, x1Var);
                if (t1Var2 != null) {
                    hVar2.a((t1<?>) t1Var2);
                    this.b.put(x1Var, t1Var2);
                    return t1Var2;
                }
            }
            throw new IllegalArgumentException("GSON cannot handle " + x1Var);
        } finally {
            map.remove(x1Var);
            if (z) {
                this.f12143a.remove();
            }
        }
    }

    public <T> t1<T> a(u1 u1Var, x1<T> x1Var) {
        boolean z = !this.c.contains(u1Var);
        for (u1 u1Var2 : this.c) {
            if (z) {
                t1<T> a2 = u1Var2.a(this, x1Var);
                if (a2 != null) {
                    return a2;
                }
            } else if (u1Var2 == u1Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + x1Var);
    }

    public <T> t1<T> a(Class<T> cls) {
        return a((x1) x1.a((Class) cls));
    }

    public String a(Object obj) {
        if (obj == null) {
            return a((g0) i0.f11854a);
        }
        return a(obj, obj.getClass());
    }

    public String a(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void a(Object obj, Type type, Appendable appendable) throws h0 {
        try {
            a(obj, type, a(q1.a(appendable)));
        } catch (IOException e2) {
            throw new h0(e2);
        }
    }

    public void a(Object obj, Type type, s0 s0Var) throws h0 {
        t1 a2 = a((x1) x1.a(type));
        boolean i = s0Var.i();
        s0Var.b(true);
        boolean h2 = s0Var.h();
        s0Var.a(this.f);
        boolean g2 = s0Var.g();
        s0Var.c(this.e);
        try {
            try {
                a2.a(s0Var, obj);
            } catch (IOException e2) {
                throw new h0(e2);
            }
        } finally {
            s0Var.b(i);
            s0Var.a(h2);
            s0Var.c(g2);
        }
    }

    public String a(g0 g0Var) {
        StringWriter stringWriter = new StringWriter();
        a(g0Var, stringWriter);
        return stringWriter.toString();
    }

    public void a(g0 g0Var, Appendable appendable) throws h0 {
        try {
            a(g0Var, a(q1.a(appendable)));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public s0 a(Writer writer) throws IOException {
        if (this.g) {
            writer.write(")]}'\n");
        }
        s0 s0Var = new s0(writer);
        if (this.h) {
            s0Var.b("  ");
        }
        s0Var.c(this.e);
        return s0Var;
    }

    public m0 a(Reader reader) {
        m0 m0Var = new m0(reader);
        m0Var.b(this.i);
        return m0Var;
    }

    public void a(g0 g0Var, s0 s0Var) throws h0 {
        boolean i = s0Var.i();
        s0Var.b(true);
        boolean h2 = s0Var.h();
        s0Var.a(this.f);
        boolean g2 = s0Var.g();
        s0Var.c(this.e);
        try {
            try {
                q1.a(g0Var, s0Var);
            } catch (IOException e2) {
                throw new h0(e2);
            }
        } finally {
            s0Var.b(i);
            s0Var.a(h2);
            s0Var.c(g2);
        }
    }

    public <T> T a(String str, Class<T> cls) throws o0 {
        return (T) f1.a((Class) cls).cast(a(str, (Type) cls));
    }

    public <T> T a(String str, Type type) throws o0 {
        if (str == null) {
            return null;
        }
        return (T) a((Reader) new StringReader(str), type);
    }

    public <T> T a(Reader reader, Type type) throws h0, o0 {
        m0 a2 = a(reader);
        T t = (T) a(a2, type);
        a(t, a2);
        return t;
    }

    private static void a(Object obj, m0 m0Var) {
        if (obj != null) {
            try {
                if (m0Var.u() == p0.END_DOCUMENT) {
                    return;
                }
                throw new h0("JSON document was not fully consumed.");
            } catch (z0 e2) {
                throw new o0(e2);
            } catch (IOException e3) {
                throw new h0(e3);
            }
        }
    }

    public <T> T a(m0 m0Var, Type type) throws h0, o0 {
        boolean l = m0Var.l();
        boolean z = true;
        m0Var.b(true);
        try {
            try {
                try {
                    m0Var.u();
                    z = false;
                    return a((x1) x1.a(type)).a(m0Var);
                } catch (IOException e2) {
                    throw new o0(e2);
                }
            } catch (EOFException e3) {
                if (z) {
                    m0Var.b(l);
                    return null;
                }
                throw new o0(e3);
            } catch (IllegalStateException e4) {
                throw new o0(e4);
            }
        } finally {
            m0Var.b(l);
        }
    }
}
