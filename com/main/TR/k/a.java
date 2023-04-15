package TR.k;

import TR.m.j;
import TR.q.h;
import com.tapr.helpers.JsonHelper;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a {
    public j a(JSONObject jSONObject) {
        return (j) new JsonHelper().fromJson(jSONObject, j.class);
    }

    public ArrayList<j> b(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = (JSONArray) jSONObject.get("rewards");
            ArrayList<j> arrayList = new ArrayList<>(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    j jVar = (j) new JsonHelper().fromJson((JSONObject) jSONArray.get(i), j.class);
                    h.a(new JsonHelper().toJson(jVar).toString());
                    arrayList.add(jVar);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            if (arrayList.size() == 0) {
                h.i("No rewards found");
                return null;
            }
            return arrayList;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
