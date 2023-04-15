package ms.bd.o.Pgl;

import android.content.Context;
/* loaded from: classes10.dex */
public class pblu {

    /* loaded from: classes10.dex */
    public interface pblb {
    }

    /* loaded from: classes10.dex */
    public interface pblc {
        void a();

        void a(Throwable th);
    }

    /* loaded from: classes10.dex */
    public interface pgla {
    }

    public static void a(Context context, String str) {
        new pblv(new pblx(), new pbls()).a(context, str, (String) null, (pblc) null);
    }

    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
