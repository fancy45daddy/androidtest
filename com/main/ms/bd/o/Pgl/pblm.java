package ms.bd.o.Pgl;

import ms.bd.o.Pgl.pblb;
import org.json.JSONObject;
/* loaded from: classes10.dex */
public abstract class pblm extends pblb.pgla {

    /* renamed from: a  reason: collision with root package name */
    private static pblm f12088a;

    /* loaded from: classes10.dex */
    public static class pgla {

        /* renamed from: a  reason: collision with root package name */
        private long f12089a;
        private long b;
        private String c;
        private String d;

        public void a(String str) {
            this.c = str;
            this.d = null;
            this.f12089a = System.currentTimeMillis();
        }

        public void a(String str, int i) {
            pblm a2 = pblm.a();
            if (a2 == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f12089a;
            long j2 = currentTimeMillis - j;
            this.b = j2;
            a2.a(j2, j, this.c, this.d, str, i, null);
        }

        public void b(String str, int i) {
            pblm a2 = pblm.a();
            if (a2 == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f12089a;
            long j2 = currentTimeMillis - j;
            this.b = j2;
            a2.b(j2, j, this.c, this.d, str, i, null);
        }
    }

    public static synchronized pblm a() {
        pblm pblmVar;
        synchronized (pblm.class) {
            pblmVar = f12088a;
        }
        return pblmVar;
    }

    public static synchronized void a(pblm pblmVar) {
        synchronized (pblm.class) {
            f12088a = pblmVar;
        }
    }

    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, int i2, long j, String str, Object obj) throws Throwable {
        if (i == 131073) {
            if (str == null || !a(str)) {
                return null;
            }
            return (String) pblk.a(16777217, 0, 0L, "15fb7c", new byte[]{15, 28});
        }
        if (i == 131074) {
            String[] strArr = (String[]) obj;
            if (str != null && strArr != null && strArr.length != 0) {
                a(str, new JSONObject(strArr[0]), new JSONObject(strArr[1]), new JSONObject(strArr[2]));
            }
        }
        return null;
    }

    public abstract void a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject);

    public abstract void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    public abstract boolean a(String str);

    public abstract void b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject);
}
