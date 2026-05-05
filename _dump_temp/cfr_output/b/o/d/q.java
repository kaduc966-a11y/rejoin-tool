/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.xc;

public final class q
extends xc {
    private final double[] \u00d400000;

    public q(int n2) {
        super(n2);
        this.\u00d400000 = new double[n2];
    }

    protected final int o00000(double[] dArray) {
        return dArray.length;
    }

    public final void o00000(double d2) {
        int n2 = this.\u00d300000();
        this.o00000(n2 + 1);
        this.\u00d400000[n2] = d2;
    }

    public final double[] String() {
        q q2 = this;
        return (double[])q2.o00000(q2.\u00d400000, new double[this.\u00d200000()]);
    }
}

