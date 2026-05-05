/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.w;
import b.o.e.g;
import b.t.c.b.b.h.zb;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class zb$_b
extends b.t.c.b.b.g.g {
    private zb$_b() {
    }

    @Override
    public final int o00000(ConcurrentHashMap concurrentHashMap, String string, g object) {
        Integer n2 = (Integer)concurrentHashMap.get(string);
        if (n2 != null) {
            return n2;
        }
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        synchronized (concurrentHashMap2) {
            int n3;
            Integer n4 = (Integer)concurrentHashMap.get(string);
            if (n4 != null) {
                n3 = n4;
            } else {
                object = object.\u00f800000(string);
                int n5 = ((Number)object).intValue();
                concurrentHashMap.putIfAbsent(string, n5);
                n3 = ((Number)object).intValue();
            }
            int n6 = n3;
            return n6;
        }
    }

    public final zb Object() {
        return zb.O\u00f4\u00d3000();
    }

    public final zb o00000(List list) {
        if (list.isEmpty()) {
            return this.Object();
        }
        return new zb(list, null);
    }

    public static final /* synthetic */ Collection o00000(zb$_b zb$_b) {
        return zb$_b.\u00d200000();
    }

    public /* synthetic */ zb$_b(w w2) {
        this();
    }
}

