package support.ada.embed.ui;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: FilePickerHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes11.dex */
final class FilePickerHandler$filePickerIntent$2 extends Lambda implements Function0<Intent> {
    public static final FilePickerHandler$filePickerIntent$2 INSTANCE = new FilePickerHandler$filePickerIntent$2();

    FilePickerHandler$filePickerIntent$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Intent invoke() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        return intent;
    }
}
