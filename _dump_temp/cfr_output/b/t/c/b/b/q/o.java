/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.o.d.w;
import b.o.e.g;
import b.qb;
import b.qd;
import b.s.mc;
import b.t.c.b.b.d.f;
import b.t.c.b.b.h.c.j;
import b.t.c.b.b.q.hb;
import b.t.c.b.b.q.xb;
import b.yc;
import java.util.ArrayList;
import java.util.List;

public abstract class o {
    private o() {
    }

    public final o o00000(g object) {
        Object object2 = this;
        if (object2 instanceof xb) {
            return new xb(((xb)this).\u00d200000(), (j)object.\u00f800000(((xb)this).\u00d300000()));
        }
        if (object2 instanceof hb) {
            Object object3 = object2 = (Iterable)((hb)this).o00000();
            object2 = new ArrayList(mc.o00000((Iterable)object2, 10));
            object3 = object3.iterator();
            while (object3.hasNext()) {
                Object object4 = object3.next();
                object4 = (qb)object4;
                Object object5 = object2;
                f f2 = (f)((qb)object4).\u00d400000();
                object4 = (j)((qb)object4).\u00d300000();
                object5.add(yc.o00000(f2, object.\u00f800000(object4)));
            }
            object = (List)object2;
            return new hb((List)object);
        }
        throw new qd();
    }

    public /* synthetic */ o(w w2) {
        this();
    }
}

