package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: f0  reason: default package */
/* loaded from: classes4.dex */
public final class f0 extends g0 implements Iterable<g0> {

    /* renamed from: a  reason: collision with root package name */
    private final List<g0> f11841a = new ArrayList();

    public void a(g0 g0Var) {
        if (g0Var == null) {
            g0Var = i0.f11854a;
        }
        this.f11841a.add(g0Var);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof f0) && ((f0) obj).f11841a.equals(this.f11841a));
    }

    public int hashCode() {
        return this.f11841a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<g0> iterator() {
        return this.f11841a.iterator();
    }
}
