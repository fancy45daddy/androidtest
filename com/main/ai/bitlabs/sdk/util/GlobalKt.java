package ai.bitlabs.sdk.util;

import ai.bitlabs.sdk.data.model.Category;
import ai.bitlabs.sdk.data.model.Details;
import ai.bitlabs.sdk.data.model.Survey;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
/* compiled from: Global.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"BUNDLE_KEY_PARAMS", "", "TAG", "randomSurvey", "Lai/bitlabs/sdk/data/model/Survey;", IntegerTokenConverter.CONVERTER_KEY, "", "library_coreRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GlobalKt {
    public static final String BUNDLE_KEY_PARAMS = "bundle-key-params";
    public static final String TAG = "BitLabs";

    public static final Survey randomSurvey(int i) {
        Random Random = RandomKt.Random(i);
        return new Survey(Random.nextInt(), i, "0.5", "0.5", Random.nextDouble(30.0d), 3, new Details(new Category(Intrinsics.stringPlus("Survey-", Integer.valueOf(i)), "")), Random.nextInt(6), "", 0);
    }
}
