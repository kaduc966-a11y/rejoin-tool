/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.e.bb;
import b.i.h$_b;
import b.i.m;
import b.i.o;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class h
extends o {
    public static final long super(long l2, m m2) {
        return h.super(l2, h.\u00d200000(m2));
    }

    private static final long super(long l2, long l3) {
        if (l2 == 0L) {
            return 0L;
        }
        if (l2 == 1L) {
            return bb.Object(l3, 0x3FFFFFFFFFFFFFFFL);
        }
        if (l3 == 1L) {
            return bb.Object(l2, 0x3FFFFFFFFFFFFFFFL);
        }
        int n2 = 128 - Long.numberOfLeadingZeros(l2) - Long.numberOfLeadingZeros(l3);
        if (n2 < 63) {
            return l2 * l3;
        }
        if (n2 > 63) {
            return 0x3FFFFFFFFFFFFFFFL;
        }
        return bb.Object(l2 * l3, 0x3FFFFFFFFFFFFFFFL);
    }

    private static final long \u00d200000(m m2) {
        switch (h$_b.super[m2.ordinal()]) {
            case 1: {
                return 86400000L;
            }
            case 2: {
                return 3600000L;
            }
            case 3: {
                return 60000L;
            }
            case 4: {
                return 1000L;
            }
            case 5: {
                return 1L;
            }
        }
        throw new IllegalStateException("Wrong unit for millisMultiplier: ".concat(String.valueOf((Object)m2)).toString());
    }

    public static final String \u00d300000(m m2) {
        switch (h$_b.super[m2.ordinal()]) {
            case 6: {
                return "ns";
            }
            case 7: {
                return "us";
            }
            case 5: {
                return "ms";
            }
            case 4: {
                return "s";
            }
            case 3: {
                return "m";
            }
            case 2: {
                return "h";
            }
            case 1: {
                return "d";
            }
        }
        throw new IllegalStateException("Unknown unit: ".concat(String.valueOf((Object)m2)).toString());
    }
}

