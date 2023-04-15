package ai.bitlabs.sdk.data.model;

import androidx.webkit.ProxyConfig;
import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ErrorDetails.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lai/bitlabs/sdk/data/model/ErrorDetails;", "", ProxyConfig.MATCH_HTTP, "", "msg", "(Ljava/lang/String;Ljava/lang/String;)V", "getHttp", "()Ljava/lang/String;", "getMsg", "component1", "component2", Constants.COPY_TYPE, "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorDetails {
    private final String http;
    private final String msg;

    public static /* synthetic */ ErrorDetails copy$default(ErrorDetails errorDetails, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorDetails.http;
        }
        if ((i & 2) != 0) {
            str2 = errorDetails.msg;
        }
        return errorDetails.copy(str, str2);
    }

    public final String component1() {
        return this.http;
    }

    public final String component2() {
        return this.msg;
    }

    public final ErrorDetails copy(String http, String msg) {
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new ErrorDetails(http, msg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorDetails) {
            ErrorDetails errorDetails = (ErrorDetails) obj;
            return Intrinsics.areEqual(this.http, errorDetails.http) && Intrinsics.areEqual(this.msg, errorDetails.msg);
        }
        return false;
    }

    public int hashCode() {
        return (this.http.hashCode() * 31) + this.msg.hashCode();
    }

    public String toString() {
        return "ErrorDetails(http=" + this.http + ", msg=" + this.msg + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ErrorDetails(String http, String msg) {
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.http = http;
        this.msg = msg;
    }

    public final String getHttp() {
        return this.http;
    }

    public final String getMsg() {
        return this.msg;
    }
}
