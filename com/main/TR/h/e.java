package TR.h;

import TR.q.h;
import TR.q.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class e {
    private static final int b = 20;
    private static final String c = "e";

    /* renamed from: a  reason: collision with root package name */
    private final TR.i.d f572a;

    public e(TR.i.d dVar) {
        this.f572a = dVar;
    }

    private b a() {
        return (b) j.a("crash", (Class<Object>) b.class);
    }

    public void a(b bVar) {
        List list = (List) j.a(TR.q.b.G, (Class<Object>) ArrayList.class);
        if (list != null && list.size() > 20) {
            j.a(TR.q.b.G, (Serializable) null);
            bVar = new c(b.m, TR.d.b.i().k()).a();
        }
        c(bVar);
    }

    public void b() {
        b a2 = a();
        if (a2 != null) {
            c(a2);
            j.a("crash", (Serializable) null);
        }
    }

    public void b(b bVar) {
        if (bVar == null || bVar.d() == 0) {
            j.a("crash", bVar);
        } else {
            h.i("Trying to cache a non crash event");
        }
    }

    public void c(b bVar) {
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            bVar.c();
            String str = bVar.c;
            arrayList.add(bVar);
            this.f572a.e(new TR.l.d("Events", arrayList, new d()));
        }
    }
}
