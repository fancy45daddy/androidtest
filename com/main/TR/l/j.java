package TR.l;

import com.sense360.android.quinoa.lib.helpers.IntentActions;
/* loaded from: classes.dex */
public class j extends g {
    private static final long j = 3485207234078086954L;

    public j(String str, String str2) {
        this(str, str2, null, null);
    }

    public j(String str, String str2, Integer num, String str3) {
        super("Track URL", TR.q.b.o, null);
        j();
        a("cp_identifier", str);
        a(IntentActions.EXTRA_SURVEY_URL, str2);
        a("error_code", num);
        a("error_message", str3);
    }
}
