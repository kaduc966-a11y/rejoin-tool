/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.ac;
import b.dd$_b;
import b.e.k;
import b.e.z;
import b.f;
import b.jc;
import b.lc;
import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class dd
implements Comparable {
    public static final dd$_b \u00d600000 = new dd$_b(null);
    private final short \u00d200000;
    public static final short \u00d500000 = 0;
    public static final short Object = -1;
    public static final int \u00d400000 = 2;
    public static final int o00000 = 16;

    public static /* synthetic */ void \u00d200000() {
    }

    private static final int \u00d800000(short s2, byte by) {
        return fc.o00000(s2 & 0xFFFF, by & 0xFF);
    }

    private static int \u00f600000(short s2, short s3) {
        return fc.o00000(s2 & 0xFFFF, s3 & 0xFFFF);
    }

    private int oO0000(short s2) {
        return fc.o00000(this.o00000() & 0xFFFF, s2 & 0xFFFF);
    }

    private static final int o00000(short s2, int n2) {
        return Integer.compareUnsigned(ac.\u00d500000(s2 & 0xFFFF), n2);
    }

    private static final int \u00d600000(short s2, long l2) {
        return Long.compareUnsigned(f.super((long)s2 & 0xFFFFL), l2);
    }

    private static final int String(short s2, byte by) {
        return ac.\u00d500000(ac.\u00d500000(s2 & 0xFFFF) + ac.\u00d500000(by & 0xFF));
    }

    private static final int null(short s2, short s3) {
        return ac.\u00d500000(ac.\u00d500000(s2 & 0xFFFF) + ac.\u00d500000(s3 & 0xFFFF));
    }

    private static final int \u00d600000(short s2, int n2) {
        return ac.\u00d500000(ac.\u00d500000(s2 & 0xFFFF) + n2);
    }

    private static final long \u00d300000(short s2, long l2) {
        return f.super(f.super((long)s2 & 0xFFFFL) + l2);
    }

    private static final int \u00d600000(short s2, byte by) {
        return ac.\u00d500000(ac.\u00d500000(s2 & 0xFFFF) - ac.\u00d500000(by & 0xFF));
    }

    private static final int \u00f500000(short s2, short s3) {
        return ac.\u00d500000(ac.\u00d500000(s2 & 0xFFFF) - ac.\u00d500000(s3 & 0xFFFF));
    }

    private static final int null(short s2, int n2) {
        return ac.\u00d500000(ac.\u00d500000(s2 & 0xFFFF) - n2);
    }

    private static final long \u00d500000(short s2, long l2) {
        return f.super(f.super((long)s2 & 0xFFFFL) - l2);
    }

    private static final int o00000(short s2, byte by) {
        return ac.\u00d500000(ac.\u00d500000(s2 & 0xFFFF) * ac.\u00d500000(by & 0xFF));
    }

    private static final int oO0000(short s2, short s3) {
        return ac.\u00d500000(ac.\u00d500000(s2 & 0xFFFF) * ac.\u00d500000(s3 & 0xFFFF));
    }

    private static final int \u00d300000(short s2, int n2) {
        return ac.\u00d500000(ac.\u00d500000(s2 & 0xFFFF) * n2);
    }

    private static final long null(short s2, long l2) {
        return f.super(f.super((long)s2 & 0xFFFFL) * l2);
    }

    private static final int \u00d300000(short s2, byte by) {
        return Integer.divideUnsigned(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(by & 0xFF));
    }

    private static final int \u00d500000(short s2, short s3) {
        return Integer.divideUnsigned(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(s3 & 0xFFFF));
    }

    private static final int \u00d500000(short s2, int n2) {
        return Integer.divideUnsigned(ac.\u00d500000(s2 & 0xFFFF), n2);
    }

    private static final long \u00d200000(short s2, long l2) {
        return Long.divideUnsigned(f.super((long)s2 & 0xFFFFL), l2);
    }

    private static final int null(short s2, byte by) {
        return Integer.remainderUnsigned(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(by & 0xFF));
    }

    private static final int \u00f800000(short s2, short s3) {
        return Integer.remainderUnsigned(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(s3 & 0xFFFF));
    }

    private static final int \u00d200000(short s2, int n2) {
        return Integer.remainderUnsigned(ac.\u00d500000(s2 & 0xFFFF), n2);
    }

    private static final long \u00d800000(short s2, long l2) {
        return Long.remainderUnsigned(f.super((long)s2 & 0xFFFFL), l2);
    }

    private static final int \u00d200000(short s2, byte by) {
        return Integer.divideUnsigned(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(by & 0xFF));
    }

    private static final int \u00d300000(short s2, short s3) {
        return Integer.divideUnsigned(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(s3 & 0xFFFF));
    }

    private static final int String(short s2, int n2) {
        return Integer.divideUnsigned(ac.\u00d500000(s2 & 0xFFFF), n2);
    }

    private static final long o00000(short s2, long l2) {
        return Long.divideUnsigned(f.super((long)s2 & 0xFFFFL), l2);
    }

    private static final byte \u00d500000(short s2, byte by) {
        return lc.super((byte)Integer.remainderUnsigned(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(by & 0xFF)));
    }

    private static final short \u00d800000(short s2, short s3) {
        return dd.\u00d2O0000((short)Integer.remainderUnsigned(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(s3 & 0xFFFF)));
    }

    private static final int \u00d800000(short s2, int n2) {
        return Integer.remainderUnsigned(ac.\u00d500000(s2 & 0xFFFF), n2);
    }

    private static final long String(short s2, long l2) {
        return Long.remainderUnsigned(f.super((long)s2 & 0xFFFFL), l2);
    }

    private static final short \u00d500000(short s2) {
        return dd.\u00d2O0000((short)(s2 + 1));
    }

    private static final short for(short s2) {
        return dd.\u00d2O0000((short)(s2 + -1));
    }

    private static final z \u00d600000(short s2, short s3) {
        return new z(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(s3 & 0xFFFF), null);
    }

    private static final z \u00d2O0000(short s2, short s3) {
        return k.\u00d400000(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(s3 & 0xFFFF));
    }

    private static final short String(short s2, short s3) {
        return dd.\u00d2O0000((short)(s2 & s3));
    }

    private static final short for(short s2, short s3) {
        return dd.\u00d2O0000((short)(s2 | s3));
    }

    private static final short \u00d200000(short s2, short s3) {
        return dd.\u00d2O0000((short)(s2 ^ s3));
    }

    private static final short \u00f800000(short s2) {
        return dd.\u00d2O0000(~s2);
    }

    private static final byte \u00f500000(short s2) {
        return (byte)s2;
    }

    private static final short \u00d3O0000(short s2) {
        return s2;
    }

    private static final int \u00d600000(short s2) {
        return s2 & 0xFFFF;
    }

    private static final long \u00d5O0000(short s2) {
        return (long)s2 & 0xFFFFL;
    }

    private static final byte null(short s2) {
        return lc.super((byte)s2);
    }

    private static final short \u00f600000(short s2) {
        return s2;
    }

    private static final int o00000(short s2) {
        return ac.\u00d500000(s2 & 0xFFFF);
    }

    private static final long \u00d800000(short s2) {
        return f.super((long)s2 & 0xFFFFL);
    }

    private static final float private(short s2) {
        return (float)jc.\u00d300000(s2 & 0xFFFF);
    }

    private static final double \u00d200000(short s2) {
        return jc.\u00d300000(s2 & 0xFFFF);
    }

    public static String \u00d300000(short s2) {
        return String.valueOf(s2 & 0xFFFF);
    }

    public final String toString() {
        return dd.\u00d300000(this.\u00d200000);
    }

    public static int String(short s2) {
        return Short.hashCode(s2);
    }

    public final int hashCode() {
        return dd.String(this.\u00d200000);
    }

    public static boolean o00000(short s2, Object object) {
        if (!(object instanceof dd)) {
            return false;
        }
        short s3 = ((dd)object).o00000();
        return s2 == s3;
    }

    public final boolean equals(Object object) {
        return dd.o00000(this.\u00d200000, object);
    }

    private /* synthetic */ dd(short s2) {
        this.\u00d200000 = s2;
    }

    public static short \u00d2O0000(short s2) {
        return s2;
    }

    public static final /* synthetic */ dd \u00d6O0000(short s2) {
        return new dd(s2);
    }

    public final /* synthetic */ short o00000() {
        return this.\u00d200000;
    }

    public static final boolean o00000(short s2, short s3) {
        return s2 == s3;
    }

    public final /* synthetic */ int compareTo(Object object) {
        dd dd2 = this;
        short s2 = ((dd)object).o00000();
        return fc.o00000(dd2.o00000() & 0xFFFF, s2 & 0xFFFF);
    }
}

