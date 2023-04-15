package TR.h;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class f extends b {
    private static final String u = "player_supplier_identifier";
    private static final String v = "device_identifier";
    private static final String w = "device_log_level";
    private static final String x = "message_log_level";
    private String q;
    private String r;
    private int s;
    private int t;

    public f(String str, String str2, String str3, int i, int i2) {
        super(str);
        this.q = str2;
        this.r = str3;
        this.s = i;
        this.t = i2;
    }

    @Override // TR.h.b
    public Map<String, Object> e() {
        HashMap hashMap = new HashMap();
        super.a(hashMap);
        hashMap.put(u, this.q);
        hashMap.put(v, this.r);
        hashMap.put(w, Integer.valueOf(this.s));
        hashMap.put(x, Integer.valueOf(this.t));
        return hashMap;
    }
}
