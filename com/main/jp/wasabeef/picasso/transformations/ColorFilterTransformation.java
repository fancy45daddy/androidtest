package jp.wasabeef.picasso.transformations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.squareup.picasso.Transformation;
/* loaded from: classes10.dex */
public class ColorFilterTransformation implements Transformation {
    private int mColor;

    public ColorFilterTransformation(int i) {
        this.mColor = i;
    }

    @Override // com.squareup.picasso.Transformation
    public Bitmap transform(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(new PorterDuffColorFilter(this.mColor, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    @Override // com.squareup.picasso.Transformation
    public String key() {
        return "ColorFilterTransformation(color=" + this.mColor + ")";
    }
}
