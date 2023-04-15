package brut.util;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
public class ExtDataInput extends DataInputDelegate {
    public ExtDataInput(DataInput dataInput) {
        super(dataInput);
    }

    public ExtDataInput(InputStream inputStream) {
        this((DataInput) new DataInputStream(inputStream));
    }

    public int[] readIntArray(int i) throws IOException {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = readInt();
        }
        return iArr;
    }

    public String readNulEndedString(int i, boolean z) throws IOException {
        int i2;
        short readShort;
        StringBuilder sb = new StringBuilder(16);
        while (true) {
            i2 = i - 1;
            if (i == 0 || (readShort = readShort()) == 0) {
                break;
            }
            sb.append((char) readShort);
            i = i2;
        }
        if (z) {
            skipBytes(i2 * 2);
        }
        return sb.toString();
    }

    public void skipCheckByte(byte b) throws IOException {
        byte readByte = readByte();
        if (readByte != b) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Byte.valueOf(b), Byte.valueOf(readByte)));
        }
    }

    public void skipCheckInt(int i) throws IOException {
        int readInt = readInt();
        if (readInt != i) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Integer.valueOf(i), Integer.valueOf(readInt)));
        }
    }

    public void skipCheckShort(short s) throws IOException {
        short readShort = readShort();
        if (readShort != s) {
            throw new IOException(String.format("Expected: 0x%08x, got: 0x%08x", Short.valueOf(s), Short.valueOf(readShort)));
        }
    }

    public void skipInt() throws IOException {
        skipBytes(4);
    }
}
