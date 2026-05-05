/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.s.mc;
import b.t.c.b.b.b.d;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.b.j;
import b.t.c.b.b.d.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class h {
    public static final h \u00d200000;
    private static final Set o00000;

    private h() {
    }

    public final Set \u00d200000() {
        return o00000;
    }

    public final Set o00000() {
        return o00000;
    }

    static {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        \u00d200000 = new h();
        Object object5 = object4 = (Iterable)j.\u00f400000;
        object4 = new ArrayList(mc.o00000((Iterable)object4, 10));
        Iterator<Object> iterator = object5.iterator();
        while (iterator.hasNext()) {
            object3 = iterator.next();
            object2 = (j)((Object)object3);
            object = object4;
            object.add(d.o00000(object2));
        }
        object4 = mc.\u00d500000((Collection)mc.\u00d500000((Collection)mc.\u00d500000((Collection)((List)object4), (Object)d$_b.returnnew.super()), (Object)d$_b.o\u00d40000.super()), (Object)d$_b.returnString.super());
        object2 = new LinkedHashSet();
        object5 = b.t.c.b.b.d.d.String;
        object4 = object4.iterator();
        while (object4.hasNext()) {
            iterator = object4.next();
            object3 = (k)((Object)iterator);
            object = object2;
            object.add(((b.t.c.b.b.d.d$_b)object5).o00000((k)object3));
        }
        o00000 = (Set)object2;
    }
}

