package TR.q;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import com.tapr.R;
import org.apache.commons.lang3.StringUtils;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final float f612a = 4.0f;
    private static final float b = 3.0f;
    private static final float c = 2.0f;
    private static final float d = 1.5f;
    private static final float e = 1.0f;

    private e() {
    }

    public static String a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return a(str2);
        }
        return a(str) + StringUtils.SPACE + str2;
    }

    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        float f = context.getResources().getDisplayMetrics().density;
        return f >= 4.0f ? "xxxhdpi" : f >= 3.0f ? "xxhdpi" : f >= 2.0f ? "xhdpi" : f >= d ? "hdpi" : f >= 1.0f ? "mdpi" : "ldpi";
    }

    private static String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    public static String b() {
        return Resources.getSystem().getDisplayMetrics().heightPixels + " x " + Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        int i = context.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? context.getString(R.string.unknown) : context.getResources().getString(R.string.orientation_landscape) : context.getResources().getString(R.string.orientation_portrait);
    }
}
