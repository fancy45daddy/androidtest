package ms.bd.o.Pgl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class y extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.a().b();
        ApplicationInfo applicationInfo = b.getPackageManager().getApplicationInfo(b.getPackageName(), 0);
        String str2 = applicationInfo.sourceDir;
        return str2 != null ? str2 : applicationInfo.publicSourceDir;
    }
}
