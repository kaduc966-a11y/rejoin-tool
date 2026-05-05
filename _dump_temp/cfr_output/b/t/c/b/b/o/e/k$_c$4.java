/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.t.c.b.b.o.e.k;
import b.t.c.b.b.o.i;
import b.t.c.b.b.o.u;
import b.t.c.b.b.q.hc;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k$_c$4
extends u {
    final /* synthetic */ ArrayList \u00d500000;
    final /* synthetic */ k \u00d400000;

    k$_c$4(ArrayList arrayList, k k2) {
        this.\u00d500000 = arrayList;
        this.\u00d400000 = k2;
    }

    @Override
    public final void super(hc hc2) {
        i.o00000(hc2, null);
        this.\u00d500000.add(hc2);
    }

    @Override
    public final void \u00d300000(hc hc2, hc hc3) {
        throw new IllegalStateException(("Conflict in scope of " + this.\u00d400000.\u00f4\u00d20000() + ": " + hc2 + " vs " + hc3).toString());
    }
}

