package ms.bd.o.Pgl;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.stetho.dumpapp.Framer;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
/* loaded from: classes10.dex */
public final class m0 implements SensorEventListener {
    private static volatile m0 f;

    /* renamed from: a  reason: collision with root package name */
    private SensorManager f12084a;
    private int b;
    private int c = 0;
    private float[] d = new float[3];
    private List<JSONArray> e = new ArrayList();

    static {
        new DecimalFormat((String) pblk.a(16777217, 0, 0L, "b46093", new byte[]{35, Framer.EXIT_FRAME_PREFIX, 21}));
        f = null;
    }

    private m0(Context context) {
        this.f12084a = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.f12084a = (SensorManager) applicationContext.getSystemService((String) pblk.a(16777217, 0, 0L, "e325e0", new byte[]{103, 52, 79, 82, 85, 53}));
        }
    }

    public static m0 a(Context context) {
        if (f == null) {
            synchronized (m0.class) {
                if (f == null) {
                    f = new m0(context);
                }
            }
        }
        return f;
    }

    private synchronized void c() {
        try {
            SensorManager sensorManager = this.f12084a;
            if (sensorManager != null) {
                int i = this.b - 1;
                this.b = i;
                if (i == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
            String str = (String) pblk.a(16777217, 0, 0L, "2fe8b7", new byte[]{48, 119, 21, 115, 72});
        }
    }

    public synchronized void a() {
        char c;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        try {
            c = pblz.a() != null ? (char) 1 : (char) 0;
        } catch (Throwable unused) {
            c = 65535;
        }
        if (c != 1) {
            jSONArray2 = null;
        } else {
            synchronized (this) {
                try {
                    SensorManager sensorManager = this.f12084a;
                    if (sensorManager != null && (this.b != 0 || this.f12084a.registerListener(this, sensorManager.getDefaultSensor(1), 3))) {
                        this.b++;
                    }
                } catch (Exception unused2) {
                }
                try {
                    synchronized (this) {
                        int i = 0;
                        while (this.c == 0 && i < 10) {
                            i++;
                            wait(1000L);
                        }
                    }
                } catch (Exception unused3) {
                    String str = (String) pblk.a(16777217, 0, 0L, "7ad6ed", new byte[]{53, 112, 20, 125, 93});
                    jSONArray = new JSONArray();
                    jSONArray.put(new BigDecimal(this.d[0]).setScale(2, 4));
                    jSONArray.put(new BigDecimal(this.d[1]).setScale(2, 4));
                    jSONArray.put(new BigDecimal(this.d[2]).setScale(2, 4));
                    c();
                }
            }
            jSONArray = new JSONArray();
            jSONArray.put(new BigDecimal(this.d[0]).setScale(2, 4));
            jSONArray.put(new BigDecimal(this.d[1]).setScale(2, 4));
            jSONArray.put(new BigDecimal(this.d[2]).setScale(2, 4));
            c();
            this.c = 0;
            jSONArray2 = jSONArray;
        }
        if (jSONArray2 == null) {
            return;
        }
        this.e.add(jSONArray2);
        try {
            int size = this.e.size();
            if (size > 100) {
                ArrayList arrayList = new ArrayList(this.e.subList(size - 50, size));
                this.e.clear();
                this.e = arrayList;
            }
        } catch (Throwable unused4) {
        }
    }

    public synchronized String b() {
        StringBuilder sb = new StringBuilder();
        int size = this.e.size();
        if (size <= 0) {
            return null;
        }
        try {
            List<JSONArray> list = this.e;
            int i = size - 50;
            if (i <= 0) {
                i = 0;
            }
            List<JSONArray> subList = list.subList(i, size);
            if (subList.size() > 0) {
                for (JSONArray jSONArray : subList) {
                    if (jSONArray != null) {
                        sb.append(jSONArray.get(0).toString());
                        sb.append((String) pblk.a(16777217, 0, 0L, "49c8ab", new byte[]{105}));
                        sb.append(jSONArray.get(1).toString());
                        sb.append((String) pblk.a(16777217, 0, 0L, "84121b", new byte[]{101}));
                        sb.append(jSONArray.get(2).toString());
                        sb.append((String) pblk.a(16777217, 0, 0L, "012d18", new byte[]{61}));
                    }
                }
            }
            if (sb.length() > 0) {
                sb.delete(sb.length() - 1, sb.length());
            }
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.d = sensorEvent.values;
        this.c = 1;
    }
}
