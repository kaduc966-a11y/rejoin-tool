/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.t.c.b.b.g.e;
import b.t.c.b.b.q.ic;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e$_d
extends e {
    private final int String;

    public e$_d(int n2) {
        super("must have exactly " + n2 + " value parameters", null);
        this.String = n2;
    }

    @Override
    public final boolean new(ic ic2) {
        return ic2.\u00f5\u00d8o000().size() == this.String;
    }
}

