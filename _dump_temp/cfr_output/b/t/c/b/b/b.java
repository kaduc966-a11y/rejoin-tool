/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b;

import b.o.d.sb$_h;
import b.s.mc;
import b.t.c.b.b.b$_b$1;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.d$_b;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.c.ab;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public final class b {
    public static final b Object = new b();
    private static final Set o00000;
    private static final d \u00d200000;

    private b() {
    }

    public final Set o00000() {
        return o00000;
    }

    public final d \u00d200000() {
        return \u00d200000;
    }

    public final boolean o00000(j j2) {
        sb$_h sb$_h = new sb$_h();
        j2.o00000(new b$_b$1(sb$_h), null);
        return sb$_h.o00000;
    }

    static {
        Object[] objectArray = new k[6];
        Object object = objectArray;
        objectArray[0] = ab.String;
        object[1] = ab.\u00d500000;
        object[2] = ab.\u00f500000;
        object[3] = ab.\u00f5O0000;
        object[4] = ab.\u00d5O0000;
        object[5] = ab.oo0000;
        object = mc.new((Object[])object);
        Collection collection = new LinkedHashSet();
        d$_b d$_b = d.String;
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (k)object2;
            Collection collection2 = collection;
            collection2.add(d$_b.o00000((k)object2));
        }
        o00000 = (Set)collection;
        \u00d200000 = d.String.o00000(ab.\u00d2O0000);
    }
}

