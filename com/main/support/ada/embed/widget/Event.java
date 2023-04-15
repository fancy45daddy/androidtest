package support.ada.embed.widget;

import com.clevertap.android.sdk.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: Event.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lsupport/ada/embed/widget/Event;", "", "userData", "Lorg/json/JSONObject;", "chatterTranscript", "", "eventName", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V", "getChatterTranscript", "()Ljava/lang/String;", "getEventName", "getUserData", "()Lorg/json/JSONObject;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "Companion", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes11.dex */
public final class Event {
    public static final String CHATTER_TRANSCRIPT = "chatter_transcript";
    public static final Companion Companion = new Companion(null);
    public static final String EVENT_NAME = "event_name";
    public static final String USER_DATA = "user_data";
    private final String chatterTranscript;
    private final String eventName;
    private final JSONObject userData;

    public static /* synthetic */ Event copy$default(Event event, JSONObject jSONObject, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = event.userData;
        }
        if ((i & 2) != 0) {
            str = event.chatterTranscript;
        }
        if ((i & 4) != 0) {
            str2 = event.eventName;
        }
        return event.copy(jSONObject, str, str2);
    }

    public final JSONObject component1() {
        return this.userData;
    }

    public final String component2() {
        return this.chatterTranscript;
    }

    public final String component3() {
        return this.eventName;
    }

    public final Event copy(JSONObject jSONObject, String str, String str2) {
        return new Event(jSONObject, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Event) {
                Event event = (Event) obj;
                return Intrinsics.areEqual(this.userData, event.userData) && Intrinsics.areEqual(this.chatterTranscript, event.chatterTranscript) && Intrinsics.areEqual(this.eventName, event.eventName);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        JSONObject jSONObject = this.userData;
        int hashCode = (jSONObject != null ? jSONObject.hashCode() : 0) * 31;
        String str = this.chatterTranscript;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.eventName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event(userData=" + this.userData + ", chatterTranscript=" + this.chatterTranscript + ", eventName=" + this.eventName + ")";
    }

    public Event(JSONObject jSONObject, String str, String str2) {
        this.userData = jSONObject;
        this.chatterTranscript = str;
        this.eventName = str2;
    }

    public final JSONObject getUserData() {
        return this.userData;
    }

    public final String getChatterTranscript() {
        return this.chatterTranscript;
    }

    public final String getEventName() {
        return this.eventName;
    }

    /* compiled from: Event.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsupport/ada/embed/widget/Event$Companion;", "", "()V", "CHATTER_TRANSCRIPT", "", "EVENT_NAME", "USER_DATA", "from", "Lsupport/ada/embed/widget/Event;", "event", "ada-embed_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Event from(String event) {
            Intrinsics.checkParameterIsNotNull(event, "event");
            JSONObject jSONObject = new JSONObject(event);
            return new Event(jSONObject.optJSONObject(Event.USER_DATA), jSONObject.optString(Event.CHATTER_TRANSCRIPT), jSONObject.optString("event_name"));
        }
    }
}
