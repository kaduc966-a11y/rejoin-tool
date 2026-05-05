/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.ic;
import b.o.d.l;
import b.o.d.t;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class cb
extends ic {
    private static final boolean \u00d600000(double d2) {
        return Double.isNaN(d2);
    }

    private static final boolean Object(float f2) {
        return Float.isNaN(f2);
    }

    private static final boolean \u00d500000(double d2) {
        return Double.isInfinite(d2);
    }

    private static final boolean \u00d400000(float f2) {
        return Float.isInfinite(f2);
    }

    private static final boolean \u00d200000(double d2) {
        return Math.abs(d2) <= Double.MAX_VALUE;
    }

    private static final boolean \u00d500000(float f2) {
        return Math.abs(f2) <= Float.MAX_VALUE;
    }

    private static final long Object(double d2) {
        return Double.doubleToLongBits(d2);
    }

    private static final long \u00d400000(double d2) {
        return Double.doubleToRawLongBits(d2);
    }

    private static final double o00000(t t2, long l2) {
        return Double.longBitsToDouble(l2);
    }

    private static final int \u00d600000(float f2) {
        return Float.floatToIntBits(f2);
    }

    private static final int \u00d200000(float f2) {
        return Float.floatToRawIntBits(f2);
    }

    private static final float o00000(l l2, int n2) {
        return Float.intBitsToFloat(n2);
    }

    private static final int \u00d600000(int n2) {
        return Integer.bitCount(n2);
    }

    private static final int \u00d400000(int n2) {
        return Integer.numberOfLeadingZeros(n2);
    }

    private static final int Object(int n2) {
        return Integer.numberOfTrailingZeros(n2);
    }

    private static final int \u00d500000(int n2) {
        return Integer.highestOneBit(n2);
    }

    private static final int void(int n2) {
        return Integer.lowestOneBit(n2);
    }

    private static final int \u00d400000(int n2, int n3) {
        return Integer.rotateLeft(n2, n3);
    }

    private static final int Object(int n2, int n3) {
        return Integer.rotateRight(n2, n3);
    }

    private static final int \u00d400000(long l2) {
        return Long.bitCount(l2);
    }

    private static final int \u00d600000(long l2) {
        return Long.numberOfLeadingZeros(l2);
    }

    private static final int \u00d500000(long l2) {
        return Long.numberOfTrailingZeros(l2);
    }

    private static final long void(long l2) {
        return Long.highestOneBit(l2);
    }

    private static final long Object(long l2) {
        return Long.lowestOneBit(l2);
    }

    private static final long \u00d400000(long l2, int n2) {
        return Long.rotateLeft(l2, n2);
    }

    private static final long Object(long l2, int n2) {
        return Long.rotateRight(l2, n2);
    }
}

