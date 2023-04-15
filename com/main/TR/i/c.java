package TR.i;

import android.os.Build;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
class c {
    private static final String g = "sig";

    /* renamed from: a  reason: collision with root package name */
    private TR.l.g f574a;
    private Map<String, List<String>> b;
    private int c;
    private JSONObject d;
    private boolean e;
    private String f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(TR.l.g gVar, TR.r.a aVar) {
        try {
            this.f574a = gVar;
            String f = aVar.f("utf-8");
            this.f = f;
            this.d = (f == null || f.isEmpty()) ? new JSONObject() : new JSONObject(this.f);
            this.e = aVar.K();
            this.b = aVar.A();
            this.c = aVar.n();
            if (Build.VERSION.SDK_INT > 19 && !g()) {
                throw new e(String.format("Couldn't verify signature for response - %s", this.d.toString()));
            }
        } catch (Exception e) {
            TR.q.h.c(gVar.n() + StringUtils.SPACE + e.getMessage());
            this.e = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean g() {
        String message;
        JSONException jSONException;
        try {
            String string = this.d.has(g) ? this.d.getString(g) : null;
            if (string == null || string.length() <= 0) {
                return true;
            }
            String a2 = TR.q.c.a(TR.d.b.i().d(), TR.q.b.t);
            this.d.remove(g);
            return TR.q.c.a(this.d.toString(), a2).equalsIgnoreCase(string);
        } catch (InvalidKeyException e) {
            message = e.getMessage();
            jSONException = e;
            TR.q.h.a(message, jSONException);
            return true;
        } catch (NoSuchAlgorithmException e2) {
            message = e2.getMessage();
            jSONException = e2;
            TR.q.h.a(message, jSONException);
            return true;
        } catch (JSONException e3) {
            message = e3.getMessage();
            jSONException = e3;
            TR.q.h.a(message, jSONException);
            return true;
        }
    }

    public String a() {
        return this.f;
    }

    public Map<String, List<String>> b() {
        return this.b;
    }

    public TR.l.g c() {
        return this.f574a;
    }

    public JSONObject d() {
        return this.d;
    }

    public int e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }
}
