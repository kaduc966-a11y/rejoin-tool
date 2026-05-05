/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.ac;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class v$_b
implements Iterator,
g {
    private final int[] O\u00d3\u00f6000;
    private int \u00f8\u00d2\u00f6000;

    public v$_b(int[] nArray) {
        this.O\u00d3\u00f6000 = nArray;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00f8\u00d2\u00f6000 < this.O\u00d3\u00f6000.length;
    }

    public final int \u00f8\u00f4\u00d3000() {
        if (this.\u00f8\u00d2\u00f6000 < this.O\u00d3\u00f6000.length) {
            int n2 = this.\u00f8\u00d2\u00f6000;
            this.\u00f8\u00d2\u00f6000 = n2 + 1;
            return ac.\u00d500000(this.O\u00d3\u00f6000[n2]);
        }
        throw new NoSuchElementException(String.valueOf(this.\u00f8\u00d2\u00f6000));
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object next() {
        return ac.return(this.\u00f8\u00f4\u00d3000());
    }
}

