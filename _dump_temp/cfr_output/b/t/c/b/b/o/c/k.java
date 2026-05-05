/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.m;
import b.o.e.g;
import b.t.c.b.b.b.c;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.q.bc;
import java.util.List;

public class k
extends j {
    private final g \u00d400000;

    public k(List list, g g2) {
        super(list);
        this.\u00d400000 = g2;
    }

    @Override
    public rc o00000(bc object) {
        boolean bl;
        rc rc2 = (rc)(object = this.\u00d400000.\u00f800000(object));
        boolean bl2 = bl = c.\u00d800000(rc2) || c.\u00d200000(rc2) || c.\u00d2O0000(rc2);
        if (m.new && !bl) {
            object = "Type should be an array, but was " + rc2 + ": " + this.o00000();
            throw new AssertionError(object);
        }
        return (rc)object;
    }
}

