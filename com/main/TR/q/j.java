package TR.q;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.tapr.helpers.JsonHelper;
import com.tapr.sdk.PlacementCustomParameters;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f614a = "tapresearch";
    private static final String b = "last_viewed_offer";
    private static final String c = "last_placement_parameter";
    private static final String d = "Session end time";

    private j() {
    }

    public static PlacementCustomParameters a(Context context) {
        String string = context.getSharedPreferences(b.M, 0).getString(c, "");
        if (string.equalsIgnoreCase("")) {
            return null;
        }
        try {
            return (PlacementCustomParameters) new JsonHelper().fromJson(new JSONObject(string), PlacementCustomParameters.class);
        } catch (JSONException unused) {
            h.a("Failed to parse the custom parameter from the SharedPreferences");
            return null;
        } catch (Exception e) {
            h.a("JSON Exception was skipped", e, b.P);
            return null;
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        Application k = TR.d.b.i().k();
        if (k == null) {
            h.c("main application is missing");
            return null;
        }
        String string = k.getSharedPreferences(f614a, 0).getString(str, "");
        if (string.equals("")) {
            return null;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 0));
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object readObject = objectInputStream.readObject();
            byteArrayInputStream.close();
            objectInputStream.close();
            return cls.cast(readObject);
        } catch (Exception e) {
            a(str, (Serializable) null);
            e.printStackTrace();
            return null;
        }
    }

    public static void a(Context context, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences(b.M, 0).edit();
        edit.putLong(d, j);
        edit.commit();
    }

    public static void a(Context context, PlacementCustomParameters placementCustomParameters) {
        String jSONObject = placementCustomParameters == null ? "" : new JsonHelper().toJson(placementCustomParameters).toString();
        SharedPreferences.Editor edit = context.getSharedPreferences(b.M, 0).edit();
        edit.putString(c, jSONObject);
        edit.commit();
    }

    public static void a(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences(b.M, 0).edit();
        edit.putString(b, str);
        edit.commit();
    }

    public static synchronized void a(String str, Serializable serializable) {
        synchronized (j.class) {
            Application k = TR.d.b.i().k();
            if (k == null) {
                h.c("main application is missing");
                return;
            }
            SharedPreferences.Editor edit = k.getSharedPreferences(f614a, 0).edit();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(serializable);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                objectOutputStream.close();
                byteArrayOutputStream.close();
                edit.putString(str, Base64.encodeToString(byteArray, 0));
                edit.apply();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String b(Context context) {
        return context.getSharedPreferences(b.M, 0).getString(b, "");
    }

    public static long c(Context context) {
        return context.getSharedPreferences(b.M, 0).getLong(d, System.currentTimeMillis());
    }
}
