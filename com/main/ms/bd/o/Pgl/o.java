package ms.bd.o.Pgl;

import android.telephony.TelephonyManager;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class o extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        Boolean bool = Boolean.FALSE;
        TelephonyManager telephonyManager = (TelephonyManager) pgla.a().b().getApplicationContext().getSystemService((String) pblk.a(16777217, 0, 0L, "9f4f2e", new byte[]{56, 108, 72, 28, 8}));
        return (telephonyManager == null || telephonyManager.getSimState() != 5) ? bool : Boolean.TRUE;
    }
}
