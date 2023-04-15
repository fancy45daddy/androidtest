package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import jp.co.cyberagent.android.gpuimage.GPUImageFilter;
/* loaded from: classes10.dex */
public class GPUFilterTransformation implements Transformation {
    private Context mContext;
    private GPUImageFilter mFilter;

    public GPUFilterTransformation(Context context, GPUImageFilter gPUImageFilter) {
        this.mContext = context.getApplicationContext();
        this.mFilter = gPUImageFilter;
    }

    @Override // com.squareup.picasso.Transformation
    public Bitmap transform(Bitmap bitmap) {
        GPUImage gPUImage = new GPUImage(this.mContext);
        gPUImage.setImage(bitmap);
        gPUImage.setFilter(this.mFilter);
        Bitmap bitmapWithFilterApplied = gPUImage.getBitmapWithFilterApplied();
        bitmap.recycle();
        return bitmapWithFilterApplied;
    }

    @Override // com.squareup.picasso.Transformation
    public String key() {
        return getClass().getSimpleName();
    }

    public <T> T getFilter() {
        return (T) this.mFilter;
    }
}
