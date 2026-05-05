/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.c;

import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.b.p;
import b.t.c.b.b.d.k;
import b.t.c.b.b.f.b.ab;
import b.t.c.b.b.f.b.c.b$_b$1;
import b.t.c.b.b.f.b.c.c;
import b.t.c.b.b.f.b.c.e;
import b.t.c.b.b.f.b.d;
import b.t.c.b.b.f.b.db;
import b.t.c.b.b.f.b.f;
import b.t.c.b.b.f.b.gb$_b;
import b.t.c.b.b.f.b.hb;
import b.t.c.b.b.f.b.l$_b;
import b.t.c.b.b.f.b.t;
import b.t.c.b.b.f.b.z$_b;
import b.t.c.b.b.i.l;
import b.t.c.b.b.j.b.g$_b;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.f.c$_b;
import b.t.c.b.b.q.j;
import b.t.c.b.b.q.ob;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b
implements p {
    private final c new = new c();

    @Override
    public final j o00000(l l2, bc bc2, Iterable iterable, b.t.c.b.b.q.f.b b2, b.t.c.b.b.q.f.c c2, boolean bl) {
        return this.o00000(l2, bc2, b.t.c.b.b.b.d.\u00d3O0000, iterable, b2, c2, bl, new b$_b$1(this.new));
    }

    public final j o00000(l l2, bc bc2, Set object, Iterable iterable, b.t.c.b.b.q.f.b b2, b.t.c.b.b.q.f.c c2, boolean bl, g g2) {
        Object object2 = (Iterable)object;
        object = new ArrayList();
        Object object3 = object2.iterator();
        while (object3.hasNext()) {
            object2 = (k)object3.next();
            Object object4 = e.\u00d6O0000.Object((k)object2);
            b.t.c.b.b.f.b.c.d d2 = (object4 = (InputStream)g2.\u00f800000(object4)) != null ? b.t.c.b.b.f.b.c.d.\u00d5\u00d3\u00d8000.super((k)object2, l2, bc2, (InputStream)object4, bl) : null;
            if (d2 == null) continue;
            object2 = d2;
            object.add(object2);
        }
        object = (List)object;
        object3 = new ob((Collection)object);
        b.t.c.b.b.q.t t2 = new b.t.c.b.b.q.t(l2, bc2);
        object2 = new t(l2, bc2, z$_b.o00000, new hb((j)object3), new d(bc2, t2, e.\u00d6O0000), (j)object3, l$_b.o00000, f.o00000, g$_b.o00000, gb$_b.\u00d200000, iterable, t2, db.o00000.o00000(), c2, b2, e.\u00d6O0000.\u00d4O0000(), null, new b.t.c.b.b.o.g.c(l2, mc.\u00d500000()), null, null, 851968, null);
        object = object.iterator();
        while (object.hasNext()) {
            ((ab)((b.t.c.b.b.f.b.c.d)object.next())).o00000((t)object2);
        }
        return (j)object3;
    }

    public static /* synthetic */ j o00000(b b2, l l2, bc bc2, Set set, Iterable iterable, b.t.c.b.b.q.f.b b3, b.t.c.b.b.q.f.c c2, boolean bl, g g2, int n2, Object object) {
        if ((n2 & 0x20) != 0) {
            c2 = c$_b.o00000;
        }
        return b2.o00000(l2, bc2, set, iterable, b3, c2, bl, g2);
    }
}

