/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.o.d.c.b;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class c$_c
implements Iterator,
b {
    private final Object Oo\u00f5000;
    private boolean \u00f8O\u00f5000;

    public c$_c(Object object) {
        this.Oo\u00f5000 = object;
        this.\u00f8O\u00f5000 = true;
    }

    public final Object next() {
        if (this.\u00f8O\u00f5000) {
            this.\u00f8O\u00f5000 = false;
            return this.Oo\u00f5000;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean hasNext() {
        return this.\u00f8O\u00f5000;
    }

    public final Void \u00d3\u00f8\u00d2000() {
        throw new UnsupportedOperationException();
    }
}

