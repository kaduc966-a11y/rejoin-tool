/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.w;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.h.i;
import b.t.c.b.b.q.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class i$_b {
    private i$_b() {
    }

    public final i o00000(i i2, h h2, List list) {
        Object object;
        Object object2 = object = (Iterable)h2.\u00d3OO000().\u00f5OO000();
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (b.t.c.b.b.q.i)object3;
            Iterable iterable = object;
            iterable.add(object3.forObjectsuper());
        }
        object = y.o00000(mc.\u00d300000((Iterable)((List)object), (Iterable)list));
        return new i(i2, h2, list, (Map)object, null);
    }

    public /* synthetic */ i$_b(w w2) {
        this();
    }
}

