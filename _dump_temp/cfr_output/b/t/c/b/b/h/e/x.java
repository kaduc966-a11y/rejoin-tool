/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.qd;
import b.s.mc;
import b.t.c.b.b.h.ac;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.e.h;
import b.t.c.b.b.h.f;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class x {
    public static final l o00000(Collection iterable) {
        Object object;
        l l2;
        Object object2;
        switch (iterable.size()) {
            case 0: {
                throw new IllegalStateException("Expected some types".toString());
            }
            case 1: {
                return (l)mc.thisObject(iterable);
            }
        }
        boolean bl = false;
        boolean bl2 = false;
        Object object3 = (String[])iterable;
        Object object4 = object3;
        object3 = new ArrayList(mc.o00000((Iterable)object3, 10));
        object4 = object4.iterator();
        while (object4.hasNext()) {
            ib ib2;
            object2 = object4.next();
            l2 = (l)object2;
            object = object3;
            bl2 = bl2 || hb.super(l2);
            object2 = l2;
            if (object2 instanceof ib) {
                ib2 = (ib)l2;
            } else if (object2 instanceof f) {
                if (ac.o00000(l2)) {
                    return l2;
                }
                bl = true;
                ib2 = ((f)l2).\u00f4\u00f4\u00d2000();
            } else {
                throw new qd();
            }
            object.add(ib2);
        }
        object4 = (List)object3;
        if (bl2) {
            String[] stringArray = new String[1];
            object3 = stringArray;
            stringArray[0] = iterable.toString();
            return k.new(c.\u00f8\u00d50000, object3);
        }
        if (!bl) {
            return h.o00000.super((List)object4);
        }
        iterable = iterable;
        object3 = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object2 = object3.iterator();
        while (object2.hasNext()) {
            l l3 = l2 = object2.next();
            object = iterable;
            object.add(q.o00000(l3));
        }
        object3 = (List)iterable;
        return oc.o00000(h.o00000.super((List)object4), h.o00000.super((List)object3));
    }
}

