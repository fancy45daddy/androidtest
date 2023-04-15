package TR.p;

import TR.l.g;
import TR.q.h;
import com.tapr.sdk.TRPlacement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final TR.n.c f602a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TR.j.b<TR.m.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f603a;
        final /* synthetic */ String b;

        a(b bVar, String str) {
            this.f603a = bVar;
            this.b = str;
        }

        @Override // TR.j.b
        public void a(g gVar, TR.m.e eVar) {
            TR.m.f fVar;
            b bVar;
            long j;
            if (this.f603a == null) {
                return;
            }
            if (eVar == null || eVar.e() == null) {
                fVar = new TR.m.f("Placement initialization failed Empty Offer", this.b);
                bVar = this.f603a;
                j = -1;
            } else {
                if (eVar.e() == null || (!eVar.e().isEmpty() && eVar.e().equalsIgnoreCase(this.b))) {
                    d.this.f602a.a(eVar);
                    fVar = new TR.m.f(eVar, d.this.f602a.d());
                    if (!fVar.isSurveyWallAvailable()) {
                        h.i(String.format("Placement isn't available reason - %d, comment - %s", Integer.valueOf(fVar.getPlacementCode()), fVar.getPlacementErrorMessage()));
                    }
                } else {
                    fVar = new TR.m.f("Placement initialization failed identifier not matching ", this.b);
                }
                j = eVar.l();
                if (j <= 0) {
                    j = TimeUnit.HOURS.toMillis(6L);
                }
                bVar = this.f603a;
            }
            bVar.a(fVar, j);
        }

        @Override // TR.j.b
        public void a(g gVar, Throwable th) {
            if (this.f603a == null) {
                return;
            }
            this.f603a.a(new TR.m.f("Placement initialization failed", this.b), TimeUnit.HOURS.toMillis(6L));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(TRPlacement tRPlacement, long j);
    }

    public d(TR.n.c cVar) {
        this.f602a = cVar;
    }

    private TR.j.b<TR.m.e> a(String str, b bVar) {
        return new a(bVar, str);
    }

    public TR.m.e a(String str) {
        return this.f602a.b(str);
    }

    public void a() {
        this.f602a.a();
    }

    public List<String> b() {
        ArrayList arrayList = new ArrayList();
        for (TR.m.g gVar : this.f602a.e()) {
            arrayList.add(gVar.a());
        }
        return arrayList;
    }

    public void b(String str) {
        this.f602a.c(str);
    }

    public void b(String str, b bVar) {
        this.f602a.a(str, a(str, bVar), false);
    }
}
