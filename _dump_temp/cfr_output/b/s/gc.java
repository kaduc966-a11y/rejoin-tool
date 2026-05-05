/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.o.e.h;
import b.s.bc;
import java.util.Iterator;

public final class gc
implements Iterable,
g {
    private final h \u00d40\u00f6000;

    public gc(h h2) {
        this.\u00d40\u00f6000 = h2;
    }

    public final Iterator iterator() {
        return new bc((Iterator)this.\u00d40\u00f6000.newreturn());
    }
}

