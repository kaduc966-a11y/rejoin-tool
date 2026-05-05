/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.s.m;
import java.util.NoSuchElementException;

final class qb
extends m {
    private final float[] \u00d3\u00f4\u00f5000;
    private int whilenewclass;

    public qb(float[] fArray) {
        this.\u00d3\u00f4\u00f5000 = fArray;
    }

    @Override
    public final boolean hasNext() {
        return this.whilenewclass < this.\u00d3\u00f4\u00f5000.length;
    }

    @Override
    public final float o\u00d4\u00d3000() {
        float f2;
        try {
            int n2 = this.whilenewclass;
            this.whilenewclass = n2 + 1;
            f2 = this.\u00d3\u00f4\u00f5000[n2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.whilenewclass;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        return f2;
    }
}

