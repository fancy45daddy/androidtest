package defpackage;
/* renamed from: e0  reason: default package */
/* loaded from: classes4.dex */
public final class e0 implements u1 {

    /* renamed from: a  reason: collision with root package name */
    private final i f11838a;

    public e0(i iVar) {
        this.f11838a = iVar;
    }

    @Override // defpackage.u1
    public <T> t1<T> a(u uVar, x1<T> x1Var) {
        d0 d0Var = (d0) x1Var.a().getAnnotation(d0.class);
        if (d0Var == null) {
            return null;
        }
        return (t1<T>) a(this.f11838a, uVar, x1Var, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t1<?> a(i iVar, u uVar, x1<?> x1Var, d0 d0Var) {
        t1<?> a2;
        Class<?> value = d0Var.value();
        if (t1.class.isAssignableFrom(value)) {
            a2 = (t1) iVar.a(x1.a((Class) value)).a();
        } else if (u1.class.isAssignableFrom(value)) {
            a2 = ((u1) iVar.a(x1.a((Class) value)).a()).a(uVar, x1Var);
        } else {
            throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter or TypeAdapterFactory reference.");
        }
        return a2 != null ? a2.a() : a2;
    }
}
