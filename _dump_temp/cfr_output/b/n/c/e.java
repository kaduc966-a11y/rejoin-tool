/*
 * Decompiled with CFR 0.152.
 */
package b.n.c;

import b.n.c.h;
import b.o.e.g;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class e
extends h {
    public static final AtomicIntegerArray o00000(AtomicIntegerArray atomicIntegerArray) {
        return atomicIntegerArray;
    }

    public static final AtomicIntegerArray new(AtomicIntegerArray atomicIntegerArray) {
        return atomicIntegerArray;
    }

    public static final AtomicLongArray new(AtomicLongArray atomicLongArray) {
        return atomicLongArray;
    }

    public static final AtomicLongArray o00000(AtomicLongArray atomicLongArray) {
        return atomicLongArray;
    }

    public static final AtomicReferenceArray new(AtomicReferenceArray atomicReferenceArray) {
        return atomicReferenceArray;
    }

    public static final AtomicReferenceArray o00000(AtomicReferenceArray atomicReferenceArray) {
        return atomicReferenceArray;
    }

    private static final void o00000(AtomicIntegerArray atomicIntegerArray, int n2, g g2) {
        int n3;
        int n4;
        while (!atomicIntegerArray.compareAndSet(n2, n4 = atomicIntegerArray.get(n2), n3 = ((Number)g2.\u00f800000(n4)).intValue())) {
        }
    }

    private static final int \u00d300000(AtomicIntegerArray atomicIntegerArray, int n2, g g2) {
        int n3;
        int n4;
        while (!atomicIntegerArray.compareAndSet(n2, n4 = atomicIntegerArray.get(n2), n3 = ((Number)g2.\u00f800000(n4)).intValue())) {
        }
        return n3;
    }

    private static final int new(AtomicIntegerArray atomicIntegerArray, int n2, g g2) {
        int n3;
        int n4;
        while (!atomicIntegerArray.compareAndSet(n2, n4 = atomicIntegerArray.get(n2), n3 = ((Number)g2.\u00f800000(n4)).intValue())) {
        }
        return n4;
    }

    private static final void o00000(AtomicLongArray atomicLongArray, int n2, g g2) {
        long l2;
        long l3;
        while (!atomicLongArray.compareAndSet(n2, l3 = atomicLongArray.get(n2), l2 = ((Number)g2.\u00f800000(l3)).longValue())) {
        }
    }

    private static final long new(AtomicLongArray atomicLongArray, int n2, g g2) {
        long l2;
        long l3;
        while (!atomicLongArray.compareAndSet(n2, l3 = atomicLongArray.get(n2), l2 = ((Number)g2.\u00f800000(l3)).longValue())) {
        }
        return l2;
    }

    private static final long \u00d300000(AtomicLongArray atomicLongArray, int n2, g g2) {
        long l2;
        long l3;
        while (!atomicLongArray.compareAndSet(n2, l3 = atomicLongArray.get(n2), l2 = ((Number)g2.\u00f800000(l3)).longValue())) {
        }
        return l3;
    }

    private static final void o00000(AtomicReferenceArray atomicReferenceArray, int n2, g g2) {
        Object object;
        Object e2;
        while (!atomicReferenceArray.compareAndSet(n2, e2 = atomicReferenceArray.get(n2), object = g2.\u00f800000(e2))) {
        }
    }

    private static final Object \u00d300000(AtomicReferenceArray atomicReferenceArray, int n2, g g2) {
        Object object;
        Object e2;
        while (!atomicReferenceArray.compareAndSet(n2, e2 = atomicReferenceArray.get(n2), object = g2.\u00f800000(e2))) {
        }
        return object;
    }

    private static final Object new(AtomicReferenceArray atomicReferenceArray, int n2, g g2) {
        Object object;
        Object e2;
        while (!atomicReferenceArray.compareAndSet(n2, e2 = atomicReferenceArray.get(n2), object = g2.\u00f800000(e2))) {
        }
        return e2;
    }
}

