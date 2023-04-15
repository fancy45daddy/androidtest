package ms.bd.o.Pgl;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import ms.bd.o.Pgl.pblb;
import okio.Utf8;
/* loaded from: classes10.dex */
final class pble extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i, long j, String str, Object obj) throws Throwable {
        File file = new File(pgla.a().b().getFilesDir(), (String) pblk.a(16777217, 0, 0L, "304015", new byte[]{108, Utf8.REPLACEMENT_BYTE, 84, SignedBytes.MAX_POWER_OF_TWO, 15, 54, Framer.STDOUT_FRAME_PREFIX}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }
}
