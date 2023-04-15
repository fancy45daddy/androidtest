package ms.bd.o.Pgl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;
/* loaded from: classes10.dex */
public class w0 {
    private static w0 c;

    /* renamed from: a  reason: collision with root package name */
    private Context f12106a;
    private List<Integer> b = new ArrayList();

    private w0(Context context) {
        this.f12106a = null;
        this.f12106a = context;
    }

    public static w0 a(Context context) {
        if (c == null) {
            synchronized (w0.class) {
                if (c == null) {
                    c = new w0(context);
                }
            }
        }
        return c;
    }

    public void a() {
        int i;
        int d;
        int c2;
        try {
            synchronized (this) {
                d = d();
                c2 = c();
            }
            i = (d * 10000) + c2;
        } catch (Exception unused) {
            i = -10001;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            return;
        }
        this.b.add(valueOf);
        try {
            int size = this.b.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.b.subList(size - 10, size));
                this.b.clear();
                this.b = arrayList;
            }
        } catch (Throwable unused2) {
        }
    }

    public int b() {
        Intent registerReceiver = this.f12106a.registerReceiver(null, new IntentFilter((String) pblk.a(16777217, 0, 0L, "377329", new byte[]{35, 59, SignedBytes.MAX_POWER_OF_TWO, 85, 2, 39, 52, 88, 111, 109, 54, 48, 74, 83, 67, 47, 51, 2, 111, 108, 44, 123, 102, 102, 57, 26, 21, 36, Framer.STDIN_REQUEST_FRAME_PREFIX, 92, 1, 29, 101, 105, 42, 11, 20})));
        if (registerReceiver == null) {
            return -1;
        }
        int intExtra = registerReceiver.getIntExtra((String) pblk.a(16777217, 0, 0L, "ba6883", new byte[]{96, 119, 68, 88, 18, 55}), -1);
        return (intExtra == 2 || intExtra == 5) ? 1 : 0;
    }

    public int c() {
        Intent registerReceiver = this.f12106a.registerReceiver(null, new IntentFilter((String) pblk.a(16777217, 0, 0L, "80674a", new byte[]{40, 60, 65, 81, 4, Byte.MAX_VALUE, Utf8.REPLACEMENT_BYTE, Framer.STDIN_REQUEST_FRAME_PREFIX, 110, 105, 61, 55, 75, 87, 69, 119, 56, 5, 110, 104, 39, 124, 103, 98, Utf8.REPLACEMENT_BYTE, 66, 30, 35, 94, 88, 10, 26, 100, 109, 44, 83, 31})));
        if (registerReceiver == null) {
            return -1;
        }
        return Math.round(((registerReceiver.getIntExtra((String) pblk.a(16777217, 0, 0L, "c49360", new byte[]{126, 51, 92, 66, 5}), -1) / registerReceiver.getIntExtra((String) pblk.a(16777217, 0, 0L, "864dbc", new byte[]{58, 55, 70, 28, 88}), -1)) * 100.0f) * 10.0f) / 10;
    }

    public int d() {
        Intent registerReceiver = this.f12106a.registerReceiver(null, new IntentFilter((String) pblk.a(16777217, 0, 0L, "f0700a", new byte[]{118, 60, SignedBytes.MAX_POWER_OF_TWO, 86, 0, Byte.MAX_VALUE, 97, Framer.STDIN_REQUEST_FRAME_PREFIX, 111, 110, 99, 55, 74, 80, 65, 119, 102, 5, 111, 111, 121, 124, 102, 101, 59, 66, SignedBytes.MAX_POWER_OF_TWO, 35, Framer.STDIN_REQUEST_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX, 84, 26, 101, 106, 40, 83, 65})));
        if (registerReceiver == null) {
            return -1;
        }
        return registerReceiver.getIntExtra((String) pblk.a(16777217, 0, 0L, "a8c62d", new byte[]{96, 54, 5, 69, 10, 118, 102}), -1);
    }

    public synchronized int[] e() {
        int size = this.b.size();
        if (size <= 0) {
            return new int[0];
        } else if (size == 1) {
            return new int[]{this.b.get(0).intValue()};
        } else {
            List<Integer> list = this.b;
            int i = size - 10;
            if (i <= 0) {
                i = 0;
            }
            List<Integer> subList = list.subList(i, size);
            int[] iArr = new int[subList.size()];
            for (int i2 = 0; i2 < subList.size(); i2++) {
                iArr[i2] = subList.get(i2).intValue();
            }
            return iArr;
        }
    }
}
