/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.b;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g {
    private static final boolean super = b.class.desiredAssertionStatus();
    private static final ThreadLocal[] \u00d200000;

    public static final boolean o00000() {
        return super;
    }

    private static final DecimalFormat o00000(int n2) {
        DecimalFormat decimalFormat;
        DecimalFormat decimalFormat2 = decimalFormat = new DecimalFormat("0");
        if (n2 > 0) {
            decimalFormat2.setMinimumFractionDigits(n2);
        }
        decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    public static final String o00000(double d2, int n2) {
        DecimalFormat decimalFormat;
        if (n2 < \u00d200000.length) {
            ThreadLocal threadLocal = \u00d200000[n2];
            Object object = threadLocal.get();
            if (object == null) {
                DecimalFormat decimalFormat2;
                DecimalFormat decimalFormat3 = decimalFormat2 = g.o00000(n2);
                threadLocal.set(decimalFormat3);
                object = decimalFormat2;
            }
            decimalFormat = (DecimalFormat)object;
        } else {
            decimalFormat = g.o00000(n2);
        }
        return decimalFormat.format(d2);
    }

    static {
        int n2 = 0;
        ThreadLocal[] threadLocalArray = new ThreadLocal[4];
        while (n2 < 4) {
            int n3 = n2++;
            threadLocalArray[n3] = new ThreadLocal();
        }
        \u00d200000 = threadLocalArray;
    }
}

