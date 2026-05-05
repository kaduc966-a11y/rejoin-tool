/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.s.mc;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.u;
import java.util.ArrayList;
import java.util.List;

public final class r {
    private static final u o00000 = new u("KotlinTypeRefiner");

    public static final List o00000(b b2, Iterable iterable) {
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (rc)object2;
            Iterable iterable2 = iterable;
            iterable2.add(b2.\u00d200000((q)object2));
        }
        return (List)iterable;
    }

    public static final u o00000() {
        return o00000;
    }
}

