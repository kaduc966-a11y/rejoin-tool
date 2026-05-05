/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.e.g;
import b.t.c.b.vb;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class rc
extends vb {
    private final g \u00d200000;
    private final ConcurrentHashMap o00000;

    public rc(g g2) {
        this.\u00d200000 = g2;
        this.o00000 = new ConcurrentHashMap();
    }

    @Override
    public final Object o00000(Class object) {
        ConcurrentMap concurrentMap = this.o00000;
        Object object2 = object;
        Object object3 = concurrentMap.get(object2);
        if (object3 == null && (object3 = concurrentMap.putIfAbsent(object2, object = this.\u00d200000.\u00f800000(object))) == null) {
            object3 = object;
        }
        return object3;
    }

    @Override
    public final void o00000() {
        this.o00000.clear();
    }
}

