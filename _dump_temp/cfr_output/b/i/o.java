/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.m;
import b.i.o$_b;
import b.qd;
import java.util.concurrent.TimeUnit;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class o {
    public static final TimeUnit super(m m2) {
        return m2.\u00d300000();
    }

    public static final m super(TimeUnit timeUnit) {
        switch (o$_b.o00000[timeUnit.ordinal()]) {
            case 1: {
                return m.\u00d300000;
            }
            case 2: {
                return m.\u00d200000;
            }
            case 3: {
                return m.\u00f400000;
            }
            case 4: {
                return m.\u00d600000;
            }
            case 5: {
                return m.int;
            }
            case 6: {
                return m.\u00d800000;
            }
            case 7: {
                return m.\u00f600000;
            }
        }
        throw new qd();
    }

    public static final double super(double d2, m m2, m m3) {
        long l2 = m3.\u00d300000().convert(1L, m2.\u00d300000());
        if (l2 > 0L) {
            return d2 * (double)l2;
        }
        long l3 = m2.\u00d300000().convert(1L, m3.\u00d300000());
        return d2 / (double)l3;
    }

    public static final long super(long l2, m m2, m m3) {
        return m3.\u00d300000().convert(l2, m2.\u00d300000());
    }

    public static final long \u00d200000(long l2, m m2, m m3) {
        return m3.\u00d300000().convert(l2, m2.\u00d300000());
    }
}

