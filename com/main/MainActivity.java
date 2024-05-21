package com.main;

public class MainActivity extends android.app.Activity   
{
    @Override  
    public void onCreate(final android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        final var webView = new android.webkit.WebView(this);
        super.setContentView(webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/index.html");
        webView.loadUrl("javascript:javaCallJs(" + "'Message From Java'" + ")");
        try
        {
            try (final var a = new java.net.URL("https://httpbin.org/ip").openConnection().getInputStream())
            {
                android.util.Log.v("1", new java.lang.String(a.readAllBytes()));
            }
        }
        catch (final java.lang.Exception e){}
    }  
}
