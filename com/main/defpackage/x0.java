package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* renamed from: x0  reason: default package */
/* loaded from: classes8.dex */
public final class x0<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> h = new a();
    static final /* synthetic */ boolean i = true;

    /* renamed from: a  reason: collision with root package name */
    Comparator<? super K> f12165a;
    e<K, V> b;
    int c;
    int d;
    final e<K, V> e;
    private x0<K, V>.b f;
    private x0<K, V>.c g;

    /* renamed from: x0$a */
    /* loaded from: classes8.dex */
    static class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: x0$b */
    /* loaded from: classes8.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: x0$b$a */
        /* loaded from: classes8.dex */
        class a extends x0<K, V>.d<Map.Entry<K, V>> {
            a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            x0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && x0.this.a((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> a2;
            if ((obj instanceof Map.Entry) && (a2 = x0.this.a((Map.Entry) obj)) != null) {
                x0.this.b(a2, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return x0.this.c;
        }
    }

    /* renamed from: x0$c */
    /* loaded from: classes8.dex */
    final class c extends AbstractSet<K> {

        /* renamed from: x0$c$a */
        /* loaded from: classes8.dex */
        class a extends x0<K, V>.d<K> {
            a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            x0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return x0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return x0.this.b(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return x0.this.c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0$d */
    /* loaded from: classes8.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        e<K, V> f12168a;
        e<K, V> b = null;
        int c;

        d() {
            this.f12168a = x0.this.e.d;
            this.c = x0.this.d;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f12168a;
            x0 x0Var = x0.this;
            if (eVar != x0Var.e) {
                if (x0Var.d == this.c) {
                    this.f12168a = eVar.d;
                    this.b = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f12168a != x0.this.e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.b;
            if (eVar != null) {
                x0.this.b(eVar, true);
                this.b = null;
                this.c = x0.this.d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public x0() {
        this(h);
    }

    e<K, V> a(K k, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f12165a;
        e<K, V> eVar2 = this.b;
        if (eVar2 != null) {
            Comparable comparable = comparator == h ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(eVar2.f);
                } else {
                    i2 = comparator.compare(k, (K) eVar2.f);
                }
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.b : eVar2.c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (z) {
            e<K, V> eVar4 = this.e;
            if (eVar2 == null) {
                if (comparator == h && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                eVar = new e<>(eVar2, k, eVar4, eVar4.e);
                this.b = eVar;
            } else {
                eVar = new e<>(eVar2, k, eVar4, eVar4.e);
                if (i2 < 0) {
                    eVar2.b = eVar;
                } else {
                    eVar2.c = eVar;
                }
                a((e) eVar2, true);
            }
            this.c++;
            this.d++;
            return eVar;
        }
        return null;
    }

    void b(e<K, V> eVar, boolean z) {
        int i2;
        if (z) {
            e<K, V> eVar2 = eVar.e;
            eVar2.d = eVar.d;
            eVar.d.e = eVar2;
        }
        e<K, V> eVar3 = eVar.b;
        e<K, V> eVar4 = eVar.c;
        e<K, V> eVar5 = eVar.f12169a;
        int i3 = 0;
        if (eVar3 != null && eVar4 != null) {
            e<K, V> b2 = eVar3.h > eVar4.h ? eVar3.b() : eVar4.a();
            b(b2, false);
            e<K, V> eVar6 = eVar.b;
            if (eVar6 != null) {
                i2 = eVar6.h;
                b2.b = eVar6;
                eVar6.f12169a = b2;
                eVar.b = null;
            } else {
                i2 = 0;
            }
            e<K, V> eVar7 = eVar.c;
            if (eVar7 != null) {
                i3 = eVar7.h;
                b2.c = eVar7;
                eVar7.f12169a = b2;
                eVar.c = null;
            }
            b2.h = Math.max(i2, i3) + 1;
            a((e) eVar, (e) b2);
            return;
        }
        if (eVar3 != null) {
            a((e) eVar, (e) eVar3);
            eVar.b = null;
        } else if (eVar4 != null) {
            a((e) eVar, (e) eVar4);
            eVar.c = null;
        } else {
            a((e) eVar, (e) null);
        }
        a((e) eVar5, false);
        this.c--;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.b = null;
        this.c = 0;
        this.d++;
        e<K, V> eVar = this.e;
        eVar.e = eVar;
        eVar.d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return a(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        x0<K, V>.b bVar = this.f;
        if (bVar != null) {
            return bVar;
        }
        x0<K, V>.b bVar2 = new b();
        this.f = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> a2 = a(obj);
        if (a2 != null) {
            return a2.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        x0<K, V>.c cVar = this.g;
        if (cVar != null) {
            return cVar;
        }
        x0<K, V>.c cVar2 = new c();
        this.g = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            e<K, V> a2 = a((x0<K, V>) k, true);
            V v2 = a2.g;
            a2.g = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> b2 = b(obj);
        if (b2 != null) {
            return b2.g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.c;
    }

    public x0(Comparator<? super K> comparator) {
        this.c = 0;
        this.d = 0;
        this.e = new e<>();
        this.f12165a = comparator == null ? h : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0$e */
    /* loaded from: classes8.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        e<K, V> f12169a;
        e<K, V> b;
        e<K, V> c;
        e<K, V> d;
        e<K, V> e;
        final K f;
        V g;
        int h;

        e() {
            this.f = null;
            this.e = this;
            this.d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.b; eVar2 != null; eVar2 = eVar2.b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.c; eVar2 != null; eVar2 = eVar2.c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.g;
                if (v == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.g;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.g;
            this.g = v;
            return v2;
        }

        public String toString() {
            return this.f + "=" + this.g;
        }

        e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.f12169a = eVar;
            this.f = k;
            this.h = 1;
            this.d = eVar2;
            this.e = eVar3;
            eVar3.d = this;
            eVar2.e = this;
        }
    }

    e<K, V> b(Object obj) {
        e<K, V> a2 = a(obj);
        if (a2 != null) {
            b(a2, true);
        }
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> a(Object obj) {
        if (obj != 0) {
            try {
                return a((x0<K, V>) obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    private void b(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar2.b;
        e<K, V> eVar5 = eVar2.c;
        eVar.b = eVar5;
        if (eVar5 != null) {
            eVar5.f12169a = eVar;
        }
        a((e) eVar, (e) eVar2);
        eVar2.c = eVar;
        eVar.f12169a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.h : 0, eVar5 != null ? eVar5.h : 0) + 1;
        eVar.h = max;
        eVar2.h = Math.max(max, eVar4 != null ? eVar4.h : 0) + 1;
    }

    e<K, V> a(Map.Entry<?, ?> entry) {
        e<K, V> a2 = a(entry.getKey());
        if (a2 != null && a(a2.g, entry.getValue())) {
            return a2;
        }
        return null;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void a(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f12169a;
        eVar.f12169a = null;
        if (eVar2 != null) {
            eVar2.f12169a = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.b == eVar) {
                eVar3.b = eVar2;
                return;
            } else if (!i && eVar3.c != eVar) {
                throw new AssertionError();
            } else {
                eVar3.c = eVar2;
                return;
            }
        }
        this.b = eVar2;
    }

    private void a(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.b;
            e<K, V> eVar3 = eVar.c;
            int i2 = eVar2 != null ? eVar2.h : 0;
            int i3 = eVar3 != null ? eVar3.h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.b;
                e<K, V> eVar5 = eVar3.c;
                int i5 = (eVar4 != null ? eVar4.h : 0) - (eVar5 != null ? eVar5.h : 0);
                if (i5 != -1 && (i5 != 0 || z)) {
                    if (!i && i5 != 1) {
                        throw new AssertionError();
                    }
                    b((e) eVar3);
                    a((e) eVar);
                } else {
                    a((e) eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.b;
                e<K, V> eVar7 = eVar2.c;
                int i6 = (eVar6 != null ? eVar6.h : 0) - (eVar7 != null ? eVar7.h : 0);
                if (i6 != 1 && (i6 != 0 || z)) {
                    if (!i && i6 != -1) {
                        throw new AssertionError();
                    }
                    a((e) eVar2);
                    b((e) eVar);
                } else {
                    b((e) eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.h = i2 + 1;
                if (z) {
                    return;
                }
            } else if (!i && i4 != -1 && i4 != 1) {
                throw new AssertionError();
            } else {
                eVar.h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f12169a;
        }
    }

    private void a(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.c;
        e<K, V> eVar4 = eVar3.b;
        e<K, V> eVar5 = eVar3.c;
        eVar.c = eVar4;
        if (eVar4 != null) {
            eVar4.f12169a = eVar;
        }
        a((e) eVar, (e) eVar3);
        eVar3.b = eVar;
        eVar.f12169a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.h : 0, eVar4 != null ? eVar4.h : 0) + 1;
        eVar.h = max;
        eVar3.h = Math.max(max, eVar5 != null ? eVar5.h : 0) + 1;
    }
}
