package TR.m;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tapjoy.TapjoyConstants;
import com.tapr.helpers.JsonKey;
import com.tapr.sdk.TRReward;
import java.io.Serializable;
/* loaded from: classes.dex */
public class j implements Serializable, TRReward {

    /* renamed from: a  reason: collision with root package name */
    private static final long f593a = 652888509848757690L;
    @JsonKey(optional = {"currencyName"}, serialize = "currencyName", value = TapjoyConstants.TJC_CURRENCY_NAME)
    private String mCurrencyName;
    @JsonKey(optional = {"placementIdentifier"}, serialize = "placementIdentifier", value = "offer_identifier")
    private String mOfferIdentifier;
    @JsonKey(optional = {"payoutEventType"}, serialize = "payoutEvent", value = "payout_event_type")
    private int mPayoutType;
    @JsonKey(optional = {IronSourceConstants.EVENTS_REWARD_AMOUNT}, serialize = IronSourceConstants.EVENTS_REWARD_AMOUNT, value = "vc_reward")
    private int mRewardAmount;
    @JsonKey(optional = {"transactionIdentifier"}, serialize = "transactionIdentifier", value = "cp_identifier")
    private String mTransactionIdentifier;

    public boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && hashCode() == obj.hashCode();
    }

    @Override // com.tapr.sdk.TRReward
    public String getCurrencyName() {
        String str = this.mCurrencyName;
        return str == null ? "" : str;
    }

    @Override // com.tapr.sdk.TRReward
    public int getPayoutEvent() {
        return this.mPayoutType;
    }

    @Override // com.tapr.sdk.TRReward
    public String getPlacementIdentifier() {
        String str = this.mOfferIdentifier;
        return str == null ? "" : str;
    }

    @Override // com.tapr.sdk.TRReward
    public int getRewardAmount() {
        return this.mRewardAmount;
    }

    @Override // com.tapr.sdk.TRReward
    public String getTransactionIdentifier() {
        String str = this.mTransactionIdentifier;
        return str == null ? "" : str;
    }

    public int hashCode() {
        return this.mTransactionIdentifier.hashCode();
    }
}
