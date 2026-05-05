/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.o.d.fc;
import b.t.c.b.b.b.c;
import b.t.c.b.b.n.c.e.e;
import b.t.c.b.b.n.c.eb$_b;
import b.t.c.b.b.n.c.h;
import b.t.c.b.b.n.c.j;
import b.t.c.b.b.n.c.k;
import b.t.c.b.b.o.f;
import b.t.c.b.b.o.f$_b;
import b.t.c.b.b.o.f$_c;
import b.t.c.b.b.q.b;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;

public final class eb
implements f {
    public static final eb$_b o00000 = new eb$_b(null);

    @Override
    public final f$_c o00000(b b2, b b3, ib ib2) {
        if (this.\u00d200000(b2, b3, ib2)) {
            return f$_c.\u00d200000;
        }
        if (o00000.o00000(b2, b3)) {
            return f$_c.\u00d200000;
        }
        return f$_c.\u00d300000;
    }

    private final boolean \u00d200000(b b2, b b3, ib ib2) {
        if (!(b2 instanceof hc) || !(b3 instanceof ic) || c.\u00d500000(b3)) {
            return false;
        }
        if (!j.private.o00000(((ic)b3).\u00d5\u00f80000()) && !k.\u00d2O0000.o00000(((ic)b3).\u00d5\u00f80000())) {
            return false;
        }
        hc hc2 = h.o00000((hc)b2);
        b b4 = b2;
        b4 = b4 instanceof ic ? (ic)b4 : null;
        boolean bl = b4 != null ? ((ic)b3).\u00d4\u00f5o000() == b4.\u00d4\u00f5o000() : false;
        if (!bl && (hc2 == null || !((ic)b3).\u00d4\u00f5o000())) {
            return true;
        }
        if (!(ib2 instanceof e) || ((ic)b3).\u00d8\u00f5o000() != null) {
            return false;
        }
        if (hc2 == null || h.o00000(ib2, hc2)) {
            return false;
        }
        return !(hc2 instanceof ic) || !(b2 instanceof ic) || j.o00000((ic)hc2) == null || !fc.o00000((Object)b.t.c.b.b.n.b.e.super((ic)b3, false, false, 2, null), (Object)b.t.c.b.b.n.b.e.super(((ic)b2).\u00f5\u00f5o000(), false, false, 2, null));
    }

    @Override
    public final f$_b o00000() {
        return f$_b.\u00d200000;
    }
}

