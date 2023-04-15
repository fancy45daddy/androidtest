package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.adswizz.obfuscated.e.i;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Question.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000eHÆ\u0003J_\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006)"}, d2 = {"Lai/bitlabs/sdk/data/model/Question;", "", "networkId", "", "id", "", "country", i.ATTRIBUTE_CLOSED_CAPTION_FILE_LANGUAGE, "type", "localizedText", "answers", "", "Lai/bitlabs/sdk/data/model/Answer;", "canSkip", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getAnswers", "()Ljava/util/List;", "getCanSkip", "()Z", "getCountry", "()Ljava/lang/String;", "getId", "getLanguage", "getLocalizedText", "getNetworkId", "()I", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Question {
    private final List<Answer> answers;
    @SerializedName("can_skip")
    private final boolean canSkip;
    private final String country;
    private final String id;
    private final String language;
    @SerializedName("localized_text")
    private final String localizedText;
    @SerializedName("network_id")
    private final int networkId;
    private final String type;

    public final int component1() {
        return this.networkId;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.country;
    }

    public final String component4() {
        return this.language;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.localizedText;
    }

    public final List<Answer> component7() {
        return this.answers;
    }

    public final boolean component8() {
        return this.canSkip;
    }

    public final Question copy(int i, String id, String country, String language, String type, String localizedText, List<Answer> answers, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(localizedText, "localizedText");
        Intrinsics.checkNotNullParameter(answers, "answers");
        return new Question(i, id, country, language, type, localizedText, answers, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Question) {
            Question question = (Question) obj;
            return this.networkId == question.networkId && Intrinsics.areEqual(this.id, question.id) && Intrinsics.areEqual(this.country, question.country) && Intrinsics.areEqual(this.language, question.language) && Intrinsics.areEqual(this.type, question.type) && Intrinsics.areEqual(this.localizedText, question.localizedText) && Intrinsics.areEqual(this.answers, question.answers) && this.canSkip == question.canSkip;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.networkId * 31) + this.id.hashCode()) * 31) + this.country.hashCode()) * 31) + this.language.hashCode()) * 31) + this.type.hashCode()) * 31) + this.localizedText.hashCode()) * 31) + this.answers.hashCode()) * 31;
        boolean z = this.canSkip;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "Question(networkId=" + this.networkId + ", id=" + this.id + ", country=" + this.country + ", language=" + this.language + ", type=" + this.type + ", localizedText=" + this.localizedText + ", answers=" + this.answers + ", canSkip=" + this.canSkip + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Question(int i, String id, String country, String language, String type, String localizedText, List<Answer> answers, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(localizedText, "localizedText");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.networkId = i;
        this.id = id;
        this.country = country;
        this.language = language;
        this.type = type;
        this.localizedText = localizedText;
        this.answers = answers;
        this.canSkip = z;
    }

    public final int getNetworkId() {
        return this.networkId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getType() {
        return this.type;
    }

    public final String getLocalizedText() {
        return this.localizedText;
    }

    public final List<Answer> getAnswers() {
        return this.answers;
    }

    public final boolean getCanSkip() {
        return this.canSkip;
    }
}
