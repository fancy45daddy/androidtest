package me.xdrop.diffutils.structs;
/* loaded from: classes10.dex */
public final class EditOp {
    public int dpos;
    public int spos;
    public EditType type;

    public String toString() {
        return this.type.name() + "(" + this.spos + "," + this.dpos + ")";
    }
}
