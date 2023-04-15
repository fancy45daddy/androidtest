package TR.q;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.tapr.R;
/* loaded from: classes.dex */
public final class f {
    private f() {
    }

    public static Dialog a(Context context) {
        Dialog dialog = new Dialog(context, 16973832);
        View inflate = View.inflate(context, R.layout.progress_dialog, null);
        dialog.requestWindowFeature(1);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawableResource(17170445);
        }
        dialog.setContentView(inflate);
        return dialog;
    }
}
