/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.ac;
import b.dd;
import b.f;
import b.lc;
import b.qc;

public final class mc {
    private static final int \u00d400000(int n2) {
        return Integer.bitCount(n2);
    }

    private static final int \u00d500000(int n2) {
        return Integer.numberOfLeadingZeros(n2);
    }

    private static final int o00000(int n2) {
        return Integer.numberOfTrailingZeros(n2);
    }

    private static final int \u00d200000(int n2) {
        return ac.\u00d500000(Integer.highestOneBit(n2));
    }

    private static final int Object(int n2) {
        return ac.\u00d500000(Integer.lowestOneBit(n2));
    }

    private static final int \u00d200000(int n2, int n3) {
        return ac.\u00d500000(Integer.rotateLeft(n2, n3));
    }

    private static final int o00000(int n2, int n3) {
        return ac.\u00d500000(Integer.rotateRight(n2, n3));
    }

    private static final int \u00d500000(long l2) {
        return Long.bitCount(l2);
    }

    private static final int \u00d200000(long l2) {
        return Long.numberOfLeadingZeros(l2);
    }

    private static final int Object(long l2) {
        return Long.numberOfTrailingZeros(l2);
    }

    private static final long \u00d400000(long l2) {
        return f.super(Long.highestOneBit(l2));
    }

    private static final long o00000(long l2) {
        return f.super(Long.lowestOneBit(l2));
    }

    private static final long \u00d200000(long l2, int n2) {
        return f.super(Long.rotateLeft(l2, n2));
    }

    private static final long o00000(long l2, int n2) {
        return f.super(Long.rotateRight(l2, n2));
    }

    private static final int \u00d400000(byte by) {
        return Integer.bitCount(ac.\u00d500000(by & 0xFF));
    }

    private static final int o00000(byte by) {
        return Integer.numberOfLeadingZeros(by & 0xFF) - 24;
    }

    private static final int \u00d200000(byte by) {
        return Integer.numberOfTrailingZeros(by | 0x100);
    }

    private static final byte \u00d500000(byte by) {
        return lc.super((byte)Integer.highestOneBit(by & 0xFF));
    }

    private static final byte Object(byte by) {
        return lc.super((byte)Integer.lowestOneBit(by & 0xFF));
    }

    private static final byte \u00d200000(byte by, int n2) {
        return lc.super(qc.\u00d400000(by, n2));
    }

    private static final byte o00000(byte by, int n2) {
        return lc.super(qc.Object(by, n2));
    }

    private static final int o00000(short s2) {
        return Integer.bitCount(ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int \u00d400000(short s2) {
        return Integer.numberOfLeadingZeros(s2 & 0xFFFF) - 16;
    }

    private static final int \u00d500000(short s2) {
        return Integer.numberOfTrailingZeros(s2 | 0x10000);
    }

    private static final short Object(short s2) {
        return dd.\u00d2O0000((short)Integer.highestOneBit(s2 & 0xFFFF));
    }

    private static final short \u00d200000(short s2) {
        return dd.\u00d2O0000((short)Integer.lowestOneBit(s2 & 0xFFFF));
    }

    private static final short \u00d200000(short s2, int n2) {
        return dd.\u00d2O0000(qc.\u00d400000(s2, n2));
    }

    private static final short o00000(short s2, int n2) {
        return dd.\u00d2O0000(qc.Object(s2, n2));
    }
}

