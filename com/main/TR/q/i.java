package TR.q;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.tapr.R;
import com.vungle.warren.VungleApiClient;
/* loaded from: classes.dex */
public final class i {
    private i() {
    }

    public static String a(Context context) {
        if (context == null) {
            return "Unknown";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : context.getString(R.string.unknown);
    }

    private static boolean a(int i, int i2) {
        if (i == 1) {
            return true;
        }
        if (i == 0) {
            switch (i2) {
                case 3:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                case 4:
                case 5:
                case 7:
                case 11:
                default:
                    return false;
            }
        }
        return false;
    }

    public static String b(Context context) {
        NetworkInfo c = c(context);
        if (c == null) {
            return context != null ? context.getString(R.string.unknown) : "unknown";
        } else if (c.getType() == 1) {
            return "wifi";
        } else {
            if (c.getType() == 0) {
                switch (c.getSubtype()) {
                    case 1:
                        return VungleApiClient.ConnectionTypeDetail.GPRS;
                    case 2:
                        return VungleApiClient.ConnectionTypeDetail.EDGE;
                    case 3:
                        return "umts";
                    case 4:
                        return "cdma";
                    case 5:
                        return "evdo-0";
                    case 6:
                        return "evdo-a";
                    case 7:
                        return "1xrtt";
                    case 8:
                        return VungleApiClient.ConnectionTypeDetail.HSDPA;
                    case 9:
                        return VungleApiClient.ConnectionTypeDetail.HSUPA;
                    case 10:
                        return "hspa";
                    case 11:
                        return "iden";
                    case 12:
                        return "evdo-b";
                    case 13:
                        return "lte";
                    case 14:
                        return "ehrpd";
                    case 15:
                        return "hspap";
                }
            }
            return context.getString(R.string.unknown);
        }
    }

    private static NetworkInfo c(Context context) {
        if (context == null) {
            return null;
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static boolean d(Context context) {
        NetworkInfo c = c(context);
        return c != null && c.isConnected();
    }

    public static boolean e(Context context) {
        NetworkInfo c = c(context);
        return c != null && c.isConnected() && a(c.getType(), c.getSubtype());
    }

    public static boolean f(Context context) {
        NetworkInfo c = c(context);
        return c != null && c.isConnected() && c.getType() == 0;
    }

    public static boolean g(Context context) {
        NetworkInfo c = c(context);
        return c != null && c.isConnected() && c.getType() == 1;
    }
}
