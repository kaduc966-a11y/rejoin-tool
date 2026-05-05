/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.xc;

public final class ic
extends xc {
    private final long[] \u00d800000;

    public ic(int n2) {
        super(n2);
        this.\u00d800000 = new long[n2];
    }

    protected final int o00000(long[] lArray) {
        return lArray.length;
    }

    public final void o00000(long l2) {
        int n2 = this.\u00d300000();
        this.o00000(n2 + 1);
        this.\u00d800000[n2] = l2;
    }

    public final long[] \u00d800000() {
        ic ic2 = this;
        return (long[])ic2.o00000(ic2.\u00d800000, new long[this.\u00d200000()]);
    }
}

