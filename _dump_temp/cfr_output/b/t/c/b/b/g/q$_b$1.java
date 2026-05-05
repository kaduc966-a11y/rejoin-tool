/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.o.d.c.g;
import b.t.c.b.b.g.q;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class q$_b$1
implements Iterator,
g {
    private boolean thisvoidclass = true;
    final /* synthetic */ q \u00d5o\u00f6000;

    q$_b$1(q q2) {
        this.\u00d5o\u00f6000 = q2;
    }

    @Override
    public final boolean hasNext() {
        return this.thisvoidclass;
    }

    public final Object next() {
        if (this.thisvoidclass) {
            this.thisvoidclass = false;
            return this.\u00d5o\u00f6000.\u00d3\u00f4\u00d3000();
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

