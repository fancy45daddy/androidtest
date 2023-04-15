package TR.l;
/* loaded from: classes.dex */
public class a extends g {
    private static final long k = -7030097322451413844L;
    private final TR.m.b j;

    public a(TR.m.b bVar, TR.i.b bVar2) {
        super("Impressions", TR.q.b.m, bVar2, false);
        this.j = bVar;
    }

    @Override // TR.l.g
    public void e() {
        g();
        a("offer_reason", Integer.valueOf(this.j.b()));
        a("reason_comment", this.j.c());
        a("has_offer", Boolean.valueOf(this.j.e()));
        a("offer_identifier", this.j.a());
        a("has_hot_survey", Boolean.valueOf(this.j.d()));
        a("device_identifier", TR.d.b.i().c());
    }

    @Override // TR.l.g
    public void i() {
    }

    @Override // TR.l.g
    public boolean r() {
        return a("device_player_id") == null && TR.d.b.i().l().b() == 0;
    }
}
