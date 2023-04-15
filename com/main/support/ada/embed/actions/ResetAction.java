package support.ada.embed.actions;

import android.webkit.WebView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import support.ada.embed.common.UtilsKt;
/* compiled from: ResetAction.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lsupport/ada/embed/actions/ResetAction;", "Lsupport/ada/embed/actions/Action;", "webView", "Landroid/webkit/WebView;", "language", "", "greetings", ResetAction.FILED_METAFIELDS, "", "", ResetAction.FILED_SENSITIVE_METAFIELDS, ResetAction.FIELD_RESET_CHAT_HISTORY, "", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "execute", "", ch.qos.logback.core.joran.action.Action.KEY_ATTRIBUTE, "Companion", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes11.dex */
public final class ResetAction implements Action {
    public static final Companion Companion = new Companion(null);
    private static final String FIELD_GREETING = "greeting";
    private static final String FIELD_LANGUAGE = "language";
    private static final String FIELD_RESET_CHAT_HISTORY = "resetChatHistory";
    private static final String FILED_METAFIELDS = "metaFields";
    private static final String FILED_SENSITIVE_METAFIELDS = "sensitiveMetaFields";
    private static final String RESET = "reset(%s)";
    private final String greetings;
    private final String language;
    private final Map<String, Object> metaFields;
    private final Boolean resetChatHistory;
    private final Map<String, Object> sensitiveMetaFields;
    private final WebView webView;

    public ResetAction(WebView webView, String str, String str2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        this.webView = webView;
        this.language = str;
        this.greetings = str2;
        this.metaFields = map;
        this.sensitiveMetaFields = map2;
        this.resetChatHistory = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ResetAction(android.webkit.WebView r7, java.lang.String r8, java.lang.String r9, java.util.Map r10, java.util.Map r11, java.lang.Boolean r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r6 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto La
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r0 = r1
            goto Lb
        La:
            r0 = r8
        Lb:
            r2 = r13 & 4
            if (r2 == 0) goto L14
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            r2 = r1
            goto L15
        L14:
            r2 = r9
        L15:
            r3 = r13 & 8
            if (r3 == 0) goto L1e
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            r3 = r1
            goto L1f
        L1e:
            r3 = r10
        L1f:
            r4 = r13 & 16
            if (r4 == 0) goto L28
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
            r4 = r1
            goto L29
        L28:
            r4 = r11
        L29:
            r5 = r13 & 32
            if (r5 == 0) goto L31
            r5 = r1
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L32
        L31:
            r1 = r12
        L32:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: support.ada.embed.actions.ResetAction.<init>(android.webkit.WebView, java.lang.String, java.lang.String, java.util.Map, java.util.Map, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* compiled from: ResetAction.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsupport/ada/embed/actions/ResetAction$Companion;", "", "()V", "FIELD_GREETING", "", "FIELD_LANGUAGE", "FIELD_RESET_CHAT_HISTORY", "FILED_METAFIELDS", "FILED_SENSITIVE_METAFIELDS", "RESET", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
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
        Intrinsics.checkExpressionValueIsNotNull("ResetAction", "ResetAction::class.java.simpleName");
        return "ResetAction";
    }

    @Override // support.ada.embed.actions.Action
    public void execute() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.language;
        if (!(str == null || StringsKt.isBlank(str))) {
            linkedHashMap.put("language", this.language);
        }
        String str2 = this.greetings;
        if (!(str2 == null || StringsKt.isBlank(str2))) {
            linkedHashMap.put(FIELD_GREETING, this.greetings);
        }
        Boolean bool = this.resetChatHistory;
        if (bool != null) {
            linkedHashMap.put(FIELD_RESET_CHAT_HISTORY, bool);
        }
        Map<String, Object> map = this.metaFields;
        if (map != null) {
            linkedHashMap.put(FILED_METAFIELDS, map);
        }
        Map<String, Object> map2 = this.sensitiveMetaFields;
        if (map2 != null) {
            linkedHashMap.put(FILED_SENSITIVE_METAFIELDS, map2);
        }
        WebView webView = this.webView;
        Object[] objArr = new Object[1];
        objArr[0] = linkedHashMap.isEmpty() ? null : UtilsKt.mapToJson(linkedHashMap);
        String format = String.format(RESET, Arrays.copyOf(objArr, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(format, null);
    }
}
