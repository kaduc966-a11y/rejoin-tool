/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.d;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d$_b$1
implements Iterator,
g {
    private int returnString;
    private final Iterator \u00d5\u00d50000;

    d$_b$1(d d2) {
        this.returnString = d.\u00d200000(d2);
        this.\u00d5\u00d50000 = d.o00000(d2).o00000();
    }

    public final int o\u00d40000() {
        return this.returnString;
    }

    public final void nullsuper(int n2) {
        this.returnString = n2;
    }

    public final Iterator nullObject() {
        return this.\u00d5\u00d50000;
    }

    public final Object next() {
        if (this.returnString == 0) {
            throw new NoSuchElementException();
        }
        int n2 = this.returnString;
        this.returnString = n2 + -1;
        return this.\u00d5\u00d50000.next();
    }

    @Override
    public final boolean hasNext() {
        return this.returnString > 0 && this.\u00d5\u00d50000.hasNext();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

