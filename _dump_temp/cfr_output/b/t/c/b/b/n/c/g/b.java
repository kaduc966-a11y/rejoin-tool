/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.s.y;
import b.t.c.b.b.n.c.g.m;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {
    private final Map o00000;

    public b(Map map) {
        this.o00000 = map;
    }

    public final Map \u00d200000() {
        return this.o00000;
    }

    public final b o00000() {
        Map map = this.o00000;
        Map map2 = map;
        map = new LinkedHashMap(y.\u00d200000(map.size()));
        for (Object object : (Iterable)map2.entrySet()) {
            Object object2 = (Map.Entry)object;
            Map map3 = map;
            object = (Map.Entry)object;
            map3 = object2.getKey();
            object2 = map3;
            object = m.o00000((m)object.getValue(), null, null, false, true, true, 7, null);
            object2.put(map3, object);
        }
        return new b(map);
    }
}

