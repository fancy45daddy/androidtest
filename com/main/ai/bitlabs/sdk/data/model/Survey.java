package ai.bitlabs.sdk.data.model;

import ai.bitlabs.sdk.BitLabs;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Survey.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003Jt\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\t\u00105\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0012¨\u00066"}, d2 = {"Lai/bitlabs/sdk/data/model/Survey;", "", "networkId", "", "id", "cpi", "", "value", "loi", "", "remaining", "details", "Lai/bitlabs/sdk/data/model/Details;", "rating", "link", "missingQuestions", "(IILjava/lang/String;Ljava/lang/String;DILai/bitlabs/sdk/data/model/Details;ILjava/lang/String;Ljava/lang/Integer;)V", "getCpi", "()Ljava/lang/String;", "getDetails", "()Lai/bitlabs/sdk/data/model/Details;", "getId", "()I", "getLink", "getLoi", "()D", "getMissingQuestions", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNetworkId", "getRating", "getRemaining", "getValue", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "(IILjava/lang/String;Ljava/lang/String;DILai/bitlabs/sdk/data/model/Details;ILjava/lang/String;Ljava/lang/Integer;)Lai/bitlabs/sdk/data/model/Survey;", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "open", "", "context", "Landroid/content/Context;", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Survey {
    private final String cpi;
    private final Details details;
    private final int id;
    private final String link;
    private final double loi;
    @SerializedName("missing_questions")
    private final Integer missingQuestions;
    @SerializedName("network_id")
    private final int networkId;
    private final int rating;
    private final int remaining;
    private final String value;

    public final int component1() {
        return this.networkId;
    }

    public final Integer component10() {
        return this.missingQuestions;
    }

    public final int component2() {
        return this.id;
    }

    public final String component3() {
        return this.cpi;
    }

    public final String component4() {
        return this.value;
    }

    public final double component5() {
        return this.loi;
    }

    public final int component6() {
        return this.remaining;
    }

    public final Details component7() {
        return this.details;
    }

    public final int component8() {
        return this.rating;
    }

    public final String component9() {
        return this.link;
    }

    public final Survey copy(int i, int i2, String cpi, String value, double d, int i3, Details details, int i4, String link, Integer num) {
        Intrinsics.checkNotNullParameter(cpi, "cpi");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(link, "link");
        return new Survey(i, i2, cpi, value, d, i3, details, i4, link, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Survey) {
            Survey survey = (Survey) obj;
            return this.networkId == survey.networkId && this.id == survey.id && Intrinsics.areEqual(this.cpi, survey.cpi) && Intrinsics.areEqual(this.value, survey.value) && Intrinsics.areEqual((Object) Double.valueOf(this.loi), (Object) Double.valueOf(survey.loi)) && this.remaining == survey.remaining && Intrinsics.areEqual(this.details, survey.details) && this.rating == survey.rating && Intrinsics.areEqual(this.link, survey.link) && Intrinsics.areEqual(this.missingQuestions, survey.missingQuestions);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.networkId * 31) + this.id) * 31) + this.cpi.hashCode()) * 31) + this.value.hashCode()) * 31) + Double.doubleToLongBits(this.loi)) * 31) + this.remaining) * 31) + this.details.hashCode()) * 31) + this.rating) * 31) + this.link.hashCode()) * 31;
        Integer num = this.missingQuestions;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "Survey(networkId=" + this.networkId + ", id=" + this.id + ", cpi=" + this.cpi + ", value=" + this.value + ", loi=" + this.loi + ", remaining=" + this.remaining + ", details=" + this.details + ", rating=" + this.rating + ", link=" + this.link + ", missingQuestions=" + this.missingQuestions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Survey(int i, int i2, String cpi, String value, double d, int i3, Details details, int i4, String link, Integer num) {
        Intrinsics.checkNotNullParameter(cpi, "cpi");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(link, "link");
        this.networkId = i;
        this.id = i2;
        this.cpi = cpi;
        this.value = value;
        this.loi = d;
        this.remaining = i3;
        this.details = details;
        this.rating = i4;
        this.link = link;
        this.missingQuestions = num;
    }

    public final int getNetworkId() {
        return this.networkId;
    }

    public final int getId() {
        return this.id;
    }

    public final String getCpi() {
        return this.cpi;
    }

    public final String getValue() {
        return this.value;
    }

    public final double getLoi() {
        return this.loi;
    }

    public final int getRemaining() {
        return this.remaining;
    }

    public final Details getDetails() {
        return this.details;
    }

    public final int getRating() {
        return this.rating;
    }

    public final String getLink() {
        return this.link;
    }

    public final Integer getMissingQuestions() {
        return this.missingQuestions;
    }

    public final void open(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BitLabs.INSTANCE.launchOfferWall(context);
    }
}
