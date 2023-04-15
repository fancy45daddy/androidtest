package TR.n;

import TR.m.g;
import com.tapr.sdk.PlacementCustomParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends b<TR.m.e> {
    private String b;
    private TR.l.e c;
    private Map<String, TR.m.e> d;
    private List<g> e;
    private PlacementCustomParameters f;
    private final TR.i.g g;

    public c(TR.i.g gVar) {
        super(TR.m.e.class);
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new PlacementCustomParameters();
        this.g = gVar;
    }

    public void a() {
        this.d.clear();
    }

    public void a(TR.m.e eVar) {
        this.d.put(eVar.e(), eVar);
    }

    public void a(PlacementCustomParameters placementCustomParameters) {
        this.f = placementCustomParameters;
    }

    public void a(String str, TR.j.b<TR.m.e> bVar) {
        if (str == null) {
            this.c = null;
        } else {
            this.c = new TR.l.e(str, a(bVar));
        }
    }

    public void a(String str, TR.j.b<TR.m.e> bVar, boolean z) {
        TR.l.e eVar = new TR.l.e(str, a(bVar));
        eVar.k();
        if (z && a(str)) {
            bVar.a((TR.l.g) eVar, (TR.l.e) this.d.get(str));
        } else {
            this.g.b(eVar);
        }
    }

    public void a(List<g> list) {
        this.e = list;
    }

    public boolean a(String str) {
        return this.d.containsKey(str);
    }

    public TR.l.e b() {
        return this.c;
    }

    public TR.m.e b(String str) {
        return this.d.get(str);
    }

    public String c() {
        return this.b;
    }

    public void c(String str) {
        this.d.remove(str);
    }

    public PlacementCustomParameters d() {
        return this.f;
    }

    public void d(String str) {
        this.b = str;
    }

    public List<g> e() {
        return this.e;
    }

    public void f() {
        this.b = null;
    }
}
