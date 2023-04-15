package support.ada.embed.actions;

import android.webkit.WebView;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import support.ada.embed.common.UtilsKt;
/* compiled from: SetSensitiveMetafieldsAction.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lsupport/ada/embed/actions/SetSensitiveMetafieldsAction;", "Lsupport/ada/embed/actions/Action;", "webView", "Landroid/webkit/WebView;", "metaFields", "", "", "", "(Landroid/webkit/WebView;Ljava/util/Map;)V", "execute", "", ch.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE, "Companion", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes11.dex */
public final class SetSensitiveMetafieldsAction implements Action {
    public static final Companion Companion = new Companion(null);
    private static final String SET_SENSITIVE_METAFIELDS = "setSensitiveMetaFields(%s)";
    private final Map<String, Object> metaFields;
    private final WebView webView;

    public SetSensitiveMetafieldsAction(WebView webView, Map<String, ? extends Object> metaFields) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        Intrinsics.checkParameterIsNotNull(metaFields, "metaFields");
        this.webView = webView;
        this.metaFields = metaFields;
    }

    /* compiled from: SetSensitiveMetafieldsAction.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lsupport/ada/embed/actions/SetSensitiveMetafieldsAction$Companion;", "", "()V", "SET_SENSITIVE_METAFIELDS", "", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
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
        Intrinsics.checkExpressionValueIsNotNull("SetSensitiveMetafieldsAction", "SetSensitiveMetafieldsAc…on::class.java.simpleName");
        return "SetSensitiveMetafieldsAction";
    }

    @Override // support.ada.embed.actions.Action
    public void execute() {
        WebView webView = this.webView;
        String format = String.format(SET_SENSITIVE_METAFIELDS, Arrays.copyOf(new Object[]{UtilsKt.mapToJson(this.metaFields)}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(format, null);
    }
}
