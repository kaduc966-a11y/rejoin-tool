/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.t.c.b.b.o.n;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.vb;
import b.t.c.b.b.q.wb;
import java.util.Comparator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class p$_b
implements Comparator {
    public static final p$_b super = new p$_b();

    private p$_b() {
    }

    private static int super(wb wb2) {
        if (n.\u00f4O0000(wb2)) {
            return 8;
        }
        if (wb2 instanceof vb) {
            return 7;
        }
        if (wb2 instanceof pb) {
            if (((pb)wb2).nullclasssuper() == null) {
                return 6;
            }
            return 5;
        }
        if (wb2 instanceof ic) {
            if (((ic)wb2).nullclasssuper() == null) {
                return 4;
            }
            return 3;
        }
        if (wb2 instanceof ib) {
            return 2;
        }
        if (wb2 instanceof h) {
            return 1;
        }
        return 0;
    }

    public int super(wb object, wb wb2) {
        if ((object = p$_b.\u00d300000((wb)object, wb2)) != null) {
            return (Integer)object;
        }
        return 0;
    }

    private static Integer \u00d300000(wb wb2, wb wb3) {
        int n2 = p$_b.super(wb3) - p$_b.super(wb2);
        if (n2 != 0) {
            return n2;
        }
        if (n.\u00f4O0000(wb2) && n.\u00f4O0000(wb3)) {
            return 0;
        }
        int n3 = wb2.\u00d5\u00f80000().super(wb3.\u00d5\u00f80000());
        if (n3 != 0) {
            return n3;
        }
        return null;
    }

    static /* synthetic */ Integer \u00d200000(wb wb2, wb wb3) {
        return p$_b.\u00d300000(wb2, wb3);
    }
}

