/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.s.mc;
import b.s.y;
import b.t.c.b.b.h.c.bb;
import b.t.c.b.b.h.c.d;
import b.t.c.b.b.h.c.g;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.c.r;
import b.t.c.b.b.h.c.u;
import b.t.c.b.b.h.eb$_b;
import b.t.c.b.b.h.fc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class eb {
    public static final q \u00d300000(fc fc2, q q2) {
        return eb.super(fc2, q2, new HashSet());
    }

    private static final q super(fc fc2, q q2, HashSet object) {
        Object object2 = fc2.\u00f400000(q2);
        if (!((HashSet)object).add(object2)) {
            return null;
        }
        r r2 = fc2.\u00f400000((g)object2);
        if (r2 != null) {
            object2 = fc2.\u00d400000(r2);
            object = eb.super(fc2, (q)object2, (HashSet)object);
            if (object != null) {
                boolean bl;
                fc fc3 = fc2;
                boolean bl2 = bl = fc3.while(fc3.\u00f400000((q)object2)) || object2 instanceof u && fc2.new((u)object2);
                if (object instanceof u && fc2.new((u)object) && fc2.\u00d400000(q2) && bl) {
                    return fc2.\u00f8O0000((q)object2);
                }
                if (fc2.\u00d400000((q)object) || !fc2.\u00d8O0000(q2)) {
                    return object;
                }
                return fc2.\u00f8O0000((q)object);
            }
            return null;
        }
        if (fc2.while((g)object2)) {
            q q3 = eb.\u00d200000(fc2, q2);
            if (q3 == null) {
                return null;
            }
            object2 = q3;
            q q4 = eb.super(fc2, (q)object2, (HashSet)object);
            if (q4 == null) {
                return null;
            }
            object = q4;
            if (!fc2.\u00d400000(q2)) {
                return object;
            }
            if (!(fc2.\u00d400000((q)object) || object instanceof u && fc2.new((u)object))) {
                return fc2.\u00f8O0000((q)object);
            }
        }
        return q2;
    }

    private static final q \u00d200000(fc fc2, q q2) {
        Iterable<g> iterable;
        Object object;
        fc fc3 = fc2;
        Object object2 = fc3.\u00d300000(fc3.\u00f400000(q2));
        Iterable iterable2 = fc2.\u00f500000(q2);
        Object object3 = iterable2;
        Object object4 = new ArrayList(mc.o00000(iterable2, 10));
        int n2 = 0;
        object3 = object3.iterator();
        while (object3.hasNext()) {
            int n3;
            object = object3.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object = (bb)object;
            iterable = object4;
            q q3 = fc2.\u00d300000((bb)object);
            if (q3 == null) {
                q3 = fc2.\u00d400000((r)object2.get(n3));
            }
            iterable.add(q3);
        }
        Object object5 = (List)object4;
        object4 = object2 = (Iterable)object2;
        object2 = new ArrayList(mc.o00000((Iterable)object2, 10));
        object3 = object4.iterator();
        while (object3.hasNext()) {
            object = object3.next();
            r r2 = (r)object;
            iterable = object2;
            iterable.add(fc2.o00000(r2));
        }
        object5 = y.o00000(mc.\u00d300000(object2, (Iterable)object5));
        object2 = fc2.o00000((Map)object5);
        q q4 = fc2.oo0000(q2);
        if (q4 == null) {
            return null;
        }
        object3 = q4;
        object4 = eb.\u00d400000(fc2, (q)object3);
        if (object4 == null) {
            return fc2.o00000((d)object2, (q)object3);
        }
        return eb.super(fc2, (q)object3, fc2.o00000((d)object2, fc2.\u00d400000((r)object4)));
    }

    private static final r super(fc fc2, q q2) {
        fc fc3 = fc2;
        return fc3.\u00f400000(fc3.\u00f400000(q2));
    }

    private static final r \u00d400000(fc fc2, q q2) {
        r r2;
        while ((r2 = eb.super(fc2, q2)) == null) {
            if (!fc2.nullsuper(q2)) {
                return null;
            }
            fc fc3 = fc2;
            if (fc3.\u00d300000((bb)mc.\u00d5O0000(fc3.\u00f500000(q2))) != null) continue;
            r2 = null;
            break;
        }
        return r2;
    }

    private static final q super(fc fc2, q q2, q q3) {
        q q4;
        if (eb.super(fc2, q2) != null) {
            if (fc2.\u00d400000(q2)) {
                return fc2.\u00f8O0000(q3);
            }
            return q3;
        }
        bb bb2 = (bb)mc.\u00d5O0000(fc2.\u00f500000(q2));
        if (eb$_b.o00000[fc2.o00000(bb2).ordinal()] == 1) {
            q4 = fc2.o00000();
        } else {
            fc fc3 = fc2;
            q4 = eb.super(fc3, fc3.\u00d300000(bb2), q3);
        }
        q3 = q4;
        q3 = fc2.Oo0000(q3);
        if (fc2.\u00d400000(q2)) {
            return fc2.\u00f8O0000(q3);
        }
        return q3;
    }
}

