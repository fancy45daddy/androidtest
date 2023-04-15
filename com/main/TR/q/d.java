package TR.q;

import android.app.Application;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/* loaded from: classes.dex */
public final class d {
    private static final d b = new d();

    /* renamed from: a  reason: collision with root package name */
    private Properties f611a;

    private d() {
        try {
            InputStream open = TR.d.b.i().k().getAssets().open("development.conf");
            Properties properties = new Properties();
            this.f611a = properties;
            properties.load(open);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static d b() {
        return b;
    }

    public String a() {
        Properties properties;
        if (!d() || (properties = this.f611a) == null) {
            return b.f609a;
        }
        String property = properties.getProperty("host");
        return TextUtils.isEmpty(property) ? b.f609a : property;
    }

    public String c() {
        Properties properties;
        if (!d() || (properties = this.f611a) == null) {
            return "https";
        }
        String property = properties.getProperty("protocol");
        return TextUtils.isEmpty(property) ? "https" : property;
    }

    public boolean d() {
        Application k = TR.d.b.i().k();
        try {
            return (k.getPackageManager().getApplicationInfo(k.getPackageName(), 0).flags & 2) != 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
