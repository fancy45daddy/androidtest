package TR.m;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.tapr.R;
import com.tapr.helpers.JsonKey;
import com.tapr.internal.activities.event.EventActivity;
import com.tapr.internal.activities.survey.SurveyActivity;
import com.tapr.sdk.PlacementCustomParameters;
import com.tapr.sdk.PlacementListener;
import com.tapr.sdk.SurveyListener;
import com.tapr.sdk.TRPlacement;
import com.tapr.sdk.TapEventListener;
import com.tapr.sdk.TapResearch;
import java.util.List;
/* loaded from: classes.dex */
public class f implements TRPlacement {

    /* renamed from: a  reason: collision with root package name */
    private PlacementCustomParameters f586a;
    @JsonKey("currencyName")
    private String mCurrencyName;
    @JsonKey("events")
    private List<k> mEvents;
    @JsonKey("hasHotSurvey")
    private boolean mHasHotSurvey;
    @JsonKey("isEventAvailable")
    private boolean mIsEventAvailable;
    @JsonKey("isSurveyWallAvailable")
    private boolean mIsSurveyWallAvailable;
    @JsonKey("maxPayoutInCurrency")
    private int mMaxPayout;
    @JsonKey("minSurveyLength")
    private int mMaxSurveyLength;
    @JsonKey("minPayoutInCurrency")
    private int mMinPayout;
    @JsonKey("maxSurveyLength")
    private int mMinSurveyLength;
    @JsonKey("placementCode")
    private int mPlacementCode;
    @JsonKey("placementErrorMessage")
    private String mPlacementErrorMessage;
    @JsonKey("placementIdentifier")
    private String mPlacementIdentifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements PlacementListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TapEventListener f587a;
        final /* synthetic */ f b;
        final /* synthetic */ PlacementCustomParameters c;

        /* renamed from: TR.m.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0005a implements Runnable {
            RunnableC0005a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f587a.onTapEventOpened();
            }
        }

        /* loaded from: classes.dex */
        class b implements TapEventListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TRPlacement f589a;

            b(TRPlacement tRPlacement) {
                this.f589a = tRPlacement;
            }

            @Override // com.tapr.sdk.TapEventListener
            public void onTapEventDismissed() {
            }

            @Override // com.tapr.sdk.TapEventListener
            public void onTapEventOpened() {
                TR.d.b.i().r.f.a().a(new TR.l.l("click", TR.q.b.S, Integer.valueOf(this.f589a.getPlacementOffer().d().get(0).c()), this.f589a.getPlacementOffer().d().get(0).d(), Long.valueOf(Long.parseLong(String.valueOf(System.currentTimeMillis() / 1000)))));
            }
        }

        a(TapEventListener tapEventListener, f fVar, PlacementCustomParameters placementCustomParameters) {
            this.f587a = tapEventListener;
            this.b = fVar;
            this.c = placementCustomParameters;
        }

        @Override // com.tapr.sdk.PlacementListener
        public void onPlacementReady(TRPlacement tRPlacement) {
            Activity f = TR.d.b.i().f();
            if (this.f587a != null && !f.this.mEvents.isEmpty()) {
                f.startActivity(EventActivity.a(f, this.b, this.f587a, (k) f.this.mEvents.get(0), this.c));
                new Handler(Looper.getMainLooper()).post(new RunnableC0005a());
            } else if (this.f587a != null || f.this.mEvents.isEmpty()) {
            } else {
                f.startActivity(EventActivity.a(f, this.b, new b(tRPlacement), (k) f.this.mEvents.get(0), this.c));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyListener f591a;

        c(SurveyListener surveyListener) {
            this.f591a = surveyListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f591a.onSurveyWallOpened();
        }
    }

    public f(e eVar) {
        this.mPlacementIdentifier = eVar.e();
        this.mCurrencyName = eVar.c();
        this.mPlacementErrorMessage = eVar.m();
        this.mIsSurveyWallAvailable = eVar.o();
        this.mPlacementCode = eVar.j();
        this.mMaxPayout = eVar.f();
        this.mMinPayout = eVar.h();
        this.mMaxSurveyLength = eVar.g();
        this.mMinSurveyLength = eVar.i();
        this.mHasHotSurvey = eVar.n();
        this.mEvents = eVar.d();
        this.mIsEventAvailable = isEventAvailable();
    }

    public f(e eVar, PlacementCustomParameters placementCustomParameters) {
        this(eVar);
        this.f586a = placementCustomParameters;
    }

    public f(String str, String str2) {
        this.mPlacementErrorMessage = str;
        this.mPlacementIdentifier = str2;
    }

    public f(String str, String str2, int i) {
        this(str, str2);
        this.mPlacementCode = i;
    }

    @Override // com.tapr.sdk.TRPlacement
    public void displayEvent(TapEventListener tapEventListener) {
        displayEvent(tapEventListener, null);
    }

    @Override // com.tapr.sdk.TRPlacement
    public void displayEvent(TapEventListener tapEventListener, PlacementCustomParameters placementCustomParameters) {
        try {
            if (TR.d.b.i().r.b.b().a(getPlacementIdentifier()) == null) {
                TR.q.h.c("Can't find the offer for the placement");
                this.mIsSurveyWallAvailable = false;
                return;
            }
            if (placementCustomParameters != null) {
                this.f586a = placementCustomParameters;
            }
            TapResearch.getInstance().initPlacement(getPlacementIdentifier(), new a(tapEventListener, this, placementCustomParameters));
        } catch (Exception e) {
            if (isEventAvailable()) {
                TR.q.g.a(this.mEvents.get(0), TR.q.b.T);
            }
            TR.d.b.i().b(e);
        }
    }

    @Override // com.tapr.sdk.TRPlacement
    public String getCurrencyName() {
        return this.mCurrencyName;
    }

    @Override // com.tapr.sdk.TRPlacement
    public int getMaxPayoutInCurrency() {
        return this.mMaxPayout;
    }

    @Override // com.tapr.sdk.TRPlacement
    public int getMaxSurveyLength() {
        return this.mMaxSurveyLength;
    }

    @Override // com.tapr.sdk.TRPlacement
    public int getMinPayoutInCurrency() {
        return this.mMinPayout;
    }

    @Override // com.tapr.sdk.TRPlacement
    public int getMinSurveyLength() {
        return this.mMinSurveyLength;
    }

    @Override // com.tapr.sdk.TRPlacement
    public int getPlacementCode() {
        return this.mPlacementCode;
    }

    @Override // com.tapr.sdk.TRPlacement
    public String getPlacementErrorMessage() {
        return this.mPlacementErrorMessage;
    }

    @Override // com.tapr.sdk.TRPlacement
    public String getPlacementIdentifier() {
        return this.mPlacementIdentifier;
    }

    @Override // com.tapr.sdk.TRPlacement
    public e getPlacementOffer() {
        return new e();
    }

    @Override // com.tapr.sdk.TRPlacement
    public boolean hasHotSurvey() {
        return this.mHasHotSurvey;
    }

    @Override // com.tapr.sdk.TRPlacement
    public boolean isEventAvailable() {
        return !this.mEvents.isEmpty();
    }

    @Override // com.tapr.sdk.TRPlacement
    public boolean isSurveyWallAvailable() {
        return this.mIsSurveyWallAvailable;
    }

    @Override // com.tapr.sdk.TRPlacement
    public void showSurveyWall(SurveyListener surveyListener) {
        showSurveyWall(surveyListener, null);
    }

    @Override // com.tapr.sdk.TRPlacement
    public void showSurveyWall(SurveyListener surveyListener, PlacementCustomParameters placementCustomParameters) {
        try {
            if (TR.d.b.i().f() == null) {
                TR.q.h.c("No activity found. Did you call TapResearch.configure method from your mainActivity onCreate() method?");
                return;
            }
            e a2 = TR.d.b.i().r.b.b().a(getPlacementIdentifier());
            if (a2 == null) {
                TR.q.h.c("Can't find the offer for the placement");
                this.mIsSurveyWallAvailable = false;
            } else if (!a2.o() && TR.d.b.i().t()) {
                String a3 = a2.a(TR.q.b.w);
                AlertDialog create = new AlertDialog.Builder(TR.d.b.i().f()).create();
                create.setMessage(a3);
                create.setButton(-3, TR.d.b.i().f().getString(R.string.ok_caps), new b());
                create.show();
            } else {
                String j = TR.d.b.i().j();
                if (j != null && j.equalsIgnoreCase(a2.e())) {
                    TR.q.h.a("No double wall loading");
                    return;
                }
                TR.d.b.i().r.e.a().a(a2);
                if (placementCustomParameters != null) {
                    this.f586a = placementCustomParameters;
                }
                TR.d.b.i().a(a2.e());
                Activity f = TR.d.b.i().f();
                f.startActivity(SurveyActivity.getIntent(f, this, surveyListener, this.f586a));
                if (surveyListener != null) {
                    new Handler(Looper.getMainLooper()).post(new c(surveyListener));
                }
                this.mIsSurveyWallAvailable = false;
                a2.a();
            }
        } catch (Exception e) {
            TR.d.b.i().b(e);
        }
    }

    public String toString() {
        return "Placement{PlacementIdentifier='" + this.mPlacementIdentifier + CoreConstants.SINGLE_QUOTE_CHAR + ", IsSurveyWallAvailable=" + this.mIsSurveyWallAvailable + ", PlacementCode=" + this.mPlacementCode + ", PlacementErrorMessage='" + this.mPlacementErrorMessage + CoreConstants.SINGLE_QUOTE_CHAR + ", CurrencyName='" + this.mCurrencyName + CoreConstants.SINGLE_QUOTE_CHAR + ", MaxPayout=" + this.mMaxPayout + CoreConstants.SINGLE_QUOTE_CHAR + ", MinPayout=" + this.mMinPayout + CoreConstants.SINGLE_QUOTE_CHAR + ", MinSurveyLength=" + this.mMinSurveyLength + CoreConstants.SINGLE_QUOTE_CHAR + ", MaxSurveyLength=" + this.mMaxSurveyLength + CoreConstants.SINGLE_QUOTE_CHAR + ", HasHotSurvey=" + this.mHasHotSurvey + ", Events=" + this.mEvents + CoreConstants.CURLY_RIGHT;
    }
}
