/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.g.n;
import b.o.d.rb;
import b.o.e.g;
import b.qb;
import b.s.h;
import b.s.hc;
import b.s.mc;
import b.s.xb;
import b.s.y;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class gb
extends xb {
    public static final Map Object() {
        return hc.\u00d50\u00f6000;
    }

    public static final Map \u00d600000(qb ... qbArray) {
        if (qbArray.length > 0) {
            return y.o00000(qbArray, (Map)new LinkedHashMap(y.\u00d200000(qbArray.length)));
        }
        return y.Object();
    }

    private static final Map \u00d200000() {
        return y.Object();
    }

    private static final Map \u00d500000() {
        return new LinkedHashMap();
    }

    public static final Map \u00d500000(qb ... qbArray) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.\u00d200000(qbArray.length));
        y.\u00d200000((Map)linkedHashMap, qbArray);
        return linkedHashMap;
    }

    private static final HashMap \u00d400000() {
        return new HashMap();
    }

    public static final HashMap \u00d200000(qb ... qbArray) {
        HashMap hashMap = new HashMap(y.\u00d200000(qbArray.length));
        y.\u00d200000((Map)hashMap, qbArray);
        return hashMap;
    }

    private static final LinkedHashMap \u00d600000() {
        return new LinkedHashMap();
    }

    public static final LinkedHashMap Object(qb ... qbArray) {
        return (LinkedHashMap)y.o00000(qbArray, (Map)new LinkedHashMap(y.\u00d200000(qbArray.length)));
    }

    private static final Map \u00d200000(g g2) {
        Map map = y.o00000();
        g2.\u00f800000(map);
        return y.\u00d200000(map);
    }

    private static final Map \u00d200000(int n2, g g2) {
        Map map = y.o00000(n2);
        g2.\u00f800000(map);
        return y.\u00d200000(map);
    }

    private static final boolean \u00d600000(Map map) {
        return !map.isEmpty();
    }

    private static final boolean \u00f500000(Map map) {
        return map == null || map.isEmpty();
    }

    private static final Map \u00f400000(Map map) {
        Map map2 = map;
        if (map2 == null) {
            map2 = y.Object();
        }
        return map2;
    }

    private static final Object o00000(Map map, b.o.e.h h2) {
        if (map.isEmpty()) {
            return h2.newreturn();
        }
        return map;
    }

    private static final boolean void(Map map, Object object) {
        return map.containsKey(object);
    }

    private static final Object \u00d200000(Map map, Object object) {
        return map.get(object);
    }

    private static final void o00000(Map map, Object object, Object object2) {
        map.put(object, object2);
    }

    private static final boolean Object(Map map, Object object) {
        return map.containsKey(object);
    }

    private static final boolean \u00d600000(Map map, Object object) {
        return map.containsValue(object);
    }

    private static final Object \u00d500000(Map map, Object object) {
        return rb.Object(map).remove(object);
    }

    private static final Object o00000(Map.Entry entry) {
        return entry.getKey();
    }

    private static final Object \u00d400000(Map.Entry entry) {
        return entry.getValue();
    }

    private static final qb Object(Map.Entry entry) {
        return new qb(entry.getKey(), entry.getValue());
    }

    public static final Map.Entry \u00d200000(Map.Entry entry) {
        h h2 = entry instanceof h ? (h)entry : null;
        if (h2 != null) {
            return h2;
        }
        return y.o00000(entry.getKey(), entry.getValue());
    }

    public static final Map.Entry o00000(Object object, Object object2) {
        return new h(object, object2);
    }

    private static final Object Object(Map map, Object object, b.o.e.h h2) {
        Object object2 = map.get(object);
        if (object2 == null) {
            object2 = h2.newreturn();
        }
        return object2;
    }

    public static final Object o00000(Map map, Object object, b.o.e.h h2) {
        Object v2 = map.get(object);
        if (v2 == null && !map.containsKey(object)) {
            return h2.newreturn();
        }
        return v2;
    }

    public static final Object \u00d400000(Map map, Object object) {
        return y.o00000(map, object);
    }

    public static final Object \u00d200000(Map map, Object object, b.o.e.h object2) {
        Object v2 = map.get(object);
        if (v2 == null) {
            object2 = object2.newreturn();
            map.put(object, object2);
            return object2;
        }
        return v2;
    }

    private static final Iterator void(Map map) {
        return map.entrySet().iterator();
    }

    private static final Iterator oO0000(Map map) {
        return map.entrySet().iterator();
    }

    public static final Map \u00d200000(Map object, Map map, g g2) {
        for (Object e2 : (Iterable)object.entrySet()) {
            Map.Entry entry = (Map.Entry)e2;
            Map map2 = map;
            map2.put(entry.getKey(), g2.\u00f800000(e2));
        }
        return map;
    }

    public static final Map Object(Map object, Map map, g g2) {
        for (Object object2 : (Iterable)object.entrySet()) {
            Object object3 = g2.\u00f800000(object2);
            object2 = (Map.Entry)object2;
            Object object4 = object3;
            Map map2 = map;
            object2 = object2.getValue();
            map2.put(object4, object2);
        }
        return map;
    }

    public static final void \u00d200000(Map map, qb[] qbArray) {
        for (qb qb2 : qbArray) {
            Object object = qb2.\u00d400000();
            Object object2 = qb2.\u00d300000();
            map.put(object, object2);
        }
    }

    public static final void \u00d400000(Map map, Iterable object) {
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (qb)object.next();
            Object object3 = ((qb)object2).\u00d400000();
            object2 = ((qb)object2).\u00d300000();
            map.put(object3, object2);
        }
    }

    public static final void Object(Map map, n object) {
        object = object.o00000();
        while (object.hasNext()) {
            Object object2 = (qb)object.next();
            Object object3 = ((qb)object2).\u00d400000();
            object2 = ((qb)object2).\u00d300000();
            map.put(object3, object2);
        }
    }

    public static final Map \u00d600000(Map map, g g2) {
        Map map2 = map;
        map = new LinkedHashMap(y.\u00d200000(map.size()));
        for (Object e2 : (Iterable)map2.entrySet()) {
            Map.Entry entry = (Map.Entry)e2;
            Map map3 = map;
            map3.put(entry.getKey(), g2.\u00f800000(e2));
        }
        return map;
    }

    public static final Map \u00f400000(Map map, g g2) {
        Map map2 = map;
        map = new LinkedHashMap(y.\u00d200000(map.size()));
        for (Object object : (Iterable)map2.entrySet()) {
            Object object2 = g2.\u00f800000(object);
            object = (Map.Entry)object;
            Object object3 = object2;
            Map map3 = map;
            object = object.getValue();
            map3.put(object3, object);
        }
        return map;
    }

    public static final Map \u00d500000(Map object, g g2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : object.entrySet()) {
            if (!((Boolean)g2.\u00f800000(entry.getKey())).booleanValue()) continue;
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final Map \u00d400000(Map object, g g2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : object.entrySet()) {
            if (!((Boolean)g2.\u00f800000(entry.getValue())).booleanValue()) continue;
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final Map \u00d400000(Map object, Map map, g g2) {
        for (Map.Entry entry : object.entrySet()) {
            if (!((Boolean)g2.\u00f800000(entry)).booleanValue()) continue;
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public static final Map Object(Map object, g g2) {
        Map map = new LinkedHashMap();
        for (Map.Entry entry : object.entrySet()) {
            if (!((Boolean)g2.\u00f800000(entry)).booleanValue()) continue;
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public static final Map o00000(Map object, Map map, g g2) {
        for (Map.Entry entry : object.entrySet()) {
            if (((Boolean)g2.\u00f800000(entry)).booleanValue()) continue;
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public static final Map void(Map object, g g2) {
        Map map = new LinkedHashMap();
        for (Map.Entry entry : object.entrySet()) {
            if (((Boolean)g2.\u00f800000(entry)).booleanValue()) continue;
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public static final Map o00000(Iterable iterable) {
        if (iterable instanceof Collection) {
            switch (((Collection)iterable).size()) {
                case 0: {
                    return y.Object();
                }
                case 1: {
                    return y.o00000(iterable instanceof List ? (qb)((List)iterable).get(0) : (qb)((Collection)iterable).iterator().next());
                }
            }
            return y.o00000(iterable, (Map)new LinkedHashMap(y.\u00d200000(((Collection)iterable).size())));
        }
        return y.float(y.o00000(iterable, (Map)new LinkedHashMap()));
    }

    public static final Map o00000(Iterable iterable, Map map) {
        y.\u00d400000(map, iterable);
        return map;
    }

    public static final Map \u00d400000(qb[] qbArray) {
        switch (qbArray.length) {
            case 0: {
                return y.Object();
            }
            case 1: {
                return y.o00000(qbArray[0]);
            }
        }
        return y.o00000(qbArray, (Map)new LinkedHashMap(y.\u00d200000(qbArray.length)));
    }

    public static final Map o00000(qb[] qbArray, Map map) {
        y.\u00d200000(map, qbArray);
        return map;
    }

    public static final Map o00000(n n2) {
        return y.float(y.o00000(n2, (Map)new LinkedHashMap()));
    }

    public static final Map o00000(n n2, Map map) {
        y.Object(map, n2);
        return map;
    }

    public static final Map OO0000(Map map) {
        switch (map.size()) {
            case 0: {
                return y.Object();
            }
            case 1: {
                return y.\u00d500000(map);
            }
        }
        return y.\u00f600000(map);
    }

    public static final Map \u00f600000(Map map) {
        return new LinkedHashMap(map);
    }

    public static final Map o00000(Map map, Map map2) {
        map2.putAll(map);
        return map2;
    }

    public static final Map \u00d200000(Map linkedHashMap, qb qb2) {
        if (linkedHashMap.isEmpty()) {
            return y.o00000(qb2);
        }
        linkedHashMap = new LinkedHashMap<Object, Object>(linkedHashMap);
        linkedHashMap.put(qb2.new(), qb2.o00000());
        return linkedHashMap;
    }

    public static final Map o00000(Map linkedHashMap, Iterable iterable) {
        if (linkedHashMap.isEmpty()) {
            return y.o00000(iterable);
        }
        linkedHashMap = new LinkedHashMap(linkedHashMap);
        y.\u00d400000((Map)linkedHashMap, iterable);
        return linkedHashMap;
    }

    public static final Map o00000(Map linkedHashMap, qb[] qbArray) {
        if (linkedHashMap.isEmpty()) {
            return y.\u00d400000(qbArray);
        }
        linkedHashMap = new LinkedHashMap(linkedHashMap);
        y.\u00d200000((Map)linkedHashMap, qbArray);
        return linkedHashMap;
    }

    public static final Map \u00d400000(Map linkedHashMap, n n2) {
        linkedHashMap = new LinkedHashMap(linkedHashMap);
        y.Object((Map)linkedHashMap, n2);
        return y.float(linkedHashMap);
    }

    public static final Map Object(Map linkedHashMap, Map map) {
        linkedHashMap = new LinkedHashMap(linkedHashMap);
        linkedHashMap.putAll(map);
        return linkedHashMap;
    }

    private static final void o00000(Map map, qb qb2) {
        map.put(qb2.new(), qb2.o00000());
    }

    private static final void \u00d500000(Map map, Iterable iterable) {
        y.\u00d400000(map, iterable);
    }

    private static final void Object(Map map, qb[] qbArray) {
        y.\u00d200000(map, qbArray);
    }

    private static final void \u00d200000(Map map, n n2) {
        y.Object(map, n2);
    }

    private static final void \u00d200000(Map map, Map map2) {
        map.putAll(map2);
    }

    public static final Map \u00f400000(Map map, Object object) {
        map = y.\u00f600000(map);
        map.remove(object);
        return y.float(map);
    }

    public static final Map Object(Map map, Iterable iterable) {
        map = y.\u00f600000(map);
        mc.\u00d400000((Collection)map.keySet(), iterable);
        return y.float(map);
    }

    public static final Map o00000(Map map, Object[] objectArray) {
        map = y.\u00f600000(map);
        mc.\u00d800000(map.keySet(), objectArray);
        return y.float(map);
    }

    public static final Map o00000(Map map, n n2) {
        map = y.\u00f600000(map);
        mc.\u00d400000((Collection)map.keySet(), n2);
        return y.float(map);
    }

    private static final void \u00f500000(Map map, Object object) {
        map.remove(object);
    }

    private static final void \u00d200000(Map map, Iterable iterable) {
        mc.\u00d400000((Collection)map.keySet(), iterable);
    }

    private static final void \u00d200000(Map map, Object[] objectArray) {
        mc.\u00d800000(map.keySet(), objectArray);
    }

    private static final void \u00d500000(Map map, n n2) {
        mc.\u00d400000((Collection)map.keySet(), n2);
    }

    public static final Map float(Map map) {
        switch (map.size()) {
            case 0: {
                return y.Object();
            }
            case 1: {
                return y.\u00d500000(map);
            }
        }
        return map;
    }
}

