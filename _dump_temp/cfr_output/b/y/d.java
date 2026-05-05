/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.y.h;
import java.util.Comparator;

final class d
implements Comparator {
    public static final d o00000 = new d();

    private d() {
    }

    public final int o00000(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public final Comparator reversed() {
        return h.o00000;
    }
}

