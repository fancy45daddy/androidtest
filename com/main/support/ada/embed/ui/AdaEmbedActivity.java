package support.ada.embed.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.mopub.common.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import support.ada.embed.widget.AdaEmbedView;
/* compiled from: AdaEmbedActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0004J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lsupport/ada/embed/ui/AdaEmbedActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adaView", "Lsupport/ada/embed/widget/AdaEmbedView;", "filePickerHandler", "Lsupport/ada/embed/ui/FilePickerHandler;", "getAdaView", "onActivityResult", "", "requestCode", "", "resultCode", Constants.INTENT_SCHEME, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "ada-embed-appcompat_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes11.dex */
public class AdaEmbedActivity extends AppCompatActivity {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_SETTINGS = "EXTRA_SETTINGS";
    private HashMap _$_findViewCache;
    private AdaEmbedView adaView;
    private FilePickerHandler filePickerHandler;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public static final /* synthetic */ AdaEmbedView access$getAdaView$p(AdaEmbedActivity adaEmbedActivity) {
        AdaEmbedView adaEmbedView = adaEmbedActivity.adaView;
        if (adaEmbedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        return adaEmbedView;
    }

    /* compiled from: AdaEmbedActivity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lsupport/ada/embed/ui/AdaEmbedActivity$Companion;", "", "()V", AdaEmbedActivity.EXTRA_SETTINGS, "", "ada-embed-appcompat_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AdaEmbedView.Settings settings = (AdaEmbedView.Settings) getIntent().getParcelableExtra(EXTRA_SETTINGS);
        if (settings == null) {
            throw new IllegalArgumentException("Settings must not be null!");
        }
        AdaEmbedView adaEmbedView = new AdaEmbedView(this, null, 2, null);
        adaEmbedView.initialize(settings);
        this.adaView = adaEmbedView;
        setContentView(adaEmbedView);
        AdaEmbedView adaEmbedView2 = this.adaView;
        if (adaEmbedView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adaView");
        }
        adaEmbedView2.setFilePickerCallback(new AdaEmbedActivity$onCreate$2(this));
    }

    protected final AdaEmbedView getAdaView() {
        if (this.adaView != null) {
            AdaEmbedView adaEmbedView = this.adaView;
            if (adaEmbedView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adaView");
            }
            return adaEmbedView;
        }
        throw new UnsupportedOperationException("Ada view is not assigned yet");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FilePickerHandler filePickerHandler = this.filePickerHandler;
        if (filePickerHandler != null) {
            filePickerHandler.handleResult(i, i2, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        FilePickerHandler filePickerHandler = this.filePickerHandler;
        if (filePickerHandler != null) {
            filePickerHandler.cancel();
        }
        this.filePickerHandler = null;
    }
}
