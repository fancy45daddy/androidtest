package defpackage;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: s1  reason: default package */
/* loaded from: classes8.dex */
public final class s1 extends t1<Time> {
    public static final u1 b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final DateFormat f12139a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: s1$a */
    /* loaded from: classes8.dex */
    static class a implements u1 {
        a() {
        }

        @Override // defpackage.u1
        public <T> t1<T> a(u uVar, x1<T> x1Var) {
            if (x1Var.a() == Time.class) {
                return new s1();
            }
            return null;
        }
    }

    @Override // defpackage.t1
    /* renamed from: b */
    public synchronized Time a(m0 m0Var) throws IOException {
        if (m0Var.u() == p0.NULL) {
            m0Var.r();
            return null;
        }
        try {
            return new Time(this.f12139a.parse(m0Var.s()).getTime());
        } catch (ParseException e) {
            throw new o0(e);
        }
    }

    @Override // defpackage.t1
    public synchronized void a(s0 s0Var, Time time) throws IOException {
        s0Var.d(time == null ? null : this.f12139a.format((Date) time));
    }
}
