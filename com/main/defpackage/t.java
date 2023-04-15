package defpackage;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import com.ayetstudios.publishersdk.messages.OfferwallResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* renamed from: t  reason: default package */
/* loaded from: classes8.dex */
public class t extends AsyncTask<d1, Void, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private Activity f12140a;
    private OfferwallResponse b = null;
    private d1 c = null;
    private String d;

    public t(Activity activity, String str) {
        this.f12140a = activity;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(d1... d1VarArr) {
        if (d1VarArr.length == 1) {
            this.c = d1VarArr[0];
            String str = this.d;
            String str2 = null;
            if (str != null && str.length() > 0) {
                try {
                    str2 = "&adslot=" + URLEncoder.encode(this.d, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            try {
                this.b = (OfferwallResponse) new u().a(l1.a(this.f12140a, "Offers/sdk_offers", str2), (Class<Object>) OfferwallResponse.class);
                return Boolean.TRUE;
            } catch (Exception e2) {
                Log.e("GetOffersTask", e2.getMessage());
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        d1 d1Var = this.c;
        if (d1Var != null) {
            d1Var.a(false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        d1 d1Var = this.c;
        if (d1Var != null) {
            d1Var.a(bool.booleanValue(), this.b);
        }
    }
}
