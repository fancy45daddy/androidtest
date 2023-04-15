package brut.util;

import java.io.DataInput;
import java.io.IOException;
/* loaded from: classes2.dex */
public abstract class DataInputDelegate implements DataInput {
    protected final DataInput mDelegate;

    public DataInputDelegate(DataInput dataInput) {
        this.mDelegate = dataInput;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        return this.mDelegate.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        return this.mDelegate.readByte();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        return this.mDelegate.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return this.mDelegate.readDouble();
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return this.mDelegate.readFloat();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        this.mDelegate.readFully(bArr);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.mDelegate.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        return this.mDelegate.readInt();
    }

    @Override // java.io.DataInput
    public String readLine() throws IOException {
        return this.mDelegate.readLine();
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        return this.mDelegate.readLong();
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        return this.mDelegate.readShort();
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        return this.mDelegate.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        return this.mDelegate.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        return this.mDelegate.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public int skipBytes(int i) throws IOException {
        return this.mDelegate.skipBytes(i);
    }
}
