/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.y.d;
import java.util.Comparator;

final class h
implements Comparator {
    public static final h o00000 = new h();

    private h() {
    }

    public final int o00000(Comparable comparable, Comparable comparable2) {
        return comparable2.compareTo(comparable);
    }

    public final Comparator reversed() {
        return d.o00000;
    }
}

