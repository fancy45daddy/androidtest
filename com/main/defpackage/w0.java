package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ayetstudios.publishersdk.messages.ResultStruct;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: w0  reason: default package */
/* loaded from: classes8.dex */
public class w0 extends WebView {

    /* renamed from: a  reason: collision with root package name */
    private Activity f12150a;
    private int b;
    private String c;
    public ResultStruct d;
    public HashMap<Integer, Boolean> e;
    private boolean f;
    private u0 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0$a */
    /* loaded from: classes8.dex */
    public class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12151a;
        final /* synthetic */ WebView b;

        a(int i, WebView webView) {
            this.f12151a = i;
            this.b = webView;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            int i2 = message.what;
            if (i2 == 0) {
                ResultStruct resultStruct = w0.this.d;
                resultStruct.cleanRun = true;
                if (resultStruct.pages.size() > 0) {
                    ResultStruct resultStruct2 = w0.this.d;
                    ArrayList<ResultStruct.Page> arrayList = resultStruct2.pages;
                    resultStruct2.finalUrl = arrayList.get(arrayList.size() - 1).getUrl();
                }
                if (w0.this.f) {
                    return;
                }
                w0.this.b();
            } else if (i2 == 1 || i2 == 2) {
                if (i2 == 2 || System.currentTimeMillis() - w0.this.d.lastPageStart > this.f12151a / 2) {
                    boolean z = false;
                    if (message.what == 2) {
                        w0.this.d.cleanRun = false;
                    } else {
                        w0.this.d.cleanRun = (this.b.getProgress() == 100 || System.currentTimeMillis() - w0.this.d.lastPageFinished > ((long) ((int) (((double) this.f12151a) / 2.5d)))) ? true : true;
                    }
                    ResultStruct resultStruct3 = w0.this.d;
                    resultStruct3.finalUrl = "";
                    if (resultStruct3.pages.size() > 0) {
                        ResultStruct resultStruct4 = w0.this.d;
                        ArrayList<ResultStruct.Page> arrayList2 = resultStruct4.pages;
                        resultStruct4.finalUrl = arrayList2.get(arrayList2.size() - 1).getUrl();
                    }
                    if (w0.this.f) {
                        return;
                    }
                    w0.this.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0$b */
    /* loaded from: classes8.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f12152a;
        final /* synthetic */ Handler b;

        b(w0 w0Var, int i, Handler handler) {
            this.f12152a = i;
            this.b = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f12152a / 1000; i++) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.b.sendEmptyMessage(1);
            }
            this.b.sendEmptyMessage(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0$c */
    /* loaded from: classes8.dex */
    public class c extends WebChromeClient {

        /* renamed from: w0$c$a */
        /* loaded from: classes8.dex */
        class a extends WebViewClient {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f12154a;

            a(int i) {
                this.f12154a = i;
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                webView.getId();
                if (!w0.this.e.containsKey(Integer.valueOf(webView.getId()))) {
                    w0.this.a(str, this.f12154a);
                    w0.this.e.put(Integer.valueOf(webView.getId()), Boolean.TRUE);
                }
                super.onPageStarted(webView, str, bitmap);
            }
        }

        c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            webView.getOriginalUrl();
            webView.getUrl();
            message.toString();
            WebView webView2 = new WebView(w0.this.f12150a);
            webView2.setId((int) (Math.random() * 100000.0d));
            int size = w0.this.d.pages.size() - 1;
            for (int i = 0; i < w0.this.d.pages.size(); i++) {
                if (w0.this.d.pages.get(i).getUrl() == webView.getUrl()) {
                    size = i;
                }
            }
            webView2.setWebViewClient(new a(size));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (w0.this.d.pages.size() > 0) {
                ArrayList<ResultStruct.Page> arrayList = w0.this.d.pages;
                ArrayList<String> arrayList2 = arrayList.get(arrayList.size() - 1).statuses;
                arrayList2.add("alert|" + str2);
            }
            jsResult.cancel();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0$d */
    /* loaded from: classes8.dex */
    public class d extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f12155a;

        d(Handler handler) {
            this.f12155a = handler;
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            super.onFormResubmission(webView, message, message2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            webResourceRequest.toString();
            webResourceResponse.toString();
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            webResourceRequest.toString();
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            super.onPageCommitVisible(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ResultStruct resultStruct = w0.this.d;
            resultStruct.cleanRun = true;
            resultStruct.finalUrl = str;
            resultStruct.lastPageFinished = System.currentTimeMillis();
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (w0.this.d.pages.size() > 0) {
                ArrayList<ResultStruct.Page> arrayList = w0.this.d.pages;
                ArrayList<String> arrayList2 = arrayList.get(arrayList.size() - 1).statuses;
                arrayList2.add("error|" + i + "|" + str);
            }
            super.onReceivedError(webView, i, str, str2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
            if (r0.get(r0.size() - 1).getUrl().equalsIgnoreCase(r7) != false) goto L12;
         */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean shouldOverrideUrlLoading(android.webkit.WebView r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r0 = "http"
                boolean r0 = r7.startsWith(r0)
                if (r0 == 0) goto L10
                java.lang.String r0 = "https://play.google.com"
                boolean r0 = r7.startsWith(r0)
                if (r0 == 0) goto L5f
            L10:
                w0 r0 = defpackage.w0.this
                com.ayetstudios.publishersdk.messages.ResultStruct r0 = r0.d
                java.util.ArrayList<com.ayetstudios.publishersdk.messages.ResultStruct$Page> r0 = r0.pages
                int r0 = r0.size()
                r1 = 1
                r2 = 0
                if (r0 <= 0) goto L3a
                w0 r0 = defpackage.w0.this
                com.ayetstudios.publishersdk.messages.ResultStruct r0 = r0.d
                java.util.ArrayList<com.ayetstudios.publishersdk.messages.ResultStruct$Page> r0 = r0.pages
                int r3 = r0.size()
                int r3 = r3 - r1
                java.lang.Object r0 = r0.get(r3)
                com.ayetstudios.publishersdk.messages.ResultStruct$Page r0 = (com.ayetstudios.publishersdk.messages.ResultStruct.Page) r0
                java.lang.String r0 = r0.getUrl()
                boolean r0 = r0.equalsIgnoreCase(r7)
                if (r0 == 0) goto L3a
                goto L3b
            L3a:
                r1 = 0
            L3b:
                if (r1 != 0) goto L5a
                w0 r0 = defpackage.w0.this
                com.ayetstudios.publishersdk.messages.ResultStruct r0 = r0.d
                java.util.ArrayList<com.ayetstudios.publishersdk.messages.ResultStruct$Page> r0 = r0.pages
                com.ayetstudios.publishersdk.messages.ResultStruct$Page r1 = new com.ayetstudios.publishersdk.messages.ResultStruct$Page
                com.ayetstudios.publishersdk.messages.ResultStruct r3 = new com.ayetstudios.publishersdk.messages.ResultStruct
                r3.<init>()
                r1.<init>(r7)
                r0.add(r1)
                w0 r0 = defpackage.w0.this
                com.ayetstudios.publishersdk.messages.ResultStruct r0 = r0.d
                long r3 = java.lang.System.currentTimeMillis()
                r0.lastPageStart = r3
            L5a:
                android.os.Handler r0 = r5.f12155a
                r0.sendEmptyMessage(r2)
            L5f:
                boolean r6 = super.shouldOverrideUrlLoading(r6, r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.w0.d.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
            if (r0.get(r0.size() - 1).getUrl().equalsIgnoreCase(r5) != false) goto L5;
         */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onPageStarted(android.webkit.WebView r4, java.lang.String r5, android.graphics.Bitmap r6) {
            /*
                r3 = this;
                w0 r0 = defpackage.w0.this
                com.ayetstudios.publishersdk.messages.ResultStruct r0 = r0.d
                java.util.ArrayList<com.ayetstudios.publishersdk.messages.ResultStruct$Page> r0 = r0.pages
                int r0 = r0.size()
                r1 = 1
                if (r0 <= 0) goto L29
                w0 r0 = defpackage.w0.this
                com.ayetstudios.publishersdk.messages.ResultStruct r0 = r0.d
                java.util.ArrayList<com.ayetstudios.publishersdk.messages.ResultStruct$Page> r0 = r0.pages
                int r2 = r0.size()
                int r2 = r2 - r1
                java.lang.Object r0 = r0.get(r2)
                com.ayetstudios.publishersdk.messages.ResultStruct$Page r0 = (com.ayetstudios.publishersdk.messages.ResultStruct.Page) r0
                java.lang.String r0 = r0.getUrl()
                boolean r0 = r0.equalsIgnoreCase(r5)
                if (r0 == 0) goto L29
                goto L2a
            L29:
                r1 = 0
            L2a:
                if (r1 != 0) goto L49
                w0 r0 = defpackage.w0.this
                com.ayetstudios.publishersdk.messages.ResultStruct r0 = r0.d
                java.util.ArrayList<com.ayetstudios.publishersdk.messages.ResultStruct$Page> r0 = r0.pages
                com.ayetstudios.publishersdk.messages.ResultStruct$Page r1 = new com.ayetstudios.publishersdk.messages.ResultStruct$Page
                com.ayetstudios.publishersdk.messages.ResultStruct r2 = new com.ayetstudios.publishersdk.messages.ResultStruct
                r2.<init>()
                r1.<init>(r5)
                r0.add(r1)
                w0 r0 = defpackage.w0.this
                com.ayetstudios.publishersdk.messages.ResultStruct r0 = r0.d
                long r1 = java.lang.System.currentTimeMillis()
                r0.lastPageStart = r1
            L49:
                super.onPageStarted(r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.w0.d.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            webResourceRequest.toString();
            webResourceError.toString();
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public w0(int i, Context context, String str) {
        super(context);
        this.b = 15000;
        this.e = new HashMap<>();
        this.f = false;
        this.f12150a = (Activity) context;
        this.b = i;
        this.c = str;
        a();
    }

    public void setCallback(u0 u0Var) {
        this.g = u0Var;
    }

    protected void a(String str, int i) {
        if (i < 0 || this.d.pages.size() <= i) {
            return;
        }
        this.d.pages.get(i).popups.add(str);
    }

    protected void b() {
        ResultStruct resultStruct = this.d;
        resultStruct.numRedirects = resultStruct.pages.size() - 1;
        ResultStruct resultStruct2 = this.d;
        if (resultStruct2.numRedirects < 0) {
            resultStruct2.numRedirects = 0;
        }
        if (this.f) {
            return;
        }
        a(resultStruct2);
        this.f = true;
    }

    private void a() {
        this.d = new ResultStruct();
        clearCache(true);
        int i = this.b;
        a aVar = new a(i, this);
        new Thread(new b(this, i, aVar)).start();
        getSettings().setJavaScriptEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setSupportMultipleWindows(true);
        setWebChromeClient(new c());
        setWebViewClient(new d(aVar));
    }

    private void a(ResultStruct resultStruct) {
        resultStruct.pages.size();
        new v0(this.f12150a, new u().a(resultStruct), this.c).execute("");
        String str = null;
        try {
            if (resultStruct.pages.size() > 0) {
                ArrayList<ResultStruct.Page> arrayList = resultStruct.pages;
                str = arrayList.get(arrayList.size() - 1).getUrl();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        u0 u0Var = this.g;
        if (u0Var != null) {
            u0Var.a(str);
        }
    }
}
