package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* renamed from: y1  reason: default package */
/* loaded from: classes8.dex */
public abstract class y1 {

    /* renamed from: y1$a */
    /* loaded from: classes8.dex */
    static class a extends y1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f12172a;
        final /* synthetic */ Object b;

        a(Method method, Object obj) {
            this.f12172a = method;
            this.b = obj;
        }

        @Override // defpackage.y1
        public <T> T a(Class<T> cls) throws Exception {
            return (T) this.f12172a.invoke(this.b, cls);
        }
    }

    /* renamed from: y1$b */
    /* loaded from: classes9.dex */
    static class b extends y1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f12173a;
        final /* synthetic */ int b;

        b(Method method, int i) {
            this.f12173a = method;
            this.b = i;
        }

        @Override // defpackage.y1
        public <T> T a(Class<T> cls) throws Exception {
            return (T) this.f12173a.invoke(null, cls, Integer.valueOf(this.b));
        }
    }

    /* renamed from: y1$c */
    /* loaded from: classes9.dex */
    static class c extends y1 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Method f12174a;

        c(Method method) {
            this.f12174a = method;
        }

        @Override // defpackage.y1
        public <T> T a(Class<T> cls) throws Exception {
            return (T) this.f12174a.invoke(null, cls, Object.class);
        }
    }

    /* renamed from: y1$d */
    /* loaded from: classes9.dex */
    static class d extends y1 {
        d() {
        }

        @Override // defpackage.y1
        public <T> T a(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public static y1 a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    public abstract <T> T a(Class<T> cls) throws Exception;
}
