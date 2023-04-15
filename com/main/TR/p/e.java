package TR.p;

import TR.l.g;
import TR.m.l;
import TR.q.h;
/* loaded from: classes.dex */
public class e {
    private static final String b = "a";

    /* renamed from: a  reason: collision with root package name */
    private final TR.n.d f604a;

    /* loaded from: classes.dex */
    class a implements TR.j.b<l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TR.l.l f605a;

        a(TR.l.l lVar) {
            this.f605a = lVar;
        }

        @Override // TR.j.b
        public void a(g gVar, l lVar) {
            String str = e.b;
            h.a(str, "Interstitial event impression" + this.f605a.c());
        }

        @Override // TR.j.b
        public void a(g gVar, Throwable th) {
            h.b(e.b, String.format("%s %s", this.f605a.c(), th.getLocalizedMessage()));
        }
    }

    public e(TR.n.d dVar) {
        this.f604a = dVar;
    }

    public void a(TR.l.l lVar) {
        if (lVar == null) {
            return;
        }
        this.f604a.a(lVar, new a(lVar));
    }
}
