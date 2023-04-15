package TR.m;

import com.tapr.helpers.JsonKey;
/* loaded from: classes.dex */
public class c {
    @JsonKey("id")
    private long mAppsessionid = 0;

    public long a() {
        return this.mAppsessionid;
    }

    public boolean b() {
        return this.mAppsessionid > 0;
    }
}
