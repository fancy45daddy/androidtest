package support.ada.embed.ui;

import android.content.Intent;
import android.net.Uri;
import com.ad.core.podcast.internal.DownloadWorker;
import com.mopub.common.Constants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import support.ada.embed.widget.AdaEmbedView;
/* compiled from: FilePickerHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lsupport/ada/embed/ui/FilePickerHandler;", "", "filePickerCallback", "Lsupport/ada/embed/widget/AdaEmbedView$FilePickerCallback;", "(Lsupport/ada/embed/widget/AdaEmbedView$FilePickerCallback;)V", "filePickerIntent", "Landroid/content/Intent;", "getFilePickerIntent", "()Landroid/content/Intent;", "filePickerIntent$delegate", "Lkotlin/Lazy;", DownloadWorker.STATUS_CANCEL, "", "handleResult", "requestCode", "", "resultCode", Constants.INTENT_SCHEME, "openFilePicker", "adaEmbedActivity", "Lsupport/ada/embed/ui/AdaEmbedActivity;", "adaEmbedDialog", "Lsupport/ada/embed/ui/AdaEmbedDialog;", "ada-embed-appcompat_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes11.dex */
public final class FilePickerHandler {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FilePickerHandler.class), "filePickerIntent", "getFilePickerIntent()Landroid/content/Intent;"))};
    private AdaEmbedView.FilePickerCallback filePickerCallback;
    private final Lazy filePickerIntent$delegate = LazyKt.lazy(FilePickerHandler$filePickerIntent$2.INSTANCE);

    private final Intent getFilePickerIntent() {
        Lazy lazy = this.filePickerIntent$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Intent) lazy.getValue();
    }

    public FilePickerHandler(AdaEmbedView.FilePickerCallback filePickerCallback) {
        this.filePickerCallback = filePickerCallback;
    }

    public final void openFilePicker(AdaEmbedActivity adaEmbedActivity) {
        Intrinsics.checkParameterIsNotNull(adaEmbedActivity, "adaEmbedActivity");
        adaEmbedActivity.startActivityForResult(getFilePickerIntent(), FilePickerHandlerKt.REQUEST_CODE_FILE_PICKER);
    }

    public final void openFilePicker(AdaEmbedDialog adaEmbedDialog) {
        Intrinsics.checkParameterIsNotNull(adaEmbedDialog, "adaEmbedDialog");
        adaEmbedDialog.startActivityForResult(getFilePickerIntent(), FilePickerHandlerKt.REQUEST_CODE_FILE_PICKER);
    }

    public final void handleResult(int i, int i2, Intent intent) {
        Uri uri;
        if (i == 8395) {
            if (i2 != -1 || intent == null || (uri = intent.getData()) == null) {
                uri = null;
            }
            AdaEmbedView.FilePickerCallback filePickerCallback = this.filePickerCallback;
            if (filePickerCallback != null) {
                filePickerCallback.onFileTaken(uri);
            }
            this.filePickerCallback = null;
        }
    }

    public final void cancel() {
        AdaEmbedView.FilePickerCallback filePickerCallback = this.filePickerCallback;
        if (filePickerCallback != null) {
            filePickerCallback.onFileTaken(null);
        }
        this.filePickerCallback = null;
    }
}
