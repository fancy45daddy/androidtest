package defpackage;

import android.util.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: AdaWebViewClient.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* renamed from: AdaWebViewClient$Companion$defaultErrorCallback$1  reason: default package */
/* loaded from: classes2.dex */
final class AdaWebViewClient$Companion$defaultErrorCallback$1 extends Lambda implements Function0<Unit> {
    public static final AdaWebViewClient$Companion$defaultErrorCallback$1 INSTANCE = new AdaWebViewClient$Companion$defaultErrorCallback$1();

    AdaWebViewClient$Companion$defaultErrorCallback$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Log.d("AdaWebView", "Error Loading AdaWebView");
    }
}
