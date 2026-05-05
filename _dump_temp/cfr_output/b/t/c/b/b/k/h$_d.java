/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.o.d.fc;
import b.t.c.b.b.k.b;
import b.t.c.b.b.k.c;
import b.t.c.b.b.k.h;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.wb;

public final class h$_d
implements h {
    public static final h$_d \u00d200000 = new h$_d();

    private h$_d() {
    }

    @Override
    public final String o00000(kb kb2, b b2) {
        return this.o00000(kb2);
    }

    private final String o00000(kb object) {
        String string = c.super(object.\u00d5\u00f80000(), false, 1, null);
        if (object instanceof i) {
            return string;
        }
        if ((object = this.o00000(object.\u00d8\u00f80000())) != null && !fc.o00000(object, (Object)"")) {
            return (String)object + '.' + string;
        }
        return string;
    }

    private final String o00000(wb wb2) {
        wb wb3 = wb2;
        if (wb3 instanceof ib) {
            return this.o00000((kb)wb2);
        }
        if (wb3 instanceof lc) {
            return c.super(((lc)wb2).OOO000().\u00d800000());
        }
        return null;
    }
}

