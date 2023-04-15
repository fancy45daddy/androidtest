package ms.bd.o.Pgl;

import java.util.Arrays;
/* loaded from: classes10.dex */
public class pblt extends RuntimeException {
    public pblt(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}
