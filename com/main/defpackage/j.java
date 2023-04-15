package defpackage;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
/* renamed from: j  reason: default package */
/* loaded from: classes8.dex */
public final class j extends t1<Date> {
    public static final u1 c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f12066a = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    private final DateFormat b = DateFormat.getDateTimeInstance(2, 2);

    /* renamed from: j$a */
    /* loaded from: classes8.dex */
    static class a implements u1 {
        a() {
        }

        @Override // defpackage.u1
        public <T> t1<T> a(u uVar, x1<T> x1Var) {
            if (x1Var.a() == Date.class) {
                return new j();
            }
            return null;
        }
    }

    @Override // defpackage.t1
    /* renamed from: b */
    public Date a(m0 m0Var) throws IOException {
        if (m0Var.u() == p0.NULL) {
            m0Var.r();
            return null;
        }
        return a(m0Var.s());
    }

    private synchronized Date a(String str) {
        try {
            try {
                try {
                } catch (ParseException e) {
                    throw new o0(str, e);
                }
            } catch (ParseException unused) {
                return w.a(str, new ParsePosition(0));
            }
        } catch (ParseException unused2) {
            return this.f12066a.parse(str);
        }
        return this.b.parse(str);
    }

    @Override // defpackage.t1
    public synchronized void a(s0 s0Var, Date date) throws IOException {
        if (date == null) {
            s0Var.k();
        } else {
            s0Var.d(this.f12066a.format(date));
        }
    }
}
