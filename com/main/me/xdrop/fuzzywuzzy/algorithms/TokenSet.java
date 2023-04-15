package me.xdrop.fuzzywuzzy.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import me.xdrop.fuzzywuzzy.Ratio;
import me.xdrop.fuzzywuzzy.ToStringFunction;
import org.apache.commons.lang3.StringUtils;
/* loaded from: classes10.dex */
public class TokenSet extends RatioAlgorithm {
    @Override // me.xdrop.fuzzywuzzy.algorithms.RatioAlgorithm
    public int apply(String str, String str2, Ratio ratio, ToStringFunction<String> toStringFunction) {
        String apply = toStringFunction.apply(str);
        String apply2 = toStringFunction.apply(str2);
        Set<String> set = Utils.tokenizeSet(apply);
        Set<String> set2 = Utils.tokenizeSet(apply2);
        Set intersection = SetUtils.intersection(set, set2);
        Set difference = SetUtils.difference(set, set2);
        Set difference2 = SetUtils.difference(set2, set);
        String trim = Utils.sortAndJoin(intersection, StringUtils.SPACE).trim();
        String trim2 = (trim + StringUtils.SPACE + Utils.sortAndJoin(difference, StringUtils.SPACE)).trim();
        String trim3 = (trim + StringUtils.SPACE + Utils.sortAndJoin(difference2, StringUtils.SPACE)).trim();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(ratio.apply(trim, trim2)));
        arrayList.add(Integer.valueOf(ratio.apply(trim, trim3)));
        arrayList.add(Integer.valueOf(ratio.apply(trim2, trim3)));
        return ((Integer) Collections.max(arrayList)).intValue();
    }
}
