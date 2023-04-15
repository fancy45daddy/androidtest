package ai.bitlabs.sdk.util;

import kotlin.Metadata;
import net.pubnative.lite.sdk.analytics.Reporting;
/* compiled from: Listeners.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lai/bitlabs/sdk/util/OnResponseListener;", "T", "", "onResponse", "", Reporting.EventType.RESPONSE, "(Ljava/lang/Object;)V", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface OnResponseListener<T> {
    void onResponse(T t);
}
