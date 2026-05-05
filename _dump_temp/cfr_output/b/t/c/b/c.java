/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.e.g;
import b.pc;
import b.t.c.b.rc;
import b.t.c.b.vb;
import b.t.c.b.yc;
import b.xd;

public final class c {
    private static final boolean o00000;

    public static final vb o00000(g g2) {
        if (o00000) {
            return new yc(g2);
        }
        return new rc(g2);
    }

    static {
        Object object;
        Object object2;
        try {
            object2 = xd.String(Class.forName("java.lang.ClassValue"));
        }
        catch (Throwable throwable) {
            object2 = xd.String(pc.o00000(throwable));
        }
        if (xd.\u00d600000(object2)) {
            Class cfr_ignored_0 = (Class)object2;
            object = xd.String(Boolean.TRUE);
        } else {
            object = xd.String(object2);
        }
        object2 = object;
        Boolean bl = Boolean.FALSE;
        o00000 = (Boolean)(xd.\u00d800000(object2) ? bl : object2);
    }
}

