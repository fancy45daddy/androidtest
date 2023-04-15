package ms.bd.o.Pgl;

import java.util.Arrays;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class z extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    protected Object a(int i, long j, String str, Object obj) throws Throwable {
        Throwable b = y0.a().b();
        return b != null ? Arrays.toString(b.getStackTrace()) : "";
    }
}
