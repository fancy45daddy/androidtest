package ms.bd.o.Pgl;

import android.content.Context;
import android.os.Process;
import com.facebook.stetho.dumpapp.Framer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
public abstract class pblo extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, int i2, long j, String str, Object obj) throws Throwable {
        boolean z;
        Context b;
        int i3;
        String[] strArr = {(String) pblk.a(16777217, 0, 0L, "ce879f", new byte[]{115, 105, 79, 81, 9, Framer.EXIT_FRAME_PREFIX, 100, 10, 121, 98, 96, 106, 66, 80, 21, Framer.EXIT_FRAME_PREFIX, 111, 74, 39, 78, 92, 83, 110, 113, 40, 84, 84})};
        try {
            b = pgla.a().b();
        } catch (Throwable unused) {
        }
        for (i3 = 0; i3 < 1; i3++) {
            if (b.checkPermission(strArr[i3], Process.myPid(), Process.myUid()) != 0) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            switch (i) {
                case 196609:
                    Object[] objArr = (Object[]) obj;
                    return a(str, (byte[]) objArr[0], (String) objArr[1], (String) objArr[2]);
                case 196610:
                    Object[] objArr2 = (Object[]) obj;
                    return b(str, (String) objArr2[0], (String) objArr2[1]);
                case 196611:
                    Object[] objArr3 = (Object[]) obj;
                    return a(str, (String) objArr3[0], (String) objArr3[1]);
                default:
                    return super.a(i, i2, j, str, obj);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                String str = (String) pblk.a(16777217, 0, 0L, "c3cb49", new byte[]{Byte.MAX_VALUE, Framer.STDERR_FRAME_PREFIX, 47, 21, 2});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                String str = (String) pblk.a(16777217, 0, 0L, "cfc1d9", new byte[]{Byte.MAX_VALUE, 103, 47, 70, 84});
            }
        }
    }

    public abstract Object[] a(String str, String str2, String str3);

    public abstract Object[] a(String str, byte[] bArr, String str2, String str3);

    public abstract Object[] b(String str, String str2, String str3);
}
