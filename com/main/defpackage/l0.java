package defpackage;

import java.math.BigInteger;
/* renamed from: l0  reason: default package */
/* loaded from: classes8.dex */
public final class l0 extends g0 {
    private static final Class<?>[] b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a  reason: collision with root package name */
    private Object f12076a;

    public l0(Boolean bool) {
        b(bool);
    }

    private static boolean a(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    void b(Object obj) {
        if (obj instanceof Character) {
            this.f12076a = String.valueOf(((Character) obj).charValue());
            return;
        }
        a.a((obj instanceof Number) || a(obj));
        this.f12076a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (this.f12076a == null) {
            return l0Var.f12076a == null;
        } else if (a(this) && a(l0Var)) {
            return m().longValue() == l0Var.m().longValue();
        } else {
            Object obj2 = this.f12076a;
            if ((obj2 instanceof Number) && (l0Var.f12076a instanceof Number)) {
                double doubleValue = m().doubleValue();
                double doubleValue2 = l0Var.m().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(l0Var.f12076a);
        }
    }

    public boolean h() {
        if (o()) {
            return i().booleanValue();
        }
        return Boolean.parseBoolean(n());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f12076a == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = m().longValue();
        } else {
            Object obj = this.f12076a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(m().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    Boolean i() {
        return (Boolean) this.f12076a;
    }

    public double j() {
        return p() ? m().doubleValue() : Double.parseDouble(n());
    }

    public int k() {
        return p() ? m().intValue() : Integer.parseInt(n());
    }

    public long l() {
        return p() ? m().longValue() : Long.parseLong(n());
    }

    public Number m() {
        Object obj = this.f12076a;
        return obj instanceof String ? new t0((String) obj) : (Number) obj;
    }

    public String n() {
        if (p()) {
            return m().toString();
        }
        if (o()) {
            return i().toString();
        }
        return (String) this.f12076a;
    }

    public boolean o() {
        return this.f12076a instanceof Boolean;
    }

    public boolean p() {
        return this.f12076a instanceof Number;
    }

    public boolean q() {
        return this.f12076a instanceof String;
    }

    public l0(Number number) {
        b(number);
    }

    public l0(String str) {
        b(str);
    }

    private static boolean a(l0 l0Var) {
        Object obj = l0Var.f12076a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }
}
