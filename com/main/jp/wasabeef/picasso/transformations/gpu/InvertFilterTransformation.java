package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import jp.co.cyberagent.android.gpuimage.GPUImageColorInvertFilter;
/* loaded from: classes10.dex */
public class InvertFilterTransformation extends GPUFilterTransformation {
    @Override // jp.wasabeef.picasso.transformations.gpu.GPUFilterTransformation, com.squareup.picasso.Transformation
    public String key() {
        return "InvertFilterTransformation()";
    }

    public InvertFilterTransformation(Context context) {
        super(context, new GPUImageColorInvertFilter());
    }
}
