package TR.i;

import TR.m.i;
import TR.q.j;
import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class g extends TR.i.a {
    private final i e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TR.l.g f577a;

        a(TR.l.g gVar) {
            this.f577a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.d(this.f577a);
        }
    }

    public g() {
        i iVar = new i(TR.q.b.F);
        this.e = iVar;
        for (TR.l.g gVar : iVar.b()) {
            e(gVar);
        }
    }

    public g(Context context) {
        this();
        this.b = context;
    }

    private void f(TR.l.g gVar) {
        if (gVar.r()) {
            c(gVar);
        } else {
            b(gVar);
        }
    }

    @Override // TR.i.a
    protected void a() {
        this.e.a();
    }

    @Override // TR.i.a
    public void b(TR.l.g gVar) {
        new Thread(new a(gVar)).start();
    }

    @Override // TR.i.a
    public void c() {
        this.e.a();
        j.a(TR.q.b.F, (Serializable) null);
    }

    @Override // TR.i.a
    protected void c(TR.l.g gVar) {
        TR.q.h.a("Removing request " + gVar.n());
        if (!gVar.q()) {
            TR.q.h.i("A non queue request is in the queue");
            return;
        }
        this.e.b(gVar);
        TR.q.h.a(String.format(Locale.getDefault(), "Requests Left: %d", Integer.valueOf(this.e.c())));
    }

    @Override // TR.i.a
    protected int d() {
        return (int) TimeUnit.SECONDS.toMillis(15L);
    }

    public void e() {
        this.f573a = false;
        f();
    }

    public void e(TR.l.g gVar) {
        TR.q.h.a("Add request - " + gVar.n());
        this.e.a(gVar);
        if (this.f573a || !TR.d.b.i().t()) {
            return;
        }
        f(gVar);
    }

    public void f() {
        Iterator it = new ArrayList(this.e.b()).iterator();
        while (it.hasNext()) {
            b((TR.l.g) it.next());
        }
    }
}
