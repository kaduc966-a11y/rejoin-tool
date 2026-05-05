/*
 * Decompiled with CFR 0.152.
 */
package b.t.b;

import b.qd;
import b.t.b.b;
import b.t.b.g$_b;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.mb;
import b.t.c.b.b.h.ob;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.kb;
import b.t.c.b.c.c;
import b.t.c.b.lb;
import b.t.c.b.mc;
import b.t.c.b.r;
import b.t.l;
import b.t.q;
import b.t.v;
import java.util.ArrayList;
import java.util.List;

public final class g {
    public static final c o00000(v object, List list, boolean bl) {
        kb kb2;
        Object object2 = object;
        if (object2 instanceof r) {
            kb2 = ((r)object).\u00d5\u00d2o000();
        } else if (object2 instanceof mc) {
            kb2 = ((mc)object).nullObjectsuper();
        } else {
            throw new lb("Cannot create type for an unsupported classifier: " + object + " (" + object.getClass() + ')');
        }
        object = kb2;
        b.super(kb2.\u00d3OO000().\u00f5OO000().size(), list.size());
        return new c(g.o00000(object.\u00d3OO000(), list, bl), null, 2, null);
    }

    private static final ib o00000(bc object, List iterator, boolean bl) {
        Object object2;
        List list = object.\u00f5OO000();
        bc bc2 = object;
        object = (Iterable)((Object)iterator);
        bc bc3 = bc2;
        zb zb2 = zb.ifreturnclass.Object();
        iterator = object;
        object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
        int n2 = 0;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            mb mb2;
            int n3;
            Object object3 = iterator.next();
            if ((n3 = n2++) < 0) {
                b.s.mc.\u00d800000();
            }
            object3 = (q)object3;
            object2 = object;
            c c2 = (c)((q)object3).o00000();
            rc rc2 = c2 != null ? c2.\u00f8\u00d8\u00d2000() : null;
            l l2 = ((q)object3).new();
            switch (l2 == null ? -1 : g$_b.o00000[l2.ordinal()]) {
                case 1: {
                    mb2 = new lc(w.\u00d400000, rc2);
                    break;
                }
                case 2: {
                    mb2 = new lc(w.o00000, rc2);
                    break;
                }
                case 3: {
                    mb2 = new lc(w.return, rc2);
                    break;
                }
                case -1: {
                    mb2 = new ob((i)list.get(n3));
                    break;
                }
                default: {
                    throw new qd();
                }
            }
            object2.add(mb2);
        }
        object2 = (List)object;
        return oc.o00000(zb2, bc3, (List)object2, bl, null, 16, null);
    }
}

