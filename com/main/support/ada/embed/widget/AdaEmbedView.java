package support.ada.embed.widget;

import android.app.DownloadManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.adswizz.obfuscated.e.i;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.smaato.sdk.video.vast.model.JavaScriptResource;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.warren.ui.JavascriptBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import org.parceler.InjectionUtil;
import support.ada.embed.R;
import support.ada.embed.actions.Action;
import support.ada.embed.actions.DeleteHistoryAction;
import support.ada.embed.actions.ResetAction;
import support.ada.embed.actions.SetDeviceTokenAction;
import support.ada.embed.actions.SetMetafieldsAction;
import support.ada.embed.actions.SetSensitiveMetafieldsAction;
import support.ada.embed.common.UtilsKt;
import support.ada.embed.widget.AdaEmbedView;
/* compiled from: AdaEmbedView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \\2\u00020\u0001:\u0005[\\]^_B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J5\u00108\u001a\u00020\u00172\b\b\u0002\u00109\u001a\u00020\t2!\u0010:\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012H\u0007J\r\u0010;\u001a\u00020\u0017H\u0000¢\u0006\u0002\b<J\u0006\u0010=\u001a\u00020\u0017J\u0016\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\tJ\u0010\u0010A\u001a\u00020\u00172\u0006\u0010B\u001a\u00020\nH\u0002J\b\u0010C\u001a\u00020\u0017H\u0002J\u000e\u0010D\u001a\u00020\u00172\u0006\u0010E\u001a\u00020FJ\r\u0010G\u001a\u00020\u0017H\u0000¢\u0006\u0002\bHJ\b\u0010I\u001a\u00020\u0017H\u0014J)\u0010J\u001a\u00020\u00172!\u0010K\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012J\u0012\u0010L\u001a\u00020\u00172\b\b\u0002\u00109\u001a\u00020\tH\u0007Ja\u0010M\u001a\u00020\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010+2\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010+2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0002\u0010OJG\u0010M\u001a\u00020\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010P2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010P2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010QJ\u0010\u0010R\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u001cH\u0002J\u000e\u0010T\u001a\u00020\u00172\u0006\u0010U\u001a\u00020\tJ\u001c\u0010V\u001a\u00020\u00172\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0+H\u0007J\u000e\u0010V\u001a\u00020\u00172\u0006\u0010W\u001a\u00020PJ\u001c\u0010X\u001a\u00020\u00172\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0+H\u0007J\u000e\u0010X\u001a\u00020\u00172\u0006\u0010W\u001a\u00020PJ\b\u0010Y\u001a\u00020\u0017H\u0002J\b\u0010Z\u001a\u00020\u001cH\u0002R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R·\u0001\u0010\u000f\u001aª\u0001\u0012\u0004\u0012\u00020\t\u0012J\u0012H\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u00120\u0011j#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012`\u00180\u0010jT\u0012\u0004\u0012\u00020\t\u0012J\u0012H\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u00120\u0011j#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0012`\u0018`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020,0+X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020,0+X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00102\"\u0004\b7\u00104¨\u0006`"}, d2 = {"Lsupport/ada/embed/widget/AdaEmbedView;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionQueue", "Ljava/util/LinkedHashMap;", "", "Lsupport/ada/embed/actions/Action;", "Lkotlin/collections/LinkedHashMap;", "adaInterface", "Lsupport/ada/embed/widget/AdaEmbedView$AdaInterface;", "cluster", "eventCallbacks", "Ljava/util/HashMap;", "Ljava/util/HashSet;", "Lkotlin/Function1;", "Lsupport/ada/embed/widget/Event;", "Lkotlin/ParameterName;", "name", "event", "", "Lkotlin/collections/HashSet;", "Lkotlin/collections/HashMap;", "filePickerCallback", "Lsupport/ada/embed/widget/AdaEmbedView$FilePickerCallback;", "", "getFilePickerCallback", "()Lkotlin/jvm/functions/Function1;", "setFilePickerCallback", "(Lkotlin/jvm/functions/Function1;)V", "greetings", "handle", "isAdaReady", "isInitialized", i.ATTRIBUTE_CLOSED_CAPTION_FILE_LANGUAGE, "loadTimeoutMillis", "", "mainHandler", "Landroid/os/Handler;", "metaFields", "", "", "sensitiveMetaFields", "styles", "webViewLoadingErrorCallback", "Lkotlin/Function0;", "getWebViewLoadingErrorCallback", "()Lkotlin/jvm/functions/Function0;", "setWebViewLoadingErrorCallback", "(Lkotlin/jvm/functions/Function0;)V", "zdChatterAuthCallback", "getZdChatterAuthCallback", "setZdChatterAuthCallback", "addEventCallback", "eventName", "callback", "chatFrameTimeout", "chatFrameTimeout$ada_embed_release", "deleteHistory", "downloadTranscript", "fileName", "data", "enqueueAction", "action", "executePendingActions", MobileAdsBridgeBase.initializeMethodName, "settings", "Lsupport/ada/embed/widget/AdaEmbedView$Settings;", "initializeEmbed", "initializeEmbed$ada_embed_release", "onAttachedToWindow", "removeEventCallback", "eventCallback", "removeEventCallbacks", "reset", "resetChatHistory", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)V", "Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$Builder;", "(Ljava/lang/String;Ljava/lang/String;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$Builder;Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$Builder;Ljava/lang/Boolean;)V", "setAcceptThirdPartyCookies", "accept", "setDeviceToken", "token", "setMetaFields", "metaFieldsBuilder", "setSensitiveMetaFields", "setupWebView", "shouldDisableFileAccess", "AdaInterface", "Companion", "FilePickerCallback", "MetaFields", "Settings", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes11.dex */
public final class AdaEmbedView extends WebView {
    private static final String ADA_DOWNLOAD_TRANSCRIPT_EVENT = "adaDownloadTranscript";
    private static final String ADA_INTERFACE_NAME = "AdaAndroid";
    public static final Companion Companion = new Companion(null);
    private static final String EMBED_URL = "file:///android_asset/embed.html";
    private static final int EMPTY_RES_ID = -1;
    public static final String EVENT_NAME_ALL = "*";
    private static final String INITIALIZE_EMBED_METHOD = "initializeEmbed('%s', '%s', '%s', '%s', '%s', %s, %s)";
    private HashMap _$_findViewCache;
    private final LinkedHashMap<String, Action> actionQueue;
    private final AdaInterface adaInterface;
    private String cluster;
    private final HashMap<String, HashSet<Function1<Event, Unit>>> eventCallbacks;
    private Function1<? super FilePickerCallback, Boolean> filePickerCallback;
    private String greetings;
    private String handle;
    private boolean isAdaReady;
    private boolean isInitialized;
    private String language;
    private int loadTimeoutMillis;
    private final Handler mainHandler;
    private Map<String, ? extends Object> metaFields;
    private Map<String, ? extends Object> sensitiveMetaFields;
    private String styles;
    private Function0<Unit> webViewLoadingErrorCallback;
    private Function0<String> zdChatterAuthCallback;

    public AdaEmbedView(Context context) {
        this(context, null, 2, null);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public final void addEventCallback(Function1<? super Event, Unit> function1) {
        addEventCallback$default(this, null, function1, 1, null);
    }

    public final void removeEventCallbacks() {
        removeEventCallbacks$default(this, null, 1, null);
    }

    public /* synthetic */ AdaEmbedView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaEmbedView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Map<String, ? extends Object> emptyMap;
        Map<String, ? extends Object> emptyMap2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.actionQueue = new LinkedHashMap<>();
        AdaInterface adaInterface = new AdaInterface();
        this.adaInterface = adaInterface;
        this.eventCallbacks = new HashMap<>();
        this.loadTimeoutMillis = 30000;
        if (attributeSet != null) {
            TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AdaEmbedView, 0, 0);
            try {
                Intrinsics.checkExpressionValueIsNotNull(typedArray, "typedArray");
                this.handle = UtilsKt.getStringOrEmpty(typedArray, R.styleable.AdaEmbedView_ada_handle);
                this.cluster = UtilsKt.getStringOrEmpty(typedArray, R.styleable.AdaEmbedView_ada_cluster);
                this.greetings = UtilsKt.getStringOrEmpty(typedArray, R.styleable.AdaEmbedView_ada_greetings);
                this.styles = UtilsKt.getStringOrEmpty(typedArray, R.styleable.AdaEmbedView_ada_styles);
                this.language = UtilsKt.getStringOrEmpty(typedArray, R.styleable.AdaEmbedView_ada_language);
                this.loadTimeoutMillis = typedArray.getInteger(R.styleable.AdaEmbedView_ada_load_timeout, 30000);
                int resourceId = typedArray.getResourceId(R.styleable.AdaEmbedView_ada_metaFields, -1);
                if (resourceId != -1) {
                    InputStream openRawResource = context.getResources().openRawResource(resourceId);
                    Intrinsics.checkExpressionValueIsNotNull(openRawResource, "context.resources.openRawResource(metaFieldsResId)");
                    emptyMap = UtilsKt.createMetaFields(openRawResource);
                } else {
                    emptyMap = MapsKt.emptyMap();
                }
                this.metaFields = emptyMap;
                int resourceId2 = typedArray.getResourceId(R.styleable.AdaEmbedView_ada_sensitiveMetaFields, -1);
                if (resourceId2 != -1) {
                    InputStream openRawResource2 = context.getResources().openRawResource(resourceId2);
                    Intrinsics.checkExpressionValueIsNotNull(openRawResource2, "context.resources.openRa…sensitiveMetaFieldsResId)");
                    emptyMap2 = UtilsKt.createMetaFields(openRawResource2);
                } else {
                    emptyMap2 = MapsKt.emptyMap();
                }
                this.sensitiveMetaFields = emptyMap2;
                setAcceptThirdPartyCookies(typedArray.getBoolean(R.styleable.AdaEmbedView_ada_accept_third_party_cookies, false));
                String string = typedArray.getString(R.styleable.AdaEmbedView_ada_device_token);
                if (string != null) {
                    Intrinsics.checkExpressionValueIsNotNull(string, "this");
                    setDeviceToken(string);
                }
                typedArray.recycle();
                String str = this.handle;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("handle");
                }
                this.isInitialized = str.length() > 0;
            } catch (Throwable th) {
                typedArray.recycle();
                throw th;
            }
        }
        boolean shouldDisableFileAccess = shouldDisableFileAccess();
        if (shouldDisableFileAccess) {
            WebSettings settings = getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings, "settings");
            settings.setAllowUniversalAccessFromFileURLs(true);
        } else if (!shouldDisableFileAccess) {
            WebSettings settings2 = getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings2, "settings");
            settings2.setAllowFileAccessFromFileURLs(false);
            WebSettings settings3 = getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings3, "settings");
            settings3.setAllowUniversalAccessFromFileURLs(false);
        }
        WebSettings settings4 = getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings4, "settings");
        settings4.setJavaScriptEnabled(true);
        WebSettings settings5 = getSettings();
        Intrinsics.checkExpressionValueIsNotNull(settings5, "settings");
        settings5.setDomStorageEnabled(true);
        setDownloadListener(new DownloadListener() { // from class: support.ada.embed.widget.AdaEmbedView.2
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str2));
                request.addRequestHeader("User-Agent", str3);
                request.setDescription("Downloading requested file....");
                request.setMimeType(str5);
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(str2, str4, str5));
                request.setTitle(URLUtil.guessFileName(str2, str4, str5));
                request.setAllowedOverMetered(true);
                request.setAllowedOverRoaming(false);
                if (Build.VERSION.SDK_INT >= 24) {
                    request.setRequiresCharging(false);
                    request.setRequiresDeviceIdle(false);
                }
                request.setVisibleInDownloadsUi(true);
                Object systemService = context.getSystemService(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION);
                if (systemService == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.DownloadManager");
                }
                ((DownloadManager) systemService).enqueue(request);
            }
        });
        addJavascriptInterface(adaInterface, ADA_INTERFACE_NAME);
        setupWebView();
    }

    /* compiled from: AdaEmbedView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$Companion;", "", "()V", "ADA_DOWNLOAD_TRANSCRIPT_EVENT", "", "ADA_INTERFACE_NAME", "EMBED_URL", "EMPTY_RES_ID", "", "EVENT_NAME_ALL", "INITIALIZE_EMBED_METHOD", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Function1<FilePickerCallback, Boolean> getFilePickerCallback() {
        return this.filePickerCallback;
    }

    public final void setFilePickerCallback(Function1<? super FilePickerCallback, Boolean> function1) {
        this.filePickerCallback = function1;
    }

    public final Function0<String> getZdChatterAuthCallback() {
        return this.zdChatterAuthCallback;
    }

    public final void setZdChatterAuthCallback(Function0<String> function0) {
        this.zdChatterAuthCallback = function0;
    }

    public final Function0<Unit> getWebViewLoadingErrorCallback() {
        return this.webViewLoadingErrorCallback;
    }

    public final void setWebViewLoadingErrorCallback(Function0<Unit> function0) {
        this.webViewLoadingErrorCallback = function0;
    }

    private final boolean shouldDisableFileAccess() {
        return Build.VERSION.SDK_INT >= 15;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.isInitialized || this.isAdaReady) {
            return;
        }
        loadUrl(EMBED_URL);
    }

    public final void initializeEmbed$ada_embed_release() {
        Object[] objArr = new Object[7];
        String str = this.handle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("handle");
        }
        objArr[0] = str;
        String str2 = this.cluster;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cluster");
        }
        objArr[1] = str2;
        String str3 = this.greetings;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("greetings");
        }
        objArr[2] = str3;
        String str4 = this.styles;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("styles");
        }
        objArr[3] = str4;
        String str5 = this.language;
        if (str5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(i.ATTRIBUTE_CLOSED_CAPTION_FILE_LANGUAGE);
        }
        objArr[4] = str5;
        Map<String, ? extends Object> map = this.metaFields;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metaFields");
        }
        objArr[5] = UtilsKt.mapToJson(map);
        Map<String, ? extends Object> map2 = this.sensitiveMetaFields;
        if (map2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sensitiveMetaFields");
        }
        objArr[6] = UtilsKt.mapToJson(map2);
        String format = String.format(INITIALIZE_EMBED_METHOD, Arrays.copyOf(objArr, 7));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        evaluateJavascript(format, null);
    }

    public final void chatFrameTimeout$ada_embed_release() {
        Function0<Unit> function0 = this.webViewLoadingErrorCallback;
        if (function0 == null) {
            function0 = AdaWebViewClient.Companion.defaultErrorCallback();
        }
        function0.invoke();
    }

    private final void setupWebView() {
        Function0<Unit> function0 = this.webViewLoadingErrorCallback;
        if (function0 == null) {
            function0 = AdaWebViewClient.Companion.defaultErrorCallback();
        }
        setWebViewClient(new AdaWebViewClient(function0, this.loadTimeoutMillis));
        setWebChromeClient(new WebChromeClient() { // from class: support.ada.embed.widget.AdaEmbedView$setupWebView$1
            private View mCustomView;
            private int mOriginalSystemUiVisibility;

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                Boolean invoke;
                Intrinsics.checkParameterIsNotNull(filePathCallback, "filePathCallback");
                Intrinsics.checkParameterIsNotNull(fileChooserParams, "fileChooserParams");
                Function1<AdaEmbedView.FilePickerCallback, Boolean> filePickerCallback = AdaEmbedView.this.getFilePickerCallback();
                if (filePickerCallback == null || (invoke = filePickerCallback.invoke(new AdaEmbedView.FilePickerCallback(filePathCallback))) == null) {
                    return false;
                }
                return invoke.booleanValue();
            }

            public final View getMCustomView() {
                return this.mCustomView;
            }

            public final void setMCustomView(View view) {
                this.mCustomView = view;
            }

            public final int getMOriginalSystemUiVisibility() {
                return this.mOriginalSystemUiVisibility;
            }

            public final void setMOriginalSystemUiVisibility(int i) {
                this.mOriginalSystemUiVisibility = i;
            }

            @Override // android.webkit.WebChromeClient
            public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                this.mCustomView = view;
                this.mOriginalSystemUiVisibility = AdaEmbedView.this.getSystemUiVisibility();
                AdaEmbedView.this.addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1));
                View view2 = this.mCustomView;
                if (view2 != null) {
                    if (view2 == null) {
                        Intrinsics.throwNpe();
                    }
                    view2.setSystemUiVisibility(256);
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onHideCustomView() {
                AdaEmbedView.this.removeView(this.mCustomView);
                AdaEmbedView.this.setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            }
        });
    }

    public final void initialize(Settings settings) {
        Intrinsics.checkParameterIsNotNull(settings, "settings");
        this.handle = settings.getHandle();
        this.cluster = settings.getCluster();
        this.greetings = settings.getGreetings();
        this.styles = settings.getStyles();
        this.language = settings.getLanguage();
        this.loadTimeoutMillis = settings.getLoadTimeoutMillis();
        this.metaFields = settings.getMetaFields();
        this.sensitiveMetaFields = settings.getSensitiveMetaFields();
        setDeviceToken(settings.getDeviceToken());
        setAcceptThirdPartyCookies(settings.getAcceptThirdPartyCookies());
        setupWebView();
        if (isAttachedToWindow()) {
            loadUrl(EMBED_URL);
            return;
        }
        this.isInitialized = true;
        this.isAdaReady = false;
    }

    @Deprecated(message = "This method will be deprecated in the future, please upgrade to MetaFields.Builder.", replaceWith = @ReplaceWith(expression = "setMetaFields(MetaFields.Builder())", imports = {}))
    public final void setMetaFields(Map<String, String> metaFields) {
        Intrinsics.checkParameterIsNotNull(metaFields, "metaFields");
        enqueueAction(new SetMetafieldsAction(this, metaFields));
    }

    @Deprecated(message = "This method will be deprecated in the future, please upgrade to MetaFields.Builder.", replaceWith = @ReplaceWith(expression = "setSensitiveMetaFields(MetaFields.Builder())", imports = {}))
    public final void setSensitiveMetaFields(Map<String, String> sensitiveMetaFields) {
        Intrinsics.checkParameterIsNotNull(sensitiveMetaFields, "sensitiveMetaFields");
        enqueueAction(new SetSensitiveMetafieldsAction(this, sensitiveMetaFields));
    }

    public final void setMetaFields(MetaFields.Builder metaFieldsBuilder) {
        Intrinsics.checkParameterIsNotNull(metaFieldsBuilder, "metaFieldsBuilder");
        enqueueAction(new SetMetafieldsAction(this, metaFieldsBuilder.build$ada_embed_release()));
    }

    public final void setSensitiveMetaFields(MetaFields.Builder metaFieldsBuilder) {
        Intrinsics.checkParameterIsNotNull(metaFieldsBuilder, "metaFieldsBuilder");
        enqueueAction(new SetSensitiveMetafieldsAction(this, metaFieldsBuilder.build$ada_embed_release()));
    }

    public final void deleteHistory() {
        enqueueAction(new DeleteHistoryAction(this));
    }

    public final void downloadTranscript(String fileName, String data) {
        Intrinsics.checkParameterIsNotNull(fileName, "fileName");
        Intrinsics.checkParameterIsNotNull(data, "data");
        try {
            System.out.println((Object) fileName);
            System.out.println((Object) data);
            byte[] decode = Base64.decode(StringsKt.replace$default(data, "data:text/plain; charset=utf-8;base64,", "", false, 4, (Object) null), 0);
            Intrinsics.checkExpressionValueIsNotNull(decode, "Base64.decode(it, Base64.DEFAULT)");
            Intrinsics.checkExpressionValueIsNotNull(decode, "data.replace(\"data:text/…64.DEFAULT)\n            }");
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Throwable th = null;
            fileOutputStream.write(decode);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            Object systemService = getContext().getSystemService(JavascriptBridge.MraidHandler.DOWNLOAD_ACTION);
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.DownloadManager");
            }
            DownloadManager downloadManager = (DownloadManager) systemService;
            if (downloadManager != null) {
                downloadManager.addCompletedDownload(fileName, fileName, true, "text/plain", file.getAbsolutePath(), file.length(), true);
            }
            Toast.makeText(getContext(), "Downloading File", 1).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void reset$default(AdaEmbedView adaEmbedView, String str, String str2, Map map, Map map2, Boolean bool, int i, Object obj) {
        Boolean bool2 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        String str3 = (i & 2) != 0 ? null : str2;
        Map map3 = (i & 4) != 0 ? null : map;
        Map map4 = (i & 8) != 0 ? null : map2;
        if ((i & 16) == 0) {
            bool2 = bool;
        }
        adaEmbedView.reset(str, str3, map3, map4, bool2);
    }

    @Deprecated(message = "This method will be deprecated in the future, please upgrade to reset with MetaFields.Builder.")
    public final void reset(String str, String str2, Map<String, String> map, Map<String, String> map2, Boolean bool) {
        enqueueAction(new ResetAction(this, str, str2, map, map2, bool));
    }

    public static /* synthetic */ void reset$default(AdaEmbedView adaEmbedView, String str, String str2, MetaFields.Builder builder, MetaFields.Builder builder2, Boolean bool, int i, Object obj) {
        Boolean bool2 = null;
        if ((i & 1) != 0) {
            str = null;
        }
        String str3 = (i & 2) != 0 ? null : str2;
        MetaFields.Builder builder3 = (i & 4) != 0 ? null : builder;
        MetaFields.Builder builder4 = (i & 8) != 0 ? null : builder2;
        if ((i & 16) == 0) {
            bool2 = bool;
        }
        adaEmbedView.reset(str, str3, builder3, builder4, bool2);
    }

    public final void reset(String str, String str2, MetaFields.Builder builder, MetaFields.Builder builder2, Boolean bool) {
        enqueueAction(new ResetAction(this, str, str2, builder != null ? builder.build$ada_embed_release() : null, builder2 != null ? builder2.build$ada_embed_release() : null, bool));
    }

    public final void setDeviceToken(String token) {
        Intrinsics.checkParameterIsNotNull(token, "token");
        enqueueAction(new SetDeviceTokenAction(this, token));
    }

    public static /* synthetic */ void addEventCallback$default(AdaEmbedView adaEmbedView, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "*";
        }
        adaEmbedView.addEventCallback(str, function1);
    }

    public final void addEventCallback(String eventName, Function1<? super Event, Unit> callback) {
        Intrinsics.checkParameterIsNotNull(eventName, "eventName");
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        HashMap<String, HashSet<Function1<Event, Unit>>> hashMap = this.eventCallbacks;
        HashSet<Function1<Event, Unit>> hashSet = hashMap.get(eventName);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            hashMap.put(eventName, hashSet);
        }
        hashSet.add(callback);
    }

    public static /* synthetic */ void removeEventCallbacks$default(AdaEmbedView adaEmbedView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "*";
        }
        adaEmbedView.removeEventCallbacks(str);
    }

    public final void removeEventCallbacks(String eventName) {
        Intrinsics.checkParameterIsNotNull(eventName, "eventName");
        this.eventCallbacks.remove(eventName);
    }

    public final void removeEventCallback(Function1<? super Event, Unit> eventCallback) {
        Intrinsics.checkParameterIsNotNull(eventCallback, "eventCallback");
        UtilsKt.removeEventCallback(this.eventCallbacks, eventCallback);
    }

    private final void setAcceptThirdPartyCookies(boolean z) {
        if (Build.VERSION.SDK_INT > 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, z);
        }
    }

    private final void enqueueAction(Action action) {
        if (this.isAdaReady) {
            action.execute();
            return;
        }
        this.actionQueue.remove(action.key());
        this.actionQueue.put(action.key(), action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executePendingActions() {
        this.isAdaReady = true;
        Iterator<Map.Entry<String, Action>> it = this.actionQueue.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().execute();
            it.remove();
        }
    }

    /* compiled from: AdaEmbedView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\n\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u000b"}, d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$AdaInterface;", "", "(Lsupport/ada/embed/widget/AdaEmbedView;)V", "chatFrameTimeoutCallback", "", "eventCallback", "eventStr", "", "onInitializeCallback", "onLoadCallback", "requestToken", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes11.dex */
    private final class AdaInterface {
        public AdaInterface() {
        }

        @JavascriptInterface
        public final void onLoadCallback() {
            AdaEmbedView.this.mainHandler.post(new Runnable() { // from class: support.ada.embed.widget.AdaEmbedView$AdaInterface$onLoadCallback$1
                @Override // java.lang.Runnable
                public final void run() {
                    AdaEmbedView.this.initializeEmbed$ada_embed_release();
                }
            });
        }

        @JavascriptInterface
        public final void onInitializeCallback() {
            AdaEmbedView.this.mainHandler.post(new Runnable() { // from class: support.ada.embed.widget.AdaEmbedView$AdaInterface$onInitializeCallback$1
                @Override // java.lang.Runnable
                public final void run() {
                    AdaEmbedView.this.executePendingActions();
                }
            });
        }

        @JavascriptInterface
        public final void chatFrameTimeoutCallback() {
            AdaEmbedView.this.mainHandler.post(new Runnable() { // from class: support.ada.embed.widget.AdaEmbedView$AdaInterface$chatFrameTimeoutCallback$1
                @Override // java.lang.Runnable
                public final void run() {
                    AdaEmbedView.this.chatFrameTimeout$ada_embed_release();
                }
            });
        }

        @JavascriptInterface
        public final String requestToken() {
            Function0<String> zdChatterAuthCallback = AdaEmbedView.this.getZdChatterAuthCallback();
            if (zdChatterAuthCallback == null) {
                Log.w(getClass().getSimpleName(), new IllegalArgumentException("Auth token callback is not provided!"));
                return null;
            }
            return zdChatterAuthCallback.invoke();
        }

        @JavascriptInterface
        public final void eventCallback(final String eventStr) {
            Intrinsics.checkParameterIsNotNull(eventStr, "eventStr");
            AdaEmbedView.this.mainHandler.post(new Runnable() { // from class: support.ada.embed.widget.AdaEmbedView$AdaInterface$eventCallback$1
                @Override // java.lang.Runnable
                public final void run() {
                    HashMap hashMap;
                    HashMap hashMap2;
                    Event from = Event.Companion.from(eventStr);
                    if (!Intrinsics.areEqual(from.getEventName(), "adaDownloadTranscript")) {
                        hashMap = AdaEmbedView.this.eventCallbacks;
                        HashSet<Function1> hashSet = (HashSet) hashMap.get(from.getEventName());
                        if (hashSet != null) {
                            for (Function1 function1 : hashSet) {
                                function1.invoke(from);
                            }
                        }
                        hashMap2 = AdaEmbedView.this.eventCallbacks;
                        HashSet<Function1> hashSet2 = (HashSet) hashMap2.get("*");
                        if (hashSet2 != null) {
                            for (Function1 function12 : hashSet2) {
                                function12.invoke(from);
                            }
                            return;
                        }
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(eventStr);
                    AdaEmbedView adaEmbedView = AdaEmbedView.this;
                    String optString = jSONObject.optString("name");
                    Intrinsics.checkExpressionValueIsNotNull(optString, "eventObject.optString(\"name\")");
                    String optString2 = jSONObject.optString("url");
                    Intrinsics.checkExpressionValueIsNotNull(optString2, "eventObject.optString(\"url\")");
                    adaEmbedView.downloadTranscript(optString, optString2);
                }
            });
        }
    }

    /* compiled from: AdaEmbedView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00016B{\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b\u0012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u001a\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bHÆ\u0003J\u001a\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003J\u008f\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b2\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\t\u0010,\u001a\u00020\u0010HÖ\u0001J\u0013\u0010-\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010/\u001a\u00020\u0010HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016¨\u00067"}, d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$Settings;", "Landroid/os/Parcelable;", "handle", "", "cluster", "greetings", "styles", i.ATTRIBUTE_CLOSED_CAPTION_FILE_LANGUAGE, "metaFields", "", "", "Lkotlinx/android/parcel/RawValue;", "sensitiveMetaFields", "acceptThirdPartyCookies", "", "loadTimeoutMillis", "", "deviceToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ZILjava/lang/String;)V", "getAcceptThirdPartyCookies", "()Z", "getCluster", "()Ljava/lang/String;", "getDeviceToken", "getGreetings", "getHandle", "getLanguage", "getLoadTimeoutMillis", "()I", "getMetaFields", "()Ljava/util/Map;", "getSensitiveMetaFields", "getStyles", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "describeContents", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes11.dex */
    public static final class Settings implements Parcelable {
        public static final Parcelable.Creator CREATOR = new Creator();
        private final boolean acceptThirdPartyCookies;
        private final String cluster;
        private final String deviceToken;
        private final String greetings;
        private final String handle;
        private final String language;
        private final int loadTimeoutMillis;
        private final Map<String, Object> metaFields;
        private final Map<String, Object> sensitiveMetaFields;
        private final String styles;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
        /* loaded from: classes11.dex */
        public static class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel in) {
                Intrinsics.checkParameterIsNotNull(in, "in");
                String readString = in.readString();
                String readString2 = in.readString();
                String readString3 = in.readString();
                String readString4 = in.readString();
                String readString5 = in.readString();
                int readInt = in.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                while (readInt != 0) {
                    linkedHashMap.put(in.readString(), in.readValue(Object.class.getClassLoader()));
                    readInt--;
                }
                int readInt2 = in.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                while (readInt2 != 0) {
                    linkedHashMap2.put(in.readString(), in.readValue(Object.class.getClassLoader()));
                    readInt2--;
                }
                return new Settings(readString, readString2, readString3, readString4, readString5, linkedHashMap, linkedHashMap2, in.readInt() != 0, in.readInt(), in.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        public final String component1() {
            return this.handle;
        }

        public final String component10() {
            return this.deviceToken;
        }

        public final String component2() {
            return this.cluster;
        }

        public final String component3() {
            return this.greetings;
        }

        public final String component4() {
            return this.styles;
        }

        public final String component5() {
            return this.language;
        }

        public final Map<String, Object> component6() {
            return this.metaFields;
        }

        public final Map<String, Object> component7() {
            return this.sensitiveMetaFields;
        }

        public final boolean component8() {
            return this.acceptThirdPartyCookies;
        }

        public final int component9() {
            return this.loadTimeoutMillis;
        }

        public final Settings copy(String handle, String cluster, String greetings, String styles, String language, Map<String, ? extends Object> metaFields, Map<String, ? extends Object> sensitiveMetaFields, boolean z, int i, String deviceToken) {
            Intrinsics.checkParameterIsNotNull(handle, "handle");
            Intrinsics.checkParameterIsNotNull(cluster, "cluster");
            Intrinsics.checkParameterIsNotNull(greetings, "greetings");
            Intrinsics.checkParameterIsNotNull(styles, "styles");
            Intrinsics.checkParameterIsNotNull(language, "language");
            Intrinsics.checkParameterIsNotNull(metaFields, "metaFields");
            Intrinsics.checkParameterIsNotNull(sensitiveMetaFields, "sensitiveMetaFields");
            Intrinsics.checkParameterIsNotNull(deviceToken, "deviceToken");
            return new Settings(handle, cluster, greetings, styles, language, metaFields, sensitiveMetaFields, z, i, deviceToken);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Settings) {
                    Settings settings = (Settings) obj;
                    if (Intrinsics.areEqual(this.handle, settings.handle) && Intrinsics.areEqual(this.cluster, settings.cluster) && Intrinsics.areEqual(this.greetings, settings.greetings) && Intrinsics.areEqual(this.styles, settings.styles) && Intrinsics.areEqual(this.language, settings.language) && Intrinsics.areEqual(this.metaFields, settings.metaFields) && Intrinsics.areEqual(this.sensitiveMetaFields, settings.sensitiveMetaFields)) {
                        if (this.acceptThirdPartyCookies == settings.acceptThirdPartyCookies) {
                            if (!(this.loadTimeoutMillis == settings.loadTimeoutMillis) || !Intrinsics.areEqual(this.deviceToken, settings.deviceToken)) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.handle;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.cluster;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.greetings;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.styles;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.language;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            Map<String, Object> map = this.metaFields;
            int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
            Map<String, Object> map2 = this.sensitiveMetaFields;
            int hashCode7 = (hashCode6 + (map2 != null ? map2.hashCode() : 0)) * 31;
            boolean z = this.acceptThirdPartyCookies;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (((hashCode7 + i) * 31) + this.loadTimeoutMillis) * 31;
            String str6 = this.deviceToken;
            return i2 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Settings(handle=" + this.handle + ", cluster=" + this.cluster + ", greetings=" + this.greetings + ", styles=" + this.styles + ", language=" + this.language + ", metaFields=" + this.metaFields + ", sensitiveMetaFields=" + this.sensitiveMetaFields + ", acceptThirdPartyCookies=" + this.acceptThirdPartyCookies + ", loadTimeoutMillis=" + this.loadTimeoutMillis + ", deviceToken=" + this.deviceToken + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeString(this.handle);
            parcel.writeString(this.cluster);
            parcel.writeString(this.greetings);
            parcel.writeString(this.styles);
            parcel.writeString(this.language);
            Map<String, Object> map = this.metaFields;
            parcel.writeInt(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeValue(entry.getValue());
            }
            Map<String, Object> map2 = this.sensitiveMetaFields;
            parcel.writeInt(map2.size());
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeValue(entry2.getValue());
            }
            parcel.writeInt(this.acceptThirdPartyCookies ? 1 : 0);
            parcel.writeInt(this.loadTimeoutMillis);
            parcel.writeString(this.deviceToken);
        }

        public Settings(String handle, String cluster, String greetings, String styles, String language, Map<String, ? extends Object> metaFields, Map<String, ? extends Object> sensitiveMetaFields, boolean z, int i, String deviceToken) {
            Intrinsics.checkParameterIsNotNull(handle, "handle");
            Intrinsics.checkParameterIsNotNull(cluster, "cluster");
            Intrinsics.checkParameterIsNotNull(greetings, "greetings");
            Intrinsics.checkParameterIsNotNull(styles, "styles");
            Intrinsics.checkParameterIsNotNull(language, "language");
            Intrinsics.checkParameterIsNotNull(metaFields, "metaFields");
            Intrinsics.checkParameterIsNotNull(sensitiveMetaFields, "sensitiveMetaFields");
            Intrinsics.checkParameterIsNotNull(deviceToken, "deviceToken");
            this.handle = handle;
            this.cluster = cluster;
            this.greetings = greetings;
            this.styles = styles;
            this.language = language;
            this.metaFields = metaFields;
            this.sensitiveMetaFields = sensitiveMetaFields;
            this.acceptThirdPartyCookies = z;
            this.loadTimeoutMillis = i;
            this.deviceToken = deviceToken;
        }

        public final String getHandle() {
            return this.handle;
        }

        public final String getCluster() {
            return this.cluster;
        }

        public final String getGreetings() {
            return this.greetings;
        }

        public final String getStyles() {
            return this.styles;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final Map<String, Object> getMetaFields() {
            return this.metaFields;
        }

        public final Map<String, Object> getSensitiveMetaFields() {
            return this.sensitiveMetaFields;
        }

        public final boolean getAcceptThirdPartyCookies() {
            return this.acceptThirdPartyCookies;
        }

        public /* synthetic */ Settings(String str, String str2, String str3, String str4, String str5, Map map, Map map2, boolean z, int i, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, map, map2, z, (i2 & 256) != 0 ? 30000 : i, str6);
        }

        public final int getLoadTimeoutMillis() {
            return this.loadTimeoutMillis;
        }

        public final String getDeviceToken() {
            return this.deviceToken;
        }

        /* compiled from: AdaEmbedView.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\r\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$Settings$Builder;", "", "handle", "", "(Ljava/lang/String;)V", "acceptThirdPartyCookies", "", "cluster", "deviceToken", "greetings", i.ATTRIBUTE_CLOSED_CAPTION_FILE_LANGUAGE, "loadTimeoutMillis", "", "metaFields", "", "sensitiveMetaFields", "styles", "accept", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lsupport/ada/embed/widget/AdaEmbedView$Settings;", "metaFieldsBuilder", "Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$Builder;", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
        /* loaded from: classes11.dex */
        public static final class Builder {
            private boolean acceptThirdPartyCookies;
            private String cluster;
            private String deviceToken;
            private String greetings;
            private final String handle;
            private String language;
            private int loadTimeoutMillis;
            private Map<String, ? extends Object> metaFields;
            private Map<String, ? extends Object> sensitiveMetaFields;
            private String styles;

            public Builder(String handle) {
                Intrinsics.checkParameterIsNotNull(handle, "handle");
                this.handle = handle;
                this.cluster = "";
                this.greetings = "";
                this.styles = "";
                this.language = "";
                this.loadTimeoutMillis = 30000;
                this.metaFields = MapsKt.emptyMap();
                this.sensitiveMetaFields = MapsKt.emptyMap();
                this.deviceToken = "";
            }

            public final Builder cluster(String cluster) {
                Intrinsics.checkParameterIsNotNull(cluster, "cluster");
                this.cluster = cluster;
                return this;
            }

            public final Builder greetings(String greetings) {
                Intrinsics.checkParameterIsNotNull(greetings, "greetings");
                this.greetings = greetings;
                return this;
            }

            public final Builder styles(String styles) {
                Intrinsics.checkParameterIsNotNull(styles, "styles");
                this.styles = styles;
                return this;
            }

            public final Builder language(String language) {
                Intrinsics.checkParameterIsNotNull(language, "language");
                this.language = language;
                return this;
            }

            public final Builder loadTimeoutMillis(int i) {
                this.loadTimeoutMillis = i;
                return this;
            }

            @Deprecated(message = "This method will be deprecated in the future, please upgrade to MetaFields.Builder.", replaceWith = @ReplaceWith(expression = "metaFields(MetaFields.Builder())", imports = {}))
            public final Builder metaFields(Map<String, String> metaFields) {
                Intrinsics.checkParameterIsNotNull(metaFields, "metaFields");
                this.metaFields = metaFields;
                return this;
            }

            @Deprecated(message = "This method will be deprecated in the future, please upgrade to MetaFields.Builder.", replaceWith = @ReplaceWith(expression = "sensitiveMetaFields(MetaFields.Builder())", imports = {}))
            public final Builder sensitiveMetaFields(Map<String, String> sensitiveMetaFields) {
                Intrinsics.checkParameterIsNotNull(sensitiveMetaFields, "sensitiveMetaFields");
                this.sensitiveMetaFields = sensitiveMetaFields;
                return this;
            }

            public final Builder metaFields(MetaFields.Builder metaFieldsBuilder) {
                Intrinsics.checkParameterIsNotNull(metaFieldsBuilder, "metaFieldsBuilder");
                this.metaFields = metaFieldsBuilder.build$ada_embed_release();
                return this;
            }

            public final Builder sensitiveMetaFields(MetaFields.Builder metaFieldsBuilder) {
                Intrinsics.checkParameterIsNotNull(metaFieldsBuilder, "metaFieldsBuilder");
                this.sensitiveMetaFields = metaFieldsBuilder.build$ada_embed_release();
                return this;
            }

            public final Builder acceptThirdPartyCookies(boolean z) {
                this.acceptThirdPartyCookies = z;
                return this;
            }

            public final Builder deviceToken(String deviceToken) {
                Intrinsics.checkParameterIsNotNull(deviceToken, "deviceToken");
                this.deviceToken = deviceToken;
                return this;
            }

            public final Settings build() {
                return new Settings(this.handle, this.cluster, this.greetings, this.styles, this.language, this.metaFields, this.sensitiveMetaFields, this.acceptThirdPartyCookies, this.loadTimeoutMillis, this.deviceToken);
            }
        }
    }

    /* compiled from: AdaEmbedView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\u000b"}, d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$MetaFields;", "Landroid/os/Parcelable;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Builder", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes11.dex */
    public static final class MetaFields implements Parcelable {
        public static final Parcelable.Creator CREATOR = new Creator();

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
        /* loaded from: classes11.dex */
        public static class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel in) {
                Intrinsics.checkParameterIsNotNull(in, "in");
                if (in.readInt() != 0) {
                    return new MetaFields();
                }
                return null;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MetaFields[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            parcel.writeInt(1);
        }

        /* compiled from: AdaEmbedView.kt */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0000¢\u0006\u0002\b\bJ\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000eJ\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000fJ\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0010J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$MetaFields$Builder;", "", "()V", "metaFields", "", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "build$ada_embed_release", InjectionUtil.SET_FIELD_METHOD, ch.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE, "value", "", "", "", "", "", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
        /* loaded from: classes11.dex */
        public static final class Builder {
            private Map<String, Object> metaFields = new LinkedHashMap();

            public final Builder setField(String key, String value) {
                Intrinsics.checkParameterIsNotNull(key, "key");
                Intrinsics.checkParameterIsNotNull(value, "value");
                this.metaFields.put(key, value);
                return this;
            }

            public final Builder setField(String key, boolean z) {
                Intrinsics.checkParameterIsNotNull(key, "key");
                this.metaFields.put(key, Boolean.valueOf(z));
                return this;
            }

            public final Builder setField(String key, double d) {
                Intrinsics.checkParameterIsNotNull(key, "key");
                this.metaFields.put(key, Double.valueOf(d));
                return this;
            }

            public final Builder setField(String key, int i) {
                Intrinsics.checkParameterIsNotNull(key, "key");
                this.metaFields.put(key, Integer.valueOf(i));
                return this;
            }

            public final Builder setField(String key, long j) {
                Intrinsics.checkParameterIsNotNull(key, "key");
                this.metaFields.put(key, Long.valueOf(j));
                return this;
            }

            public final Builder setField(String key, float f) {
                Intrinsics.checkParameterIsNotNull(key, "key");
                this.metaFields.put(key, Float.valueOf(f));
                return this;
            }

            public final Map<String, Object> build$ada_embed_release() {
                return this.metaFields;
            }
        }
    }

    /* compiled from: AdaEmbedView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsupport/ada/embed/widget/AdaEmbedView$FilePickerCallback;", "", "valueCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "(Landroid/webkit/ValueCallback;)V", "onFileTaken", "", JavaScriptResource.URI, "ada-embed_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes11.dex */
    public static final class FilePickerCallback {
        private final ValueCallback<Uri[]> valueCallback;

        public FilePickerCallback(ValueCallback<Uri[]> valueCallback) {
            Intrinsics.checkParameterIsNotNull(valueCallback, "valueCallback");
            this.valueCallback = valueCallback;
        }

        public final void onFileTaken(Uri uri) {
            this.valueCallback.onReceiveValue(uri != null ? new Uri[]{uri} : null);
        }
    }
}
