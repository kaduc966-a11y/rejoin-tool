/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.s.mc;
import b.t.c.b.b.c.b.b.f;
import b.t.c.b.b.c.lb;
import java.util.ArrayList;
import java.util.List;

public final class y
implements lb {
    private final List String = new ArrayList();
    private final List o00000 = new ArrayList();
    private final List \u00d300000 = new ArrayList(0);
    private final List \u00d200000;

    public y() {
        Iterable iterable = f.o00000.Object();
        y y2 = this;
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (f)object2;
            Iterable iterable2 = iterable;
            iterable2.add(object2.\u00f500000());
        }
        y2.\u00d200000 = (List)iterable;
    }

    @Override
    public final List \u00d200000() {
        return this.String;
    }

    @Override
    public final List Object() {
        return this.o00000;
    }

    @Override
    public final List o00000() {
        return this.\u00d300000;
    }

    public final List \u00d400000() {
        return this.\u00d200000;
    }
}

