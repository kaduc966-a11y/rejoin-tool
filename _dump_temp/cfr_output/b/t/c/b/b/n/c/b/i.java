/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.b;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.b.b;
import b.t.c.b.b.n.c.b.c;
import b.t.c.b.b.n.c.b.e;
import b.t.c.b.b.n.c.b.w;
import b.t.c.b.b.n.c.b.y;

public final class i {
    public static final boolean o00000(w w2) {
        return w2.while().\u00f4O0000() && w2 instanceof y && i.\u00d200000((y)w2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final boolean \u00d200000(y y2) {
        String string = y2.oO0000().\u00d400000();
        switch (string.hashCode()) {
            case 147696667: {
                if (string.equals("hashCode")) return y2.thisObject().isEmpty();
                return false;
            }
            case -1295482945: {
                if (string.equals("equals")) return i.o00000(y2);
                return false;
            }
            case -1776922004: {
                if (!string.equals("toString")) return false;
                return y2.thisObject().isEmpty();
            }
        }
        return false;
    }

    private static final boolean o00000(y object) {
        e e2 = (e)mc.\u00d8O0000(object.thisObject());
        object = e2 != null ? e2.\u00d500000() : null;
        c c2 = object instanceof c ? (c)object : null;
        if (c2 == null) {
            return false;
        }
        object = c2.O\u00d50000();
        if (object instanceof b) {
            return (object = ((b)object).Oo0000()) != null && fc.o00000((Object)((k)object).super(), (Object)"java.lang.Object");
        }
        return false;
    }
}

