package a;

import android.os.AsyncTask;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class j extends AsyncTask<Void, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public final a f630a;
    public final boolean b;
    public final String c;
    public final String d;

    public j(a aVar, boolean z, String str, String str2) {
        this.f630a = aVar;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[Catch: Exception -> 0x0111, TryCatch #3 {Exception -> 0x0111, blocks: (B:12:0x0034, B:14:0x0041, B:16:0x0050, B:18:0x00a4, B:19:0x00b7, B:21:0x00bd, B:22:0x00c1, B:32:0x0102, B:15:0x0049), top: B:44:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: Exception -> 0x0111, TryCatch #3 {Exception -> 0x0111, blocks: (B:12:0x0034, B:14:0x0041, B:16:0x0050, B:18:0x00a4, B:19:0x00b7, B:21:0x00bd, B:22:0x00c1, B:32:0x0102, B:15:0x0049), top: B:44:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4 A[Catch: Exception -> 0x0111, TryCatch #3 {Exception -> 0x0111, blocks: (B:12:0x0034, B:14:0x0041, B:16:0x0050, B:18:0x00a4, B:19:0x00b7, B:21:0x00bd, B:22:0x00c1, B:32:0x0102, B:15:0x0049), top: B:44:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String doInBackground(java.lang.Void[] r8) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(String str) {
        String str2 = str;
        super.onPostExecute(str2);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f630a.a(str2);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }
}
