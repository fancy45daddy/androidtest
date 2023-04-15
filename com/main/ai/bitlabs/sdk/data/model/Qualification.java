package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.adswizz.obfuscated.e.i;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Qualification.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001d\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006+"}, d2 = {"Lai/bitlabs/sdk/data/model/Qualification;", "", "networkId", "", "questionId", "", "country", i.ATTRIBUTE_CLOSED_CAPTION_FILE_LANGUAGE, "question", "Lai/bitlabs/sdk/data/model/Question;", "isStandardProfile", "", "isStartBonus", FirebaseAnalytics.Param.SCORE, "", "sequence", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/bitlabs/sdk/data/model/Question;ZZDI)V", "getCountry", "()Ljava/lang/String;", "()Z", "getLanguage", "getNetworkId", "()I", "getQuestion", "()Lai/bitlabs/sdk/data/model/Question;", "getQuestionId", "getScore", "()D", "getSequence", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Qualification {
    private final String country;
    @SerializedName("is_standard_profile")
    private final boolean isStandardProfile;
    @SerializedName("is_start_bonus")
    private final boolean isStartBonus;
    private final String language;
    @SerializedName("network_id")
    private final int networkId;
    private final Question question;
    @SerializedName("question_id")
    private final String questionId;
    private final double score;
    private final int sequence;

    public final int component1() {
        return this.networkId;
    }

    public final String component2() {
        return this.questionId;
    }

    public final String component3() {
        return this.country;
    }

    public final String component4() {
        return this.language;
    }

    public final Question component5() {
        return this.question;
    }

    public final boolean component6() {
        return this.isStandardProfile;
    }

    public final boolean component7() {
        return this.isStartBonus;
    }

    public final double component8() {
        return this.score;
    }

    public final int component9() {
        return this.sequence;
    }

    public final Qualification copy(int i, String questionId, String country, String language, Question question, boolean z, boolean z2, double d, int i2) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(question, "question");
        return new Qualification(i, questionId, country, language, question, z, z2, d, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Qualification) {
            Qualification qualification = (Qualification) obj;
            return this.networkId == qualification.networkId && Intrinsics.areEqual(this.questionId, qualification.questionId) && Intrinsics.areEqual(this.country, qualification.country) && Intrinsics.areEqual(this.language, qualification.language) && Intrinsics.areEqual(this.question, qualification.question) && this.isStandardProfile == qualification.isStandardProfile && this.isStartBonus == qualification.isStartBonus && Intrinsics.areEqual((Object) Double.valueOf(this.score), (Object) Double.valueOf(qualification.score)) && this.sequence == qualification.sequence;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.networkId * 31) + this.questionId.hashCode()) * 31) + this.country.hashCode()) * 31) + this.language.hashCode()) * 31) + this.question.hashCode()) * 31;
        boolean z = this.isStandardProfile;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isStartBonus;
        return ((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Double.doubleToLongBits(this.score)) * 31) + this.sequence;
    }

    public String toString() {
        return "Qualification(networkId=" + this.networkId + ", questionId=" + this.questionId + ", country=" + this.country + ", language=" + this.language + ", question=" + this.question + ", isStandardProfile=" + this.isStandardProfile + ", isStartBonus=" + this.isStartBonus + ", score=" + this.score + ", sequence=" + this.sequence + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Qualification(int i, String questionId, String country, String language, Question question, boolean z, boolean z2, double d, int i2) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(question, "question");
        this.networkId = i;
        this.questionId = questionId;
        this.country = country;
        this.language = language;
        this.question = question;
        this.isStandardProfile = z;
        this.isStartBonus = z2;
        this.score = d;
        this.sequence = i2;
    }

    public final int getNetworkId() {
        return this.networkId;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Question getQuestion() {
        return this.question;
    }

    public final boolean isStandardProfile() {
        return this.isStandardProfile;
    }

    public final boolean isStartBonus() {
        return this.isStartBonus;
    }

    public final double getScore() {
        return this.score;
    }

    public final int getSequence() {
        return this.sequence;
    }
}
