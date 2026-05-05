/*
 * Decompiled with CFR 0.152.
 */
package b.v;

import b.v.d;
import b.v.i$_b;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class i
implements Externalizable {
    public static final i$_b \u00d400000 = new i$_b(null);
    private long new;
    private long o00000;
    private static final long \u00d300000 = 0L;

    public i(long l2, long l3) {
        this.new = l2;
        this.o00000 = l3;
    }

    public final long o00000() {
        return this.new;
    }

    public final void new(long l2) {
        this.new = l2;
    }

    public final long \u00d300000() {
        return this.o00000;
    }

    public final void o00000(long l2) {
        this.o00000 = l2;
    }

    public i() {
        this(0L, 0L);
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.new);
        objectOutput.writeLong(this.o00000);
    }

    @Override
    public final void readExternal(ObjectInput objectInput) {
        this.new = objectInput.readLong();
        this.o00000 = objectInput.readLong();
    }

    private final Object new() {
        return d.\u00d600000.\u00d200000(this.new, this.o00000);
    }
}

