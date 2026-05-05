/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.qb;
import b.s.mc;
import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.c.x;
import b.t.c.b.b.h.e.g$_b;
import b.t.c.b.b.h.e.j;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.lb;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.q.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class c {
    public static final ib o00000(ib ib2, x object) {
        List list = c.o00000((l)ib2, object);
        if (list != null) {
            object = list;
            return c.o00000((l)ib2, (List)object);
        }
        return null;
    }

    private static final ib o00000(l l2, List list) {
        return oc.o00000(l2.\u00d5\u00d6\u00d2000(), l2.thisdosuper(), list, l2.\u00f5\u00d6\u00d2000(), null, 16, null);
    }

    private static final List o00000(l l2, x object) {
        rc rc2;
        i i2;
        Object object2;
        Object object3;
        boolean bl;
        if (l2.\u00d4\u00d6\u00d2000().size() != l2.thisdosuper().\u00f5OO000().size()) {
            return null;
        }
        List list = l2.\u00d4\u00d6\u00d2000();
        Iterable iterable = list;
        if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                if (((hc)iterator.next()).\u00d200000() == w.\u00d400000) continue;
                bl = false;
                break;
            }
        } else {
            bl = true;
        }
        if (bl) {
            return null;
        }
        Object object4 = mc.\u00d300000((Iterable)list, (Iterable)l2.thisdosuper().\u00f5OO000());
        Iterable iterable2 = object4;
        Object object5 = new ArrayList(mc.o00000((Iterable)object4, 10));
        for (Object object6 : iterable2) {
            Object object7;
            object3 = (qb)object6;
            object2 = object5;
            object6 = (hc)((qb)object3).\u00d400000();
            i2 = (i)((qb)object3).\u00d300000();
            if (object6.\u00d200000() == w.\u00d400000) {
                object7 = object6;
            } else {
                rc2 = !object6.super() && object6.\u00d200000() == w.o00000 ? object6.\u00d300000().\u00d8\u00d6\u00d2000() : null;
                object7 = b.class((rc)new j((x)((Object)object), (l)rc2, (hc)object6, i2));
            }
            object2.add(object7);
        }
        iterable = (List)object5;
        object4 = lb.\u00d200000.o00000(l2.thisdosuper(), (List)iterable).\u00d400000();
        int n2 = ((Collection)list).size();
        for (int i3 = 0; i3 < n2; ++i3) {
            Object object6;
            object5 = (hc)list.get(i3);
            object = (hc)iterable.get(i3);
            if (object5.\u00d200000() == w.\u00d400000) continue;
            object6 = ((i)l2.thisdosuper().\u00f5OO000().get(i3)).\u00d8\u00d5o000();
            object3 = new ArrayList();
            object6 = object6.iterator();
            while (object6.hasNext()) {
                i2 = object6.next();
                rc2 = (rc)((Object)i2);
                object2 = object3;
                object2.add(g$_b.new.\u00d200000(((kc)object4).new(rc2, w.\u00d400000).\u00d8\u00d6\u00d2000()));
            }
            List list2 = (List)object3;
            if (!object5.super() && object5.\u00d200000() == w.return) {
                ((Collection)list2).add(g$_b.new.\u00d200000(object5.\u00d300000().\u00d8\u00d6\u00d2000()));
            }
            ((j)object.\u00d300000()).\u00d8\u00f5\u00d2000().return(list2);
        }
        return iterable;
    }
}

