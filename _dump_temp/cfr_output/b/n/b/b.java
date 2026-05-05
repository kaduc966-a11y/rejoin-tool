/*
 * Decompiled with CFR 0.152.
 */
package b.n.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class b {
    public static final int o00000(AtomicInteger atomicInteger, int n2, int n3) {
        int n4;
        while (n2 == (n4 = atomicInteger.get())) {
            if (!atomicInteger.compareAndSet(n2, n3)) continue;
            return n2;
        }
        return n4;
    }

    public static final long o00000(AtomicLong atomicLong, long l2, long l3) {
        long l4;
        while (l2 == (l4 = atomicLong.get())) {
            if (!atomicLong.compareAndSet(l2, l3)) continue;
            return l2;
        }
        return l4;
    }

    public static final boolean o00000(AtomicBoolean atomicBoolean, boolean bl, boolean bl2) {
        boolean bl3;
        while (bl == (bl3 = atomicBoolean.get())) {
            if (!atomicBoolean.compareAndSet(bl, bl2)) continue;
            return bl;
        }
        return bl3;
    }

    public static final Object o00000(AtomicReference atomicReference, Object object, Object object2) {
        Object v2;
        while (object == (v2 = atomicReference.get())) {
            if (!atomicReference.compareAndSet(object, object2)) continue;
            return object;
        }
        return v2;
    }

    public static final int o00000(AtomicIntegerArray atomicIntegerArray, int n2, int n3, int n4) {
        int n5;
        while (n3 == (n5 = atomicIntegerArray.get(n2))) {
            if (!atomicIntegerArray.compareAndSet(n2, n3, n4)) continue;
            return n3;
        }
        return n5;
    }

    public static final long o00000(AtomicLongArray atomicLongArray, int n2, long l2, long l3) {
        long l4;
        while (l2 == (l4 = atomicLongArray.get(n2))) {
            if (!atomicLongArray.compareAndSet(n2, l2, l3)) continue;
            return l2;
        }
        return l4;
    }

    public static final Object o00000(AtomicReferenceArray atomicReferenceArray, int n2, Object object, Object object2) {
        Object e2;
        while (object == (e2 = atomicReferenceArray.get(n2))) {
            if (!atomicReferenceArray.compareAndSet(n2, object, object2)) continue;
            return object;
        }
        return e2;
    }
}

