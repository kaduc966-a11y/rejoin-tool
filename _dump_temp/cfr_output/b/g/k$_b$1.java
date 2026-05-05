/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.k;
import b.o.d.c.g;
import java.util.Iterator;

public final class k$_b$1
implements Iterator,
g {
    private final Iterator Stringclass;
    private final Iterator \u00f5\u00d60000;
    final /* synthetic */ k \u00f4\u00d60000;

    k$_b$1(k k2) {
        this.\u00f4\u00d60000 = k2;
        this.Stringclass = k.\u00d200000(k2).o00000();
        this.\u00f5\u00d60000 = k.o00000(k2).o00000();
    }

    public final Iterator \u00d4\u00d50000() {
        return this.Stringclass;
    }

    public final Iterator \u00d3\u00d50000() {
        return this.\u00f5\u00d60000;
    }

    public final Object next() {
        return k.\u00d300000(this.\u00f4\u00d60000).o00000(this.Stringclass.next(), this.\u00f5\u00d60000.next());
    }

    @Override
    public final boolean hasNext() {
        return this.Stringclass.hasNext() && this.\u00f5\u00d60000.hasNext();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

