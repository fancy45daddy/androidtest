package jp.wasabeef.picasso.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Transformation;
import jp.wasabeef.picasso.transformations.internal.Utils;
/* loaded from: classes10.dex */
public class MaskTransformation implements Transformation {
    private static Paint mMaskingPaint;
    private Context mContext;
    private int mMaskId;

    static {
        Paint paint = new Paint();
        mMaskingPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public MaskTransformation(Context context, int i) {
        this.mContext = context.getApplicationContext();
        this.mMaskId = i;
    }

    @Override // com.squareup.picasso.Transformation
    public Bitmap transform(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Drawable maskDrawable = Utils.getMaskDrawable(this.mContext, this.mMaskId);
        Canvas canvas = new Canvas(createBitmap);
        maskDrawable.setBounds(0, 0, width, height);
        maskDrawable.draw(canvas);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, mMaskingPaint);
        bitmap.recycle();
        return createBitmap;
    }

    @Override // com.squareup.picasso.Transformation
    public String key() {
        return "MaskTransformation(maskId=" + this.mContext.getResources().getResourceEntryName(this.mMaskId) + ")";
    }
}
