package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Error.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lai/bitlabs/sdk/data/model/Error;", "", "details", "Lai/bitlabs/sdk/data/model/ErrorDetails;", "(Lai/bitlabs/sdk/data/model/ErrorDetails;)V", "getDetails", "()Lai/bitlabs/sdk/data/model/ErrorDetails;", "component1", Constants.COPY_TYPE, "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Error {
    private final ErrorDetails details;

    public static /* synthetic */ Error copy$default(Error error, ErrorDetails errorDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            errorDetails = error.details;
        }
        return error.copy(errorDetails);
    }

    public final ErrorDetails component1() {
        return this.details;
    }

    public final Error copy(ErrorDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        return new Error(details);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Error) && Intrinsics.areEqual(this.details, ((Error) obj).details);
    }

    public int hashCode() {
        return this.details.hashCode();
    }

    public String toString() {
        return "Error(details=" + this.details + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Error(ErrorDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.details = details;
    }

    public final ErrorDetails getDetails() {
        return this.details;
    }
}
