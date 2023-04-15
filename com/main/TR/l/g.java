package TR.l;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class g implements Serializable {
    private static final long i = 652966539848757690L;

    /* renamed from: a  reason: collision with root package name */
    private final String f580a;
    private final String b;
    private Map<String, Object> c;
    private a d;
    private boolean e;
    private boolean f;
    private boolean g;
    private TR.i.b h;

    /* loaded from: classes.dex */
    public enum a {
        TRRequestHTTPTypeGET,
        TRRequestHTTPTypePOST
    }

    public g(String str, String str2, TR.i.b bVar) {
        this(str, str2, bVar, true);
    }

    public g(String str, String str2, TR.i.b bVar, boolean z) {
        this.g = false;
        this.h = bVar;
        this.f580a = str;
        this.b = str2;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (z) {
            hashMap.put("timestamp", TR.q.k.a());
        }
        this.d = a.TRRequestHTTPTypePOST;
        this.e = true;
        this.f = true;
        i();
    }

    public Object a(String str) {
        return this.c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(a aVar) {
        this.d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, Object obj) {
        if (this.c.containsKey(str)) {
            return;
        }
        this.c.put(str, obj);
    }

    protected void a(String str, Map<String, Object> map) {
        if (this.c.containsKey(str)) {
            return;
        }
        this.c.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        if (this.c.get("app_session_id") == null) {
            this.c.put("app_session_id", Long.valueOf(TR.d.b.i().e().a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        if (this.c.get("device_player_id") == null) {
            this.c.put("device_player_id", Long.valueOf(TR.d.b.i().l().b()));
        }
    }

    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.f580a;
        if (str == null ? gVar.f580a == null : str.equals(gVar.f580a)) {
            String str2 = this.b;
            String str3 = gVar.b;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        if (this.c.get("triggered_at") == null) {
            this.c.put("triggered_at", TR.q.k.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        String q = TR.d.b.i().q();
        if (q == null || q.isEmpty() || this.c.get("user_identifier") != null) {
            return;
        }
        this.c.put("user_identifier", TR.d.b.i().q());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        if (this.c.get("version") == null) {
            this.c.put("version", "2.5.5");
        }
    }

    public int hashCode() {
        String str = this.f580a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void i() {
        h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
        this.f = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
        this.e = false;
    }

    public TR.i.b l() {
        return this.h;
    }

    public a m() {
        return this.d;
    }

    public String n() {
        return this.f580a;
    }

    public String o() {
        return this.b;
    }

    public Map<String, Object> p() {
        return this.c;
    }

    public boolean q() {
        return this.e;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return this.g;
    }

    public boolean t() {
        return this.f;
    }
}
