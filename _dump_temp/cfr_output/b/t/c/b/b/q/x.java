/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.o.d.fc;
import b.t.c.b.b.d.k;
import b.t.c.b.b.g.h;
import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.j.b.e;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.e.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.wb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x {
    public static final ib o00000(bc object, k k2, e e2) {
        if (k2.\u00d600000()) {
            return null;
        }
        kb kb2 = object.new(k2.\u00d300000()).\u00f8\u00f80000().\u00d200000(k2.\u00d400000(), e2);
        kb2 = kb2 instanceof ib ? (ib)kb2 : null;
        if (kb2 != null) {
            return kb2;
        }
        kb2 = x.o00000((bc)object, k2.\u00d300000(), e2);
        kb2 = kb2 != null && (object = kb2.\u00d3o\u00d2000()) != null ? object.\u00d200000(k2.\u00d400000(), e2) : null;
        if (kb2 instanceof ib) {
            return (ib)kb2;
        }
        return null;
    }

    public static final boolean new(wb wb2) {
        return wb2.\u00d8\u00f80000() instanceof lc;
    }

    public static final kb o00000(wb wb2) {
        wb wb3;
        while (true) {
            if ((wb3 = wb2.\u00d8\u00f80000()) == null || wb2 instanceof lc) {
                return null;
            }
            if (x.new(wb3)) break;
            wb2 = wb3;
        }
        if (wb3 instanceof kb) {
            return (kb)wb3;
        }
        return null;
    }

    public static final boolean o00000(ic ic2) {
        i i2;
        wb wb2;
        block5: {
            block4: {
                wb2 = ic2.\u00d8\u00f80000();
                i2 = wb2 instanceof ib ? (ib)wb2 : null;
                if (i2 == null) break block4;
                wb2 = i2;
                if ((i2 = b.t.c.b.b.o.b.new(i2) ? wb2 : null) != null && (i2 = i2.nullint()) != null && (i2 = b.\u00d600000((rc)i2)) != null) break block5;
            }
            return false;
        }
        wb2 = i2;
        rc rc2 = ic2.\u00d3\u00f4o000();
        if (rc2 == null) {
            return false;
        }
        rc rc3 = rc2;
        return fc.o00000((Object)ic2.\u00d5\u00f80000(), (Object)h.\u00f500000) && (b.\u00f600000(rc3) || b.do(rc3)) && ic2.\u00f5\u00d8o000().size() == 1 && fc.o00000((Object)b.\u00d600000(((jc)ic2.\u00f5\u00d8o000().get(0)).forclasssuper()), (Object)wb2) && ic2.\u00d4\u00f4o000().isEmpty() && ic2.nullclasssuper() == null;
    }
}

