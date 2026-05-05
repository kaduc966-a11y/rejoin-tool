/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.lc;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class s$_b
implements Iterator,
g {
    private final byte[] \u00f5\u00d2\u00f6000;
    private int \u00f4\u00d2\u00f6000;

    public s$_b(byte[] byArray) {
        this.\u00f5\u00d2\u00f6000 = byArray;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00f4\u00d2\u00f6000 < this.\u00f5\u00d2\u00f6000.length;
    }

    public final byte \u00d8\u00f4\u00d3000() {
        if (this.\u00f4\u00d2\u00f6000 < this.\u00f5\u00d2\u00f6000.length) {
            int n2 = this.\u00f4\u00d2\u00f6000;
            this.\u00f4\u00d2\u00f6000 = n2 + 1;
            return lc.super(this.\u00f5\u00d2\u00f6000[n2]);
        }
        throw new NoSuchElementException(String.valueOf(this.\u00f4\u00d2\u00f6000));
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object next() {
        return lc.\u00d6O0000(this.\u00d8\u00f4\u00d3000());
    }
}

