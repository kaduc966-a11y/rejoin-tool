/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.g.n;
import b.m;
import b.s.mc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.b;
import b.t.c.b.b.q.c;
import b.t.c.b.b.q.f$_b$0;
import b.t.c.b.b.q.f$_b$1;
import b.t.c.b.b.q.f$_b$2;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.k;
import b.t.c.b.b.q.vb;
import b.t.c.b.b.q.wb;
import b.t.c.b.b.q.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f {
    public static final List o00000(k object) {
        List list;
        Object object2;
        Object v0;
        Object object3;
        Object object4;
        Object object5;
        List list2;
        block5: {
            list2 = object.\u00d8\u00d6o000();
            if (!object.\u00f4\u00d6o000() && !(object.\u00d8\u00f80000() instanceof b)) {
                return list2;
            }
            object5 = b.g.c.\u00d6o0000(b.g.c.\u00d5\u00d30000(b.g.c.nullnew(b.g.c.newsuper(b.t.c.b.b.o.f.b.String((wb)object), f$_b$0.\u00f8\u00d2\u00d5000), f$_b$1.ifthisObject), f$_b$2.\u00f5\u00d2\u00d5000));
            object4 = b.t.c.b.b.o.f.b.String((wb)object).o00000();
            while (object4.hasNext()) {
                object3 = object4.next();
                if (!(object3 instanceof ib)) continue;
                v0 = object3;
                break block5;
            }
            v0 = null;
        }
        if (((object2 = (ib)v0) != null && (object2 = object2.\u00d3OO000()) != null ? object2.\u00f5OO000() : (list = null)) == null) {
            list = object3 = mc.\u00d500000();
        }
        if (object5.isEmpty() && object3.isEmpty()) {
            return object.\u00d8\u00d6o000();
        }
        object4 = object3 = (Iterable)mc.return((Collection)object5, (Iterable)object3);
        object3 = new ArrayList(mc.o00000((Iterable)object3, 10));
        object5 = object4.iterator();
        while (object5.hasNext()) {
            object4 = object5.next();
            object4 = (i)object4;
            Object e2 = object3;
            e2.add(f.o00000((i)object4, (wb)object, list2.size()));
        }
        object = (List)object3;
        return mc.return((Collection)list2, (Iterable)object);
    }

    private static final c o00000(i i2, wb wb2, int n2) {
        return new c(i2, wb2, n2);
    }

    public static final z o00000(rc i2) {
        rc rc2 = i2;
        i2 = rc2.thisdosuper().\u00f4OO000();
        return f.o00000(rc2, i2 instanceof k ? (k)i2 : null, 0);
    }

    private static final z o00000(rc object, k k2, int n2) {
        if (k2 == null || b.t.c.b.b.h.d.k.o00000(k2)) {
            return null;
        }
        int n3 = k2.\u00d8\u00d6o000().size() + n2;
        if (!k2.\u00f4\u00d6o000()) {
            boolean bl;
            boolean bl2 = bl = n3 == ((rc)object).\u00d4\u00d6\u00d2000().size() || b.t.c.b.b.o.n.\u00d300000(k2);
            if (m.new && !bl) {
                object = ((rc)object).\u00d4\u00d6\u00d2000().size() - n3 + " trailing arguments were found in " + object + " type";
                throw new AssertionError(object);
            }
            return new z(k2, ((rc)object).\u00d4\u00d6\u00d2000().subList(n2, ((rc)object).\u00d4\u00d6\u00d2000().size()), null);
        }
        List list = ((rc)object).\u00d4\u00d6\u00d2000().subList(n2, n3);
        return new z(k2, list, f.o00000((rc)object, (object = k2.\u00d8\u00f80000()) instanceof k ? (k)object : null, n3));
    }

    private static final boolean return(wb wb2) {
        return wb2 instanceof b;
    }

    private static final boolean \u00d400000(wb wb2) {
        return !(wb2 instanceof vb);
    }

    private static final n new(wb wb2) {
        return mc.\u00d5o0000(((b)wb2).\u00f8\u00d8o000());
    }

    static /* synthetic */ boolean o00000(wb wb2) {
        return f.return(wb2);
    }

    static /* synthetic */ boolean \u00d500000(wb wb2) {
        return f.\u00d400000(wb2);
    }

    static /* synthetic */ n \u00d300000(wb wb2) {
        return f.new(wb2);
    }
}

