package defpackage;

import com.microblink.core.internal.IOUtils;
import java.lang.reflect.Field;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.lang3.StringUtils;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q  reason: default package */
/* loaded from: classes8.dex */
public abstract class q implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final q f12134a;
    public static final q b;
    public static final q c;
    public static final q d;
    public static final q e;
    private static final /* synthetic */ q[] f;

    /* renamed from: q$a */
    /* loaded from: classes8.dex */
    enum a extends q {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.r
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f12134a = aVar;
        q qVar = new q("UPPER_CAMEL_CASE", 1) { // from class: q.b
            @Override // defpackage.r
            public String a(Field field) {
                return q.a(field.getName());
            }
        };
        b = qVar;
        q qVar2 = new q("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: q.c
            @Override // defpackage.r
            public String a(Field field) {
                return q.a(q.a(field.getName(), StringUtils.SPACE));
            }
        };
        c = qVar2;
        q qVar3 = new q("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: q.d
            @Override // defpackage.r
            public String a(Field field) {
                return q.a(field.getName(), IOUtils.FILE_NAME_DELIMETER).toLowerCase(Locale.ENGLISH);
            }
        };
        d = qVar3;
        q qVar4 = new q("LOWER_CASE_WITH_DASHES", 4) { // from class: q.e
            @Override // defpackage.r
            public String a(Field field) {
                return q.a(field.getName(), HelpFormatter.DEFAULT_OPT_PREFIX).toLowerCase(Locale.ENGLISH);
            }
        };
        e = qVar4;
        f = new q[]{aVar, qVar, qVar2, qVar3, qVar4};
    }

    private q(String str, int i) {
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f.clone();
    }

    /* synthetic */ q(String str, int i, a aVar) {
        this(str, i);
    }

    static String a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        while (i < str.length() - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (i == str.length()) {
            return sb.toString();
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(a(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }

    private static String a(char c2, String str, int i) {
        if (i < str.length()) {
            return c2 + str.substring(i);
        }
        return String.valueOf(c2);
    }
}
