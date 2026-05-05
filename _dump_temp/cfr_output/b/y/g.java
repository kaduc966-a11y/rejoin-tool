/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.y.b;
import b.y.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class g
extends b {
    public static final Comparable \u00d300000(Comparable comparable, Comparable comparable2) {
        if (comparable.compareTo(comparable2) >= 0) {
            return comparable;
        }
        return comparable2;
    }

    private static final byte \u00d200000(byte by, byte by2) {
        return (byte)Math.max(by, by2);
    }

    private static final short \u00d200000(short s2, short s3) {
        return (short)Math.max(s2, s3);
    }

    private static final int \u00d200000(int n2, int n3) {
        return Math.max(n2, n3);
    }

    private static final long \u00d200000(long l2, long l3) {
        return Math.max(l2, l3);
    }

    private static final float \u00d200000(float f2, float f3) {
        return Math.max(f2, f3);
    }

    private static final double super(double d2, double d3) {
        return Math.max(d2, d3);
    }

    public static final Comparable \u00d200000(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return f.\u00d300000(comparable, f.\u00d300000(comparable2, comparable3));
    }

    private static final byte super(byte by, byte by2, byte by3) {
        return (byte)Math.max(by, Math.max(by2, by3));
    }

    private static final short super(short s2, short s3, short s4) {
        return (short)Math.max(s2, Math.max(s3, s4));
    }

    private static final int super(int n2, int n3, int n4) {
        return Math.max(n2, Math.max(n3, n4));
    }

    private static final long super(long l2, long l3, long l4) {
        return Math.max(l2, Math.max(l3, l4));
    }

    private static final float super(float f2, float f3, float f4) {
        return Math.max(f2, Math.max(f3, f4));
    }

    private static final double super(double d2, double d3, double d4) {
        return Math.max(d2, Math.max(d3, d4));
    }

    public static final Comparable super(Comparable comparable, Comparable ... comparableArray) {
        for (Comparable comparable2 : comparableArray) {
            comparable = f.\u00d300000(comparable, comparable2);
        }
        return comparable;
    }

    public static final byte super(byte by, byte ... byArray) {
        for (byte by2 : byArray) {
            by = (byte)Math.max(by, by2);
        }
        return by;
    }

    public static final short \u00d200000(short s2, short ... sArray) {
        for (short s3 : sArray) {
            s2 = (short)Math.max(s2, s3);
        }
        return s2;
    }

    public static final int \u00d200000(int n2, int ... nArray) {
        for (int n3 : nArray) {
            n2 = Math.max(n2, n3);
        }
        return n2;
    }

    public static final long super(long l2, long ... lArray) {
        long l3 = l2;
        for (long l4 : lArray) {
            l3 = Math.max(l3, l4);
        }
        return l3;
    }

    public static final float \u00d200000(float f2, float ... fArray) {
        for (float f3 : fArray) {
            f2 = Math.max(f2, f3);
        }
        return f2;
    }

    public static final double \u00d200000(double d2, double ... dArray) {
        double d3 = d2;
        for (double d4 : dArray) {
            d3 = Math.max(d3, d4);
        }
        return d3;
    }

    public static final Comparable \u00d200000(Comparable comparable, Comparable comparable2) {
        if (comparable.compareTo(comparable2) <= 0) {
            return comparable;
        }
        return comparable2;
    }

    private static final byte super(byte by, byte by2) {
        return (byte)Math.min(by, by2);
    }

    private static final short super(short s2, short s3) {
        return (short)Math.min(s2, s3);
    }

    private static final int super(int n2, int n3) {
        return Math.min(n2, n3);
    }

    private static final long super(long l2, long l3) {
        return Math.min(l2, l3);
    }

    private static final float super(float f2, float f3) {
        return Math.min(f2, f3);
    }

    private static final double \u00d200000(double d2, double d3) {
        return Math.min(d2, d3);
    }

    public static final Comparable super(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return f.\u00d200000(comparable, f.\u00d200000(comparable2, comparable3));
    }

    private static final byte \u00d200000(byte by, byte by2, byte by3) {
        return (byte)Math.min(by, Math.min(by2, by3));
    }

    private static final short \u00d200000(short s2, short s3, short s4) {
        return (short)Math.min(s2, Math.min(s3, s4));
    }

    private static final int \u00d200000(int n2, int n3, int n4) {
        return Math.min(n2, Math.min(n3, n4));
    }

    private static final long \u00d200000(long l2, long l3, long l4) {
        return Math.min(l2, Math.min(l3, l4));
    }

    private static final float \u00d200000(float f2, float f3, float f4) {
        return Math.min(f2, Math.min(f3, f4));
    }

    private static final double \u00d200000(double d2, double d3, double d4) {
        return Math.min(d2, Math.min(d3, d4));
    }

    public static final Comparable \u00d200000(Comparable comparable, Comparable ... comparableArray) {
        for (Comparable comparable2 : comparableArray) {
            comparable = f.\u00d200000(comparable, comparable2);
        }
        return comparable;
    }

    public static final byte \u00d200000(byte by, byte ... byArray) {
        for (byte by2 : byArray) {
            by = (byte)Math.min(by, by2);
        }
        return by;
    }

    public static final short super(short s2, short ... sArray) {
        for (short s3 : sArray) {
            s2 = (short)Math.min(s2, s3);
        }
        return s2;
    }

    public static final int super(int n2, int ... nArray) {
        for (int n3 : nArray) {
            n2 = Math.min(n2, n3);
        }
        return n2;
    }

    public static final long \u00d200000(long l2, long ... lArray) {
        long l3 = l2;
        for (long l4 : lArray) {
            l3 = Math.min(l3, l4);
        }
        return l3;
    }

    public static final float super(float f2, float ... fArray) {
        for (float f3 : fArray) {
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    public static final double super(double d2, double ... dArray) {
        double d3 = d2;
        for (double d4 : dArray) {
            d3 = Math.min(d3, d4);
        }
        return d3;
    }
}

