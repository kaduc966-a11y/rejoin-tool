/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.b;
import b.i.fb;
import b.i.n;
import b.i.x;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j$_c$_b
implements fb {
    private final long \u00d300000;

    public static long OO0000(long l2) {
        return x.\u00d800000.\u00d300000(l2);
    }

    @Override
    public final long o00000() {
        return j$_c$_b.OO0000(this.\u00d300000);
    }

    public static long new(long l2, long l3) {
        return x.\u00d800000.super(l2, l3);
    }

    public final long \u00f400000(long l2) {
        return j$_c$_b.new(this.\u00d300000, l2);
    }

    public static long \u00d300000(long l2, long l3) {
        return x.\u00d800000.super(l2, b.\u00f600000(l3));
    }

    public final long if(long l2) {
        return j$_c$_b.\u00d300000(this.\u00d300000, l2);
    }

    public static boolean \u00d500000(long l2) {
        return !b.\u00d300000(j$_c$_b.OO0000(l2));
    }

    @Override
    public final boolean \u00d300000() {
        return j$_c$_b.\u00d500000(this.\u00d300000);
    }

    public static boolean \u00d800000(long l2) {
        return b.\u00d300000(j$_c$_b.OO0000(l2));
    }

    @Override
    public final boolean new() {
        return j$_c$_b.\u00d800000(this.\u00d300000);
    }

    public static long o00000(long l2, fb fb2) {
        if (!(fb2 instanceof j$_c$_b)) {
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + j$_c$_b.\u00f800000(l2) + " and " + fb2);
        }
        return j$_c$_b.\u00d500000(l2, ((j$_c$_b)fb2).return());
    }

    @Override
    public final long new(fb fb2) {
        return j$_c$_b.o00000(this.\u00d300000, fb2);
    }

    public static final long \u00d500000(long l2, long l3) {
        return x.\u00d800000.\u00d200000(l2, l3);
    }

    public static final int o00000(long l2, long l3) {
        return b.\u00d500000(j$_c$_b.\u00d500000(l2, l3), b.void.\u00d400000());
    }

    public static String \u00f800000(long l2) {
        return "ValueTimeMark(reading=" + l2 + ')';
    }

    public final String toString() {
        return j$_c$_b.\u00f800000(this.\u00d300000);
    }

    public static int \u00f500000(long l2) {
        return Long.hashCode(l2);
    }

    @Override
    public final int hashCode() {
        return j$_c$_b.\u00f500000(this.\u00d300000);
    }

    public static boolean o00000(long l2, Object object) {
        if (!(object instanceof j$_c$_b)) {
            return false;
        }
        long l3 = ((j$_c$_b)object).return();
        return l2 == l3;
    }

    @Override
    public final boolean equals(Object object) {
        return j$_c$_b.o00000(this.\u00d300000, object);
    }

    public static int new(long l2, fb fb2) {
        return j$_c$_b.return(l2).o00000(fb2);
    }

    private /* synthetic */ j$_c$_b(long l2) {
        this.\u00d300000 = l2;
    }

    public static long oO0000(long l2) {
        return l2;
    }

    public static final /* synthetic */ j$_c$_b return(long l2) {
        return new j$_c$_b(l2);
    }

    public final /* synthetic */ long return() {
        return this.\u00d300000;
    }

    public static final boolean \u00d400000(long l2, long l3) {
        return l2 == l3;
    }

    @Override
    public final /* synthetic */ fb \u00d400000(long l2) {
        return j$_c$_b.return(this.\u00f400000(l2));
    }

    @Override
    public final /* synthetic */ n new(long l2) {
        return j$_c$_b.return(this.\u00f400000(l2));
    }

    @Override
    public final /* synthetic */ fb \u00d300000(long l2) {
        return j$_c$_b.return(this.if(l2));
    }

    @Override
    public final /* synthetic */ n o00000(long l2) {
        return j$_c$_b.return(this.if(l2));
    }
}

