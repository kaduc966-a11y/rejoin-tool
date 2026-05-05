/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class jc
implements ListIterator,
g {
    public static final jc \u00d80\u00f6000 = new jc();

    private jc() {
    }

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final boolean hasPrevious() {
        return false;
    }

    @Override
    public final int nextIndex() {
        return 0;
    }

    @Override
    public final int previousIndex() {
        return -1;
    }

    public final Void \u00f4\u00d6\u00d3000() {
        throw new NoSuchElementException();
    }

    public final Void \u00f5\u00d6\u00d3000() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void \u00d300000(Void void_) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void new(Void void_) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void set(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

