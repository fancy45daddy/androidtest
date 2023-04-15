package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.current.android.feature.paypal.PaypalLoginActivity;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Answer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lai/bitlabs/sdk/data/model/Answer;", "", PaypalLoginActivity.PARAM_CODE, "", "localizedText", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getLocalizedText", "component1", "component2", Constants.COPY_TYPE, "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Answer {
    private final String code;
    @SerializedName("localized_text")
    private final String localizedText;

    public static /* synthetic */ Answer copy$default(Answer answer, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = answer.code;
        }
        if ((i & 2) != 0) {
            str2 = answer.localizedText;
        }
        return answer.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.localizedText;
    }

    public final Answer copy(String code, String localizedText) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(localizedText, "localizedText");
        return new Answer(code, localizedText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Answer) {
            Answer answer = (Answer) obj;
            return Intrinsics.areEqual(this.code, answer.code) && Intrinsics.areEqual(this.localizedText, answer.localizedText);
        }
        return false;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.localizedText.hashCode();
    }

    public String toString() {
        return "Answer(code=" + this.code + ", localizedText=" + this.localizedText + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Answer(String code, String localizedText) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(localizedText, "localizedText");
        this.code = code;
        this.localizedText = localizedText;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getLocalizedText() {
        return this.localizedText;
    }
}
