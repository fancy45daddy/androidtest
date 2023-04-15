package TR.l;

import TR.l.g;
/* loaded from: classes.dex */
public class h extends g {
    private static final long j = -1751043115854095309L;

    public h(TR.i.b bVar) {
        super("Rewards", TR.q.b.i, bVar);
        a(g.a.TRRequestHTTPTypeGET);
        a(true);
    }

    @Override // TR.l.g
    public void e() {
        d();
        g();
    }

    @Override // TR.l.g
    public boolean r() {
        TR.m.h l = TR.d.b.i().l();
        return l.d() || l.b() == 0;
    }
}
