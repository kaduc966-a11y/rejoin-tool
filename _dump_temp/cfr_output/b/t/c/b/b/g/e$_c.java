/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.t.c.b.b.g.e;
import b.t.c.b.b.q.ic;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e$_c
extends e {
    private final int \u00d300000;

    public e$_c(int n2) {
        super("must have at least " + n2 + " value parameter" + (n2 > 1 ? "s" : ""), null);
        this.\u00d300000 = n2;
    }

    @Override
    public final boolean new(ic ic2) {
        return ic2.\u00f5\u00d8o000().size() >= this.\u00d300000;
    }
}

