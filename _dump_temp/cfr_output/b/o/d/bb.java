/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.s.nb;
import java.util.NoSuchElementException;

final class bb
extends nb {
    private final long[] \u00f8\u00f5\u00f5000;
    private int privateObjectclass;

    public bb(long[] lArray) {
        this.\u00f8\u00f5\u00f5000 = lArray;
    }

    @Override
    public final boolean hasNext() {
        return this.privateObjectclass < this.\u00f8\u00f5\u00f5000.length;
    }

    @Override
    public final long o\u00d5\u00d3000() {
        long l2;
        try {
            int n2 = this.privateObjectclass;
            this.privateObjectclass = n2 + 1;
            l2 = this.\u00f8\u00f5\u00f5000[n2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.privateObjectclass;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        return l2;
    }
}

