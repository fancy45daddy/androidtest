package ms.bd.o.Pgl;

import com.bytedance.retrofit2.client.Header;
import java.util.List;
/* loaded from: classes10.dex */
public final class pbla extends pblo {
    private String a(List<Header> list) {
        if (list != null && list.size() > 0) {
            for (Header header : list) {
                if (header != null && ((String) pblk.a(16777217, 0, 0L, "95a3b9", new byte[]{48, 122, 6, 83, 16, 34, 53, 19, 57, 103})).equalsIgnoreCase(header.getName())) {
                    return header.getValue();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0411 A[Catch: all -> 0x0435, TryCatch #2 {all -> 0x0435, blocks: (B:57:0x03e1, B:59:0x0411, B:61:0x041b), top: B:79:0x03e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0426 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object[] a(java.lang.String r36, byte[] r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.pbla.a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.Object[]");
    }

    @Override // ms.bd.o.Pgl.pblo
    public Object[] a(String str, String str2, String str3) {
        return a(str, null, null, str3, str2, false);
    }

    @Override // ms.bd.o.Pgl.pblo
    public Object[] a(String str, byte[] bArr, String str2, String str3) {
        return a(str, bArr, str2, str3, null, true);
    }

    @Override // ms.bd.o.Pgl.pblo
    public Object[] b(String str, String str2, String str3) {
        return a(str, null, str2, str3, null, false);
    }
}
