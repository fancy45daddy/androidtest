package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GetActionsResponse.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lai/bitlabs/sdk/data/model/GetActionsResponse;", "", "isNewUser", "", "startBonus", "Lai/bitlabs/sdk/data/model/StartBonus;", "restrictionReason", "Lai/bitlabs/sdk/data/model/RestrictionReason;", "surveys", "", "Lai/bitlabs/sdk/data/model/Survey;", "qualification", "Lai/bitlabs/sdk/data/model/Qualification;", "(ZLai/bitlabs/sdk/data/model/StartBonus;Lai/bitlabs/sdk/data/model/RestrictionReason;Ljava/util/List;Lai/bitlabs/sdk/data/model/Qualification;)V", "()Z", "getQualification", "()Lai/bitlabs/sdk/data/model/Qualification;", "getRestrictionReason", "()Lai/bitlabs/sdk/data/model/RestrictionReason;", "getStartBonus", "()Lai/bitlabs/sdk/data/model/StartBonus;", "getSurveys", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetActionsResponse {
    @SerializedName("is_new_user")
    private final boolean isNewUser;
    private final Qualification qualification;
    @SerializedName("restriction_reason")
    private final RestrictionReason restrictionReason;
    @SerializedName("start_bonus")
    private final StartBonus startBonus;
    private final List<Survey> surveys;

    public static /* synthetic */ GetActionsResponse copy$default(GetActionsResponse getActionsResponse, boolean z, StartBonus startBonus, RestrictionReason restrictionReason, List list, Qualification qualification, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getActionsResponse.isNewUser;
        }
        if ((i & 2) != 0) {
            startBonus = getActionsResponse.startBonus;
        }
        StartBonus startBonus2 = startBonus;
        if ((i & 4) != 0) {
            restrictionReason = getActionsResponse.restrictionReason;
        }
        RestrictionReason restrictionReason2 = restrictionReason;
        List<Survey> list2 = list;
        if ((i & 8) != 0) {
            list2 = getActionsResponse.surveys;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            qualification = getActionsResponse.qualification;
        }
        return getActionsResponse.copy(z, startBonus2, restrictionReason2, list3, qualification);
    }

    public final boolean component1() {
        return this.isNewUser;
    }

    public final StartBonus component2() {
        return this.startBonus;
    }

    public final RestrictionReason component3() {
        return this.restrictionReason;
    }

    public final List<Survey> component4() {
        return this.surveys;
    }

    public final Qualification component5() {
        return this.qualification;
    }

    public final GetActionsResponse copy(boolean z, StartBonus startBonus, RestrictionReason restrictionReason, List<Survey> surveys, Qualification qualification) {
        Intrinsics.checkNotNullParameter(surveys, "surveys");
        return new GetActionsResponse(z, startBonus, restrictionReason, surveys, qualification);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetActionsResponse) {
            GetActionsResponse getActionsResponse = (GetActionsResponse) obj;
            return this.isNewUser == getActionsResponse.isNewUser && Intrinsics.areEqual(this.startBonus, getActionsResponse.startBonus) && Intrinsics.areEqual(this.restrictionReason, getActionsResponse.restrictionReason) && Intrinsics.areEqual(this.surveys, getActionsResponse.surveys) && Intrinsics.areEqual(this.qualification, getActionsResponse.qualification);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.isNewUser;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        StartBonus startBonus = this.startBonus;
        int hashCode = (i + (startBonus == null ? 0 : startBonus.hashCode())) * 31;
        RestrictionReason restrictionReason = this.restrictionReason;
        int hashCode2 = (((hashCode + (restrictionReason == null ? 0 : restrictionReason.hashCode())) * 31) + this.surveys.hashCode()) * 31;
        Qualification qualification = this.qualification;
        return hashCode2 + (qualification != null ? qualification.hashCode() : 0);
    }

    public String toString() {
        return "GetActionsResponse(isNewUser=" + this.isNewUser + ", startBonus=" + this.startBonus + ", restrictionReason=" + this.restrictionReason + ", surveys=" + this.surveys + ", qualification=" + this.qualification + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public GetActionsResponse(boolean z, StartBonus startBonus, RestrictionReason restrictionReason, List<Survey> surveys, Qualification qualification) {
        Intrinsics.checkNotNullParameter(surveys, "surveys");
        this.isNewUser = z;
        this.startBonus = startBonus;
        this.restrictionReason = restrictionReason;
        this.surveys = surveys;
        this.qualification = qualification;
    }

    public final boolean isNewUser() {
        return this.isNewUser;
    }

    public final StartBonus getStartBonus() {
        return this.startBonus;
    }

    public final RestrictionReason getRestrictionReason() {
        return this.restrictionReason;
    }

    public final List<Survey> getSurveys() {
        return this.surveys;
    }

    public final Qualification getQualification() {
        return this.qualification;
    }
}
