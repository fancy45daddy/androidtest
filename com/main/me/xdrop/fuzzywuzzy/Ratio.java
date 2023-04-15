package me.xdrop.fuzzywuzzy;
/* loaded from: classes10.dex */
public interface Ratio extends Applicable {
    @Override // me.xdrop.fuzzywuzzy.Applicable
    int apply(String str, String str2);

    int apply(String str, String str2, ToStringFunction<String> toStringFunction);
}
