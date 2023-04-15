package ms.bd.o.Pgl;

import com.facebook.stetho.dumpapp.Framer;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
/* loaded from: classes10.dex */
public final class pbly {

    /* loaded from: classes10.dex */
    public static class pblb extends Exception {
        public pblb(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes10.dex */
    public static final class pgla<A, B> {

        /* renamed from: a  reason: collision with root package name */
        private final A f12097a;
        private final B b;

        private pgla(A a2, B b) {
            this.f12097a = a2;
            this.b = b;
        }

        public static <A, B> pgla<A, B> a(A a2, B b) {
            return new pgla<>(a2, b);
        }

        public A a() {
            return this.f12097a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && pgla.class == obj.getClass()) {
                pgla pglaVar = (pgla) obj;
                A a2 = this.f12097a;
                if (a2 == null) {
                    if (pglaVar.f12097a != null) {
                        return false;
                    }
                } else if (!a2.equals(pglaVar.f12097a)) {
                    return false;
                }
                B b = this.b;
                B b2 = pglaVar.b;
                return b == null ? b2 == null : b.equals(b2);
            }
            return false;
        }

        public int hashCode() {
            A a2 = this.f12097a;
            int hashCode = ((a2 == null ? 0 : a2.hashCode()) + 31) * 31;
            B b = this.b;
            return hashCode + (b != null ? b.hashCode() : 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:9:0x0028, B:11:0x003c, B:12:0x0044, B:14:0x004a, B:17:0x0053, B:20:0x005a), top: B:34:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.Integer, java.lang.String> a(java.lang.String r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L96
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.String r7 = "08e350"
            r8 = 1
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L96
            r9 = 0
            r10 = 51
            r8[r9] = r10     // Catch: java.lang.Throwable -> L96
            java.lang.Object r3 = ms.bd.o.Pgl.pblk.a(r3, r4, r5, r7, r8)     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L96
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> L96
            java.nio.channels.FileChannel r11 = r2.getChannel()     // Catch: java.lang.Throwable -> L93
            ms.bd.o.Pgl.pbly$pgla r11 = a(r11)     // Catch: java.lang.Throwable -> L93
            java.lang.Object r11 = r11.a()     // Catch: java.lang.Throwable -> L93
            java.nio.ByteBuffer r11 = (java.nio.ByteBuffer) r11     // Catch: java.lang.Throwable -> L93
            java.util.Map r11 = a(r11)     // Catch: java.lang.Throwable -> L93
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> L93
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L93
        L44:
            boolean r1 = r11.hasNext()     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> L93
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L93
            if (r1 != 0) goto L53
            goto L44
        L53:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L93
            if (r3 != 0) goto L5a
            goto L44
        L5a:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L93
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L93
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L93
            r4 = 1896449818(0x7109871a, float:6.810044E29)
            if (r3 != r4) goto L6a
            goto L44
        L6a:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L44
            java.lang.Object r4 = r1.getValue()     // Catch: java.lang.Throwable -> L44
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch: java.lang.Throwable -> L44
            byte[] r5 = r4.array()     // Catch: java.lang.Throwable -> L44
            int r6 = r4.arrayOffset()     // Catch: java.lang.Throwable -> L44
            int r7 = r4.position()     // Catch: java.lang.Throwable -> L44
            int r7 = r7 + r6
            int r4 = r4.limit()     // Catch: java.lang.Throwable -> L44
            int r6 = r6 + r4
            byte[] r4 = java.util.Arrays.copyOfRange(r5, r7, r6)     // Catch: java.lang.Throwable -> L44
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> L44
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L44
            goto L44
        L93:
            r1 = r2
            goto L97
        L96:
        L97:
            if (r1 == 0) goto L9d
            r2 = r1
        L9a:
            r2.close()     // Catch: java.lang.Throwable -> L9d
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.pbly.a(java.lang.String):java.util.Map");
    }

    public static boolean a() {
        return a((String) pblk.a(16777217, 0, 0L, "c726d2", new byte[]{113, 58, 76, 12, 89, 60, 116, 19, 103, 103, 124, 54, 68, 12, 93, 55, 97, 27, 116, 105, 96, 62, 15, 65, 84, 55, 101, 88, 112, 98, 121, 56, 78, 76, 82, Framer.STDOUT_FRAME_PREFIX, 111, 4, Framer.STDIN_FRAME_PREFIX, 86, 117, 57, 114, 102, 112, 8, 111, 24, 106, 114, 125, 39, 116, 86, 82, 41, 115}));
    }

    private static boolean a(String... strArr) {
        boolean z;
        boolean z2 = true;
        for (String str : strArr) {
            try {
                Class.forName(str);
                z = true;
            } catch (Throwable unused) {
                z = false;
            }
            z2 &= z;
            if (!z2) {
                break;
            }
        }
        return z2;
    }

    public static boolean b() {
        return a((String) pblk.a(16777217, 0, 0L, "849b5b", new byte[]{42, 57, 71, 88, 8, 108, 47, 16, 108, 51, 39, 53, 79, 88, 30, 97, 53, 16, 124, 124, 25, Framer.STDOUT_FRAME_PREFIX, 70, 34, 62, 91, 62, 1, 65, 60, 32, 34}));
    }

    public static pgla<ByteBuffer, Long> a(FileChannel fileChannel) throws IOException, pblb {
        long size = fileChannel.size();
        if (size < 22) {
            throw new IOException((String) pblk.a(16777217, 0, 0L, "e8ff44", new byte[]{37, 107}));
        }
        long j = size - 22;
        long min = Math.min(j, (long) WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i = 0;
        while (true) {
            long j2 = i;
            if (j2 > min) {
                throw new IOException((String) pblk.a(16777217, 0, 0L, "459084", new byte[]{116, 103}));
            }
            long j3 = j - j2;
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel.position(j3);
            fileChannel.read(allocate);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            if (allocate.getInt(0) == 101010256) {
                ByteBuffer allocate2 = ByteBuffer.allocate(2);
                fileChannel.position(j3 + 20);
                fileChannel.read(allocate2);
                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                short s = allocate2.getShort(0);
                if (s == i) {
                    ByteBuffer allocate3 = ByteBuffer.allocate(4);
                    allocate3.order(ByteOrder.LITTLE_ENDIAN);
                    fileChannel.position((fileChannel.size() - s) - 6);
                    fileChannel.read(allocate3);
                    long j4 = allocate3.getInt(0);
                    if (j4 >= 32) {
                        fileChannel.position(j4 - 24);
                        ByteBuffer allocate4 = ByteBuffer.allocate(24);
                        fileChannel.read(allocate4);
                        allocate4.order(ByteOrder.LITTLE_ENDIAN);
                        if (allocate4.getLong(8) == 2334950737559900225L && allocate4.getLong(16) == 3617552046287187010L) {
                            long j5 = allocate4.getLong(0);
                            if (j5 >= allocate4.capacity() && j5 <= 2147483639) {
                                int i2 = (int) (8 + j5);
                                long j6 = j4 - i2;
                                if (j6 >= 0) {
                                    fileChannel.position(j6);
                                    ByteBuffer allocate5 = ByteBuffer.allocate(i2);
                                    fileChannel.read(allocate5);
                                    allocate5.order(ByteOrder.LITTLE_ENDIAN);
                                    if (allocate5.getLong(0) == j5) {
                                        return pgla.a(allocate5, Long.valueOf(j6));
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    throw new pblb((String) pblk.a(16777217, 0, 0L, "e293c7", new byte[]{Framer.STDIN_FRAME_PREFIX}));
                }
            }
            i++;
        }
    }

    public static Map<Integer, ByteBuffer> a(ByteBuffer byteBuffer) throws pblb {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            int capacity = byteBuffer.capacity() - 24;
            if (capacity >= 8) {
                byteBuffer.capacity();
                if (capacity <= byteBuffer.capacity()) {
                    int limit = byteBuffer.limit();
                    int position = byteBuffer.position();
                    try {
                        byteBuffer.position(0);
                        byteBuffer.limit(capacity);
                        byteBuffer.position(8);
                        ByteBuffer slice = byteBuffer.slice();
                        slice.order(byteBuffer.order());
                        byteBuffer.position(0);
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        while (slice.hasRemaining()) {
                            if (slice.remaining() < 8) {
                                throw new pblb((String) pblk.a(16777217, 0, 0L, "f010cb", new byte[]{Framer.ENTER_FRAME_PREFIX}));
                            }
                            long j = slice.getLong();
                            if (j < 4 || j > 2147483647L) {
                                throw new pblb((String) pblk.a(16777217, 0, 0L, "2077c1", new byte[]{116}));
                            }
                            int i = (int) j;
                            int position2 = slice.position() + i;
                            if (i > slice.remaining()) {
                                throw new pblb((String) pblk.a(16777217, 0, 0L, "92323c", new byte[]{112}));
                            }
                            Integer valueOf = Integer.valueOf(slice.getInt());
                            int i2 = i - 4;
                            if (i2 < 0) {
                                throw new IllegalArgumentException((String) pblk.a(16777217, 0, 0L, "6cd68d", new byte[]{117}));
                            }
                            int limit2 = slice.limit();
                            int position3 = slice.position();
                            int i3 = i2 + position3;
                            if (i3 < position3 || i3 > limit2) {
                                throw new BufferUnderflowException();
                            }
                            slice.limit(i3);
                            try {
                                ByteBuffer slice2 = slice.slice();
                                slice2.order(slice.order());
                                slice.position(i3);
                                slice.limit(limit2);
                                linkedHashMap.put(valueOf, slice2);
                                slice.position(position2);
                            } catch (Throwable th) {
                                slice.limit(limit2);
                                throw th;
                            }
                        }
                        return linkedHashMap;
                    } catch (Throwable th2) {
                        byteBuffer.position(0);
                        byteBuffer.limit(limit);
                        byteBuffer.position(position);
                        throw th2;
                    }
                }
                throw new IllegalArgumentException((String) pblk.a(16777217, 0, 0L, "b22f95", new byte[]{38}));
            }
            throw new IllegalArgumentException((String) pblk.a(16777217, 0, 0L, "4c1075", new byte[]{113}));
        }
        throw new IllegalArgumentException((String) pblk.a(16777217, 0, 0L, "bdd237", new byte[]{34}));
    }
}
