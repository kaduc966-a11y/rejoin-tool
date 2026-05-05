/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.o.d.fc;
import b.t.c.b.b.b.c;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.b.e;
import b.t.c.b.b.n.c.k;
import b.t.c.b.b.n.c.y$_b$0;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.qb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class y
extends k {
    public static final y \u00d3O0000 = new y();

    private y() {
    }

    public final f new(qb qb2) {
        String string = e.\u00d200000(qb2);
        if (string == null) {
            return null;
        }
        return (f)k.\u00d2O0000.\u00d500000().get(string);
    }

    public final boolean o00000(qb qb2) {
        return c.\u00d500000(qb2) && b.o00000(qb2, false, new y$_b$0(qb2), 1, null) != null;
    }

    public final boolean \u00d300000(qb qb2) {
        return fc.o00000((Object)qb2.\u00d5\u00f80000().\u00d400000(), (Object)"removeAt") && fc.o00000((Object)e.\u00d200000(qb2), (Object)k.\u00d2O0000.\u00f400000().\u00d200000());
    }

    private static final boolean new(qb qb2, hc hc2) {
        return k.\u00d2O0000.\u00d500000().containsKey(e.\u00d200000(qb2));
    }

    static /* synthetic */ boolean o00000(qb qb2, hc hc2) {
        return y.new(qb2, hc2);
    }
}

