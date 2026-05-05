/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.e.bb;
import b.e.j;
import b.f.e;
import b.i.b$_b;
import b.i.g;
import b.i.m;
import b.i.p;
import b.i.y;
import b.o.d.fc;
import b.o.e.c;
import b.o.e.d;
import b.q.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b
implements Comparable {
    public static final b$_b void = new b$_b(null);
    private final long \u00d600000;
    private static final long o00000 = b.\u00d200000(0L);
    private static final long \u00d200000 = y.if(0x3FFFFFFFFFFFFFFFL);
    private static final long \u00d400000 = y.if(-4611686018427387903L);
    public static final long \u00d500000 = 9223372036854759646L;
    private static final long Object = b.\u00d200000(9223372036854759646L);

    private static final long \u00d3o0000(long l2) {
        return l2 >> 1;
    }

    private static final int \u00d8O0000(long l2) {
        return (int)l2 & 1;
    }

    private static final boolean o00000(long l2) {
        return ((int)l2 & 1) == 0;
    }

    private static final boolean \u00d6o0000(long l2) {
        return ((int)l2 & 1) == 1;
    }

    private static final m \u00d2o0000(long l2) {
        if (b.o00000(l2)) {
            return m.\u00d300000;
        }
        return m.\u00f400000;
    }

    public static final long \u00f600000(long l2) {
        return y.o00000(-b.\u00d3o0000(l2), (int)l2 & 1);
    }

    public static final long \u00d200000(long l2, long l3) {
        if (((int)l2 & 1) == ((int)l3 & 1)) {
            if (b.o00000(l2)) {
                return y.o00000(b.\u00d3o0000(l2) + b.\u00d3o0000(l3));
            }
            long l4 = y.o00000(b.\u00d3o0000(l2), b.\u00d3o0000(l3));
            if (l4 == 9223372036854759646L) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            long l5 = l4;
            if (l5 == 0x3FFFFFFFFFFFFFFFL || l5 == -4611686018427387903L) {
                return y.if(l4);
            }
            return y.\u00d400000(l4);
        }
        if (b.\u00d6o0000(l2)) {
            long l6 = l2;
            return b.o00000(l6, b.\u00d3o0000(l6), b.\u00d3o0000(l3));
        }
        return b.o00000(l2, b.\u00d3o0000(l3), b.\u00d3o0000(l2));
    }

    private static final long o00000(long l2, long l3, long l4) {
        long l5 = y.while(l4);
        long l6 = y.o00000(l3, l5);
        boolean bl = -4611686018426L <= l6 ? l6 < 4611686018427L : false;
        if (bl) {
            long l7 = l4 - y.new(l5);
            return y.OO0000(y.new(l6) + l7);
        }
        return y.if(l6);
    }

    public static final long String(long l2, long l3) {
        return b.\u00d200000(l2, b.\u00f600000(l3));
    }

    public static final long \u00d200000(long l2, int n2) {
        if (b.\u00d5o0000(l2)) {
            if (n2 == 0) {
                throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
            }
            if (n2 > 0) {
                return l2;
            }
            return b.\u00f600000(l2);
        }
        if (n2 == 0) {
            return o00000;
        }
        long l3 = b.\u00d3o0000(l2);
        long l4 = l3 * (long)n2;
        if (b.o00000(l2)) {
            boolean bl = -2147483647L <= l3 ? l3 < 0x80000000L : false;
            if (bl) {
                return y.OO0000(l4);
            }
            if (l4 / (long)n2 == l3) {
                return y.o00000(l4);
            }
            long l5 = y.while(l3);
            long l6 = l3 - y.new(l5);
            long l7 = l5 * (long)n2;
            long l8 = l7 + y.while(l6 * (long)n2);
            if (l7 / (long)n2 == l5 && (l8 ^ l7) >= 0L) {
                return y.if(bb.o00000(l8, (b.e.g)new j(-4611686018427387903L, 0x3FFFFFFFFFFFFFFFL)));
            }
            if (e.new(l3) * e.\u00d300000(n2) > 0) {
                return \u00d200000;
            }
            return \u00d400000;
        }
        if (l4 / (long)n2 == l3) {
            return y.if(bb.o00000(l4, (b.e.g)new j(-4611686018427387903L, 0x3FFFFFFFFFFFFFFFL)));
        }
        if (e.new(l3) * e.\u00d300000(n2) > 0) {
            return \u00d200000;
        }
        return \u00d400000;
    }

    public static final long o00000(long l2, double d2) {
        int n2 = e.thissuper(d2);
        if ((double)n2 == d2) {
            return b.\u00d200000(l2, n2);
        }
        m m2 = b.\u00d2o0000(l2);
        return y.o00000(b.\u00d200000(l2, m2) * d2, m2);
    }

    public static final long o00000(long l2, int n2) {
        if (n2 == 0) {
            if (b.private(l2)) {
                return \u00d200000;
            }
            if (b.\u00d300000(l2)) {
                return \u00d400000;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (b.o00000(l2)) {
            return y.OO0000(b.\u00d3o0000(l2) / (long)n2);
        }
        if (b.\u00d5o0000(l2)) {
            return b.\u00d200000(l2, e.\u00d300000(n2));
        }
        long l3 = b.\u00d3o0000(l2) / (long)n2;
        boolean bl = -4611686018426L <= l3 ? l3 < 4611686018427L : false;
        if (bl) {
            long l4 = y.new(b.\u00d3o0000(l2) - l3 * (long)n2) / (long)n2;
            return y.OO0000(y.new(l3) + l4);
        }
        return y.if(l3);
    }

    public static final long \u00d200000(long l2, double d2) {
        int n2 = e.thissuper(d2);
        if ((double)n2 == d2 && n2 != 0) {
            return b.o00000(l2, n2);
        }
        m m2 = b.\u00d2o0000(l2);
        return y.o00000(b.\u00d200000(l2, m2) / d2, m2);
    }

    public static final double o00000(long l2, long l3) {
        m m2 = (m)((Object)b.y.f.\u00d300000((Comparable)((Object)b.\u00d2o0000(l2)), (Comparable)((Object)b.\u00d2o0000(l3))));
        return b.\u00d200000(l2, m2) / b.\u00d200000(l3, m2);
    }

    public static final long String(long l2, m m2) {
        m m3 = b.\u00d2o0000(l2);
        if (m2.compareTo((Enum)m3) <= 0 || b.\u00d5o0000(l2)) {
            return l2;
        }
        long l3 = p.\u00d200000(1L, m2, m3);
        return y.new(b.\u00d3o0000(l2) - b.\u00d3o0000(l2) % l3, m3);
    }

    public static final boolean \u00d300000(long l2) {
        return l2 < 0L;
    }

    public static final boolean private(long l2) {
        return l2 > 0L;
    }

    public static final boolean \u00d5o0000(long l2) {
        return l2 == \u00d200000 || l2 == \u00d400000;
    }

    public static final boolean \u00d5O0000(long l2) {
        return !b.\u00d5o0000(l2);
    }

    public static final long \u00f6O0000(long l2) {
        if (b.\u00d300000(l2)) {
            return b.\u00f600000(l2);
        }
        return l2;
    }

    public static int \u00d500000(long l2, long l3) {
        long l4 = l2 ^ l3;
        if (l4 < 0L || ((int)l4 & 1) == 0) {
            return fc.o00000(l2, l3);
        }
        int n2 = ((int)l2 & 1) - ((int)l3 & 1);
        if (b.\u00d300000(l2)) {
            return -n2;
        }
        return n2;
    }

    public final int String(long l2) {
        return b.\u00d500000(this.\u00d600000, l2);
    }

    public static final Object o00000(long l2, c c2) {
        return c2.o00000(b.\u00f500000(l2), b.ifsuper(l2), b.\u00d2O0000(l2), b.returnsuper(l2), b.\u00d6O0000(l2));
    }

    public static final Object o00000(long l2, d d2) {
        return d2.o00000(b.\u00f5O0000(l2), b.\u00d2O0000(l2), b.returnsuper(l2), b.\u00d6O0000(l2));
    }

    public static final Object o00000(long l2, b.o.e.e e2) {
        return e2.o00000(b.\u00d600000(l2), b.returnsuper(l2), b.\u00d6O0000(l2));
    }

    public static final Object o00000(long l2, b.o.e.f f2) {
        return f2.o00000(b.oo0000(l2), b.\u00d6O0000(l2));
    }

    public static final int ifsuper(long l2) {
        if (b.\u00d5o0000(l2)) {
            return 0;
        }
        return (int)(b.\u00f5O0000(l2) % 24L);
    }

    public static /* synthetic */ void o00000() {
    }

    public static final int \u00d2O0000(long l2) {
        if (b.\u00d5o0000(l2)) {
            return 0;
        }
        return (int)(b.\u00d600000(l2) % 60L);
    }

    public static /* synthetic */ void String() {
    }

    public static final int returnsuper(long l2) {
        if (b.\u00d5o0000(l2)) {
            return 0;
        }
        return (int)(b.oo0000(l2) % 60L);
    }

    public static /* synthetic */ void \u00f500000() {
    }

    public static final int \u00d6O0000(long l2) {
        if (b.\u00d5o0000(l2)) {
            return 0;
        }
        if (b.\u00d6o0000(l2)) {
            return (int)y.new(b.\u00d3o0000(l2) % 1000L);
        }
        return (int)(b.\u00d3o0000(l2) % 1000000000L);
    }

    public static /* synthetic */ void \u00d600000() {
    }

    public static final double \u00d200000(long l2, m m2) {
        long l3 = l2;
        if (l3 == \u00d200000) {
            return Double.POSITIVE_INFINITY;
        }
        if (l3 == \u00d400000) {
            return Double.NEGATIVE_INFINITY;
        }
        return p.super((double)b.\u00d3o0000(l2), b.\u00d2o0000(l2), m2);
    }

    public static final long o00000(long l2, m m2) {
        long l3 = l2;
        if (l3 == \u00d200000) {
            return Long.MAX_VALUE;
        }
        if (l3 == \u00d400000) {
            return Long.MIN_VALUE;
        }
        return p.\u00d200000(b.\u00d3o0000(l2), b.\u00d2o0000(l2), m2);
    }

    public static final int \u00d300000(long l2, m m2) {
        return (int)bb.o00000(b.o00000(l2, m2), Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static final long \u00f500000(long l2) {
        return b.o00000(l2, m.\u00f600000);
    }

    public static final long \u00f5O0000(long l2) {
        return b.o00000(l2, m.\u00d800000);
    }

    public static final long \u00d600000(long l2) {
        return b.o00000(l2, m.int);
    }

    public static final long oo0000(long l2) {
        return b.o00000(l2, m.\u00d600000);
    }

    public static final long \u00f800000(long l2) {
        if (b.\u00d6o0000(l2) && b.\u00d5O0000(l2)) {
            return b.\u00d3o0000(l2);
        }
        return b.o00000(l2, m.\u00f400000);
    }

    public static final long \u00f8O0000(long l2) {
        return b.o00000(l2, m.\u00d200000);
    }

    public static final long oO0000(long l2) {
        long l3 = b.\u00d3o0000(l2);
        if (b.o00000(l2)) {
            return l3;
        }
        if (l3 > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (l3 < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return y.new(l3);
    }

    public static String null(long l2) {
        StringBuilder stringBuilder;
        long l3 = l2;
        if (l3 == 0L) {
            return "0s";
        }
        if (l3 == \u00d200000) {
            return "Infinity";
        }
        if (l3 == \u00d400000) {
            return "-Infinity";
        }
        boolean bl = b.\u00d300000(l2);
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        if (bl) {
            stringBuilder2.append('-');
        }
        long l4 = b.\u00f6O0000(l2);
        int n2 = b.\u00d6O0000(l4);
        int n3 = b.returnsuper(l4);
        int n4 = b.\u00d2O0000(l4);
        int n5 = b.ifsuper(l4);
        long l5 = b.\u00f500000(l4);
        boolean bl2 = l5 != 0L;
        boolean bl3 = n5 != 0;
        boolean bl4 = n4 != 0;
        boolean bl5 = n3 != 0 || n2 != 0;
        int n6 = 0;
        if (bl2) {
            stringBuilder2.append(l5).append('d');
            ++n6;
        }
        if (bl3 || bl2 && (bl4 || bl5)) {
            if (n6++ > 0) {
                stringBuilder2.append(' ');
            }
            stringBuilder2.append(n5).append('h');
        }
        if (bl4 || bl5 && (bl3 || bl2)) {
            if (n6++ > 0) {
                stringBuilder2.append(' ');
            }
            stringBuilder2.append(n4).append('m');
        }
        if (bl5) {
            if (n6++ > 0) {
                stringBuilder2.append(' ');
            }
            if (n3 != 0 || bl2 || bl3 || bl4) {
                b.o00000(l2, stringBuilder2, n3, n2, 9, "s", false);
            } else if (n2 >= 1000000) {
                b.o00000(l2, stringBuilder2, n2 / 1000000, n2 % 1000000, 6, "ms", false);
            } else if (n2 >= 1000) {
                b.o00000(l2, stringBuilder2, n2 / 1000, n2 % 1000, 3, "us", false);
            } else {
                stringBuilder2.append(n2).append("ns");
            }
        }
        if (bl && n6 > 1) {
            stringBuilder2.insert(1, '(').append(')');
        }
        return stringBuilder.toString();
    }

    public final String toString() {
        return b.null(this.\u00d600000);
    }

    private static final void o00000(long l2, StringBuilder stringBuilder, int n2, int n3, int n4, String string, boolean bl) {
        stringBuilder.append(n2);
        if (n3 != 0) {
            int n5;
            String string2;
            block5: {
                stringBuilder.append('.');
                string2 = f.super(String.valueOf(n3), n4, '0');
                CharSequence charSequence = string2;
                n2 = charSequence.length() + -1;
                if (n2 >= 0) {
                    do {
                        if (!(charSequence.charAt(n3 = n2--) != '0')) continue;
                        n5 = n3;
                        break block5;
                    } while (n2 >= 0);
                }
                n5 = -1;
            }
            int n6 = n5 + 1;
            if (!bl && n6 < 3) {
                stringBuilder.append(string2, 0, n6);
            } else {
                stringBuilder.append(string2, 0, (n6 + 2) / 3 * 3);
            }
        }
        stringBuilder.append(string);
    }

    public static final String o00000(long l2, m m2, int n2) {
        if (!(n2 >= 0)) {
            String string = "decimals must be not negative, but was ".concat(String.valueOf(n2));
            throw new IllegalArgumentException(string.toString());
        }
        double d2 = b.\u00d200000(l2, m2);
        if (Double.isInfinite(d2)) {
            return String.valueOf(d2);
        }
        return g.o00000(d2, bb.Object(n2, 12)) + p.\u00d300000(m2);
    }

    public static /* synthetic */ String o00000(long l2, m m2, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return b.o00000(l2, m2, n2);
    }

    public static final String \u00d500000(long l2) {
        boolean bl;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        if (b.\u00d300000(l2)) {
            stringBuilder2.append('-');
        }
        stringBuilder2.append("PT");
        long l3 = b.\u00f6O0000(l2);
        int n2 = b.\u00d6O0000(l3);
        int n3 = b.returnsuper(l3);
        int n4 = b.\u00d2O0000(l3);
        long l4 = b.\u00f5O0000(l3);
        if (b.\u00d5o0000(l2)) {
            l4 = 9999999999999L;
        }
        boolean bl2 = l4 != 0L;
        boolean bl3 = n3 != 0 || n2 != 0;
        boolean bl4 = bl = n4 != 0 || bl3 && bl2;
        if (bl2) {
            stringBuilder2.append(l4).append('H');
        }
        if (bl) {
            stringBuilder2.append(n4).append('M');
        }
        if (bl3 || !bl2 && !bl) {
            b.o00000(l2, stringBuilder2, n3, n2, 9, "S", true);
        }
        return stringBuilder.toString();
    }

    public static int \u00d3O0000(long l2) {
        return Long.hashCode(l2);
    }

    public final int hashCode() {
        return b.\u00d3O0000(this.\u00d600000);
    }

    public static boolean o00000(long l2, Object object) {
        if (!(object instanceof b)) {
            return false;
        }
        long l3 = ((b)object).\u00d500000();
        return l2 == l3;
    }

    public final boolean equals(Object object) {
        return b.o00000(this.\u00d600000, object);
    }

    private /* synthetic */ b(long l2) {
        this.\u00d600000 = l2;
    }

    public static long \u00d200000(long l2) {
        return l2;
    }

    public static final /* synthetic */ b for(long l2) {
        return new b(l2);
    }

    public final /* synthetic */ long \u00d500000() {
        return this.\u00d600000;
    }

    public static final boolean \u00d300000(long l2, long l3) {
        return l2 == l3;
    }

    public final /* synthetic */ int compareTo(Object object) {
        return this.String(((b)object).\u00d500000());
    }

    public static final /* synthetic */ boolean newsuper(long l2) {
        return b.o00000(l2);
    }

    public static final /* synthetic */ long \u00d800000(long l2) {
        return b.\u00d3o0000(l2);
    }

    public static final /* synthetic */ long \u00d200000() {
        return o00000;
    }

    public static final /* synthetic */ long null() {
        return \u00d200000;
    }

    public static final /* synthetic */ long \u00d800000() {
        return \u00d400000;
    }

    public static final /* synthetic */ long \u00d300000() {
        return Object;
    }
}

