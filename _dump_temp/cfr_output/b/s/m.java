/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Iterator;

public abstract class m
implements Iterator,
g {
    public final Float O\u00d4\u00d3000() {
        return Float.valueOf(this.o\u00d4\u00d3000());
    }

    public abstract float o\u00d4\u00d3000();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return Float.valueOf(this.o\u00d4\u00d3000());
    }
}

