package TR.m;

import TR.l.m;
import com.tapr.helpers.JsonKey;
import java.util.List;
/* loaded from: classes.dex */
public class m {
    @JsonKey("placement_ids")
    private List<g> placementIds;
    @JsonKey("status")
    private int status;

    public List<g> a() {
        return this.placementIds;
    }

    public m.a b() {
        return m.a.values()[this.status];
    }
}
