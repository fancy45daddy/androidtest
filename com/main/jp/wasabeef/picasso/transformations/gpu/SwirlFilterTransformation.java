package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import android.graphics.PointF;
import jp.co.cyberagent.android.gpuimage.GPUImageSwirlFilter;
/* loaded from: classes10.dex */
public class SwirlFilterTransformation extends GPUFilterTransformation {
    private float mAngle;
    private PointF mCenter;
    private float mRadius;

    public SwirlFilterTransformation(Context context) {
        this(context, 0.5f, 1.0f, new PointF(0.5f, 0.5f));
    }

    public SwirlFilterTransformation(Context context, float f, float f2, PointF pointF) {
        super(context, new GPUImageSwirlFilter());
        this.mRadius = f;
        this.mAngle = f2;
        this.mCenter = pointF;
        GPUImageSwirlFilter gPUImageSwirlFilter = (GPUImageSwirlFilter) getFilter();
        gPUImageSwirlFilter.setRadius(this.mRadius);
        gPUImageSwirlFilter.setAngle(this.mAngle);
        gPUImageSwirlFilter.setCenter(this.mCenter);
    }

    @Override // jp.wasabeef.picasso.transformations.gpu.GPUFilterTransformation, com.squareup.picasso.Transformation
    public String key() {
        return "SwirlFilterTransformation(radius=" + this.mRadius + ",angle=" + this.mAngle + ",center=" + this.mCenter.toString() + ")";
    }
}
