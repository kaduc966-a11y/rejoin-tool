/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.x;
import b.o.d.c.g;
import java.util.Iterator;

public final class x$_b$1
implements Iterator,
g {
    private final Iterator newreturn;
    private int \u00d3\u00f40000;
    private Object o\u00f40000;
    final /* synthetic */ x O\u00f40000;

    x$_b$1(x x2) {
        this.O\u00f40000 = x2;
        this.newreturn = x.\u00d200000(x2).o00000();
        this.\u00d3\u00f40000 = -1;
    }

    public final Iterator whileString() {
        return this.newreturn;
    }

    public final int \u00d5\u00d60000() {
        return this.\u00d3\u00f40000;
    }

    public final void \u00f5o0000(int n2) {
        this.\u00d3\u00f40000 = n2;
    }

    public final Object \u00d3\u00d60000() {
        return this.o\u00f40000;
    }

    public final void \u00d500000(Object object) {
        this.o\u00f40000 = object;
    }

    private final void \u00d4\u00d60000() {
        while (this.newreturn.hasNext()) {
            Object e2 = this.newreturn.next();
            if (((Boolean)x.o00000(this.O\u00f40000).\u00f800000(e2)).booleanValue()) continue;
            this.o\u00f40000 = e2;
            this.\u00d3\u00f40000 = 1;
            return;
        }
        this.\u00d3\u00f40000 = 0;
    }

    public final Object next() {
        if (this.\u00d3\u00f40000 == -1) {
            this.\u00d4\u00d60000();
        }
        if (this.\u00d3\u00f40000 == 1) {
            Object object = this.o\u00f40000;
            this.o\u00f40000 = null;
            this.\u00d3\u00f40000 = 0;
            return object;
        }
        return this.newreturn.next();
    }

    @Override
    public final boolean hasNext() {
        if (this.\u00d3\u00f40000 == -1) {
            this.\u00d4\u00d60000();
        }
        return this.\u00d3\u00f40000 == 1 || this.newreturn.hasNext();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

