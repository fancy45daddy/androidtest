package ai.bitlabs.sdk.data;

import ai.bitlabs.sdk.data.model.BitLabsResponse;
import ai.bitlabs.sdk.data.model.CheckSurveysResponse;
import ai.bitlabs.sdk.data.model.Error;
import ai.bitlabs.sdk.data.model.ErrorDetails;
import ai.bitlabs.sdk.data.model.GetActionsResponse;
import ai.bitlabs.sdk.data.model.LeaveReason;
import ai.bitlabs.sdk.data.model.Survey;
import ai.bitlabs.sdk.data.network.BitLabsAPI;
import ai.bitlabs.sdk.util.GlobalKt;
import ai.bitlabs.sdk.util.OnResponseListener;
import android.util.Log;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/* compiled from: BitLabsRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001b\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0002\b\u000eJ)\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\fH\u0000¢\u0006\u0002\b\u0013J%\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0018R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lai/bitlabs/sdk/data/BitLabsRepository;", "", "token", "", "uid", "(Ljava/lang/String;Ljava/lang/String;)V", "bitLabsAPI", "Lai/bitlabs/sdk/data/network/BitLabsAPI;", "kotlin.jvm.PlatformType", "checkSurveys", "", "onResponseListener", "Lai/bitlabs/sdk/util/OnResponseListener;", "", "checkSurveys$library_coreRelease", "getSurveys", "sdk", "", "Lai/bitlabs/sdk/data/model/Survey;", "getSurveys$library_coreRelease", "leaveSurvey", "networkId", "surveyId", "reason", "leaveSurvey$library_coreRelease", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitLabsRepository {
    private final BitLabsAPI bitLabsAPI;

    public BitLabsRepository(final String token, final String uid) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.bitLabsAPI = (BitLabsAPI) new Retrofit.Builder().baseUrl("https://api.bitlabs.ai/v1/").client(new OkHttpClient.Builder().addInterceptor(new Interceptor() { // from class: ai.bitlabs.sdk.data.BitLabsRepository$$ExternalSyntheticLambda0
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response m5bitLabsAPI$lambda1;
                m5bitLabsAPI$lambda1 = BitLabsRepository.m5bitLabsAPI$lambda1(token, uid, chain);
                return m5bitLabsAPI$lambda1;
            }
        }).build()).addConverterFactory(GsonConverterFactory.create()).build().create(BitLabsAPI.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bitLabsAPI$lambda-1  reason: not valid java name */
    public static final Response m5bitLabsAPI$lambda1(String token, String uid, Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(token, "$token");
        Intrinsics.checkNotNullParameter(uid, "$uid");
        return chain.proceed(chain.request().newBuilder().addHeader("X-Api-Token", token).addHeader("X-User-Id", uid).build());
    }

    public final void checkSurveys$library_coreRelease(final OnResponseListener<Boolean> onResponseListener) {
        Intrinsics.checkNotNullParameter(onResponseListener, "onResponseListener");
        this.bitLabsAPI.checkSurveys().enqueue(new Callback<BitLabsResponse<CheckSurveysResponse>>() { // from class: ai.bitlabs.sdk.data.BitLabsRepository$checkSurveys$1
            @Override // retrofit2.Callback
            public void onResponse(Call<BitLabsResponse<CheckSurveysResponse>> call, retrofit2.Response<BitLabsResponse<CheckSurveysResponse>> response) {
                BitLabsResponse bitLabsResponse;
                Error error;
                ErrorDetails details;
                CheckSurveysResponse data;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                Boolean bool = null;
                if (response.isSuccessful()) {
                    OnResponseListener<Boolean> onResponseListener2 = onResponseListener;
                    BitLabsResponse<CheckSurveysResponse> body = response.body();
                    if (body != null && (data = body.getData()) != null) {
                        bool = Boolean.valueOf(data.getHasSurveys());
                    }
                    onResponseListener2.onResponse(bool);
                    return;
                }
                ResponseBody errorBody = response.errorBody();
                if (errorBody != null) {
                    try {
                        bitLabsResponse = (BitLabsResponse) new GsonBuilder().create().fromJson(errorBody.string(), (Type) BitLabsResponse.class);
                    } catch (Exception e) {
                        Log.e("BitLabs", e.toString());
                        bitLabsResponse = null;
                    }
                    if (bitLabsResponse != null && (error = bitLabsResponse.getError()) != null && (details = error.getDetails()) != null) {
                        Log.e("BitLabs", "CheckSurvey " + details.getHttp() + " - " + details.getMsg());
                    }
                }
                onResponseListener.onResponse(null);
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<BitLabsResponse<CheckSurveysResponse>> call, Throwable t) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t, "t");
                String message = t.getMessage();
                if (message == null) {
                    message = "Unknown Error";
                }
                Log.e("BitLabs", Intrinsics.stringPlus("CheckSurvey Failure - ", message));
                onResponseListener.onResponse(null);
            }
        });
    }

    public final void leaveSurvey$library_coreRelease(String networkId, String surveyId, String reason) {
        Intrinsics.checkNotNullParameter(networkId, "networkId");
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.bitLabsAPI.leaveSurvey(networkId, surveyId, new LeaveReason(reason)).enqueue(new Callback<BitLabsResponse<Unit>>() { // from class: ai.bitlabs.sdk.data.BitLabsRepository$leaveSurvey$1
            @Override // retrofit2.Callback
            public void onResponse(Call<BitLabsResponse<Unit>> call, retrofit2.Response<BitLabsResponse<Unit>> response) {
                BitLabsResponse bitLabsResponse;
                Error error;
                ErrorDetails details;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccessful()) {
                    Log.i("BitLabs", "LeaveSurvey - Success");
                    return;
                }
                ResponseBody errorBody = response.errorBody();
                if (errorBody == null) {
                    return;
                }
                try {
                    bitLabsResponse = (BitLabsResponse) new GsonBuilder().create().fromJson(errorBody.string(), (Type) BitLabsResponse.class);
                } catch (Exception e) {
                    Log.e("BitLabs", e.toString());
                    bitLabsResponse = null;
                }
                if (bitLabsResponse == null || (error = bitLabsResponse.getError()) == null || (details = error.getDetails()) == null) {
                    return;
                }
                Log.e("BitLabs", "LeaveSurvey " + details.getHttp() + " - " + details.getMsg());
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<BitLabsResponse<Unit>> call, Throwable t) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t, "t");
                String message = t.getMessage();
                if (message == null) {
                    message = "Unknown Error";
                }
                Log.e("BitLabs", Intrinsics.stringPlus("LeaveSurvey Failure - ", message));
            }
        });
    }

    public final void getSurveys$library_coreRelease(String sdk, final OnResponseListener<List<Survey>> onResponseListener) {
        Intrinsics.checkNotNullParameter(sdk, "sdk");
        Intrinsics.checkNotNullParameter(onResponseListener, "onResponseListener");
        this.bitLabsAPI.getActions(sdk).enqueue(new Callback<BitLabsResponse<GetActionsResponse>>() { // from class: ai.bitlabs.sdk.data.BitLabsRepository$getSurveys$1
            @Override // retrofit2.Callback
            public void onResponse(Call<BitLabsResponse<GetActionsResponse>> call, retrofit2.Response<BitLabsResponse<GetActionsResponse>> response) {
                BitLabsResponse bitLabsResponse;
                Error error;
                ErrorDetails details;
                GetActionsResponse data;
                List<Survey> surveys;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                List<Survey> list = null;
                if (response.isSuccessful() && response.body() != null) {
                    BitLabsResponse<GetActionsResponse> body = response.body();
                    if (body != null && (data = body.getData()) != null && (surveys = data.getSurveys()) != null) {
                        ArrayList arrayList = surveys;
                        if (arrayList.isEmpty()) {
                            IntRange intRange = new IntRange(1, 3);
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
                            Iterator<Integer> it = intRange.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(GlobalKt.randomSurvey(((IntIterator) it).nextInt()));
                            }
                            arrayList = arrayList2;
                        }
                        list = arrayList;
                    }
                    onResponseListener.onResponse(list);
                    return;
                }
                ResponseBody errorBody = response.errorBody();
                if (errorBody != null) {
                    try {
                        bitLabsResponse = (BitLabsResponse) new GsonBuilder().create().fromJson(errorBody.string(), (Type) BitLabsResponse.class);
                    } catch (Exception e) {
                        Log.e("BitLabs", e.toString());
                        bitLabsResponse = null;
                    }
                    if (bitLabsResponse != null && (error = bitLabsResponse.getError()) != null && (details = error.getDetails()) != null) {
                        Log.e("BitLabs", "GetSurveys " + details.getHttp() + " - " + details.getMsg());
                    }
                }
                onResponseListener.onResponse(null);
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<BitLabsResponse<GetActionsResponse>> call, Throwable t) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(t, "t");
                String message = t.getMessage();
                if (message == null) {
                    message = "Unknown Error";
                }
                Log.e("BitLabs", Intrinsics.stringPlus("GetSurveys Failure - ", message));
                onResponseListener.onResponse(null);
            }
        });
    }
}
