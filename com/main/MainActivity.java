package com.main;

public class MainActivity extends android.app.Activity   
{
    @Override  
    public void onCreate(final android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        final var webView = new android.webkit.WebView(this);
        webView.loadUrl("file:///android_asset/index.html");
        WebView.getSettings().setJavaScriptEnabled(true);
        WebView.loadUrl("javascript:javaCallJs(" + "'Message From Java'" + ")");
        try
        {
            try (final var a = new java.net.URL("https://httpbin.org/ip").openConnection().getInputStream())
            {
                new java.lang.String(a.readAllBytes());
            }
        }
        catch (final java.lang.Exception e){}
        super.setContentView(webView);
    }  
}
