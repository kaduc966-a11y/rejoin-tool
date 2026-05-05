/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.o.d.fc;
import b.s.y;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.d$_b;
import b.t.c.b.b.q.d$_c;
import b.t.c.b.b.q.d$_d;
import b.t.c.b.b.q.d$_f;
import b.t.c.b.b.q.d$_i;
import java.util.Map;

public final class d {
    public static final d Object;
    private static final Map o00000;
    private static final d$_f \u00d200000;

    private d() {
    }

    public final Integer o00000(ac object, ac object2) {
        if (object == object2) {
            return 0;
        }
        object = (Integer)o00000.get(object);
        object2 = (Integer)o00000.get(object2);
        if (object == null || object2 == null || fc.o00000(object, object2)) {
            return null;
        }
        return (Integer)object - (Integer)object2;
    }

    public final boolean o00000(ac ac2) {
        return ac2 == d$_i.OO0000 || ac2 == d$_d.\u00d800000;
    }

    static {
        Map map;
        Object = new d();
        Map map2 = map = y.o00000();
        map.put(d$_d.\u00d800000, 0);
        map2.put(d$_i.OO0000, 0);
        map2.put(d$_c.return, 1);
        map2.put(d$_b.\u00d500000, 1);
        map2.put(d$_f.\u00f500000, 2);
        o00000 = y.\u00d200000(map);
        \u00d200000 = d$_f.\u00f500000;
    }
}

