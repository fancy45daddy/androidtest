package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.provider.Settings;
import com.ayetstudios.publishersdk.messages.RetentionChecksResponseMessage;
/* renamed from: k1  reason: default package */
/* loaded from: classes8.dex */
public class k1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1$a */
    /* loaded from: classes8.dex */
    public class a implements b0 {
        a(k1 k1Var) {
        }

        @Override // defpackage.b0
        public void a(boolean z, String str) {
        }
    }

    private boolean a(String str, Context context) {
        return true;
    }

    public void b(Context context) {
        if (System.currentTimeMillis() - PreferenceManager.getDefaultSharedPreferences(context).getLong("ayet_last_retention_check", 0L) >= 10800000) {
            a(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RetentionChecksResponseMessage retentionChecksResponseMessage, Context context) {
        String android_package;
        if (retentionChecksResponseMessage.getApps() == null || retentionChecksResponseMessage.getApps().size() <= 0) {
            return;
        }
        String str = "";
        String string = context.getApplicationContext().getSharedPreferences("default", 0).getString("shared_user_aid", "");
        int i = 0;
        for (int i2 = 0; i2 < retentionChecksResponseMessage.getApps().size(); i2++) {
            if (a(retentionChecksResponseMessage.getApps().get(i2).getAndroid_package(), context)) {
                str = str + "&identifier_" + Integer.toString(i) + "=" + a2.a(context, android_package, string, v.a(Settings.Secure.getString(context.getContentResolver(), "android_id")));
                i++;
                retentionChecksResponseMessage.getApps().get(i2).getAndroid_package();
            }
        }
        new i1(context, "Offers/sdk_retention_response", str + "&num_apps=" + Integer.toString(i)).execute(new a(this));
    }

    /* renamed from: k1$b */
    /* loaded from: classes8.dex */
    public class b extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public Context f12070a;
        private RetentionChecksResponseMessage b;

        public b(Context context) {
            this.f12070a = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            try {
                RetentionChecksResponseMessage retentionChecksResponseMessage = (RetentionChecksResponseMessage) new u().a(l1.a(this.f12070a, "Offers/sdk_retention_list", null), (Class<Object>) RetentionChecksResponseMessage.class);
                this.b = retentionChecksResponseMessage;
                return Boolean.valueOf(retentionChecksResponseMessage.getStatus().equals("success"));
            } catch (Exception e) {
                e.getMessage();
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                k1.this.a(this.b, this.f12070a);
            }
        }
    }

    public void a(Context context) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong("ayet_last_retention_check", System.currentTimeMillis());
        edit.commit();
        new b(context).execute(new Void[0]);
    }
}
