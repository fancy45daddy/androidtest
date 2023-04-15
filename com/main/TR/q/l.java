package TR.q;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class l {
    private l() {
    }

    public static String a(String str) {
        return str;
    }

    public static String a(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (true) {
            a(it, sb);
            if (!it.hasNext()) {
                return sb.toString();
            }
            sb.append("&");
        }
    }

    private static void a(Iterator<?> it, StringBuilder sb) {
        Map.Entry entry = (Map.Entry) it.next();
        String obj = entry.getKey().toString();
        sb.append(obj);
        if (obj.indexOf("[") == -1) {
            sb.append("=");
        }
        sb.append(entry.getValue() != null ? entry.getValue().toString() : "");
    }

    public static Map<String, String> b(String str) {
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (String str2 : queryParameterNames) {
            hashMap.put(str2, parse.getQueryParameter(str2));
        }
        return hashMap;
    }
}
