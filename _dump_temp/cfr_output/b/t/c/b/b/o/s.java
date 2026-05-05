/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.m;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.hc;
import java.util.Collection;

public final class s {
    public static final hc o00000(Collection iterator) {
        boolean bl;
        boolean bl2 = bl = !iterator.isEmpty();
        if (m.new && !bl) {
            iterator = "Assertion failed";
            throw new AssertionError(iterator);
        }
        hc hc2 = null;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            hc hc3 = (hc)iterator.next();
            if (hc2 == null) {
                hc2 = hc3;
                continue;
            }
            Integer n2 = eb.super(hc2.\u00d50O000(), hc3.\u00d50O000());
            if (n2 == null || n2 >= 0) continue;
            hc2 = hc3;
        }
        return hc2;
    }
}

