package ms.bd.o.Pgl;

import ms.bd.o.Pgl.pblu;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public final class pblx implements pblu.pblb {
    public String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}
