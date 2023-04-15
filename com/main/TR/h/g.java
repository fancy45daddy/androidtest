package TR.h;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class g extends a {
    private static final String Q = "source_url";
    private static final String R = "failing_destination_url";
    private static final String S = "campaign_starting_url";
    private static final String T = "cp_identifier";
    private static final String U = "web_error_full_detail";
    private static final String V = "has_cp_identifier";
    private static final String W = "error";
    private static final String X = "error_code";
    private static final String Y = "is_server_to_server";
    private static final String Z = "player_supplier_identifier";
    private static final String a0 = "device_identifier";
    private final String J;
    private final String K;
    private final String L;
    private final String M;
    private final String N;
    private final boolean O;
    private final int P;

    public g(Context context, String str, String str2, String str3, String str4, String str5, int i) {
        this(b.o, context, str, str2, str3, str4, str5, i);
    }

    g(String str, Context context, String str2, String str3, String str4, String str5, String str6, int i) {
        super(str, TR.d.b.i().d(), context);
        this.J = str2;
        this.K = str4;
        this.L = str3;
        this.M = str5;
        this.P = i;
        this.N = str6;
        this.O = TR.d.b.i().l().d();
    }

    private Map<String, Object> g() {
        HashMap hashMap = new HashMap();
        hashMap.put(Q, this.J);
        hashMap.put(S, this.L);
        hashMap.put(R, this.K);
        hashMap.put(T, this.M);
        hashMap.put("error_code", Integer.valueOf(this.P));
        String str = this.M;
        hashMap.put(V, Boolean.valueOf((str == null || str.isEmpty()) ? false : true));
        hashMap.put("error", this.N);
        return hashMap;
    }

    @Override // TR.h.a, TR.h.b
    public Map<String, Object> e() {
        HashMap hashMap = new HashMap(super.e());
        hashMap.put(Q, this.J);
        hashMap.put(R, this.K);
        hashMap.put(Y, Boolean.valueOf(this.O));
        hashMap.put("error_code", Integer.valueOf(this.P));
        hashMap.put(T, this.M);
        hashMap.put(Z, TR.d.b.i().q());
        hashMap.put(a0, TR.d.b.i().c());
        hashMap.put(U, g());
        return hashMap;
    }
}
