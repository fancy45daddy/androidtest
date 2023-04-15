package me.xdrop.fuzzywuzzy.algorithms;

import java.util.HashSet;
import java.util.Set;
/* loaded from: classes10.dex */
final class SetUtils {
    SetUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Set<T> intersection(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.retainAll(set2);
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Set<T> difference(Set<T> set, Set<T> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }
}
