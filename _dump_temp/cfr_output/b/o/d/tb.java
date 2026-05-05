/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.s.pb;
import java.util.NoSuchElementException;

final class tb
extends pb {
    private final boolean[] ifStringclass;
    private int \u00f5\u00f6\u00f5000;

    public tb(boolean[] blArray) {
        this.ifStringclass = blArray;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00f5\u00f6\u00f5000 < this.ifStringclass.length;
    }

    @Override
    public final boolean \u00d4\u00d5\u00d3000() {
        int n2;
        try {
            n2 = this.\u00f5\u00f6\u00f5000;
            this.\u00f5\u00f6\u00f5000 = n2 + 1;
            n2 = this.ifStringclass[n2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.\u00f5\u00f6\u00f5000;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        return n2 != 0;
    }
}

