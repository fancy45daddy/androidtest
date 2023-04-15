package ms.bd.o.Pgl;

import com.facebook.stetho.dumpapp.Framer;
/* loaded from: classes10.dex */
public class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f12102a = (String) pblk.a(16777217, 0, 0, "34ae67", new byte[]{54, 34, Framer.STDIN_FRAME_PREFIX, 31, 8, 110, 51, 15, 60});

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r14) {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r6.<init>()     // Catch: java.lang.Throwable -> L94
            java.io.File r7 = r14.getFilesDir()     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L94
            r6.append(r7)     // Catch: java.lang.Throwable -> L94
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.String r12 = "1a0248"
            byte[] r13 = new byte[r2]     // Catch: java.lang.Throwable -> L94
            r7 = 111(0x6f, float:1.56E-43)
            r13[r4] = r7     // Catch: java.lang.Throwable -> L94
            java.lang.Object r7 = ms.bd.o.Pgl.pblk.a(r8, r9, r10, r12, r13)     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L94
            r6.append(r7)     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = ms.bd.o.Pgl.s0.f12102a     // Catch: java.lang.Throwable -> L94
            r6.append(r7)     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L94
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L94
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L94
            boolean r9 = r8.exists()     // Catch: java.lang.Throwable -> L94
            if (r9 == 0) goto L4a
            r8.delete()     // Catch: java.lang.Throwable -> L47
            r5 = 2
            goto L4a
        L47:
            r14 = r3
            r5 = 2
            goto L95
        L4a:
            android.content.res.Resources r14 = r14.getResources()     // Catch: java.lang.Throwable -> L94
            android.content.res.AssetManager r14 = r14.getAssets()     // Catch: java.lang.Throwable -> L94
            java.io.InputStream r14 = r14.open(r7)     // Catch: java.lang.Throwable -> L94
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L95
            r7.<init>()     // Catch: java.lang.Throwable -> L95
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r3]     // Catch: java.lang.Throwable -> L92
        L5f:
            int r9 = r14.read(r8, r4, r3)     // Catch: java.lang.Throwable -> L92
            r10 = -1
            if (r9 == r10) goto L6a
            r7.write(r8, r4, r9)     // Catch: java.lang.Throwable -> L92
            goto L5f
        L6a:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L92
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L92
            byte[] r8 = r7.toByteArray()     // Catch: java.lang.Throwable -> L92
            r3.write(r8)     // Catch: java.lang.Throwable -> L92
            r3.close()     // Catch: java.lang.Throwable -> L92
            int r3 = r7.size()     // Catch: java.lang.Throwable -> L92
            if (r3 > 0) goto L80
            goto L8e
        L80:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L92
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L92
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L8d
            r0 = 0
            goto L8e
        L8d:
            r0 = r5
        L8e:
            r14.close()     // Catch: java.lang.Throwable -> Lc1
            goto Lc1
        L92:
            r3 = r7
            goto L95
        L94:
            r14 = r3
        L95:
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.String r10 = "9e0a0a"
            r11 = 4
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> Lc6
            r12 = 41
            r11[r4] = r12     // Catch: java.lang.Throwable -> Lc6
            r4 = 100
            r11[r2] = r4     // Catch: java.lang.Throwable -> Lc6
            r2 = 124(0x7c, float:1.74E-43)
            r11[r1] = r2     // Catch: java.lang.Throwable -> Lc6
            r1 = 18
            r11[r0] = r1     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r0 = ms.bd.o.Pgl.pblk.a(r6, r7, r8, r10, r11)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lc6
            if (r14 == 0) goto Lbd
            r14.close()     // Catch: java.lang.Throwable -> Lbc
            goto Lbd
        Lbc:
        Lbd:
            if (r3 == 0) goto Lc5
            r7 = r3
            r0 = r5
        Lc1:
            r7.close()     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r5 = r0
        Lc5:
            return r5
        Lc6:
            r0 = move-exception
            if (r14 == 0) goto Lce
            r14.close()     // Catch: java.lang.Throwable -> Lcd
            goto Lce
        Lcd:
        Lce:
            if (r3 == 0) goto Ld3
            r3.close()     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.s0.a(android.content.Context):int");
    }
}
