/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.s.yb;
import java.util.NoSuchElementException;

final class yc
extends yb {
    private final short[] \u00d3\u00f8\u00f5000;
    private int whileStringclass;

    public yc(short[] sArray) {
        this.\u00d3\u00f8\u00f5000 = sArray;
    }

    @Override
    public final boolean hasNext() {
        return this.whileStringclass < this.\u00d3\u00f8\u00f5000.length;
    }

    @Override
    public final short thisObjectnew() {
        short arrayIndexOutOfBoundsException;
        try {
            int s2 = this.whileStringclass;
            this.whileStringclass = s2 + 1;
            arrayIndexOutOfBoundsException = this.\u00d3\u00f8\u00f5000[s2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
            --this.whileStringclass;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException2.getMessage());
        }
        return arrayIndexOutOfBoundsException;
    }
}

