/*
 * Decompiled with CFR 0.152.
 */
package b;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

class wd {
    private static final BigDecimal \u00d400000(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.add(bigDecimal2);
    }

    private static final BigDecimal \u00d500000(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.subtract(bigDecimal2);
    }

    private static final BigDecimal o00000(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.multiply(bigDecimal2);
    }

    private static final BigDecimal Object(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
    }

    private static final BigDecimal \u00d200000(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.remainder(bigDecimal2);
    }

    private static final BigDecimal \u00d200000(BigDecimal bigDecimal) {
        return bigDecimal.negate();
    }

    private static final BigDecimal Object(BigDecimal bigDecimal) {
        return bigDecimal.add(BigDecimal.ONE);
    }

    private static final BigDecimal o00000(BigDecimal bigDecimal) {
        return bigDecimal.subtract(BigDecimal.ONE);
    }

    private static final BigDecimal o00000(int n2) {
        return BigDecimal.valueOf(n2);
    }

    private static final BigDecimal o00000(int n2, MathContext mathContext) {
        return new BigDecimal(n2, mathContext);
    }

    private static final BigDecimal o00000(long l2) {
        return BigDecimal.valueOf(l2);
    }

    private static final BigDecimal o00000(long l2, MathContext mathContext) {
        return new BigDecimal(l2, mathContext);
    }

    private static final BigDecimal o00000(float f2) {
        return new BigDecimal(String.valueOf(f2));
    }

    private static final BigDecimal o00000(float f2, MathContext mathContext) {
        return new BigDecimal(String.valueOf(f2), mathContext);
    }

    private static final BigDecimal o00000(double d2) {
        return new BigDecimal(String.valueOf(d2));
    }

    private static final BigDecimal o00000(double d2, MathContext mathContext) {
        return new BigDecimal(String.valueOf(d2), mathContext);
    }
}

