package TR.n;

import TR.l.g;
import com.tapr.helpers.JsonHelper;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f594a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TR.i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TR.j.b f595a;

        a(TR.j.b bVar) {
            this.f595a = bVar;
        }

        @Override // TR.i.b
        public void a(g gVar, Throwable th) {
            try {
                this.f595a.a(gVar, th);
            } catch (Exception e) {
                TR.d.b.i().b(e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // TR.i.b
        public void a(g gVar, JSONObject jSONObject) {
            try {
                this.f595a.a(gVar, (g) new JsonHelper().fromJson(jSONObject, b.this.f594a));
            } catch (Exception e) {
                TR.d.b.i().b(e);
            }
        }
    }

    public b(Class<T> cls) {
        this.f594a = cls;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TR.i.b a(TR.j.b<T> bVar) {
        return new a(bVar);
    }
}
