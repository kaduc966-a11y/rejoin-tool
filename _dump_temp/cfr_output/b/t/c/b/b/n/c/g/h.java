/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.qd;
import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.f;
import b.t.c.b.b.h.gc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.jc;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.wc;
import b.t.c.b.b.h.zb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
extends gc
implements wc {
    private final ib returnStringString;

    public h(ib ib2) {
        this.returnStringString = ib2;
    }

    @Override
    public final ib \u00d3\u00f4\u00d2000() {
        return this.returnStringString;
    }

    @Override
    public final boolean returnwhilesuper() {
        return true;
    }

    @Override
    public final rc \u00d5O0000(rc rc2) {
        if (!b.\u00f800000(rc2 = rc2.\u00d8\u00d6\u00d2000()) && !o.\u00d600000(rc2)) {
            return rc2;
        }
        rc rc3 = rc2;
        if (rc3 instanceof ib) {
            return this.return((ib)rc2);
        }
        if (rc3 instanceof f) {
            return jc.o00000(oc.o00000(this.return(((f)rc2).\u00f4\u00f4\u00d2000()), this.return(((f)rc2).\u00d8\u00f4\u00d2000())), jc.o00000(rc2));
        }
        throw new qd();
    }

    @Override
    public final boolean \u00f5\u00d6\u00d2000() {
        return false;
    }

    private final ib return(ib ib2) {
        ib ib3 = ib2.\u00d4o0000(false);
        if (!b.\u00f800000(ib2)) {
            return ib3;
        }
        return new h(ib3);
    }

    public final h \u00d500000(zb zb2) {
        return new h(this.\u00d3\u00f4\u00d2000().new(zb2));
    }

    @Override
    public final ib \u00d4o0000(boolean bl) {
        if (bl) {
            return this.\u00d3\u00f4\u00d2000().\u00d4o0000(true);
        }
        return this;
    }

    public final h \u00d800000(ib ib2) {
        return new h(ib2);
    }
}

