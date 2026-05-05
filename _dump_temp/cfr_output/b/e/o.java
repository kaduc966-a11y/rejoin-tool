/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.f;
import b.o.d.c.g;
import b.o.d.w;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class o
implements Iterator,
g {
    private final long \u00f8o0000;
    private boolean \u00f4o0000;
    private final long privatesuper;
    private long \u00f5o0000;

    private o(long l2, long l3, long l4) {
        this.\u00f8o0000 = l3;
        this.\u00f4o0000 = l4 > 0L ? Long.compareUnsigned(l2, l3) <= 0 : Long.compareUnsigned(l2, l3) >= 0;
        this.privatesuper = f.super(l4);
        this.\u00f5o0000 = this.\u00f4o0000 ? l2 : this.\u00f8o0000;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00f4o0000;
    }

    public final long \u00d400000() {
        long l2 = this.\u00f5o0000;
        if (l2 == this.\u00f8o0000) {
            if (!this.\u00f4o0000) {
                throw new NoSuchElementException();
            }
            this.\u00f4o0000 = false;
        } else {
            this.\u00f5o0000 = f.super(this.\u00f5o0000 + this.privatesuper);
        }
        return l2;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object next() {
        return f.\u00d4O0000(this.\u00d400000());
    }

    public /* synthetic */ o(long l2, long l3, long l4, w w2) {
        this(l2, l3, l4);
    }
}

