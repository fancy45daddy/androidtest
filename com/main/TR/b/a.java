package TR.b;

import TR.c.b;
import TR.c.c;
import TR.c.d;
import TR.c.e;
import TR.c.f;
import TR.i.g;
import android.content.Context;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public g f542a;
    public c b;
    public f c;
    public d d;
    public TR.c.a e;
    public e f;
    public TR.p.c g;
    public b h;

    public void a(Context context) {
        this.f542a = new g(context);
        this.h = new b(context);
        this.f = new e(this.f542a);
        c cVar = new c(this.f542a);
        this.b = cVar;
        this.c = new f(cVar.a(), this.f542a);
        this.e = new TR.c.a(this.f542a);
        this.d = new d(this.b.a());
        this.g = new TR.p.c(this.b.b());
    }
}
