/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.o.d.w;
import b.qd;
import b.s.mc;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.c.r;
import b.t.c.b.b.o.c.r$_c$_b;
import b.t.c.b.b.o.c.r$_c$_c;
import java.util.Collection;
import java.util.Set;

public final class r$_c {
    private r$_c() {
    }

    public final ib o00000(Collection collection) {
        return this.o00000(collection, r$_c$_b.o00000);
    }

    private final ib o00000(Collection object, r$_c$_b r$_c$_b) {
        if (object.isEmpty()) {
            return null;
        }
        if (!(object = ((Iterable)object).iterator()).hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object object2 = object.next();
        while (object.hasNext()) {
            Object e2 = object2;
            object2 = (ib)object.next();
            ib ib2 = (ib)e2;
            object2 = r.O\u00f6o000.o00000(ib2, (ib)object2, r$_c$_b);
        }
        return (ib)object2;
    }

    private final ib o00000(ib ib2, ib ib3, r$_c$_b r$_c$_b) {
        if (ib2 == null || ib3 == null) {
            return null;
        }
        bc bc2 = ib2.thisdosuper();
        bc bc3 = ib3.thisdosuper();
        if (bc2 instanceof r && bc3 instanceof r) {
            return this.o00000((r)bc2, (r)bc3, r$_c$_b);
        }
        if (bc2 instanceof r) {
            return this.o00000((r)bc2, ib3);
        }
        if (bc3 instanceof r) {
            return this.o00000((r)bc3, ib2);
        }
        return null;
    }

    private final ib o00000(r r2, r object, r$_c$_b r$_c$_b) {
        Set set;
        switch (r$_c$_c.o00000[r$_c$_b.ordinal()]) {
            case 1: {
                set = mc.\u00d500000((Iterable)r2.thisfloat(), ((r)object).thisfloat());
                break;
            }
            case 2: {
                set = mc.new((Iterable)r2.thisfloat(), (Iterable)((r)object).thisfloat());
                break;
            }
            default: {
                throw new qd();
            }
        }
        object = set;
        r2 = new r(r.\u00d400000(r2), r.o00000(r2), (Set)object, null);
        return oc.o00000(zb.ifreturnclass.Object(), r2, false);
    }

    private final ib o00000(r r2, ib ib2) {
        if (r2.thisfloat().contains(ib2)) {
            return ib2;
        }
        return null;
    }

    public /* synthetic */ r$_c(w w2) {
        this();
    }
}

