package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.ImageView;
import android.widget.RelativeLayout;
/* renamed from: g  reason: default package */
/* loaded from: classes5.dex */
public class g extends ImageView {
    public g(Context context) {
        super(context);
        a();
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 8) {
            setImageBitmap(f.a().a(getResources(), getContext()).getBitmap());
        }
        int a2 = a2.a(getContext(), 30);
        setLayoutParams(new RelativeLayout.LayoutParams(a2, a2));
        ((RelativeLayout.LayoutParams) getLayoutParams()).addRule(11);
        ((RelativeLayout.LayoutParams) getLayoutParams()).setMargins(a2.a(getContext(), 3), a2.a(getContext(), 3), a2.a(getContext(), 3), a2.a(getContext(), 3));
    }
}
