package me.xdrop.fuzzywuzzy;
@Deprecated
/* loaded from: classes10.dex */
public abstract class StringProcessor implements ToStringFunction<String> {
    @Deprecated
    public abstract String process(String str);

    @Override // me.xdrop.fuzzywuzzy.ToStringFunction
    public String apply(String str) {
        return process(str);
    }
}
