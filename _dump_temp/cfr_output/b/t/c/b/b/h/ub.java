/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.gc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.xc;
import b.t.c.b.b.h.zb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class ub
extends gc {
    private final ib ifStringString;

    public ub(ib ib2) {
        this.ifStringString = ib2;
    }

    @Override
    protected ib \u00d3\u00f4\u00d2000() {
        return this.ifStringString;
    }

    @Override
    public ib new(zb zb2) {
        if (zb2 != ((rc)this).\u00d5\u00d6\u00d2000()) {
            return new xc(this, zb2);
        }
        return this;
    }

    @Override
    public ib \u00d4o0000(boolean bl) {
        if (bl == ((rc)this).\u00f5\u00d6\u00d2000()) {
            return this;
        }
        return this.\u00d3\u00f4\u00d2000().\u00d4o0000(bl).new(((rc)this).\u00d5\u00d6\u00d2000());
    }
}

