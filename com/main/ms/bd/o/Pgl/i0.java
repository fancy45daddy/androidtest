package ms.bd.o.Pgl;

import java.util.TimeZone;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class i0 extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        String str2;
        int i2;
        TimeZone timeZone;
        try {
            timeZone = TimeZone.getDefault();
            str2 = timeZone.getID();
        } catch (Throwable unused) {
            str2 = null;
        }
        try {
            i2 = ((timeZone.getRawOffset() / 60) / 60) / 1000;
        } catch (Throwable unused2) {
            i2 = 0;
            return str2 + ((String) pblk.a(16777217, 0, 0L, "329840", new byte[]{110})) + i2;
        }
        return str2 + ((String) pblk.a(16777217, 0, 0L, "329840", new byte[]{110})) + i2;
    }
}
