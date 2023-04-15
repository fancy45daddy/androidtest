package defpackage;

import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.ui.JavascriptBridge;
import java.net.URISyntaxException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.pubnative.lite.sdk.analytics.Reporting;
/* compiled from: AdaWebViewClient.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0017\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0018\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"LAdaWebViewClient;", "Landroid/webkit/WebViewClient;", "webViewLoadingErrorCallback", "Lkotlin/Function0;", "", "timeoutMillis", "", "(Lkotlin/jvm/functions/Function0;I)V", "hasError", "", "hasLoaded", "getTimeoutMillis", "()I", "getWebViewLoadingErrorCallback", "()Lkotlin/jvm/functions/Function0;", "setWebViewLoadingErrorCallback", "(Lkotlin/jvm/functions/Function0;)V", "handleLinks", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/webkit/WebView;", "url", "", "isFileUrl", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", Reporting.EventType.REQUEST, "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "shouldOverrideUrlLoading", "Companion", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
/* renamed from: AdaWebViewClient  reason: default package */
/* loaded from: classes2.dex */
public final class AdaWebViewClient extends WebViewClient {
    private static final String ADA_INTERFACE_NAME = "AdaAndroid";
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_LOAD_TIMEOUT = 30000;
    private static final String EMBED_URL = "file:///android_asset/embed.html";
    public static final String FALLBACK_URL = "browser_fallback_url";
    public static final String INTENT = "intent://";
    public static final String MARKET_PREFIX = "market://details?id=%s";
    private boolean hasError;
    private boolean hasLoaded;
    private final int timeoutMillis;
    private Function0<Unit> webViewLoadingErrorCallback;

    public AdaWebViewClient() {
        this(null, 0, 3, null);
    }

    public /* synthetic */ AdaWebViewClient(Function0<Unit> function0, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Companion.defaultErrorCallback() : function0, (i2 & 2) != 0 ? 30000 : i);
    }

    public final Function0<Unit> getWebViewLoadingErrorCallback() {
        return this.webViewLoadingErrorCallback;
    }

    public final void setWebViewLoadingErrorCallback(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "<set-?>");
        this.webViewLoadingErrorCallback = function0;
    }

    public final int getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public AdaWebViewClient(Function0<Unit> webViewLoadingErrorCallback, int i) {
        Intrinsics.checkParameterIsNotNull(webViewLoadingErrorCallback, "webViewLoadingErrorCallback");
        this.webViewLoadingErrorCallback = webViewLoadingErrorCallback;
        this.timeoutMillis = i;
    }

    /* compiled from: AdaWebViewClient.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"LAdaWebViewClient$Companion;", "", "()V", "ADA_INTERFACE_NAME", "", "DEFAULT_LOAD_TIMEOUT", "", "EMBED_URL", "FALLBACK_URL", "INTENT", "MARKET_PREFIX", "defaultErrorCallback", "Lkotlin/Function0;", "", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: AdaWebViewClient$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function0<Unit> defaultErrorCallback() {
            return AdaWebViewClient$Companion$defaultErrorCallback$1.INSTANCE;
        }
    }

    private final boolean isFileUrl(String str) {
        return StringsKt.contains$default((CharSequence) str, (CharSequence) Advertisement.FILE_SCHEME, false, 2, (Object) null) && str != EMBED_URL;
    }

    private final void handleLinks(WebView webView, String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            Intrinsics.checkExpressionValueIsNotNull(parseUri, "Intent.parseUri(url, Intent.URI_INTENT_SCHEME)");
            if (parseUri == null) {
                return;
            }
            Context context = webView.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            if (context.getPackageManager().resolveActivity(parseUri, 65536) != null) {
                try {
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    ComponentName componentName = null;
                    parseUri.setComponent(null);
                    Intent intent = null;
                    parseUri.setSelector(null);
                    webView.getContext().startActivity(parseUri);
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(webView.getContext(), "A problem occurred and " + str + " could not be opened.", 1);
                }
            } else if (StringsKt.startsWith$default(str, INTENT, false, 2, (Object) null)) {
                String stringExtra = parseUri.getStringExtra(FALLBACK_URL);
                if (stringExtra != null) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
                    intent2.addCategory("android.intent.category.BROWSABLE");
                    intent2.setComponent(null);
                    intent2.setSelector(null);
                    webView.getContext().startActivity(intent2);
                } else if (parseUri.getPackage() != null) {
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    String format = String.format(MARKET_PREFIX, Arrays.copyOf(new Object[]{parseUri.getPackage()}, 1));
                    Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
                    Intent data = intent3.setData(Uri.parse(format));
                    Intrinsics.checkExpressionValueIsNotNull(data, "Intent(Intent.ACTION_VIE…age()))\n                )");
                    Context context2 = webView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "view.context");
                    if (data.resolveActivity(context2.getPackageManager()) != null) {
                        data.addCategory("android.intent.category.BROWSABLE");
                        data.setComponent(null);
                        data.setSelector(null);
                        webView.getContext().startActivity(data);
                    }
                }
            }
        } catch (URISyntaxException unused2) {
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkParameterIsNotNull(request, "request");
        Intrinsics.checkParameterIsNotNull(error, "error");
        if (Build.VERSION.SDK_INT >= 23) {
            Log.e("AdaWebView Error", error.getDescription().toString() + " Request URL:" + request.getUrl().toString());
        }
        this.hasError = true;
        this.webViewLoadingErrorCallback.invoke();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(final WebView webView, String str, Bitmap bitmap) {
        this.hasLoaded = false;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: AdaWebViewClient$onPageStarted$checkIfPageLoaded$1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                boolean z2;
                z = AdaWebViewClient.this.hasLoaded;
                if (z) {
                    return;
                }
                z2 = AdaWebViewClient.this.hasError;
                if (z2) {
                    return;
                }
                WebView webView2 = webView;
                if (webView2 == null || webView2.getProgress() != 100) {
                    WebView webView3 = webView;
                    if (webView3 != null) {
                        webView3.stopLoading();
                    }
                    AdaWebViewClient.this.getWebViewLoadingErrorCallback().invoke();
                }
            }
        }, this.timeoutMillis);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.hasLoaded = true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(request, "request");
        if (Build.VERSION.SDK_INT >= 21) {
            Uri requestUri = request.getUrl();
            Intrinsics.checkExpressionValueIsNotNull(requestUri, "requestUri");
            if (Intrinsics.areEqual(requestUri.getScheme(), ProxyConfig.MATCH_HTTP)) {
                view.removeJavascriptInterface(ADA_INTERFACE_NAME);
            }
        }
        return super.shouldInterceptRequest(view, request);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(url, "url");
        if (Build.VERSION.SDK_INT < 21) {
            if (StringsKt.contains$default((CharSequence) url, (CharSequence) ProxyConfig.MATCH_HTTP, false, 2, (Object) null)) {
                view.removeJavascriptInterface(ADA_INTERFACE_NAME);
            }
            return super.shouldInterceptRequest(view, url);
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(url, "url");
        String str = url;
        if (StringsKt.contains((CharSequence) str, (CharSequence) ".pdf", true) || StringsKt.contains((CharSequence) str, (CharSequence) ".txt", true)) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
            request.setNotificationVisibility(1);
            String substring = url.substring(StringsKt.lastIndexOf$default((CharSequence) str, "name=", 0, false, 6, (Object) null) + 5);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, substring);
            Object systemService = view.getContext().getSystemService(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION);
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.DownloadManager");
            }
            ((DownloadManager) systemService).enqueue(request);
            Toast.makeText(view.getContext(), "Downloading File", 1).show();
            return true;
        } else if (isFileUrl(url)) {
            return true;
        } else {
            handleLinks(view, url);
            return true;
        }
    }
}
