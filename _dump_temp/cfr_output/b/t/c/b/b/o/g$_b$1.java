/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.cb;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.g;

public final class g$_b$1
extends cb {
    final /* synthetic */ g OO0000;

    g$_b$1(boolean bl, boolean bl2, boolean bl3, g g2, b.t.c.b.b.h.e.g g3, b b2) {
        this.OO0000 = g2;
        super(bl, bl2, bl3, true, g2, g3, b2);
    }

    @Override
    public final boolean o00000(q object, q q2) {
        if (!(object instanceof rc)) {
            object = "Failed requirement.";
            throw new IllegalArgumentException(object.toString());
        }
        if (!(q2 instanceof rc)) {
            object = "Failed requirement.";
            throw new IllegalArgumentException(object.toString());
        }
        return (Boolean)g.o00000(this.OO0000).o00000(object, q2);
    }
}

