package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import jp.co.cyberagent.android.gpuimage.GPUImageSketchFilter;
/* loaded from: classes10.dex */
public class SketchFilterTransformation extends GPUFilterTransformation {
    @Override // jp.wasabeef.picasso.transformations.gpu.GPUFilterTransformation, com.squareup.picasso.Transformation
    public String key() {
        return "SketchFilterTransformation()";
    }

    public SketchFilterTransformation(Context context) {
        super(context, new GPUImageSketchFilter());
    }
}
