/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import java.util.Enumeration;
import java.util.Iterator;

public final class g$_b$1
implements Iterator,
g {
    final /* synthetic */ Enumeration \u00f8\u00d6\u00f5000;

    g$_b$1(Enumeration enumeration) {
        this.\u00f8\u00d6\u00f5000 = enumeration;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00f8\u00d6\u00f5000.hasMoreElements();
    }

    public final Object next() {
        return this.\u00f8\u00d6\u00f5000.nextElement();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

