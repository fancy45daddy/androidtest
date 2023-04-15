package ms.bd.o.Pgl;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import ms.bd.o.Pgl.pblu;
/* loaded from: classes10.dex */
public class pblv {

    /* renamed from: a  reason: collision with root package name */
    protected final Set<String> f12094a = new HashSet();
    protected final pblu.pblb b;
    protected final pblu.pgla c;

    /* loaded from: classes10.dex */
    class pgla implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f12095a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ pblu.pblc d;

        pgla(Context context, String str, String str2, pblu.pblc pblcVar) {
            this.f12095a = context;
            this.b = str;
            this.c = str2;
            this.d = pblcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                pblv.this.b(this.f12095a, this.b, this.c);
                this.d.a();
            } catch (UnsatisfiedLinkError | pblt e) {
                this.d.a(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pblv(pblu.pblb pblbVar, pblu.pgla pglaVar) {
        this.b = pblbVar;
        this.c = pglaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        if (r5.length > 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.content.Context r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.pblv.b(android.content.Context, java.lang.String, java.lang.String):void");
    }

    protected File a(Context context) {
        return context.getDir("lib", 0);
    }

    protected File a(Context context, String str, String str2) {
        String a2 = ((pblx) this.b).a(str);
        if (pblu.a(str2)) {
            return new File(a(context), a2);
        }
        File a3 = a(context);
        return new File(a3, a2 + "." + str2);
    }

    public void a(Context context, String str, String str2, pblu.pblc pblcVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (pblu.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        String.format(Locale.US, "Beginning load of %s...", str);
        if (pblcVar == null) {
            b(context, str, str2);
        } else {
            new Thread(new pgla(context, str, str2, pblcVar)).start();
        }
    }
}
