package TR.l;
/* loaded from: classes.dex */
public class k extends g {
    private final l j;

    public k(l lVar, TR.i.b bVar) {
        super("Event Impressions", TR.q.b.r, bVar, true);
        this.j = lVar;
    }

    @Override // TR.l.g
    public void e() {
        g();
        a("event_type", this.j.b());
        a("event_name", this.j.a());
        a("offer_event_id", this.j.c());
        a("user_identifier", this.j.e());
        a("triggered_at", this.j.d());
    }
}
