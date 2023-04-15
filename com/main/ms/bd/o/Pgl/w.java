package ms.bd.o.Pgl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.stetho.dumpapp.Framer;
import java.lang.reflect.Method;
import ms.bd.o.Pgl.pblb;
import okio.Utf8;
/* loaded from: classes10.dex */
final class w extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    protected Object a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.a().b();
        if (b != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) b.getSystemService((String) pblk.a(16777217, 0, 0L, "6b685f", new byte[]{36, 111, 75, 66, 15, 114, Framer.ENTER_FRAME_PREFIX, 74, 113, 97, 51, 121}));
                Method declaredMethod = connectivityManager.getClass().getDeclaredMethod((String) pblk.a(16777217, 0, 0L, "517402", new byte[]{35, 54, 80, 97, 12, Framer.STDOUT_FRAME_PREFIX, Utf8.REPLACEMENT_BYTE, 6, 99, 74, Framer.ENTER_FRAME_PREFIX, 39, 83, 79, 29, 46, 31, 30, 96, 107}), new Class[0]);
                declaredMethod.setAccessible(true);
                NetworkInfo networkInfo = (NetworkInfo) declaredMethod.invoke(connectivityManager, new Object[0]);
                if (networkInfo != null) {
                    Method declaredMethod2 = networkInfo.getClass().getDeclaredMethod((String) pblk.a(16777217, 0, 0L, "e35ca4", new byte[]{125, 34, 103, 1, Framer.STDIN_REQUEST_FRAME_PREFIX, 42, 106, 19, 102, Utf8.REPLACEMENT_BYTE, 113}), new Class[0]);
                    declaredMethod2.setAccessible(true);
                    return Boolean.valueOf(((Boolean) declaredMethod2.invoke(networkInfo, new Object[0])).booleanValue());
                }
            } catch (Throwable unused) {
            }
        }
        return Boolean.FALSE;
    }
}
