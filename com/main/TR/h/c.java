package TR.h;

import TR.q.h;
import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f570a;
    private final Context b;
    private String c;

    public c(String str) {
        this.f570a = str;
        this.b = TR.d.b.i().k();
    }

    public c(String str, Context context) {
        this.f570a = str;
        this.b = context;
    }

    public b a() {
        b fVar;
        String str;
        String str2 = this.f570a;
        str2.hashCode();
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case -513200628:
                if (str2.equals(b.m)) {
                    c = 0;
                    break;
                }
                break;
            case -426483996:
                if (str2.equals(b.l)) {
                    c = 1;
                    break;
                }
                break;
            case 107332:
                if (str2.equals("log")) {
                    c = 2;
                    break;
                }
                break;
            case 94921639:
                if (str2.equals("crash")) {
                    c = 3;
                    break;
                }
                break;
            case 528405309:
                if (str2.equals(b.o)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                fVar = new f(this.f570a, TR.d.b.i().q(), TR.d.b.i().c(), 0, 0);
                break;
            case 3:
                fVar = new a(this.f570a, TR.d.b.i().d(), this.b);
                break;
            default:
                h.c("Unknown event type!");
            case 4:
                fVar = null;
                break;
        }
        if (fVar != null && (str = this.c) != null && str.length() > 0) {
            fVar.a(this.c);
        }
        return fVar;
    }

    public c a(String str) {
        this.c = str;
        return this;
    }

    public c a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        this.c = stringWriter.toString();
        return this;
    }
}
