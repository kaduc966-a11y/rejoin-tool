/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.ac;
import b.f;
import b.o.d.fc;
import b.q.h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class jc {
    public static final int \u00d200000(int n2, int n3) {
        return ac.\u00d500000((int)(((long)n2 & 0xFFFFFFFFL) % ((long)n3 & 0xFFFFFFFFL)));
    }

    public static final int \u00d400000(int n2, int n3) {
        return ac.\u00d500000((int)(((long)n2 & 0xFFFFFFFFL) / ((long)n3 & 0xFFFFFFFFL)));
    }

    public static final long \u00d200000(long l2, long l3) {
        long l4;
        long l5 = l2;
        long l6 = l3;
        if (l6 < 0L) {
            if (Long.compareUnsigned(l2, l3) < 0) {
                return f.super(0L);
            }
            return f.super(1L);
        }
        if (l5 >= 0L) {
            return f.super(l5 / l6);
        }
        long l7 = l5 - (l4 = (l5 >>> 1) / l6 << 1) * l6;
        return f.super(l4 + (long)(Long.compareUnsigned(f.super(l7), f.super(l6)) >= 0 ? 1 : 0));
    }

    public static final long \u00d300000(long l2, long l3) {
        long l4 = l2;
        long l5 = l3;
        if (l5 < 0L) {
            if (Long.compareUnsigned(l2, l3) < 0) {
                return l2;
            }
            return f.super(l2 - l3);
        }
        if (l4 >= 0L) {
            return f.super(l4 % l5);
        }
        long l6 = (l4 >>> 1) / l5 << 1;
        long l7 = l4 - l6 * l5;
        return f.super(l7 - (Long.compareUnsigned(f.super(l7), f.super(l5)) >= 0 ? l5 : 0L));
    }

    public static final int \u00d300000(int n2, int n3) {
        return fc.o00000(n2 ^ Integer.MIN_VALUE, n3 ^ Integer.MIN_VALUE);
    }

    public static final int super(long l2, long l3) {
        return fc.o00000(l2 ^ Long.MIN_VALUE, l3 ^ Long.MIN_VALUE);
    }

    private static final long \u00d200000(int n2) {
        return f.super((long)n2 & 0xFFFFFFFFL);
    }

    private static final long \u00d400000(int n2) {
        return (long)n2 & 0xFFFFFFFFL;
    }

    private static final float class(int n2) {
        return (float)jc.\u00d300000(n2);
    }

    private static final int \u00d200000(float f2) {
        return jc.\u00d200000((double)f2);
    }

    public static final double \u00d300000(int n2) {
        return (double)(n2 & Integer.MAX_VALUE) + (double)(n2 >>> 31 << 30) * 2.0;
    }

    public static final int \u00d200000(double d2) {
        if (Double.isNaN(d2)) {
            return 0;
        }
        if (d2 <= 0.0) {
            return 0;
        }
        if (d2 >= 4.294967295E9) {
            return -1;
        }
        if (d2 <= 2.147483647E9) {
            return ac.\u00d500000((int)d2);
        }
        return ac.\u00d500000(ac.\u00d500000((int)(d2 - 2.147483647E9)) + Integer.MAX_VALUE);
    }

    private static final float \u00d200000(long l2) {
        return (float)jc.super(l2);
    }

    private static final long super(float f2) {
        return jc.super((double)f2);
    }

    public static final double super(long l2) {
        return (double)(l2 >>> 11) * 2048.0 + (double)(l2 & 0x7FFL);
    }

    public static final long super(double d2) {
        if (Double.isNaN(d2)) {
            return 0L;
        }
        if (d2 <= 0.0) {
            return 0L;
        }
        if (d2 >= 1.8446744073709552E19) {
            return -1L;
        }
        if (d2 < 9.223372036854776E18) {
            return f.super((long)d2);
        }
        return f.super(f.super((long)(d2 - 9.223372036854776E18)) + Long.MIN_VALUE);
    }

    private static final String super(int n2) {
        return String.valueOf((long)n2 & 0xFFFFFFFFL);
    }

    private static final String super(int n2, int n3) {
        return jc.super((long)n2 & 0xFFFFFFFFL, n3);
    }

    private static final String \u00d300000(long l2) {
        return jc.super(l2, 10);
    }

    public static final String super(long l2, int n2) {
        if (l2 >= 0L) {
            return Long.toString(l2, h.o00000(n2));
        }
        long l3 = (l2 >>> 1) / (long)n2 << 1;
        long l4 = l2 - l3 * (long)n2;
        if (l4 >= (long)n2) {
            l4 -= (long)n2;
            ++l3;
        }
        return Long.toString(l3, h.o00000(n2)) + Long.toString(l4, h.o00000(n2));
    }
}

