/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.c;

import b.t.c.b.b.f.b.f;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ib;
import java.util.List;

public final class d
implements f {
    public static final d \u00d200000 = new d();

    private d() {
    }

    @Override
    public final void o00000(ib ib2, List list) {
        throw new IllegalStateException("Incomplete hierarchy for class " + ib2.\u00d5\u00f80000() + ", unresolved classes " + list);
    }

    @Override
    public final void o00000(hc hc2) {
        throw new IllegalStateException("Cannot infer visibility for ".concat(String.valueOf(hc2)));
    }
}

