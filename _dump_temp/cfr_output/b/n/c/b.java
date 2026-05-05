/*
 * Decompiled with CFR 0.152.
 */
package b.n.c;

import b.n.c.c;
import b.o.e.g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class b
extends c {
    public static final AtomicInteger \u00d600000(AtomicInteger atomicInteger) {
        return atomicInteger;
    }

    public static final AtomicInteger class(AtomicInteger atomicInteger) {
        return atomicInteger;
    }

    public static final AtomicLong \u00d600000(AtomicLong atomicLong) {
        return atomicLong;
    }

    public static final AtomicLong class(AtomicLong atomicLong) {
        return atomicLong;
    }

    public static final AtomicBoolean \u00d200000(AtomicBoolean atomicBoolean) {
        return atomicBoolean;
    }

    public static final AtomicBoolean super(AtomicBoolean atomicBoolean) {
        return atomicBoolean;
    }

    public static final AtomicReference \u00d200000(AtomicReference atomicReference) {
        return atomicReference;
    }

    public static final AtomicReference super(AtomicReference atomicReference) {
        return atomicReference;
    }

    private static final void \u00d300000(AtomicInteger atomicInteger, g g2) {
        int n2;
        int n3;
        while (!atomicInteger.compareAndSet(n3 = atomicInteger.get(), n2 = ((Number)g2.\u00f800000(n3)).intValue())) {
        }
    }

    private static final int super(AtomicInteger atomicInteger, g g2) {
        int n2;
        int n3;
        while (!atomicInteger.compareAndSet(n3 = atomicInteger.get(), n2 = ((Number)g2.\u00f800000(n3)).intValue())) {
        }
        return n3;
    }

    private static final int \u00d200000(AtomicInteger atomicInteger, g g2) {
        int n2;
        int n3;
        while (!atomicInteger.compareAndSet(n3 = atomicInteger.get(), n2 = ((Number)g2.\u00f800000(n3)).intValue())) {
        }
        return n2;
    }

    private static final void \u00d200000(AtomicLong atomicLong, g g2) {
        long l2;
        long l3;
        while (!atomicLong.compareAndSet(l3 = atomicLong.get(), l2 = ((Number)g2.\u00f800000(l3)).longValue())) {
        }
    }

    private static final long super(AtomicLong atomicLong, g g2) {
        long l2;
        long l3;
        while (!atomicLong.compareAndSet(l3 = atomicLong.get(), l2 = ((Number)g2.\u00f800000(l3)).longValue())) {
        }
        return l3;
    }

    private static final long \u00d300000(AtomicLong atomicLong, g g2) {
        long l2;
        long l3;
        while (!atomicLong.compareAndSet(l3 = atomicLong.get(), l2 = ((Number)g2.\u00f800000(l3)).longValue())) {
        }
        return l2;
    }

    private static final void \u00d200000(AtomicReference atomicReference, g g2) {
        Object object;
        Object v2;
        while (!atomicReference.compareAndSet(v2 = atomicReference.get(), object = g2.\u00f800000(v2))) {
        }
    }

    private static final Object \u00d300000(AtomicReference atomicReference, g g2) {
        Object object;
        Object v2;
        while (!atomicReference.compareAndSet(v2 = atomicReference.get(), object = g2.\u00f800000(v2))) {
        }
        return v2;
    }

    private static final Object super(AtomicReference atomicReference, g g2) {
        Object object;
        Object v2;
        while (!atomicReference.compareAndSet(v2 = atomicReference.get(), object = g2.\u00f800000(v2))) {
        }
        return object;
    }
}

