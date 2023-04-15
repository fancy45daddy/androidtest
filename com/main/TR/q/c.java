package TR.q;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f610a = "HmacSHA1";

    public static String a(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), f610a);
        Mac mac = Mac.getInstance(f610a);
        mac.init(secretKeySpec);
        return a(mac.doFinal(str.getBytes()));
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = (b >>> 4) & 15;
            int i2 = 0;
            while (true) {
                sb.append((char) ((i < 0 || i > 9) ? (i - 10) + 97 : i + 48));
                i = b & 15;
                int i3 = i2 + 1;
                if (i2 >= 1) {
                    break;
                }
                i2 = i3;
            }
        }
        return sb.toString();
    }
}
