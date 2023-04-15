package ms.bd.o.Pgl;

import android.content.Context;
import android.util.DisplayMetrics;
/* loaded from: classes10.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private static int f12104a;

    public static String a(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                f12104a = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable unused) {
            }
        }
        return "" + f12104a;
    }
}
