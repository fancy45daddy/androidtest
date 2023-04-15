package ai.bitlabs.sdk;

import ai.bitlabs.sdk.data.BitLabsRepository;
import ai.bitlabs.sdk.data.model.Survey;
import ai.bitlabs.sdk.data.model.WebActivityParams;
import ai.bitlabs.sdk.util.GlobalKt;
import ai.bitlabs.sdk.util.OnResponseListener;
import ai.bitlabs.sdk.util.OnRewardListener;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import ch.qos.logback.core.joran.action.Action;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.pubnative.lite.sdk.analytics.Reporting;
/* compiled from: BitLabs.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0001J\u0014\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u001a\u0010\u001c\u001a\u00020\u00152\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001aJ\u0017\u0010\u001f\u001a\u00020\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150!H\u0082\bJ\u0016\u0010\"\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rJ\u000e\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%J)\u0010&\u001a\u0004\u0018\u00010\u00152\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH\u0000¢\u0006\u0004\b*\u0010+J\u000e\u0010,\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lai/bitlabs/sdk/BitLabs;", "", "()V", "bitLabsRepo", "Lai/bitlabs/sdk/data/BitLabsRepository;", "onRewardListener", "Lai/bitlabs/sdk/util/OnRewardListener;", "getOnRewardListener$library_coreRelease", "()Lai/bitlabs/sdk/util/OnRewardListener;", "setOnRewardListener$library_coreRelease", "(Lai/bitlabs/sdk/util/OnRewardListener;)V", Constants.KEY_TAGS, "", "", "getTags", "()Ljava/util/Map;", "setTags", "(Ljava/util/Map;)V", "token", "uid", "addTag", "", Action.KEY_ATTRIBUTE, "value", "checkSurveys", "onResponseListener", "Lai/bitlabs/sdk/util/OnResponseListener;", "", "getSurveys", "", "Lai/bitlabs/sdk/data/model/Survey;", "ifInitialised", "block", "Lkotlin/Function0;", Reporting.EventType.SDK_INIT, "launchOfferWall", "context", "Landroid/content/Context;", "leaveSurvey", "networkId", "surveyId", "reason", "leaveSurvey$library_coreRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "setOnRewardListener", "library_coreRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitLabs {
    private static BitLabsRepository bitLabsRepo;
    private static OnRewardListener onRewardListener;
    public static final BitLabs INSTANCE = new BitLabs();
    private static String token = "";
    private static String uid = "";
    private static Map<String, Object> tags = new LinkedHashMap();

    private BitLabs() {
    }

    public final Map<String, Object> getTags() {
        return tags;
    }

    public final void setTags(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        tags = map;
    }

    public final OnRewardListener getOnRewardListener$library_coreRelease() {
        return onRewardListener;
    }

    public final void setOnRewardListener$library_coreRelease(OnRewardListener onRewardListener2) {
        onRewardListener = onRewardListener2;
    }

    public final void init(String token2, String uid2) {
        Intrinsics.checkNotNullParameter(token2, "token");
        Intrinsics.checkNotNullParameter(uid2, "uid");
        token = token2;
        uid = uid2;
        bitLabsRepo = new BitLabsRepository(token2, uid2);
    }

    public final void setOnRewardListener(OnRewardListener onRewardListener2) {
        Intrinsics.checkNotNullParameter(onRewardListener2, "onRewardListener");
        onRewardListener = onRewardListener2;
    }

    public final void addTag(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        tags.put(key, value);
    }

    public final Unit leaveSurvey$library_coreRelease(String networkId, String surveyId, String reason) {
        Intrinsics.checkNotNullParameter(networkId, "networkId");
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        BitLabsRepository bitLabsRepository = bitLabsRepo;
        if (bitLabsRepository == null) {
            return null;
        }
        bitLabsRepository.leaveSurvey$library_coreRelease(networkId, surveyId, reason);
        return Unit.INSTANCE;
    }

    private final void ifInitialised(Function0<Unit> function0) {
        if ((!StringsKt.isBlank(token)) & (!StringsKt.isBlank(uid)) & (bitLabsRepo != null)) {
            function0.invoke();
        } else {
            Log.e("BitLabs", "You should initialise BitLabs first! Call BitLabs::init()");
        }
    }

    public final void checkSurveys(OnResponseListener<Boolean> onResponseListener) {
        Intrinsics.checkNotNullParameter(onResponseListener, "onResponseListener");
        boolean z = (!StringsKt.isBlank(token)) & (!StringsKt.isBlank(uid));
        BitLabsRepository bitLabsRepository = bitLabsRepo;
        if (!z || !(bitLabsRepository != null)) {
            Log.e("BitLabs", "You should initialise BitLabs first! Call BitLabs::init()");
        } else if (bitLabsRepository == null) {
        } else {
            bitLabsRepository.checkSurveys$library_coreRelease(onResponseListener);
        }
    }

    public final void getSurveys(OnResponseListener<List<Survey>> onResponseListener) {
        Intrinsics.checkNotNullParameter(onResponseListener, "onResponseListener");
        boolean z = (!StringsKt.isBlank(token)) & (!StringsKt.isBlank(uid));
        BitLabsRepository bitLabsRepository = bitLabsRepo;
        if (!z || !(bitLabsRepository != null)) {
            Log.e("BitLabs", "You should initialise BitLabs first! Call BitLabs::init()");
        } else if (bitLabsRepository == null) {
        } else {
            bitLabsRepository.getSurveys$library_coreRelease("NATIVE", onResponseListener);
        }
    }

    public final void launchOfferWall(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((!StringsKt.isBlank(token)) & (!StringsKt.isBlank(uid)) & (bitLabsRepo != null)) {
            Intent intent = new Intent(context, WebActivity.class);
            intent.setFlags(C.ENCODING_PCM_32BIT);
            intent.putExtra(GlobalKt.BUNDLE_KEY_PARAMS, new WebActivityParams(token, uid, "NATIVE", INSTANCE.getTags()).getUrl());
            context.startActivity(intent);
            return;
        }
        Log.e("BitLabs", "You should initialise BitLabs first! Call BitLabs::init()");
    }
}
