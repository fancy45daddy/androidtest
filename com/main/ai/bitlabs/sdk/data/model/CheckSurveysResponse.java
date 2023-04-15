package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: CheckSurveysResponse.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lai/bitlabs/sdk/data/model/CheckSurveysResponse;", "", "hasSurveys", "", "(Z)V", "getHasSurveys", "()Z", "component1", Constants.COPY_TYPE, "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckSurveysResponse {
    @SerializedName("has_surveys")
    private final boolean hasSurveys;

    public static /* synthetic */ CheckSurveysResponse copy$default(CheckSurveysResponse checkSurveysResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkSurveysResponse.hasSurveys;
        }
        return checkSurveysResponse.copy(z);
    }

    public final boolean component1() {
        return this.hasSurveys;
    }

    public final CheckSurveysResponse copy(boolean z) {
        return new CheckSurveysResponse(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckSurveysResponse) && this.hasSurveys == ((CheckSurveysResponse) obj).hasSurveys;
    }

    public int hashCode() {
        boolean z = this.hasSurveys;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "CheckSurveysResponse(hasSurveys=" + this.hasSurveys + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public CheckSurveysResponse(boolean z) {
        this.hasSurveys = z;
    }

    public final boolean getHasSurveys() {
        return this.hasSurveys;
    }
}
