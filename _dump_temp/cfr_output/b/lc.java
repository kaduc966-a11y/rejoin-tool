/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.ac;
import b.dd;
import b.e.k;
import b.e.z;
import b.f;
import b.jc;
import b.lc$_b;
import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class lc
implements Comparable {
    public static final lc$_b \u00d600000 = new lc$_b(null);
    private final byte \u00d200000;
    public static final byte class = 0;
    public static final byte \u00d300000 = -1;
    public static final int \u00d400000 = 1;
    public static final int super = 8;

    public static /* synthetic */ void \u00d200000() {
    }

    private static int do(byte by, byte by2) {
        return fc.o00000(by & 0xFF, by2 & 0xFF);
    }

    private int int(byte by) {
        return fc.o00000(this.super() & 0xFF, by & 0xFF);
    }

    private static final int \u00d600000(byte by, short s2) {
        return fc.o00000(by & 0xFF, s2 & 0xFFFF);
    }

    private static final int super(byte by, int n2) {
        return Integer.compareUnsigned(ac.\u00d500000(by & 0xFF), n2);
    }

    private static final int \u00d600000(byte by, long l2) {
        return Long.compareUnsigned(f.super((long)by & 0xFFL), l2);
    }

    private static final int \u00f600000(byte by, byte by2) {
        return ac.\u00d500000(ac.\u00d500000(by & 0xFF) + ac.\u00d500000(by2 & 0xFF));
    }

    private static final int \u00d400000(byte by, short s2) {
        return ac.\u00d500000(ac.\u00d500000(by & 0xFF) + ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int \u00d600000(byte by, int n2) {
        return ac.\u00d500000(ac.\u00d500000(by & 0xFF) + n2);
    }

    private static final long \u00d300000(byte by, long l2) {
        return f.super(f.super((long)by & 0xFFL) + l2);
    }

    private static final int OO0000(byte by, byte by2) {
        return ac.\u00d500000(ac.\u00d500000(by & 0xFF) - ac.\u00d500000(by2 & 0xFF));
    }

    private static final int class(byte by, short s2) {
        return ac.\u00d500000(ac.\u00d500000(by & 0xFF) - ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int \u00f400000(byte by, int n2) {
        return ac.\u00d500000(ac.\u00d500000(by & 0xFF) - n2);
    }

    private static final long class(byte by, long l2) {
        return f.super(f.super((long)by & 0xFFL) - l2);
    }

    private static final int \u00d200000(byte by, byte by2) {
        return ac.\u00d500000(ac.\u00d500000(by & 0xFF) * ac.\u00d500000(by2 & 0xFF));
    }

    private static final int \u00f400000(byte by, short s2) {
        return ac.\u00d500000(ac.\u00d500000(by & 0xFF) * ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int \u00d300000(byte by, int n2) {
        return ac.\u00d500000(ac.\u00d500000(by & 0xFF) * n2);
    }

    private static final long \u00f400000(byte by, long l2) {
        return f.super(f.super((long)by & 0xFFL) * l2);
    }

    private static final int \u00d600000(byte by, byte by2) {
        return Integer.divideUnsigned(ac.\u00d500000(by & 0xFF), ac.\u00d500000(by2 & 0xFF));
    }

    private static final int \u00d200000(byte by, short s2) {
        return Integer.divideUnsigned(ac.\u00d500000(by & 0xFF), ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int class(byte by, int n2) {
        return Integer.divideUnsigned(ac.\u00d500000(by & 0xFF), n2);
    }

    private static final long \u00d200000(byte by, long l2) {
        return Long.divideUnsigned(f.super((long)by & 0xFFL), l2);
    }

    private static final int \u00d2O0000(byte by, byte by2) {
        return Integer.remainderUnsigned(ac.\u00d500000(by & 0xFF), ac.\u00d500000(by2 & 0xFF));
    }

    private static final int \u00d800000(byte by, short s2) {
        return Integer.remainderUnsigned(ac.\u00d500000(by & 0xFF), ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int \u00d200000(byte by, int n2) {
        return Integer.remainderUnsigned(ac.\u00d500000(by & 0xFF), n2);
    }

    private static final long \u00d800000(byte by, long l2) {
        return Long.remainderUnsigned(f.super((long)by & 0xFFL), l2);
    }

    private static final int class(byte by, byte by2) {
        return Integer.divideUnsigned(ac.\u00d500000(by & 0xFF), ac.\u00d500000(by2 & 0xFF));
    }

    private static final int super(byte by, short s2) {
        return Integer.divideUnsigned(ac.\u00d500000(by & 0xFF), ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int \u00d400000(byte by, int n2) {
        return Integer.divideUnsigned(ac.\u00d500000(by & 0xFF), n2);
    }

    private static final long super(byte by, long l2) {
        return Long.divideUnsigned(f.super((long)by & 0xFFL), l2);
    }

    private static final byte \u00f800000(byte by, byte by2) {
        return lc.super((byte)Integer.remainderUnsigned(ac.\u00d500000(by & 0xFF), ac.\u00d500000(by2 & 0xFF)));
    }

    private static final short \u00d300000(byte by, short s2) {
        return dd.\u00d2O0000((short)Integer.remainderUnsigned(ac.\u00d500000(by & 0xFF), ac.\u00d500000(s2 & 0xFFFF)));
    }

    private static final int \u00d800000(byte by, int n2) {
        return Integer.remainderUnsigned(ac.\u00d500000(by & 0xFF), n2);
    }

    private static final long \u00d400000(byte by, long l2) {
        return Long.remainderUnsigned(f.super((long)by & 0xFFL), l2);
    }

    private static final byte interface(byte by) {
        return lc.super((byte)(by + 1));
    }

    private static final byte \u00d800000(byte by) {
        return lc.super((byte)(by + -1));
    }

    private static final z \u00d800000(byte by, byte by2) {
        return new z(ac.\u00d500000(by & 0xFF), ac.\u00d500000(by2 & 0xFF), null);
    }

    private static final z \u00d300000(byte by, byte by2) {
        return k.\u00d400000(ac.\u00d500000(by & 0xFF), ac.\u00d500000(by2 & 0xFF));
    }

    private static final byte int(byte by, byte by2) {
        return lc.super((byte)(by & by2));
    }

    private static final byte \u00d400000(byte by, byte by2) {
        return lc.super((byte)(by | by2));
    }

    private static final byte \u00f400000(byte by, byte by2) {
        return lc.super((byte)(by ^ by2));
    }

    private static final byte class(byte by) {
        return lc.super(~by);
    }

    private static final byte OO0000(byte by) {
        return by;
    }

    private static final short \u00d2O0000(byte by) {
        return (short)((short)by & 0xFF);
    }

    private static final int \u00f400000(byte by) {
        return by & 0xFF;
    }

    private static final long \u00d4O0000(byte by) {
        return (long)by & 0xFFL;
    }

    private static final byte \u00f800000(byte by) {
        return by;
    }

    private static final short do(byte by) {
        return dd.\u00d2O0000((short)((short)by & 0xFF));
    }

    private static final int \u00d200000(byte by) {
        return ac.\u00d500000(by & 0xFF);
    }

    private static final long \u00f600000(byte by) {
        return f.super((long)by & 0xFFL);
    }

    private static final float \u00d3O0000(byte by) {
        return (float)jc.\u00d300000(by & 0xFF);
    }

    private static final double \u00d400000(byte by) {
        return jc.\u00d300000(by & 0xFF);
    }

    public static String \u00d300000(byte by) {
        return String.valueOf(by & 0xFF);
    }

    public final String toString() {
        return lc.\u00d300000(this.\u00d200000);
    }

    public static int \u00d600000(byte by) {
        return Byte.hashCode(by);
    }

    public final int hashCode() {
        return lc.\u00d600000(this.\u00d200000);
    }

    public static boolean super(byte by, Object object) {
        if (!(object instanceof lc)) {
            return false;
        }
        byte by2 = ((lc)object).super();
        return by == by2;
    }

    public final boolean equals(Object object) {
        return lc.super(this.\u00d200000, object);
    }

    private /* synthetic */ lc(byte by) {
        this.\u00d200000 = by;
    }

    public static byte super(byte by) {
        return by;
    }

    public static final /* synthetic */ lc \u00d6O0000(byte by) {
        return new lc(by);
    }

    public final /* synthetic */ byte super() {
        return this.\u00d200000;
    }

    public static final boolean super(byte by, byte by2) {
        return by == by2;
    }

    public final /* synthetic */ int compareTo(Object object) {
        lc lc2 = this;
        byte by = ((lc)object).super();
        return fc.o00000(lc2.super() & 0xFF, by & 0xFF);
    }
}

