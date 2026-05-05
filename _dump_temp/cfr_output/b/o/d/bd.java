/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.xc;

public final class bd
extends xc {
    private final byte[] \u00f600000;

    public bd(int n2) {
        super(n2);
        this.\u00f600000 = new byte[n2];
    }

    protected final int o00000(byte[] byArray) {
        return byArray.length;
    }

    public final void o00000(byte by) {
        int n2 = this.\u00d300000();
        this.o00000(n2 + 1);
        this.\u00f600000[n2] = by;
    }

    public final byte[] \u00f600000() {
        bd bd2 = this;
        return (byte[])bd2.o00000(bd2.\u00f600000, new byte[this.\u00d200000()]);
    }
}

