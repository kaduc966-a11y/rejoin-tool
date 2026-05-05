/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Iterator;

public abstract class fb
implements Iterator,
g {
    public final Integer \u00f5\u00d4\u00d3000() {
        return this.\u00f4\u00d4\u00d3000();
    }

    public abstract int \u00f4\u00d4\u00d3000();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return this.\u00f4\u00d4\u00d3000();
    }
}

