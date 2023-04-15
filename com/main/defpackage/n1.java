package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.view.ViewGroup;
import android.widget.Toast;
import com.ayetstudios.publishersdk.messages.RequestOfferData;
/* renamed from: n1  reason: default package */
/* loaded from: classes8.dex */
public class n1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1$a */
    /* loaded from: classes8.dex */
    public class a implements u0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f12110a;
        final /* synthetic */ w0 b;
        final /* synthetic */ u0 c;

        a(n1 n1Var, ViewGroup viewGroup, w0 w0Var, u0 u0Var) {
            this.f12110a = viewGroup;
            this.b = w0Var;
            this.c = u0Var;
        }

        @Override // defpackage.u0
        public void a(String str) {
            w0 w0Var;
            try {
                ViewGroup viewGroup = this.f12110a;
                if (viewGroup != null && (w0Var = this.b) != null) {
                    viewGroup.removeView(w0Var);
                }
            } catch (Exception unused) {
            }
            this.f12110a.removeView(this.b);
            this.c.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1$b */
    /* loaded from: classes8.dex */
    public class b implements a0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f12111a;
        final /* synthetic */ RequestOfferData b;
        final /* synthetic */ g1 c;
        final /* synthetic */ String d;

        b(n1 n1Var, Context context, RequestOfferData requestOfferData, g1 g1Var, String str) {
            this.f12111a = context;
            this.b = requestOfferData;
            this.c = g1Var;
            this.d = str;
        }

        @Override // defpackage.a0
        public void a(boolean z, String str, boolean z2, String str2, int i, int i2) {
            if (z) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f12111a.getApplicationContext()).edit();
                edit.putLong("ayet_last_dl_reservation", System.currentTimeMillis());
                edit.putLong("ayet_last_dl_reservation_count", 0L);
                edit.commit();
                if (this.b.getRedirectionUrl() != null && this.b.getRedirectionUrl().length() > 0) {
                    try {
                        g1 g1Var = this.c;
                        if (g1Var != null) {
                            g1Var.stopProgressDialog();
                        }
                        this.f12111a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.b.getRedirectionUrl())));
                        return;
                    } catch (Exception e) {
                        g1 g1Var2 = this.c;
                        if (g1Var2 != null) {
                            g1Var2.stopProgressDialog();
                        }
                        e.getMessage();
                        if (this.b.getPackageName() == null || this.b.getPackageName().length() <= 0) {
                            return;
                        }
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setFlags(268435456);
                        intent.setData(Uri.parse(this.b.getRedirectionUrl()));
                        this.f12111a.startActivity(intent);
                        return;
                    }
                }
                g1 g1Var3 = this.c;
                if (g1Var3 != null) {
                    g1Var3.stopProgressDialog();
                }
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse("market://details?id=" + this.b.getPackageName()));
                    this.f12111a.startActivity(intent2);
                    return;
                } catch (Exception e2) {
                    e2.getMessage();
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    intent3.setFlags(268435456);
                    intent3.setData(Uri.parse("market://details?id=" + this.b.getPackageName()));
                    this.f12111a.startActivity(intent3);
                    return;
                }
            }
            g1 g1Var4 = this.c;
            if (g1Var4 != null) {
                g1Var4.stopProgressDialog();
            }
            String str3 = this.d;
            if (str3 == null || str3.length() <= 0) {
                return;
            }
            Toast.makeText(this.f12111a.getApplicationContext(), this.d, 1).show();
        }
    }

    public void a(Context context, String str, int i, String str2, ViewGroup viewGroup, String str3, u0 u0Var) {
        w0 w0Var = new w0(i, context, str3);
        w0Var.setCallback(new a(this, viewGroup, w0Var, u0Var));
        w0Var.clearCache(true);
        w0Var.setVisibility(8);
        if (str2 != null && str2.length() > 0) {
            w0Var.getSettings().setUserAgentString(str2);
        }
        viewGroup.addView(w0Var);
        w0Var.loadUrl(str);
    }

    public void a(Context context, int i, String str, String str2, String str3, String str4, g1 g1Var) {
        RequestOfferData requestOfferData = new RequestOfferData(i, str, str2, str3);
        new j1(context, requestOfferData).execute(new b(this, context, requestOfferData, g1Var, str4));
    }

    public void a(Context context, RequestOfferData requestOfferData) {
        if (requestOfferData.getPackageName() != null && !requestOfferData.getPackageName().isEmpty()) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=" + requestOfferData.getPackageName()));
                context.startActivity(intent);
                return;
            } catch (Exception e) {
                e.getMessage();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setFlags(268435456);
                intent2.setData(Uri.parse("market://details?id=" + requestOfferData.getPackageName()));
                context.startActivity(intent2);
                return;
            }
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(requestOfferData.getRedirectionUrl())));
        } catch (Exception unused) {
            if (requestOfferData.getRedirectionUrl() == null || requestOfferData.getRedirectionUrl().length() <= 0) {
                return;
            }
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setFlags(268435456);
            intent3.setData(Uri.parse(requestOfferData.getRedirectionUrl()));
            context.startActivity(intent3);
        }
    }
}
