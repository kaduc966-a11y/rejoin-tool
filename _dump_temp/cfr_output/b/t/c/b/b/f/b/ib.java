/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.qd;
import b.t.c.b.b.f.b.ib$_b;
import b.t.c.b.b.h.w;
import b.t.c.b.b.l.b$_b$_b;
import b.t.c.b.b.l.b$_d$_b;
import b.t.c.b.b.l.b$_nb$_c$_b;
import b.t.c.b.b.l.b$_u;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.ec;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ib {
    public static final ib super = new ib();

    private ib() {
    }

    public final ab super(b$_u b$_u) {
        b$_u b$_u2 = b$_u;
        switch (b$_u2 == null ? -1 : ib$_b.\u00f600000[b$_u2.ordinal()]) {
            case 1: {
                return ab.\u00d600000;
            }
            case 2: {
                return ab.class;
            }
            case 3: {
                return ab.\u00d400000;
            }
            case 4: {
                return ab.super;
            }
        }
        return ab.\u00d600000;
    }

    public final ec super(b$_d$_b b$_d$_b) {
        b$_d$_b b$_d$_b2 = b$_d$_b;
        switch (b$_d$_b2 == null ? -1 : ib$_b.class[b$_d$_b2.ordinal()]) {
            case 1: {
                return ec.int;
            }
            case 2: {
                return ec.\u00d600000;
            }
            case 3: {
                return ec.\u00f400000;
            }
            case 4: {
                return ec.\u00d400000;
            }
            case 5: {
                return ec.super;
            }
            case 6: 
            case 7: {
                return ec.\u00d200000;
            }
        }
        return ec.int;
    }

    public final w super(b$_b$_b b$_b$_b) {
        switch (ib$_b.\u00d300000[b$_b$_b.ordinal()]) {
            case 1: {
                return w.o00000;
            }
            case 2: {
                return w.return;
            }
            case 3: {
                return w.\u00d400000;
            }
        }
        throw new qd();
    }

    public final w super(b$_nb$_c$_b b$_nb$_c$_b) {
        switch (ib$_b.\u00d200000[b$_nb$_c$_b.ordinal()]) {
            case 1: {
                return w.o00000;
            }
            case 2: {
                return w.return;
            }
            case 3: {
                return w.\u00d400000;
            }
            case 4: {
                throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: ".concat(String.valueOf(b$_nb$_c$_b)));
            }
        }
        throw new qd();
    }
}

