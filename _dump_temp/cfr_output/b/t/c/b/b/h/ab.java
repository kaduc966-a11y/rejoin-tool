/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.c.bb;
import b.t.c.b.b.h.c.j;
import b.t.c.b.b.h.c.k;
import b.t.c.b.b.h.c.o;
import b.t.c.b.b.h.c.q;

public final class ab {
    public static final ab o00000 = new ab();

    private ab() {
    }

    public final boolean o00000(o o2, q q2, q q3) {
        return this.\u00d200000(o2, q2, q3);
    }

    private final boolean \u00d200000(o o2, q q2, q q3) {
        if (q2 == q3) {
            return true;
        }
        j j2 = o2.\u00f4O0000(q2);
        j j3 = o2.\u00f4O0000(q3);
        if (j2 != null && j3 != null) {
            return this.o00000(o2, j2, j3);
        }
        q2 = o2.\u00d4O0000(q2);
        q3 = o2.\u00d4O0000(q3);
        if (q2 != null && q3 != null) {
            o o3 = o2;
            if (this.o00000(o3, o3.o00000((k)q2), o2.o00000((k)q3))) {
                o o4 = o2;
                if (this.o00000(o4, o4.new((k)q2), o2.new((k)q3))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private final boolean o00000(o o2, j j2, j j3) {
        block8: {
            block7: {
                if (o2.return((q)j2) != o2.return((q)j3) || o2.\u00d8O0000(j2) != o2.\u00d8O0000(j3) || o2.\u00d400000(j2) != o2.\u00d400000(j3)) break block7;
                o o3 = o2;
                if (o3.o00000(o3.\u00d500000(j2), o2.\u00d500000(j3))) break block8;
            }
            return false;
        }
        if (o2.o00000(j2, j3)) {
            return true;
        }
        int n2 = o2.return((q)j2);
        for (int i2 = 0; i2 < n2; ++i2) {
            bb bb2 = o2.o00000((q)j2, i2);
            bb bb3 = o2.o00000((q)j3, i2);
            if (o2.new(bb2) != o2.new(bb3)) {
                return false;
            }
            if (o2.new(bb2)) continue;
            if (o2.o00000(bb2) != o2.o00000(bb3)) {
                return false;
            }
            o o4 = o2;
            if (this.\u00d200000(o4, o4.\u00d300000(bb2), o2.\u00d300000(bb3))) continue;
            return false;
        }
        return true;
    }
}

