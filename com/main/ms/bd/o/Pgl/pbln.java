package ms.bd.o.Pgl;

import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.facebook.stetho.dumpapp.Framer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes10.dex */
public final class pbln extends pblm {
    private SDKMonitor b;

    /* loaded from: classes10.dex */
    class pgla implements SDKMonitor.IGetExtendParams {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f12090a;
        final /* synthetic */ String b;

        pgla(pbln pblnVar, JSONObject jSONObject, String str) {
            this.f12090a = jSONObject;
            this.b = str;
        }

        public Map<String, String> getCommonParams() {
            HashMap hashMap = new HashMap();
            try {
                hashMap.put((String) pblk.a(16777217, 0, 0L, "733bae", new byte[]{41, 39, 69, 4, 77, 119, 53}), (String) (this.f12090a.getBoolean((String) pblk.a(16777217, 0, 0L, "cf939d", new byte[]{125, 114, 79, 85, 21, 118, 97})) ? pblk.a(16777217, 0, 0L, "803313", new byte[]{Framer.EXIT_FRAME_PREFIX}) : pblk.a(16777217, 0, 0L, "b1407d", new byte[]{35})));
            } catch (JSONException unused) {
                String str = (String) pblk.a(16777217, 0, 0L, "41424e", new byte[]{54, 54, 74, 121, 12, 97});
            }
            hashMap.put((String) pblk.a(16777217, 0, 0L, "263efa", new byte[]{43, 59, 83, 5, 102, 119, 56, 19}), this.b);
            return hashMap;
        }

        public String getSessionId() {
            return null;
        }
    }

    @Override // ms.bd.o.Pgl.pblm
    public void a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        SDKMonitor sDKMonitor = this.b;
        if (sDKMonitor == null) {
            return;
        }
        sDKMonitor.monitorApiError(j, j2, str, str2, str3, i, (JSONObject) null);
    }

    @Override // ms.bd.o.Pgl.pblm
    public void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.b == null) {
            return;
        }
        if (jSONObject.length() > 0 || jSONObject2.length() > 0) {
            this.b.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    @Override // ms.bd.o.Pgl.pblm
    public boolean a(String str) {
        JSONObject jSONObject;
        String str2;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        Context b = ms.bd.o.Pgl.pgla.a().b();
        String str4 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            String str5 = (String) pblk.a(16777217, 0, 0L, "b1d526", new byte[]{96, 54, 26});
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            str3 = jSONObject.getString((String) pblk.a(16777217, 0, 0L, "3f2e27", new byte[]{Framer.STDOUT_FRAME_PREFIX, 96, 74, 46, 12, 41, 52}));
            try {
                str4 = jSONObject.getString((String) pblk.a(16777217, 0, 0L, "a19598", new byte[]{Framer.EXIT_FRAME_PREFIX, 60, 89, 85, 57, 46, 107, 20}));
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray((String) pblk.a(16777217, 0, 0L, "46cfcc", new byte[]{38, 59, 30, 20, 85, 115, 2, 37, 30, 37}));
                JSONArray jSONArray2 = jSONObject.getJSONArray((String) pblk.a(16777217, 0, 0L, "460ac7", new byte[]{55, Framer.STDOUT_FRAME_PREFIX, 83, 26, 78, 52, 2, 37, 77, 34}));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(jSONArray2.getString(i2));
                }
            } catch (JSONException unused2) {
                str2 = str4;
                str4 = str3;
                String str6 = (String) pblk.a(16777217, 0, 0L, "fb349b", new byte[]{100, 101, 77, Byte.MAX_VALUE, 15});
                str3 = str4;
                str4 = str2;
                jSONObject.remove((String) pblk.a(16777217, 0, 0L, "15de5d", new byte[]{35, 56, 25, 23, 3, 116, 7, 38, 25, 38}));
                jSONObject.remove((String) pblk.a(16777217, 0, 0L, "961db1", new byte[]{58, Framer.STDOUT_FRAME_PREFIX, 82, 31, 79, Framer.STDERR_FRAME_PREFIX, 15, 37, 76, 39}));
                SDKMonitorUtils.initMonitor(b, str3, jSONObject, new pgla(this, jSONObject, str4));
                this.b = SDKMonitorUtils.getInstance(str3);
                return true;
            }
        } catch (JSONException unused3) {
            str2 = null;
        }
        if (arrayList.size() <= 0 || arrayList2.size() <= 0) {
            return false;
        }
        SDKMonitorUtils.setConfigUrl(str3, arrayList);
        SDKMonitorUtils.setDefaultReportUrl(str3, arrayList2);
        jSONObject.remove((String) pblk.a(16777217, 0, 0L, "15de5d", new byte[]{35, 56, 25, 23, 3, 116, 7, 38, 25, 38}));
        jSONObject.remove((String) pblk.a(16777217, 0, 0L, "961db1", new byte[]{58, Framer.STDOUT_FRAME_PREFIX, 82, 31, 79, Framer.STDERR_FRAME_PREFIX, 15, 37, 76, 39}));
        SDKMonitorUtils.initMonitor(b, str3, jSONObject, new pgla(this, jSONObject, str4));
        this.b = SDKMonitorUtils.getInstance(str3);
        return true;
    }

    @Override // ms.bd.o.Pgl.pblm
    public void b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        SDKMonitor sDKMonitor = this.b;
        if (sDKMonitor == null) {
            return;
        }
        sDKMonitor.monitorSLA(j, j2, str, str2, str3, i, (JSONObject) null);
    }
}
