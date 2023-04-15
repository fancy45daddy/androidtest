package ms.bd.o.Pgl;

import android.content.Context;
import androidx.core.view.InputDeviceCompat;
import com.amazonaws.RequestClientOptions;
import java.io.File;
import ms.bd.o.Pgl.pblb;
/* loaded from: classes10.dex */
public final class pblj {
    public static void a() {
        pblb.a(65537, new pblc());
        pblb.a(65538, new pbld());
        pblb.a(65539, new pble());
        pblb.a((int) InputDeviceCompat.SOURCE_TRACKBALL, new pblf());
        pblb.a(65541, new pblg());
        pblb.a(65542, new pblh());
        pblb.a(65543, new pbli());
        pblb.pgla pblaVar = pbly.b() ? new pbla() : new pblp();
        pblb.a(196609, pblaVar);
        pblb.a(196610, pblaVar);
        pblb.a(196611, pblaVar);
        pblm pblnVar = pbly.a() ? new pbln() : new pbll();
        pblm.a(pblnVar);
        pblb.a((int) RequestClientOptions.DEFAULT_STREAM_BUFFER_SIZE, pblnVar);
        pblb.a(131074, pblnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, String str, String str2) {
        try {
            String[] list = context.getAssets().list(str);
            if (list.length > 0) {
                new File(str2).mkdirs();
                for (String str3 : list) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append((String) pblk.a(16777217, 0, 0L, "706181", new byte[]{105}));
                    sb.append(str3);
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append((String) pblk.a(16777217, 0, 0L, "f9c19e", new byte[]{56}));
                    sb3.append(str3);
                    b(context, sb2, sb3.toString());
                }
                return true;
            }
            throw null;
        } catch (Exception unused) {
            String str4 = (String) pblk.a(16777217, 0, 0L, "ab003d", new byte[]{115, 97, 69});
            return false;
        }
    }
}
