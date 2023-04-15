package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;
import ch.qos.logback.core.joran.action.ActionConst;
import com.ayetstudios.publishersdk.AyetSdk;
import com.ayetstudios.publishersdk.interfaces.RewardedVideoCallbackHandler;
import com.ayetstudios.publishersdk.messages.RequestOfferData;
import com.inmarket.m2m.data.Constants_BuildGenerated;
import java.util.Objects;
import org.apache.commons.codec.language.bm.Languages;
/* renamed from: c0  reason: default package */
/* loaded from: classes2.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private Context f643a;
    private z b;
    private g1 c;
    private String d = null;
    public boolean e = false;

    /* renamed from: c0$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((Activity) c0.this.f643a).onBackPressed();
        }
    }

    /* renamed from: c0$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RequestOfferData f645a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;

        b(RequestOfferData requestOfferData, int i, String str, int i2) {
            this.f645a = requestOfferData;
            this.b = i;
            this.c = str;
            this.d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            n1 n1Var = new n1();
            Context context = c0.this.f643a;
            String redirectionUrl = this.f645a.getRedirectionUrl();
            WebView webView = (WebView) c0.this.b;
            n1Var.a(context, redirectionUrl, 15000, "", webView, "activate-" + this.b, new a());
        }

        /* renamed from: c0$b$a */
        /* loaded from: classes2.dex */
        class a implements u0 {
            a() {
            }

            @Override // defpackage.u0
            public void a(String str) {
                String str2;
                String str3;
                String redirectionUrl = b.this.f645a.getRedirectionUrl();
                String str4 = b.this.c;
                Objects.toString(str == null ? ActionConst.NULL : Boolean.valueOf(str.matches(b.this.c)));
                if (str == null || !((str3 = b.this.c) == Languages.ANY || str.matches(str3))) {
                    b bVar = b.this;
                    if (bVar.c != "testing") {
                        if (c0.this.c != null) {
                            c0.this.c.stopProgressDialog();
                        }
                        if (c0.this.d == null || c0.this.d.length() <= 0) {
                            return;
                        }
                        Toast.makeText(c0.this.f643a.getApplicationContext(), c0.this.d, 1).show();
                        return;
                    }
                    str2 = redirectionUrl;
                } else {
                    str2 = str;
                }
                b bVar2 = b.this;
                if (bVar2.d == 1) {
                    n1 n1Var = new n1();
                    Context context = c0.this.f643a;
                    b bVar3 = b.this;
                    n1Var.a(context, bVar3.b, str2, "", "", c0.this.d, c0.this.c);
                    return;
                }
                bVar2.f645a.setRedirectionUrl(str2);
                new n1().a(c0.this.f643a, b.this.f645a);
            }
        }
    }

    /* renamed from: c0$c */
    /* loaded from: classes2.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f647a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* renamed from: c0$c$a */
        /* loaded from: classes2.dex */
        class a implements u0 {
            a(c cVar) {
            }

            @Override // defpackage.u0
            public void a(String str) {
            }
        }

        c(String str, String str2, String str3) {
            this.f647a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            new n1().a(c0.this.f643a, this.f647a, 15000, this.b, (WebView) c0.this.b, this.c, new a(this));
        }
    }

    /* renamed from: c0$d */
    /* loaded from: classes2.dex */
    class d implements RewardedVideoCallbackHandler {
        d() {
        }

        @Override // com.ayetstudios.publishersdk.interfaces.RewardedVideoCallbackHandler
        public void aborted() {
        }

        @Override // com.ayetstudios.publishersdk.interfaces.RewardedVideoCallbackHandler
        public void completed(int i) {
        }

        @Override // com.ayetstudios.publishersdk.interfaces.VideoCallback
        public void finished() {
        }

        @Override // com.ayetstudios.publishersdk.interfaces.VideoCallback
        public void nofill() {
            if (c0.this.c != null) {
                c0.this.c.stopProgressDialog();
            }
        }

        @Override // com.ayetstudios.publishersdk.interfaces.VideoCallback
        public void willBeShown() {
            if (c0.this.c != null) {
                c0.this.c.stopProgressDialog();
            }
        }
    }

    /* renamed from: c0$e */
    /* loaded from: classes2.dex */
    class e implements RewardedVideoCallbackHandler {
        e() {
        }

        @Override // com.ayetstudios.publishersdk.interfaces.RewardedVideoCallbackHandler
        public void aborted() {
        }

        @Override // com.ayetstudios.publishersdk.interfaces.RewardedVideoCallbackHandler
        public void completed(int i) {
        }

        @Override // com.ayetstudios.publishersdk.interfaces.VideoCallback
        public void finished() {
        }

        @Override // com.ayetstudios.publishersdk.interfaces.VideoCallback
        public void nofill() {
            if (c0.this.c != null) {
                c0.this.c.stopProgressDialog();
            }
        }

        @Override // com.ayetstudios.publishersdk.interfaces.VideoCallback
        public void willBeShown() {
            if (c0.this.c != null) {
                c0.this.c.stopProgressDialog();
            }
        }
    }

    public c0(Context context, z zVar, g1 g1Var) {
        this.f643a = context;
        this.b = zVar;
        this.c = g1Var;
    }

    @JavascriptInterface
    public void activateOffer(int i, String str, int i2, String str2) {
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.startProgressDialog();
        }
        RequestOfferData requestOfferData = new RequestOfferData(i, str, "", "");
        if (str2 != null && !TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase(Constants_BuildGenerated.SS_API_HOST)) {
            ((Activity) this.f643a).runOnUiThread(new b(requestOfferData, i, str2, i2));
        } else if (i2 == 1) {
            new n1().a(this.f643a, i, str, "", "", this.d, this.c);
        } else {
            new n1().a(this.f643a, requestOfferData);
        }
    }

    @JavascriptInterface
    public void offerReservation(int i, String str, String str2, String str3) {
        Integer.toString(i);
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.startProgressDialog();
        }
        new n1().a(this.f643a, i, str, str2, str3, this.d, this.c);
    }

    @JavascriptInterface
    public void onBackClick() {
        ((Activity) this.f643a).runOnUiThread(new a());
    }

    @JavascriptInterface
    public void requestLinkcheck(String str, String str2, String str3) {
        ((Activity) this.f643a).runOnUiThread(new c(str2, str3, str));
    }

    @JavascriptInterface
    public void setCanGoBack(boolean z) {
        this.e = z;
    }

    @JavascriptInterface
    public void setOfferActivationErrorMessage(String str) {
        this.d = str;
    }

    @JavascriptInterface
    public void startRewardedVideo() {
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.startProgressDialog();
        }
        AyetSdk.showVideoAd(this.f643a, "", 2, new d());
    }

    @JavascriptInterface
    public void startRewardedVideoForAdslot(String str) {
        g1 g1Var = this.c;
        if (g1Var != null) {
            g1Var.startProgressDialog();
        }
        AyetSdk.showVideoAd(this.f643a, str, 2, new e());
    }
}
