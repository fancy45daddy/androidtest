package TR.q;

import android.os.Build;
/* loaded from: classes.dex */
public class a {
    private a() {
    }

    public static int a() {
        return Build.VERSION.SDK_INT;
    }

    public static boolean b() {
        return a() >= 23;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT > 26;
    }
}
