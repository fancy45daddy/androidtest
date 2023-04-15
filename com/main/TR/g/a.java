package TR.g;

import TR.p.d;
import TR.q.h;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tapr.sdk.PlacementEventListener;
import com.tapr.sdk.TRPlacement;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final TR.p.d f563a;
    private final HandlerThread b = new HandlerThread("polling_placements");
    private final Map<String, Runnable> c = new HashMap();
    private final Map<String, Runnable> d = new HashMap();
    private Handler e;
    private PlacementEventListener f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: TR.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0003a implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f564a;
        final /* synthetic */ TR.m.e b;

        C0003a(String str, TR.m.e eVar) {
            this.f564a = str;
            this.b = eVar;
        }

        @Override // TR.p.d.b
        public void a(TRPlacement tRPlacement, long j) {
            h.a("Placement Loaded : " + this.f564a);
            if (a.this.c.containsKey(this.f564a)) {
                a.this.e.removeCallbacks((Runnable) a.this.c.get(this.f564a));
            }
            a.this.a(tRPlacement, this.b);
            a.this.a(this.f564a, j);
            a.this.b(this.f564a, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TRPlacement f565a;

        b(TRPlacement tRPlacement) {
            this.f565a = tRPlacement;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f != null) {
                    a.this.f.placementReady(this.f565a);
                }
            } catch (Exception e) {
                TR.d.b.i().b(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f566a;

        c(String str) {
            this.f566a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f != null) {
                    a.this.f.placementUnavailable(this.f566a);
                }
            } catch (Exception e) {
                TR.d.b.i().b(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f567a;
        final /* synthetic */ long b;

        d(String str, long j) {
            this.f567a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.a("Queued Placement: " + this.f567a + " load after: " + this.b);
            a.this.a(this.f567a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f568a;
        final /* synthetic */ long b;

        e(String str, long j) {
            this.f568a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                h.a("Remove Queue: " + this.f568a + StringUtils.SPACE + (this.b * 2));
                a.this.f563a.b(this.f568a);
                a.this.b(this.f568a);
            } catch (Exception e) {
                TR.d.b.i().b(e);
            }
        }
    }

    public a(TR.p.d dVar) {
        this.f563a = dVar;
    }

    private void a(TRPlacement tRPlacement) {
        if (tRPlacement.isSurveyWallAvailable()) {
            b(tRPlacement);
        } else {
            b(tRPlacement.getPlacementIdentifier());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TRPlacement tRPlacement, TR.m.e eVar) {
        if (eVar != null && eVar.o() == tRPlacement.isSurveyWallAvailable()) {
            return;
        }
        a(tRPlacement);
    }

    private void b(TRPlacement tRPlacement) {
        new Handler(Looper.getMainLooper()).post(new b(tRPlacement));
    }

    private void c(String str) {
        a(str);
    }

    private void d(String str) {
        if (this.d.containsKey(str)) {
            this.e.removeCallbacks(this.d.get(str));
        }
        if (this.c.containsKey(str)) {
            this.e.removeCallbacks(this.c.get(str));
        }
    }

    public void a() {
        this.e.removeCallbacksAndMessages(null);
    }

    public void a(PlacementEventListener placementEventListener) {
        this.f = placementEventListener;
    }

    public void a(String str) {
        try {
            if (this.d.containsKey(str)) {
                this.e.removeCallbacks(this.d.get(str));
            }
            TR.m.e a2 = this.f563a.a(str);
            this.f563a.b(str);
            this.f563a.b(str, new C0003a(str, a2));
        } catch (Exception e2) {
            TR.d.b.i().b(e2);
        }
    }

    public void a(String str, long j) {
        d dVar = new d(str, j);
        this.d.put(str, dVar);
        this.e.postDelayed(dVar, j);
    }

    public void b() {
        if (this.b.isAlive()) {
            return;
        }
        this.b.start();
        this.e = new Handler(this.b.getLooper());
    }

    public void b(String str) {
        new Handler(Looper.getMainLooper()).post(new c(str));
    }

    public void b(String str, long j) {
        e eVar = new e(str, j);
        this.c.put(str, eVar);
        this.e.postDelayed(eVar, j * 2);
    }

    public void c() {
        if (this.b.isAlive()) {
            a();
            this.c.clear();
            this.d.clear();
        }
        this.f563a.a();
        for (String str : this.f563a.b()) {
            a(str);
        }
    }

    public void d() {
        for (String str : (String[]) this.d.keySet().toArray(new String[0])) {
            c(str);
        }
    }

    public void e() {
        for (String str : (String[]) this.d.keySet().toArray(new String[0])) {
            d(str);
        }
    }

    public boolean f() {
        if (this.b.isAlive()) {
            return this.b.quit();
        }
        return false;
    }
}
