package defpackage;

import java.io.IOException;
import java.io.StringWriter;
/* renamed from: g0  reason: default package */
/* loaded from: classes7.dex */
public abstract class g0 {
    public f0 a() {
        if (d()) {
            return (f0) this;
        }
        throw new IllegalStateException("This is not a JSON Array.");
    }

    public j0 b() {
        if (f()) {
            return (j0) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public l0 c() {
        if (g()) {
            return (l0) this;
        }
        throw new IllegalStateException("This is not a JSON Primitive.");
    }

    public boolean d() {
        return this instanceof f0;
    }

    public boolean e() {
        return this instanceof i0;
    }

    public boolean f() {
        return this instanceof j0;
    }

    public boolean g() {
        return this instanceof l0;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            s0 s0Var = new s0(stringWriter);
            s0Var.b(true);
            q1.a(this, s0Var);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
