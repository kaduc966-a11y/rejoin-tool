/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Iterator;

public abstract class yb
implements Iterator,
g {
    public final Short \u00d8\u00d5\u00d3000() {
        return this.thisObjectnew();
    }

    public abstract short thisObjectnew();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return this.thisObjectnew();
    }
}

