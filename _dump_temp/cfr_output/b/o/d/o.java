/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.xc;

public final class o
extends xc {
    private final boolean[] \u00f800000;

    public o(int n2) {
        super(n2);
        this.\u00f800000 = new boolean[n2];
    }

    protected final int o00000(boolean[] blArray) {
        return blArray.length;
    }

    public final void o00000(boolean bl) {
        int n2 = this.\u00d300000();
        this.o00000(n2 + 1);
        this.\u00f800000[n2] = bl;
    }

    public final boolean[] \u00f800000() {
        o o2 = this;
        return (boolean[])o2.o00000(o2.\u00f800000, new boolean[this.\u00d200000()]);
    }
}

