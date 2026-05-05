/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.xc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class nc
extends xc {
    private final short[] int;

    public nc(int n2) {
        super(n2);
        this.int = new short[n2];
    }

    protected final int o00000(short[] sArray) {
        return sArray.length;
    }

    public final void o00000(short s2) {
        int n2 = this.\u00d300000();
        this.o00000(n2 + 1);
        this.int[n2] = s2;
    }

    public final short[] \u00f500000() {
        nc nc2 = this;
        return (short[])nc2.o00000(nc2.int, new short[this.\u00d200000()]);
    }
}

