package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.ayetstudios.publishersdk.messages.NativeOffersResponseMessage;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/* renamed from: s  reason: default package */
/* loaded from: classes8.dex */
public class s extends AsyncTask<y, Void, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private Context f12137a;
    private y b = null;
    private NativeOffersResponseMessage c = null;
    private String d;

    public s(Context context, String str) {
        this.f12137a = context;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(y... yVarArr) {
        boolean z = true;
        if (yVarArr.length == 1) {
            this.b = yVarArr[0];
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
                NativeOffersResponseMessage nativeOffersResponseMessage = (NativeOffersResponseMessage) new u().a(l1.a(this.f12137a, "Offers/sdk_native_offers", str2), (Class<Object>) NativeOffersResponseMessage.class);
                this.c = nativeOffersResponseMessage;
                if (nativeOffersResponseMessage == null || !nativeOffersResponseMessage.getStatus().equalsIgnoreCase("success")) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } catch (Exception e2) {
                Log.e("GetNativeOffersTask", e2.getMessage());
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        y yVar = this.b;
        if (yVar != null) {
            yVar.a(false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        y yVar = this.b;
        if (yVar != null) {
            yVar.a(bool.booleanValue(), this.c);
        }
    }
}
