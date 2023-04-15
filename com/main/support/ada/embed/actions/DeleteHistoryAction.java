package support.ada.embed.actions;

import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DeleteHistoryAction.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsupport/ada/embed/actions/DeleteHistoryAction;", "Lsupport/ada/embed/actions/Action;", "webView", "Landroid/webkit/WebView;", "(Landroid/webkit/WebView;)V", "execute", "", ch.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE, "", "Companion", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes11.dex */
public final class DeleteHistoryAction implements Action {
    public static final Companion Companion = new Companion(null);
    private static final String DELETE_HISTORY = "deleteHistory()";
    private final WebView webView;

    public DeleteHistoryAction(WebView webView) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        this.webView = webView;
    }

    /* compiled from: DeleteHistoryAction.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lsupport/ada/embed/actions/DeleteHistoryAction$Companion;", "", "()V", "DELETE_HISTORY", "", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
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
        Intrinsics.checkExpressionValueIsNotNull("DeleteHistoryAction", "DeleteHistoryAction::class.java.simpleName");
        return "DeleteHistoryAction";
    }

    @Override // support.ada.embed.actions.Action
    public void execute() {
        this.webView.evaluateJavascript(DELETE_HISTORY, null);
    }
}
