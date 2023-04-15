package defpackage;

import java.io.IOException;
import java.io.Writer;
/* renamed from: q1  reason: default package */
/* loaded from: classes8.dex */
public final class q1 {
    public static void a(g0 g0Var, s0 s0Var) throws IOException {
        w1.X.a(s0Var, g0Var);
    }

    /* renamed from: q1$a */
    /* loaded from: classes8.dex */
    private static final class a extends Writer {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f12135a;
        private final C0599a b = new C0599a();

        /* renamed from: q1$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        static class C0599a implements CharSequence {

            /* renamed from: a  reason: collision with root package name */
            char[] f12136a;

            C0599a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i) {
                return this.f12136a[i];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f12136a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i, int i2) {
                return new String(this.f12136a, i, i2 - i);
            }
        }

        a(Appendable appendable) {
            this.f12135a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            C0599a c0599a = this.b;
            c0599a.f12136a = cArr;
            this.f12135a.append(c0599a, i, i2 + i);
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.f12135a.append((char) i);
        }
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
