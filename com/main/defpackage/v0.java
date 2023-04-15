package defpackage;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Process;
import com.ayetstudios.publishersdk.messages.SimpleResponseMessage;
/* renamed from: v0  reason: default package */
/* loaded from: classes8.dex */
public class v0 extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private Activity f12147a;
    private SimpleResponseMessage b;
    private String c;
    private String d;

    public v0(Activity activity, String str, String str2) {
        this.f12147a = activity;
        this.c = str;
        this.d = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(String... strArr) {
        Process.setThreadPriority(19);
        try {
            this.b = (SimpleResponseMessage) new u().a(l1.a(this.f12147a, "Offers/sdk_linkchecker_result", ("" + l1.a("data", this.c)) + l1.a("identifier", this.d)), (Class<Object>) SimpleResponseMessage.class);
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        SimpleResponseMessage simpleResponseMessage;
        if (!bool.booleanValue() || (simpleResponseMessage = this.b) == null) {
            return;
        }
        simpleResponseMessage.getStatus().equals("success");
    }
}
