package TR.p;

import TR.q.h;
import com.tapr.sdk.PlacementCustomParameters;
import com.tapr.sdk.PlacementListener;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f601a;

    public c(b bVar) {
        this.f601a = bVar;
    }

    public void a(PlacementListener placementListener, String str, PlacementCustomParameters placementCustomParameters) {
        if (!TR.d.b.i().u()) {
            h.i("Placement can't be initiated before setting the api token");
        } else if (TR.d.b.i().e().b()) {
            this.f601a.a(placementListener, str, placementCustomParameters);
            h.a("SDK is ready sending placement request");
        } else {
            h.f("SDK isn't ready putting placement request on the queue");
            placementListener.onPlacementReady(new TR.m.f("Can't initialized the placement at this time because the SDK isn't ready", str, -1));
            this.f601a.b(str, placementCustomParameters, placementListener);
        }
    }
}
