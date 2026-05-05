/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.f;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f$_b$1
implements Iterator,
g {
    private final Iterator o\u00d60000;
    private int O\u00d60000;
    private Object \u00f8\u00d50000;
    final /* synthetic */ f ifString;

    f$_b$1(f f2) {
        this.ifString = f2;
        this.o\u00d60000 = f.\u00d300000(f2).o00000();
        this.O\u00d60000 = -1;
    }

    public final Iterator forObject() {
        return this.o\u00d60000;
    }

    public final int \u00f5\u00d40000() {
        return this.O\u00d60000;
    }

    public final void \u00d4o0000(int n2) {
        this.O\u00d60000 = n2;
    }

    public final Object \u00f4\u00d40000() {
        return this.\u00f8\u00d50000;
    }

    public final void new(Object object) {
        this.\u00f8\u00d50000 = object;
    }

    private final void \u00d8\u00d40000() {
        while (this.o\u00d60000.hasNext()) {
            Object e2 = this.o\u00d60000.next();
            if ((Boolean)f.\u00d200000(this.ifString).\u00f800000(e2) != f.o00000(this.ifString)) continue;
            this.\u00f8\u00d50000 = e2;
            this.O\u00d60000 = 1;
            return;
        }
        this.O\u00d60000 = 0;
    }

    public final Object next() {
        if (this.O\u00d60000 == -1) {
            this.\u00d8\u00d40000();
        }
        if (this.O\u00d60000 == 0) {
            throw new NoSuchElementException();
        }
        Object object = this.\u00f8\u00d50000;
        this.\u00f8\u00d50000 = null;
        this.O\u00d60000 = -1;
        return object;
    }

    @Override
    public final boolean hasNext() {
        if (this.O\u00d60000 == -1) {
            this.\u00d8\u00d40000();
        }
        return this.O\u00d60000 == 1;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

