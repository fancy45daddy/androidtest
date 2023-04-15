package defpackage;

import android.content.Context;
import com.ayetstudios.publishersdk.a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.zip.GZIPInputStream;
import org.apache.commons.lang3.CharUtils;
/* renamed from: l1  reason: default package */
/* loaded from: classes8.dex */
public class l1 {
    public static String a(Context context, String str, String str2) {
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        StringBuffer stringBuffer;
        int i = (str.indexOf("Offers/sdk_init") >= 0 || str.indexOf("Offers/sdk_conversion") >= 0 || str.indexOf("S2s/sdk_neo/init") >= 0 || str.indexOf("S2s/sdk_neo/install") >= 0 || str.indexOf("S2s/sdk_neo/event") >= 0) ? 6 : 2;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                try {
                    Thread.sleep(i2 * 2000);
                } catch (Exception unused) {
                }
            }
            try {
                String g = a.g(context);
                if (str2 != null) {
                    g = g + str2;
                }
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://www.ayetstudios.com/" + str).openConnection()));
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(20000);
                boolean z = true;
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.writeBytes(g);
                dataOutputStream.flush();
                dataOutputStream.close();
                String headerField = httpURLConnection.getHeaderField("Content-Encoding");
                z = (headerField == null || !headerField.toLowerCase().contains("gzip")) ? false : false;
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (z) {
                        bufferedInputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
                    } else {
                        bufferedInputStream = new BufferedInputStream(inputStream);
                    }
                } catch (FileNotFoundException unused2) {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (z) {
                        bufferedInputStream = new BufferedInputStream(new GZIPInputStream(errorStream));
                    } else {
                        bufferedInputStream = new BufferedInputStream(errorStream);
                    }
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
                stringBuffer = new StringBuffer();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                    stringBuffer.append(CharUtils.CR);
                }
                bufferedReader.close();
                httpURLConnection.disconnect();
            } catch (IOException e) {
                e.getMessage();
            }
            if (httpURLConnection.getResponseCode() >= 500 && httpURLConnection.getResponseCode() < 600 && i2 < i - 1) {
                httpURLConnection.getResponseCode();
            } else {
                return stringBuffer.toString();
            }
        }
        return null;
    }

    public static String b(Context context, String str, String str2) {
        BufferedInputStream bufferedInputStream;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setRequestMethod("GET");
            boolean z = false;
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("User-Agent", str2);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.flush();
            dataOutputStream.close();
            String headerField = httpURLConnection.getHeaderField("Content-Encoding");
            if (headerField != null && headerField.toLowerCase().contains("gzip")) {
                z = true;
            }
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (z) {
                    bufferedInputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
                } else {
                    bufferedInputStream = new BufferedInputStream(inputStream);
                }
            } catch (FileNotFoundException unused) {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (z) {
                    bufferedInputStream = new BufferedInputStream(new GZIPInputStream(errorStream));
                } else {
                    bufferedInputStream = new BufferedInputStream(errorStream);
                }
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
                stringBuffer.append(CharUtils.CR);
            }
            bufferedReader.close();
            httpURLConnection.disconnect();
            if (httpURLConnection.getResponseCode() == 200 && a2.c(stringBuffer.toString())) {
                return stringBuffer.toString();
            }
            return null;
        } catch (IOException e) {
            e.getMessage();
            return null;
        }
    }

    public static String a(String str, String str2) {
        try {
            return "&" + str + "=" + URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }
}
