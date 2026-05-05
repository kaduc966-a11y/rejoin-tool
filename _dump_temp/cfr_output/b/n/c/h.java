/*
 * Decompiled with CFR 0.152.
 */
package b.n.c;

import b.o.d.fc;
import b.o.e.g;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class h {
    public static final AtomicIntegerArray \u00d300000(int n2, g g2) {
        int n3 = 0;
        int[] nArray = new int[n2];
        while (n3 < n2) {
            int n4 = n3++;
            nArray[n4] = ((Number)g2.\u00f800000(n4)).intValue();
        }
        int[] nArray2 = nArray;
        return new AtomicIntegerArray(nArray2);
    }

    public static final int \u00d400000(AtomicIntegerArray atomicIntegerArray, int n2) {
        return atomicIntegerArray.getAndAdd(n2, 1);
    }

    public static final int o00000(AtomicIntegerArray atomicIntegerArray, int n2) {
        return atomicIntegerArray.addAndGet(n2, 1);
    }

    public static final int \u00d300000(AtomicIntegerArray atomicIntegerArray, int n2) {
        return atomicIntegerArray.addAndGet(n2, -1);
    }

    public static final int new(AtomicIntegerArray atomicIntegerArray, int n2) {
        return atomicIntegerArray.getAndAdd(n2, -1);
    }

    public static final AtomicLongArray o00000(int n2, g g2) {
        int n3 = 0;
        long[] lArray = new long[n2];
        while (n3 < n2) {
            int n4 = n3++;
            lArray[n4] = ((Number)g2.\u00f800000(n4)).longValue();
        }
        long[] lArray2 = lArray;
        return new AtomicLongArray(lArray2);
    }

    public static final long o00000(AtomicLongArray atomicLongArray, int n2) {
        return atomicLongArray.getAndAdd(n2, 1L);
    }

    public static final long new(AtomicLongArray atomicLongArray, int n2) {
        return atomicLongArray.addAndGet(n2, 1L);
    }

    public static final long \u00d400000(AtomicLongArray atomicLongArray, int n2) {
        return atomicLongArray.addAndGet(n2, -1L);
    }

    public static final long \u00d300000(AtomicLongArray atomicLongArray, int n2) {
        return atomicLongArray.getAndAdd(n2, -1L);
    }

    public static final /* synthetic */ AtomicReferenceArray new(int n2, g g2) {
        int n3 = 0;
        fc.o00000(0, "T");
        Object[] objectArray = new Object[n2];
        while (n3 < n2) {
            int n4 = n3++;
            objectArray[n4] = g2.\u00f800000(n4);
        }
        Object[] objectArray2 = objectArray;
        return new AtomicReferenceArray<Object>(objectArray2);
    }

    public static final /* synthetic */ AtomicReferenceArray o00000(int n2) {
        int n3 = 0;
        fc.o00000(0, "T?");
        Object[] objectArray = new Object[n2];
        while (n3 < n2) {
            int n4 = n3++;
            objectArray[n4] = null;
        }
        Object[] objectArray2 = objectArray;
        return new AtomicReferenceArray<Object>(objectArray2);
    }
}

