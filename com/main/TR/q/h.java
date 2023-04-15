package TR.q;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final int f613a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static int f = 0;
    private static final String g = "TRLogTag";
    private static boolean h;

    private h() {
    }

    private static int a(StackTraceElement[] stackTraceElementArr) {
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            if (a(stackTraceElementArr[i])) {
                return i;
            }
        }
        return 0;
    }

    private static StackTraceElement a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return a(stackTrace, a(stackTrace));
    }

    private static StackTraceElement a(StackTraceElement[] stackTraceElementArr, int i) {
        while (i < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (!a(stackTraceElement)) {
                return stackTraceElement;
            }
            i++;
        }
        return stackTraceElementArr[0];
    }

    public static void a(int i) {
        f = i;
    }

    public static void a(String str) {
        a(str, (String) null);
    }

    public static void a(String str, String str2) {
        if (h) {
            b(str);
        }
        int i = f;
        if (i == 0 || i > 1) {
            return;
        }
        g(str);
    }

    public static void a(String str, Throwable th) {
        a(str, th, null);
    }

    public static void a(String str, Throwable th, String str2) {
        String d2 = d(str);
        Log.e(e(str2), d2, th);
        int i = f;
        if (i == 0 || i > 4) {
            return;
        }
        g(d2);
    }

    public static void a(boolean z) {
        h = z;
    }

    private static boolean a(StackTraceElement stackTraceElement) {
        return stackTraceElement.getClassName().equals(b());
    }

    private static String b() {
        return h.class.getName();
    }

    private static void b(String str) {
        Log.i("TRLogTag", str);
    }

    public static void b(String str, String str2) {
        String d2 = d(str);
        Log.e(e(str2), d2);
        int i = f;
        if (i == 0 || i > 4) {
            return;
        }
        g(d2);
    }

    public static void c(String str) {
        b(str, null);
    }

    public static void c(String str, String str2) {
        String d2 = d(str);
        Log.i(e(str2), d2);
        int i = f;
        if (i == 0 || i > 2) {
            return;
        }
        g(d2);
    }

    private static String d(String str) {
        StackTraceElement a2 = a();
        String format = String.format(Locale.getDefault(), "[%s:%s:%d:tid%d] ", a2.getClassName(), a2.getMethodName(), Integer.valueOf(a2.getLineNumber()), Long.valueOf(Thread.currentThread().getId()));
        return format + str;
    }

    public static void d(String str, String str2) {
        String d2 = d(str);
        e(str2);
        int i = f;
        if (i == 0 || i > 1) {
            return;
        }
        g(d2);
    }

    private static String e(String str) {
        return TextUtils.isEmpty(str) ? "TRLogTag" : String.format("%s%s%s", "TRLogTag", HelpFormatter.DEFAULT_OPT_PREFIX, str);
    }

    public static void e(String str, String str2) {
        Log.w(e(str2), d(str));
        int i = f;
        if (i == 0 || i > 3) {
            return;
        }
        g(str);
    }

    public static void f(String str) {
        c(str, null);
    }

    private static void g(String str) {
        TR.d.b.i().r.h.b().a(new TR.h.c("log").a(str).a());
    }

    public static void h(String str) {
        d(str, null);
    }

    public static void i(String str) {
        e(str, null);
    }
}
