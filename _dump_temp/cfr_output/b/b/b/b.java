/*
 * Decompiled with CFR 0.152.
 */
package b.b.b;

import b.b.g;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class b
extends g {
    @Override
    public final Random \u00f600000() {
        return ThreadLocalRandom.current();
    }

    @Override
    public final int o00000(int n2, int n3) {
        return ThreadLocalRandom.current().nextInt(n2, n3);
    }

    @Override
    public final long o00000(long l2) {
        return ThreadLocalRandom.current().nextLong(l2);
    }

    @Override
    public final long o00000(long l2, long l3) {
        return ThreadLocalRandom.current().nextLong(l2, l3);
    }

    @Override
    public final double o00000(double d2) {
        return ThreadLocalRandom.current().nextDouble(d2);
    }
}

