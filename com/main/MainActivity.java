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
            final var doc = org.jsoup.Jsoup.connect("https://en.wikipedia.org/").get();
            webView.loadDataWithBaseURL(null, doc.title(), "text/html",  "utf-8", null);
        }
        catch (final java.lang.Exception e){}
    }  
}
