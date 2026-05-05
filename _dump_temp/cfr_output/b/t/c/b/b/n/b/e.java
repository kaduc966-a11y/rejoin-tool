/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.fc;
import b.t.c.b.b.b.c.f;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.d.d;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.b.cb;
import b.t.c.b.b.n.b.fb;
import b.t.c.b.b.n.b.h;
import b.t.c.b.b.n.b.m;
import b.t.c.b.b.n.b.o;
import b.t.c.b.b.n.b.u;
import b.t.c.b.b.n.b.z;
import b.t.c.b.b.n.b.z$_b;
import b.t.c.b.b.n.b.z$_c;
import b.t.c.b.b.n.c.j;
import b.t.c.b.b.o.h.b;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.qb;
import b.t.c.b.b.q.vb;
import b.t.c.b.b.q.wb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    public static final String super(ic ic2, boolean bl, boolean bl2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        if (bl2) {
            stringBuilder2.append(ic2 instanceof vb ? "<init>" : ic2.\u00d5\u00f80000().\u00d400000());
        }
        stringBuilder2.append("(");
        mc mc2 = ic2.nullclasssuper();
        if (mc2 != null) {
            mc mc3 = mc2;
            e.super(stringBuilder2, mc3.forclasssuper());
        }
        for (jc jc2 : ic2.\u00f5\u00d8o000()) {
            e.super(stringBuilder2, jc2.forclasssuper());
        }
        stringBuilder2.append(")");
        if (bl) {
            if (fb.o00000(ic2)) {
                stringBuilder2.append("V");
            } else {
                e.super(stringBuilder2, ic2.\u00d3\u00f4o000());
            }
        }
        return stringBuilder.toString();
    }

    public static /* synthetic */ String super(ic ic2, boolean bl, boolean bl2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            bl = true;
        }
        if ((n2 & 2) != 0) {
            bl2 = true;
        }
        return e.super(ic2, bl, bl2);
    }

    public static final boolean super(b.t.c.b.b.q.b b2) {
        if (!(b2 instanceof ic)) {
            return false;
        }
        if (!fc.o00000((Object)((ic)b2).\u00d5\u00f80000().\u00d400000(), (Object)"remove") || ((ic)b2).\u00f5\u00d8o000().size() != 1 || b.t.c.b.b.n.c.h.null((hc)b2)) {
            return false;
        }
        z z2 = e.super(((jc)b.s.mc.\u00d5O0000(((ic)b2).\u00f5\u00f5o000().\u00f5\u00d8o000())).forclasssuper());
        z$_b z$_b = z2 instanceof z$_b ? (z$_b)z2 : null;
        if ((z$_b != null ? z$_b.\u00f800000() : null) != b.t.c.b.b.o.h.e.\u00d300000) {
            return false;
        }
        ic ic2 = j.o00000((ic)b2);
        if (ic2 == null) {
            return false;
        }
        b2 = ic2;
        z2 = e.super(((jc)b.s.mc.\u00d5O0000(ic2.\u00f5\u00f5o000().\u00f5\u00d8o000())).forclasssuper());
        return fc.o00000((Object)b.t.c.b.b.o.f.b.\u00d600000(b2.\u00d8\u00f80000()), (Object)d$_b.privateObject.\u00d800000()) && z2 instanceof z$_c && fc.o00000((Object)((z$_c)z2).\u00f500000(), (Object)"java/lang/Object");
    }

    public static final String \u00d200000(b.t.c.b.b.q.b b2) {
        o o2 = o.o00000;
        if (n.\u00d300000(b2)) {
            return null;
        }
        wb wb2 = b2.\u00d8\u00f80000();
        ib ib2 = wb2 instanceof ib ? (ib)wb2 : null;
        if (ib2 == null) {
            return null;
        }
        wb2 = ib2;
        if (ib2.\u00d5\u00f80000().super()) {
            return null;
        }
        wb wb3 = wb2;
        wb2 = b2.O\u00f4o000();
        qb qb2 = wb2 instanceof qb ? (qb)wb2 : null;
        if (qb2 == null) {
            return null;
        }
        return h.o00000(o2, (ib)wb3, e.super(qb2, false, false, 3, null));
    }

    public static final String super(ib ib2) {
        d d2 = f.\u00f500000.o00000(b.t.c.b.b.o.f.b.\u00d800000(ib2).\u00d800000());
        if (d2 != null) {
            return b.\u00d200000(d2);
        }
        return fb.o00000(ib2, null, 2, null);
    }

    private static final void super(StringBuilder stringBuilder, rc rc2) {
        stringBuilder.append(e.super(rc2));
    }

    public static final z super(rc rc2) {
        return (z)fb.o00000(rc2, u.o00000, m.\u00f6O0000, cb.super, null, null, 32, null);
    }
}

