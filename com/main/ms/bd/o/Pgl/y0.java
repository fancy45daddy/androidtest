package ms.bd.o.Pgl;
/* loaded from: classes10.dex */
public class y0 {
    private static volatile y0 c;

    /* renamed from: a  reason: collision with root package name */
    private int f12108a = 0;
    private Throwable b = null;

    private y0() {
    }

    public static y0 a() {
        if (c == null) {
            synchronized (y0.class) {
                if (c == null) {
                    c = new y0();
                }
            }
        }
        return c;
    }

    public synchronized Throwable b() {
        return this.b;
    }

    public synchronized void c() {
        if (this.b == null) {
            int i = this.f12108a;
            this.f12108a = i + 1;
            if (i >= 30) {
                this.f12108a = 0;
                this.b = new Throwable();
            }
        }
    }
}
