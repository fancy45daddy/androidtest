package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import jp.co.cyberagent.android.gpuimage.GPUImagePixelationFilter;
/* loaded from: classes10.dex */
public class PixelationFilterTransformation extends GPUFilterTransformation {
    private float mPixel;

    public PixelationFilterTransformation(Context context) {
        this(context, 10.0f);
    }

    public PixelationFilterTransformation(Context context, float f) {
        super(context, new GPUImagePixelationFilter());
        this.mPixel = f;
        ((GPUImagePixelationFilter) getFilter()).setPixel(this.mPixel);
    }

    @Override // jp.wasabeef.picasso.transformations.gpu.GPUFilterTransformation, com.squareup.picasso.Transformation
    public String key() {
        return "PixelationFilterTransformation(pixel=" + this.mPixel + ")";
    }
}
