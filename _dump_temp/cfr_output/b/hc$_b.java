/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.dd;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class hc$_b
implements Iterator,
g {
    private final short[] \u00d3\u00d3\u00f6000;
    private int newnullclass;

    public hc$_b(short[] sArray) {
        this.\u00d3\u00d3\u00f6000 = sArray;
    }

    @Override
    public final boolean hasNext() {
        return this.newnullclass < this.\u00d3\u00d3\u00f6000.length;
    }

    public final short \u00d3\u00f5\u00d3000() {
        if (this.newnullclass < this.\u00d3\u00d3\u00f6000.length) {
            int n2 = this.newnullclass;
            this.newnullclass = n2 + 1;
            return dd.\u00d2O0000(this.\u00d3\u00d3\u00f6000[n2]);
        }
        throw new NoSuchElementException(String.valueOf(this.newnullclass));
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object next() {
        return dd.\u00d6O0000(this.\u00d3\u00f5\u00d3000());
    }
}

