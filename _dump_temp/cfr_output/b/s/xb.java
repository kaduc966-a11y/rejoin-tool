/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.g;
import b.o.e.h;
import b.qb;
import b.s.d.i;
import b.s.pc;
import b.s.y;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class xb
extends pc {
    private static final int super = 0x40000000;

    public static final Map o00000(qb qb2) {
        return Collections.singletonMap(qb2.new(), qb2.o00000());
    }

    private static final Map o00000(g g2) {
        Map map = y.o00000();
        g2.\u00f800000(map);
        return y.\u00d200000(map);
    }

    private static final Map o00000(int n2, g g2) {
        Map map = y.o00000(n2);
        g2.\u00f800000(map);
        return y.\u00d200000(map);
    }

    public static final Map o00000() {
        return new i();
    }

    public static final Map o00000(int n2) {
        return new i(n2);
    }

    public static final Map \u00d200000(Map map) {
        return ((i)map).\u00d80\u00d3000();
    }

    public static final Object o00000(ConcurrentMap concurrentMap, Object object, h object2) {
        Object object3 = concurrentMap.get(object);
        if (object3 == null && (object3 = concurrentMap.putIfAbsent(object, object2 = object2.newreturn())) == null) {
            object3 = object2;
        }
        return object3;
    }

    public static final SortedMap \u00d400000(Map map) {
        return new TreeMap(map);
    }

    public static final SortedMap o00000(Map map, Comparator object) {
        object = new TreeMap(object);
        ((TreeMap)object).putAll(map);
        return (SortedMap)object;
    }

    public static final SortedMap o00000(qb ... qbArray) {
        TreeMap treeMap = new TreeMap();
        y.\u00d200000((Map)treeMap, qbArray);
        return treeMap;
    }

    public static final SortedMap o00000(Comparator object, qb ... qbArray) {
        object = new TreeMap(object);
        y.\u00d200000((Map)object, qbArray);
        return (SortedMap)object;
    }

    private static final Properties Object(Map map) {
        Properties properties = new Properties();
        properties.putAll((Map<?, ?>)map);
        return properties;
    }

    private static final Map o00000(Map map) {
        return y.\u00d500000(map);
    }

    public static final Map \u00d500000(Map object) {
        object = object.entrySet().iterator().next();
        return Collections.singletonMap(object.getKey(), object.getValue());
    }

    public static final int \u00d200000(int n2) {
        if (n2 < 0) {
            return n2;
        }
        if (n2 < 3) {
            return n2 + 1;
        }
        if (n2 < 0x40000000) {
            return (int)((float)n2 / 0.75f + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}

