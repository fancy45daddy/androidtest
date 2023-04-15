package defpackage;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* renamed from: p1  reason: default package */
/* loaded from: classes8.dex */
public final class p1 extends t1<Date> {
    public static final u1 b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f12133a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: p1$a */
    /* loaded from: classes8.dex */
    static class a implements u1 {
        a() {
        }

        @Override // defpackage.u1
        public <T> t1<T> a(u uVar, x1<T> x1Var) {
            if (x1Var.a() == Date.class) {
                return new p1();
            }
            return null;
        }
    }

    @Override // defpackage.t1
    /* renamed from: b */
    public synchronized Date a(m0 m0Var) throws IOException {
        if (m0Var.u() == p0.NULL) {
            m0Var.r();
            return null;
        }
        try {
            return new Date(this.f12133a.parse(m0Var.s()).getTime());
        } catch (ParseException e) {
            throw new o0(e);
        }
    }

    @Override // defpackage.t1
    public synchronized void a(s0 s0Var, Date date) throws IOException {
        s0Var.d(date == null ? null : this.f12133a.format((java.util.Date) date));
    }
}
