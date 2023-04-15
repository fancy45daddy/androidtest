package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import android.graphics.PointF;
import java.util.Arrays;
import jp.co.cyberagent.android.gpuimage.GPUImageVignetteFilter;
/* loaded from: classes10.dex */
public class VignetteFilterTransformation extends GPUFilterTransformation {
    private PointF mCenter;
    private float[] mVignetteColor;
    private float mVignetteEnd;
    private float mVignetteStart;

    public VignetteFilterTransformation(Context context) {
        this(context, new PointF(0.5f, 0.5f), new float[]{0.0f, 0.0f, 0.0f}, 0.0f, 0.75f);
    }

    public VignetteFilterTransformation(Context context, PointF pointF, float[] fArr, float f, float f2) {
        super(context, new GPUImageVignetteFilter());
        this.mCenter = pointF;
        this.mVignetteColor = fArr;
        this.mVignetteStart = f;
        this.mVignetteEnd = f2;
        GPUImageVignetteFilter gPUImageVignetteFilter = (GPUImageVignetteFilter) getFilter();
        gPUImageVignetteFilter.setVignetteCenter(this.mCenter);
        gPUImageVignetteFilter.setVignetteColor(this.mVignetteColor);
        gPUImageVignetteFilter.setVignetteStart(this.mVignetteStart);
        gPUImageVignetteFilter.setVignetteEnd(this.mVignetteEnd);
    }

    @Override // jp.wasabeef.picasso.transformations.gpu.GPUFilterTransformation, com.squareup.picasso.Transformation
    public String key() {
        return "VignetteFilterTransformation(center=" + this.mCenter.toString() + ",color=" + Arrays.toString(this.mVignetteColor) + ",start=" + this.mVignetteStart + ",end=" + this.mVignetteEnd + ")";
    }
}
