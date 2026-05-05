/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.qd;
import b.s.mc;
import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.bb;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.c.x;
import b.t.c.b.b.h.e.d;
import b.t.c.b.b.h.e.g$_c$1;
import b.t.c.b.b.h.e.j;
import b.t.c.b.b.h.f;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.jc;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.pc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.o.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class g
extends bb {
    private final ib o00000(ib ib2) {
        Object object = ib2.thisdosuper();
        if (object instanceof b.t.c.b.b.o.d.b.b) {
            hc hc2 = ((b.t.c.b.b.o.d.b.b)object).\u00f5\u00d2O000();
            Object object2 = hc2.\u00d200000() == w.o00000 ? hc2 : null;
            Object object3 = object2 != null && (object2 = object2.\u00d300000()) != null ? ((rc)object2).\u00d8\u00d6\u00d2000() : (hc2 = null);
            if (((b.t.c.b.b.o.d.b.b)object).O\u00d3O000() == null) {
                Iterable<l> iterable;
                Iterable iterable2 = ((b.t.c.b.b.o.d.b.b)object).\u00d5OO000();
                hc hc3 = ((b.t.c.b.b.o.d.b.b)object).\u00f5\u00d2O000();
                b.t.c.b.b.o.d.b.b b2 = (b.t.c.b.b.o.d.b.b)object;
                Object object4 = iterable2;
                iterable2 = new ArrayList(mc.o00000(iterable2, 10));
                object4 = object4.iterator();
                while (object4.hasNext()) {
                    Object object5 = object4.next();
                    object5 = (rc)object5;
                    iterable = iterable2;
                    iterable.add(((rc)object5).\u00d8\u00d6\u00d2000());
                }
                iterable = (List)iterable2;
                iterable2 = iterable;
                object4 = hc3;
                b2.\u00d300000(new d((hc)object4, (List)iterable2, null, 4, null));
            }
            return new j(x.\u00d300000, ((b.t.c.b.b.o.d.b.b)object).O\u00d3O000(), (l)((Object)hc2), ib2.\u00d5\u00d6\u00d2000(), ib2.\u00f5\u00d6\u00d2000(), false, 32, null);
        }
        if (object instanceof i) {
            Iterable iterable = ((i)object).\u00d5OO000();
            Object object6 = iterable;
            iterable = new ArrayList(mc.o00000(iterable, 10));
            object6 = object6.iterator();
            while (object6.hasNext()) {
                Object object7 = object6.next();
                object7 = (rc)object7;
                object = iterable;
                object.add(o.o00000(object7, ib2.\u00f5\u00d6\u00d2000()));
            }
            object = (List)iterable;
            pc pc2 = new pc((Collection)object);
            return oc.o00000(ib2.\u00d5\u00d6\u00d2000(), (bc)pc2, mc.\u00d500000(), false, ib2.\u00f4\u00d6\u00d2000());
        }
        if (object instanceof pc && ib2.\u00f5\u00d6\u00d2000()) {
            pc pc3;
            pc pc4;
            Collection<rc> collection;
            Object object8;
            pc pc5 = (pc)object;
            boolean bl = false;
            Object object9 = object8 = (Iterable)pc5.\u00d5OO000();
            Collection collection2 = new ArrayList(mc.o00000((Iterable)object8, 10));
            object8 = object9.iterator();
            while (object8.hasNext()) {
                Object e2 = object8.next();
                object9 = (rc)e2;
                collection = collection2;
                bl = true;
                collection.add(b.int((rc)object9));
            }
            collection = (List)collection2;
            if (!bl) {
                pc4 = null;
            } else {
                rc rc2 = pc5.O\u00d2O000();
                object8 = rc2 != null ? b.int(rc2) : null;
                pc4 = pc3 = new pc(collection).\u00d300000((rc)object8);
            }
            if (pc4 == null) {
                pc3 = (pc)object;
            }
            return pc3.whileif();
        }
        return ib2;
    }

    public l \u00d200000(q q2) {
        q q3;
        if (!(q2 instanceof rc)) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        q2 = ((rc)q2).\u00d8\u00d6\u00d2000();
        l l2 = q2;
        if (q2 instanceof ib) {
            q3 = this.o00000((ib)q2);
        } else if (l2 instanceof f) {
            l2 = this.o00000(((f)q2).\u00f4\u00f4\u00d2000());
            ib ib2 = this.o00000(((f)q2).\u00d8\u00f4\u00d2000());
            q3 = l2 != ((f)q2).\u00f4\u00f4\u00d2000() || ib2 != ((f)q2).\u00d8\u00f4\u00d2000() ? oc.o00000((ib)l2, ib2) : q2;
        } else {
            throw new qd();
        }
        return jc.o00000(q3, (rc)q2, new g$_c$1(this));
    }
}

