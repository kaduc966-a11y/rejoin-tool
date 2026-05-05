/*
 * Decompiled with CFR 0.152.
 */
package b.v;

import b.i.e;
import b.v.d;
import b.v.f;
import java.util.concurrent.atomic.AtomicLong;

final class g {
    public static final g \u00d500000 = new g();
    private static final int o00000 = 16;
    private static final int \u00d200000 = 28672;
    private static final long \u00d300000 = 32768L;
    private static final AtomicLong String = new AtomicLong(0L);

    private g() {
    }

    public final d o00000(e e2) {
        long l2;
        long l3;
        byte[] byArray = new byte[10];
        f.o00000(byArray);
        byte[] byArray2 = byArray;
        int n2 = (byArray[8] & 7) << 8 | byArray2[9] & 0xFF | 0x7000;
        while (true) {
            long l4;
            long l5;
            if ((l5 = (l3 = String.get()) >>> 16) < (l4 = e2.o00000().\u00d600000())) {
                l2 = l4 << 16 | (long)n2;
                if (!String.compareAndSet(l3, l2)) continue;
                break;
            }
            l2 = l3 + 1L;
            if ((l2 & 0x8000L) != 0L) {
                l2 = l5 + 1L << 16 | (long)n2;
            }
            if (String.compareAndSet(l3, l2)) break;
        }
        byArray2[0] = (byte)((byte)(byArray2[0] & 0x3F) | 0xFFFFFF80);
        l3 = f.o00000(byArray2, 0);
        return d.\u00d600000.\u00d200000(l2, l3);
    }
}

