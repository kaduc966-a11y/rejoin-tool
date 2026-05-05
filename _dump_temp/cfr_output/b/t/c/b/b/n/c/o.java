/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.ab;
import b.t.c.b.b.n.c.d;
import b.t.c.b.b.n.c.w;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.e.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class o
extends w {
    public o(d d2) {
        super(d2);
    }

    @Override
    public final boolean o00000() {
        return false;
    }

    protected final Iterable \u00d200000(l l2) {
        Object object = b.o00000(l2);
        if (object != null && (object = object.\u00d4\u00f80000()) != null) {
            return (Iterable)object;
        }
        return mc.\u00d500000();
    }

    protected final Object \u00d300000(l l2) {
        return b.o00000(l2);
    }

    protected final k o00000(l l2) {
        return l2.\u00d300000();
    }

    protected final Iterable o00000(l iterator, boolean bl) {
        iterator = iterator.super();
        Collection collection = new ArrayList();
        for (Map.Entry entry : iterator.entrySet()) {
            f f2 = (f)entry.getKey();
            j j2 = (j)entry.getValue();
            Iterable object = !bl || fc.o00000((Object)f2, (Object)ab.null) ? this.o00000(j2) : mc.\u00d500000();
            mc.new(collection, object);
        }
        return (List)collection;
    }

    private final List o00000(j iterator) {
        Iterator iterator2 = iterator;
        if (iterator2 instanceof b.t.c.b.b.o.c.k) {
            iterator = (Iterable)((b.t.c.b.b.o.c.k)((Object)iterator)).o00000();
            iterator2 = new ArrayList();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object object = (j)iterator.next();
                object = this.o00000((j)object);
                mc.new((Collection)((Object)iterator2), (Iterable)object);
            }
            return (List)((Object)iterator2);
        }
        if (iterator2 instanceof b.t.c.b.b.o.c.f) {
            return mc.o00000(((b.t.c.b.b.o.c.f)((Object)iterator)).\u00d200000().\u00d300000());
        }
        return mc.\u00d500000();
    }
}

