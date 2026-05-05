/*
 * Decompiled with CFR 0.152.
 */
package b.b;

import b.b.e;
import b.b.f;
import b.e.j;
import b.e.m;
import b.e.u;
import b.e.x;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h {
    public static final f super(int n2) {
        int n3 = n2;
        return new e(n3, n3 >> 31);
    }

    public static final f super(long l2) {
        return new e((int)l2, (int)(l2 >> 32));
    }

    public static final int super(f f2, m m2) {
        if (((x)m2).if()) {
            throw new IllegalArgumentException("Cannot get random in empty range: ".concat(String.valueOf(m2)));
        }
        if (m2.oo0000() < Integer.MAX_VALUE) {
            return f2.o00000(m2.\u00f8O0000(), m2.oo0000() + 1);
        }
        if (m2.\u00f8O0000() > Integer.MIN_VALUE) {
            return f2.o00000(m2.\u00f8O0000() - 1, m2.oo0000()) + 1;
        }
        return f2.\u00d200000();
    }

    public static final long super(f f2, j j2) {
        if (((u)j2).if()) {
            throw new IllegalArgumentException("Cannot get random in empty range: ".concat(String.valueOf(j2)));
        }
        if (j2.oO0000() < Long.MAX_VALUE) {
            return f2.o00000(j2.\u00d3O0000(), j2.oO0000() + 1L);
        }
        if (j2.\u00d3O0000() > Long.MIN_VALUE) {
            return f2.o00000(j2.\u00d3O0000() - 1L, j2.oO0000()) + 1L;
        }
        return f2.\u00d500000();
    }

    public static final int \u00d200000(int n2) {
        return 31 - Integer.numberOfLeadingZeros(n2);
    }

    public static final int \u00d200000(int n2, int n3) {
        return n2 >>> 32 - n3 & -n3 >> 31;
    }

    public static final void super(int n2, int n3) {
        if (!(n3 > n2)) {
            String string = h.super((Object)n2, (Object)n3);
            throw new IllegalArgumentException(string.toString());
        }
    }

    public static final void super(long l2, long l3) {
        if (!(l3 > l2)) {
            String string = h.super((Object)l2, (Object)l3);
            throw new IllegalArgumentException(string.toString());
        }
    }

    public static final void super(double d2, double d3) {
        if (!(d3 > d2)) {
            String string = h.super((Object)d2, (Object)d3);
            throw new IllegalArgumentException(string.toString());
        }
    }

    public static final String super(Object object, Object object2) {
        return "Random range is empty: [" + object + ", " + object2 + ").";
    }
}

