/*
 * Decompiled with CFR 0.152.
 */
package b.m;

public final class w {
    private static final int o00000(int n2, int n3) {
        if ((n2 %= n3) >= 0) {
            return n2;
        }
        return n2 + n3;
    }

    private static final long o00000(long l2, long l3) {
        long l4 = l2 % l3;
        if (l4 >= 0L) {
            return l4;
        }
        return l4 + l3;
    }

    private static final int o00000(int n2, int n3, int n4) {
        return w.o00000(w.o00000(n2, n4) - w.o00000(n3, n4), n4);
    }

    private static final long \u00d200000(long l2, long l3, long l4) {
        return w.o00000(w.o00000(l2, l4) - w.o00000(l3, l4), l4);
    }

    public static final int \u00d200000(int n2, int n3, int n4) {
        if (n4 > 0) {
            if (n2 >= n3) {
                return n3;
            }
            int n5 = n3;
            return n5 - w.o00000(n5, n2, n4);
        }
        if (n4 < 0) {
            if (n2 <= n3) {
                return n3;
            }
            return n3 + w.o00000(n2, n3, -n4);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long o00000(long l2, long l3, long l4) {
        if (l4 > 0L) {
            if (l2 >= l3) {
                return l3;
            }
            long l5 = l3;
            return l5 - w.\u00d200000(l5, l2, l4);
        }
        if (l4 < 0L) {
            if (l2 <= l3) {
                return l3;
            }
            return l3 + w.\u00d200000(l2, l3, -l4);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}

