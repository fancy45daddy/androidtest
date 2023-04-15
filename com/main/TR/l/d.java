package TR.l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class d extends g implements Serializable {
    private static final long l = -6455860993361150575L;
    private final List<Map<String, Object>> j;
    private final String k;

    public d(String str, List<TR.h.b> list, TR.i.b bVar) {
        super(str, "events", bVar);
        this.j = new ArrayList();
        for (TR.h.b bVar2 : list) {
            this.j.add(bVar2.e());
        }
        this.k = UUID.randomUUID().toString();
        k();
    }

    @Override // TR.l.g
    public void e() {
        a("events", this.j);
    }

    @Override // TR.l.g
    public boolean equals(Object obj) {
        return super.equals(obj) && this.k.equals(((d) obj).k);
    }

    public String u() {
        return this.k;
    }
}
