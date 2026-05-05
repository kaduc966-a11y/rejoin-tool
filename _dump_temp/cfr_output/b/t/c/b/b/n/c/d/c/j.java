/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.c;

import b.s.mc;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.t;
import b.t.c.b.b.h.w;
import b.t.c.b.b.n.c.b.ab;
import b.t.c.b.b.n.c.b.c;
import b.t.c.b.b.n.c.b.r;
import b.t.c.b.b.n.c.d.b.f;
import b.t.c.b.b.n.c.d.h;
import b.t.c.b.b.n.c.d.i;
import b.t.c.b.b.q.b.u;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j
extends u {
    private final i \u00d8\u00f5\u00d5000;
    private final ab thisclassObject;

    public j(i i2, ab ab2, int n2, wb wb2) {
        super(i2.return(), wb2, new h(i2, ab2, false, 4, null), ab2.oO0000(), w.\u00d400000, false, n2, g.o00000, i2.\u00d500000().\u00d600000());
        this.\u00d8\u00f5\u00d5000 = i2;
        this.thisclassObject = ab2;
    }

    @Override
    public final List \u00f8\u00d5o000() {
        return this.returnStringsuper();
    }

    private final List returnStringsuper() {
        Iterable<rc> iterable = this.thisclassObject.thissuper();
        if (iterable.isEmpty()) {
            return mc.o00000(oc.o00000(this.\u00d8\u00f5\u00d5000.\u00d300000().returnforsuper().oO0000(), this.\u00d8\u00f5\u00d5000.\u00d300000().returnforsuper().\u00f800000()));
        }
        iterable = iterable;
        Object object = iterable;
        iterable = new ArrayList(mc.o00000((Iterable)iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (c)object2;
            Iterable<rc> iterable2 = iterable;
            iterable2.add(this.\u00d8\u00f5\u00d5000.\u00d800000().o00000((r)object2, f.o00000(t.\u00d200000, false, false, this, 3, null)));
        }
        return (List)iterable;
    }

    @Override
    public final List if(List list) {
        return this.\u00d8\u00f5\u00d5000.\u00d500000().oO0000().o00000(this, list, this.\u00d8\u00f5\u00d5000);
    }

    @Override
    public final void \u00f400000(rc rc2) {
    }
}

