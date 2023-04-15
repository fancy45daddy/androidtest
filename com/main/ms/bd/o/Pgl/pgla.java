package ms.bd.o.Pgl;

import android.content.Context;
/* loaded from: classes10.dex */
public final class pgla {
    private static final pgla b = new pgla();

    /* renamed from: a  reason: collision with root package name */
    private Context f12098a;

    public static pgla a() {
        return b;
    }

    public void a(Context context) {
        this.f12098a = context != null ? context.getApplicationContext() : null;
    }

    public Context b() {
        return this.f12098a;
    }
}
