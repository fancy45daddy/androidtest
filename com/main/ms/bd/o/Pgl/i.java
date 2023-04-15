package ms.bd.o.Pgl;

import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class i extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        int i2;
        w0 a2 = w0.a(pgla.a().b());
        a2.getClass();
        try {
            synchronized (a2) {
                i2 = a2.c();
            }
        } catch (Exception unused) {
            i2 = -1;
        }
        return "" + i2;
    }
}
