/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.qb;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.b.d;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.c;
import b.yc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f {
    public static final f \u00d600000;
    private static final Map String;
    private static final Map \u00d200000;
    private static final Set \u00d300000;
    private static final Set o00000;
    private static final Set \u00d500000;

    private f() {
    }

    public final Map o00000() {
        return String;
    }

    public final Set \u00d200000() {
        return o00000;
    }

    public final Set Object() {
        return \u00d500000;
    }

    public final List o00000(b.t.c.b.b.d.f f2) {
        List list = (List)\u00d200000.get(f2);
        if (list == null) {
            list = mc.\u00d500000();
        }
        return list;
    }

    static {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        \u00d600000 = new f();
        qb[] qbArray = new qb[11];
        Object object5 = qbArray;
        qbArray[0] = yc.o00000(c.\u00d200000(d$_b.returnString, "name"), d.\u00f4o0000);
        object5[1] = yc.o00000(c.\u00d200000(d$_b.returnString, "ordinal"), b.t.c.b.b.d.f.\u00d300000("ordinal"));
        object5[2] = yc.o00000(c.super(d$_b.\u00d5\u00d50000, "size"), b.t.c.b.b.d.f.\u00d300000("size"));
        object5[3] = yc.o00000(c.super(d$_b.\u00d4o0000, "size"), b.t.c.b.b.d.f.\u00d300000("size"));
        object5[4] = yc.o00000(c.\u00d200000(d$_b.\u00d5\u00d20000, "length"), b.t.c.b.b.d.f.\u00d300000("length"));
        object5[5] = yc.o00000(c.super(d$_b.\u00d4o0000, "keys"), b.t.c.b.b.d.f.\u00d300000("keySet"));
        object5[6] = yc.o00000(c.super(d$_b.\u00d4o0000, "values"), b.t.c.b.b.d.f.\u00d300000("values"));
        object5[7] = yc.o00000(c.super(d$_b.\u00d4o0000, "entries"), b.t.c.b.b.d.f.\u00d300000("entrySet"));
        object5[8] = yc.o00000(c.super(d$_b.\u00d8\u00d40000, "size"), b.t.c.b.b.d.f.\u00d300000("length"));
        object5[9] = yc.o00000(c.super(d$_b.\u00d3\u00d30000, "size"), b.t.c.b.b.d.f.\u00d300000("length"));
        object5[10] = yc.o00000(c.super(d$_b.OO0000, "size"), b.t.c.b.b.d.f.\u00d300000("length"));
        String = y.\u00d600000((qb[])object5);
        Object object6 = object5 = (Iterable)String.entrySet();
        object5 = new ArrayList(mc.o00000((Iterable)object5, 10));
        Iterator iterator = object6.iterator();
        while (iterator.hasNext()) {
            object6 = iterator.next();
            object4 = (Map.Entry)object6;
            object3 = object5;
            object3.add(new qb(((k)object4.getKey()).\u00d400000(), object4.getValue()));
        }
        object6 = (List)object5;
        object5 = new LinkedHashMap();
        iterator = object6.iterator();
        while (iterator.hasNext()) {
            Object object7;
            object6 = iterator.next();
            object2 = (b.t.c.b.b.d.f)((qb)object6).o00000();
            object3 = object5;
            object = object2;
            if ((object2 = object3.get(object)) == null) {
                object4 = new ArrayList();
                object3.put(object, object4);
                object7 = object4;
            } else {
                object7 = object2;
            }
            object4 = (qb)object6;
            object3 = (List)object7;
            object3.add((b.t.c.b.b.d.f)((qb)object4).new());
        }
        object6 = object5;
        object5 = new LinkedHashMap(y.\u00d200000(object5.size()));
        iterator = object6.entrySet();
        object6 = object5;
        object4 = iterator.iterator();
        while (object4.hasNext()) {
            object2 = object4.next();
            object3 = (Map.Entry)object2;
            object = object6;
            object2 = (Map.Entry)object2;
            object5 = object3.getKey();
            object3 = object;
            iterator = mc.\u00f4\u00d20000((Iterable)object2.getValue());
            object3.put(object5, iterator);
        }
        \u00d200000 = object6;
        object5 = String;
        object6 = new LinkedHashSet();
        object5 = object5.entrySet().iterator();
        while (object5.hasNext()) {
            iterator = (Map.Entry)object5.next();
            object3 = object6;
            object3.add(b.t.c.b.b.b.c.f.\u00f500000.o00000(((k)iterator.getKey()).\u00d300000().\u00d800000()).\u00f400000().\u00d200000((b.t.c.b.b.d.f)iterator.getValue()));
        }
        \u00d300000 = (Set)object6;
        o00000 = String.keySet();
        object6 = object5 = (Iterable)o00000;
        object5 = new ArrayList(mc.o00000((Iterable)object5, 10));
        iterator = object6.iterator();
        while (iterator.hasNext()) {
            object6 = iterator.next();
            object4 = (k)object6;
            object3 = object5;
            object3.add(((k)object4).\u00d400000());
        }
        \u00d500000 = mc.\u00d4O0000((Iterable)((List)object5));
    }
}

