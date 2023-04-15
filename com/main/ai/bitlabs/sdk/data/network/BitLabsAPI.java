package ai.bitlabs.sdk.data.network;

import ai.bitlabs.sdk.data.model.BitLabsResponse;
import ai.bitlabs.sdk.data.model.CheckSurveysResponse;
import ai.bitlabs.sdk.data.model.GetActionsResponse;
import ai.bitlabs.sdk.data.model.LeaveReason;
import kotlin.Metadata;
import kotlin.Unit;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
/* compiled from: BitLabsAPI.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J2\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'¨\u0006\u0010"}, d2 = {"Lai/bitlabs/sdk/data/network/BitLabsAPI;", "", "checkSurveys", "Lretrofit2/Call;", "Lai/bitlabs/sdk/data/model/BitLabsResponse;", "Lai/bitlabs/sdk/data/model/CheckSurveysResponse;", "getActions", "Lai/bitlabs/sdk/data/model/GetActionsResponse;", "sdk", "", "leaveSurvey", "", "networkId", "surveyId", "leaveReason", "Lai/bitlabs/sdk/data/model/LeaveReason;", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BitLabsAPI {
    @GET("client/check?platform=MOBILE")
    Call<BitLabsResponse<CheckSurveysResponse>> checkSurveys();

    @GET("client/actions?platform=MOBILE&os=ANDROID")
    Call<BitLabsResponse<GetActionsResponse>> getActions(@Query("sdk") String str);

    @POST("client/networks/{networkId}/surveys/{surveyId}/leave")
    Call<BitLabsResponse<Unit>> leaveSurvey(@Path("networkId") String str, @Path("surveyId") String str2, @Body LeaveReason leaveReason);
}
