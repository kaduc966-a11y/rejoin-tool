/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.dc;
import b.t.c.b.b.h.kb;
import b.t.c.b.b.h.qc;
import b.t.c.b.b.h.yc$_b;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.q.e.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d {
    public static final zb super(o o2) {
        return yc$_b.o00000(dc.o00000, o2, null, null, 6, null);
    }

    public static final zb super(zb object, o o2) {
        kb kb2;
        if (qc.\u00d200000((zb)object) == o2) {
            return object;
        }
        Object object2 = qc.o00000((zb)object);
        if (object2 == null || (object2 = ((zb)object).o00000(kb2 = object2)) == null) {
            object2 = object = object;
        }
        if (!o2.iterator().hasNext() && o2.\u00d5\u00f4\u00d3000()) {
            return object;
        }
        return ((zb)object).new(new kb(o2));
    }
}

