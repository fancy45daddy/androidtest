package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.ayetstudios.publishersdk.messages.OfferwallResponse;
/* renamed from: e1  reason: default package */
/* loaded from: classes4.dex */
public class e1 extends WebView implements z {

    /* renamed from: a  reason: collision with root package name */
    private OfferwallResponse f11839a;
    private g1 b;
    private c0 c;

    public e1(Context context, OfferwallResponse offerwallResponse, g1 g1Var) {
        super(context);
        this.f11839a = offerwallResponse;
        this.b = g1Var;
        a();
    }

    private void a() {
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        OfferwallResponse offerwallResponse = this.f11839a;
        if (offerwallResponse != null) {
            a(offerwallResponse);
        }
    }

    public boolean b() {
        if (this.c.e) {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript("handleBackButton();", null);
                return true;
            }
            loadUrl("javascript:handleBackButton();");
            return true;
        }
        return false;
    }

    private void a(OfferwallResponse offerwallResponse) {
        String str;
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        try {
            byte[] decode = Base64.decode(offerwallResponse.getHtml(), 0);
            offerwallResponse.getHtml();
            decode.toString();
            str = new String(decode, "UTF-8");
        } catch (Exception e) {
            e.getMessage();
            str = "";
        }
        this.c = new c0(getContext(), this, this.b);
        getSettings().setJavaScriptEnabled(true);
        addJavascriptInterface(this.c, "JsCommunicator");
        loadData(str, "text/html", "UTF-8");
        setOverScrollMode(2);
    }
}
