package support.ada.embed.ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import support.ada.embed.widget.AdaEmbedView;
/* compiled from: AdaEmbedDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "filePickerCallback", "Lsupport/ada/embed/widget/AdaEmbedView$FilePickerCallback;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes11.dex */
final class AdaEmbedDialog$onViewCreated$3 extends Lambda implements Function1<AdaEmbedView.FilePickerCallback, Boolean> {
    final /* synthetic */ AdaEmbedDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaEmbedDialog$onViewCreated$3(AdaEmbedDialog adaEmbedDialog) {
        super(1);
        this.this$0 = adaEmbedDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(AdaEmbedView.FilePickerCallback filePickerCallback) {
        return Boolean.valueOf(invoke2(filePickerCallback));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(AdaEmbedView.FilePickerCallback filePickerCallback) {
        Intrinsics.checkParameterIsNotNull(filePickerCallback, "filePickerCallback");
        AdaEmbedDialog adaEmbedDialog = this.this$0;
        FilePickerHandler filePickerHandler = new FilePickerHandler(filePickerCallback);
        filePickerHandler.openFilePicker(this.this$0);
        adaEmbedDialog.filePickerHandler = filePickerHandler;
        return true;
    }
}
