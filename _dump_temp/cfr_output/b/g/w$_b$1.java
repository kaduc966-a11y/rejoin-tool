/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.w;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class w$_b$1
implements Iterator,
g {
    private final Iterator \u00f8\u00d80000;
    private int privateclass;
    private Object \u00f5\u00d80000;
    final /* synthetic */ w \u00f4\u00d80000;

    w$_b$1(w w2) {
        this.\u00f4\u00d80000 = w2;
        this.\u00f8\u00d80000 = w.\u00d200000(w2).o00000();
        this.privateclass = -1;
    }

    public final Iterator ifString() {
        return this.\u00f8\u00d80000;
    }

    public final int o\u00d60000() {
        return this.privateclass;
    }

    public final void \u00f4o0000(int n2) {
        this.privateclass = n2;
    }

    public final Object O\u00d60000() {
        return this.\u00f5\u00d80000;
    }

    public final void \u00d400000(Object object) {
        this.\u00f5\u00d80000 = object;
    }

    private final void \u00f8\u00d50000() {
        if (this.\u00f8\u00d80000.hasNext()) {
            Object e2 = this.\u00f8\u00d80000.next();
            if (((Boolean)w.o00000(this.\u00f4\u00d80000).\u00f800000(e2)).booleanValue()) {
                this.privateclass = 1;
                this.\u00f5\u00d80000 = e2;
                return;
            }
        }
        this.privateclass = 0;
    }

    public final Object next() {
        if (this.privateclass == -1) {
            this.\u00f8\u00d50000();
        }
        if (this.privateclass == 0) {
            throw new NoSuchElementException();
        }
        Object object = this.\u00f5\u00d80000;
        this.\u00f5\u00d80000 = null;
        this.privateclass = -1;
        return object;
    }

    @Override
    public final boolean hasNext() {
        if (this.privateclass == -1) {
            this.\u00f8\u00d50000();
        }
        return this.privateclass == 1;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

