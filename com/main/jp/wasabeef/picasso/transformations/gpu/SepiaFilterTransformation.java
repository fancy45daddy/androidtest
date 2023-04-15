package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import jp.co.cyberagent.android.gpuimage.GPUImageSepiaFilter;
/* loaded from: classes10.dex */
public class SepiaFilterTransformation extends GPUFilterTransformation {
    private float mIntensity;

    public SepiaFilterTransformation(Context context) {
        this(context, 1.0f);
    }

    public SepiaFilterTransformation(Context context, float f) {
        super(context, new GPUImageSepiaFilter());
        this.mIntensity = f;
        ((GPUImageSepiaFilter) getFilter()).setIntensity(this.mIntensity);
    }

    @Override // jp.wasabeef.picasso.transformations.gpu.GPUFilterTransformation, com.squareup.picasso.Transformation
    public String key() {
        return "SepiaFilterTransformation(intensity=" + this.mIntensity + ")";
    }
}
