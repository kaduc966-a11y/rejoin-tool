/*
 * Decompiled with CFR 0.152.
 */
package b.f;

import b.f.b;
import b.f.d;
import b.f.e;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class f
extends d {
    private static final double \u00d400000(double d2) {
        return Math.sin(d2);
    }

    private static final double \u00f5o0000(double d2) {
        return Math.cos(d2);
    }

    private static final double Oo0000(double d2) {
        return Math.tan(d2);
    }

    private static final double while(double d2) {
        return Math.asin(d2);
    }

    private static final double return(double d2) {
        return Math.acos(d2);
    }

    private static final double \u00f4o0000(double d2) {
        return Math.atan(d2);
    }

    private static final double new(double d2, double d3) {
        return Math.atan2(d2, d3);
    }

    private static final double \u00d4O0000(double d2) {
        return Math.sinh(d2);
    }

    private static final double \u00d5o0000(double d2) {
        return Math.cosh(d2);
    }

    private static final double oO0000(double d2) {
        return Math.tanh(d2);
    }

    public static final double privatesuper(double d2) {
        if (d2 >= b.\u00d300000) {
            if (d2 > b.\u00d500000) {
                if (d2 > b.\u00d200000) {
                    return Math.log(d2) + b.\u00d800000;
                }
                return Math.log(d2 * 2.0 + 1.0 / (d2 * 2.0));
            }
            double d3 = d2;
            return Math.log(d3 + Math.sqrt(d3 * d2 + 1.0));
        }
        if (d2 <= -b.\u00d300000) {
            return -e.privatesuper(-d2);
        }
        double d4 = d2;
        if (Math.abs(d2) >= b.o00000) {
            double d5 = d2;
            d4 -= d5 * d5 * d2 / 6.0;
        }
        return d4;
    }

    public static final double \u00d300000(double d2) {
        double d3;
        if (d2 < 1.0) {
            return Double.NaN;
        }
        if (d2 > b.\u00d200000) {
            return Math.log(d2) + b.\u00d800000;
        }
        if (d2 - 1.0 >= b.\u00d300000) {
            double d4 = d2;
            return Math.log(d4 + Math.sqrt(d4 * d2 - 1.0));
        }
        double d5 = d3 = Math.sqrt(d2 - 1.0);
        if (d3 >= b.o00000) {
            double d6 = d3;
            d5 -= d6 * d6 * d3 / 12.0;
        }
        return Math.sqrt(2.0) * d5;
    }

    public static final double \u00d8o0000(double d2) {
        if (Math.abs(d2) < b.\u00d300000) {
            double d3 = d2;
            if (Math.abs(d2) > b.o00000) {
                double d4 = d2;
                d3 += d4 * d4 * d2 / 3.0;
            }
            return d3;
        }
        return Math.log((1.0 + d2) / (1.0 - d2)) / 2.0;
    }

    private static final double \u00d500000(double d2, double d3) {
        return Math.hypot(d2, d3);
    }

    private static final double \u00d3O0000(double d2) {
        return Math.sqrt(d2);
    }

    private static final double \u00f4O0000(double d2) {
        return Math.exp(d2);
    }

    private static final double O\u00d20000(double d2) {
        return Math.expm1(d2);
    }

    public static final double \u00d800000(double d2, double d3) {
        if (d3 <= 0.0 || d3 == 1.0) {
            return Double.NaN;
        }
        return Math.log(d2) / Math.log(d3);
    }

    private static final double new(double d2) {
        return Math.log(d2);
    }

    private static final double \u00f8O0000(double d2) {
        return Math.log10(d2);
    }

    public static final double if(double d2) {
        return Math.log(d2) / b.\u00d800000;
    }

    private static final double OO0000(double d2) {
        return Math.log1p(d2);
    }

    private static final double \u00d800000(double d2) {
        return Math.ceil(d2);
    }

    private static final double \u00d500000(double d2) {
        return Math.floor(d2);
    }

    public static final double o00000(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return d2;
        }
        if (d2 > 0.0) {
            return Math.floor(d2);
        }
        return Math.ceil(d2);
    }

    private static final double nullsuper(double d2) {
        return Math.rint(d2);
    }

    private static final double \u00f800000(double d2) {
        return Math.abs(d2);
    }

    private static final double \u00f400000(double d2) {
        return Math.signum(d2);
    }

    private static final double \u00d400000(double d2, double d3) {
        return Math.min(d2, d3);
    }

    private static final double \u00d300000(double d2, double d3) {
        return Math.max(d2, d3);
    }

    private static final double Stringsuper(double d2) {
        return Math.cbrt(d2);
    }

    private static final double o00000(double d2, double d3) {
        return Math.pow(d2, d3);
    }

    private static final double new(double d2, int n2) {
        return Math.pow(d2, n2);
    }

    private static final double \u00f400000(double d2, double d3) {
        return Math.IEEEremainder(d2, d3);
    }

    private static final double oo0000(double d2) {
        return Math.abs(d2);
    }

    public static /* synthetic */ void forsuper(double d2) {
    }

    private static final double \u00d4o0000(double d2) {
        return Math.signum(d2);
    }

    public static /* synthetic */ void \u00f500000(double d2) {
    }

    private static final double \u00f500000(double d2, double d3) {
        return Math.copySign(d2, d3);
    }

    private static final double o00000(double d2, int n2) {
        return Math.copySign(d2, (double)n2);
    }

    private static final double \u00d8O0000(double d2) {
        return Math.ulp(d2);
    }

    public static /* synthetic */ void \u00d5O0000(double d2) {
    }

    private static final double \u00f8o0000(double d2) {
        return Math.nextUp(d2);
    }

    private static final double \u00d3o0000(double d2) {
        return Math.nextAfter(d2, Double.NEGATIVE_INFINITY);
    }

    private static final double return(double d2, double d3) {
        return Math.nextAfter(d2, d3);
    }

    public static final int thissuper(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d2 > 2.147483647E9) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9) {
            return Integer.MIN_VALUE;
        }
        return (int)Math.round(d2);
    }

    public static final long \u00f5O0000(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d2);
    }

    private static final float o00000(float f2) {
        return (float)Math.sin(f2);
    }

    private static final float forsuper(float f2) {
        return (float)Math.cos(f2);
    }

    private static final float \u00f5O0000(float f2) {
        return (float)Math.tan(f2);
    }

    private static final float \u00f800000(float f2) {
        return (float)Math.asin(f2);
    }

    private static final float \u00d300000(float f2) {
        return (float)Math.acos(f2);
    }

    private static final float \u00d5o0000(float f2) {
        return (float)Math.atan(f2);
    }

    private static final float new(float f2, float f3) {
        return (float)Math.atan2(f2, f3);
    }

    private static final float oO0000(float f2) {
        return (float)Math.sinh(f2);
    }

    private static final float nullsuper(float f2) {
        return (float)Math.cosh(f2);
    }

    private static final float if(float f2) {
        return (float)Math.tanh(f2);
    }

    private static final float \u00d8o0000(float f2) {
        return (float)e.privatesuper((double)f2);
    }

    private static final float O\u00d20000(float f2) {
        return (float)e.\u00d300000((double)f2);
    }

    private static final float \u00d4o0000(float f2) {
        return (float)e.\u00d8o0000((double)f2);
    }

    private static final float \u00d500000(float f2, float f3) {
        return (float)Math.hypot(f2, f3);
    }

    private static final float OO0000(float f2) {
        return (float)Math.sqrt(f2);
    }

    private static final float \u00d5O0000(float f2) {
        return (float)Math.exp(f2);
    }

    private static final float \u00f5o0000(float f2) {
        return (float)Math.expm1(f2);
    }

    public static final float \u00d800000(float f2, float f3) {
        if (f3 <= 0.0f || f3 == 1.0f) {
            return Float.NaN;
        }
        return (float)(Math.log(f2) / Math.log(f3));
    }

    private static final float \u00f8o0000(float f2) {
        return (float)Math.log(f2);
    }

    private static final float \u00f4O0000(float f2) {
        return (float)Math.log10(f2);
    }

    public static final float \u00d800000(float f2) {
        return (float)(Math.log(f2) / b.\u00d800000);
    }

    private static final float \u00f500000(float f2) {
        return (float)Math.log1p(f2);
    }

    private static final float \u00d400000(float f2) {
        return (float)Math.ceil(f2);
    }

    private static final float new(float f2) {
        return (float)Math.floor(f2);
    }

    public static final float privatesuper(float f2) {
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            return f2;
        }
        if (f2 > 0.0f) {
            return (float)Math.floor(f2);
        }
        return (float)Math.ceil(f2);
    }

    private static final float \u00f8O0000(float f2) {
        return (float)Math.rint(f2);
    }

    private static final float \u00f400000(float f2) {
        return Math.abs(f2);
    }

    private static final float \u00d500000(float f2) {
        return Math.signum(f2);
    }

    private static final float \u00d400000(float f2, float f3) {
        return Math.min(f2, f3);
    }

    private static final float \u00d300000(float f2, float f3) {
        return Math.max(f2, f3);
    }

    private static final float \u00d8O0000(float f2) {
        return (float)Math.cbrt(f2);
    }

    private static final float o00000(float f2, float f3) {
        return (float)Math.pow(f2, f3);
    }

    private static final float new(float f2, int n2) {
        return (float)Math.pow(f2, n2);
    }

    private static final float \u00f400000(float f2, float f3) {
        return (float)Math.IEEEremainder(f2, f3);
    }

    private static final float Stringsuper(float f2) {
        return Math.abs(f2);
    }

    public static /* synthetic */ void \u00d3o0000(float f2) {
    }

    private static final float oo0000(float f2) {
        return Math.signum(f2);
    }

    public static /* synthetic */ void return(float f2) {
    }

    private static final float \u00f500000(float f2, float f3) {
        return Math.copySign(f2, f3);
    }

    private static final float o00000(float f2, int n2) {
        return Math.copySign(f2, n2);
    }

    private static final float \u00d4O0000(float f2) {
        return Math.ulp(f2);
    }

    public static /* synthetic */ void while(float f2) {
    }

    private static final float \u00f4o0000(float f2) {
        return Math.nextUp(f2);
    }

    private static final float Oo0000(float f2) {
        return Math.nextAfter(f2, Double.NEGATIVE_INFINITY);
    }

    private static final float return(float f2, float f3) {
        return Math.nextAfter(f2, (double)f3);
    }

    public static final int \u00d3O0000(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    public static final long thissuper(float f2) {
        return e.\u00f5O0000((double)f2);
    }

    private static final int o00000(int n2) {
        return Math.abs(n2);
    }

    private static final int new(int n2, int n3) {
        return Math.min(n2, n3);
    }

    private static final int o00000(int n2, int n3) {
        return Math.max(n2, n3);
    }

    private static final int new(int n2) {
        return Math.abs(n2);
    }

    public static /* synthetic */ void \u00d400000(int n2) {
    }

    public static final int \u00d300000(int n2) {
        return Integer.signum(n2);
    }

    public static /* synthetic */ void \u00d500000(int n2) {
    }

    private static final long \u00d500000(long l2) {
        return Math.abs(l2);
    }

    private static final long new(long l2, long l3) {
        return Math.min(l2, l3);
    }

    private static final long o00000(long l2, long l3) {
        return Math.max(l2, l3);
    }

    private static final long o00000(long l2) {
        return Math.abs(l2);
    }

    public static /* synthetic */ void \u00d300000(long l2) {
    }

    public static final int new(long l2) {
        return Long.signum(l2);
    }

    public static /* synthetic */ void \u00d400000(long l2) {
    }
}

