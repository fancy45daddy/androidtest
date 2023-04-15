package a;

import com.inbrain.sdk.InBrain;
import java.util.Set;
/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Set f628a;
    public final /* synthetic */ InBrain b;

    public e(InBrain inBrain, Set set) {
        this.b = inBrain;
        this.f628a = set;
    }

    @Override // a.h
    public final void a(String str) {
        InBrain inBrain = this.b;
        Set<Long> set = this.f628a;
        new com.inbrain.sdk.c().a(inBrain.A, str, set, new com.inbrain.sdk.j(inBrain, set), inBrain.g, inBrain.h);
    }

    @Override // a.h
    public final void a(Throwable th) {
    }
}
