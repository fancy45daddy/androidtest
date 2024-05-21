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
            for (final var $:(java.lang.Iterable<java.lang.String>)document.select("a.videostream__link.link").stream().map($ -> $.attr("abs:href"))::iterator)
            {
                final var rumble = org.jsoup.Jsoup.connect($).get();
                final var video = new java.net.URI(rumble.select("link[type='application/json+oembed']").attr("href")).getQuery().split("/");
                org.jsoup.Jsoup.connect($).get()
                const url = await axios.get('https://rumble.com/embedJS/u3', {params:{request:'video', ver:2, v:video, ext:globalThis.encodeURIComponent('{"ad_count":null}'), ad_wt:1}}).then(_ => _.data.a.ads.at(0).waterfall.at(0).url)


                video = video[video.length - 2];
                android.util.Log.v("1", video);
            }
            webView.loadDataWithBaseURL(null, document.title(), "text/html",  "utf-8", null);
        }
        catch (final java.lang.Exception e){}
        super.setContentView(webView);
    }  
}
