package jp.wasabeef.picasso.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import com.squareup.picasso.Transformation;
import jp.wasabeef.picasso.transformations.internal.FastBlur;
import jp.wasabeef.picasso.transformations.internal.RSBlur;
/* loaded from: classes10.dex */
public class BlurTransformation implements Transformation {
    private static int DEFAULT_DOWN_SAMPLING = 1;
    private static int MAX_RADIUS = 25;
    private Context mContext;
    private int mRadius;
    private int mSampling;

    public BlurTransformation(Context context) {
        this(context, MAX_RADIUS, DEFAULT_DOWN_SAMPLING);
    }

    public BlurTransformation(Context context, int i) {
        this(context, i, DEFAULT_DOWN_SAMPLING);
    }

    public BlurTransformation(Context context, int i, int i2) {
        this.mContext = context.getApplicationContext();
        this.mRadius = i;
        this.mSampling = i2;
    }

    @Override // com.squareup.picasso.Transformation
    public Bitmap transform(Bitmap bitmap) {
        Bitmap blur;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() / this.mSampling, bitmap.getHeight() / this.mSampling, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i = this.mSampling;
        canvas.scale(1.0f / i, 1.0f / i);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                blur = RSBlur.blur(this.mContext, createBitmap, this.mRadius);
            } catch (RSRuntimeException unused) {
                blur = FastBlur.blur(createBitmap, this.mRadius, true);
            }
        } else {
            blur = FastBlur.blur(createBitmap, this.mRadius, true);
        }
        bitmap.recycle();
        return blur;
    }

    @Override // com.squareup.picasso.Transformation
    public String key() {
        return "BlurTransformation(radius=" + this.mRadius + ", sampling=" + this.mSampling + ")";
    }
}
