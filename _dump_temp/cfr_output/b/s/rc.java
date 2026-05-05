/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Iterator;

public abstract class rc
implements Iterator,
g {
    public final Double \u00d3\u00d8\u00d3000() {
        return this.newStringnew();
    }

    public abstract double newStringnew();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return this.newStringnew();
    }
}

