package defpackage;

import com.inmarket.m2m.data.Constants_BuildGenerated;
import com.microblink.core.internal.IOUtils;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.slf4j.Marker;
/* renamed from: w1  reason: default package */
/* loaded from: classes8.dex */
public final class w1 {
    public static final t1<String> A;
    public static final t1<BigDecimal> B;
    public static final t1<BigInteger> C;
    public static final u1 D;
    public static final t1<StringBuilder> E;
    public static final u1 F;
    public static final t1<StringBuffer> G;
    public static final u1 H;
    public static final t1<URL> I;
    public static final u1 J;
    public static final t1<URI> K;
    public static final u1 L;
    public static final t1<InetAddress> M;
    public static final u1 N;
    public static final t1<UUID> O;
    public static final u1 P;
    public static final t1<Currency> Q;
    public static final u1 R;
    public static final u1 S;
    public static final t1<Calendar> T;
    public static final u1 U;
    public static final t1<Locale> V;
    public static final u1 W;
    public static final t1<defpackage.g0> X;
    public static final u1 Y;
    public static final u1 Z;

    /* renamed from: a  reason: collision with root package name */
    public static final t1<Class> f12156a;
    public static final u1 b;
    public static final t1<BitSet> c;
    public static final u1 d;
    public static final t1<Boolean> e;
    public static final t1<Boolean> f;
    public static final u1 g;
    public static final t1<Number> h;
    public static final u1 i;
    public static final t1<Number> j;
    public static final u1 k;
    public static final t1<Number> l;
    public static final u1 m;
    public static final t1<AtomicInteger> n;
    public static final u1 o;
    public static final t1<AtomicBoolean> p;
    public static final u1 q;
    public static final t1<AtomicIntegerArray> r;
    public static final u1 s;
    public static final t1<Number> t;
    public static final t1<Number> u;
    public static final t1<Number> v;
    public static final t1<Number> w;
    public static final u1 x;
    public static final t1<Character> y;
    public static final u1 z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1$a0 */
    /* loaded from: classes8.dex */
    public static class a0 implements u1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f12157a;
        final /* synthetic */ t1 b;

        /* renamed from: w1$a0$a */
        /* loaded from: classes8.dex */
        class a extends t1<T1> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Class f12158a;

            a(Class cls) {
                this.f12158a = cls;
            }

            @Override // defpackage.t1
            public void a(s0 s0Var, T1 t1) throws IOException {
                a0.this.b.a(s0Var, t1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, T1] */
            @Override // defpackage.t1
            public T1 a(m0 m0Var) throws IOException {
                ?? a2 = a0.this.b.a(m0Var);
                if (a2 == 0 || this.f12158a.isInstance(a2)) {
                    return a2;
                }
                throw new o0("Expected a " + this.f12158a.getName() + " but was " + a2.getClass().getName());
            }
        }

        a0(Class cls, t1 t1Var) {
            this.f12157a = cls;
            this.b = t1Var;
        }

        @Override // defpackage.u1
        public <T2> t1<T2> a(defpackage.u uVar, x1<T2> x1Var) {
            Class<? super T2> a2 = x1Var.a();
            if (this.f12157a.isAssignableFrom(a2)) {
                return new a(a2);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f12157a.getName() + ",adapter=" + this.b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1$b0 */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class b0 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12159a;

        static {
            int[] iArr = new int[p0.values().length];
            f12159a = iArr;
            try {
                iArr[p0.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12159a[p0.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12159a[p0.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12159a[p0.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12159a[p0.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12159a[p0.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12159a[p0.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12159a[p0.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12159a[p0.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12159a[p0.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: w1$j0 */
    /* loaded from: classes8.dex */
    private static final class j0<T extends Enum<T>> extends t1<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f12160a = new HashMap();
        private final Map<T, String> b = new HashMap();

        public j0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    m1 m1Var = (m1) cls.getField(name).getAnnotation(m1.class);
                    if (m1Var != null) {
                        name = m1Var.value();
                        for (String str : m1Var.alternate()) {
                            this.f12160a.put(str, t);
                        }
                    }
                    this.f12160a.put(name, t);
                    this.b.put(t, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in " + cls.getName(), e);
            }
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public T a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return this.f12160a.get(m0Var.s());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.t1
        public /* bridge */ /* synthetic */ void a(s0 s0Var, Object obj) throws IOException {
            a(s0Var, (s0) ((Enum) obj));
        }

        public void a(s0 s0Var, T t) throws IOException {
            s0Var.d(t == null ? null : this.b.get(t));
        }
    }

    /* renamed from: w1$r */
    /* loaded from: classes8.dex */
    static class r implements u1 {
        r() {
        }

        @Override // defpackage.u1
        public <T> t1<T> a(defpackage.u uVar, x1<T> x1Var) {
            if (x1Var.a() != Timestamp.class) {
                return null;
            }
            return new a(this, uVar.a((Class) Date.class));
        }

        /* renamed from: w1$r$a */
        /* loaded from: classes8.dex */
        class a extends t1<Timestamp> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ t1 f12161a;

            a(r rVar, t1 t1Var) {
                this.f12161a = t1Var;
            }

            @Override // defpackage.t1
            /* renamed from: b */
            public Timestamp a(m0 m0Var) throws IOException {
                Date date = (Date) this.f12161a.a(m0Var);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // defpackage.t1
            public void a(s0 s0Var, Timestamp timestamp) throws IOException {
                this.f12161a.a(s0Var, timestamp);
            }
        }
    }

    /* renamed from: w1$w */
    /* loaded from: classes8.dex */
    static class w implements u1 {
        w() {
        }

        @Override // defpackage.u1
        public <T> t1<T> a(defpackage.u uVar, x1<T> x1Var) {
            Class a2 = x1Var.a();
            if (!Enum.class.isAssignableFrom(a2) || a2 == Enum.class) {
                return null;
            }
            if (!a2.isEnum()) {
                a2 = (Class<? super Object>) a2.getSuperclass();
            }
            return new j0(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1$x */
    /* loaded from: classes8.dex */
    public static class x implements u1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f12162a;
        final /* synthetic */ t1 b;

        x(Class cls, t1 t1Var) {
            this.f12162a = cls;
            this.b = t1Var;
        }

        @Override // defpackage.u1
        public <T> t1<T> a(defpackage.u uVar, x1<T> x1Var) {
            if (x1Var.a() == this.f12162a) {
                return this.b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f12162a.getName() + ",adapter=" + this.b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1$y */
    /* loaded from: classes8.dex */
    public static class y implements u1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f12163a;
        final /* synthetic */ Class b;
        final /* synthetic */ t1 c;

        y(Class cls, Class cls2, t1 t1Var) {
            this.f12163a = cls;
            this.b = cls2;
            this.c = t1Var;
        }

        @Override // defpackage.u1
        public <T> t1<T> a(defpackage.u uVar, x1<T> x1Var) {
            Class<? super T> a2 = x1Var.a();
            if (a2 == this.f12163a || a2 == this.b) {
                return this.c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.b.getName() + Marker.ANY_NON_NULL_MARKER + this.f12163a.getName() + ",adapter=" + this.c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1$z */
    /* loaded from: classes8.dex */
    public static class z implements u1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Class f12164a;
        final /* synthetic */ Class b;
        final /* synthetic */ t1 c;

        z(Class cls, Class cls2, t1 t1Var) {
            this.f12164a = cls;
            this.b = cls2;
            this.c = t1Var;
        }

        @Override // defpackage.u1
        public <T> t1<T> a(defpackage.u uVar, x1<T> x1Var) {
            Class<? super T> a2 = x1Var.a();
            if (a2 == this.f12164a || a2 == this.b) {
                return this.c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f12164a.getName() + Marker.ANY_NON_NULL_MARKER + this.b.getName() + ",adapter=" + this.c + "]";
        }
    }

    static {
        k kVar = new k();
        f12156a = kVar;
        b = a(Class.class, kVar);
        v vVar = new v();
        c = vVar;
        d = a(BitSet.class, vVar);
        c0 c0Var = new c0();
        e = c0Var;
        f = new d0();
        g = a(Boolean.TYPE, Boolean.class, c0Var);
        e0 e0Var = new e0();
        h = e0Var;
        i = a(Byte.TYPE, Byte.class, e0Var);
        f0 f0Var = new f0();
        j = f0Var;
        k = a(Short.TYPE, Short.class, f0Var);
        g0 g0Var = new g0();
        l = g0Var;
        m = a(Integer.TYPE, Integer.class, g0Var);
        t1<AtomicInteger> a2 = new h0().a();
        n = a2;
        o = a(AtomicInteger.class, a2);
        t1<AtomicBoolean> a3 = new i0().a();
        p = a3;
        q = a(AtomicBoolean.class, a3);
        t1<AtomicIntegerArray> a4 = new a().a();
        r = a4;
        s = a(AtomicIntegerArray.class, a4);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = a(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = a(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = a(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = a(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = a(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = a(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = a(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = b(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = a(UUID.class, pVar);
        t1<Currency> a5 = new q().a();
        Q = a5;
        R = a(Currency.class, a5);
        S = new r();
        s sVar = new s();
        T = sVar;
        U = b(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = a(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = b(defpackage.g0.class, uVar);
        Z = new w();
    }

    public static <TT> u1 a(Class<TT> cls, t1<TT> t1Var) {
        return new x(cls, t1Var);
    }

    public static <TT> u1 b(Class<TT> cls, Class<? extends TT> cls2, t1<? super TT> t1Var) {
        return new z(cls, cls2, t1Var);
    }

    /* renamed from: w1$a */
    /* loaded from: classes8.dex */
    static class a extends t1<AtomicIntegerArray> {
        a() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public AtomicIntegerArray a(m0 m0Var) throws IOException {
            ArrayList arrayList = new ArrayList();
            m0Var.a();
            while (m0Var.k()) {
                try {
                    arrayList.add(Integer.valueOf(m0Var.o()));
                } catch (NumberFormatException e) {
                    throw new o0(e);
                }
            }
            m0Var.f();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, AtomicIntegerArray atomicIntegerArray) throws IOException {
            s0Var.c();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                s0Var.a(atomicIntegerArray.get(i));
            }
            s0Var.e();
        }
    }

    /* renamed from: w1$b */
    /* loaded from: classes8.dex */
    static class b extends t1<Number> {
        b() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Number a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            try {
                return Long.valueOf(m0Var.p());
            } catch (NumberFormatException e) {
                throw new o0(e);
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Number number) throws IOException {
            s0Var.a(number);
        }
    }

    /* renamed from: w1$c */
    /* loaded from: classes8.dex */
    static class c extends t1<Number> {
        c() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Number a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return Float.valueOf((float) m0Var.n());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Number number) throws IOException {
            s0Var.a(number);
        }
    }

    /* renamed from: w1$c0 */
    /* loaded from: classes8.dex */
    static class c0 extends t1<Boolean> {
        c0() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Boolean a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            } else if (m0Var.u() == p0.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(m0Var.s()));
            } else {
                return Boolean.valueOf(m0Var.m());
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Boolean bool) throws IOException {
            if (bool == null) {
                s0Var.k();
            } else {
                s0Var.d(bool.booleanValue());
            }
        }
    }

    /* renamed from: w1$d */
    /* loaded from: classes8.dex */
    static class d extends t1<Number> {
        d() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Number a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return Double.valueOf(m0Var.n());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Number number) throws IOException {
            s0Var.a(number);
        }
    }

    /* renamed from: w1$d0 */
    /* loaded from: classes8.dex */
    static class d0 extends t1<Boolean> {
        d0() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Boolean a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return Boolean.valueOf(m0Var.s());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Boolean bool) throws IOException {
            s0Var.d(bool == null ? Constants_BuildGenerated.SS_API_HOST : bool.toString());
        }
    }

    /* renamed from: w1$e */
    /* loaded from: classes8.dex */
    static class e extends t1<Number> {
        e() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Number a(m0 m0Var) throws IOException {
            p0 u = m0Var.u();
            int i = b0.f12159a[u.ordinal()];
            if (i != 1) {
                if (i == 4) {
                    m0Var.r();
                    return null;
                }
                throw new o0("Expecting number, got: " + u);
            }
            return new t0(m0Var.s());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Number number) throws IOException {
            s0Var.a(number);
        }
    }

    /* renamed from: w1$e0 */
    /* loaded from: classes8.dex */
    static class e0 extends t1<Number> {
        e0() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Number a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            try {
                return Byte.valueOf((byte) m0Var.o());
            } catch (NumberFormatException e) {
                throw new o0(e);
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Number number) throws IOException {
            s0Var.a(number);
        }
    }

    /* renamed from: w1$f */
    /* loaded from: classes8.dex */
    static class f extends t1<Character> {
        f() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Character a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            String s = m0Var.s();
            if (s.length() == 1) {
                return Character.valueOf(s.charAt(0));
            }
            throw new o0("Expecting character, got: " + s);
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Character ch2) throws IOException {
            s0Var.d(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* renamed from: w1$f0 */
    /* loaded from: classes8.dex */
    static class f0 extends t1<Number> {
        f0() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Number a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            try {
                return Short.valueOf((short) m0Var.o());
            } catch (NumberFormatException e) {
                throw new o0(e);
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Number number) throws IOException {
            s0Var.a(number);
        }
    }

    /* renamed from: w1$g */
    /* loaded from: classes8.dex */
    static class g extends t1<String> {
        g() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public String a(m0 m0Var) throws IOException {
            p0 u = m0Var.u();
            if (u == p0.NULL) {
                m0Var.r();
                return null;
            } else if (u == p0.BOOLEAN) {
                return Boolean.toString(m0Var.m());
            } else {
                return m0Var.s();
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, String str) throws IOException {
            s0Var.d(str);
        }
    }

    /* renamed from: w1$g0 */
    /* loaded from: classes8.dex */
    static class g0 extends t1<Number> {
        g0() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Number a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            try {
                return Integer.valueOf(m0Var.o());
            } catch (NumberFormatException e) {
                throw new o0(e);
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Number number) throws IOException {
            s0Var.a(number);
        }
    }

    /* renamed from: w1$h */
    /* loaded from: classes8.dex */
    static class h extends t1<BigDecimal> {
        h() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public BigDecimal a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            try {
                return new BigDecimal(m0Var.s());
            } catch (NumberFormatException e) {
                throw new o0(e);
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, BigDecimal bigDecimal) throws IOException {
            s0Var.a(bigDecimal);
        }
    }

    /* renamed from: w1$h0 */
    /* loaded from: classes8.dex */
    static class h0 extends t1<AtomicInteger> {
        h0() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public AtomicInteger a(m0 m0Var) throws IOException {
            try {
                return new AtomicInteger(m0Var.o());
            } catch (NumberFormatException e) {
                throw new o0(e);
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, AtomicInteger atomicInteger) throws IOException {
            s0Var.a(atomicInteger.get());
        }
    }

    /* renamed from: w1$i */
    /* loaded from: classes8.dex */
    static class i extends t1<BigInteger> {
        i() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public BigInteger a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            try {
                return new BigInteger(m0Var.s());
            } catch (NumberFormatException e) {
                throw new o0(e);
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, BigInteger bigInteger) throws IOException {
            s0Var.a(bigInteger);
        }
    }

    /* renamed from: w1$i0 */
    /* loaded from: classes8.dex */
    static class i0 extends t1<AtomicBoolean> {
        i0() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public AtomicBoolean a(m0 m0Var) throws IOException {
            return new AtomicBoolean(m0Var.m());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, AtomicBoolean atomicBoolean) throws IOException {
            s0Var.d(atomicBoolean.get());
        }
    }

    /* renamed from: w1$j */
    /* loaded from: classes8.dex */
    static class j extends t1<StringBuilder> {
        j() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public StringBuilder a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return new StringBuilder(m0Var.s());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, StringBuilder sb) throws IOException {
            s0Var.d(sb == null ? null : sb.toString());
        }
    }

    /* renamed from: w1$k */
    /* loaded from: classes8.dex */
    static class k extends t1<Class> {
        k() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Class a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Class cls) throws IOException {
            if (cls == null) {
                s0Var.k();
                return;
            }
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: w1$l */
    /* loaded from: classes8.dex */
    static class l extends t1<StringBuffer> {
        l() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public StringBuffer a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return new StringBuffer(m0Var.s());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, StringBuffer stringBuffer) throws IOException {
            s0Var.d(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: w1$m */
    /* loaded from: classes8.dex */
    static class m extends t1<URL> {
        m() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public URL a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            String s = m0Var.s();
            if (Constants_BuildGenerated.SS_API_HOST.equals(s)) {
                return null;
            }
            return new URL(s);
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, URL url) throws IOException {
            s0Var.d(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: w1$n */
    /* loaded from: classes8.dex */
    static class n extends t1<URI> {
        n() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public URI a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            try {
                String s = m0Var.s();
                if (Constants_BuildGenerated.SS_API_HOST.equals(s)) {
                    return null;
                }
                return new URI(s);
            } catch (URISyntaxException e) {
                throw new defpackage.h0(e);
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, URI uri) throws IOException {
            s0Var.d(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: w1$o */
    /* loaded from: classes8.dex */
    static class o extends t1<InetAddress> {
        o() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public InetAddress a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return InetAddress.getByName(m0Var.s());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, InetAddress inetAddress) throws IOException {
            s0Var.d(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: w1$p */
    /* loaded from: classes8.dex */
    static class p extends t1<UUID> {
        p() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public UUID a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            return UUID.fromString(m0Var.s());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, UUID uuid) throws IOException {
            s0Var.d(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: w1$q */
    /* loaded from: classes8.dex */
    static class q extends t1<Currency> {
        q() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Currency a(m0 m0Var) throws IOException {
            return Currency.getInstance(m0Var.s());
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Currency currency) throws IOException {
            s0Var.d(currency.getCurrencyCode());
        }
    }

    /* renamed from: w1$s */
    /* loaded from: classes8.dex */
    static class s extends t1<Calendar> {
        s() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Calendar a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            m0Var.b();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (m0Var.u() != p0.END_OBJECT) {
                String q = m0Var.q();
                int o = m0Var.o();
                if ("year".equals(q)) {
                    i = o;
                } else if ("month".equals(q)) {
                    i2 = o;
                } else if ("dayOfMonth".equals(q)) {
                    i3 = o;
                } else if ("hourOfDay".equals(q)) {
                    i4 = o;
                } else if ("minute".equals(q)) {
                    i5 = o;
                } else if ("second".equals(q)) {
                    i6 = o;
                }
            }
            m0Var.g();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Calendar calendar) throws IOException {
            if (calendar == null) {
                s0Var.k();
                return;
            }
            s0Var.d();
            s0Var.a("year");
            s0Var.a(calendar.get(1));
            s0Var.a("month");
            s0Var.a(calendar.get(2));
            s0Var.a("dayOfMonth");
            s0Var.a(calendar.get(5));
            s0Var.a("hourOfDay");
            s0Var.a(calendar.get(11));
            s0Var.a("minute");
            s0Var.a(calendar.get(12));
            s0Var.a("second");
            s0Var.a(calendar.get(13));
            s0Var.f();
        }
    }

    /* renamed from: w1$t */
    /* loaded from: classes8.dex */
    static class t extends t1<Locale> {
        t() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public Locale a(m0 m0Var) throws IOException {
            if (m0Var.u() == p0.NULL) {
                m0Var.r();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(m0Var.s(), IOUtils.FILE_NAME_DELIMETER);
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            if (nextToken3 == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, Locale locale) throws IOException {
            s0Var.d(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: w1$u */
    /* loaded from: classes8.dex */
    static class u extends t1<defpackage.g0> {
        u() {
        }

        @Override // defpackage.t1
        /* renamed from: b */
        public defpackage.g0 a(m0 m0Var) throws IOException {
            switch (b0.f12159a[m0Var.u().ordinal()]) {
                case 1:
                    return new l0(new t0(m0Var.s()));
                case 2:
                    return new l0(Boolean.valueOf(m0Var.m()));
                case 3:
                    return new l0(m0Var.s());
                case 4:
                    m0Var.r();
                    return defpackage.i0.f11854a;
                case 5:
                    defpackage.f0 f0Var = new defpackage.f0();
                    m0Var.a();
                    while (m0Var.k()) {
                        f0Var.a(a(m0Var));
                    }
                    m0Var.f();
                    return f0Var;
                case 6:
                    defpackage.j0 j0Var = new defpackage.j0();
                    m0Var.b();
                    while (m0Var.k()) {
                        j0Var.a(m0Var.q(), a(m0Var));
                    }
                    m0Var.g();
                    return j0Var;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, defpackage.g0 g0Var) throws IOException {
            if (g0Var != null && !g0Var.e()) {
                if (g0Var.g()) {
                    l0 c = g0Var.c();
                    if (c.p()) {
                        s0Var.a(c.m());
                        return;
                    } else if (c.o()) {
                        s0Var.d(c.h());
                        return;
                    } else {
                        s0Var.d(c.n());
                        return;
                    }
                } else if (g0Var.d()) {
                    s0Var.c();
                    Iterator<defpackage.g0> it = g0Var.a().iterator();
                    while (it.hasNext()) {
                        a(s0Var, it.next());
                    }
                    s0Var.e();
                    return;
                } else if (g0Var.f()) {
                    s0Var.d();
                    for (Map.Entry<String, defpackage.g0> entry : g0Var.b().h()) {
                        s0Var.a(entry.getKey());
                        a(s0Var, entry.getValue());
                    }
                    s0Var.f();
                    return;
                } else {
                    throw new IllegalArgumentException("Couldn't write " + g0Var.getClass());
                }
            }
            s0Var.k();
        }
    }

    /* renamed from: w1$v */
    /* loaded from: classes8.dex */
    static class v extends t1<BitSet> {
        v() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
            if (r8.o() != 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
            r5 = false;
         */
        @Override // defpackage.t1
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet a(defpackage.m0 r8) throws java.io.IOException {
            /*
                r7 = this;
                p0 r0 = r8.u()
                p0 r1 = defpackage.p0.NULL
                if (r0 != r1) goto Ld
                r8.r()
                r8 = 0
                return r8
            Ld:
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.a()
                p0 r1 = r8.u()
                r2 = 0
                r3 = 0
            L1b:
                p0 r4 = defpackage.p0.END_ARRAY
                if (r1 == r4) goto L82
                int[] r4 = defpackage.w1.b0.f12159a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L6e
                r6 = 2
                if (r4 == r6) goto L69
                r6 = 3
                if (r4 != r6) goto L52
                java.lang.String r1 = r8.s()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L3b
                if (r1 == 0) goto L75
                goto L76
            L3b:
                o0 r8 = new o0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L52:
                o0 r8 = new o0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L69:
                boolean r5 = r8.m()
                goto L76
            L6e:
                int r1 = r8.o()
                if (r1 == 0) goto L75
                goto L76
            L75:
                r5 = 0
            L76:
                if (r5 == 0) goto L7b
                r0.set(r3)
            L7b:
                int r3 = r3 + 1
                p0 r1 = r8.u()
                goto L1b
            L82:
                r8.f()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.w1.v.a(m0):java.util.BitSet");
        }

        @Override // defpackage.t1
        public void a(s0 s0Var, BitSet bitSet) throws IOException {
            if (bitSet == null) {
                s0Var.k();
                return;
            }
            s0Var.c();
            for (int i = 0; i < bitSet.length(); i++) {
                s0Var.a(bitSet.get(i) ? 1L : 0L);
            }
            s0Var.e();
        }
    }

    public static <TT> u1 a(Class<TT> cls, Class<TT> cls2, t1<? super TT> t1Var) {
        return new y(cls, cls2, t1Var);
    }

    public static <T1> u1 b(Class<T1> cls, t1<T1> t1Var) {
        return new a0(cls, t1Var);
    }
}
