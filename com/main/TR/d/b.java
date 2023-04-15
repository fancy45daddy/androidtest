package TR.d;

import TR.l.i;
import TR.m.h;
import TR.m.j;
import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.inmarket.m2m.internal.data.M2mConstants;
import com.singular.sdk.internal.Constants;
import com.tapr.helpers.JsonHelper;
import com.tapr.sdk.PlacementCustomParameters;
import com.tapr.sdk.PlacementEventListener;
import com.tapr.sdk.RewardCollectionListener;
import com.tapr.sdk.RewardListener;
import com.tapr.sdk.TRReward;
import java.io.IOException;
import java.io.Serializable;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    private static final b s = new b();
    private static final TR.i.b t = new e();

    /* renamed from: a  reason: collision with root package name */
    private Application f553a;
    private Activity b;
    private String c;
    private String d;
    private h e;
    private TR.m.c f;
    private Integer g;
    private String h;
    private Integer i;
    private String j;
    private boolean k;
    private RewardListener l;
    private RewardCollectionListener m;
    private boolean n;
    private String o;
    private String p;
    private HashSet<j> q = new LinkedHashSet();
    public TR.b.a r = new TR.b.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            b.s.w();
            if (activity.getClass().getSimpleName().equals("SurveyActivity")) {
                b.this.k = false;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            b.s.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: TR.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0002b implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f555a;

        C0002b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f555a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (th.getStackTrace() != null && th.getStackTrace().length > 0 && th.getStackTrace()[0].getClassName().contains(TR.a.a.b)) {
                TR.q.h.a("Handling crash " + th.getMessage());
                TR.h.b a2 = new TR.h.c("crash", b.this.f553a).a(th).a();
                b.this.r.h.b().b(a2);
                b.this.r.h.b().c(a2);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f555a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f556a;

        c(List list) {
            this.f556a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.m != null) {
                b.this.m.onDidReceiveReward(this.f556a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f557a;

        d(j jVar) {
            this.f557a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.l != null) {
                TR.q.h.a("Reward Received - " + this.f557a.getTransactionIdentifier());
                b.this.l.onDidReceiveReward(this.f557a);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements TR.i.b {

        /* renamed from: a  reason: collision with root package name */
        private static final long f558a = -8756373190436752426L;

        e() {
        }

        @Override // TR.i.b
        public void a(TR.l.g gVar, Throwable th) {
            TR.q.h.i("Failed to get rewards");
        }

        @Override // TR.i.b
        public void a(TR.l.g gVar, JSONObject jSONObject) {
            TR.q.j.a(TR.q.b.H, (Serializable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends AsyncTask<String, Integer, String> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Activity> f559a;
        private final WeakReference<Application> b;

        f(Activity activity, Application application) {
            this.f559a = new WeakReference<>(activity);
            this.b = new WeakReference<>(application);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            String str;
            try {
                if (Build.MANUFACTURER.equals("Amazon")) {
                    if (this.f559a.get() != null) {
                        ContentResolver contentResolver = this.f559a.get().getContentResolver();
                        int i = Settings.Secure.getInt(contentResolver, Constants.AMAZON_LIMIT_AD_TRACKING, 2);
                        if (i == 0) {
                            str = "advertising_id";
                        } else if (i != 2) {
                            return null;
                        } else {
                            str = "android_id";
                        }
                        return Settings.Secure.getString(contentResolver, str);
                    }
                    return null;
                } else if (this.b.get() != null) {
                    try {
                        try {
                            try {
                                Context applicationContext = this.b.get().getApplicationContext();
                                Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(applicationContext);
                                if (advertisingIdInfo != null && !advertisingIdInfo.isLimitAdTrackingEnabled()) {
                                    return advertisingIdInfo.getId();
                                }
                                return null;
                            } catch (GooglePlayServicesNotAvailableException e) {
                                e.printStackTrace();
                                return null;
                            }
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            return null;
                        } catch (IllegalStateException e3) {
                            e3.printStackTrace();
                            return null;
                        }
                    } catch (GooglePlayServicesRepairableException e4) {
                        e4.printStackTrace();
                        return null;
                    } catch (ClassNotFoundException unused) {
                        TR.q.h.i("Support Library isn't available");
                        return null;
                    }
                } else {
                    return null;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (str == null) {
                str = M2mConstants.ZERO_IDENTIFIER;
            }
            TR.q.h.a("adID - " + str);
            b.s.d = str;
            b.s.a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g implements TR.i.b {

        /* renamed from: a  reason: collision with root package name */
        private static final long f560a = -3682682526052916725L;

        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // TR.i.b
        public void a(TR.l.g gVar, Throwable th) {
            TR.q.h.i("Player request failed " + th);
        }

        @Override // TR.i.b
        public void a(TR.l.g gVar, JSONObject jSONObject) {
            if (jSONObject != null) {
                h hVar = (h) new JsonHelper().fromJson(jSONObject, h.class);
                b.i().a(hVar);
                b.i().a(hVar.a());
                TR.q.h.a(hVar.c());
            } else {
                TR.q.h.b(TR.q.b.P, "Player request return an empty response");
            }
            TR.p.b b = b.i().r.b.b();
            if (b.a() != null) {
                TR.l.e a2 = b.a();
                b.i().r.f542a.b(new TR.l.e(a2.u(), a2.l()));
                b.b();
            }
            if (b.i().q().isEmpty()) {
                TR.q.h.b(TR.q.b.P, "User Identifier is not set. Placement will not be available.");
                return;
            }
            b.i().r.d.a().c();
            b.i().m();
        }
    }

    private TR.h.b a(Exception exc) {
        if (exc.getStackTrace() == null || exc.getStackTrace().length <= 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            if (stackTraceElement.getClassName().contains(TR.a.a.b)) {
                TR.q.h.a("Handling crash " + exc.getMessage());
                return new TR.h.c("crash", this.f553a).a(exc).a();
            }
        }
        return null;
    }

    private void a(Application application, String str, String str2, String str3, PlacementEventListener placementEventListener) {
        this.f553a = application;
        this.c = str;
        this.o = str2;
        this.p = str3;
        this.r.a(application.getApplicationContext());
        this.r.d.a().b();
        this.r.d.a().a(placementEventListener);
        k().registerActivityLifecycleCallbacks(new a());
        r();
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        TR.q.h.a("Checking for a new session");
        if (!u()) {
            TR.q.h.i("Invalid API Token");
            return;
        }
        Application application = this.f553a;
        boolean z2 = true;
        if (application != null) {
            boolean z3 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - TR.q.j.c(application)) > 0;
            TR.q.h.a(String.format("new session is %b, force is %b", Boolean.valueOf(z3), Boolean.valueOf(z)));
            z2 = z3;
        }
        if (z2 || z) {
            if (application != null) {
                TR.q.j.a(application, "");
                TR.q.j.a(application, (PlacementCustomParameters) null);
            }
            this.r.h.b().b();
            if (this.d.equals("")) {
                this.r.f542a.e();
            }
            this.r.c.a().a();
        }
    }

    private void b(HashSet<j> hashSet) {
        TR.q.h.a(String.format(Locale.getDefault(), "Rewarding User: %d rewards", Integer.valueOf(hashSet.size())));
        new Handler(Looper.getMainLooper()).post(new c(Arrays.asList((TRReward[]) hashSet.toArray(new TRReward[0]))));
    }

    public static b i() {
        return s;
    }

    private void r() {
        Thread.setDefaultUncaughtExceptionHandler(new C0002b(Thread.getDefaultUncaughtExceptionHandler()));
    }

    private void s() {
        String str = (String) TR.q.j.a("version", (Class<Object>) String.class);
        if (str == null || !str.equals("2.5.5")) {
            for (String str2 : TR.q.b.N) {
                TR.q.j.a(str2, (Serializable) null);
            }
            TR.q.j.a("version", "2.5.5");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        TR.q.h.a("pause");
        TR.q.j.a(this.f553a, System.currentTimeMillis());
        this.b = null;
    }

    private void z() {
        if (this.q.isEmpty() || this.k) {
            return;
        }
        this.k = true;
        c(this.q);
    }

    public void a(int i) {
        this.g = Integer.valueOf(i);
    }

    public void a(TR.m.c cVar) {
        this.f = cVar;
    }

    public void a(h hVar) {
        this.e = hVar;
    }

    public void a(j jVar) {
        if (jVar != null) {
            this.q.add(jVar);
        }
        HashSet hashSet = (HashSet) TR.q.j.a(TR.q.b.H, (Class<Object>) this.q.getClass());
        if (hashSet != null) {
            this.q.addAll(hashSet);
        }
        TR.q.j.a(TR.q.b.H, this.q);
    }

    void a(Activity activity) {
        this.b = activity;
        if (this.d != null) {
            a(false);
            return;
        }
        try {
            new f(this.b, this.f553a).execute(new String[0]);
        } catch (Exception | NoClassDefFoundError unused) {
            TR.q.h.i("No support library is found");
            TR.q.h.a("adID - " + M2mConstants.ZERO_IDENTIFIER);
            b bVar = s;
            bVar.d = M2mConstants.ZERO_IDENTIFIER;
            bVar.a(true);
        }
    }

    public void a(Activity activity, String str, String str2, String str3) {
        a(activity, str, str2, str3, (PlacementEventListener) null);
    }

    public void a(Activity activity, String str, String str2, String str3, PlacementEventListener placementEventListener) {
        s.a(activity.getApplication(), str, str2, str3, placementEventListener);
        a(activity);
    }

    public void a(Application application, String str) {
        a(application, str, "", "", (PlacementEventListener) null);
    }

    public void a(Application application, String str, PlacementEventListener placementEventListener) {
        a(application, str, "", "", placementEventListener);
    }

    public void a(RewardCollectionListener rewardCollectionListener) {
        this.m = rewardCollectionListener;
        z();
    }

    public void a(RewardListener rewardListener) {
        this.l = rewardListener;
        z();
    }

    public void a(String str) {
        this.j = str;
    }

    public void a(HashSet<j> hashSet) {
        TR.q.h.a(String.format(Locale.getDefault(), "Rewarding User: %d rewards", Integer.valueOf(hashSet.size())));
        Iterator<j> it = hashSet.iterator();
        while (it.hasNext()) {
            new Handler(Looper.getMainLooper()).post(new d(it.next()));
        }
    }

    public void b() {
    }

    public void b(int i) {
        this.i = Integer.valueOf(i);
    }

    public void b(Activity activity) {
        this.b = activity;
    }

    public void b(Exception exc) {
        TR.h.b a2;
        TR.q.h.a("Sending crash event");
        Application application = this.f553a;
        if (application != null) {
            TR.b.a aVar = this.r;
            if (aVar.h != null) {
                aVar.a(application);
            }
        }
        TR.c.b bVar = this.r.h;
        if (bVar == null || this.f553a == null || bVar.b() == null || (a2 = a(exc)) == null) {
            return;
        }
        r();
        this.r.h.b().b(a2);
        if (this.f553a != null) {
            this.r.h.b().c(a2);
        }
    }

    public void b(String str) {
        this.h = str;
    }

    public void b(boolean z) {
        this.n = z;
    }

    public String c() {
        return this.d;
    }

    public void c(String str) {
        String q = q();
        if (q == null || !q.equals(str)) {
            TR.q.j.a(TR.q.b.I, str);
            if (e().b()) {
                x();
            }
        }
    }

    public void c(HashSet<j> hashSet) {
        if (this.m != null && this.l != null) {
            TR.q.h.c("Cannot listen to both RewardListener and RewardCollectionListener, use either RewardCollectionListener or RewardListener. Falling back to RewardListener.");
        }
        if (this.l != null && this.m == null) {
            a(hashSet);
            this.r.f542a.e(new i(t));
        }
        if (this.m != null) {
            b(hashSet);
            this.r.f542a.e(new i(t));
        } else {
            TR.q.h.c("Reward Collection is null. Your app will be notified to the legacy RewardListener.");
        }
        this.q.clear();
    }

    public String d() {
        return this.c;
    }

    public void d(String str) {
        this.d = str;
        a(true);
        this.k = false;
        i().x();
    }

    public TR.m.c e() {
        if (this.f == null) {
            this.f = new TR.m.c();
        }
        return this.f;
    }

    public Activity f() {
        return this.b;
    }

    public String g() {
        return this.o;
    }

    public String h() {
        return this.p;
    }

    public String j() {
        return this.j;
    }

    public Application k() {
        return this.f553a;
    }

    public h l() {
        if (this.e == null) {
            this.e = new h();
        }
        return this.e;
    }

    public void m() {
        this.r.f542a.e(new TR.l.h(new TR.j.a(this.q, this.l, this.m, this.k)));
    }

    public Integer n() {
        return this.g;
    }

    public String o() {
        return this.h;
    }

    public Integer p() {
        return this.i;
    }

    public String q() {
        Object a2 = TR.q.j.a(TR.q.b.I, (Class<Object>) Object.class);
        return a2 != null ? a2.toString() : "";
    }

    public boolean t() {
        Activity activity = this.b;
        return (activity == null || activity.isFinishing()) ? false : true;
    }

    public boolean u() {
        String str = this.c;
        return (str == null || str.length() <= 0 || this.c.replaceAll(StringUtils.SPACE, "").isEmpty()) ? false : true;
    }

    public boolean v() {
        return this.n;
    }

    public void x() {
        String str;
        String q = i().q();
        if (q == null) {
            str = "Login";
        } else {
            str = "Login " + q;
        }
        this.r.f542a.e(new TR.l.f(str, new g(null)));
    }

    public void y() {
        this.k = false;
    }
}
