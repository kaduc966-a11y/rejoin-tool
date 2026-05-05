/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.r$_b;
import b.i.v;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

final class r
implements Externalizable {
    public static final r$_b \u00d400000 = new r$_b(null);
    private long \u00d200000;
    private int o00000;
    private static final long Object = 0L;

    public r(long l2, int n2) {
        this.\u00d200000 = l2;
        this.o00000 = n2;
    }

    public final long \u00d200000() {
        return this.\u00d200000;
    }

    public final void o00000(long l2) {
        this.\u00d200000 = l2;
    }

    public final int Object() {
        return this.o00000;
    }

    public final void o00000(int n2) {
        this.o00000 = n2;
    }

    public r() {
        this(0L, 0);
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.\u00d200000);
        objectOutput.writeInt(this.o00000);
    }

    @Override
    public final void readExternal(ObjectInput objectInput) {
        this.\u00d200000 = objectInput.readLong();
        this.o00000 = objectInput.readInt();
    }

    private final Object o00000() {
        return v.\u00d500000.super(this.\u00d200000, this.o00000);
    }
}

