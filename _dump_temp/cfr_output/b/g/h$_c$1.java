/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.h;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class h$_c$1
implements Iterator,
g {
    private final Iterator \u00d3\u00d60000;
    private Iterator \u00d5\u00d60000;
    private int \u00d4\u00d60000;
    final /* synthetic */ h whileString;

    h$_c$1(h h2) {
        this.whileString = h2;
        this.\u00d3\u00d60000 = h.\u00d300000(h2).o00000();
    }

    public final Iterator privateObject() {
        return this.\u00d3\u00d60000;
    }

    public final Iterator \u00f8\u00d40000() {
        return this.\u00d5\u00d60000;
    }

    public final void o00000(Iterator iterator) {
        this.\u00d5\u00d60000 = iterator;
    }

    public final int O\u00d50000() {
        return this.\u00d4\u00d60000;
    }

    public final void \u00d5o0000(int n2) {
        this.\u00d4\u00d60000 = n2;
    }

    public final Object next() {
        if (this.\u00d4\u00d60000 == 2) {
            throw new NoSuchElementException();
        }
        if (this.\u00d4\u00d60000 == 0 && !this.o\u00d50000()) {
            throw new NoSuchElementException();
        }
        this.\u00d4\u00d60000 = 0;
        return this.\u00d5\u00d60000.next();
    }

    @Override
    public final boolean hasNext() {
        if (this.\u00d4\u00d60000 == 1) {
            return true;
        }
        if (this.\u00d4\u00d60000 == 2) {
            return false;
        }
        return this.o\u00d50000();
    }

    private final boolean o\u00d50000() {
        Iterator iterator = this.\u00d5\u00d60000;
        if (iterator != null && iterator.hasNext()) {
            this.\u00d4\u00d60000 = 1;
            return true;
        }
        while (this.\u00d3\u00d60000.hasNext()) {
            iterator = this.\u00d3\u00d60000.next();
            iterator = (Iterator)h.\u00d200000(this.whileString).\u00f800000(h.o00000(this.whileString).\u00f800000(iterator));
            if (!iterator.hasNext()) continue;
            this.\u00d5\u00d60000 = iterator;
            this.\u00d4\u00d60000 = 1;
            return true;
        }
        this.\u00d4\u00d60000 = 2;
        this.\u00d5\u00d60000 = null;
        return false;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

