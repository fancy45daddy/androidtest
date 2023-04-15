package ai.bitlabs.sdk.data.model;

import ch.qos.logback.core.CoreConstants;
import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RestrictionReason.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\r¨\u0006\u001e"}, d2 = {"Lai/bitlabs/sdk/data/model/RestrictionReason;", "", "notVerified", "", "usingVpn", "bannedUntil", "", "reason", "unsupportedCountry", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannedUntil", "()Ljava/lang/String;", "getNotVerified", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getReason", "getUnsupportedCountry", "getUsingVpn", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lai/bitlabs/sdk/data/model/RestrictionReason;", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RestrictionReason {
    @SerializedName("banned_until")
    private final String bannedUntil;
    @SerializedName("not_verified")
    private final Boolean notVerified;
    private final String reason;
    @SerializedName("unsupported_country")
    private final String unsupportedCountry;
    @SerializedName("using_vpn")
    private final Boolean usingVpn;

    public static /* synthetic */ RestrictionReason copy$default(RestrictionReason restrictionReason, Boolean bool, Boolean bool2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = restrictionReason.notVerified;
        }
        if ((i & 2) != 0) {
            bool2 = restrictionReason.usingVpn;
        }
        Boolean bool3 = bool2;
        if ((i & 4) != 0) {
            str = restrictionReason.bannedUntil;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = restrictionReason.reason;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = restrictionReason.unsupportedCountry;
        }
        return restrictionReason.copy(bool, bool3, str4, str5, str3);
    }

    public final Boolean component1() {
        return this.notVerified;
    }

    public final Boolean component2() {
        return this.usingVpn;
    }

    public final String component3() {
        return this.bannedUntil;
    }

    public final String component4() {
        return this.reason;
    }

    public final String component5() {
        return this.unsupportedCountry;
    }

    public final RestrictionReason copy(Boolean bool, Boolean bool2, String str, String str2, String str3) {
        return new RestrictionReason(bool, bool2, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RestrictionReason) {
            RestrictionReason restrictionReason = (RestrictionReason) obj;
            return Intrinsics.areEqual(this.notVerified, restrictionReason.notVerified) && Intrinsics.areEqual(this.usingVpn, restrictionReason.usingVpn) && Intrinsics.areEqual(this.bannedUntil, restrictionReason.bannedUntil) && Intrinsics.areEqual(this.reason, restrictionReason.reason) && Intrinsics.areEqual(this.unsupportedCountry, restrictionReason.unsupportedCountry);
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.notVerified;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.usingVpn;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.bannedUntil;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reason;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unsupportedCountry;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "RestrictionReason(notVerified=" + this.notVerified + ", usingVpn=" + this.usingVpn + ", bannedUntil=" + ((Object) this.bannedUntil) + ", reason=" + ((Object) this.reason) + ", unsupportedCountry=" + ((Object) this.unsupportedCountry) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public RestrictionReason(Boolean bool, Boolean bool2, String str, String str2, String str3) {
        this.notVerified = bool;
        this.usingVpn = bool2;
        this.bannedUntil = str;
        this.reason = str2;
        this.unsupportedCountry = str3;
    }

    public final Boolean getNotVerified() {
        return this.notVerified;
    }

    public final Boolean getUsingVpn() {
        return this.usingVpn;
    }

    public final String getBannedUntil() {
        return this.bannedUntil;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getUnsupportedCountry() {
        return this.unsupportedCountry;
    }
}
