/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Iterator;
import java.util.Map;

public final class tc$_b$1$_b$1
implements Iterator,
g {
    final /* synthetic */ Iterator newreturnclass;

    tc$_b$1$_b$1(Iterator iterator) {
        this.newreturnclass = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.newreturnclass.hasNext();
    }

    public final Object next() {
        return ((Map.Entry)this.newreturnclass.next()).getValue();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

