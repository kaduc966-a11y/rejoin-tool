/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.ab;
import b.o.d.c.g;
import java.util.Iterator;

public final class ab$_b$1
implements Iterator,
g {
    private final Iterator returnreturn;
    private int \u00d8\u00f40000;

    ab$_b$1(ab ab2) {
        this.returnreturn = ab.\u00d200000(ab2).o00000();
        this.\u00d8\u00f40000 = ab.o00000(ab2);
    }

    public final Iterator \u00f8\u00d60000() {
        return this.returnreturn;
    }

    public final int \u00f5\u00d60000() {
        return this.\u00d8\u00f40000;
    }

    public final void \u00f8o0000(int n2) {
        this.\u00d8\u00f40000 = n2;
    }

    private final void Stringclass() {
        while (this.\u00d8\u00f40000 > 0 && this.returnreturn.hasNext()) {
            this.returnreturn.next();
            int n2 = this.\u00d8\u00f40000;
            this.\u00d8\u00f40000 = n2 + -1;
        }
    }

    public final Object next() {
        this.Stringclass();
        return this.returnreturn.next();
    }

    @Override
    public final boolean hasNext() {
        this.Stringclass();
        return this.returnreturn.hasNext();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

