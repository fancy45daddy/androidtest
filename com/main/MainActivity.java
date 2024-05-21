package com.main;

public class MainActivity extends android.app.Activity   
{
    @Override  
    public void onCreate(final android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        final var webView = new android.webkit.WebView(this);
        super.setContentView(webView);
        final var unencodedHtml = "<html><body>'%28' is the code for '('</body></html>";
        final var encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(), android.util.Base64.NO_PADDING);
        webView.loadData(encodedHtml, "text/html", "base64");
        try
        {
            try (final var a = new java.net.URL("https://rumble.com/user/chaowenguo1").openConnection().getInputStream())
            {
                android.util.Log.v("1", new java.lang.String(a.readAllBytes()));
            }
        }
        catch (final java.lang.Exception e){}
    }  
}
