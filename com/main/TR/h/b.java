package TR.h;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class b implements Serializable {
    private static final long d = -8001318264389947645L;
    private static final String e = "event_type";
    private static final String f = "event_name";
    private static final String g = "message";
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 5;
    public static final String k = "crash";
    public static final String l = "fail_send_event";
    public static final String m = "clean_cache";
    public static final String n = "log";
    public static final String o = "web_failed_load";
    protected static final String p = "android";

    /* renamed from: a  reason: collision with root package name */
    protected int f569a;
    protected final String b;
    protected String c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: TR.h.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0004b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str) {
        this.b = str;
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("event_type", Integer.valueOf(this.f569a));
        map.put("event_name", this.b);
        String str = this.c;
        if (str != null && str.length() > 0) {
            map.put("message", this.c);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str) {
        this.c = str;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.f569a;
    }

    public Map<String, Object> e() {
        return a((Map<String, Object>) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f569a != bVar.f569a) {
            return false;
        }
        String str = this.c;
        String str2 = bVar.c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        String str = this.b;
        str.hashCode();
        this.f569a = !str.equals("crash") ? !str.equals(o) ? 1 : 5 : 0;
    }

    public int hashCode() {
        int i2 = this.f569a * 31;
        String str = this.b;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
