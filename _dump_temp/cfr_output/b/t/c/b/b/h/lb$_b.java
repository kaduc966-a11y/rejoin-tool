/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.w;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.h;
import b.t.c.b.b.h.lb;
import b.t.c.b.b.h.lb$_b$_b$1;
import b.t.c.b.b.h.qb;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class lb$_b {
    private lb$_b() {
    }

    public final lb o00000(Map map, boolean bl) {
        return new lb$_b$_b$1(map, bl);
    }

    public static /* synthetic */ lb o00000(lb$_b lb$_b, Map map, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return lb$_b.o00000(map, bl);
    }

    public final h o00000(rc rc2) {
        return this.o00000(rc2.thisdosuper(), rc2.\u00d4\u00d6\u00d2000());
    }

    public final h o00000(bc object, List list) {
        Iterator iterator = object.\u00f5OO000();
        i i2 = (i)mc.\u00f4O0000((List)((Object)iterator));
        boolean bl = i2 != null ? i2.\u00d5\u00d5o000() : false;
        if (bl) {
            object = object.\u00f5OO000();
            lb$_b lb$_b = this;
            iterator = object;
            object = new ArrayList(mc.o00000((Iterable)object, 10));
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object object2 = iterator.next();
                object2 = (i)object2;
                Object object3 = object;
                object3.add(object2.\u00d3OO000());
            }
            return lb$_b.o00000(lb$_b, y.o00000(mc.\u00d300000((Iterable)((List)object), (Iterable)list)), false, 2, null);
        }
        return new qb((List)((Object)iterator), list);
    }

    public final lb o00000(Map map) {
        return lb$_b.o00000(this, map, false, 2, null);
    }

    public /* synthetic */ lb$_b(w w2) {
        this();
    }
}

