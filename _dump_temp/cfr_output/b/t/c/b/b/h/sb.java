/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.w;
import b.t.c.b.b.h.b;
import b.t.c.b.b.h.c.v;
import b.t.c.b.b.h.e.i;
import b.t.c.b.b.h.gc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.s;
import b.t.c.b.b.h.sb$_b;
import b.t.c.b.b.h.zb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class sb
extends gc
implements b,
v {
    public static final sb$_b \u00f5\u00f5\u00d8000 = new sb$_b(null);
    private final ib \u00f4\u00f5\u00d8000;
    private final boolean \u00d8\u00f5\u00d8000;

    private sb(ib ib2, boolean bl) {
        this.\u00f4\u00f5\u00d8000 = ib2;
        this.\u00d8\u00f5\u00d8000 = bl;
    }

    public final ib \u00d3\u00f5\u00d2000() {
        return this.\u00f4\u00f5\u00d8000;
    }

    @Override
    protected final ib \u00d3\u00f4\u00d2000() {
        return this.\u00f4\u00f5\u00d8000;
    }

    @Override
    public final boolean \u00f5\u00d6\u00d2000() {
        return false;
    }

    @Override
    public final boolean returnwhilesuper() {
        return this.\u00d3\u00f4\u00d2000().thisdosuper() instanceof i || this.\u00d3\u00f4\u00d2000().thisdosuper().\u00f4OO000() instanceof b.t.c.b.b.q.i;
    }

    @Override
    public final rc \u00d5O0000(rc rc2) {
        return s.o00000(rc2.\u00d8\u00d6\u00d2000(), this.\u00d8\u00f5\u00d8000);
    }

    @Override
    public final ib new(zb zb2) {
        return new sb(this.\u00d3\u00f4\u00d2000().new(zb2), this.\u00d8\u00f5\u00d8000);
    }

    @Override
    public final ib \u00d4o0000(boolean bl) {
        if (bl) {
            return this.\u00d3\u00f4\u00d2000().\u00d4o0000(bl);
        }
        return this;
    }

    @Override
    public final String toString() {
        return this.\u00d3\u00f4\u00d2000() + " & Any";
    }

    public final sb \u00f400000(ib ib2) {
        return new sb(ib2, this.\u00d8\u00f5\u00d8000);
    }

    public /* synthetic */ sb(ib ib2, boolean bl, w w2) {
        this(ib2, bl);
    }
}

