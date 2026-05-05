/*
 * Decompiled with CFR 0.152.
 */
package b.s.c;

import b.ac;
import b.dd;
import b.f;
import b.hc;
import b.jc;
import b.lc;
import b.nc;
import b.o.e.g;
import b.s;
import b.s.c.b;
import b.s.c.d$_b$1;
import b.s.c.d$_b$2;
import b.s.c.d$_b$3;
import b.s.c.d$_b$4;
import b.s.kb;
import b.s.z;
import b.v;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class d {
    private static final int super(int[] nArray, int n2) {
        return v.new(nArray, n2);
    }

    private static final long super(long[] lArray, int n2) {
        return nc.o00000(lArray, n2);
    }

    private static final byte super(byte[] byArray, int n2) {
        return s.o00000(byArray, n2);
    }

    private static final short super(short[] sArray, int n2) {
        return hc.o00000(sArray, n2);
    }

    public static final List super(int[] nArray) {
        return new d$_b$1(nArray);
    }

    public static final List \u00d200000(long[] lArray) {
        return new d$_b$2(lArray);
    }

    public static final List \u00d200000(byte[] byArray) {
        return new d$_b$3(byArray);
    }

    public static final List super(short[] sArray) {
        return new d$_b$4(sArray);
    }

    public static final int super(int[] nArray, int n2, int n3, int n4) {
        kb.return.\u00d200000(n3, n4, v.\u00d300000(nArray));
        --n4;
        while (n3 <= n4) {
            int n5 = n3 + n4 >>> 1;
            int n6 = jc.\u00d300000(nArray[n5], n2);
            if (n6 < 0) {
                n3 = n5 + 1;
                continue;
            }
            if (n6 > 0) {
                n4 = n5 - 1;
                continue;
            }
            return n5;
        }
        return -(n3 + 1);
    }

    public static /* synthetic */ int super(int[] nArray, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n3 = 0;
        }
        if ((n5 & 4) != 0) {
            n4 = v.\u00d300000(nArray);
        }
        return b.super(nArray, n2, n3, n4);
    }

    public static final int super(long[] lArray, long l2, int n2, int n3) {
        kb.return.\u00d200000(n2, n3, nc.\u00d500000(lArray));
        long l3 = l2;
        int n4 = n2;
        int n5 = n3 - 1;
        while (n4 <= n5) {
            n2 = n4 + n5 >>> 1;
            n3 = jc.super(lArray[n2], l3);
            if (n3 < 0) {
                n4 = n2 + 1;
                continue;
            }
            if (n3 > 0) {
                n5 = n2 - 1;
                continue;
            }
            return n2;
        }
        return -(n4 + 1);
    }

    public static /* synthetic */ int super(long[] lArray, long l2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = nc.\u00d500000(lArray);
        }
        return b.super(lArray, l2, n2, n3);
    }

    public static final int super(byte[] byArray, byte by, int n2, int n3) {
        kb.return.\u00d200000(n2, n3, s.o00000(byArray));
        by = (byte)(by & 0xFF);
        --n3;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            int n5 = jc.\u00d300000(byArray[n4], by);
            if (n5 < 0) {
                n2 = n4 + 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n2 + 1);
    }

    public static /* synthetic */ int super(byte[] byArray, byte by, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = s.o00000(byArray);
        }
        return b.super(byArray, by, n2, n3);
    }

    public static final int super(short[] sArray, short s2, int n2, int n3) {
        kb.return.\u00d200000(n2, n3, hc.\u00d400000(sArray));
        s2 = (short)(s2 & 0xFFFF);
        --n3;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            int n5 = jc.\u00d300000(sArray[n4], s2);
            if (n5 < 0) {
                n2 = n4 + 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n2 + 1);
    }

    public static /* synthetic */ int super(short[] sArray, short s2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = hc.\u00d400000(sArray);
        }
        return b.super(sArray, s2, n2, n3);
    }

    public static final /* synthetic */ ac \u00d200000(int[] nArray) {
        return b.\u00d8O0000(nArray);
    }

    public static final /* synthetic */ f \u00d300000(long[] lArray) {
        return b.\u00f600000(lArray);
    }

    public static final /* synthetic */ lc \u00d300000(byte[] byArray) {
        return b.\u00d6\u00d20000(byArray);
    }

    public static final /* synthetic */ dd \u00d200000(short[] sArray) {
        return b.\u00d3o0000(sArray);
    }

    private static final /* synthetic */ ac \u00d400000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        int n2 = v.new(nArray, 0);
        int n3 = z.\u00d3O0000(nArray);
        if (n3 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(ac.return(n2));
            int n4 = 1;
            if (n3 > 0) {
                while (true) {
                    int n5;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(ac.return(n5 = v.new(nArray, n4)))) < 0) {
                        n2 = n5;
                        comparable = comparable2;
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
            }
        }
        return ac.return(n2);
    }

    private static final /* synthetic */ f \u00d400000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = z.nullnew(lArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(f.\u00d4O0000(l2));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    long l3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(f.\u00d4O0000(l3 = nc.o00000(lArray, n3)))) < 0) {
                        l2 = l3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return f.\u00d4O0000(l2);
    }

    private static final /* synthetic */ lc \u00d200000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        byte by = s.o00000(byArray, 0);
        int n2 = z.\u00f6O0000(byArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    byte by2;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by2 = s.o00000(byArray, n3)))) < 0) {
                        by = by2;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return lc.\u00d6O0000(by);
    }

    private static final /* synthetic */ dd super(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s2));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    short s3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s3 = hc.o00000(sArray, n3)))) < 0) {
                        s2 = s3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return dd.\u00d6O0000(s2);
    }

    public static final /* synthetic */ ac \u00d200000(int[] nArray, Comparator comparator) {
        return b.\u00d600000(nArray, comparator);
    }

    public static final /* synthetic */ f \u00d200000(long[] lArray, Comparator comparator) {
        return b.\u00d400000(lArray, comparator);
    }

    public static final /* synthetic */ lc \u00d200000(byte[] byArray, Comparator comparator) {
        return b.\u00d600000(byArray, comparator);
    }

    public static final /* synthetic */ dd \u00d200000(short[] sArray, Comparator comparator) {
        return b.class(sArray, comparator);
    }

    public static final /* synthetic */ ac \u00d300000(int[] nArray) {
        return b.\u00d600000(nArray);
    }

    public static final /* synthetic */ f super(long[] lArray) {
        return b.do(lArray);
    }

    public static final /* synthetic */ lc super(byte[] byArray) {
        return b.intnew(byArray);
    }

    public static final /* synthetic */ dd \u00d300000(short[] sArray) {
        return b.\u00f800000(sArray);
    }

    private static final /* synthetic */ ac \u00d200000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        int n2 = v.new(nArray, 0);
        int n3 = z.\u00d3O0000(nArray);
        if (n3 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(ac.return(n2));
            int n4 = 1;
            if (n3 > 0) {
                while (true) {
                    int n5;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(ac.return(n5 = v.new(nArray, n4)))) > 0) {
                        n2 = n5;
                        comparable = comparable2;
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
            }
        }
        return ac.return(n2);
    }

    private static final /* synthetic */ f \u00d200000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = z.nullnew(lArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(f.\u00d4O0000(l2));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    long l3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(f.\u00d4O0000(l3 = nc.o00000(lArray, n3)))) > 0) {
                        l2 = l3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return f.\u00d4O0000(l2);
    }

    private static final /* synthetic */ lc \u00d400000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        byte by = s.o00000(byArray, 0);
        int n2 = z.\u00f6O0000(byArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    byte by2;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by2 = s.o00000(byArray, n3)))) > 0) {
                        by = by2;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return lc.\u00d6O0000(by);
    }

    private static final /* synthetic */ dd \u00d200000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s2));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    short s3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s3 = hc.o00000(sArray, n3)))) > 0) {
                        s2 = s3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return dd.\u00d6O0000(s2);
    }

    public static final /* synthetic */ ac super(int[] nArray, Comparator comparator) {
        return b.\u00d400000(nArray, comparator);
    }

    public static final /* synthetic */ f super(long[] lArray, Comparator comparator) {
        return b.\u00d300000(lArray, comparator);
    }

    public static final /* synthetic */ lc super(byte[] byArray, Comparator comparator) {
        return b.class(byArray, comparator);
    }

    public static final /* synthetic */ dd super(short[] sArray, Comparator comparator) {
        return b.\u00d400000(sArray, comparator);
    }

    private static final BigDecimal \u00d300000(int[] nArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(ac.return(n3)));
        }
        return bigDecimal;
    }

    private static final BigDecimal super(long[] lArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(f.\u00d4O0000(l2)));
        }
        return bigDecimal;
    }

    private static final BigDecimal super(byte[] byArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(lc.\u00d6O0000(by)));
        }
        return bigDecimal;
    }

    private static final BigDecimal \u00d300000(short[] sArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(dd.\u00d6O0000(s2)));
        }
        return bigDecimal;
    }

    private static final BigInteger super(int[] nArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(ac.return(n3)));
        }
        return bigInteger;
    }

    private static final BigInteger \u00d300000(long[] lArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(f.\u00d4O0000(l2)));
        }
        return bigInteger;
    }

    private static final BigInteger \u00d300000(byte[] byArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(lc.\u00d6O0000(by)));
        }
        return bigInteger;
    }

    private static final BigInteger \u00d400000(short[] sArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(dd.\u00d6O0000(s2)));
        }
        return bigInteger;
    }
}

