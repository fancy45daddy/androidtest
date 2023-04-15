package a;

import android.os.AsyncTask;
import com.current.android.data_services.network.interceptors.BaseInterceptorKt;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes.dex */
public final class c extends AsyncTask<String, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public final a f626a;
    public boolean b = false;
    public Exception c;

    public c(a aVar) {
        this.f626a = aVar;
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(String[] strArr) {
        String responseMessage;
        String[] strArr2 = strArr;
        String str = strArr2[0];
        String str2 = strArr2[1];
        String str3 = strArr2[2];
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Authorization", "Bearer " + str2);
            httpURLConnection.setRequestProperty("Content-Type", BaseInterceptorKt.HEADER_VALUE_ACCEPT);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            bufferedWriter.write(str3);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
                this.b = true;
                responseMessage = sb.toString();
            } else {
                if (httpURLConnection.getResponseMessage().equals("Unauthorized") && (httpURLConnection.getResponseCode() == 401)) {
                    this.f626a.a(new i(httpURLConnection.getResponseMessage()));
                    return null;
                }
                responseMessage = httpURLConnection.getResponseMessage();
            }
            return responseMessage;
        } catch (Exception e) {
            this.c = e;
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(String str) {
        String str2 = str;
        super.onPostExecute(str2);
        if (this.b) {
            this.f626a.a(str2);
        } else {
            this.f626a.a(this.c);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
    }
}
