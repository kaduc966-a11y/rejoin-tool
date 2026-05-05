/*
 * Decompiled with CFR 0.152.
 */
package b.m;

import b.ac;
import b.f;

public final class r {
    private static final int \u00d200000(int n2, int n3, int n4) {
        if (Integer.compareUnsigned(n2 = Integer.remainderUnsigned(n2, n4), n3 = Integer.remainderUnsigned(n3, n4)) >= 0) {
            return ac.\u00d500000(n2 - n3);
        }
        return ac.\u00d500000(ac.\u00d500000(n2 - n3) + n4);
    }

    private static final long \u00d200000(long l2, long l3, long l4) {
        long l5;
        long l6 = Long.remainderUnsigned(l2, l4);
        if (Long.compareUnsigned(l6, l5 = Long.remainderUnsigned(l3, l4)) >= 0) {
            return f.super(l6 - l5);
        }
        return f.super(f.super(l6 - l5) + l4);
    }

    public static final int o00000(int n2, int n3, int n4) {
        if (n4 > 0) {
            if (Integer.compareUnsigned(n2, n3) >= 0) {
                return n3;
            }
            int n5 = n3;
            return ac.\u00d500000(n5 - r.\u00d200000(n5, n2, ac.\u00d500000(n4)));
        }
        if (n4 < 0) {
            if (Integer.compareUnsigned(n2, n3) <= 0) {
                return n3;
            }
            return ac.\u00d500000(n3 + r.\u00d200000(n2, n3, ac.\u00d500000(-n4)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final long o00000(long l2, long l3, long l4) {
        if (l4 > 0L) {
            if (Long.compareUnsigned(l2, l3) >= 0) {
                return l3;
            }
            long l5 = l3;
            return f.super(l5 - r.\u00d200000(l5, l2, f.super(l4)));
        }
        if (l4 < 0L) {
            if (Long.compareUnsigned(l2, l3) <= 0) {
                return l3;
            }
            return f.super(l3 + r.\u00d200000(l2, l3, f.super(-l4)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}

