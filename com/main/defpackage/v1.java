package defpackage;

import defpackage.h1;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v1  reason: default package */
/* loaded from: classes8.dex */
public final class v1<T> extends t1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final u f12148a;
    private final t1<T> b;
    private final Type c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v1(u uVar, t1<T> t1Var, Type type) {
        this.f12148a = uVar;
        this.b = t1Var;
        this.c = type;
    }

    @Override // defpackage.t1
    public T a(m0 m0Var) throws IOException {
        return this.b.a(m0Var);
    }

    @Override // defpackage.t1
    public void a(s0 s0Var, T t) throws IOException {
        t1<T> t1Var = this.b;
        Type a2 = a(this.c, t);
        if (a2 != this.c) {
            t1Var = this.f12148a.a((x1) x1.a(a2));
            if (t1Var instanceof h1.b) {
                t1<T> t1Var2 = this.b;
                if (!(t1Var2 instanceof h1.b)) {
                    t1Var = t1Var2;
                }
            }
        }
        t1Var.a(s0Var, t);
    }

    private Type a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }
}
