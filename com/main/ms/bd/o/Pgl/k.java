package ms.bd.o.Pgl;

import java.util.Locale;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class k extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        String str2;
        try {
            Locale locale = pgla.a().b().getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append((String) pblk.a(16777217, 0, 0L, "b946b3", new byte[]{76}));
            sb.append(country);
            str2 = sb.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        return z0.a(str2);
    }
}
