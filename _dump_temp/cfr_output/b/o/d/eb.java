/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.xc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class eb
extends xc {
    private final float[] class;

    public eb(int n2) {
        super(n2);
        this.class = new float[n2];
    }

    protected final int o00000(float[] fArray) {
        return fArray.length;
    }

    public final void o00000(float f2) {
        int n2 = this.\u00d300000();
        this.o00000(n2 + 1);
        this.class[n2] = f2;
    }

    public final float[] \u00d500000() {
        eb eb2 = this;
        return (float[])eb2.o00000(eb2.class, new float[this.\u00d200000()]);
    }
}

