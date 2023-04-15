package TR.h;

import TR.q.i;
import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a extends b {
    private static final String A = "sdk_version";
    private static final String B = "os_version";
    private static final String C = "orientation";
    private static final String D = "density";
    private static final String E = "connection_type";
    private static final String F = "device_name";
    private static final String G = "carrier";
    private static final String H = "app_id";
    private static final String I = "content";
    private static final String z = "platform";
    private final String q;
    private final String r;
    private final int s;
    private final String t;
    private final String u;
    private final String v;
    private final String w;
    private final String x;
    private final String y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2, Context context) {
        super(str);
        this.q = "android";
        this.r = "2.5.5";
        this.s = Build.VERSION.SDK_INT;
        this.t = TR.q.e.b(context);
        this.u = TR.q.e.a(context);
        this.v = i.b(context);
        this.w = TR.q.e.a();
        this.x = i.a(context);
        this.y = str2;
        f();
    }

    @Override // TR.h.b
    public Map<String, Object> e() {
        HashMap hashMap = new HashMap();
        super.a(hashMap);
        hashMap.put("platform", this.q);
        hashMap.put(A, this.r);
        hashMap.put("os_version", Integer.valueOf(this.s));
        hashMap.put("orientation", this.t);
        hashMap.put(D, this.u);
        hashMap.put("connection_type", this.v);
        hashMap.put("device_name", this.w);
        hashMap.put(G, this.x);
        hashMap.put("app_id", this.y);
        hashMap.put("content", this.c);
        return hashMap;
    }
}
