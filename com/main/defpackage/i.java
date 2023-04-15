package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* renamed from: i  reason: default package */
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Type, x<?>> f11848a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$a */
    /* loaded from: classes8.dex */
    public class a implements b1<T> {
        a(i iVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // defpackage.b1
        public T a() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$b */
    /* loaded from: classes8.dex */
    public class b implements b1<T> {
        b(i iVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // defpackage.b1
        public T a() {
            return new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$c */
    /* loaded from: classes8.dex */
    public class c implements b1<T> {
        c(i iVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // defpackage.b1
        public T a() {
            return new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$d */
    /* loaded from: classes8.dex */
    public class d implements b1<T> {
        d(i iVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, x0] */
        @Override // defpackage.b1
        public T a() {
            return new x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$e */
    /* loaded from: classes8.dex */
    public class e implements b1<T> {

        /* renamed from: a  reason: collision with root package name */
        private final y1 f11849a = y1.a();
        final /* synthetic */ Class b;
        final /* synthetic */ Type c;

        e(i iVar, Class cls, Type type) {
            this.b = cls;
            this.c = type;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // defpackage.b1
        public T a() {
            try {
                return this.f11849a.a(this.b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.c + ". Register an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* renamed from: i$f */
    /* loaded from: classes8.dex */
    class f implements b1<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f11850a;
        final /* synthetic */ Type b;

        f(i iVar, x xVar, Type type) {
            this.f11850a = xVar;
            this.b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // defpackage.b1
        public T a() {
            return this.f11850a.a(this.b);
        }
    }

    /* renamed from: i$g */
    /* loaded from: classes8.dex */
    class g implements b1<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f11851a;
        final /* synthetic */ Type b;

        g(i iVar, x xVar, Type type) {
            this.f11851a = xVar;
            this.b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // defpackage.b1
        public T a() {
            return this.f11851a.a(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$h */
    /* loaded from: classes8.dex */
    public class h implements b1<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f11852a;

        h(i iVar, Constructor constructor) {
            this.f11852a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // defpackage.b1
        public T a() {
            try {
                return this.f11852a.newInstance(null);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.f11852a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.f11852a + " with no args", e3.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$i  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public class C0584i implements b1<T> {
        C0584i(i iVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // defpackage.b1
        public T a() {
            return new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$j */
    /* loaded from: classes8.dex */
    public class j implements b1<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f11853a;

        j(i iVar, Type type) {
            this.f11853a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // defpackage.b1
        public T a() {
            Type type = this.f11853a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new h0("Invalid EnumSet type: " + this.f11853a.toString());
            }
            throw new h0("Invalid EnumSet type: " + this.f11853a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$k */
    /* loaded from: classes8.dex */
    public class k implements b1<T> {
        k(i iVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // defpackage.b1
        public T a() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$l */
    /* loaded from: classes8.dex */
    public class l implements b1<T> {
        l(i iVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedList] */
        @Override // defpackage.b1
        public T a() {
            return new LinkedList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$m */
    /* loaded from: classes8.dex */
    public class m implements b1<T> {
        m(i iVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // defpackage.b1
        public T a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i$n */
    /* loaded from: classes8.dex */
    public class n implements b1<T> {
        n(i iVar) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // defpackage.b1
        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public i(Map<Type, x<?>> map) {
        this.f11848a = map;
    }

    private <T> b1<T> b(Type type, Class<? super T> cls) {
        return new e(this, cls, type);
    }

    public <T> b1<T> a(x1<T> x1Var) {
        Type b2 = x1Var.b();
        Class<? super T> a2 = x1Var.a();
        x<?> xVar = this.f11848a.get(b2);
        if (xVar != null) {
            return new f(this, xVar, b2);
        }
        x<?> xVar2 = this.f11848a.get(a2);
        if (xVar2 != null) {
            return new g(this, xVar2, b2);
        }
        b1<T> a3 = a(a2);
        if (a3 != null) {
            return a3;
        }
        b1<T> a4 = a(b2, a2);
        return a4 != null ? a4 : b(b2, a2);
    }

    public String toString() {
        return this.f11848a.toString();
    }

    private <T> b1<T> a(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> b1<T> a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C0584i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new l(this);
            }
            return new m(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new b(this);
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(x1.a(((ParameterizedType) type).getActualTypeArguments()[0]).a())) {
                return new c(this);
            }
            return new d(this);
        } else {
            return null;
        }
    }
}
