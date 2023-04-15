package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.ayetstudios.publishersdk.VideoActivity;
/* renamed from: c2  reason: default package */
/* loaded from: classes3.dex */
public class c2 {

    /* renamed from: a  reason: collision with root package name */
    private Context f652a;
    private com.ayetstudios.publishersdk.b b;
    private com.ayetstudios.publishersdk.c c;

    /* renamed from: c2$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c2.this.b.loadUrl("javascript:pauseVideo()");
        }
    }

    /* renamed from: c2$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c2.this.b != null) {
                c2.this.b.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c2$c */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c2.this.f652a instanceof VideoActivity) {
                ((VideoActivity) c2.this.f652a).b();
            }
        }
    }

    public c2(Context context, com.ayetstudios.publishersdk.b bVar, com.ayetstudios.publishersdk.c cVar) {
        this.f652a = context;
        this.b = bVar;
        this.c = cVar;
    }

    @JavascriptInterface
    public void onBack() {
        Context context = this.f652a;
        if (context != null) {
            ((Activity) context).runOnUiThread(new c());
        }
    }

    @JavascriptInterface
    public void onRemainingVideoTime(float f) {
        Float.toString(f);
    }

    @JavascriptInterface
    public void onVideoDuration(float f) {
        Float.toString(f);
    }

    @JavascriptInterface
    public void openPage(String str) {
        if (str == null || str.length() < 1) {
            onBack();
        }
        try {
            this.f652a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e) {
            e.getMessage();
            onBack();
        }
        onBack();
    }

    @JavascriptInterface
    public void remainingTimeCallback(double d) {
        com.ayetstudios.publishersdk.c cVar = this.c;
        if (cVar != null) {
            cVar.a(this.f652a, d);
        }
    }

    @JavascriptInterface
    public void videoCompleted() {
        VideoActivity.l = true;
        Context context = this.f652a;
        if (context != null) {
            ((Activity) context).runOnUiThread(new b());
        }
    }

    @JavascriptInterface
    public void videoLoaded() {
        Context context = this.f652a;
        if (context != null) {
            VideoActivity.j = true;
            ((VideoActivity) context).stopProgressDialog();
        }
    }

    @JavascriptInterface
    public void videoStarted() {
        VideoActivity.k = true;
        if (VideoActivity.m) {
            Context context = this.f652a;
            if (context != null && (context instanceof VideoActivity)) {
                ((VideoActivity) context).runOnUiThread(new a());
            }
            VideoActivity.m = false;
        }
    }
}
