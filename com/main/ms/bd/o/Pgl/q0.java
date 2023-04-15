package ms.bd.o.Pgl;

import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes10.dex */
public class q0 extends o0 {

    /* renamed from: a  reason: collision with root package name */
    private Interceptor f12099a;
    private long b;

    /* loaded from: classes10.dex */
    class pgla implements Interceptor {
        pgla() {
        }

        public SsResponse intercept(Interceptor.Chain chain) throws Exception {
            SsResponse proceed = chain.proceed(chain.request());
            Iterator it = proceed.headers().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Header header = (Header) it.next();
                if (((String) pblk.a(16777217, 0, 0L, "b86b16", new byte[]{107, 119, 81, 91, 20, 41, 102})).equals(header.getName()) && header.getValue() != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add((String) pblk.a(16777217, 0, 0L, "eb8180", new byte[]{102, 101, 91, 122, 3, 38, 114, 66}));
                    arrayList.add(header.getValue());
                    pblb.a(117440513, 0, q0.this.b, (String) pblk.a(16777217, 0, 0L, "e1acaa", new byte[]{102, 54, 2, 24, 76, 98}), (String[]) arrayList.toArray(new String[0]));
                    break;
                }
            }
            return proceed;
        }
    }

    @Override // ms.bd.o.Pgl.o0
    protected Object a(long j) {
        this.b = j;
        pgla pglaVar = new pgla();
        this.f12099a = pglaVar;
        RetrofitUtils.addInterceptor(pglaVar);
        return Boolean.TRUE;
    }

    protected void finalize() throws Throwable {
        RetrofitUtils.removeInterceptor(this.f12099a);
        super.finalize();
    }
}
