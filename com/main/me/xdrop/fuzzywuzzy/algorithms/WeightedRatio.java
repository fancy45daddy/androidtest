package me.xdrop.fuzzywuzzy.algorithms;

import me.xdrop.fuzzywuzzy.FuzzySearch;
import me.xdrop.fuzzywuzzy.ToStringFunction;
/* loaded from: classes10.dex */
public class WeightedRatio extends BasicAlgorithm {
    public static final double PARTIAL_SCALE = 0.9d;
    public static final boolean TRY_PARTIALS = true;
    public static final double UNBASE_SCALE = 0.95d;

    @Override // me.xdrop.fuzzywuzzy.algorithms.BasicAlgorithm
    public int apply(String str, String str2, ToStringFunction<String> toStringFunction) {
        long round;
        String apply = toStringFunction.apply(str);
        String apply2 = toStringFunction.apply(str2);
        int length = apply.length();
        int length2 = apply2.length();
        if (length == 0 || length2 == 0) {
            return 0;
        }
        int ratio = FuzzySearch.ratio(apply, apply2);
        double max = Math.max(length, length2) / Math.min(length, length2);
        boolean z = max >= 1.5d;
        double d = max > 8.0d ? 0.6d : 0.9d;
        if (z) {
            round = Math.round(PrimitiveUtils.max(ratio, FuzzySearch.partialRatio(apply, apply2) * d, FuzzySearch.tokenSortPartialRatio(apply, apply2) * 0.95d * d, FuzzySearch.tokenSetPartialRatio(apply, apply2) * 0.95d * d));
        } else {
            round = Math.round(PrimitiveUtils.max(ratio, FuzzySearch.tokenSortRatio(apply, apply2) * 0.95d, FuzzySearch.tokenSetRatio(apply, apply2) * 0.95d));
        }
        return (int) round;
    }
}
