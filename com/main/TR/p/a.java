package TR.p;

import TR.l.g;
import TR.q.h;
/* loaded from: classes.dex */
public class a {
    private static final String b = "a";

    /* renamed from: a  reason: collision with root package name */
    private final TR.n.a f597a;

    /* renamed from: TR.p.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0006a implements TR.j.b<TR.m.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TR.m.e f598a;

        C0006a(TR.m.e eVar) {
            this.f598a = eVar;
        }

        @Override // TR.j.b
        public void a(g gVar, TR.m.a aVar) {
            String str = a.b;
            h.a(str, "app offers impression" + this.f598a.e());
        }

        @Override // TR.j.b
        public void a(g gVar, Throwable th) {
            h.b(a.b, String.format("%s %s", this.f598a.e(), th.getLocalizedMessage()));
        }
    }

    public a(TR.n.a aVar) {
        this.f597a = aVar;
    }

    public void a(TR.m.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f597a.a(new TR.m.b(eVar.j(), eVar.m(), eVar.o(), eVar.e(), eVar.n()), new C0006a(eVar));
    }
}
