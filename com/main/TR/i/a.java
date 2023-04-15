package TR.i;

import TR.l.g;
import TR.q.i;
import android.content.Context;
import android.os.Build;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.tapjoy.TapjoyConstants;
import com.tapr.helpers.JsonHelper;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class a {
    protected static final String c = b();
    private static Map<String, String> d;

    /* renamed from: a  reason: collision with root package name */
    protected boolean f573a;
    protected Context b;

    public a() {
        Map<String, String> map;
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("Accept", String.format("application/json;version=%s", "3"));
        d.put("Accept-Language", Locale.getDefault().getLanguage());
        d.put("API-Token", TR.d.b.i().d());
        d.put(JsonDocumentFields.VERSION, "2.5.5");
        d.put("Platform", "android");
        d.put("Dev-Platform", TR.d.b.i().g());
        d.put("Dev-Version", TR.d.b.i().h());
        d.put("Standard-Request", "true");
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            map = d;
            sb = new StringBuilder();
            str = Build.VERSION.BASE_OS;
        } else {
            map = d;
            sb = new StringBuilder();
            str = "Android ";
        }
        sb.append(str);
        sb.append(i);
        map.put("os_version", sb.toString());
        d.put(TapjoyConstants.TJC_DEVICE_NAME, TR.q.e.a());
        d.put("display_dimensions", TR.q.e.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r6.c().o().equals(TR.q.b.j) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(TR.i.c r6) {
        /*
            r5 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            TR.l.g r1 = r6.c()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r6.e()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            r5.c(r0)
            org.json.JSONObject r0 = r6.d()     // Catch: org.json.JSONException -> L3c
            if (r0 == 0) goto L36
            org.json.JSONObject r0 = r6.d()     // Catch: org.json.JSONException -> L3c
            java.lang.String r1 = "error"
            java.lang.String r0 = r0.getString(r1)     // Catch: org.json.JSONException -> L3c
            goto L38
        L36:
            java.lang.String r0 = "Response object is empty"
        L38:
            r5.c(r0)     // Catch: org.json.JSONException -> L3c
            goto L40
        L3c:
            r0 = move-exception
            r0.printStackTrace()
        L40:
            TR.l.g r0 = r6.c()
            java.lang.String r0 = r0.o()
            java.lang.String r1 = "versions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L57
            java.lang.String r0 = "Version call was unsuccessful. All subsequent calls will be put on hold."
            r5.d(r0)
            goto L8e
        L57:
            int r0 = r6.e()
            r1 = 401(0x191, float:5.62E-43)
            if (r0 != r1) goto L68
            java.lang.String r0 = "Unauthorized. Please ensure you are setting a valid API token."
            r5.b(r0)
        L64:
            r5.a()
            goto L8e
        L68:
            int r0 = r6.e()
            r1 = 404(0x194, float:5.66E-43)
            if (r0 != r1) goto L7d
            java.lang.String r0 = "Route not found."
            r5.a(r0)
        L75:
            TR.l.g r0 = r6.c()
            r5.c(r0)
            goto L8e
        L7d:
            TR.l.g r0 = r6.c()
            java.lang.String r0 = r0.o()
            java.lang.String r1 = "device_players"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            goto L64
        L8e:
            TR.l.g r0 = r6.c()
            TR.i.b r0 = r0.l()
            if (r0 == 0) goto Lac
            TR.l.g r0 = r6.c()
            TR.i.b r0 = r0.l()
            TR.l.g r1 = r6.c()
            TR.i.h r2 = new TR.i.h
            r2.<init>(r6)
            r0.a(r1, r2)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: TR.i.a.a(TR.i.c):void");
    }

    private void a(c cVar, TR.l.g gVar, JSONObject jSONObject) {
        cVar.c().l().a(gVar, jSONObject);
    }

    private void a(String str) {
        if (this instanceof d) {
            return;
        }
        TR.q.h.a(str);
    }

    private void a(String str, Throwable th) {
        if (this instanceof d) {
            return;
        }
        TR.q.h.a(str, th);
    }

    private static String b() {
        return String.format("%s://%s/%s/", "https", TR.q.b.f609a, TR.q.b.c);
    }

    private void b(c cVar) {
        List<String> list;
        if (cVar.b() != null && (list = cVar.b().get(TR.q.b.u)) != null && list.size() != 0) {
            this.f573a = Boolean.parseBoolean(list.get(0));
        }
        if (!cVar.f()) {
            a(cVar);
            return;
        }
        if (cVar.c().t()) {
            a(cVar.c().n() + " Success! Status Code: " + cVar.e());
        }
        if (cVar.c().l() != null) {
            a(cVar, cVar.c(), cVar.d());
        }
        if (cVar.c().q()) {
            c(cVar.c());
        }
    }

    private void b(String str) {
        if (this instanceof d) {
            return;
        }
        TR.q.h.c(str);
    }

    private void c(String str) {
        if (this instanceof d) {
            return;
        }
        TR.q.h.f(str);
    }

    private void d(String str) {
        if (this instanceof d) {
            return;
        }
        TR.q.h.i(str);
    }

    private String e(String str) throws UnsupportedEncodingException {
        return Build.VERSION.SDK_INT >= 19 ? URLEncoder.encode(str, StandardCharsets.UTF_8.displayName()) : URLEncoder.encode(str);
    }

    protected abstract void a();

    public abstract void b(TR.l.g gVar);

    protected abstract void c();

    protected abstract void c(TR.l.g gVar);

    protected abstract int d();

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(TR.l.g gVar) {
        TR.r.a d2;
        d.put("density", TR.q.e.a(this.b));
        try {
            d.put("carrier", e(i.a(this.b)));
        } catch (UnsupportedEncodingException e) {
            TR.q.h.c(e.getMessage());
        }
        d.put("orientation", TR.q.e.b(this.b));
        d.put(TapjoyConstants.TJC_CONNECTION_TYPE, i.b(this.b));
        try {
            a("Making request " + gVar.n());
            String str = c + gVar.o();
            gVar.e();
            Map<String, Object> p = gVar.p();
            if (gVar.m() == g.a.TRRequestHTTPTypeGET) {
                d2 = TR.r.a.b((CharSequence) str, (Map<?, ?>) p, true);
                d.put("Content-Type", "application/json");
                d2.b(d);
            } else {
                d2 = TR.r.a.d((CharSequence) str, true, new Object[0]);
                d.put("Content-Type", "application/json");
                d2.b(d);
                String obj = JsonHelper.toJSON(p).toString();
                a(String.format("Posting payload - %s", obj));
                d2.h((CharSequence) obj);
            }
            d2.c(d());
            d2.g(d());
            d2.R();
            d2.a(true);
            b(new c(gVar, d2));
        } catch (e e2) {
            a(e2.getMessage(), e2);
            c(gVar);
        } catch (Exception e3) {
            e3.printStackTrace();
            c();
            this.f573a = true;
        }
    }
}
