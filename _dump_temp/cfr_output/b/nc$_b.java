/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.f;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class nc$_b
implements Iterator,
g {
    private final long[] returnnullclass;
    private int \u00d5\u00d3\u00f6000;

    public nc$_b(long[] lArray) {
        this.returnnullclass = lArray;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00d5\u00d3\u00f6000 < this.returnnullclass.length;
    }

    public final long \u00d8\u00f5\u00d3000() {
        if (this.\u00d5\u00d3\u00f6000 < this.returnnullclass.length) {
            int n2 = this.\u00d5\u00d3\u00f6000;
            this.\u00d5\u00d3\u00f6000 = n2 + 1;
            return f.super(this.returnnullclass[n2]);
        }
        throw new NoSuchElementException(String.valueOf(this.\u00d5\u00d3\u00f6000));
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object next() {
        return f.\u00d4O0000(this.\u00d8\u00f5\u00d3000());
    }
}

