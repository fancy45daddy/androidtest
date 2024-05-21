package com.main;

public class MainActivity extends android.app.Activity   
{
    @Override  
    public void onCreate(final android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        final var webView = new android.webkit.WebView(this);
        super.setContentView(webView);
        try
        {
            try (final var a = new java.net.URL("https://rumble.com/user/chaowenguo1").openConnection().getInputStream())
            {
                webView.loadDataWithBaseURL(null, new java.lang.String(a.readAllBytes()), "text/html",  "utf-8", null)
            }
        }
        catch (final java.lang.Exception e){}
    }  
}
