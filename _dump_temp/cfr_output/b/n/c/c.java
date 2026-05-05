/*
 * Decompiled with CFR 0.152.
 */
package b.n.c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class c {
    public static final void \u00d200000(AtomicInteger atomicInteger, int n2) {
        atomicInteger.addAndGet(n2);
    }

    public static final void super(AtomicInteger atomicInteger, int n2) {
        atomicInteger.addAndGet(-n2);
    }

    public static final int \u00d300000(AtomicInteger atomicInteger) {
        return atomicInteger.getAndAdd(1);
    }

    public static final int \u00d400000(AtomicInteger atomicInteger) {
        return atomicInteger.addAndGet(1);
    }

    public static final int \u00d200000(AtomicInteger atomicInteger) {
        return atomicInteger.addAndGet(-1);
    }

    public static final int super(AtomicInteger atomicInteger) {
        return atomicInteger.getAndAdd(-1);
    }

    public static final void super(AtomicLong atomicLong, long l2) {
        atomicLong.addAndGet(l2);
    }

    public static final void \u00d200000(AtomicLong atomicLong, long l2) {
        atomicLong.addAndGet(-l2);
    }

    public static final long super(AtomicLong atomicLong) {
        return atomicLong.getAndAdd(1L);
    }

    public static final long \u00d200000(AtomicLong atomicLong) {
        return atomicLong.addAndGet(1L);
    }

    public static final long \u00d300000(AtomicLong atomicLong) {
        return atomicLong.addAndGet(-1L);
    }

    public static final long \u00d400000(AtomicLong atomicLong) {
        return atomicLong.getAndAdd(-1L);
    }
}

