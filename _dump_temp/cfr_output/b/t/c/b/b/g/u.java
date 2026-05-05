/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.t.c.b.b.b.l;
import b.t.c.b.b.g.d;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.jc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class u
implements d {
    public static final u \u00d6O0000 = new u();
    private static final String \u00d5O0000 = "second parameter must be of type KProperty<*> or its supertype";

    private u() {
    }

    @Override
    public final String o00000() {
        return \u00d5O0000;
    }

    @Override
    public final boolean new(ic b2) {
        b2 = (jc)b2.\u00f5\u00d8o000().get(1);
        rc rc2 = l.\u00f600000.o00000(b.\u00d500000(b2));
        if (rc2 != null) {
            return b.t.c.b.b.h.b.b.super(rc2, b.t.c.b.b.h.b.b.\u00f400000(b2.forclasssuper()));
        }
        return false;
    }
}

