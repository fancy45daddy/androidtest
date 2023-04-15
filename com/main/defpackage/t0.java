package defpackage;

import java.math.BigDecimal;
/* renamed from: t0  reason: default package */
/* loaded from: classes8.dex */
public final class t0 extends Number {

    /* renamed from: a  reason: collision with root package name */
    private final String f12141a;

    public t0(String str) {
        this.f12141a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f12141a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            String str = this.f12141a;
            String str2 = ((t0) obj).f12141a;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f12141a);
    }

    public int hashCode() {
        return this.f12141a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f12141a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f12141a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f12141a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f12141a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f12141a).longValue();
        }
    }

    public String toString() {
        return this.f12141a;
    }
}
