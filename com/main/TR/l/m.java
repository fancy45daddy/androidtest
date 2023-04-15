package TR.l;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
/* loaded from: classes.dex */
public class m extends g {
    private static final long j = -1050553357330048382L;

    /* loaded from: classes.dex */
    public enum a {
        TRVersionStatusOK,
        TRVersionStatusUpdateAvailable,
        TRVersionStatusUpdateNow
    }

    public m(TR.i.b bVar) {
        super(JsonDocumentFields.VERSION, TR.q.b.h, bVar);
        k();
    }

    @Override // TR.l.g
    public void e() {
        TR.q.h.f(String.format("TapResearch SDK Version: %s", "2.5.5"));
    }
}
