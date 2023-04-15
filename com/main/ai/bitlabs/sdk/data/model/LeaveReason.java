package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LeaveReason.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lai/bitlabs/sdk/data/model/LeaveReason;", "", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LeaveReason {
    private final String reason;

    public static /* synthetic */ LeaveReason copy$default(LeaveReason leaveReason, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leaveReason.reason;
        }
        return leaveReason.copy(str);
    }

    public final String component1() {
        return this.reason;
    }

    public final LeaveReason copy(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new LeaveReason(reason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LeaveReason) && Intrinsics.areEqual(this.reason, ((LeaveReason) obj).reason);
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public String toString() {
        return "LeaveReason(reason=" + this.reason + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public LeaveReason(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
    }

    public final String getReason() {
        return this.reason;
    }
}
