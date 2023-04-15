package jp.wasabeef.picasso.transformations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import com.squareup.picasso.Transformation;
/* loaded from: classes10.dex */
public class CropTransformation implements Transformation {
    private static final String TAG = "PicassoTransformation";
    private float mAspectRatio;
    private GravityHorizontal mGravityHorizontal;
    private GravityVertical mGravityVertical;
    private int mHeight;
    private float mHeightRatio;
    private int mLeft;
    private int mTop;
    private int mWidth;
    private float mWidthRatio;

    /* loaded from: classes10.dex */
    public enum GravityHorizontal {
        LEFT,
        CENTER,
        RIGHT
    }

    /* loaded from: classes10.dex */
    public enum GravityVertical {
        TOP,
        CENTER,
        BOTTOM
    }

    public CropTransformation(int i, int i2, int i3, int i4) {
        this.mGravityHorizontal = GravityHorizontal.CENTER;
        GravityVertical gravityVertical = GravityVertical.CENTER;
        this.mLeft = i;
        this.mTop = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        this.mGravityHorizontal = null;
        this.mGravityVertical = null;
    }

    public CropTransformation(int i, int i2, GravityHorizontal gravityHorizontal, GravityVertical gravityVertical) {
        this.mGravityHorizontal = GravityHorizontal.CENTER;
        GravityVertical gravityVertical2 = GravityVertical.CENTER;
        this.mWidth = i;
        this.mHeight = i2;
        this.mGravityHorizontal = gravityHorizontal;
        this.mGravityVertical = gravityVertical;
    }

    public CropTransformation(int i, int i2) {
        this(i, i2, GravityHorizontal.CENTER, GravityVertical.CENTER);
    }

    public CropTransformation(float f, float f2, GravityHorizontal gravityHorizontal, GravityVertical gravityVertical) {
        this.mGravityHorizontal = GravityHorizontal.CENTER;
        GravityVertical gravityVertical2 = GravityVertical.CENTER;
        this.mWidthRatio = f;
        this.mHeightRatio = f2;
        this.mGravityHorizontal = gravityHorizontal;
        this.mGravityVertical = gravityVertical;
    }

    public CropTransformation(float f, float f2) {
        this(f, f2, GravityHorizontal.CENTER, GravityVertical.CENTER);
    }

    public CropTransformation(int i, int i2, float f, GravityHorizontal gravityHorizontal, GravityVertical gravityVertical) {
        this.mGravityHorizontal = GravityHorizontal.CENTER;
        GravityVertical gravityVertical2 = GravityVertical.CENTER;
        this.mWidth = i;
        this.mHeight = i2;
        this.mAspectRatio = f;
        this.mGravityHorizontal = gravityHorizontal;
        this.mGravityVertical = gravityVertical;
    }

    public CropTransformation(float f, float f2, float f3, GravityHorizontal gravityHorizontal, GravityVertical gravityVertical) {
        this.mGravityHorizontal = GravityHorizontal.CENTER;
        GravityVertical gravityVertical2 = GravityVertical.CENTER;
        this.mWidthRatio = f;
        this.mHeightRatio = f2;
        this.mAspectRatio = f3;
        this.mGravityHorizontal = gravityHorizontal;
        this.mGravityVertical = gravityVertical;
    }

    public CropTransformation(float f, GravityHorizontal gravityHorizontal, GravityVertical gravityVertical) {
        this.mGravityHorizontal = GravityHorizontal.CENTER;
        GravityVertical gravityVertical2 = GravityVertical.CENTER;
        this.mAspectRatio = f;
        this.mGravityHorizontal = gravityHorizontal;
        this.mGravityVertical = gravityVertical;
    }

    @Override // com.squareup.picasso.Transformation
    public Bitmap transform(Bitmap bitmap) {
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "transform(): called, " + key());
        }
        if (this.mWidth == 0 && this.mWidthRatio != 0.0f) {
            this.mWidth = (int) (bitmap.getWidth() * this.mWidthRatio);
        }
        if (this.mHeight == 0 && this.mHeightRatio != 0.0f) {
            this.mHeight = (int) (bitmap.getHeight() * this.mHeightRatio);
        }
        if (this.mAspectRatio != 0.0f) {
            if (this.mWidth == 0 && this.mHeight == 0) {
                float width = bitmap.getWidth() / bitmap.getHeight();
                if (Log.isLoggable(TAG, 2)) {
                    Log.v(TAG, "transform(): mAspectRatio: " + this.mAspectRatio + ", sourceRatio: " + width);
                }
                if (width > this.mAspectRatio) {
                    this.mHeight = bitmap.getHeight();
                } else {
                    this.mWidth = bitmap.getWidth();
                }
            }
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "transform(): before setting other of h/w: mAspectRatio: " + this.mAspectRatio + ", set one of width: " + this.mWidth + ", height: " + this.mHeight);
            }
            int i = this.mWidth;
            if (i != 0) {
                this.mHeight = (int) (i / this.mAspectRatio);
            } else {
                int i2 = this.mHeight;
                if (i2 != 0) {
                    this.mWidth = (int) (i2 * this.mAspectRatio);
                }
            }
            if (Log.isLoggable(TAG, 2)) {
                Log.v(TAG, "transform(): mAspectRatio: " + this.mAspectRatio + ", set width: " + this.mWidth + ", height: " + this.mHeight);
            }
        }
        if (this.mWidth == 0) {
            this.mWidth = bitmap.getWidth();
        }
        if (this.mHeight == 0) {
            this.mHeight = bitmap.getHeight();
        }
        if (this.mGravityHorizontal != null) {
            this.mLeft = getLeft(bitmap);
        }
        if (this.mGravityVertical != null) {
            this.mTop = getTop(bitmap);
        }
        int i3 = this.mLeft;
        int i4 = this.mTop;
        Rect rect = new Rect(i3, i4, this.mWidth + i3, this.mHeight + i4);
        Rect rect2 = new Rect(0, 0, this.mWidth, this.mHeight);
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "transform(): created sourceRect with mLeft: " + this.mLeft + ", mTop: " + this.mTop + ", right: " + (this.mLeft + this.mWidth) + ", bottom: " + (this.mTop + this.mHeight));
        }
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "transform(): created targetRect with width: " + this.mWidth + ", height: " + this.mHeight);
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "transform(): copying from source with width: " + bitmap.getWidth() + ", height: " + bitmap.getHeight());
        }
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
        bitmap.recycle();
        if (Log.isLoggable(TAG, 2)) {
            Log.v(TAG, "transform(): returning bitmap with width: " + createBitmap.getWidth() + ", height: " + createBitmap.getHeight());
        }
        return createBitmap;
    }

    @Override // com.squareup.picasso.Transformation
    public String key() {
        return "CropTransformation(width=" + this.mWidth + ", height=" + this.mHeight + ", mWidthRatio=" + this.mWidthRatio + ", mHeightRatio=" + this.mHeightRatio + ", mAspectRatio=" + this.mAspectRatio + ", gravityHorizontal=" + this.mGravityHorizontal + ", mGravityVertical=" + this.mGravityVertical + ")";
    }

    private int getTop(Bitmap bitmap) {
        int i = AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$CropTransformation$GravityVertical[this.mGravityVertical.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return bitmap.getHeight() - this.mHeight;
        }
        return (bitmap.getHeight() - this.mHeight) / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jp.wasabeef.picasso.transformations.CropTransformation$1  reason: invalid class name */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$jp$wasabeef$picasso$transformations$CropTransformation$GravityHorizontal;
        static final /* synthetic */ int[] $SwitchMap$jp$wasabeef$picasso$transformations$CropTransformation$GravityVertical;

        static {
            int[] iArr = new int[GravityHorizontal.values().length];
            $SwitchMap$jp$wasabeef$picasso$transformations$CropTransformation$GravityHorizontal = iArr;
            try {
                iArr[GravityHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$jp$wasabeef$picasso$transformations$CropTransformation$GravityHorizontal[GravityHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$jp$wasabeef$picasso$transformations$CropTransformation$GravityHorizontal[GravityHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[GravityVertical.values().length];
            $SwitchMap$jp$wasabeef$picasso$transformations$CropTransformation$GravityVertical = iArr2;
            try {
                iArr2[GravityVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$jp$wasabeef$picasso$transformations$CropTransformation$GravityVertical[GravityVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$jp$wasabeef$picasso$transformations$CropTransformation$GravityVertical[GravityVertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private int getLeft(Bitmap bitmap) {
        int i = AnonymousClass1.$SwitchMap$jp$wasabeef$picasso$transformations$CropTransformation$GravityHorizontal[this.mGravityHorizontal.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return 0;
            }
            return bitmap.getWidth() - this.mWidth;
        }
        return (bitmap.getWidth() - this.mWidth) / 2;
    }
}
