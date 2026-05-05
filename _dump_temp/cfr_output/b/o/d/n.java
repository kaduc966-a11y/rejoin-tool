/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.s.t;
import java.util.NoSuchElementException;

final class n
extends t {
    private final byte[] \u00f5\u00f4\u00f5000;
    private int \u00f4\u00f4\u00f5000;

    public n(byte[] byArray) {
        this.\u00f5\u00f4\u00f5000 = byArray;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00f4\u00f4\u00f5000 < this.\u00f5\u00f4\u00f5000.length;
    }

    @Override
    public final byte newnewnew() {
        byte arrayIndexOutOfBoundsException;
        try {
            int by = this.\u00f4\u00f4\u00f5000;
            this.\u00f4\u00f4\u00f5000 = by + 1;
            arrayIndexOutOfBoundsException = this.\u00f5\u00f4\u00f5000[by];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
            --this.\u00f4\u00f4\u00f5000;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException2.getMessage());
        }
        return arrayIndexOutOfBoundsException;
    }
}

