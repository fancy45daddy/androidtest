package ms.bd.o.Pgl;

import java.util.UUID;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class x extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    protected Object a(int i, long j, String str, Object obj) throws Throwable {
        return UUID.randomUUID().toString();
    }
}
