package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BitLabsResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J@\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lai/bitlabs/sdk/data/model/BitLabsResponse;", "T", "", "data", "error", "Lai/bitlabs/sdk/data/model/Error;", "status", "", "traceId", "(Ljava/lang/Object;Lai/bitlabs/sdk/data/model/Error;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lai/bitlabs/sdk/data/model/Error;", "getStatus", "()Ljava/lang/String;", "getTraceId", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Object;Lai/bitlabs/sdk/data/model/Error;Ljava/lang/String;Ljava/lang/String;)Lai/bitlabs/sdk/data/model/BitLabsResponse;", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitLabsResponse<T> {
    private final T data;
    private final Error error;
    private final String status;
    @SerializedName("trace_id")
    private final String traceId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BitLabsResponse copy$default(BitLabsResponse bitLabsResponse, Object obj, Error error, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = bitLabsResponse.data;
        }
        if ((i & 2) != 0) {
            error = bitLabsResponse.error;
        }
        if ((i & 4) != 0) {
            str = bitLabsResponse.status;
        }
        if ((i & 8) != 0) {
            str2 = bitLabsResponse.traceId;
        }
        return bitLabsResponse.copy(obj, error, str, str2);
    }

    public final T component1() {
        return this.data;
    }

    public final Error component2() {
        return this.error;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.traceId;
    }

    public final BitLabsResponse<T> copy(T t, Error error, String status, String traceId) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        return new BitLabsResponse<>(t, error, status, traceId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BitLabsResponse) {
            BitLabsResponse bitLabsResponse = (BitLabsResponse) obj;
            return Intrinsics.areEqual(this.data, bitLabsResponse.data) && Intrinsics.areEqual(this.error, bitLabsResponse.error) && Intrinsics.areEqual(this.status, bitLabsResponse.status) && Intrinsics.areEqual(this.traceId, bitLabsResponse.traceId);
        }
        return false;
    }

    public int hashCode() {
        T t = this.data;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        Error error = this.error;
        return ((((hashCode + (error != null ? error.hashCode() : 0)) * 31) + this.status.hashCode()) * 31) + this.traceId.hashCode();
    }

    public String toString() {
        return "BitLabsResponse(data=" + this.data + ", error=" + this.error + ", status=" + this.status + ", traceId=" + this.traceId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public BitLabsResponse(T t, Error error, String status, String traceId) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        this.data = t;
        this.error = error;
        this.status = status;
        this.traceId = traceId;
    }

    public final T getData() {
        return this.data;
    }

    public final Error getError() {
        return this.error;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTraceId() {
        return this.traceId;
    }
}
