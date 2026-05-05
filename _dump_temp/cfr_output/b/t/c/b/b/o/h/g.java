/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.h;

import b.s.mc;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.c.d.i;
import b.t.c.b.b.o.h.d;
import b.t.c.b.b.q.b.x;
import b.t.c.b.b.q.ib;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g
implements d {
    private final List new;

    public g(List list) {
        this.new = list;
    }

    @Override
    public final List \u00d200000(ib ib2, i i2) {
        Object object = this.new;
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Iterable iterable = ((d)object.next()).\u00d200000(ib2, i2);
            mc.new(collection, iterable);
        }
        return (List)collection;
    }

    @Override
    public final void \u00d200000(ib ib2, f f2, Collection collection, i i2) {
        Iterator iterator = ((Iterable)this.new).iterator();
        while (iterator.hasNext()) {
            ((d)iterator.next()).\u00d200000(ib2, f2, collection, i2);
        }
    }

    @Override
    public final List Object(ib ib2, i i2) {
        Object object = this.new;
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Iterable iterable = ((d)object.next()).Object(ib2, i2);
            mc.new(collection, iterable);
        }
        return (List)collection;
    }

    @Override
    public final void o00000(ib ib2, f f2, Collection collection, i i2) {
        Iterator iterator = ((Iterable)this.new).iterator();
        while (iterator.hasNext()) {
            ((d)iterator.next()).o00000(ib2, f2, collection, i2);
        }
    }

    @Override
    public final void o00000(ib ib2, List list, i i2) {
        Iterator iterator = ((Iterable)this.new).iterator();
        while (iterator.hasNext()) {
            ((d)iterator.next()).o00000(ib2, list, i2);
        }
    }

    @Override
    public final List o00000(ib ib2, i i2) {
        Object object = this.new;
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Iterable iterable = ((d)object.next()).o00000(ib2, i2);
            mc.new(collection, iterable);
        }
        return (List)collection;
    }

    @Override
    public final void o00000(ib ib2, f f2, List list, i i2) {
        Iterator iterator = ((Iterable)this.new).iterator();
        while (iterator.hasNext()) {
            ((d)iterator.next()).o00000(ib2, f2, list, i2);
        }
    }

    @Override
    public final x o00000(ib ib2, x object, i i2) {
        for (Object object2 : (Iterable)this.new) {
            x x2 = object;
            object = (d)object2;
            object2 = x2;
            object = object.o00000(ib2, (x)object2, i2);
        }
        return object;
    }
}

