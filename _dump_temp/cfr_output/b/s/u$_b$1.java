/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.i;
import b.s.hb;
import b.s.u;
import java.util.List;
import java.util.ListIterator;

public final class u$_b$1
implements ListIterator,
i {
    private final ListIterator \u00d5O\u00f5000;
    final /* synthetic */ u \u00d4O\u00f5000;

    u$_b$1(u u2, int n2) {
        this.\u00d4O\u00f5000 = u2;
        this.\u00d5O\u00f5000 = u.o00000(u2).listIterator(hb.new((List)u2, n2));
    }

    public final ListIterator forpublicsuper() {
        return this.\u00d5O\u00f5000;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00d5O\u00f5000.hasPrevious();
    }

    @Override
    public final boolean hasPrevious() {
        return this.\u00d5O\u00f5000.hasNext();
    }

    @Override
    public final Object next() {
        return this.\u00d5O\u00f5000.previous();
    }

    @Override
    public final int nextIndex() {
        return hb.\u00d500000(this.\u00d4O\u00f5000, this.\u00d5O\u00f5000.previousIndex());
    }

    public final Object previous() {
        return this.\u00d5O\u00f5000.next();
    }

    @Override
    public final int previousIndex() {
        return hb.\u00d500000(this.\u00d4O\u00f5000, this.\u00d5O\u00f5000.nextIndex());
    }

    public final void add(Object object) {
        this.\u00d5O\u00f5000.add(object);
        this.\u00d5O\u00f5000.previous();
    }

    @Override
    public final void remove() {
        this.\u00d5O\u00f5000.remove();
    }

    public final void set(Object object) {
        this.\u00d5O\u00f5000.set(object);
    }
}

