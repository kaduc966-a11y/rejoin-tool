/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.s.hb;
import b.s.sb;
import java.util.List;
import java.util.ListIterator;

public final class sb$_b$1
implements ListIterator,
g {
    private final ListIterator O\u00f8\u00f5000;
    final /* synthetic */ sb \u00f8\u00f6\u00f5000;

    sb$_b$1(sb sb2, int n2) {
        this.\u00f8\u00f6\u00f5000 = sb2;
        this.O\u00f8\u00f5000 = sb.o00000(sb2).listIterator(hb.new((List)sb2, n2));
    }

    public final ListIterator \u00d5\u00d5\u00d3000() {
        return this.O\u00f8\u00f5000;
    }

    @Override
    public final boolean hasNext() {
        return this.O\u00f8\u00f5000.hasPrevious();
    }

    @Override
    public final boolean hasPrevious() {
        return this.O\u00f8\u00f5000.hasNext();
    }

    @Override
    public final Object next() {
        return this.O\u00f8\u00f5000.previous();
    }

    @Override
    public final int nextIndex() {
        return hb.\u00d500000(this.\u00f8\u00f6\u00f5000, this.O\u00f8\u00f5000.previousIndex());
    }

    public final Object previous() {
        return this.O\u00f8\u00f5000.next();
    }

    @Override
    public final int previousIndex() {
        return hb.\u00d500000(this.\u00f8\u00f6\u00f5000, this.O\u00f8\u00f5000.nextIndex());
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void set(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

