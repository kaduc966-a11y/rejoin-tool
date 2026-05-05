/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.m;
import b.s.mc;
import b.t.c.b.b.b.c;
import b.t.c.b.b.b.d;
import b.t.c.b.b.b.g;
import b.t.c.b.b.d.f;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.db;
import b.t.c.b.b.q.b.h;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.ec;
import b.t.c.b.b.q.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    private static final h o00000;

    public static final ib super(rc object) {
        Iterable<rc> iterable;
        boolean bl = g.o00000((rc)object);
        if (m.new && !bl) {
            object = "This type should be suspend function type: ".concat(String.valueOf(object));
            throw new AssertionError(object);
        }
        Iterable iterable2 = g.return((rc)object);
        List list = g.\u00d500000((rc)object);
        rc rc2 = g.\u00d800000((rc)object);
        o o2 = ((rc)object).\u00d4\u00f80000();
        c c2 = b.t.c.b.b.h.b.b.\u00d400000((rc)object);
        Object object2 = iterable2;
        iterable2 = new ArrayList(mc.o00000(iterable2, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (hc)object3;
            iterable = iterable2;
            iterable.add(object3.\u00d300000());
        }
        iterable = (List)iterable2;
        return g.o00000(c2, o2, rc2, list, mc.\u00d500000((Collection)iterable, (Object)oc.o00000(zb.ifreturnclass.Object(), o00000.\u00d3OO000(), mc.o00000(b.t.c.b.b.h.b.b.class(g.\u00f800000((rc)object))), false, null, 16, null)), null, b.t.c.b.b.h.b.b.\u00d400000((rc)object).\u00f800000(), false, 128, null).\u00d4o0000(((rc)object).\u00f5\u00d6\u00d2000());
    }

    static {
        h h2;
        h h3 = h2 = new h(new db(k.\u00d400000.\u00d400000(), d.privatesuper), ec.\u00d600000, false, false, d.\u00d300000.\u00d400000(), b.t.c.b.b.q.g.o00000, b.t.c.b.b.i.h.\u00d500000);
        h2.o00000(ab.\u00d400000);
        h3.\u00d400000(eb.\u00d200000);
        h h4 = h3;
        i i2 = b.t.c.b.b.q.b.m.o00000(h4, o.\u00d8o\u00f6000.o00000(), false, w.o00000, f.\u00d300000("T"), 0, b.t.c.b.b.i.h.\u00d500000);
        h h5 = h4;
        h5.oO0000(mc.o00000(i2));
        h3.nullfloatsuper();
        o00000 = h2;
    }
}

