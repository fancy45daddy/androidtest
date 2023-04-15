package TR.i;

import org.apache.commons.lang3.StringUtils;
/* loaded from: classes.dex */
public class h extends RuntimeException {
    private static final long c = -4874870996057408776L;

    /* renamed from: a  reason: collision with root package name */
    private final int f578a;
    private final String b;

    public h(c cVar) {
        super(a(cVar));
        this.f578a = cVar.e();
        this.b = cVar.a();
    }

    private static String a(c cVar) {
        if (cVar != null) {
            return "HTTP " + cVar.e() + StringUtils.SPACE + cVar.a();
        }
        return "Response == null";
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.f578a;
    }
}
