/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.ac;
import b.o.d.c.g;
import b.o.d.w;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class p
implements Iterator,
g {
    private final int \u00d3\u00d20000;
    private boolean O\u00d20000;
    private final int newnew;
    private int o\u00d20000;

    private p(int n2, int n3, int n4) {
        this.\u00d3\u00d20000 = n3;
        this.O\u00d20000 = n4 > 0 ? Integer.compareUnsigned(n2, n3) <= 0 : Integer.compareUnsigned(n2, n3) >= 0;
        this.newnew = ac.\u00d500000(n4);
        this.o\u00d20000 = this.O\u00d20000 ? n2 : this.\u00d3\u00d20000;
    }

    @Override
    public final boolean hasNext() {
        return this.O\u00d20000;
    }

    public final int \u00d500000() {
        int n2 = this.o\u00d20000;
        if (n2 == this.\u00d3\u00d20000) {
            if (!this.O\u00d20000) {
                throw new NoSuchElementException();
            }
            this.O\u00d20000 = false;
        } else {
            this.o\u00d20000 = ac.\u00d500000(this.o\u00d20000 + this.newnew);
        }
        return n2;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object next() {
        return ac.return(this.\u00d500000());
    }

    public /* synthetic */ p(int n2, int n3, int n4, w w2) {
        this(n2, n3, n4);
    }
}

