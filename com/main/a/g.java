package a;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f629a;

    public g(h hVar) {
        this.f629a = hVar;
    }

    @Override // a.a
    public final void a(Exception exc) {
        this.f629a.a(exc);
    }

    @Override // a.a
    public final void a(String str) {
        try {
            this.f629a.a(new JSONObject(str).getString("access_token"));
        } catch (JSONException e) {
            this.f629a.a(e);
        }
    }
}
