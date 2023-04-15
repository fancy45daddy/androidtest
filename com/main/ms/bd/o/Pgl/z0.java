package ms.bd.o.Pgl;

import ch.qos.logback.core.CoreConstants;
import org.apache.commons.lang3.CharUtils;
/* loaded from: classes10.dex */
public class z0 {
    static {
        String str = (String) pblk.a(16777217, 0, 0L, "1772ea", new byte[]{27, 105, 5, 24, 103});
    }

    public static String a(String str) {
        return (str == null || str.length() <= 0) ? "" : str.trim().replace(CoreConstants.SINGLE_QUOTE_CHAR, ' ').replace('\"', ' ').replace(CharUtils.CR, ' ').replace('\n', ' ');
    }
}
