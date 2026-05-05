/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.h$_c$1;
import b.g.n;
import b.o.e.g;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
implements n {
    private final n while;
    private final g OO0000;
    private final g oO0000;

    public h(n n2, g g2, g g3) {
        this.while = n2;
        this.OO0000 = g2;
        this.oO0000 = g3;
    }

    @Override
    public final Iterator o00000() {
        return new h$_c$1(this);
    }

    public static final /* synthetic */ n \u00d300000(h h2) {
        return h2.while;
    }

    public static final /* synthetic */ g \u00d200000(h h2) {
        return h2.oO0000;
    }

    public static final /* synthetic */ g o00000(h h2) {
        return h2.OO0000;
    }
}

