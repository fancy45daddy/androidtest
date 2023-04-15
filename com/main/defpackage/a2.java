package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: a2  reason: default package */
/* loaded from: classes2.dex */
public class a2 {
    public static Point a(Context context) {
        Point point = new Point();
        if (context instanceof Activity) {
            WindowManager windowManager = ((Activity) context).getWindowManager();
            if (Build.VERSION.SDK_INT >= 13) {
                windowManager.getDefaultDisplay().getSize(point);
                return point;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            point.x = defaultDisplay.getWidth();
            point.y = defaultDisplay.getHeight();
            return point;
        }
        point.x = context.getResources().getDisplayMetrics().widthPixels;
        point.y = context.getResources().getDisplayMetrics().heightPixels;
        return point;
    }

    private static int b(String str) {
        int intValue = Integer.valueOf(str.substring(0, 5), 36).intValue();
        int intValue2 = Integer.valueOf(str.substring(5, 10), 36).intValue();
        int i = 4;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                intValue2 = (intValue2 - a(intValue)) % 60466176;
                intValue = (intValue - a(intValue2)) % 60466176;
                i = i2;
            } else {
                return (((intValue + 60466176) % 60466176) * 60466176) + ((intValue2 + 60466176) % 60466176);
            }
        }
    }

    public static boolean c(String str) {
        return str != null;
    }

    public static String d(String str) {
        String str2 = "";
        for (int i = 0; i < 32; i++) {
            char charAt = str.charAt(i);
            str2 = str2 + Integer.toHexString(charAt);
        }
        return str2;
    }

    public static boolean b(Activity activity) {
        return activity.getResources().getConfiguration().orientation != 1;
    }

    public static boolean b(Context context) {
        try {
            NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
            return networkInfo != null && networkInfo.isConnected();
        } catch (Exception e) {
            e.getMessage();
            return true;
        }
    }

    public static String a(String str, String str2, String str3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(a(d(str2 + str3 + "f6a9db28a9b9c9d0d5a265d625a77fa5")), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(1, secretKeySpec, cipher.getParameters());
            return a(cipher.doFinal(str.getBytes()));
        } catch (Exception unused) {
            return "";
        }
    }

    public static byte[] a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r7.length() < 1) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "~"
            java.lang.String r1 = ""
            if (r7 == 0) goto Le
            int r2 = r7.length()     // Catch: java.lang.Exception -> L9b
            r3 = 1
            if (r2 >= r3) goto L1c
        Le:
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L9b
            java.lang.String r7 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r7)     // Catch: java.lang.Exception -> L9b
            java.lang.String r7 = defpackage.v.a(r5)     // Catch: java.lang.Exception -> L9b
        L1c:
            java.lang.String r5 = "ZU1E9GRG6QHR9FRWK3E6I7X6R9S85IQPVGIMGEZWZU1E9GRG6QI7X6R9S85IYG259D31WQ86FR0P0XG0GZHURAIJGM93R90FH6YOI7X6R9S85I93R90FH6YOI7X6R9S85IR6J7IZOJR8QKBJII1PESHLPIRS5DT2PY3VI0EV2C7VBX0G7I9S05589PKVCYZ29T9UPW96ZU1E9GRG6QHR9FRWK3E6QPVGIMGEZWZU1E9GRG6QI7X6R9S85IQPVGIMGEZWFR2IRB8URQ8SNF06NRSG05589PKVCY"
            r2 = r1
        L1f:
            int r3 = r5.length()     // Catch: java.lang.Exception -> L9b
            if (r3 <= 0) goto L53
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9b
            r3.<init>()     // Catch: java.lang.Exception -> L9b
            int r4 = r5.length()     // Catch: java.lang.Exception -> L9b
            int r4 = r4 + (-10)
            java.lang.String r4 = r5.substring(r4)     // Catch: java.lang.Exception -> L9b
            int r4 = b(r4)     // Catch: java.lang.Exception -> L9b
            char r4 = (char) r4     // Catch: java.lang.Exception -> L9b
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L9b
            r3.append(r4)     // Catch: java.lang.Exception -> L9b
            r3.append(r2)     // Catch: java.lang.Exception -> L9b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L9b
            r3 = 0
            int r4 = r5.length()     // Catch: java.lang.Exception -> L9b
            int r4 = r4 + (-10)
            java.lang.String r5 = r5.substring(r3, r4)     // Catch: java.lang.Exception -> L9b
            goto L1f
        L53:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9b
            r5.<init>()     // Catch: java.lang.Exception -> L9b
            r5.append(r7)     // Catch: java.lang.Exception -> L9b
            r5.append(r6)     // Catch: java.lang.Exception -> L9b
            r5.append(r2)     // Catch: java.lang.Exception -> L9b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L9b
            java.lang.String r5 = defpackage.v.a(r5)     // Catch: java.lang.Exception -> L9b
            java.lang.String r5 = r5.toLowerCase()     // Catch: java.lang.Exception -> L9b
            java.lang.String r5 = a(r5, r8, r7)     // Catch: java.lang.Exception -> L9b
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Exception -> L9b
            r6 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)     // Catch: java.lang.Exception -> L9b
            java.lang.String r6 = "+"
            java.lang.String r7 = "-"
            java.lang.String r5 = r5.replace(r6, r7)     // Catch: java.lang.Exception -> L97
            java.lang.String r6 = "/"
            java.lang.String r7 = "_"
            java.lang.String r5 = r5.replace(r6, r7)     // Catch: java.lang.Exception -> L97
            java.lang.String r6 = "="
            java.lang.String r5 = r5.replace(r6, r0)     // Catch: java.lang.Exception -> L97
            java.lang.String r5 = r5.replace(r0, r1)     // Catch: java.lang.Exception -> L97
            goto La0
        L97:
            r6 = move-exception
            r1 = r5
            r5 = r6
            goto L9c
        L9b:
            r5 = move-exception
        L9c:
            r5.getMessage()
            r5 = r1
        La0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private static int a(int i) {
        int i2 = (i + 23878) % 60466176;
        int i3 = 4;
        while (true) {
            int i4 = i3 - 1;
            if (i3 == 0) {
                return i2;
            }
            i2 = ((i2 * 13) + 1361423303) % 60466176;
            i3 = i4;
        }
    }

    public static boolean a(Activity activity) {
        try {
            return ViewConfiguration.get(activity).hasPermanentMenuKey();
        } catch (Exception unused) {
            return true;
        }
    }

    public static int a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
