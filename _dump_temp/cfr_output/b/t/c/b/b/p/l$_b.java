/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.b$_c;
import b.t.c.b.b.p.l;
import b.t.c.b.b.p.l$1;
import java.util.NoSuchElementException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class l$_b
implements b$_c {
    private int \u00d600000;
    private final int void;
    final /* synthetic */ l \u00d500000;

    private l$_b(l l2) {
        this.\u00d500000 = l2;
        this.\u00d600000 = l2.oO0000();
        this.void = this.\u00d600000 + ((b)l2).\u00f400000();
    }

    @Override
    public boolean hasNext() {
        return this.\u00d600000 < this.void;
    }

    public Byte Object() {
        return this.o00000();
    }

    @Override
    public byte o00000() {
        if (this.\u00d600000 >= this.void) {
            throw new NoSuchElementException();
        }
        return this.\u00d500000.if[this.\u00d600000++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ l$_b(l l2, l$1 l$1) {
        this(l2);
    }
}

