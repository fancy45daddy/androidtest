package jp.wasabeef.picasso.transformations;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;
/* loaded from: classes10.dex */
public class CropSquareTransformation implements Transformation {
    private int mHeight;
    private int mWidth;

    @Override // com.squareup.picasso.Transformation
    public Bitmap transform(Bitmap bitmap) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        this.mWidth = (bitmap.getWidth() - min) / 2;
        int height = (bitmap.getHeight() - min) / 2;
        this.mHeight = height;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, this.mWidth, height, min, min);
        if (createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    @Override // com.squareup.picasso.Transformation
    public String key() {
        return "CropSquareTransformation(width=" + this.mWidth + ", height=" + this.mHeight + ")";
    }
}
