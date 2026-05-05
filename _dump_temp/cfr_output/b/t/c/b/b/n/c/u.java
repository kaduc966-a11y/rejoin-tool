/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.o.d.fc;
import b.t.c.b.b.n.c.d.c.h;
import b.t.c.b.b.o.f;
import b.t.c.b.b.o.f$_b;
import b.t.c.b.b.o.f$_c;
import b.t.c.b.b.q.b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.pb;

public final class u
implements f {
    @Override
    public final f$_c o00000(b b2, b b3, ib ib2) {
        if (!(b3 instanceof pb) || !(b2 instanceof pb)) {
            return f$_c.\u00d300000;
        }
        if (!fc.o00000((Object)((pb)b3).\u00d5\u00f80000(), (Object)((pb)b2).\u00d5\u00f80000())) {
            return f$_c.\u00d300000;
        }
        if (h.super((pb)b3) && h.super((pb)b2)) {
            return f$_c.\u00d400000;
        }
        if (h.super((pb)b3) || h.super((pb)b2)) {
            return f$_c.\u00d200000;
        }
        return f$_c.\u00d300000;
    }

    @Override
    public final f$_b o00000() {
        return f$_b.String;
    }
}

