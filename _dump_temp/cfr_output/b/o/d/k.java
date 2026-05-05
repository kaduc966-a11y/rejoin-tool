/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class k
implements Iterator,
g {
    private final Object[] thissuperclass;
    private int \u00d5\u00d5\u00f5000;

    public k(Object[] objectArray) {
        this.thissuperclass = objectArray;
    }

    public final Object[] \u00f8\u00d2\u00d3000() {
        return this.thissuperclass;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00d5\u00d5\u00f5000 < this.thissuperclass.length;
    }

    public final Object next() {
        Object object;
        try {
            int n2 = this.\u00d5\u00d5\u00f5000;
            this.\u00d5\u00d5\u00f5000 = n2 + 1;
            object = this.thissuperclass[n2];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.\u00d5\u00d5\u00f5000;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        return object;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

