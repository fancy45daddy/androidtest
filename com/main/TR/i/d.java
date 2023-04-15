package TR.i;

import TR.i.f;
import TR.m.i;
import android.content.Context;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class d extends a implements f.b {
    private final f e;
    private final i f;

    private d() {
        f fVar = new f();
        this.e = fVar;
        i iVar = new i(TR.q.b.G);
        this.f = iVar;
        iVar.a();
        fVar.a(this);
    }

    public d(Context context) {
        this();
        this.b = context;
    }

    @Override // TR.i.a
    protected void a() {
    }

    @Override // TR.i.f.b
    public void a(TR.l.g gVar) {
        d(gVar);
    }

    @Override // TR.i.a
    public void b(TR.l.g gVar) {
        this.e.a(gVar);
    }

    @Override // TR.i.a
    protected void c() {
    }

    @Override // TR.i.a
    protected void c(TR.l.g gVar) {
    }

    @Override // TR.i.a
    protected int d() {
        return (int) TimeUnit.SECONDS.toMillis(1L);
    }

    public void e(TR.l.g gVar) {
        b(gVar);
    }

    public void f(TR.l.g gVar) {
    }
}
