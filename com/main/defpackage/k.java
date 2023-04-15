package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.ayetstudios.publishersdk.messages.SdkUserData;
/* renamed from: k  reason: default package */
/* loaded from: classes8.dex */
public class k extends AsyncTask<d, Void, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private SdkUserData f12069a;
    private d b = null;
    private Context c;
    private String d;
    private String e;

    public k(Context context, String str, String str2) {
        this.c = context;
        this.d = str;
        this.e = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(d... dVarArr) {
        if (dVarArr.length == 1) {
            this.b = dVarArr[0];
            try {
                Context context = this.c;
                String str = this.d;
                String str2 = this.e;
                SdkUserData sdkUserData = (SdkUserData) new u().a(l1.a(context, str, (str2 == null || str2.length() <= 0) ? "" : this.e), (Class<Object>) SdkUserData.class);
                this.f12069a = sdkUserData;
                return Boolean.valueOf(sdkUserData.getStatus().equals("success"));
            } catch (Exception e) {
                e.getMessage();
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        SdkUserData sdkUserData;
        if (this.b != null) {
            if (bool.booleanValue() && (sdkUserData = this.f12069a) != null && sdkUserData.getStatus() != null && this.f12069a.getStatus().equalsIgnoreCase("success")) {
                this.b.a(true, this.f12069a);
            } else {
                this.b.a(false, null);
            }
        }
    }
}
