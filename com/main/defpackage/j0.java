package defpackage;

import java.util.Map;
import java.util.Set;
/* renamed from: j0  reason: default package */
/* loaded from: classes8.dex */
public final class j0 extends g0 {

    /* renamed from: a  reason: collision with root package name */
    private final x0<String, g0> f12067a = new x0<>();

    public void a(String str, g0 g0Var) {
        if (g0Var == null) {
            g0Var = i0.f11854a;
        }
        this.f12067a.put(str, g0Var);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof j0) && ((j0) obj).f12067a.equals(this.f12067a));
    }

    public Set<Map.Entry<String, g0>> h() {
        return this.f12067a.entrySet();
    }

    public int hashCode() {
        return this.f12067a.hashCode();
    }
}
