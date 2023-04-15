package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.ayetstudios.publishersdk.messages.SimpleResponseMessage;
/* renamed from: i1  reason: default package */
/* loaded from: classes8.dex */
public class i1 extends AsyncTask<b0, Void, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private SimpleResponseMessage f11855a;
    private b0 b = null;
    private Context c;
    private String d;
    private String e;

    public i1(Context context, String str, String str2) {
        this.c = context;
        this.d = str;
        this.e = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(b0... b0VarArr) {
        if (b0VarArr.length == 1) {
            this.b = b0VarArr[0];
            try {
                Context context = this.c;
                String str = this.d;
                String str2 = this.e;
                SimpleResponseMessage simpleResponseMessage = (SimpleResponseMessage) new u().a(l1.a(context, str, (str2 == null || str2.length() <= 0) ? "" : this.e), (Class<Object>) SimpleResponseMessage.class);
                this.f11855a = simpleResponseMessage;
                if (simpleResponseMessage != null && simpleResponseMessage.getStatus() != null && this.f11855a.getStatus().length() >= 1) {
                    return Boolean.valueOf(this.f11855a.getStatus().equals("success"));
                }
                return Boolean.FALSE;
            } catch (Exception e) {
                e.getMessage();
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.a(false, "canceled");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        SimpleResponseMessage simpleResponseMessage;
        if (this.b != null) {
            String str = null;
            if (bool.booleanValue() && (simpleResponseMessage = this.f11855a) != null && simpleResponseMessage.getStatus() != null && this.f11855a.getStatus().equalsIgnoreCase("success")) {
                b0 b0Var = this.b;
                if (this.f11855a.getData() != null && this.f11855a.getData().length() > 0) {
                    str = this.f11855a.getData();
                }
                b0Var.a(true, str);
                return;
            }
            b0 b0Var2 = this.b;
            SimpleResponseMessage simpleResponseMessage2 = this.f11855a;
            if (simpleResponseMessage2 != null && simpleResponseMessage2.getData() != null && this.f11855a.getData().length() > 0) {
                str = this.f11855a.getData();
            }
            b0Var2.a(false, str);
        }
    }
}
