package TR.o;

import TR.l.e;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private String f596a;
    private e b;
    private Map<String, TR.m.e> c = new HashMap();

    public e a() {
        return this.b;
    }

    public TR.m.e a(String str) {
        return this.c.get(str);
    }

    public void a(e eVar) {
        this.b = eVar;
    }

    public void a(TR.m.e eVar) {
        this.c.put(eVar.e(), eVar);
    }

    public String b() {
        return this.f596a;
    }

    public void b(TR.m.e eVar) {
        this.c.remove(eVar.e());
    }

    public void b(String str) {
        this.f596a = str;
    }
}
