package TR.d;

import TR.m.f;
import TR.q.h;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.tapr.sdk.PlacementCustomParameters;
import com.tapr.sdk.PlacementEventListener;
import com.tapr.sdk.PlacementListener;
import com.tapr.sdk.RewardCollectionListener;
import com.tapr.sdk.RewardListener;
import com.tapr.sdk.TRPlacement;
import com.tapr.sdk.TapResearch;
/* loaded from: classes.dex */
public class a extends TapResearch {
    private static final a b = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: TR.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0000a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlacementListener f549a;
        final /* synthetic */ String b;

        RunnableC0000a(PlacementListener placementListener, String str) {
            this.f549a = placementListener;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f549a.onPlacementReady(new f("Placement initialization failed, placementIdentifier is empty", this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements PlacementListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlacementListener f550a;

        /* renamed from: TR.d.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0001a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TRPlacement f551a;

            RunnableC0001a(TRPlacement tRPlacement) {
                this.f551a = tRPlacement;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f550a.onPlacementReady(this.f551a);
            }
        }

        b(PlacementListener placementListener) {
            this.f550a = placementListener;
        }

        @Override // com.tapr.sdk.PlacementListener
        public void onPlacementReady(TRPlacement tRPlacement) {
            h.a("Sending placement " + tRPlacement.getPlacementIdentifier());
            new Handler(Looper.getMainLooper()).post(new RunnableC0001a(tRPlacement));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlacementListener f552a;
        final /* synthetic */ String b;

        c(PlacementListener placementListener, String str) {
            this.f552a = placementListener;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f552a.onPlacementReady(new f("Something went wrong while pulling the placement", this.b, -1));
        }
    }

    public static a a() {
        return b;
    }

    public static TapResearch getInstance() {
        return b;
    }

    @Override // com.tapr.sdk.TapResearch
    /* renamed from: b */
    public a a(String str, Activity activity, String str2, String str3) {
        h.f("Init + " + str2);
        try {
            TR.d.b.i().a(activity, str, str2, str3);
        } catch (Exception e) {
            TR.d.b.i().b(e);
        }
        return this;
    }

    @Override // com.tapr.sdk.TapResearch
    /* renamed from: b */
    public a a(String str, Activity activity, String str2, String str3, PlacementEventListener placementEventListener) {
        h.f("Init + " + str2);
        try {
            TR.d.b.i().a(activity, str, str2, str3, placementEventListener);
        } catch (Exception e) {
            TR.d.b.i().b(e);
        }
        return this;
    }

    @Override // com.tapr.sdk.TapResearch
    /* renamed from: b */
    public a a(String str, Application application) {
        try {
            TR.d.b.i().a(application, str);
        } catch (Exception e) {
            TR.d.b.i().b(e);
        }
        return this;
    }

    @Override // com.tapr.sdk.TapResearch
    /* renamed from: b */
    public a a(String str, Application application, PlacementEventListener placementEventListener) {
        try {
            TR.d.b.i().a(application, str, placementEventListener);
        } catch (Exception e) {
            TR.d.b.i().b(e);
        }
        return this;
    }

    @Override // com.tapr.sdk.TapResearch
    public void disposePlacementListener() {
        TR.g.a a2 = TR.d.b.i().r.d.a();
        a2.e();
        a2.a((PlacementEventListener) null);
    }

    @Override // com.tapr.sdk.TapResearch
    public void initPlacement(String str, PlacementCustomParameters placementCustomParameters, PlacementListener placementListener) {
        try {
            h.a(String.format("Init placement %s", str));
            if (placementListener == null) {
                h.c("Can't initialize a Placement when placementListener == null");
                return;
            }
            if (str != null && !str.isEmpty()) {
                TR.d.b.i().r.g.a(new b(placementListener), str, placementCustomParameters);
                return;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC0000a(placementListener, str));
        } catch (Exception e) {
            TR.d.b.i().b(e);
            new Handler(Looper.getMainLooper()).post(new c(placementListener, str));
        }
    }

    @Override // com.tapr.sdk.TapResearch
    public void initPlacement(String str, PlacementListener placementListener) {
        initPlacement(str, null, placementListener);
    }

    @Override // com.tapr.sdk.TapResearch
    public void setActionBarColor(int i) {
        try {
            TR.d.b.i().a(i);
        } catch (Exception e) {
            TR.d.b.i().b(e);
        }
    }

    @Override // com.tapr.sdk.TapResearch
    public void setActionBarText(String str) {
        try {
            TR.d.b.i().b(str);
        } catch (Exception e) {
            TR.d.b.i().b(e);
        }
    }

    @Override // com.tapr.sdk.TapResearch
    public void setActionBarTextColor(int i) {
        try {
            TR.d.b.i().b(i);
        } catch (Exception e) {
            TR.d.b.i().b(e);
        }
    }

    @Override // com.tapr.sdk.TapResearch
    public void setDebugMode(boolean z) {
        h.a(z);
    }

    @Override // com.tapr.sdk.TapResearch
    public void setRewardCollectionListener(RewardCollectionListener rewardCollectionListener) {
        try {
            TR.d.b.i().a(rewardCollectionListener);
        } catch (Exception e) {
            TR.d.b.i().b(e);
        }
    }

    @Override // com.tapr.sdk.TapResearch
    public void setRewardListener(RewardListener rewardListener) {
        try {
            TR.d.b.i().a(rewardListener);
        } catch (Exception e) {
            TR.d.b.i().b(e);
        }
    }

    @Override // com.tapr.sdk.TapResearch
    public void setUniqueUserIdentifier(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    TR.d.b.i().c(str);
                }
            } catch (Exception e) {
                TR.d.b.i().b(e);
                return;
            }
        }
        h.i("userIdentifier is empty");
    }
}
