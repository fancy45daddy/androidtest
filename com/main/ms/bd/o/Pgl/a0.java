package ms.bd.o.Pgl;

import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
final class a0 extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    protected Object a(int i, long j, String str, Object obj) throws Throwable {
        Method[] declaredMethods;
        Throwable b = y0.a().b();
        if (b == null) {
            return null;
        }
        StackTraceElement[] stackTrace = b.getStackTrace();
        if (stackTrace.length < 4) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 < 4; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (stackTraceElement != null && !TextUtils.isEmpty(stackTraceElement.getClassName())) {
                Class<?> cls = Class.forName(stackTrace[i2].getClassName());
                y0 a2 = y0.a();
                String methodName = stackTrace[i2].getMethodName();
                a2.getClass();
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(methodName)) {
                    for (Method method : cls.getDeclaredMethods()) {
                        if (method != null && method.getName().equals(methodName)) {
                            arrayList2.add(method);
                        }
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }
}
