/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.cb;

class gc
extends cb {
    private static final int \u00d400000(byte by) {
        return Integer.bitCount(by & 0xFF);
    }

    private static final int o00000(byte by) {
        return Integer.numberOfLeadingZeros(by & 0xFF) - 24;
    }

    private static final int \u00d200000(byte by) {
        return Integer.numberOfTrailingZeros(by | 0x100);
    }

    private static final byte Object(byte by) {
        return (byte)Integer.highestOneBit(by & 0xFF);
    }

    private static final byte \u00d500000(byte by) {
        return (byte)Integer.lowestOneBit(by);
    }

    public static final byte \u00d400000(byte by, int n2) {
        return (byte)(by << (n2 & 7) | (by & 0xFF) >>> 8 - (n2 & 7));
    }

    public static final byte Object(byte by, int n2) {
        return (byte)(by << 8 - (n2 & 7) | (by & 0xFF) >>> (n2 & 7));
    }

    private static final int \u00d200000(short s2) {
        return Integer.bitCount(s2 & 0xFFFF);
    }

    private static final int \u00d400000(short s2) {
        return Integer.numberOfLeadingZeros(s2 & 0xFFFF) - 16;
    }

    private static final int Object(short s2) {
        return Integer.numberOfTrailingZeros(s2 | 0x10000);
    }

    private static final short o00000(short s2) {
        return (short)Integer.highestOneBit(s2 & 0xFFFF);
    }

    private static final short \u00d500000(short s2) {
        return (short)Integer.lowestOneBit(s2);
    }

    public static final short \u00d400000(short s2, int n2) {
        return (short)(s2 << (n2 & 0xF) | (s2 & 0xFFFF) >>> 16 - (n2 & 0xF));
    }

    public static final short Object(short s2, int n2) {
        return (short)(s2 << 16 - (n2 & 0xF) | (s2 & 0xFFFF) >>> (n2 & 0xF));
    }
}

