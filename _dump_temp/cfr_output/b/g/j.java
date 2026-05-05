/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.h;
import b.g.j$_b$1;
import b.g.n;
import b.o.e.g;
import java.util.Iterator;

public final class j
implements n {
    private final n \u00d4O0000;
    private final g \u00d3O0000;

    public j(n n2, g g2) {
        this.\u00d4O0000 = n2;
        this.\u00d3O0000 = g2;
    }

    @Override
    public final Iterator o00000() {
        return new j$_b$1(this);
    }

    public final n o00000(g g2) {
        return new h(this.\u00d4O0000, this.\u00d3O0000, g2);
    }

    public static final /* synthetic */ n \u00d200000(j j2) {
        return j2.\u00d4O0000;
    }

    public static final /* synthetic */ g o00000(j j2) {
        return j2.\u00d3O0000;
    }
}

