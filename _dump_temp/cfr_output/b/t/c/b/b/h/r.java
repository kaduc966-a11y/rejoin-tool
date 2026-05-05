/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.qd;
import b.t.c.b.b.h.d;
import b.t.c.b.b.h.d.e;
import b.t.c.b.b.h.f;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.q.e.b;
import b.t.c.b.b.q.e.o;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class r {
    public static final rc super(rc rc2, List list, o g2, List list2) {
        if ((list.isEmpty() || list == rc2.\u00d4\u00d6\u00d2000()) && g2 == rc2.\u00d4\u00f80000()) {
            return rc2;
        }
        g2 = d.super(rc2.\u00d5\u00d6\u00d2000(), g2 instanceof b && ((b)g2).\u00d5\u00f4\u00d3000() ? o.\u00d8o\u00f6000.o00000() : g2);
        if ((rc2 = rc2.\u00d8\u00d6\u00d2000()) instanceof f) {
            return oc.o00000(r.super(((f)rc2).\u00f4\u00f4\u00d2000(), list, (zb)g2), r.super(((f)rc2).\u00d8\u00f4\u00d2000(), list2, (zb)g2));
        }
        if (rc2 instanceof ib) {
            return r.super((ib)rc2, list, (zb)g2);
        }
        throw new qd();
    }

    public static /* synthetic */ rc super(rc rc2, List list, o o2, List list2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            list = rc2.\u00d4\u00d6\u00d2000();
        }
        if ((n2 & 2) != 0) {
            o2 = rc2.\u00d4\u00f80000();
        }
        if ((n2 & 4) != 0) {
            list2 = list;
        }
        return r.super(rc2, list, o2, list2);
    }

    public static final ib super(ib ib2, List list, zb zb2) {
        if (list.isEmpty() && zb2 == ib2.\u00d5\u00d6\u00d2000()) {
            return ib2;
        }
        if (list.isEmpty()) {
            return ib2.new(zb2);
        }
        if (ib2 instanceof e) {
            return ((e)ib2).\u00d3O0000(list);
        }
        return oc.o00000(zb2, ib2.thisdosuper(), list, ib2.\u00f5\u00d6\u00d2000(), null, 16, null);
    }

    public static /* synthetic */ ib super(ib ib2, List list, zb zb2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            list = ib2.\u00d4\u00d6\u00d2000();
        }
        if ((n2 & 2) != 0) {
            zb2 = ib2.\u00d5\u00d6\u00d2000();
        }
        return r.super(ib2, list, zb2);
    }

    public static final ib super(rc rc2) {
        l l2 = rc2.\u00d8\u00d6\u00d2000();
        ib ib2 = l2 instanceof ib ? (ib)l2 : null;
        if (ib2 == null) {
            throw new IllegalStateException("This is should be simple type: ".concat(String.valueOf(rc2)).toString());
        }
        return ib2;
    }

    public static final rc super(rc rc2, List list, o o2) {
        return r.super(rc2, list, o2, null, 4, null);
    }
}

