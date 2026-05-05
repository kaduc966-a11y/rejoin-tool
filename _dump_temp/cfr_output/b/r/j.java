/*
 * Decompiled with CFR 0.152.
 */
package b.r;

import b.o.e.g;
import b.r.l$_b;
import b.r.l$_c;

public abstract class j
implements l$_b {
    private final g \u00d200000;
    private final l$_b o00000;

    public j(l$_b l$_b, g g2) {
        this.\u00d200000 = g2;
        this.o00000 = l$_b instanceof j ? ((j)l$_b).o00000 : l$_b;
    }

    public final l$_c o00000(l$_c l$_c) {
        return (l$_c)this.\u00d200000.\u00f800000(l$_c);
    }

    public final boolean o00000(l$_b l$_b) {
        return l$_b == this || this.o00000 == l$_b;
    }
}

