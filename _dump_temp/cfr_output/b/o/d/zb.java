/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.xc;

public final class zb
extends xc {
    private final int[] \u00d600000;

    public zb(int n2) {
        super(n2);
        this.\u00d600000 = new int[n2];
    }

    protected final int o00000(int[] nArray) {
        return nArray.length;
    }

    public final void \u00d200000(int n2) {
        int n3 = this.\u00d300000();
        this.o00000(n3 + 1);
        this.\u00d600000[n3] = n2;
    }

    public final int[] \u00d600000() {
        zb zb2 = this;
        return (int[])zb2.o00000(zb2.\u00d600000, new int[this.\u00d200000()]);
    }
}

