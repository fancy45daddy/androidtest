package TR.q;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class k {
    private k() {
    }

    public static Long a() {
        return Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()));
    }
}
