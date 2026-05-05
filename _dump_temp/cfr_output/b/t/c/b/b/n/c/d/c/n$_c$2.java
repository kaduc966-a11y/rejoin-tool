/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.c;

import b.o.e.g;
import b.t.c.b.b.m.b$_h;
import b.t.c.b.b.n.c.d.c.l;
import b.t.c.b.b.q.ib;
import java.util.Collection;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class n$_c$2
extends b$_h {
    final /* synthetic */ ib \u00d800000;
    final /* synthetic */ Set return;
    final /* synthetic */ g \u00d500000;

    n$_c$2(ib ib2, Set set, g g2) {
        this.\u00d800000 = ib2;
        this.return = set;
        this.\u00d500000 = g2;
    }

    public final boolean \u00d200000(ib object) {
        if (object == this.\u00d800000) {
            return true;
        }
        if ((object = object.\u00d3\u00d2\u00d2000()) instanceof l) {
            this.return.addAll((Collection)this.\u00d500000.\u00f800000(object));
            return false;
        }
        return true;
    }

    public final void \u00d400000() {
    }
}

