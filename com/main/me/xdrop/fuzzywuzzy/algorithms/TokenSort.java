package me.xdrop.fuzzywuzzy.algorithms;

import java.util.Arrays;
import me.xdrop.fuzzywuzzy.Ratio;
import me.xdrop.fuzzywuzzy.ToStringFunction;
import org.apache.commons.lang3.StringUtils;
/* loaded from: classes10.dex */
public class TokenSort extends RatioAlgorithm {
    @Override // me.xdrop.fuzzywuzzy.algorithms.RatioAlgorithm
    public int apply(String str, String str2, Ratio ratio, ToStringFunction<String> toStringFunction) {
        return ratio.apply(processAndSort(str, toStringFunction), processAndSort(str2, toStringFunction));
    }

    private static String processAndSort(String str, ToStringFunction<String> toStringFunction) {
        return Utils.sortAndJoin(Arrays.asList(toStringFunction.apply(str).split("\\s+")), StringUtils.SPACE).trim();
    }
}
