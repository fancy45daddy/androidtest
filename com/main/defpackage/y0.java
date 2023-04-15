package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y0  reason: default package */
/* loaded from: classes8.dex */
public abstract class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final y0 f12171a;
    public static final y0 b;
    private static final /* synthetic */ y0[] c;

    /* renamed from: y0$a */
    /* loaded from: classes8.dex */
    enum a extends y0 {
        a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f12171a = aVar;
        y0 y0Var = new y0("STRING", 1) { // from class: y0.b
        };
        b = y0Var;
        c = new y0[]{aVar, y0Var};
    }

    private y0(String str, int i) {
    }

    public static y0 valueOf(String str) {
        return (y0) Enum.valueOf(y0.class, str);
    }

    public static y0[] values() {
        return (y0[]) c.clone();
    }

    /* synthetic */ y0(String str, int i, a aVar) {
        this(str, i);
    }
}
