package ai.bitlabs.sdk;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isPageOfferWall", "", "url", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebActivity$bindUI$2 extends Lambda implements Function2<Boolean, String, Unit> {
    final /* synthetic */ WebActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebActivity$bindUI$2(WebActivity webActivity) {
        super(2);
        this.this$0 = webActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
        invoke(bool.booleanValue(), str);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, String url) {
        String queryParameter;
        float f;
        Intrinsics.checkNotNullParameter(url, "url");
        if (z) {
            String str = url;
            if ((StringsKt.contains$default((CharSequence) str, (CharSequence) "survey/complete", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "survey/screenout", false, 2, (Object) null)) && (queryParameter = Uri.parse(url).getQueryParameter("val")) != null) {
                WebActivity webActivity = this.this$0;
                f = webActivity.reward;
                webActivity.reward = f + Float.parseFloat(queryParameter);
            }
        } else {
            MatchResult find$default = Regex.find$default(new Regex("/networks/(\\d+)/surveys/(\\d+)"), url, 0, 2, null);
            if (find$default != null) {
                WebActivity webActivity2 = this.this$0;
                MatchResult.Destructured destructured = find$default.getDestructured();
                webActivity2.networkId = destructured.getMatch().getGroupValues().get(1);
                webActivity2.surveyId = destructured.getMatch().getGroupValues().get(2);
            }
        }
        this.this$0.toggleToolbar(z);
    }
}
