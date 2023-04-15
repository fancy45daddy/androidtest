package ms.bd.o.Pgl;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.InputDeviceCompat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ms.bd.o.Pgl.l0;
import org.json.JSONArray;
/* loaded from: classes10.dex */
public final class k0 implements l0.pgla {

    /* renamed from: a  reason: collision with root package name */
    private final long f12082a;
    private final Context b;
    private final c c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(c cVar, Context context, long j) {
        if (context == null) {
            throw new NullPointerException("context could not be null");
        }
        this.c = cVar;
        this.b = context.getApplicationContext();
        this.f12082a = j;
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public Map<String, String> frameSign(String str, int i) {
        if (this.f12082a != -1) {
            HashMap hashMap = new HashMap();
            if (str == null || str.length() == 0) {
                return Collections.emptyMap();
            }
            String[] strArr = (String[]) pblb.a(33554442, i, this.f12082a, str, null);
            if ((strArr instanceof String[]) && strArr.length % 2 == 0) {
                for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                    String str2 = strArr[i2];
                    String str3 = strArr[i2 + 1];
                    if (str2 != null && str3 != null) {
                        hashMap.put(str2, str3);
                    }
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (str != null && str.length() != 0 && (strArr = (String[]) pblb.a(33554438, 0, this.f12082a, str, bArr)) != null && strArr.length % 2 == 0) {
            for (int i = 0; i < strArr.length; i += 2) {
                String str2 = strArr[i];
                String str3 = strArr[i + 1];
                if (str2 != null && str3 != null) {
                    hashMap.put(str2, str3);
                }
            }
        }
        return hashMap;
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public Map<String, String> getReportRaw(String str, int i, Map<String, String> map) {
        String str2;
        if (this.f12082a != -1) {
            if (map == null || map.size() <= 0) {
                str2 = "";
            } else {
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        jSONArray.put(entry.getKey());
                        jSONArray.put(entry.getValue());
                    }
                }
                str2 = jSONArray.toString();
            }
            Object a2 = pblb.a(33554440, i, this.f12082a, str, str2);
            if (a2 instanceof Object[]) {
                Object[] objArr = (Object[]) a2;
                if (objArr.length >= 2 && objArr[0] != null && objArr[1] != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(objArr[0].toString(), objArr[1].toString());
                    return hashMap;
                }
            }
        }
        return Collections.emptyMap();
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public String getToken() {
        long j = this.f12082a;
        return j != -1 ? (String) pblb.a(33554439, 0, j, null, null) : "";
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void report(String str) {
        if (this.f12082a == -1 || TextUtils.isEmpty(str)) {
            return;
        }
        pblb.a(InputDeviceCompat.SOURCE_HDMI, 0, this.f12082a, str, this.b);
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setBDDeviceID(String str) {
        this.c.d = str;
        long j = this.f12082a;
        if (j != -1) {
            pblb.a(33554437, 0, j, str, this.b);
        }
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setCollectMode(int i) {
        long j = this.f12082a;
        if (j != -1) {
            pblb.a(33554441, i, j, null, null);
        }
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setDeviceID(String str) {
        this.c.c = str;
        long j = this.f12082a;
        if (j != -1) {
            pblb.a(33554434, 0, j, str, this.b);
        }
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setInstallID(String str) {
        this.c.e = str;
        long j = this.f12082a;
        if (j != -1) {
            pblb.a(33554435, 0, j, str, this.b);
        }
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setSessionID(String str) {
        this.c.f = str;
        long j = this.f12082a;
        if (j != -1) {
            pblb.a(33554436, 0, j, str, this.b);
        }
    }
}
