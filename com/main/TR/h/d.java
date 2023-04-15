package TR.h;

import TR.q.j;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d implements TR.i.b {
    private static final int b = 3;

    /* renamed from: a  reason: collision with root package name */
    private int f571a = 0;

    @Override // TR.i.b
    public void a(TR.l.g gVar, Throwable th) {
        c();
    }

    @Override // TR.i.b
    public void a(TR.l.g gVar, JSONObject jSONObject) {
        d();
        TR.d.b.i().r.h.a().f(gVar);
    }

    public void c() {
        int i = this.f571a + 1;
        this.f571a = i;
        if (i >= 3) {
            b a2 = new c(b.l, TR.d.b.i().k()).a();
            ArrayList arrayList = new ArrayList();
            arrayList.add(a2);
            TR.d.b.i().r.h.a().e(new TR.l.d("Events", arrayList, this));
        }
    }

    public void d() {
        j.a(TR.q.b.L, (Serializable) null);
        this.f571a = 0;
    }
}
