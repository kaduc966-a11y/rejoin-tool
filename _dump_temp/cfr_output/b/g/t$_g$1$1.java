/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class t$_g$1$1
implements Iterator,
g {
    private boolean \u00d4\u00d80000 = true;
    final /* synthetic */ Object \u00d3\u00d80000;

    t$_g$1$1(Object object) {
        this.\u00d3\u00d80000 = object;
    }

    public final Object next() {
        if (!this.\u00d4\u00d80000) {
            throw new NoSuchElementException();
        }
        this.\u00d4\u00d80000 = false;
        return this.\u00d3\u00d80000;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00d4\u00d80000;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

