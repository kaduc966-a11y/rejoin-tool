/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Iterator;

public abstract class ec
implements Iterator,
g {
    public final Character O\u00d6\u00d3000() {
        return Character.valueOf(this.o\u00d6\u00d3000());
    }

    public abstract char o\u00d6\u00d3000();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return Character.valueOf(this.o\u00d6\u00d3000());
    }
}

