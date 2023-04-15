package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import jp.co.cyberagent.android.gpuimage.GPUImageBrightnessFilter;
/* loaded from: classes10.dex */
public class BrightnessFilterTransformation extends GPUFilterTransformation {
    private float mBrightness;

    public BrightnessFilterTransformation(Context context) {
        this(context, 0.0f);
    }

    public BrightnessFilterTransformation(Context context, float f) {
        super(context, new GPUImageBrightnessFilter());
        this.mBrightness = f;
        ((GPUImageBrightnessFilter) getFilter()).setBrightness(this.mBrightness);
    }

    @Override // jp.wasabeef.picasso.transformations.gpu.GPUFilterTransformation, com.squareup.picasso.Transformation
    public String key() {
        return "BrightnessFilterTransformation(brightness=" + this.mBrightness + ")";
    }
}
