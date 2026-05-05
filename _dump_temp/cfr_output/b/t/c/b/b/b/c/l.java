/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.c;

import b.m;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.lb;
import b.t.c.b.b.h.lb$_b;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ib;
import java.util.ArrayList;
import java.util.List;

public final class l {
    public static final lb o00000(ib iterator, ib object) {
        Iterable iterable;
        Object object2;
        boolean bl;
        boolean bl2 = bl = iterator.\u00d8\u00d6o000().size() == object.\u00d8\u00d6o000().size();
        if (m.new && !bl) {
            iterator = iterator + " and " + object + " should have same number of type parameters, but " + iterator.\u00d8\u00d6o000().size() + " / " + object.\u00d8\u00d6o000().size() + " found";
            throw new AssertionError(iterator);
        }
        Iterable iterable2 = iterator.\u00d8\u00d6o000();
        lb$_b lb$_b = lb.\u00d200000;
        iterator = iterable2;
        iterable2 = new ArrayList(mc.o00000(iterable2, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object2 = (i)object2;
            iterable = iterable2;
            iterable.add(object2.\u00d3OO000());
        }
        Iterable iterable3 = (List)iterable2;
        iterable2 = object.\u00d8\u00d6o000();
        iterable = iterable3;
        iterator = iterable2;
        iterable2 = new ArrayList(mc.o00000(iterable2, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object2 = iterator.next();
            object2 = (i)object2;
            object = iterable2;
            object.add(b.class((rc)object2.nullint()));
        }
        object = (List)iterable2;
        return lb$_b.o00000(lb$_b, y.o00000(mc.\u00d300000(iterable, (Iterable)object)), false, 2, null);
    }
}

