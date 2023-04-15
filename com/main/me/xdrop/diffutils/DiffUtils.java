package me.xdrop.diffutils;

import me.xdrop.diffutils.structs.EditOp;
import me.xdrop.diffutils.structs.EditType;
import me.xdrop.diffutils.structs.MatchingBlock;
import me.xdrop.diffutils.structs.OpCode;
/* loaded from: classes10.dex */
public class DiffUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static EditOp[] getEditOps(String str, String str2) {
        return getEditOps(str.length(), str, str2.length(), str2);
    }

    private static EditOp[] getEditOps(int i, String str, int i2, String str2) {
        char[] charArray = str.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = i;
        int i7 = i2;
        while (i6 > 0 && i7 > 0 && charArray[i3] == charArray2[i4]) {
            i6--;
            i7--;
            i3++;
            i4++;
            i5++;
        }
        while (i6 > 0 && i7 > 0 && charArray[(i3 + i6) - 1] == charArray2[(i4 + i7) - 1]) {
            i6--;
            i7--;
        }
        int i8 = i6 + 1;
        int i9 = i7 + 1;
        int[] iArr = new int[i9 * i8];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr[i10] = i10;
        }
        for (int i11 = 1; i11 < i8; i11++) {
            iArr[i9 * i11] = i11;
        }
        for (int i12 = 1; i12 < i8; i12++) {
            int i13 = (i12 - 1) * i9;
            int i14 = i12 * i9;
            int i15 = (i14 + i9) - 1;
            char c = charArray[(i3 + i12) - 1];
            int i16 = i14 + 1;
            int i17 = i12;
            int i18 = i4;
            while (i16 <= i15) {
                int i19 = i13 + 1;
                int i20 = i18 + 1;
                int i21 = iArr[i13] + (c != charArray2[i18] ? 1 : 0);
                int i22 = i17 + 1;
                if (i22 <= i21) {
                    i21 = i22;
                }
                int i23 = iArr[i19] + 1;
                i17 = i21 > i23 ? i23 : i21;
                iArr[i16] = i17;
                i16++;
                i13 = i19;
                i18 = i20;
            }
        }
        return editOpsFromCostMatrix(i8, charArray, i3, i5, i9, charArray2, i4, i5, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r4 == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        r9 = r0 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r19[r0] != (r19[r9] + 1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        r0 = new me.xdrop.diffutils.structs.EditOp();
        r2 = r2 - 1;
        r3[r2] = r0;
        r0.type = me.xdrop.diffutils.structs.EditType.DELETE;
        r4 = r4 - 1;
        r0.spos = r4 + r14;
        r0.dpos = r5 + r18;
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d6, code lost:
        if (r4 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r9 = r0 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00df, code lost:
        if (r19[r0] != (r19[r9] + 1)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
        r2 = r2 - 1;
        r0 = new me.xdrop.diffutils.structs.EditOp();
        r3[r2] = r0;
        r0.type = me.xdrop.diffutils.structs.EditType.DELETE;
        r4 = r4 - 1;
        r0.spos = r4 + r14;
        r0.dpos = r5 + r18;
        r0 = r9;
        r7 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static me.xdrop.diffutils.structs.EditOp[] editOpsFromCostMatrix(int r11, char[] r12, int r13, int r14, int r15, char[] r16, int r17, int r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.xdrop.diffutils.DiffUtils.editOpsFromCostMatrix(int, char[], int, int, int, char[], int, int, int[]):me.xdrop.diffutils.structs.EditOp[]");
    }

    public static MatchingBlock[] getMatchingBlocks(String str, String str2) {
        return getMatchingBlocks(str.length(), str2.length(), getEditOps(str, str2));
    }

    public static MatchingBlock[] getMatchingBlocks(int i, int i2, OpCode[] opCodeArr) {
        int length = opCodeArr.length;
        int i3 = length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            if (opCodeArr[i4].type == EditType.KEEP) {
                i5++;
                while (i6 != 0 && opCodeArr[i4].type == EditType.KEEP) {
                    i6--;
                    i4++;
                }
                if (i6 == 0) {
                    break;
                }
            }
            i3 = i6;
            i4++;
        }
        MatchingBlock[] matchingBlockArr = new MatchingBlock[i5 + 1];
        matchingBlockArr[0] = new MatchingBlock();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (length == 0) {
                break;
            }
            if (opCodeArr[i7].type == EditType.KEEP) {
                matchingBlockArr[i8].spos = opCodeArr[i7].sbeg;
                matchingBlockArr[i8].dpos = opCodeArr[i7].dbeg;
                while (length != 0 && opCodeArr[i7].type == EditType.KEEP) {
                    length--;
                    i7++;
                }
                if (length == 0) {
                    MatchingBlock matchingBlock = matchingBlockArr[i8];
                    matchingBlock.length = i - matchingBlock.spos;
                    i8++;
                    break;
                }
                matchingBlockArr[i8].length = opCodeArr[i7].sbeg - matchingBlockArr[i8].spos;
                i8++;
                matchingBlockArr[i8] = new MatchingBlock();
            }
            length--;
            i7++;
        }
        MatchingBlock matchingBlock2 = new MatchingBlock();
        matchingBlock2.spos = i;
        matchingBlock2.dpos = i2;
        matchingBlock2.length = 0;
        matchingBlockArr[i8] = matchingBlock2;
        return matchingBlockArr;
    }

    private static MatchingBlock[] getMatchingBlocks(int i, int i2, EditOp[] editOpArr) {
        int length = editOpArr.length;
        int i3 = length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 != 0) {
            while (editOpArr[i6].type == EditType.KEEP && i3 - 1 != 0) {
                i6++;
            }
            if (i3 == 0) {
                break;
            }
            if (i5 < editOpArr[i6].spos || i4 < editOpArr[i6].dpos) {
                i7++;
                i5 = editOpArr[i6].spos;
                i4 = editOpArr[i6].dpos;
            }
            EditType editType = editOpArr[i6].type;
            int i8 = AnonymousClass1.$SwitchMap$me$xdrop$diffutils$structs$EditType[editType.ordinal()];
            if (i8 == 1) {
                do {
                    i5++;
                    i4++;
                    i3--;
                    i6++;
                    if (i3 != 0 && editOpArr[i6].type == editType && i5 == editOpArr[i6].spos) {
                    }
                } while (i4 == editOpArr[i6].dpos);
            } else if (i8 == 2) {
                do {
                    i5++;
                    i3--;
                    i6++;
                    if (i3 != 0 && editOpArr[i6].type == editType && i5 == editOpArr[i6].spos) {
                    }
                } while (i4 == editOpArr[i6].dpos);
            } else if (i8 == 3) {
                do {
                    i4++;
                    i3--;
                    i6++;
                    if (i3 != 0 && editOpArr[i6].type == editType && i5 == editOpArr[i6].spos) {
                    }
                } while (i4 == editOpArr[i6].dpos);
            }
        }
        if (i5 < i || i4 < i2) {
            i7++;
        }
        MatchingBlock[] matchingBlockArr = new MatchingBlock[i7 + 1];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (length != 0) {
            while (editOpArr[i11].type == EditType.KEEP && length - 1 != 0) {
                i11++;
            }
            if (length == 0) {
                break;
            }
            if (i10 < editOpArr[i11].spos || i9 < editOpArr[i11].dpos) {
                MatchingBlock matchingBlock = new MatchingBlock();
                matchingBlock.spos = i10;
                matchingBlock.dpos = i9;
                matchingBlock.length = editOpArr[i11].spos - i10;
                i10 = editOpArr[i11].spos;
                i9 = editOpArr[i11].dpos;
                matchingBlockArr[i12] = matchingBlock;
                i12++;
            }
            EditType editType2 = editOpArr[i11].type;
            int i13 = AnonymousClass1.$SwitchMap$me$xdrop$diffutils$structs$EditType[editType2.ordinal()];
            if (i13 == 1) {
                do {
                    i10++;
                    i9++;
                    length--;
                    i11++;
                    if (length != 0 && editOpArr[i11].type == editType2 && i10 == editOpArr[i11].spos) {
                    }
                } while (i9 == editOpArr[i11].dpos);
            } else if (i13 == 2) {
                do {
                    i10++;
                    length--;
                    i11++;
                    if (length != 0 && editOpArr[i11].type == editType2 && i10 == editOpArr[i11].spos) {
                    }
                } while (i9 == editOpArr[i11].dpos);
            } else if (i13 == 3) {
                do {
                    i9++;
                    length--;
                    i11++;
                    if (length != 0 && editOpArr[i11].type == editType2 && i10 == editOpArr[i11].spos) {
                    }
                } while (i9 == editOpArr[i11].dpos);
            }
        }
        if (i10 < i || i9 < i2) {
            MatchingBlock matchingBlock2 = new MatchingBlock();
            matchingBlock2.spos = i10;
            matchingBlock2.dpos = i9;
            matchingBlock2.length = i - i10;
            matchingBlockArr[i12] = matchingBlock2;
            i12++;
        }
        MatchingBlock matchingBlock3 = new MatchingBlock();
        matchingBlock3.spos = i;
        matchingBlock3.dpos = i2;
        matchingBlock3.length = 0;
        matchingBlockArr[i12] = matchingBlock3;
        return matchingBlockArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me.xdrop.diffutils.DiffUtils$1  reason: invalid class name */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$me$xdrop$diffutils$structs$EditType;

        static {
            int[] iArr = new int[EditType.values().length];
            $SwitchMap$me$xdrop$diffutils$structs$EditType = iArr;
            try {
                iArr[EditType.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$me$xdrop$diffutils$structs$EditType[EditType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$me$xdrop$diffutils$structs$EditType[EditType.INSERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static OpCode[] editOpsToOpCodes(EditOp[] editOpArr, int i, int i2) {
        int length = editOpArr.length;
        int i3 = 0;
        int i4 = length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 != 0) {
            while (editOpArr[i7].type == EditType.KEEP && i4 - 1 != 0) {
                i7++;
            }
            if (i4 == 0) {
                break;
            }
            if (i6 < editOpArr[i7].spos || i5 < editOpArr[i7].dpos) {
                i8++;
                i6 = editOpArr[i7].spos;
                i5 = editOpArr[i7].dpos;
            }
            i8++;
            EditType editType = editOpArr[i7].type;
            int i9 = AnonymousClass1.$SwitchMap$me$xdrop$diffutils$structs$EditType[editType.ordinal()];
            if (i9 == 1) {
                do {
                    i6++;
                    i5++;
                    i4--;
                    i7++;
                    if (i4 != 0 && editOpArr[i7].type == editType && i6 == editOpArr[i7].spos) {
                    }
                } while (i5 == editOpArr[i7].dpos);
            } else if (i9 == 2) {
                do {
                    i6++;
                    i4--;
                    i7++;
                    if (i4 != 0 && editOpArr[i7].type == editType && i6 == editOpArr[i7].spos) {
                    }
                } while (i5 == editOpArr[i7].dpos);
            } else if (i9 == 3) {
                do {
                    i5++;
                    i4--;
                    i7++;
                    if (i4 != 0 && editOpArr[i7].type == editType && i6 == editOpArr[i7].spos) {
                    }
                } while (i5 == editOpArr[i7].dpos);
            }
        }
        if (i6 < i || i5 < i2) {
            i8++;
        }
        OpCode[] opCodeArr = new OpCode[i8];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (length != 0) {
            while (editOpArr[i11].type == EditType.KEEP && length - 1 != 0) {
                i11++;
            }
            if (length == 0) {
                break;
            }
            OpCode opCode = new OpCode();
            opCodeArr[i12] = opCode;
            opCode.sbeg = i10;
            opCode.dbeg = i3;
            if (i10 < editOpArr[i11].spos || i3 < editOpArr[i11].dpos) {
                opCode.type = EditType.KEEP;
                i10 = editOpArr[i11].spos;
                opCode.send = i10;
                i3 = editOpArr[i11].dpos;
                opCode.dend = i3;
                i12++;
                OpCode opCode2 = new OpCode();
                opCodeArr[i12] = opCode2;
                opCode2.sbeg = i10;
                opCode2.dbeg = i3;
            }
            EditType editType2 = editOpArr[i11].type;
            int i13 = AnonymousClass1.$SwitchMap$me$xdrop$diffutils$structs$EditType[editType2.ordinal()];
            if (i13 == 1) {
                do {
                    i10++;
                    i3++;
                    length--;
                    i11++;
                    if (length != 0 && editOpArr[i11].type == editType2 && i10 == editOpArr[i11].spos) {
                    }
                } while (i3 == editOpArr[i11].dpos);
            } else if (i13 == 2) {
                do {
                    i10++;
                    length--;
                    i11++;
                    if (length != 0 && editOpArr[i11].type == editType2 && i10 == editOpArr[i11].spos) {
                    }
                } while (i3 == editOpArr[i11].dpos);
            } else if (i13 == 3) {
                do {
                    i3++;
                    length--;
                    i11++;
                    if (length != 0 && editOpArr[i11].type == editType2 && i10 == editOpArr[i11].spos) {
                    }
                } while (i3 == editOpArr[i11].dpos);
            }
            opCodeArr[i12].type = editType2;
            opCodeArr[i12].send = i10;
            opCodeArr[i12].dend = i3;
            i12++;
        }
        if (i10 < i || i3 < i2) {
            if (opCodeArr[i12] == null) {
                opCodeArr[i12] = new OpCode();
            }
            opCodeArr[i12].type = EditType.KEEP;
            opCodeArr[i12].sbeg = i10;
            opCodeArr[i12].dbeg = i3;
            opCodeArr[i12].send = i;
            opCodeArr[i12].dend = i2;
        }
        return opCodeArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int levEditDistance(java.lang.String r21, java.lang.String r22, int r23) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.xdrop.diffutils.DiffUtils.levEditDistance(java.lang.String, java.lang.String, int):int");
    }

    private static int memchr(char[] cArr, int i, char c, int i2) {
        if (i2 != 0) {
            int i3 = 0;
            while (cArr[i + i3] != c) {
                i3++;
                i2--;
                if (i2 == 0) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public static double getRatio(String str, String str2) {
        int length = str.length() + str2.length();
        return (length - levEditDistance(str, str2, 1)) / length;
    }
}
