package ms.bd.o.Pgl;

import android.content.Context;
import com.facebook.stetho.dumpapp.Framer;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
/* loaded from: classes10.dex */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12105a;

    static {
        String str = (String) pblk.a(16777217, 0, 0L, "21ecdb", new byte[]{24, 111, 87, 73, 102});
        f12105a = (String) pblk.a(16777217, 0, 0L, "316475", new byte[]{54, 39, 122, 78, 12});
    }

    public static synchronized String a(Context context) {
        String a2;
        synchronized (v0.class) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getFilesDir().getAbsolutePath());
            sb.append((String) pblk.a(16777217, 0, 0L, "0dac94", new byte[]{110}));
            String str = f12105a;
            sb.append(str);
            String sb2 = sb.toString();
            if (!new File(sb2).exists() || (a2 = a(sb2)) == null || a2.length() <= 0) {
                InputStream open = context.getResources().getAssets().open(str);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = open.read(bArr, 0, 4096);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(sb2);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.close();
                StringBuilder sb3 = new StringBuilder();
                sb3.append((String) pblk.a(16777217, 0, 0L, "bba013", new byte[]{112, 104, 31, 75, 10, 100, 54, 20, 103, 32}));
                sb3.append(sb2);
                a(sb3.toString());
                String a3 = a(sb2);
                if (a3 == null || a3.length() == 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(sb2, (String) pblk.a(16777217, 0, 0L, "5ee262", new byte[]{54, 112}));
                    randomAccessFile.seek(16L);
                    randomAccessFile.write(new byte[]{2});
                    randomAccessFile.close();
                    a3 = a(sb2);
                }
                if (a3 == null || a3.length() == 0) {
                    a3 = (String) pblk.a(16777217, 0, 0L, "eb6bda", new byte[]{36, 91, 25, 87, 5, 75, 67, 113, 85, 29, 70, 91, 25, 87, 5, 75});
                }
                return a3;
            }
            return a2;
        }
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int read;
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception unused) {
                String str = (String) pblk.a(16777217, 0, 0L, "a9d4e1", new byte[]{117, Framer.STDERR_FRAME_PREFIX, 20});
            }
        } while (read >= 4096);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f6, code lost:
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.BufferedInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.v0.a(java.lang.String):java.lang.String");
    }
}
