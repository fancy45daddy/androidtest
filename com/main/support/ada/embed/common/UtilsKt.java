package support.ada.embed.common;

import android.content.res.TypedArray;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import support.ada.embed.widget.Event;
/* compiled from: Utils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a±\u0001\u0010\u000e\u001a\u00020\u000f*\u0085\u0001\u0012\u0004\u0012\u00020\u0001\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000f0\u00120\u00110\u0010jT\u0012\u0004\u0012\u00020\u0001\u0012J\u0012H\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000f0\u00120\u0011j#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000f0\u0012`\u0018`\u00172!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000f0\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"EMPTY", "", "createMetaFields", "", "", "inputStream", "Ljava/io/InputStream;", "mapToJson", "Lorg/json/JSONObject;", "map", "getStringOrEmpty", "Landroid/content/res/TypedArray;", "idRes", "", "removeEventCallback", "", "Ljava/util/HashMap;", "Ljava/util/HashSet;", "Lkotlin/Function1;", "Lsupport/ada/embed/widget/Event;", "Lkotlin/ParameterName;", "name", "event", "Lkotlin/collections/HashMap;", "Lkotlin/collections/HashSet;", "eventCallback", "ada-embed_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes11.dex */
public final class UtilsKt {
    public static final String EMPTY = "";

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes11.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonToken.NUMBER.ordinal()] = 1;
            iArr[JsonToken.BOOLEAN.ordinal()] = 2;
            iArr[JsonToken.STRING.ordinal()] = 3;
        }
    }

    public static final /* synthetic */ String getStringOrEmpty(TypedArray getStringOrEmpty, int i) {
        Intrinsics.checkParameterIsNotNull(getStringOrEmpty, "$this$getStringOrEmpty");
        String string = getStringOrEmpty.getString(i);
        if (string == null) {
            string = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(idRes) ?: EMPTY");
        return string;
    }

    public static final /* synthetic */ Map<String, Object> createMetaFields(InputStream inputStream) {
        Object valueOf;
        Intrinsics.checkParameterIsNotNull(inputStream, "inputStream");
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonReader jsonReader2 = jsonReader;
        try {
            JsonReader jsonReader3 = jsonReader2;
            if (jsonReader3.peek() != JsonToken.BEGIN_OBJECT) {
                throw new MetaFieldsJsonException();
            }
            jsonReader3.beginObject();
            while (jsonReader3.hasNext()) {
                String key = jsonReader3.nextName();
                JsonToken peek = jsonReader3.peek();
                if (peek != null) {
                    int i = WhenMappings.$EnumSwitchMapping$0[peek.ordinal()];
                    if (i == 1) {
                        valueOf = Double.valueOf(jsonReader3.nextDouble());
                    } else if (i == 2) {
                        valueOf = Boolean.valueOf(jsonReader3.nextBoolean());
                    } else if (i == 3) {
                        valueOf = jsonReader3.nextString();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(valueOf, "when (it.peek()) {\n     …Exception()\n            }");
                    Intrinsics.checkExpressionValueIsNotNull(key, "key");
                    linkedHashMap.put(key, valueOf);
                }
                throw new MetaFieldsJsonException();
            }
            jsonReader3.endObject();
            if (jsonReader3.peek() != JsonToken.END_DOCUMENT) {
                throw new MetaFieldsJsonException();
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(jsonReader2, null);
            return linkedHashMap;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(jsonReader2, th);
                throw th2;
            }
        }
    }

    public static final /* synthetic */ JSONObject mapToJson(Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        if (!map.isEmpty()) {
            return new JSONObject((Map<?, ?>) map);
        }
        return null;
    }

    public static final /* synthetic */ void removeEventCallback(HashMap<String, HashSet<Function1<Event, Unit>>> removeEventCallback, Function1<? super Event, Unit> eventCallback) {
        Intrinsics.checkParameterIsNotNull(removeEventCallback, "$this$removeEventCallback");
        Intrinsics.checkParameterIsNotNull(eventCallback, "eventCallback");
        for (Map.Entry<String, HashSet<Function1<Event, Unit>>> entry : removeEventCallback.entrySet()) {
            entry.getValue().remove(eventCallback);
        }
    }
}
