/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.s.kb;
import java.util.Iterator;
import java.util.NoSuchElementException;

class kb$_c
implements Iterator,
g {
    private int \u00d5\u00f5\u00f5000;
    final /* synthetic */ kb \u00d4\u00f5\u00f5000;

    public kb$_c(kb kb2) {
        this.\u00d4\u00f5\u00f5000 = kb2;
    }

    protected final int \u00f8\u00d4\u00d3000() {
        return this.\u00d5\u00f5\u00f5000;
    }

    protected final void returnreturn(int n2) {
        this.\u00d5\u00f5\u00f5000 = n2;
    }

    @Override
    public boolean hasNext() {
        return this.\u00d5\u00f5\u00f5000 < this.\u00d4\u00f5\u00f5000.size();
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int n2 = this.\u00d5\u00f5\u00f5000;
        this.\u00d5\u00f5\u00f5000 = n2 + 1;
        return this.\u00d4\u00f5\u00f5000.get(n2);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

