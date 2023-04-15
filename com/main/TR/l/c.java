package TR.l;
/* loaded from: classes.dex */
public class c extends g {
    private static final long j = 8416631092286172980L;

    public c(TR.i.b bVar) {
        super("Sessions", TR.q.b.k, bVar);
    }

    @Override // TR.l.g
    public void e() {
        d();
        g();
    }

    @Override // TR.l.g
    public void i() {
        f();
        h();
    }

    @Override // TR.l.g
    public boolean r() {
        return a("device_player_id") == null && TR.d.b.i().l().b() == 0;
    }
}
