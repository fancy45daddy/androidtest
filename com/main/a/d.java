package a;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes.dex */
public final class d extends AsyncTask<String, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public final a f627a;

    public d(a aVar) {
        this.f627a = aVar;
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(String[] strArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(strArr[0]).openConnection()));
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setRequestMethod("GET");
            if (httpURLConnection.getResponseCode() != 200) {
                this.f627a.a(new IllegalStateException(httpURLConnection.getResponseMessage()));
                return null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return stringBuffer.toString();
                }
                stringBuffer.append(readLine);
            }
        } catch (Exception e) {
            this.f627a.a(e);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(String str) {
        String str2 = str;
        super.onPostExecute(str2);
        if (str2 != null) {
            this.f627a.a(str2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }
}
