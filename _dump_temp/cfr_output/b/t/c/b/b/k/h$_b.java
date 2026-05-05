/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.s.mc;
import b.t.c.b.b.k.b;
import b.t.c.b.b.k.c;
import b.t.c.b.b.k.h;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import java.util.ArrayList;
import java.util.List;

public final class h$_b
implements h {
    public static final h$_b \u00d300000 = new h$_b();

    private h$_b() {
    }

    @Override
    public final String o00000(kb wb2, b object) {
        if (wb2 instanceof i) {
            return ((b)object).super(((i)wb2).\u00d5\u00f80000(), false);
        }
        object = new ArrayList();
        wb2 = wb2;
        do {
            ((ArrayList)object).add(wb2.\u00d5\u00f80000());
        } while ((wb2 = wb2.\u00d8\u00f80000()) instanceof ib);
        return c.super(mc.\u00f800000((List)object));
    }
}

