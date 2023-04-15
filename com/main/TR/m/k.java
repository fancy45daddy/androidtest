package TR.m;

import com.sense360.android.quinoa.lib.visit.foregroundservice.detector.ForegroundServiceDetectorTask;
import com.tapr.helpers.JsonKey;
import java.util.List;
/* loaded from: classes.dex */
public class k {
    @JsonKey("end_time")
    private String end_time;
    @JsonKey("event_type")
    private String event_type;
    @JsonKey("id")
    private int id;
    @JsonKey("identifier")
    private String identifier;
    @JsonKey("images")
    private List<d> images;
    @JsonKey("placement_type")
    private String placement_type;
    @JsonKey(ForegroundServiceDetectorTask.ARRIVAL_FOREGROUND_SERVICE_START_TIME_KEY)
    private String start_time;
    @JsonKey("tag")
    private String tag;

    public String a() {
        return this.end_time;
    }

    public String b() {
        return this.event_type;
    }

    public int c() {
        return this.id;
    }

    public String d() {
        return this.identifier;
    }

    public List<d> e() {
        return this.images;
    }

    public String f() {
        return this.placement_type;
    }

    public String g() {
        return this.start_time;
    }

    public String h() {
        return this.tag;
    }
}
