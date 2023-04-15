package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.ayetstudios.publishersdk.messages.RequestOfferData;
import com.ayetstudios.publishersdk.messages.ReservationResponseMessage;
import com.tapjoy.TapjoyConstants;
import net.pubnative.lite.sdk.analytics.Reporting;
/* renamed from: j1  reason: default package */
/* loaded from: classes8.dex */
public class j1 extends AsyncTask<a0, Void, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private ReservationResponseMessage f12068a;
    private a0 b = null;
    private RequestOfferData c;
    private Context d;

    public j1(Context context, RequestOfferData requestOfferData) {
        this.d = context;
        this.c = requestOfferData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(a0... a0VarArr) {
        if (a0VarArr.length == 1) {
            this.b = a0VarArr[0];
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("" + l1.a(Reporting.Key.CAMPAIGN_ID, Integer.toString(this.c.getCampaignId())));
                sb.append(l1.a(TapjoyConstants.TJC_REDIRECT_URL, this.c.getRedirectionUrl() != null ? this.c.getRedirectionUrl() : ""));
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(l1.a("offer_identificator", this.c.getOfferIdentifier() != null ? this.c.getOfferIdentifier() : ""));
                ReservationResponseMessage reservationResponseMessage = (ReservationResponseMessage) new u().a(l1.a(this.d, "Offers/sdk_reservation", sb3.toString()), (Class<Object>) ReservationResponseMessage.class);
                this.f12068a = reservationResponseMessage;
                return Boolean.valueOf(reservationResponseMessage.getStatus().equals("success"));
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a(false, null, false, null, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        a0 a0Var = this.b;
        if (a0Var != null) {
            boolean booleanValue = bool.booleanValue();
            ReservationResponseMessage reservationResponseMessage = this.f12068a;
            String data = reservationResponseMessage != null ? reservationResponseMessage.getData() : null;
            ReservationResponseMessage reservationResponseMessage2 = this.f12068a;
            boolean isLinkCheck = reservationResponseMessage2 != null ? reservationResponseMessage2.isLinkCheck() : false;
            ReservationResponseMessage reservationResponseMessage3 = this.f12068a;
            String packageName = reservationResponseMessage3 != null ? reservationResponseMessage3.getPackageName() : null;
            ReservationResponseMessage reservationResponseMessage4 = this.f12068a;
            int checkerTimeout = reservationResponseMessage4 != null ? reservationResponseMessage4.getCheckerTimeout() : 0;
            ReservationResponseMessage reservationResponseMessage5 = this.f12068a;
            a0Var.a(booleanValue, data, isLinkCheck, packageName, checkerTimeout, reservationResponseMessage5 != null ? reservationResponseMessage5.getCampaignId() : 0);
        }
    }
}
