/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.s.mc;
import b.t.c.b.b.h.e.j;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.pc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.sb;
import b.t.c.b.b.h.sb$_b;
import b.t.c.b.b.h.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class s {
    public static final x o00000(rc rc2) {
        if ((rc2 = rc2.\u00d8\u00d6\u00d2000()) instanceof x) {
            return (x)rc2;
        }
        return null;
    }

    public static final ib \u00d300000(rc rc2) {
        x x2 = s.o00000(rc2);
        if (x2 != null) {
            return x2.\u00d4\u00f4\u00d2000();
        }
        return null;
    }

    public static final ib o00000(ib ib2, ib ib3) {
        if (hb.super(ib2)) {
            return ib2;
        }
        return new x(ib2, ib3);
    }

    public static final boolean \u00d200000(rc rc2) {
        return rc2.\u00d8\u00d6\u00d2000() instanceof sb;
    }

    public static final ib o00000(ib ib2, boolean bl) {
        sb sb2 = sb$_b.o00000(sb.\u00f5\u00f5\u00d8000, ib2, bl, false, 4, null);
        if (sb2 != null) {
            return sb2;
        }
        ib ib3 = s.String(ib2);
        if (ib3 == null) {
            ib3 = ib2.\u00d4o0000(false);
        }
        return ib3;
    }

    public static /* synthetic */ ib o00000(ib ib2, boolean bl, int n2, Object object) {
        if ((n2 & 1) != 0) {
            bl = false;
        }
        return s.o00000(ib2, bl);
    }

    public static final j o00000(j j2) {
        return new j(j2.\u00f4\u00f5\u00d2000(), j2.\u00d8\u00f5\u00d2000(), j2.\u00d5\u00f5\u00d2000(), ((rc)j2).\u00d5\u00d6\u00d2000(), ((rc)j2).\u00f5\u00d6\u00d2000(), true);
    }

    public static final l o00000(l l2, boolean bl) {
        sb sb2 = sb$_b.o00000(sb.\u00f5\u00f5\u00d8000, l2, bl, false, 4, null);
        if (sb2 != null) {
            return sb2;
        }
        ib ib2 = s.String(l2);
        if (ib2 != null) {
            return ib2;
        }
        return l2.oo0000(false);
    }

    public static /* synthetic */ l o00000(l l2, boolean bl, int n2, Object object) {
        if ((n2 & 1) != 0) {
            bl = false;
        }
        return s.o00000(l2, bl);
    }

    private static final ib String(rc object) {
        pc pc2 = (object = ((rc)object).thisdosuper()) instanceof pc ? (pc)object : null;
        if (pc2 == null) {
            return null;
        }
        pc pc3 = s.o00000(pc2);
        if (pc3 == null) {
            return null;
        }
        return pc3.whileif();
    }

    private static final pc o00000(pc pc2) {
        Object object;
        Object object2;
        boolean bl = false;
        Object object3 = object2 = (Iterable)pc2.\u00d5OO000();
        object2 = new ArrayList(mc.o00000((Iterable)object2, 10));
        object3 = object3.iterator();
        while (object3.hasNext()) {
            Object object4;
            Object object5 = object3.next();
            object5 = (rc)object5;
            Iterable iterable = object2;
            if (o.\u00d600000(object5)) {
                bl = true;
                object4 = s.o00000(((rc)object5).\u00d8\u00d6\u00d2000(), false, 1, null);
            } else {
                object4 = object5;
            }
            iterable.add(object4);
        }
        object3 = (List)object2;
        if (!bl) {
            return null;
        }
        rc rc2 = pc2.O\u00d2O000();
        if (rc2 != null) {
            object2 = rc2;
            object = o.\u00d600000(rc2) ? (rc)s.o00000(((rc)object2).\u00d8\u00d6\u00d2000(), false, 1, null) : object2;
        } else {
            object = null;
        }
        object2 = object;
        return new pc((Collection)object3).\u00d300000((rc)object2);
    }
}

