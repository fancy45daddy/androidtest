package TR.p;

import TR.l.g;
import TR.q.h;
import com.tapr.sdk.PlacementCustomParameters;
import com.tapr.sdk.PlacementListener;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final TR.n.c f599a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TR.j.b<TR.m.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlacementListener f600a;
        final /* synthetic */ String b;
        final /* synthetic */ PlacementCustomParameters c;

        a(PlacementListener placementListener, String str, PlacementCustomParameters placementCustomParameters) {
            this.f600a = placementListener;
            this.b = str;
            this.c = placementCustomParameters;
        }

        @Override // TR.j.b
        public void a(g gVar, TR.m.e eVar) {
            TR.m.f fVar;
            if (this.f600a == null) {
                return;
            }
            if (eVar == null) {
                this.f600a.onPlacementReady(new TR.m.f("Placement initialization failed Empty Offer", this.b));
                return;
            }
            if (eVar.e() == null || (!eVar.e().isEmpty() && eVar.e().equalsIgnoreCase(this.b))) {
                b.this.f599a.a(eVar);
                fVar = new TR.m.f(eVar, this.c);
                if (!fVar.isSurveyWallAvailable()) {
                    h.i(String.format("Placement isn't available reason - %d, comment - %s", Integer.valueOf(fVar.getPlacementCode()), fVar.getPlacementErrorMessage()));
                }
            } else {
                fVar = new TR.m.f("Placement initialization failed identifier not matching ", this.b);
            }
            h.a("Sending placement " + fVar.getPlacementIdentifier());
            this.f600a.onPlacementReady(fVar);
            b.this.f599a.f();
        }

        @Override // TR.j.b
        public void a(g gVar, Throwable th) {
            if (this.f600a == null) {
                return;
            }
            h.i("Failed creating a placement");
            this.f600a.onPlacementReady(new TR.m.f("Placement initialization network request failed", this.b));
        }
    }

    public b(TR.n.c cVar) {
        this.f599a = cVar;
    }

    private TR.j.b<TR.m.e> a(String str, PlacementCustomParameters placementCustomParameters, PlacementListener placementListener) {
        return new a(placementListener, str, placementCustomParameters);
    }

    public TR.l.e a() {
        return this.f599a.b();
    }

    public TR.m.e a(String str) {
        return this.f599a.b(str);
    }

    public void a(PlacementListener placementListener, String str, PlacementCustomParameters placementCustomParameters) {
        if (this.f599a.c() != null && !this.f599a.c().equalsIgnoreCase(str)) {
            h.a("Double Click Alert");
            return;
        }
        this.f599a.d(str);
        this.f599a.a(placementCustomParameters);
        this.f599a.a(str, a(str, placementCustomParameters, placementListener), true);
    }

    public void b() {
        this.f599a.a(null, null);
    }

    public void b(String str) {
        this.f599a.c(str);
    }

    public void b(String str, PlacementCustomParameters placementCustomParameters, PlacementListener placementListener) {
        this.f599a.a(str, a(str, placementCustomParameters, placementListener));
    }
}
