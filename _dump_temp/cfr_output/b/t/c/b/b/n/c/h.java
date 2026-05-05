/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.t.c.b.b.b.c;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.c.e.e;
import b.t.c.b.b.n.c.f;
import b.t.c.b.b.n.c.h$_b$0;
import b.t.c.b.b.n.c.h$_b$1;
import b.t.c.b.b.n.c.h$_b$2;
import b.t.c.b.b.n.c.ib;
import b.t.c.b.b.n.c.j;
import b.t.c.b.b.n.c.k;
import b.t.c.b.b.n.c.y;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.kc;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.qb;
import b.t.c.b.b.q.wb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h {
    public static final hc \u00d800000(hc hc2) {
        if (!k.\u00d2O0000.o00000().contains(((kc)hc2).\u00d5\u00f80000()) && !f.\u00d600000.Object().contains(b.o00000(hc2).\u00d5\u00f80000())) {
            return null;
        }
        hc hc3 = hc2;
        if (hc3 instanceof pb || hc3 instanceof b.t.c.b.b.q.y) {
            return b.o00000(hc2, false, h$_b$0.\u00d40\u00d5000, 1, null);
        }
        if (hc3 instanceof qb) {
            return b.o00000(hc2, false, h$_b$1.\u00d30\u00d5000, 1, null);
        }
        return null;
    }

    public static final boolean \u00d500000(hc hc2) {
        return h.\u00d800000(hc2) != null;
    }

    public static final hc o00000(hc hc2) {
        hc hc3 = h.\u00d800000(hc2);
        if (hc3 != null) {
            return hc3;
        }
        if (!j.private.o00000(((kc)hc2).\u00d5\u00f80000())) {
            return null;
        }
        return b.o00000(hc2, false, h$_b$2.newprivatenew, 1, null);
    }

    public static final String for(hc hc2) {
        hc hc3 = h.\u00d600000(hc2);
        if (hc3 == null || (hc3 = b.o00000(hc3)) == null) {
            return null;
        }
        hc2 = hc3;
        hc hc4 = hc3;
        if (hc3 instanceof pb) {
            return ib.o00000.\u00d500000(hc2);
        }
        if (hc4 instanceof qb) {
            b.t.c.b.b.d.f f2 = y.\u00d3O0000.new((qb)hc2);
            if (f2 != null) {
                return f2.\u00d400000();
            }
        }
        return null;
    }

    private static final hc \u00d600000(hc hc2) {
        if (c.\u00d500000(hc2)) {
            return h.\u00d800000(hc2);
        }
        return null;
    }

    public static final boolean o00000(b.t.c.b.b.q.ib ib2, b.t.c.b.b.q.b i2) {
        i2 = ((b.t.c.b.b.q.ib)i2.\u00d8\u00f80000()).nullint();
        ib2 = n.super(ib2);
        while (ib2 != null) {
            if (!(ib2 instanceof e) && b.t.c.b.b.h.e.y.o00000(ib2.nullint(), (rc)i2) != null) {
                return !c.\u00d500000((wb)ib2);
            }
            ib2 = n.super(ib2);
        }
        return false;
    }

    public static final boolean String(hc hc2) {
        return b.o00000(hc2).\u00d8\u00f80000() instanceof e;
    }

    public static final boolean null(hc hc2) {
        return h.String(hc2) || c.\u00d500000(hc2);
    }

    private static final boolean oO0000(hc hc2) {
        return ib.o00000.o00000(b.o00000(hc2));
    }

    private static final boolean \u00d200000(hc hc2) {
        return y.\u00d3O0000.o00000((qb)hc2);
    }

    private static final boolean \u00f600000(hc hc2) {
        return c.\u00d500000(hc2) && j.return(hc2) != null;
    }

    static /* synthetic */ boolean \u00f500000(hc hc2) {
        return h.oO0000(hc2);
    }

    static /* synthetic */ boolean \u00f800000(hc hc2) {
        return h.\u00d200000(hc2);
    }

    static /* synthetic */ boolean \u00d300000(hc hc2) {
        return h.\u00f600000(hc2);
    }
}

