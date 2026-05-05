/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.b.b;

import b.o.d.fc;
import b.t.c.b.b.c.b.b.c;
import b.t.c.b.b.c.b.b.d;
import b.t.c.b.b.c.b.b.g;
import b.t.c.b.b.c.b.b.h;
import b.t.c.b.b.c.b.b.j;
import b.t.c.b.b.c.b.b.o;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.e;
import b.t.c.b.b.c.i;
import b.t.c.b.b.c.k;
import b.t.c.b.b.c.p;
import b.t.c.b.b.c.u;
import b.t.c.b.b.c.y;
import java.util.Collection;

public final class n {
    public static final b.t.c.b.b.c.b.b.e o00000(p p2, b.t.c.b.b.c.b.b.k k2) {
        return (b.t.c.b.b.c.b.b.e)n.o00000(p2.\u00d5O0000(), k2);
    }

    public static final j o00000(y y2, b.t.c.b.b.c.b.b.k k2) {
        return (j)n.o00000(y2.\u00d400000(), k2);
    }

    public static final h o00000(u u2, b.t.c.b.b.c.b.b.k k2) {
        return (h)n.o00000(u2.\u00f400000(), k2);
    }

    public static final b.t.c.b.b.c.b.b.i o00000(e e2, b.t.c.b.b.c.b.b.k k2) {
        return (b.t.c.b.b.c.b.b.i)n.o00000(e2.\u00d2O0000(), k2);
    }

    public static final d o00000(i i2, b.t.c.b.b.c.b.b.k k2) {
        return (d)n.o00000(i2.o00000(), k2);
    }

    public static final g o00000(k k2, b.t.c.b.b.c.b.b.k k3) {
        return (g)n.o00000(k2.super(), k3);
    }

    public static final o o00000(db db2, b.t.c.b.b.c.b.b.k k2) {
        return (o)n.o00000(db2.\u00d400000(), k2);
    }

    private static final c o00000(Collection object, b.t.c.b.b.c.b.b.k k2) {
        c c2 = null;
        object = object.iterator();
        while (object.hasNext()) {
            c c3 = (c)object.next();
            if (!fc.o00000((Object)c3.o00000(), (Object)k2)) continue;
            if (c2 != null) {
                throw new IllegalStateException("Multiple extensions handle the same extension type: ".concat(String.valueOf(k2)));
            }
            c2 = c3;
        }
        if (c2 == null) {
            throw new IllegalStateException("No extensions handle the extension type: ".concat(String.valueOf(k2)));
        }
        return c2;
    }
}

