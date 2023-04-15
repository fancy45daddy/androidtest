package ai.bitlabs.sdk;

import ai.bitlabs.sdk.util.GlobalKt;
import ai.bitlabs.sdk.util.OnRewardListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.brandio.ads.ads.components.Container;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: WebActivity.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0016H\u0014J\b\u0010\u001e\u001a\u00020\u0010H\u0014J\b\u0010\u001f\u001a\u00020\u0010H\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lai/bitlabs/sdk/WebActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", Container.FEATURE_CLOSE_BUTTON, "Landroid/widget/ImageView;", "networkId", "", "reward", "", "surveyId", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "url", "webView", "Landroid/webkit/WebView;", "bindUI", "", "leaveSurvey", "reason", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onRestoreInstanceState", "onSaveInstanceState", "outState", "onStop", "showLeaveSurveyAlertDialog", "toggleToolbar", "isPageOfferWall", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebActivity extends AppCompatActivity {
    private ImageView closeButton;
    private String networkId;
    private float reward;
    private String surveyId;
    private Toolbar toolbar;
    private String url;
    private WebView webView;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLeaveSurveyAlertDialog$lambda-4  reason: not valid java name */
    public static final void m4showLeaveSurveyAlertDialog$lambda4(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        WebView webView;
        super.onCreate(bundle);
        setContentView(R.layout.activity_web);
        Bundle extras = getIntent().getExtras();
        String str = null;
        String string = extras == null ? null : extras.getString(GlobalKt.BUNDLE_KEY_PARAMS);
        if (string == null) {
            Log.e("BitLabs", "WebActivity - No bundle data found!");
            finish();
            return;
        }
        this.url = string;
        bindUI();
        if (bundle != null || (webView = this.webView) == null) {
            return;
        }
        String str2 = this.url;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        } else {
            str = str2;
        }
        webView.loadUrl(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Toolbar toolbar = this.toolbar;
        boolean z = false;
        if (toolbar != null && toolbar.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            showLeaveSurveyAlertDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        WebView webView = this.webView;
        if (webView == null) {
            return;
        }
        webView.saveState(outState);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        WebView webView = this.webView;
        if (webView == null) {
            return;
        }
        webView.restoreState(savedInstanceState);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            showLeaveSurveyAlertDialog();
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        OnRewardListener onRewardListener$library_coreRelease = BitLabs.INSTANCE.getOnRewardListener$library_coreRelease();
        if (onRewardListener$library_coreRelease != null) {
            onRewardListener$library_coreRelease.onReward(this.reward);
        }
        super.onStop();
    }

    private final void bindUI() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.toolbar = toolbar;
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayShowHomeEnabled(true);
        }
        ImageView imageView = (ImageView) findViewById(R.id.close);
        this.closeButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ai.bitlabs.sdk.WebActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WebActivity.m2bindUI$lambda1(WebActivity.this, view);
                }
            });
        }
        toggleToolbar(true);
        WebView webView = (WebView) findViewById(R.id.web);
        this.webView = webView;
        if (webView != null) {
            webView.setScrollBarStyle(33554432);
        }
        WebView webView2 = this.webView;
        if (webView2 == null) {
            return;
        }
        WebViewExtensionKt.setup(webView2, this, new WebActivity$bindUI$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bindUI$lambda-1  reason: not valid java name */
    public static final void m2bindUI$lambda1(WebActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleToolbar(boolean z) {
        WebSettings settings;
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.setVisibility(z ? 8 : 0);
        }
        ImageView imageView = this.closeButton;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
        View view = z ? this.closeButton : this.toolbar;
        if (view != null) {
            view.bringToFront();
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.setScrollbarFadingEnabled(!z);
        }
        WebView webView2 = this.webView;
        if (webView2 == null || (settings = webView2.getSettings()) == null) {
            return;
        }
        settings.setSupportZoom(!z);
        settings.setBuiltInZoomControls(!z);
    }

    private final void showLeaveSurveyAlertDialog() {
        final String[] strArr = {"SENSITIVE", "UNINTERESTING", "TECHNICAL", "TOO_LONG", "OTHER"};
        new AlertDialog.Builder(this).setTitle(getString(R.string.leave_dialog_title)).setItems(new String[]{getString(R.string.leave_reason_sensitive), getString(R.string.leave_reason_uninteresting), getString(R.string.leave_reason_technical), getString(R.string.leave_reason_too_long), getString(R.string.leave_reason_other)}, new DialogInterface.OnClickListener() { // from class: ai.bitlabs.sdk.WebActivity$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WebActivity.m3showLeaveSurveyAlertDialog$lambda3(WebActivity.this, strArr, dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.leave_dialog_continue), new DialogInterface.OnClickListener() { // from class: ai.bitlabs.sdk.WebActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WebActivity.m4showLeaveSurveyAlertDialog$lambda4(dialogInterface, i);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showLeaveSurveyAlertDialog$lambda-3  reason: not valid java name */
    public static final void m3showLeaveSurveyAlertDialog$lambda3(WebActivity this$0, String[] options, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(options, "$options");
        this$0.leaveSurvey(options[i]);
    }

    private final void leaveSurvey(String str) {
        toggleToolbar(true);
        WebView webView = this.webView;
        if (webView != null) {
            String str2 = this.url;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("url");
                str2 = null;
            }
            webView.loadUrl(str2);
        }
        if (this.networkId == null || this.surveyId == null) {
            return;
        }
        BitLabs bitLabs = BitLabs.INSTANCE;
        String str3 = this.networkId;
        Intrinsics.checkNotNull(str3);
        String str4 = this.surveyId;
        Intrinsics.checkNotNull(str4);
        bitLabs.leaveSurvey$library_coreRelease(str3, str4, str);
    }
}
