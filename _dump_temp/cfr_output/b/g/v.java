/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.n;
import b.g.v$_b$1;
import b.o.e.g;
import b.o.e.h;
import java.util.Iterator;

final class v
implements n {
    private final h \u00d3\u00d20000;
    private final g \u00d4\u00d20000;

    public v(h h2, g g2) {
        this.\u00d3\u00d20000 = h2;
        this.\u00d4\u00d20000 = g2;
    }

    @Override
    public final Iterator o00000() {
        return new v$_b$1(this);
    }

    public static final /* synthetic */ h \u00d200000(v v2) {
        return v2.\u00d3\u00d20000;
    }

    public static final /* synthetic */ g o00000(v v2) {
        return v2.\u00d4\u00d20000;
    }
}

