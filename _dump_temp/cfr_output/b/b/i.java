/*
 * Decompiled with CFR 0.152.
 */
package b.b;

import b.b.f;
import b.b.i$_b;
import java.util.Random;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class i
extends Random {
    private static final i$_b \u00d400000 = new i$_b(null);
    private final f o00000;
    private boolean \u00d200000;
    private static final long Object = 0L;

    public i(f f2) {
        this.o00000 = f2;
    }

    public final f super() {
        return this.o00000;
    }

    @Override
    protected final int next(int n2) {
        return this.o00000.\u00d200000(n2);
    }

    @Override
    public final int nextInt() {
        return this.o00000.\u00d200000();
    }

    @Override
    public final int nextInt(int n2) {
        return this.o00000.o00000(n2);
    }

    @Override
    public final boolean nextBoolean() {
        return this.o00000.\u00d300000();
    }

    @Override
    public final long nextLong() {
        return this.o00000.\u00d500000();
    }

    @Override
    public final float nextFloat() {
        return this.o00000.String();
    }

    @Override
    public final double nextDouble() {
        return this.o00000.o00000();
    }

    @Override
    public final void nextBytes(byte[] byArray) {
        this.o00000.o00000(byArray);
    }

    @Override
    public final void setSeed(long l2) {
        if (!this.\u00d200000) {
            this.\u00d200000 = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }
}

