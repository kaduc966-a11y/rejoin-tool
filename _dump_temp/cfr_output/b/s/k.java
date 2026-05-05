/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class k
implements Iterator,
g {
    private int \u00d3\u00d8\u00f5000;
    private Object newnewclass;

    @Override
    public boolean hasNext() {
        switch (this.\u00d3\u00d8\u00f5000) {
            case 2: {
                return false;
            }
            case 1: {
                return true;
            }
            case 0: {
                return this.privatesupernew();
            }
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    public Object next() {
        if (this.\u00d3\u00d8\u00f5000 == 1) {
            this.\u00d3\u00d8\u00f5000 = 0;
            return this.newnewclass;
        }
        if (this.\u00d3\u00d8\u00f5000 == 2 || !this.privatesupernew()) {
            throw new NoSuchElementException();
        }
        this.\u00d3\u00d8\u00f5000 = 0;
        return this.newnewclass;
    }

    private final boolean privatesupernew() {
        this.\u00d3\u00d8\u00f5000 = 3;
        this.\u00f5\u00d3\u00d3000();
        return this.\u00d3\u00d8\u00f5000 == 1;
    }

    protected abstract void \u00f5\u00d3\u00d3000();

    protected final void \u00f5o0000(Object object) {
        this.newnewclass = object;
        this.\u00d3\u00d8\u00f5000 = 1;
    }

    protected final void \u00f4\u00d3\u00d3000() {
        this.\u00d3\u00d8\u00f5000 = 2;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

