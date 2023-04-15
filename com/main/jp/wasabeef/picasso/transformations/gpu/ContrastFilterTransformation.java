package jp.wasabeef.picasso.transformations.gpu;

import android.content.Context;
import jp.co.cyberagent.android.gpuimage.GPUImageContrastFilter;
/* loaded from: classes10.dex */
public class ContrastFilterTransformation extends GPUFilterTransformation {
    private float mContrast;

    public ContrastFilterTransformation(Context context) {
        this(context, 1.0f);
    }

    public ContrastFilterTransformation(Context context, float f) {
        super(context, new GPUImageContrastFilter());
        this.mContrast = f;
        ((GPUImageContrastFilter) getFilter()).setContrast(this.mContrast);
    }

    @Override // jp.wasabeef.picasso.transformations.gpu.GPUFilterTransformation, com.squareup.picasso.Transformation
    public String key() {
        return "ContrastFilterTransformation(contrast=" + this.mContrast + ")";
    }
}
