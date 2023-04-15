package TR.f;

import TR.d.b;
import TR.q.h;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {
    @JavascriptInterface
    public void onRewardReceived(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            b.i().a(new TR.k.a().a(new JSONObject(str)));
        } catch (JSONException e) {
            h.a("onRewardReceived web callback: ", e);
        }
    }
}
