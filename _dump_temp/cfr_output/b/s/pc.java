/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.g;
import b.s.ac;
import b.s.kc;
import b.s.lc;
import b.s.n;
import java.util.Map;
import java.util.NoSuchElementException;

class pc {
    public static final Object o00000(Map map, Object object) {
        if (map instanceof n) {
            return ((n)map).\u00f4o0000(object);
        }
        Object object2 = object;
        Object v2 = map.get(object2);
        if (v2 == null && !map.containsKey(object2)) {
            throw new NoSuchElementException("Key " + object + " is missing in the map.");
        }
        return v2;
    }

    public static final Map \u00d200000(Map map, g g2) {
        while (map instanceof n) {
            map = ((n)map).oO\u00d3000();
        }
        return new kc(map, g2);
    }

    public static final Map o00000(Map map, g g2) {
        while (map instanceof ac) {
            map = ((ac)map).oO\u00d3000();
        }
        return new lc(map, g2);
    }
}

