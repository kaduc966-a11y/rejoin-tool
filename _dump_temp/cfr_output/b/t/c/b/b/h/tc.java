/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.s.mc;
import b.t.c.b.b.b.c;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.tc$_b$1;
import b.t.c.b.b.h.w;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.k;
import java.util.ArrayList;
import java.util.List;

public final class tc {
    private static final rc o00000(List list, List list2, c c2) {
        rc rc2 = kc.o00000(new tc$_b$1(list)).o00000((rc)mc.Oo0000(list2), w.return);
        if (rc2 == null) {
            rc2 = c2.\u00f5O0000();
        }
        return rc2;
    }

    public static final rc o00000(i i2) {
        Object object = i2.\u00d8\u00f80000();
        if (object instanceof k) {
            Object object2 = object = (Iterable)((k)object).\u00d3OO000().\u00f5OO000();
            object = new ArrayList(mc.o00000((Iterable)object, 10));
            object2 = object2.iterator();
            while (object2.hasNext()) {
                Object object3 = object2.next();
                object3 = (i)object3;
                Object object4 = object;
                object4.add(object3.\u00d3OO000());
            }
            return tc.o00000((List)object, i2.\u00d8\u00d5o000(), b.null(i2));
        }
        if (object instanceof ic) {
            Object object5 = object = (Iterable)((ic)object).\u00f8\u00d8o000();
            object = new ArrayList(mc.o00000((Iterable)object, 10));
            object5 = object5.iterator();
            while (object5.hasNext()) {
                Object object6 = object5.next();
                object6 = (i)object6;
                Object object7 = object;
                object7.add(object6.\u00d3OO000());
            }
            return tc.o00000((List)object, i2.\u00d8\u00d5o000(), b.null(i2));
        }
        throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
    }
}

