/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.s.rc;
import java.util.NoSuchElementException;

final class pb
extends rc {
    private final double[] oO\u00f6000;
    private int OO\u00f6000;

    public pb(double[] dArray) {
        this.oO\u00f6000 = dArray;
    }

    @Override
    public final boolean hasNext() {
        return this.OO\u00f6000 < this.oO\u00f6000.length;
    }

    @Override
    public final double newStringnew() {
        double d2;
        try {
            int n2 = this.OO\u00f6000;
            this.OO\u00f6000 = n2 + 1;
            d2 = this.oO\u00f6000[n2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.OO\u00f6000;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        return d2;
    }
}

