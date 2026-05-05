/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.e;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e$_b$1
implements Iterator,
g {
    private final Iterator \u00f5\u00d50000;
    private int \u00f4\u00d50000;
    final /* synthetic */ e \u00d8\u00d50000;

    e$_b$1(e e2) {
        this.\u00d8\u00d50000 = e2;
        this.\u00f5\u00d50000 = e.\u00d200000(e2).o00000();
    }

    public final Iterator \u00d5\u00d40000() {
        return this.\u00f5\u00d50000;
    }

    public final int \u00d4\u00d40000() {
        return this.\u00f4\u00d50000;
    }

    public final void \u00d3o0000(int n2) {
        this.\u00f4\u00d50000 = n2;
    }

    private final void \u00d3\u00d40000() {
        while (this.\u00f4\u00d50000 < e.\u00d300000(this.\u00d8\u00d50000) && this.\u00f5\u00d50000.hasNext()) {
            this.\u00f5\u00d50000.next();
            int n2 = this.\u00f4\u00d50000;
            this.\u00f4\u00d50000 = n2 + 1;
        }
    }

    @Override
    public final boolean hasNext() {
        this.\u00d3\u00d40000();
        return this.\u00f4\u00d50000 < e.o00000(this.\u00d8\u00d50000) && this.\u00f5\u00d50000.hasNext();
    }

    public final Object next() {
        this.\u00d3\u00d40000();
        if (this.\u00f4\u00d50000 >= e.o00000(this.\u00d8\u00d50000)) {
            throw new NoSuchElementException();
        }
        int n2 = this.\u00f4\u00d50000;
        this.\u00f4\u00d50000 = n2 + 1;
        return this.\u00f5\u00d50000.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

