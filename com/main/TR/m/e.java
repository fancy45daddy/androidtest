package TR.m;

import com.tapjoy.TapjoyConstants;
import com.tapr.R;
import com.tapr.helpers.JsonKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f585a;
    @JsonKey("abandon_url")
    private String mAbandonurl;
    @JsonKey("has_hot_survey")
    private boolean mHasHotSurvey;
    @JsonKey("has_offer")
    private boolean mHasOffer;
    @JsonKey("identifier")
    private String mIdentifier;
    @JsonKey("max_loi")
    private int mMaxSurveyLength;
    @JsonKey("message_hash")
    private Map<String, Object> mMessageHash;
    @JsonKey("min_loi")
    private int mMinSurveyLength;
    @JsonKey("offer_reason")
    private int mOfferReason;
    @JsonKey("offer_url")
    private String mOfferurl;
    @JsonKey("reason_comment")
    private String mReasonComment;
    @JsonKey("events")
    private List<k> mTapEvents;
    @JsonKey("polling_interval")
    private long pollingInterval;

    static {
        HashMap hashMap = new HashMap();
        f585a = hashMap;
        if (TR.d.b.i().k() != null) {
            hashMap.put(TR.q.b.v, TR.d.b.i().k().getText(R.string.default_mesaage_offer_entry).toString());
            hashMap.put(TR.q.b.w, TR.d.b.i().k().getText(R.string.message_no_offer).toString());
            hashMap.put(TR.q.b.y, TR.d.b.i().k().getText(R.string.close).toString());
            hashMap.put(TR.q.b.x, TR.d.b.i().k().getText(R.string.abdandon).toString());
            hashMap.put(TR.q.b.z, TR.d.b.i().k().getText(R.string.abandon_alert_title).toString());
            hashMap.put(TR.q.b.A, TR.d.b.i().k().getText(R.string.continue_text).toString());
            hashMap.put(TR.q.b.B, TR.d.b.i().k().getText(R.string.cancel).toString());
            hashMap.put(TR.q.b.C, TR.d.b.i().k().getText(R.string.abandon_message).toString());
        }
    }

    public String a(String str) {
        Map<String, Object> map = this.mMessageHash;
        return map == null ? f585a.get(str) : map.get(str).toString();
    }

    public void a() {
        this.mHasOffer = false;
    }

    public void a(long j) {
        this.pollingInterval = j;
    }

    public void a(List<k> list) {
        this.mTapEvents = list;
    }

    public String b() {
        String str = this.mAbandonurl;
        return str == null ? "" : str;
    }

    public void b(String str) {
        this.mOfferurl = str;
    }

    public String c() {
        Map<String, Object> map = this.mMessageHash;
        if (map == null || !map.containsKey(TapjoyConstants.TJC_CURRENCY_NAME)) {
            return "";
        }
        try {
            return this.mMessageHash.get(TapjoyConstants.TJC_CURRENCY_NAME).toString();
        } catch (NumberFormatException e) {
            TR.q.h.a("Min payout value is in the wrong format", e);
            return "";
        }
    }

    public List<k> d() {
        return this.mTapEvents;
    }

    public String e() {
        String str = this.mIdentifier;
        return str == null ? "" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.mIdentifier;
        return str != null ? str.equals(str) : str == null;
    }

    public int f() {
        Map<String, Object> map = this.mMessageHash;
        if (map == null || !map.containsKey("max_payout_in_currency")) {
            return 0;
        }
        try {
            return Integer.valueOf(this.mMessageHash.get("max_payout_in_currency").toString()).intValue();
        } catch (NumberFormatException e) {
            TR.q.h.a("Max payout value is in the wrong format", e);
            return 0;
        }
    }

    public int g() {
        return this.mMaxSurveyLength;
    }

    public int h() {
        Map<String, Object> map = this.mMessageHash;
        if (map == null || !map.containsKey("min_payout_in_currency")) {
            return 0;
        }
        try {
            return Integer.valueOf(this.mMessageHash.get("min_payout_in_currency").toString()).intValue();
        } catch (NumberFormatException e) {
            TR.q.h.a("Min payout value is in the wrong format", e);
            return 0;
        }
    }

    public int hashCode() {
        String str = this.mIdentifier;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public int i() {
        return this.mMinSurveyLength;
    }

    public int j() {
        return this.mOfferReason;
    }

    public String k() {
        String str = this.mOfferurl;
        return str == null ? "" : str;
    }

    public long l() {
        return this.pollingInterval;
    }

    public String m() {
        String str = this.mReasonComment;
        return str == null ? "" : str;
    }

    public boolean n() {
        return this.mHasHotSurvey;
    }

    public boolean o() {
        return this.mHasOffer;
    }

    public void p() {
        this.mOfferReason = 11;
        this.mReasonComment = TR.d.b.i().k().getText(R.string.abandon_url_not_found).toString();
    }
}
