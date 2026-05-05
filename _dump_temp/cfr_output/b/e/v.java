/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.ab;
import b.e.cb;
import b.e.e;
import b.e.g;
import b.e.h;
import b.e.i;
import b.e.q;
import b.e.s;
import b.e.y;

class v {
    public static final g o00000(Comparable comparable, Comparable comparable2) {
        return new i(comparable, comparable2);
    }

    public static final h \u00d200000(Comparable comparable, Comparable comparable2) {
        return new cb(comparable, comparable2);
    }

    public static final ab \u00d200000(double d2, double d3) {
        return new s(d2, d3);
    }

    public static final h o00000(double d2, double d3) {
        return new y(d2, d3);
    }

    public static final ab o00000(float f2, float f3) {
        return new e(f2, f3);
    }

    public static final h \u00d200000(float f2, float f3) {
        return new q(f2, f3);
    }

    private static final boolean o00000(g g2, Comparable comparable) {
        return comparable != null && g2.o00000(comparable);
    }

    private static final /* synthetic */ boolean o00000(g g2, Object object) {
        return object != null && g2.o00000((Comparable)object);
    }

    private static final boolean o00000(h h2, Comparable comparable) {
        return comparable != null && h2.o00000(comparable);
    }

    private static final /* synthetic */ boolean o00000(h h2, Object object) {
        return object != null && h2.o00000((Comparable)object);
    }

    public static final void o00000(boolean bl, Number number) {
        if (!bl) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }
}

