/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.b;
import b.i.m;
import b.i.p;
import b.i.y;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c {
    public static final long new(long l2, m m2, long l3) {
        long l4 = b.o00000(l3, m2);
        if ((l2 - 1L | 1L) == Long.MAX_VALUE) {
            return c.o00000(l2, l3, l4);
        }
        if ((l4 - 1L | 1L) == Long.MAX_VALUE) {
            return c.o00000(l2, m2, l3);
        }
        long l5 = l2 + l4;
        if (((l2 ^ l5) & (l4 ^ l5)) < 0L) {
            if (l2 < 0L) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
        return l5;
    }

    private static final long o00000(long l2, long l3, long l4) {
        if (b.\u00d5o0000(l3) && (l2 ^ l4) < 0L) {
            throw new IllegalArgumentException("Summing infinities of different signs");
        }
        return l2;
    }

    private static final long o00000(long l2, m m2, long l3) {
        long l4 = b.o00000(l3, 2);
        long l5 = b.o00000(l4, m2);
        if ((l5 - 1L | 1L) == Long.MAX_VALUE) {
            return l5;
        }
        return c.new(c.new(l2, m2, l4), m2, b.String(l3, l4));
    }

    private static final long o00000(long l2) {
        if (l2 < 0L) {
            return b.void.super();
        }
        return b.void.\u00d600000();
    }

    public static final long o00000(long l2, long l3, m m2) {
        if ((l3 - 1L | 1L) == Long.MAX_VALUE) {
            return b.\u00f600000(c.o00000(l3));
        }
        return c.new(l2, l3, m2);
    }

    public static final long \u00d300000(long l2, long l3, m m2) {
        if ((l3 - 1L | 1L) == Long.MAX_VALUE) {
            if (l2 == l3) {
                return b.void.\u00d400000();
            }
            return b.\u00f600000(c.o00000(l3));
        }
        if ((l2 - 1L | 1L) == Long.MAX_VALUE) {
            return c.o00000(l2);
        }
        return c.new(l2, l3, m2);
    }

    private static final long new(long l2, long l3, m m2) {
        long l4 = l2 - l3;
        if (((l4 ^ l2) & (l4 ^ l3 ^ 0xFFFFFFFFFFFFFFFFL)) < 0L) {
            if (m2.compareTo((Enum)m.\u00f400000) < 0) {
                long l5 = p.\u00d200000(1L, m.\u00f400000, m2);
                long l6 = l2 / l5 - l3 / l5;
                long l7 = l2 % l5 - l3 % l5;
                return b.\u00d200000(y.new(l6, m.\u00f400000), y.new(l7, m2));
            }
            return b.\u00f600000(c.o00000(l4));
        }
        return y.new(l4, m2);
    }

    public static final boolean new(long l2) {
        return (l2 - 1L | 1L) == Long.MAX_VALUE;
    }
}

