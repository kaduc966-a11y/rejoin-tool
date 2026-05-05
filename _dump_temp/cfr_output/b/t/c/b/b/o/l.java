/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.s.mc;
import b.t.c.b.b.o.c;
import b.t.c.b.b.o.e.b$_b;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.o.l$_b$_b$_b$1;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.wb;
import java.util.Collection;
import java.util.LinkedHashSet;

public final class l
extends c {
    public static final l o00000 = new l();

    private l() {
    }

    public final Collection o00000(ib ib2, boolean bl) {
        Object object;
        Object object2;
        if (ib2.\u00f40O000() != ab.super) {
            return mc.\u00d500000();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!bl) {
            object2 = ib2.\u00d8\u00f80000();
        } else {
            Object v1;
            block5: {
                object = b.String(ib2).o00000();
                while (object.hasNext()) {
                    Object e2 = object.next();
                    if (!((wb)e2 instanceof lc)) continue;
                    v1 = e2;
                    break block5;
                }
                v1 = null;
            }
            object2 = object = (wb)v1;
        }
        if (object2 instanceof lc) {
            l.o00000(ib2, linkedHashSet, ((lc)object).\u00f80O000(), bl);
        }
        l.o00000(ib2, linkedHashSet, ib2.\u00d3o\u00d2000(), true);
        return mc.return((Iterable)linkedHashSet, new l$_b$_b$_b$1());
    }

    private static final void o00000(ib ib2, LinkedHashSet linkedHashSet, f f2, boolean bl) {
        for (wb wb2 : b$_b.o00000(f2, j.Oo0000, null, 2, null)) {
            if (!(wb2 instanceof ib)) continue;
            ib ib3 = ((ib)wb2).\u00d80O000() && !((wb2 = f2.\u00d200000(((ib)wb2).\u00d5\u00f80000(), b.t.c.b.b.j.b.f.returnsuper)) instanceof ib) ? (wb2 instanceof h ? ((h)wb2).\u00f8\u00d6o000() : null) : (ib)wb2;
            if (ib3 == null) continue;
            wb2 = ib3;
            if (n.super(ib3, ib2)) {
                linkedHashSet.add(wb2);
            }
            if (!bl) continue;
            l.o00000(ib2, linkedHashSet, wb2.\u00d3o\u00d2000(), bl);
        }
    }
}

