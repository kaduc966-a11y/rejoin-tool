/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.fc;
import b.o.e.g;
import b.qd;
import b.t.c.b.b.h.f;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.pb;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.sc;
import b.t.c.b.b.h.z;

public final class jc {
    public static final rc o00000(rc rc2) {
        if (rc2 instanceof pb) {
            return ((pb)((Object)rc2)).\u00f8\u00f4\u00d2000();
        }
        return null;
    }

    public static final l o00000(l l2, rc rc2, g g2) {
        rc rc3 = jc.o00000(rc2);
        return jc.o00000(l2, rc3 != null ? (rc)g2.\u00f800000(rc3) : null);
    }

    public static final l \u00d200000(l l2, rc rc2) {
        return jc.o00000(l2, jc.o00000(rc2));
    }

    public static final l o00000(l l2, rc rc2) {
        while (l2 instanceof pb) {
            l2 = ((pb)((Object)l2)).ifwhilesuper();
        }
        if (rc2 == null || fc.o00000((Object)rc2, (Object)l2)) {
            return l2;
        }
        l l3 = l2;
        if (l3 instanceof ib) {
            return new sc((ib)l2, rc2);
        }
        if (l3 instanceof f) {
            return new z((f)l2, rc2);
        }
        throw new qd();
    }
}

