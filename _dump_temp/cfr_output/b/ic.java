/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.vd;

class ic
extends vd {
    private static final int o00000(byte by, byte by2) {
        int n2 = by / by2;
        if ((by ^ by2) < 0 && n2 * by2 != by) {
            --n2;
        }
        return n2;
    }

    private static final byte \u00d200000(byte by, byte by2) {
        int n2 = by % by2;
        byte by3 = by = (byte)n2;
        return (byte)(n2 + (by2 & ((by ^ by2) & (by3 | -by3)) >> 31));
    }

    private static final int o00000(byte by, short s2) {
        int n2 = by / s2;
        if ((by ^ s2) < 0 && n2 * s2 != by) {
            --n2;
        }
        return n2;
    }

    private static final short \u00d200000(byte by, short s2) {
        int n2 = by % s2;
        byte by2 = by = (byte)n2;
        return (short)(n2 + (s2 & ((by ^ s2) & (by2 | -by2)) >> 31));
    }

    private static final int o00000(byte by, int n2) {
        int n3 = by / n2;
        if ((by ^ n2) < 0 && n3 * n2 != by) {
            --n3;
        }
        return n3;
    }

    private static final int \u00d200000(byte by, int n2) {
        int n3 = by % n2;
        byte by2 = by = (byte)n3;
        return n3 + (n2 & ((by ^ n2) & (by2 | -by2)) >> 31);
    }

    private static final long o00000(byte by, long l2) {
        long l3 = by;
        long l4 = l3 / l2;
        if ((l3 ^ l2) < 0L && l4 * l2 != l3) {
            l4 += -1L;
        }
        return l4;
    }

    private static final long \u00d200000(byte by, long l2) {
        long l3;
        long l4 = l3 = (long)by % l2;
        return l3 + (l2 & ((l3 ^ l2) & (l4 | -l4)) >> 63);
    }

    private static final int o00000(short s2, byte by) {
        int n2 = s2 / by;
        if ((s2 ^ by) < 0 && n2 * by != s2) {
            --n2;
        }
        return n2;
    }

    private static final byte \u00d200000(short s2, byte by) {
        int n2 = s2 % by;
        short s3 = s2 = (short)n2;
        return (byte)(n2 + (by & ((s2 ^ by) & (s3 | -s3)) >> 31));
    }

    private static final int o00000(short s2, short s3) {
        int n2 = s2 / s3;
        if ((s2 ^ s3) < 0 && n2 * s3 != s2) {
            --n2;
        }
        return n2;
    }

    private static final short \u00d200000(short s2, short s3) {
        int n2 = s2 % s3;
        short s4 = s2 = (short)n2;
        return (short)(n2 + (s3 & ((s2 ^ s3) & (s4 | -s4)) >> 31));
    }

    private static final int o00000(short s2, int n2) {
        int n3 = s2 / n2;
        if ((s2 ^ n2) < 0 && n3 * n2 != s2) {
            --n3;
        }
        return n3;
    }

    private static final int \u00d200000(short s2, int n2) {
        int n3 = s2 % n2;
        short s3 = s2 = (short)n3;
        return n3 + (n2 & ((s2 ^ n2) & (s3 | -s3)) >> 31);
    }

    private static final long o00000(short s2, long l2) {
        long l3 = s2;
        long l4 = l3 / l2;
        if ((l3 ^ l2) < 0L && l4 * l2 != l3) {
            l4 += -1L;
        }
        return l4;
    }

    private static final long \u00d200000(short s2, long l2) {
        long l3;
        long l4 = l3 = (long)s2 % l2;
        return l3 + (l2 & ((l3 ^ l2) & (l4 | -l4)) >> 63);
    }

    private static final int o00000(int n2, byte by) {
        int n3 = n2 / by;
        if ((n2 ^ by) < 0 && n3 * by != n2) {
            --n3;
        }
        return n3;
    }

    private static final byte \u00d200000(int n2, byte by) {
        int n3 = n2 %= by;
        return (byte)(n2 + (by & ((n2 ^ by) & (n3 | -n3)) >> 31));
    }

    private static final int o00000(int n2, short s2) {
        int n3 = n2 / s2;
        if ((n2 ^ s2) < 0 && n3 * s2 != n2) {
            --n3;
        }
        return n3;
    }

    private static final short \u00d200000(int n2, short s2) {
        int n3 = n2 %= s2;
        return (short)(n2 + (s2 & ((n2 ^ s2) & (n3 | -n3)) >> 31));
    }

    private static final int o00000(int n2, int n3) {
        int n4 = n2 / n3;
        if ((n2 ^ n3) < 0 && n4 * n3 != n2) {
            --n4;
        }
        return n4;
    }

    private static final int \u00d200000(int n2, int n3) {
        int n4 = n2 %= n3;
        return n2 + (n3 & ((n2 ^ n3) & (n4 | -n4)) >> 31);
    }

    private static final long o00000(int n2, long l2) {
        long l3 = n2;
        long l4 = l3 / l2;
        if ((l3 ^ l2) < 0L && l4 * l2 != l3) {
            l4 += -1L;
        }
        return l4;
    }

    private static final long \u00d200000(int n2, long l2) {
        long l3;
        long l4 = l3 = (long)n2 % l2;
        return l3 + (l2 & ((l3 ^ l2) & (l4 | -l4)) >> 63);
    }

    private static final long \u00d200000(long l2, byte by) {
        long l3 = l2;
        long l4 = by;
        long l5 = l3 / l4;
        if ((l3 ^ l4) < 0L && l5 * l4 != l3) {
            l5 += -1L;
        }
        return l5;
    }

    private static final byte o00000(long l2, byte by) {
        long l3;
        long l4 = l2;
        long l5 = by;
        long l6 = l3 = l4 % l5;
        return (byte)(l3 + (l5 & ((l3 ^ l5) & (l6 | -l6)) >> 63));
    }

    private static final long o00000(long l2, short s2) {
        long l3 = l2;
        long l4 = s2;
        long l5 = l3 / l4;
        if ((l3 ^ l4) < 0L && l5 * l4 != l3) {
            l5 += -1L;
        }
        return l5;
    }

    private static final short \u00d200000(long l2, short s2) {
        long l3;
        long l4 = l2;
        long l5 = s2;
        long l6 = l3 = l4 % l5;
        return (short)(l3 + (l5 & ((l3 ^ l5) & (l6 | -l6)) >> 63));
    }

    private static final long o00000(long l2, int n2) {
        long l3 = l2;
        long l4 = n2;
        long l5 = l3 / l4;
        if ((l3 ^ l4) < 0L && l5 * l4 != l3) {
            l5 += -1L;
        }
        return l5;
    }

    private static final int \u00d200000(long l2, int n2) {
        long l3;
        long l4 = l2;
        long l5 = n2;
        long l6 = l3 = l4 % l5;
        return (int)(l3 + (l5 & ((l3 ^ l5) & (l6 | -l6)) >> 63));
    }

    private static final long \u00d200000(long l2, long l3) {
        long l4 = l2 / l3;
        if ((l2 ^ l3) < 0L && l4 * l3 != l2) {
            l4 += -1L;
        }
        return l4;
    }

    private static final long o00000(long l2, long l3) {
        long l4;
        long l5 = l4 = l2 % l3;
        return l4 + (l3 & ((l4 ^ l3) & (l5 | -l5)) >> 63);
    }

    private static final float o00000(float f2, float f3) {
        if (!((f2 %= f3) == 0.0f) && !(Math.signum(f2) == Math.signum(f3))) {
            return f2 + f3;
        }
        return f2;
    }

    private static final double o00000(float f2, double d2) {
        double d3 = (double)f2 % d2;
        if (!(d3 == 0.0) && !(Math.signum(d3) == Math.signum(d2))) {
            return d3 + d2;
        }
        return d3;
    }

    private static final double o00000(double d2, float f2) {
        double d3 = d2;
        double d4 = f2;
        double d5 = d3 % d4;
        if (!(d5 == 0.0) && !(Math.signum(d5) == Math.signum(d4))) {
            return d5 + d4;
        }
        return d5;
    }

    private static final double o00000(double d2, double d3) {
        double d4 = d2 % d3;
        if (!(d4 == 0.0) && !(Math.signum(d4) == Math.signum(d3))) {
            return d4 + d3;
        }
        return d4;
    }
}

