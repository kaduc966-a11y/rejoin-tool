/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.gc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.jc;
import b.t.c.b.b.h.pb;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.zb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class sc
extends gc
implements pb {
    private final ib \u00f8\u00f4\u00d8000;
    private final rc privateObjectString;

    public sc(ib ib2, rc rc2) {
        this.\u00f8\u00f4\u00d8000 = ib2;
        this.privateObjectString = rc2;
    }

    @Override
    protected final ib \u00d3\u00f4\u00d2000() {
        return this.\u00f8\u00f4\u00d8000;
    }

    @Override
    public final rc \u00f8\u00f4\u00d2000() {
        return this.privateObjectString;
    }

    public final ib O\u00f5\u00d2000() {
        return this.\u00d3\u00f4\u00d2000();
    }

    @Override
    public final ib new(zb zb2) {
        return (ib)jc.o00000(this.O\u00f5\u00d2000().new(zb2), this.\u00f8\u00f4\u00d2000());
    }

    @Override
    public final ib \u00d4o0000(boolean bl) {
        return (ib)jc.o00000(this.O\u00f5\u00d2000().\u00d4o0000(bl), this.\u00f8\u00f4\u00d2000().\u00d8\u00d6\u00d2000().oo0000(bl));
    }

    public final sc \u00d500000(ib ib2) {
        return new sc(ib2, this.\u00f8\u00f4\u00d2000());
    }

    public final sc \u00f5O0000(b b2) {
        return new sc((ib)b2.\u00d200000(this.\u00d3\u00f4\u00d2000()), b2.\u00d200000(this.\u00f8\u00f4\u00d2000()));
    }

    @Override
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.\u00f8\u00f4\u00d2000() + ")] " + this.O\u00f5\u00d2000();
    }
}

