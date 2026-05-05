/*
 * Decompiled with CFR 0.152.
 */
package b.r;

import b.r.d$_b$_b;
import b.r.i;
import b.r.l;
import java.io.Serializable;

final class d$_b
implements Serializable {
    public static final d$_b$_b Object = new d$_b$_b(null);
    private final l[] o00000;
    private static final long \u00d200000 = 0L;

    public d$_b(l[] lArray) {
        this.o00000 = lArray;
    }

    public final l[] \u00d200000() {
        return this.o00000;
    }

    private final Object o00000() {
        l[] lArray = this.o00000;
        l l2 = i.o00000;
        for (l l3 : lArray) {
            i i2 = l2;
            l2 = l3;
            l2 = ((l)i2).super(l2);
        }
        return l2;
    }
}

