package ms.bd.o.Pgl;

import android.util.SparseArray;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.primitives.SignedBytes;
import okio.Utf8;
/* loaded from: classes10.dex */
public final class pblb {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<pgla> f12087a = new SparseArray<>();

    /* loaded from: classes10.dex */
    public static abstract class pgla {
        public Object a(int i, int i2, long j, String str, Object obj) throws Throwable {
            return a(i2, j, str, obj);
        }

        protected Object a(int i, long j, String str, Object obj) throws Throwable {
            return null;
        }
    }

    public static Object a(int i) {
        return pblk.a(i, 0, 0L, null, null);
    }

    public static Object a(int i, int i2, long j, String str, Object obj) {
        return pblk.a(i, i2, j, str, obj);
    }

    public static void a(int i, pgla pglaVar) {
        SparseArray<pgla> sparseArray = f12087a;
        pgla pglaVar2 = sparseArray.get(i);
        if (pglaVar2 != null) {
            throw new RuntimeException(String.format((String) pblk.a(16777217, 0, 0L, "4fa152", new byte[]{96, 119, 82, 77, 11, Framer.ENTER_FRAME_PREFIX, 119, 69, 53, 100, 43, 36, 0, SignedBytes.MAX_POWER_OF_TWO, 13, 44, 36, 83, 53, 115, 107}), pglaVar2.toString()));
        }
        sparseArray.put(i, pglaVar);
    }

    public static Object b(int i, int i2, long j, String str, Object obj) {
        pgla pglaVar = f12087a.get(i);
        if (pglaVar != null) {
            try {
                return pglaVar.a(i, i2, j, str, obj);
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        throw new RuntimeException(String.format((String) pblk.a(16777217, 0, 0L, "0b8fa0", new byte[]{46, 112, 11, 17, 81, 35, 54, 3, 44, Framer.STDERR_FRAME_PREFIX, 97, 105, 88, 82, 87, 41, 37, 66, 101, Utf8.REPLACEMENT_BYTE, 37}), Integer.valueOf(i)));
    }

    public static Object a(int i, long j) {
        return pblk.a(i, 0, j, null, null);
    }

    public static Object a(int i, String str) {
        return pblk.a(i, 0, 0L, str, null);
    }
}
