package a;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes.dex */
public final class b extends AsyncTask<String, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public final a f625a;

    public b(a aVar) {
        this.f625a = aVar;
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(String[] strArr) {
        a aVar;
        Exception illegalStateException;
        String[] strArr2 = strArr;
        String str = strArr2[0];
        String str2 = strArr2[1];
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + str2);
            if (httpURLConnection.getResponseCode() != 200) {
                if (httpURLConnection.getResponseMessage().equals("Unauthorized") && (httpURLConnection.getResponseCode() == 401)) {
                    aVar = this.f625a;
                    illegalStateException = new i(httpURLConnection.getResponseMessage());
                } else {
                    aVar = this.f625a;
                    illegalStateException = new IllegalStateException(httpURLConnection.getResponseMessage());
                }
                aVar.a(illegalStateException);
                return null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Exception e) {
            this.f625a.a(e);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(String str) {
        String str2 = str;
        super.onPostExecute(str2);
        if (str2 != null) {
            this.f625a.a(str2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }
}
