/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Iterator;

public abstract class pb
implements Iterator,
g {
    public final Boolean \u00d3\u00d5\u00d3000() {
        return this.\u00d4\u00d5\u00d3000();
    }

    public abstract boolean \u00d4\u00d5\u00d3000();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return this.\u00d4\u00d5\u00d3000();
    }
}

