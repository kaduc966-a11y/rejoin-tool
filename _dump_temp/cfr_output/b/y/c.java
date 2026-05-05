/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.hc;
import b.nc;
import b.o.d.fc;
import b.s;
import b.v;
import b.y.i;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class c {
    public static final int super(int n2, int n3) {
        if (Integer.compareUnsigned(n2, n3) >= 0) {
            return n2;
        }
        return n3;
    }

    public static final long super(long l2, long l3) {
        if (Long.compareUnsigned(l2, l3) >= 0) {
            return l2;
        }
        return l3;
    }

    public static final byte \u00d200000(byte by, byte by2) {
        if (fc.o00000(by & 0xFF, by2 & 0xFF) >= 0) {
            return by;
        }
        return by2;
    }

    public static final short \u00d200000(short s2, short s3) {
        if (fc.o00000(s2 & 0xFFFF, s3 & 0xFFFF) >= 0) {
            return s2;
        }
        return s3;
    }

    private static final int \u00d200000(int n2, int n3, int n4) {
        return i.super(n2, i.super(n3, n4));
    }

    private static final long \u00d200000(long l2, long l3, long l4) {
        return i.super(l2, i.super(l3, l4));
    }

    private static final byte \u00d200000(byte by, byte by2, byte by3) {
        return i.\u00d200000(by, i.\u00d200000(by2, by3));
    }

    private static final short \u00d200000(short s2, short s3, short s4) {
        return i.\u00d200000(s2, i.\u00d200000(s3, s4));
    }

    public static final int \u00d200000(int n2, int ... nArray) {
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            n2 = i.super(n2, n4);
        }
        return n2;
    }

    public static final long super(long l2, long ... lArray) {
        long l3 = l2;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l4 = nc.o00000(lArray, i2);
            l3 = i.super(l3, l4);
        }
        return l3;
    }

    public static final byte \u00d200000(byte by, byte ... byArray) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by2 = s.o00000(byArray, i2);
            by = i.\u00d200000(by, by2);
        }
        return by;
    }

    public static final short \u00d200000(short s2, short ... sArray) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s3 = hc.o00000(sArray, i2);
            s2 = i.\u00d200000(s2, s3);
        }
        return s2;
    }

    public static final int \u00d200000(int n2, int n3) {
        if (Integer.compareUnsigned(n2, n3) <= 0) {
            return n2;
        }
        return n3;
    }

    public static final long \u00d200000(long l2, long l3) {
        if (Long.compareUnsigned(l2, l3) <= 0) {
            return l2;
        }
        return l3;
    }

    public static final byte super(byte by, byte by2) {
        if (fc.o00000(by & 0xFF, by2 & 0xFF) <= 0) {
            return by;
        }
        return by2;
    }

    public static final short super(short s2, short s3) {
        if (fc.o00000(s2 & 0xFFFF, s3 & 0xFFFF) <= 0) {
            return s2;
        }
        return s3;
    }

    private static final int super(int n2, int n3, int n4) {
        return i.\u00d200000(n2, i.\u00d200000(n3, n4));
    }

    private static final long super(long l2, long l3, long l4) {
        return i.\u00d200000(l2, i.\u00d200000(l3, l4));
    }

    private static final byte super(byte by, byte by2, byte by3) {
        return i.super(by, i.super(by2, by3));
    }

    private static final short super(short s2, short s3, short s4) {
        return i.super(s2, i.super(s3, s4));
    }

    public static final int super(int n2, int ... nArray) {
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            n2 = i.\u00d200000(n2, n4);
        }
        return n2;
    }

    public static final long \u00d200000(long l2, long ... lArray) {
        long l3 = l2;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l4 = nc.o00000(lArray, i2);
            l3 = i.\u00d200000(l3, l4);
        }
        return l3;
    }

    public static final byte super(byte by, byte ... byArray) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by2 = s.o00000(byArray, i2);
            by = i.super(by, by2);
        }
        return by;
    }

    public static final short super(short s2, short ... sArray) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s3 = hc.o00000(sArray, i2);
            s2 = i.super(s2, s3);
        }
        return s2;
    }
}

