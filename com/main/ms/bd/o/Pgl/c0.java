package ms.bd.o.Pgl;

import com.facebook.stetho.dumpapp.Framer;
import java.lang.reflect.Method;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class c0 extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    protected Object a(int i, long j, String str, Object obj) throws Throwable {
        try {
            Method method = Class.forName((String) pblk.a(16777217, 0, 0L, "173145", new byte[]{35, 58, 77, 11, 9, 59, 38, 19, 102, 96, 46, 54, 69, 11, 6, Framer.STDIN_FRAME_PREFIX, 48, 5, 103, 98, 110, 38, 69, 75, 24, Framer.STDIN_FRAME_PREFIX, 32, 88, 111, 109, 110, 24, 115, 103})).getMethod((String) pblk.a(16777217, 0, 0L, "f8f6f0", new byte[]{118}), new Class[0]);
            if (method != null) {
                return (Long) method.invoke(null, new Object[0]);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
