/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.o.e.h;
import b.t.c.b.b.b.c;
import b.t.c.b.b.b.c$_b;
import b.t.c.b.b.b.j;
import b.t.c.b.b.h.ib;
import java.util.EnumMap;
import java.util.HashMap;

class c$2
implements h {
    final /* synthetic */ c \u00d40O000;

    c$2(c c2) {
        this.\u00d40O000 = c2;
    }

    public c$_b \u00d4\u00f40000() {
        EnumMap<j, ib> enumMap = new EnumMap<j, ib>(j.class);
        HashMap<ib, ib> hashMap = new HashMap<ib, ib>();
        HashMap<ib, ib> hashMap2 = new HashMap<ib, ib>();
        for (j j2 : j.values()) {
            ib ib2 = c.o00000(this.\u00d40O000, j2.\u00d500000().\u00d400000());
            ib ib3 = c.o00000(this.\u00d40O000, j2.o00000().\u00d400000());
            enumMap.put(j2, ib3);
            hashMap.put(ib2, ib3);
            hashMap2.put(ib3, ib2);
        }
        return new c$_b(enumMap, hashMap, hashMap2, null);
    }
}

