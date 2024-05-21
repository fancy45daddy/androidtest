package com.main;

public class MainActivity extends android.app.Activity   
{
    @Override  
    public void onCreate(final android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        final var webView = new android.webkit.WebView(this);
        try
        {
            final var document = org.jsoup.Jsoup.connect("https://rumble.com/user/chaowenguo1").get();
            document.select("a.videostream__link.link").stream().map($ -> $.attr("href")).forEach($ -> android.util.Log.v("1", $));
            webView.loadDataWithBaseURL(null, document.title(), "text/html",  "utf-8", null);
        }
        catch (final java.lang.Exception e){}
        super.setContentView(webView);
    }  
}
