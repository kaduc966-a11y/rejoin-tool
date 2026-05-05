/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Iterator;

public abstract class nb
implements Iterator,
g {
    public final Long O\u00d5\u00d3000() {
        return this.o\u00d5\u00d3000();
    }

    public abstract long o\u00d5\u00d3000();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return this.o\u00d5\u00d3000();
    }
}

