/*
 * Decompiled with CFR 0.152.
 */
package b.b;

import b.b.f;
import b.b.h;
import java.util.Random;

public abstract class g
extends f {
    public abstract Random \u00f600000();

    @Override
    public int \u00d200000(int n2) {
        return h.\u00d200000(this.\u00f600000().nextInt(), n2);
    }

    @Override
    public int \u00d200000() {
        return this.\u00f600000().nextInt();
    }

    @Override
    public int o00000(int n2) {
        return this.\u00f600000().nextInt(n2);
    }

    @Override
    public long \u00d500000() {
        return this.\u00f600000().nextLong();
    }

    @Override
    public boolean \u00d300000() {
        return this.\u00f600000().nextBoolean();
    }

    @Override
    public double o00000() {
        return this.\u00f600000().nextDouble();
    }

    @Override
    public float String() {
        return this.\u00f600000().nextFloat();
    }

    @Override
    public byte[] o00000(byte[] byArray) {
        byte[] byArray2 = byArray;
        this.\u00f600000().nextBytes(byArray2);
        return byArray;
    }
}

