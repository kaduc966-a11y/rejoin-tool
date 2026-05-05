/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.j.b.e;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.e.l;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.k;
import b.t.c.b.b.q.kb;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class o
extends l {
    private final f \u00d4\u00d40000;

    public o(f f2) {
        this.\u00d4\u00d40000 = f2;
    }

    @Override
    public final kb \u00d200000(b.t.c.b.b.d.f object, e e2) {
        k k2;
        kb kb2 = this.\u00d4\u00d40000.\u00d200000((b.t.c.b.b.d.f)object, e2);
        if (kb2 != null) {
            object = kb2;
            k k3 = kb2 instanceof ib ? (ib)object : null;
            if (k3 == null) {
                k3 = object instanceof h ? (h)object : null;
            }
            k2 = k3;
        } else {
            k2 = null;
        }
        return k2;
    }

    public final List int(j iterator, g object) {
        j j2 = ((j)((Object)iterator)).o00000(j.\u00d6O0000.null());
        if (j2 == null) {
            return mc.\u00d500000();
        }
        iterator = j2;
        iterator = this.\u00d4\u00d40000.super((j)((Object)iterator), (g)object);
        object = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (!(t2 instanceof k)) continue;
            object.add(t2);
        }
        return (List)object;
    }

    @Override
    public final Set super() {
        return this.\u00d4\u00d40000.super();
    }

    @Override
    public final Set \u00d300000() {
        return this.\u00d4\u00d40000.\u00d300000();
    }

    @Override
    public final Set \u00d200000() {
        return this.\u00d4\u00d40000.\u00d200000();
    }

    @Override
    public final void super(b.t.c.b.b.d.f f2, e e2) {
        this.\u00d4\u00d40000.super(f2, e2);
    }

    public final String toString() {
        return "Classes from " + this.\u00d4\u00d40000;
    }
}

