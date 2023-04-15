package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import jp.co.cyberagent.android.gpuimage.GPUImageToonFilter;
/* loaded from: classes10.dex */
public class ToonFilterTransformation extends GPUFilterTransformation {
    private float mQuantizationLevels;
    private float mThreshold;

    public ToonFilterTransformation(Context context) {
        this(context, 0.2f, 10.0f);
    }

    public ToonFilterTransformation(Context context, float f, float f2) {
        super(context, new GPUImageToonFilter());
        this.mThreshold = f;
        this.mQuantizationLevels = f2;
        GPUImageToonFilter gPUImageToonFilter = (GPUImageToonFilter) getFilter();
        gPUImageToonFilter.setThreshold(this.mThreshold);
        gPUImageToonFilter.setQuantizationLevels(this.mQuantizationLevels);
    }

    @Override // jp.wasabeef.picasso.transformations.gpu.GPUFilterTransformation, com.squareup.picasso.Transformation
    public String key() {
        return "ToonFilterTransformation(threshold=" + this.mThreshold + ",quantizationLevels=" + this.mQuantizationLevels + ")";
    }
}
