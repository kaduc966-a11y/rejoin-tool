/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.rb;
import b.o.d.sb$_i;
import b.o.e.g;
import b.s.ab;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class cc {
    public static final Map o00000(ab object) {
        Object object2 = new LinkedHashMap();
        Object object3 = object;
        Object object4 = object2;
        object = object3.o00000();
        while (object.hasNext()) {
            Object v2;
            object2 = object.next();
            object2 = object3.o00000(object2);
            Object v3 = v2 = object4.get(object2);
            boolean bl = v3 == null && !object4.containsKey(object2);
            v2 = v3;
            Iterator iterator = object2;
            Map map = object4;
            object2 = bl ? new sb$_i() : v2;
            ++((sb$_i)object2).o00000;
            map.put(iterator, object2);
        }
        object = object4;
        object2 = ((Iterable)object.entrySet()).iterator();
        while (object2.hasNext()) {
            object4 = object3 = (Map.Entry)object2.next();
            object3 = rb.\u00d500000(object3);
            object3.setValue(((sb$_i)object4.getValue()).o00000);
        }
        return rb.Object(object);
    }

    private static final Map o00000(Map map, g g2) {
        for (Map.Entry entry : (Iterable)map.entrySet()) {
            rb.\u00d500000(entry).setValue(g2.\u00f800000(entry));
        }
        return rb.Object(map);
    }
}

