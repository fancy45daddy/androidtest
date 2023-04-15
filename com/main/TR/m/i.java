package TR.m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    List<TR.l.g> f592a;
    private String b;

    public i(String str) {
        this.b = str;
    }

    public void a() {
        ArrayList arrayList = (ArrayList) TR.q.j.a(this.b, (Class<Object>) ArrayList.class);
        if (arrayList != null) {
            arrayList.clear();
        }
        List<TR.l.g> list = this.f592a;
        if (list != null) {
            list.clear();
        }
        TR.q.j.a(this.b, arrayList);
    }

    public void a(TR.l.g gVar) {
        List list = (List) TR.q.j.a(this.b, (Class<Object>) ArrayList.class);
        List synchronizedList = list != null ? Collections.synchronizedList(new ArrayList(list)) : Collections.synchronizedList(new ArrayList());
        if (!synchronizedList.contains(gVar)) {
            List<TR.l.g> list2 = this.f592a;
            if (list2 != null) {
                list2.add(gVar);
            }
            synchronizedList.add(gVar);
        }
        TR.q.j.a(this.b, new ArrayList(synchronizedList));
        if (this.f592a == null) {
            this.f592a = Collections.synchronizedList(new ArrayList(synchronizedList));
        }
    }

    public List<TR.l.g> b() {
        List<TR.l.g> list = this.f592a;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = (ArrayList) TR.q.j.a(this.b, (Class<Object>) ArrayList.class);
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public void b(TR.l.g gVar) {
        ArrayList arrayList = (ArrayList) TR.q.j.a(this.b, (Class<Object>) ArrayList.class);
        if (arrayList != null) {
            arrayList.remove(gVar);
        }
        List<TR.l.g> list = this.f592a;
        if (list != null) {
            list.remove(gVar);
        }
        TR.q.j.a(this.b, arrayList);
    }

    public int c() {
        List<TR.l.g> list = this.f592a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
