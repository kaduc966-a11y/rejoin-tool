/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.s.ec;
import java.util.NoSuchElementException;

final class lc
extends ec {
    private final char[] o0\u00f6000;
    private int O0\u00f6000;

    public lc(char[] cArray) {
        this.o0\u00f6000 = cArray;
    }

    @Override
    public final boolean hasNext() {
        return this.O0\u00f6000 < this.o0\u00f6000.length;
    }

    @Override
    public final char o\u00d6\u00d3000() {
        char arrayIndexOutOfBoundsException;
        try {
            int c2 = this.O0\u00f6000;
            this.O0\u00f6000 = c2 + 1;
            arrayIndexOutOfBoundsException = this.o0\u00f6000[c2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
            --this.O0\u00f6000;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException2.getMessage());
        }
        return arrayIndexOutOfBoundsException;
    }
}

