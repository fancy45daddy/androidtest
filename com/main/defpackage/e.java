package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.ayetstudios.publishersdk.interfaces.VideoCheckCallback;
import com.ayetstudios.publishersdk.messages.VideoCheckResponseMessage;
import com.current.android.commons.extensions.DeeplinkExtKt;
/* renamed from: e  reason: default package */
/* loaded from: classes4.dex */
public class e extends AsyncTask<VideoCheckCallback, Void, Boolean> {
    private static final String f = "e";

    /* renamed from: a  reason: collision with root package name */
    private Context f11837a;
    private VideoCheckResponseMessage b = null;
    private VideoCheckCallback c = null;
    private String d;
    private String e;

    public e(Context context, String str, String str2) {
        this.f11837a = context;
        this.d = str;
        this.e = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Boolean doInBackground(VideoCheckCallback... videoCheckCallbackArr) {
        if (videoCheckCallbackArr.length == 1) {
            this.c = videoCheckCallbackArr[0];
            try {
                Context context = this.f11837a;
                String a2 = l1.a(context, "Video/videoCheck/" + this.d + DeeplinkExtKt.BACKSLASH + this.e, "");
                if (a2 == null) {
                    return Boolean.FALSE;
                }
                this.b = (VideoCheckResponseMessage) new u().a(a2, (Class<Object>) VideoCheckResponseMessage.class);
                return Boolean.TRUE;
            } catch (Exception e) {
                e.getMessage();
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        VideoCheckCallback videoCheckCallback = this.c;
        if (videoCheckCallback != null) {
            videoCheckCallback.onDone(bool.booleanValue(), this.b);
        }
    }
}
