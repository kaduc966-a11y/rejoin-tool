/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.j;
import b.o.d.c.g;
import java.util.Iterator;

public final class j$_b$1
implements Iterator,
g {
    private final Iterator \u00d8\u00d60000;
    final /* synthetic */ j thisclass;

    j$_b$1(j j2) {
        this.thisclass = j2;
        this.\u00d8\u00d60000 = j.\u00d200000(j2).o00000();
    }

    public final Iterator newString() {
        return this.\u00d8\u00d60000;
    }

    public final Object next() {
        return j.o00000(this.thisclass).\u00f800000(this.\u00d8\u00d60000.next());
    }

    @Override
    public final boolean hasNext() {
        return this.\u00d8\u00d60000.hasNext();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

