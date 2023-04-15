package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: StartBonus.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lai/bitlabs/sdk/data/model/StartBonus;", "", "reward", "", "(Ljava/lang/String;)V", "getReward", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StartBonus {
    private final String reward;

    public static /* synthetic */ StartBonus copy$default(StartBonus startBonus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startBonus.reward;
        }
        return startBonus.copy(str);
    }

    public final String component1() {
        return this.reward;
    }

    public final StartBonus copy(String reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        return new StartBonus(reward);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StartBonus) && Intrinsics.areEqual(this.reward, ((StartBonus) obj).reward);
    }

    public int hashCode() {
        return this.reward.hashCode();
    }

    public String toString() {
        return "StartBonus(reward=" + this.reward + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public StartBonus(String reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.reward = reward;
    }

    public final String getReward() {
        return this.reward;
    }
}
