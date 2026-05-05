/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Iterator;
import java.util.Map;

public final class tc$_c$1$_b$1
implements Iterator,
g {
    final /* synthetic */ Iterator \u00d3O\u00f6000;

    tc$_c$1$_b$1(Iterator iterator) {
        this.\u00d3O\u00f6000 = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00d3O\u00f6000.hasNext();
    }

    public final Object next() {
        return ((Map.Entry)this.\u00d3O\u00f6000.next()).getKey();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

