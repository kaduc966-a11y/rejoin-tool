/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.s.fb;
import java.util.NoSuchElementException;

final class bc
extends fb {
    private final int[] \u00d3\u00f5\u00f5000;
    private int nullObjectclass;

    public bc(int[] nArray) {
        this.\u00d3\u00f5\u00f5000 = nArray;
    }

    @Override
    public final boolean hasNext() {
        return this.nullObjectclass < this.\u00d3\u00f5\u00f5000.length;
    }

    @Override
    public final int \u00f4\u00d4\u00d3000() {
        int n2;
        try {
            n2 = this.nullObjectclass;
            this.nullObjectclass = n2 + 1;
            n2 = this.\u00d3\u00f5\u00f5000[n2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.nullObjectclass;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        return n2;
    }
}

