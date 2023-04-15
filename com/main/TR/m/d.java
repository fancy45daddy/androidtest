package TR.m;

import com.tapr.helpers.JsonKey;
/* loaded from: classes.dex */
public class d {
    @JsonKey("orientation")
    private String orientation;
    @JsonKey("platform")
    private String platform;
    @JsonKey("url")
    private String url;

    public String a() {
        return this.orientation;
    }

    public void a(String str) {
        this.orientation = str;
    }

    public String b() {
        return this.platform;
    }

    public void b(String str) {
        this.platform = str;
    }

    public String c() {
        return this.url;
    }

    public void c(String str) {
        this.url = str;
    }
}
