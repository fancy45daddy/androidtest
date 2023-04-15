package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* renamed from: x1  reason: default package */
/* loaded from: classes8.dex */
public class x1<T> {

    /* renamed from: a  reason: collision with root package name */
    final Class<? super T> f12170a;
    final Type b;
    final int c;

    protected x1() {
        Type b = b(x1.class);
        this.b = b;
        this.f12170a = (Class<? super T>) b.e(b);
        this.c = b.hashCode();
    }

    static Type b(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> a() {
        return this.f12170a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x1) && b.a(this.b, ((x1) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return b.h(this.b);
    }

    public static x1<?> a(Type type) {
        return new x1<>(type);
    }

    public static <T> x1<T> a(Class<T> cls) {
        return new x1<>(cls);
    }

    x1(Type type) {
        Type b = b.b((Type) a.a(type));
        this.b = b;
        this.f12170a = (Class<? super T>) b.e(b);
        this.c = b.hashCode();
    }

    public final Type b() {
        return this.b;
    }
}
