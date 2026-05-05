/*
 * Decompiled with CFR 0.152.
 */
package b.t.b;

import b.s.mc;
import b.t.b.g;
import b.t.c.b.b.q.i;
import b.t.c.b.c.h;
import b.t.c.b.r;
import b.t.c.b.zc;
import b.t.q;
import b.t.u;
import b.t.v;
import b.t.z;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    public static final u super(v v2, List list, boolean bl, List list2) {
        return b.super(v2, list, bl, list2, null, 8, null);
    }

    public static /* synthetic */ u super(v v2, List list, boolean bl, List list2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            list = mc.\u00d500000();
        }
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            list2 = mc.\u00d500000();
        }
        return b.super(v2, list, bl, list2);
    }

    public static final u super(v v2, List list, boolean bl, List list2, z z2) {
        if (zc.\u00d300000()) {
            return g.o00000(v2, list, bl);
        }
        z z3 = v2 instanceof z ? (z)v2 : null;
        List list3 = z3 != null ? b.t.c.b.c.g.\u00d300000(z3) : null;
        if (list3 == null) {
            list3 = mc.\u00d500000();
        }
        b.super(list3.size(), list.size());
        return new h(v2, list, bl, list2, null, false, false, false, z2, null, 512, null);
    }

    public static /* synthetic */ u super(v v2, List list, boolean bl, List list2, z z2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            list = mc.\u00d500000();
        }
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            list2 = mc.\u00d500000();
        }
        if ((n2 & 8) != 0) {
            z2 = null;
        }
        return b.super(v2, list, bl, list2, z2);
    }

    public static final void super(int n2, int n3) {
        if (n2 != n3) {
            throw new IllegalArgumentException("Class declares " + n2 + " type parameters, but " + n3 + " were provided.");
        }
    }

    public static final u \u00d200000(v object) {
        Object object2 = object instanceof r ? (r)object : null;
        if (object2 == null || (object2 = ((r)object2).\u00d5\u00d2o000()) == null) {
            return b.super((v)object, null, false, null, 7, null);
        }
        Object object3 = object2.\u00d3OO000().\u00f5OO000();
        if (object3.isEmpty()) {
            return b.super((v)object, null, false, null, 7, null);
        }
        v v2 = object;
        object = (Iterable)object3;
        v v3 = v2;
        object3 = object;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object3 = object3.iterator();
        while (object3.hasNext()) {
            Object object4 = object3.next();
            i cfr_ignored_0 = (i)object4;
            object4 = object;
            object4.add((q)q.\u00d400000.o00000());
        }
        return b.super(v3, (List)object, false, null, 6, null);
    }

    public static /* synthetic */ void super(v v2) {
    }
}

