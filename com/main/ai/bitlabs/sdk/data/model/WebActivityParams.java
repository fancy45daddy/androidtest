package ai.bitlabs.sdk.data.model;

import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: WebActivityParams.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0003H\u0002J\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007HÂ\u0003J=\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lai/bitlabs/sdk/data/model/WebActivityParams;", "", "token", "", "uid", "sdk", Constants.KEY_TAGS, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "<set-?>", "url", "getUrl", "()Ljava/lang/String;", "buildUrl", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebActivityParams {
    private final String sdk;
    private final Map<String, Object> tags;
    private final String token;
    private final String uid;
    private String url;

    private final String component1() {
        return this.token;
    }

    private final String component2() {
        return this.uid;
    }

    private final String component3() {
        return this.sdk;
    }

    private final Map<String, Object> component4() {
        return this.tags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebActivityParams copy$default(WebActivityParams webActivityParams, String str, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webActivityParams.token;
        }
        if ((i & 2) != 0) {
            str2 = webActivityParams.uid;
        }
        if ((i & 4) != 0) {
            str3 = webActivityParams.sdk;
        }
        if ((i & 8) != 0) {
            map = webActivityParams.tags;
        }
        return webActivityParams.copy(str, str2, str3, map);
    }

    public final WebActivityParams copy(String token, String uid, String sdk, Map<String, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new WebActivityParams(token, uid, sdk, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WebActivityParams) {
            WebActivityParams webActivityParams = (WebActivityParams) obj;
            return Intrinsics.areEqual(this.token, webActivityParams.token) && Intrinsics.areEqual(this.uid, webActivityParams.uid) && Intrinsics.areEqual(this.sdk, webActivityParams.sdk) && Intrinsics.areEqual(this.tags, webActivityParams.tags);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.token.hashCode() * 31) + this.uid.hashCode()) * 31) + this.sdk.hashCode()) * 31) + this.tags.hashCode();
    }

    public String toString() {
        return "WebActivityParams(token=" + this.token + ", uid=" + this.uid + ", sdk=" + this.sdk + ", tags=" + this.tags + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public WebActivityParams(String token, String uid, String sdk, Map<String, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.token = token;
        this.uid = uid;
        this.sdk = sdk;
        this.tags = tags;
        this.url = "";
    }

    public /* synthetic */ WebActivityParams(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? MapsKt.emptyMap() : map);
    }

    public final String getUrl() {
        String str = this.url;
        if (!(str.length() > 0)) {
            str = null;
        }
        return str == null ? buildUrl() : str;
    }

    private final String buildUrl() {
        Uri.Builder appendQueryParameter = Uri.parse("https://web.bitlabs.ai").buildUpon().appendQueryParameter("token", this.token).appendQueryParameter("uid", this.uid).appendQueryParameter("os", "ANDROID").appendQueryParameter("sdk", this.sdk);
        for (Map.Entry<String, Object> entry : this.tags.entrySet()) {
            appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue().toString());
        }
        String it = appendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.url = it;
        Intrinsics.checkNotNullExpressionValue(it, "parse(\"https://web.bitla…       .also { url = it }");
        return it;
    }
}
