/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.wd;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class vd
extends wd {
    private static final BigInteger \u00d400000(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.add(bigInteger2);
    }

    private static final BigInteger \u00d200000(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.subtract(bigInteger2);
    }

    private static final BigInteger Object(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.multiply(bigInteger2);
    }

    private static final BigInteger \u00d500000(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.divide(bigInteger2);
    }

    private static final BigInteger \u00f400000(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.remainder(bigInteger2);
    }

    private static final BigInteger o00000(BigInteger bigInteger) {
        return bigInteger.negate();
    }

    private static final BigInteger Object(BigInteger bigInteger) {
        return bigInteger.add(BigInteger.ONE);
    }

    private static final BigInteger \u00d200000(BigInteger bigInteger) {
        return bigInteger.subtract(BigInteger.ONE);
    }

    private static final BigInteger \u00d400000(BigInteger bigInteger) {
        return bigInteger.not();
    }

    private static final BigInteger void(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.and(bigInteger2);
    }

    private static final BigInteger o00000(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.or(bigInteger2);
    }

    private static final BigInteger \u00d600000(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.xor(bigInteger2);
    }

    private static final BigInteger o00000(BigInteger bigInteger, int n2) {
        return bigInteger.shiftLeft(n2);
    }

    private static final BigInteger \u00d200000(BigInteger bigInteger, int n2) {
        return bigInteger.shiftRight(n2);
    }

    private static final BigInteger \u00d200000(int n2) {
        return BigInteger.valueOf(n2);
    }

    private static final BigInteger \u00d200000(long l2) {
        return BigInteger.valueOf(l2);
    }

    private static final BigDecimal \u00d500000(BigInteger bigInteger) {
        return new BigDecimal(bigInteger);
    }

    private static final BigDecimal o00000(BigInteger bigInteger, int n2, MathContext mathContext) {
        return new BigDecimal(bigInteger, n2, mathContext);
    }

    static /* synthetic */ BigDecimal o00000(BigInteger bigInteger, int n2, MathContext mathContext, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n2 = 0;
        }
        if ((n3 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
        }
        return new BigDecimal(bigInteger, n2, mathContext);
    }
}

