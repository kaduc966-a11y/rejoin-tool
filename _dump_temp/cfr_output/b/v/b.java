/*
 * Decompiled with CFR 0.152.
 */
package b.v;

import b.o.d.fc;
import b.v.d;
import b.v.f;
import b.v.h;
import b.v.i;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

class b {
    public static final void o00000(byte[] byArray) {
        h.new.super().nextBytes(byArray);
    }

    public static final Object \u00d200000(d d2) {
        return new i(d2.\u00d500000(), d2.void());
    }

    public static final long o00000(byte[] byArray, int n2) {
        return f.\u00d400000(byArray, n2);
    }

    public static final void o00000(long l2, byte[] byArray, int n2, int n3, int n4) {
        f.\u00d200000(l2, byArray, n2, n3, n4);
    }

    public static final void o00000(byte[] byArray, int n2, long l2) {
        f.\u00d200000(byArray, n2, l2);
    }

    public static final d Object(String string) {
        return f.\u00d500000(string);
    }

    public static final d \u00d400000(String string) {
        return f.\u00f400000(string);
    }

    public static final d o00000(String string) {
        return f.void(string);
    }

    public static final d \u00d200000(String string) {
        return f.\u00d600000(string);
    }

    public static final d o00000(UUID uUID) {
        return d.\u00d600000.\u00d200000(uUID.getMostSignificantBits(), uUID.getLeastSignificantBits());
    }

    public static final UUID o00000(d d2) {
        long l2 = d2.void();
        long l3 = d2.\u00d500000();
        return new UUID(l3, l2);
    }

    public static final d o00000(ByteBuffer byteBuffer) {
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferUnderflowException();
        }
        long l2 = byteBuffer.getLong();
        long l3 = byteBuffer.getLong();
        if (fc.o00000((Object)byteBuffer.order(), (Object)ByteOrder.LITTLE_ENDIAN)) {
            l2 = Long.reverseBytes(l2);
            l3 = Long.reverseBytes(l3);
        }
        return d.\u00d600000.\u00d200000(l2, l3);
    }

    public static final d o00000(ByteBuffer byteBuffer, int n2) {
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("Negative index: ".concat(String.valueOf(n2)));
        }
        if (n2 + 15 >= byteBuffer.limit()) {
            throw new IndexOutOfBoundsException("Not enough bytes to read a uuid at index: " + n2 + ", with limit: " + byteBuffer.limit() + ' ');
        }
        long l2 = byteBuffer.getLong(n2);
        long l3 = byteBuffer.getLong(n2 + 8);
        if (fc.o00000((Object)byteBuffer.order(), (Object)ByteOrder.LITTLE_ENDIAN)) {
            l2 = Long.reverseBytes(l2);
            l3 = Long.reverseBytes(l3);
        }
        return d.\u00d600000.\u00d200000(l2, l3);
    }

    public static final ByteBuffer o00000(ByteBuffer byteBuffer, d d2) {
        long l2 = d2.void();
        long l3 = d2.\u00d500000();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferOverflowException();
        }
        if (fc.o00000((Object)byteBuffer.order(), (Object)ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(l3);
            return byteBuffer.putLong(l2);
        }
        byteBuffer.putLong(Long.reverseBytes(l3));
        return byteBuffer.putLong(Long.reverseBytes(l2));
    }

    public static final ByteBuffer o00000(ByteBuffer byteBuffer, int n2, d d2) {
        long l2 = d2.void();
        long l3 = d2.\u00d500000();
        if (n2 < 0) {
            throw new IndexOutOfBoundsException("Negative index: ".concat(String.valueOf(n2)));
        }
        if (n2 + 15 >= byteBuffer.limit()) {
            throw new IndexOutOfBoundsException("Not enough capacity to write a uuid at index: " + n2 + ", with limit: " + byteBuffer.limit() + ' ');
        }
        if (fc.o00000((Object)byteBuffer.order(), (Object)ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(n2, l3);
            return byteBuffer.putLong(n2 + 8, l2);
        }
        byteBuffer.putLong(n2, Long.reverseBytes(l3));
        return byteBuffer.putLong(n2 + 8, Long.reverseBytes(l2));
    }

    public static final long o00000(long l2) {
        return Long.reverseBytes(l2);
    }
}

