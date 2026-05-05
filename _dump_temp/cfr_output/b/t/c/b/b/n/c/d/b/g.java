/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.b;

import b.qd;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.m;
import b.t.c.b.b.h.mc;
import b.t.c.b.b.h.n;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.n.c.d.b.e;
import b.t.c.b.b.n.c.d.b.g$_b;
import b.t.c.b.b.n.c.d.b.i;
import b.t.c.b.b.o.f.b;
import java.util.Collection;

public final class g
extends n {
    @Override
    public final hc o00000(b.t.c.b.b.q.i i2, m m2, mc mc2, rc rc2) {
        if (!(m2 instanceof i)) {
            return super.o00000(i2, m2, mc2, rc2);
        }
        m2 = ((i)m2).\u00d500000() ? (i)m2 : ((i)m2).o00000(e.o00000);
        switch (g$_b.super[((i)m2).\u00d400000().ordinal()]) {
            case 1: {
                return new lc(w.\u00d400000, rc2);
            }
            case 2: 
            case 3: {
                if (!i2.\u00d4\u00d5o000().super()) {
                    return new lc(w.\u00d400000, b.null(i2).ifsuper());
                }
                if (!((Collection)rc2.thisdosuper().\u00f5OO000()).isEmpty()) {
                    return new lc(w.return, rc2);
                }
                return o.o00000(i2, m2);
            }
        }
        throw new qd();
    }
}

