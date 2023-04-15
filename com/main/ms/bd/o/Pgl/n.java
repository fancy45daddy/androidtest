package ms.bd.o.Pgl;

import android.content.Context;
import android.content.pm.Signature;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class n extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        Context b = pgla.a().b();
        Signature[] signatureArr = b.getPackageManager().getPackageInfo(b.getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        return signatureArr[0].toByteArray();
    }
}
