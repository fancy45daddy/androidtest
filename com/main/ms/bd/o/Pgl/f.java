package ms.bd.o.Pgl;

import android.content.Context;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class f extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.a().b();
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }
}
