/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.d;
import b.o.e.e;
import b.o.e.f;
import b.s.ab;
import b.s.cc;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class lb
extends cc {
    public static final Map o00000(ab ab2, d d2) {
        Map map = new LinkedHashMap();
        Iterator iterator = ab2.o00000();
        while (iterator.hasNext()) {
            Object e2;
            Object v2;
            Object object;
            map.put(object, d2.o00000(object, v2, e2, (v2 = map.get(object = ab2.o00000(e2 = iterator.next()))) == null && !map.containsKey(object)));
        }
        return map;
    }

    public static final Map o00000(ab ab2, Map map, d d2) {
        Iterator iterator = ab2.o00000();
        while (iterator.hasNext()) {
            Object e2;
            Object v2;
            Object object;
            map.put(object, d2.o00000(object, v2, e2, (v2 = map.get(object = ab2.o00000(e2 = iterator.next()))) == null && !map.containsKey(object)));
        }
        return map;
    }

    public static final Map o00000(ab ab2, f f2, e e2) {
        Map map = new LinkedHashMap();
        Iterator iterator = ab2.o00000();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Object object2 = ab2.o00000(object);
            Object v2 = map.get(object2);
            Object object3 = object2;
            boolean bl = v2 == null && !map.containsKey(object2);
            object2 = object;
            Object object4 = object3;
            Object object5 = object3;
            Map map2 = map;
            object = e2.o00000(object4, bl ? f2.o00000(object4, object2) : v2, object2);
            map2.put(object5, object);
        }
        return map;
    }

    public static final Map o00000(ab ab2, Map map, f f2, e e2) {
        Iterator iterator = ab2.o00000();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Object object2 = ab2.o00000(object);
            Object v2 = map.get(object2);
            Object object3 = object2;
            boolean bl = v2 == null && !map.containsKey(object2);
            object2 = object;
            Object object4 = object3;
            Object object5 = object3;
            Map map2 = map;
            object = e2.o00000(object4, bl ? f2.o00000(object4, object2) : v2, object2);
            map2.put(object5, object);
        }
        return map;
    }

    public static final Map o00000(ab ab2, Object object, f f2) {
        Map map = new LinkedHashMap();
        Iterator iterator = ab2.o00000();
        while (iterator.hasNext()) {
            Object object2 = iterator.next();
            Object object3 = ab2.o00000(object2);
            Object v2 = map.get(object3);
            Object object4 = object3;
            boolean bl = v2 == null && !map.containsKey(object3);
            object3 = object2;
            Object object5 = object4;
            Map map2 = map;
            object2 = f2.o00000(bl ? object : v2, object3);
            map2.put(object5, object2);
        }
        return map;
    }

    public static final Map o00000(ab ab2, Map map, Object object, f f2) {
        Iterator iterator = ab2.o00000();
        while (iterator.hasNext()) {
            Object object2 = iterator.next();
            Object object3 = ab2.o00000(object2);
            Object v2 = map.get(object3);
            Object object4 = object3;
            boolean bl = v2 == null && !map.containsKey(object3);
            object3 = object2;
            Object object5 = object4;
            Map map2 = map;
            object2 = f2.o00000(bl ? object : v2, object3);
            map2.put(object5, object2);
        }
        return map;
    }

    public static final Map o00000(ab ab2, e e2) {
        Map map = new LinkedHashMap();
        Iterator iterator = ab2.o00000();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Object object2 = ab2.o00000(object);
            Object v2 = map.get(object2);
            Object object3 = object2;
            boolean bl = v2 == null && !map.containsKey(object2);
            object2 = object;
            Object object4 = object3;
            Object object5 = object3;
            Map map2 = map;
            object = bl ? object2 : e2.o00000(object4, v2, object2);
            map2.put(object5, object);
        }
        return map;
    }

    public static final Map o00000(ab ab2, Map map, e e2) {
        Iterator iterator = ab2.o00000();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Object object2 = ab2.o00000(object);
            Object v2 = map.get(object2);
            Object object3 = object2;
            boolean bl = v2 == null && !map.containsKey(object2);
            object2 = object;
            Object object4 = object3;
            Object object5 = object3;
            Map map2 = map;
            object = bl ? object2 : e2.o00000(object4, v2, object2);
            map2.put(object5, object);
        }
        return map;
    }

    public static final Map o00000(ab ab2, Map map) {
        Integer n2 = 0;
        Iterator iterator = ab2.o00000();
        while (iterator.hasNext()) {
            Object v2;
            Object object = iterator.next();
            object = ab2.o00000(object);
            Object v3 = v2 = map.get(object);
            boolean bl = v3 == null && !map.containsKey(object);
            v2 = v3;
            Object object2 = object;
            Map map2 = map;
            object = ((Number)(bl ? n2 : v2)).intValue() + 1;
            map2.put(object2, object);
        }
        return map;
    }
}

