/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.m;
import b.o.d.fc;
import b.o.d.w;
import b.qb;
import b.s.mc;
import b.t.c.b.b.b.c;
import b.t.c.b.b.n.b.e;
import b.t.c.b.b.n.b.z;
import b.t.c.b.b.n.b.z$_b;
import b.t.c.b.b.n.c.e.b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.wb;

public final class eb$_b {
    private eb$_b() {
    }

    public final boolean o00000(b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3) {
        boolean bl;
        if (!(b3 instanceof b) || !(b2 instanceof ic)) {
            return false;
        }
        boolean bl2 = bl = ((b)b3).\u00f5\u00d8o000().size() == ((ic)b2).\u00f5\u00d8o000().size();
        if (m.new && !bl) {
            String string = "External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size";
            throw new AssertionError((Object)string);
        }
        for (Object object : mc.\u00d300000((Iterable)((b)b3).\u00d4\u00f8o000().\u00f5\u00d8o000(), (Iterable)((ic)b2).\u00f5\u00f5o000().\u00f5\u00d8o000())) {
            boolean bl3;
            jc jc2 = (jc)((qb)object).\u00d400000();
            object = (jc)((qb)object).\u00d300000();
            boolean bl4 = this.o00000((ic)b3, jc2) instanceof z$_b;
            if (bl4 == (bl3 = this.o00000((ic)b2, (jc)object) instanceof z$_b)) continue;
            return true;
        }
        return false;
    }

    private final z o00000(ic ic2, jc jc2) {
        if (e.super(ic2) || this.o00000(ic2)) {
            return e.super(b.t.c.b.b.h.b.b.int(jc2.forclasssuper()));
        }
        return e.super(jc2.forclasssuper());
    }

    private final boolean o00000(ic nb2) {
        if (nb2.\u00f5\u00d8o000().size() != 1) {
            return false;
        }
        wb wb2 = nb2.\u00d8\u00f80000();
        ib ib2 = wb2 instanceof ib ? (ib)wb2 : null;
        if (ib2 == null) {
            return false;
        }
        wb2 = ib2;
        ib ib3 = (nb2 = ((jc)mc.\u00d5O0000(nb2.\u00f5\u00d8o000())).forclasssuper().thisdosuper().\u00f4OO000()) instanceof ib ? (ib)nb2 : null;
        if (ib3 == null) {
            return false;
        }
        nb2 = ib3;
        return c.\u00d300000((ib)wb2) && fc.o00000((Object)b.t.c.b.b.o.f.b.\u00d800000(wb2), (Object)b.t.c.b.b.o.f.b.\u00d800000(nb2));
    }

    public /* synthetic */ eb$_b(w w2) {
        this();
    }
}

