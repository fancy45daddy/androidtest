package TR.i;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f575a;
    private b b;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TR.l.g f576a;

        a(TR.l.g gVar) {
            this.f576a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.b != null) {
                f.this.b.a(this.f576a);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(TR.l.g gVar);
    }

    public f() {
        c();
    }

    private boolean a() {
        ExecutorService executorService = this.f575a;
        return (executorService == null || executorService.isShutdown()) ? false : true;
    }

    public void a(b bVar) {
        this.b = bVar;
    }

    public void a(TR.l.g gVar) {
        if (a()) {
            this.f575a.submit(new a(gVar));
            return;
        }
        TR.q.h.a("Executor is going down, stop sending requests - " + gVar.n());
    }

    public void b() {
        ExecutorService executorService = this.f575a;
        if (executorService != null) {
            executorService.shutdown();
            this.f575a = null;
        }
    }

    public void c() {
        if (a()) {
            this.f575a.shutdown();
            this.f575a = null;
        }
        this.f575a = Executors.newSingleThreadExecutor();
    }
}
