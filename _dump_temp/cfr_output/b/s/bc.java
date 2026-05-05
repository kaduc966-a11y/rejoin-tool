/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.s.l;
import b.s.mc;
import java.util.Iterator;

public final class bc
implements Iterator,
g {
    private final Iterator \u00d5\u00f8\u00f5000;
    private int \u00d4\u00f8\u00f5000;

    public bc(Iterator iterator) {
        this.\u00d5\u00f8\u00f5000 = iterator;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00d5\u00f8\u00f5000.hasNext();
    }

    public final l \u00f4\u00d5\u00d3000() {
        int n2 = this.\u00d4\u00f8\u00f5000;
        this.\u00d4\u00f8\u00f5000 = n2 + 1;
        if (n2 < 0) {
            mc.\u00d800000();
        }
        return new l(n2, this.\u00d5\u00f8\u00f5000.next());
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

