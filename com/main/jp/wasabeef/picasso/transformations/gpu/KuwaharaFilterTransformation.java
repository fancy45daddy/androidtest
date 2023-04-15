package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import jp.co.cyberagent.android.gpuimage.GPUImageKuwaharaFilter;
/* loaded from: classes10.dex */
public class KuwaharaFilterTransformation extends GPUFilterTransformation {
    private int mRadius;

    public KuwaharaFilterTransformation(Context context) {
        this(context, 25);
    }

    public KuwaharaFilterTransformation(Context context, int i) {
        super(context, new GPUImageKuwaharaFilter());
        this.mRadius = i;
        ((GPUImageKuwaharaFilter) getFilter()).setRadius(this.mRadius);
    }

    @Override // jp.wasabeef.picasso.transformations.gpu.GPUFilterTransformation, com.squareup.picasso.Transformation
    public String key() {
        return "KuwaharaFilterTransformation(radius=" + this.mRadius + ")";
    }
}
