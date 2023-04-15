package TR.j;

import TR.l.g;
import TR.m.j;
import TR.q.h;
import com.tapr.sdk.RewardCollectionListener;
import com.tapr.sdk.RewardListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a implements TR.i.b {
    private static final long e = 241648632387895521L;

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<j> f579a;
    private final RewardListener b;
    private final RewardCollectionListener c;
    private boolean d;

    public a(HashSet<j> hashSet, RewardListener rewardListener, RewardCollectionListener rewardCollectionListener, boolean z) {
        this.f579a = hashSet;
        this.b = rewardListener;
        this.c = rewardCollectionListener;
        this.d = z;
    }

    @Override // TR.i.b
    public void a(g gVar, Throwable th) {
        h.i("Rewards request faild");
    }

    @Override // TR.i.b
    public void a(g gVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            h.a("Empty resposne no rewards");
            return;
        }
        ArrayList<j> b = new TR.k.a().b(jSONObject);
        if (b == null || b.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(b);
        if (this.f579a != null && !linkedHashSet.isEmpty()) {
            this.f579a.addAll(linkedHashSet);
        }
        TR.q.j.a(TR.q.b.H, this.f579a);
        if ((this.b == null && this.c == null) || this.d) {
            return;
        }
        this.d = true;
        TR.d.b.i().c(this.f579a);
    }
}
