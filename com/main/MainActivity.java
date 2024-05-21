package com.main;

public class MainActivity extends android.app.Activity   
{
    @Override  
    public void onCreate(final android.os.Bundle savedInstanceState) throws java.lang.Exception
    {
        super.onCreate(savedInstanceState);
        final var webView = new android.webkit.WebView(this);
        webView.loadUrl("file:///android_asset/index.html");
        try (final var a = new java.net.URL("https://httpbin.org/ip").openConnection().getInputStream())
        {
            new java.lang.String(a.readAllBytes());
        }
        super.setContentView(webView);
    }  
}
