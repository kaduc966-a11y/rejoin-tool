/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.fc;
import b.t.c.b.b.b.c.f;
import b.t.c.b.b.b.c.f$_b;
import b.t.c.b.b.b.j;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.e;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.n.b.g;
import b.t.c.b.b.n.b.m;
import b.t.c.b.b.n.c.g.k;
import b.t.c.b.b.o.h.b;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class s {
    public static final Object super(g g2, Object object, boolean bl) {
        if (bl) {
            return g2.\u00d200000(object);
        }
        return object;
    }

    public static final Object super(b.t.c.b.b.h.fc object, q object2, g g2, m m2) {
        Object object3 = object.\u00f400000((q)object2);
        if (!object.new((b.t.c.b.b.h.c.g)object3)) {
            return null;
        }
        Object object4 = object.oO0000((b.t.c.b.b.h.c.g)object3);
        if (object4 != null) {
            object4 = g2.o00000((j)((Object)object4));
            boolean bl = object.\u00d400000((q)object2) || k.o00000((b.t.c.b.b.h.fc)object, (q)object2);
            return s.super(g2, object4, bl);
        }
        object4 = object.\u00d3O0000((b.t.c.b.b.h.c.g)object3);
        if (object4 != null) {
            return g2.\u00d200000("[" + b.t.c.b.b.o.h.e.o00000(object4).\u00d400000());
        }
        if (object.\u00d4O0000((b.t.c.b.b.h.c.g)object3)) {
            Object object5;
            e e2 = object.OO0000((b.t.c.b.b.h.c.g)object3);
            if (e2 != null) {
                object = e2;
                object2 = f.\u00f500000;
                object3 = object;
                object5 = ((f)object2).o00000((e)object3);
            } else {
                object5 = object = null;
            }
            if (object5 != null) {
                if (!m2.String()) {
                    boolean bl;
                    object2 = f.\u00f500000.o00000();
                    if (!(object2 instanceof Collection) || !((Collection)object2).isEmpty()) {
                        object2 = object2.iterator();
                        while (object2.hasNext()) {
                            if (!fc.o00000((Object)((f$_b)object2.next()).\u00d400000(), object)) continue;
                            bl = true;
                            break;
                        }
                    } else {
                        bl = false;
                    }
                    if (bl) {
                        return null;
                    }
                }
                return g2.o00000(b.\u00d200000((d)object));
            }
        }
        return null;
    }
}

