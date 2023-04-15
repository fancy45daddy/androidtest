package support.ada.embed.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import support.ada.embed.widget.AdaEmbedView;
/* compiled from: AdaEmbedDialog.kt */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
/* loaded from: classes11.dex */
final /* synthetic */ class AdaEmbedDialog$removeEventCallback$1 extends MutablePropertyReference0 {
    AdaEmbedDialog$removeEventCallback$1(AdaEmbedDialog adaEmbedDialog) {
        super(adaEmbedDialog);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "adaView";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(AdaEmbedDialog.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getAdaView()Lsupport/ada/embed/widget/AdaEmbedView;";
    }

    @Override // kotlin.reflect.KProperty0
    public Object get() {
        return AdaEmbedDialog.access$getAdaView$p((AdaEmbedDialog) this.receiver);
    }

    @Override // kotlin.reflect.KMutableProperty0
    public void set(Object obj) {
        ((AdaEmbedDialog) this.receiver).adaView = (AdaEmbedView) obj;
    }
}
