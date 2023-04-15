package ai.bitlabs.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.browser.customtabs.CustomTabsIntent;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: WebViewExtension.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000426\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¨\u0006\r"}, d2 = {"setup", "", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "onShouldOverrideUrlLoading", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isPageOfferWall", "", "url", "library_coreRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebViewExtensionKt {
    public static final void setup(WebView webView, final Context context, final Function2<? super Boolean, ? super String, Unit> onShouldOverrideUrlLoading) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onShouldOverrideUrlLoading, "onShouldOverrideUrlLoading");
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        } else {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        webView.setLayerType(Build.VERSION.SDK_INT >= 19 ? 2 : 1, null);
        webView.setWebChromeClient(new WebChromeClient() { // from class: ai.bitlabs.sdk.WebViewExtensionKt$setup$1
            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean z, boolean z2, Message resultMsg) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(resultMsg, "resultMsg");
                WebView webView2 = new WebView(view.getContext());
                Object obj = resultMsg.obj;
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
                }
                ((WebView.WebViewTransport) obj).setWebView(webView2);
                resultMsg.sendToTarget();
                final Context context2 = context;
                webView2.setWebViewClient(new WebViewClient() { // from class: ai.bitlabs.sdk.WebViewExtensionKt$setup$1$onCreateWindow$2
                    @Override // android.webkit.WebViewClient
                    @Deprecated(message = "Deprecated in Java")
                    public boolean shouldOverrideUrlLoading(WebView webView3, String str) {
                        String str2 = str;
                        if (str2 == null || str2.length() == 0) {
                            return true;
                        }
                        new CustomTabsIntent.Builder().build().launchUrl(context2, Uri.parse(str));
                        return false;
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView3, WebResourceRequest webResourceRequest) {
                        String uri = webResourceRequest == null ? null : webResourceRequest.getUrl().toString();
                        if (uri == null) {
                            return true;
                        }
                        new CustomTabsIntent.Builder().build().launchUrl(context2, Uri.parse(uri));
                        return false;
                    }
                });
                return true;
            }
        });
        webView.setWebViewClient(new WebViewClient() { // from class: ai.bitlabs.sdk.WebViewExtensionKt$setup$2
            @Override // android.webkit.WebViewClient
            @Deprecated(message = "Deprecated in Java")
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    return false;
                }
                onShouldOverrideUrlLoading.invoke(Boolean.valueOf(StringsKt.contains$default((CharSequence) str2, (CharSequence) "web.bitlabs.ai", false, 2, (Object) null)), str);
                return false;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                String uri = webResourceRequest == null ? null : webResourceRequest.getUrl().toString();
                if (uri == null) {
                    return false;
                }
                onShouldOverrideUrlLoading.invoke(Boolean.valueOf(StringsKt.contains$default((CharSequence) uri, (CharSequence) "web.bitlabs.ai", false, 2, (Object) null)), uri);
                return false;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                CookieManager.getInstance().flush();
            }
        });
        WebSettings settings = webView.getSettings();
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDisplayZoomControls(false);
        settings.setSupportMultipleWindows(true);
        settings.setCacheMode(2);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
    }
}
