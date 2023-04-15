package TR.l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public class i extends g {
    private static final long j = -368291324914119783L;

    public i(TR.i.b bVar) {
        super("Rewards Response", TR.q.b.n, bVar);
    }

    @Override // TR.l.g
    public void e() {
        d();
        g();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = (HashSet) TR.q.j.a(TR.q.b.H, (Class<Object>) linkedHashSet.getClass());
        if (hashSet != null) {
            linkedHashSet.addAll(hashSet);
        }
        if (hashSet == null) {
            throw new TR.i.e("Couldn't fetch rewards from the shared preferences");
        }
        ArrayList arrayList = new ArrayList(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((TR.m.j) it.next()).getTransactionIdentifier());
        }
        a("cp_identifiers", arrayList);
    }

    @Override // TR.l.g
    public boolean r() {
        if (TR.d.b.i().l().d()) {
            return true;
        }
        boolean z = a("device_player_id") == null && TR.d.b.i().l().b() == 0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = (HashSet) TR.q.j.a(TR.q.b.H, (Class<Object>) linkedHashSet.getClass());
        if (hashSet != null) {
            linkedHashSet.addAll(hashSet);
        }
        return z || linkedHashSet.isEmpty();
    }
}
