/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.j.b.e;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.qb;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class l
implements f {
    @Override
    public kb \u00d200000(b.t.c.b.b.d.f f2, e e2) {
        return null;
    }

    @Override
    public Collection \u00d400000(b.t.c.b.b.d.f f2, e e2) {
        return mc.\u00d500000();
    }

    @Override
    public Collection \u00d300000(b.t.c.b.b.d.f f2, e e2) {
        return mc.\u00d500000();
    }

    @Override
    public Collection super(j j2, g g2) {
        return mc.\u00d500000();
    }

    @Override
    public Set super() {
        Object object = this.super(j.\u00f6O0000, b.t.c.b.b.m.f.\u00d200000());
        Collection collection = new LinkedHashSet();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            if (!(object2 instanceof qb)) continue;
            object2 = (qb)object2;
            Collection collection2 = collection;
            collection2.add(object2.\u00d5\u00f80000());
        }
        return (Set)collection;
    }

    @Override
    public Set \u00d300000() {
        Object object = this.super(j.\u00d2O0000, b.t.c.b.b.m.f.\u00d200000());
        Collection collection = new LinkedHashSet();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            if (!(object2 instanceof qb)) continue;
            object2 = (qb)object2;
            Collection collection2 = collection;
            collection2.add(object2.\u00d5\u00f80000());
        }
        return (Set)collection;
    }

    @Override
    public Set \u00d200000() {
        return null;
    }
}

