package TR.p;

import TR.i.g;
import TR.l.m;
import TR.m.m;
import TR.q.h;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final TR.n.e f606a;
    private final TR.n.c b;
    private final g c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TR.j.b<m> {
        a() {
        }

        @Override // TR.j.b
        public void a(TR.l.g gVar, m mVar) {
            String str;
            if (mVar == null) {
                return;
            }
            int i = b.f608a[mVar.b().ordinal()];
            if (i == 1) {
                str = "TapResearchSDK is up to date";
            } else if (i != 2) {
                if (i == 3) {
                    f.this.c.c();
                    h.i(TR.q.b.D);
                    return;
                }
                f.this.b.a(mVar.a());
                TR.d.b.i().x();
                TR.d.b.i().y();
            } else {
                str = "There is a new version of the TapResearchSDK available. Please visit www.tapresearch.com/sdk-changelog for more information.";
            }
            h.f(str);
            f.this.b.a(mVar.a());
            TR.d.b.i().x();
            TR.d.b.i().y();
        }

        @Override // TR.j.b
        public void a(TR.l.g gVar, Throwable th) {
            h.c("Version request failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f608a;

        static {
            int[] iArr = new int[m.a.values().length];
            f608a = iArr;
            try {
                iArr[m.a.TRVersionStatusOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f608a[m.a.TRVersionStatusUpdateAvailable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f608a[m.a.TRVersionStatusUpdateNow.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(TR.n.e eVar, TR.n.c cVar, g gVar) {
        this.f606a = eVar;
        this.b = cVar;
        this.c = gVar;
    }

    public void a() {
        this.f606a.b(new a());
    }
}
