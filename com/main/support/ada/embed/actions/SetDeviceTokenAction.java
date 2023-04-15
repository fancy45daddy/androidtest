package support.ada.embed.actions;

import android.webkit.WebView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SetDeviceTokenAction.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lsupport/ada/embed/actions/SetDeviceTokenAction;", "Lsupport/ada/embed/actions/Action;", "webView", "Landroid/webkit/WebView;", "token", "", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "execute", "", ch.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE, "Companion", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes11.dex */
public final class SetDeviceTokenAction implements Action {
    public static final Companion Companion = new Companion(null);
    private static final String SET_DEVICE_TOKEN = "setDeviceToken('%s')";
    private final String token;
    private final WebView webView;

    public SetDeviceTokenAction(WebView webView, String token) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        Intrinsics.checkParameterIsNotNull(token, "token");
        this.webView = webView;
        this.token = token;
    }

    /* compiled from: SetDeviceTokenAction.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lsupport/ada/embed/actions/SetDeviceTokenAction$Companion;", "", "()V", "SET_DEVICE_TOKEN", "", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // support.ada.embed.actions.Action
    public String key() {
        Intrinsics.checkExpressionValueIsNotNull("SetDeviceTokenAction", "SetDeviceTokenAction::class.java.simpleName");
        return "SetDeviceTokenAction";
    }

    @Override // support.ada.embed.actions.Action
    public void execute() {
        WebView webView = this.webView;
        String format = String.format(SET_DEVICE_TOKEN, Arrays.copyOf(new Object[]{this.token}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(format, null);
    }
}
