package ai.bitlabs.sdk.util;

import ai.bitlabs.sdk.data.model.BitLabsResponse;
import android.util.Log;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
/* compiled from: ErrorConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\u0080\b¨\u0006\u0004"}, d2 = {"body", "Lai/bitlabs/sdk/data/model/BitLabsResponse;", "T", "Lokhttp3/ResponseBody;", "library_coreRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ErrorConverterKt {
    public static final /* synthetic */ <T> BitLabsResponse<T> body(ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "<this>");
        try {
            return (BitLabsResponse) new GsonBuilder().create().fromJson(responseBody.string(), (Type) BitLabsResponse.class);
        } catch (Exception e) {
            Log.e("BitLabs", e.toString());
            return null;
        }
    }
}
