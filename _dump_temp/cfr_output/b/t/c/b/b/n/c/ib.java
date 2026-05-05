/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.m;
import b.s.mc;
import b.t.c.b.b.b.c;
import b.t.c.b.b.n.c.f;
import b.t.c.b.b.n.c.ib$_b$0;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.wb;
import java.util.Collection;

public final class ib {
    public static final ib o00000 = new ib();

    private ib() {
    }

    public final String \u00d500000(hc object) {
        boolean bl = c.\u00d500000((wb)object);
        if (m.new && !bl) {
            object = "This method is defined only for builtin members, but " + object + " found";
            throw new AssertionError(object);
        }
        hc hc2 = b.o00000(b.o00000((hc)object), false, ib$_b$0.oO\u00d5000, 1, null);
        if (hc2 == null) {
            return null;
        }
        hc hc3 = hc2;
        b.t.c.b.b.d.f f2 = (b.t.c.b.b.d.f)f.\u00d600000.o00000().get(b.\u00d800000(hc3));
        if (f2 != null) {
            return f2.\u00d400000();
        }
        return null;
    }

    public final boolean o00000(hc hc2) {
        if (!f.\u00d600000.Object().contains(hc2.\u00d5\u00f80000())) {
            return false;
        }
        return this.\u00d400000(hc2);
    }

    private final boolean \u00d400000(hc iterator) {
        if (mc.\u00d800000((Iterable)f.\u00d600000.\u00d200000(), b.\u00d300000((wb)((Object)iterator))) && iterator.\u00f5\u00d8o000().isEmpty()) {
            return true;
        }
        if (!c.\u00d500000((wb)((Object)iterator))) {
            return false;
        }
        if (!((Collection)((Object)(iterator = (Iterable)iterator.\u00d5\u00f4o000()))).isEmpty()) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                hc hc2 = (hc)iterator.next();
                if (!o00000.o00000(hc2)) continue;
                return true;
            }
        }
        return false;
    }

    private static final boolean Object(hc hc2) {
        return o00000.o00000(hc2);
    }

    static /* synthetic */ boolean \u00d200000(hc hc2) {
        return ib.Object(hc2);
    }
}

