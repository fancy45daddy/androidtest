package dagger.android;

import android.app.Service;
/* loaded from: classes7.dex */
public abstract class DaggerService extends Service {
    @Override // android.app.Service
    public void onCreate() {
        AndroidInjection.inject(this);
        super.onCreate();
    }
}
