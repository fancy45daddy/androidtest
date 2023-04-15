package TR.l;

import TR.l.g;
/* loaded from: classes.dex */
public class e extends g {
    private static final long k = 2769282982908010829L;
    private String j;

    public e(String str, TR.i.b bVar) {
        super("Offers", String.format("%s/%s", "offers", str), bVar);
        a(g.a.TRRequestHTTPTypeGET);
        this.j = str;
    }

    @Override // TR.l.g
    public void i() {
        super.i();
        d();
        c();
        g();
    }

    @Override // TR.l.g
    public void k() {
        super.k();
    }

    public String u() {
        return this.j;
    }
}
