/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.r;
import b.o.d.c.g;
import b.o.e.f;
import b.s.mc;
import java.util.Iterator;

public final class r$_b$1
implements Iterator,
g {
    private final Iterator nullclass;
    private int o\u00d80000;
    final /* synthetic */ r O\u00d80000;

    r$_b$1(r r2) {
        this.O\u00d80000 = r2;
        this.nullclass = r.\u00d200000(r2).o00000();
    }

    public final Iterator \u00d5\u00d50000() {
        return this.nullclass;
    }

    public final int returnString() {
        return this.o\u00d80000;
    }

    public final void forsuper(int n2) {
        this.o\u00d80000 = n2;
    }

    public final Object next() {
        f f2 = r.o00000(this.O\u00d80000);
        int n2 = this.o\u00d80000;
        this.o\u00d80000 = n2 + 1;
        if (n2 < 0) {
            mc.\u00d800000();
        }
        return f2.o00000(n2, this.nullclass.next());
    }

    @Override
    public final boolean hasNext() {
        return this.nullclass.hasNext();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

