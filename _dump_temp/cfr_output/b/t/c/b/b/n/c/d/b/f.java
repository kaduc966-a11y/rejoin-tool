/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.b;

import b.s.ub;
import b.t.c.b.b.h.t;
import b.t.c.b.b.n.c.d.b.i;
import java.util.Set;

public final class f {
    public static final i o00000(t object, boolean bl, boolean bl2, b.t.c.b.b.q.i i2) {
        Object object2;
        t t2 = object;
        boolean bl3 = bl2;
        boolean bl4 = bl;
        b.t.c.b.b.q.i i3 = i2;
        if (i3 != null) {
            object = i3;
            boolean bl5 = bl4;
            bl2 = bl3;
            t t3 = t2;
            object = ub.super(object);
            t2 = t3;
            bl3 = bl2;
            bl4 = bl5;
            object2 = object;
        } else {
            object2 = null;
        }
        object = object2;
        boolean bl6 = bl4;
        bl2 = bl3;
        t t4 = t2;
        return new i(t4, null, bl2, bl6, (Set)object, null, 34, null);
    }

    public static /* synthetic */ i o00000(t t2, boolean bl, boolean bl2, b.t.c.b.b.q.i i2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            bl = false;
        }
        if ((n2 & 2) != 0) {
            bl2 = false;
        }
        if ((n2 & 4) != 0) {
            i2 = null;
        }
        return f.o00000(t2, bl, bl2, i2);
    }
}

