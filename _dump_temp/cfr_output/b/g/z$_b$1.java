/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.z;
import b.o.d.c.g;
import b.s.l;
import b.s.mc;
import java.util.Iterator;

public final class z$_b$1
implements Iterator,
g {
    private final Iterator \u00d5\u00f40000;
    private int \u00d4\u00f40000;

    z$_b$1(z z2) {
        this.\u00d5\u00f40000 = z.o00000(z2).o00000();
    }

    public final Iterator \u00d8\u00d60000() {
        return this.\u00d5\u00f40000;
    }

    public final int \u00f4\u00d60000() {
        return this.\u00d4\u00f40000;
    }

    public final void privatesuper(int n2) {
        this.\u00d4\u00f40000 = n2;
    }

    public final l thisclass() {
        int n2 = this.\u00d4\u00f40000;
        this.\u00d4\u00f40000 = n2 + 1;
        if (n2 < 0) {
            mc.\u00d800000();
        }
        return new l(n2, this.\u00d5\u00f40000.next());
    }

    @Override
    public final boolean hasNext() {
        return this.\u00d5\u00f40000.hasNext();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

