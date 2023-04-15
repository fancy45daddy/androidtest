package ms.bd.o.Pgl;

import android.content.Context;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Method;
import ms.bd.o.Pgl.pblb;
import okio.Utf8;
/* loaded from: classes10.dex */
final class f0 extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        double d;
        Context b = pgla.a().b();
        try {
            Class<?> cls = Class.forName(new String(pblz.a((String) pblk.a(16777217, 0, 0L, "f65904", new byte[]{Framer.ENTER_FRAME_PREFIX, 103, 16, 75, 89, 39, 55, 18, Framer.STDERR_FRAME_PREFIX, 56, Framer.ENTER_FRAME_PREFIX, Framer.STDOUT_FRAME_PREFIX, 16, 25, 88, 113, 51, 17, Framer.STDERR_FRAME_PREFIX, 48, Framer.ENTER_FRAME_PREFIX, 96, 20, 72, 89, 122, 51, 18, 51, 61, Framer.ENTER_FRAME_PREFIX, 97, 17, 31, 89, 38, 51, 70, Framer.STDERR_FRAME_PREFIX, 106, 37, Framer.STDOUT_FRAME_PREFIX, 16, 75, 88, 112, 55, 18, Framer.STDOUT_FRAME_PREFIX, 57, Framer.ENTER_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 17, 26, 89, 118, Framer.STDERR_FRAME_PREFIX, 69, Framer.STDOUT_FRAME_PREFIX, 57, 32, 102, 16, 75, 89, 117, 51, 78, Framer.STDERR_FRAME_PREFIX, 106, Framer.ENTER_FRAME_PREFIX, 97}))));
            Object newInstance = cls.getConstructor(Context.class).newInstance(b);
            Method declaredMethod = cls.getDeclaredMethod(new String(pblz.a((String) pblk.a(16777217, 0, 0L, "db84f7", new byte[]{35, 55, 29, 21, 14, 116, 51, 18, 62, Framer.STDERR_FRAME_PREFIX, 35, 53, 28, 18, 15, 113, Framer.STDOUT_FRAME_PREFIX, 20, Utf8.REPLACEMENT_BYTE, Framer.STDOUT_FRAME_PREFIX, 32, 48, 29, 70, 14, 119, Framer.STDOUT_FRAME_PREFIX, 22, 62, 54}))), String.class);
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[1];
            objArr[0] = new String(pblz.a((String) pblk.a(16777217, 0, 0L, "fdef88", new byte[]{Framer.ENTER_FRAME_PREFIX, 52, SignedBytes.MAX_POWER_OF_TWO, 67, 80, 123, Framer.STDERR_FRAME_PREFIX, 17, 98, 99, 32, 52, 65, 75, 85, 42, 51, 22, 98, 103, 32, 54, SignedBytes.MAX_POWER_OF_TWO, 67, 81, 124, 51, 28, 99, 98, 32, Utf8.REPLACEMENT_BYTE})));
            d = ((Double) declaredMethod.invoke(newInstance, objArr)).doubleValue();
        } catch (Throwable unused) {
            d = 0.0d;
        }
        return Integer.toString((int) d);
    }
}
