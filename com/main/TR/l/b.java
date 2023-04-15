package TR.l;
/* loaded from: classes.dex */
public class b extends g {
    private static final long j = 3567146327497038948L;

    public b() {
        super("Clicks", TR.q.b.l, null);
    }

    @Override // TR.l.g
    public void e() {
        d();
        c();
    }

    @Override // TR.l.g
    public void i() {
        f();
    }

    @Override // TR.l.g
    public boolean r() {
        return (a("device_player_id") == null && TR.d.b.i().l().b() == 0) || (a("app_session_id") == null && TR.d.b.i().e().a() == 0);
    }
}
