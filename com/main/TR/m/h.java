package TR.m;

import com.tapr.helpers.JsonKey;
/* loaded from: classes.dex */
public class h implements Cloneable {
    @JsonKey("app_session")
    private c mAppSession;
    @JsonKey("id")
    private long mDevicePlayerid = 0;
    @JsonKey("log_level")
    private int mLogLevel;
    @JsonKey("server_to_server")
    private boolean mServerToServer;

    public c a() {
        return this.mAppSession;
    }

    public long b() {
        return this.mDevicePlayerid;
    }

    public int c() {
        return this.mLogLevel;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean d() {
        return this.mServerToServer;
    }
}
