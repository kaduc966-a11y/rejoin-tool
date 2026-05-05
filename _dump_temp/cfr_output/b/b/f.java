/*
 * Decompiled with CFR 0.152.
 */
package b.b;

import b.b.c;
import b.b.f$_b;
import b.b.h;
import b.m.s;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class f {
    public static final f$_b super = new f$_b(null);
    private static final f \u00d200000 = s.o00000.o00000();

    public abstract int \u00d200000(int var1);

    public int \u00d200000() {
        return this.\u00d200000(32);
    }

    public int o00000(int n2) {
        return this.o00000(0, n2);
    }

    public int o00000(int n2, int n3) {
        boolean bl;
        h.super(n2, n3);
        int n4 = n3 - n2;
        if (n4 > 0 || n4 == Integer.MIN_VALUE) {
            int n5;
            int n6 = n4;
            if ((n6 & -n6) == n4) {
                n3 = h.\u00d200000(n4);
                n5 = this.\u00d200000(n3);
            } else {
                int n7;
                while ((n7 = this.\u00d200000() >>> 1) - (n3 = n7 % n4) + (n4 - 1) < 0) {
                }
                n5 = n3;
            }
            n4 = n5;
            return n2 + n4;
        }
        do {
            if (n2 <= (n4 = this.\u00d200000())) {
                if (n4 < n3) {
                    bl = true;
                    continue;
                }
                bl = false;
                continue;
            }
            bl = false;
        } while (!bl);
        return n4;
    }

    public long \u00d500000() {
        return ((long)this.\u00d200000() << 32) + (long)this.\u00d200000();
    }

    public long o00000(long l2) {
        return this.o00000(0L, l2);
    }

    public long o00000(long l2, long l3) {
        long l4;
        boolean bl;
        h.super(l2, l3);
        long l5 = l3 - l2;
        if (l5 > 0L) {
            long l6;
            long l7 = l5;
            if ((l7 & -l7) == l5) {
                long l8;
                int n2;
                int n3 = (int)l5;
                int n4 = (int)(l5 >>> 32);
                if (n3 != 0) {
                    n2 = h.\u00d200000(n3);
                    l8 = (long)this.\u00d200000(n2) & 0xFFFFFFFFL;
                } else if (n4 == 1) {
                    l8 = (long)this.\u00d200000() & 0xFFFFFFFFL;
                } else {
                    n2 = h.\u00d200000(n4);
                    l8 = ((long)this.\u00d200000(n2) << 32) + ((long)this.\u00d200000() & 0xFFFFFFFFL);
                }
                l6 = l8;
            } else {
                long l9;
                long l10;
                while ((l10 = this.\u00d500000() >>> 1) - (l9 = l10 % l5) + (l5 - 1L) < 0L) {
                }
                l6 = l9;
            }
            return l2 + l6;
        }
        do {
            if (l2 <= (l4 = this.\u00d500000())) {
                if (l4 < l3) {
                    bl = true;
                    continue;
                }
                bl = false;
                continue;
            }
            bl = false;
        } while (!bl);
        return l4;
    }

    public boolean \u00d300000() {
        return this.\u00d200000(1) != 0;
    }

    public double o00000() {
        return c.o00000(this.\u00d200000(26), this.\u00d200000(27));
    }

    public double o00000(double d2) {
        return this.o00000(0.0, d2);
    }

    public double o00000(double d2, double d3) {
        double d4;
        double d5;
        h.super(d2, d3);
        double d6 = d3 - d2;
        if (Double.isInfinite(d6) && Math.abs(d2) <= Double.MAX_VALUE && Math.abs(d3) <= Double.MAX_VALUE) {
            double d7 = this.o00000() * (d3 / 2.0 - d2 / 2.0);
            d5 = d2 + d7 + d7;
        } else {
            d5 = d4 = d2 + this.o00000() * d6;
        }
        if (d5 >= d3) {
            return Math.nextAfter(d3, Double.NEGATIVE_INFINITY);
        }
        return d4;
    }

    public float String() {
        return (float)this.\u00d200000(24) / 1.6777216E7f;
    }

    /*
     * Unable to fully structure code
     */
    public byte[] o00000(byte[] var1_1, int var2_2, int var3_5) {
        v0 = var2_2 >= 0 ? var2_2 <= var1_1.length : false;
        if (!v0) ** GOTO lbl-1000
        v1 = var3_5 >= 0 ? var3_5 <= var1_1.length : false;
        if (v1) {
            v2 = true;
        } else lbl-1000:
        // 2 sources

        {
            v2 = false;
        }
        if (!v2) {
            var2_3 = "fromIndex (" + var2_2 + ") or toIndex (" + var3_5 + ") are out of range: 0.." + var1_1.length + '.';
            throw new IllegalArgumentException(var2_3.toString());
        }
        if (!(var2_2 <= var3_5)) {
            var2_4 = "fromIndex (" + var2_2 + ") must be not greater than toIndex (" + var3_5 + ").";
            throw new IllegalArgumentException(var2_4.toString());
        }
        var4_6 = (var3_5 - var2_2) / 4;
        for (var5_7 = 0; var5_7 < var4_6; ++var5_7) {
            var6_8 = this.\u00d200000();
            var1_1[var2_2] = (byte)var6_8;
            var1_1[var2_2 + 1] = (byte)(var6_8 >>> 8);
            var1_1[var2_2 + 2] = (byte)(var6_8 >>> 16);
            var1_1[var2_2 + 3] = (byte)(var6_8 >>> 24);
            var2_2 += 4;
        }
        var5_7 = var3_5 - var2_2;
        var3_5 = this.\u00d200000(var5_7 * 8);
        for (var4_6 = 0; var4_6 < var5_7; ++var4_6) {
            var1_1[var2_2 + var4_6] = (byte)(var3_5 >>> var4_6 * 8);
        }
        return var1_1;
    }

    public static /* synthetic */ byte[] o00000(f f2, byte[] byArray, int n2, int n3, int n4, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = byArray.length;
        }
        return f2.o00000(byArray, n2, n3);
    }

    public byte[] o00000(byte[] byArray) {
        return this.o00000(byArray, 0, byArray.length);
    }

    public byte[] \u00d300000(int n2) {
        return this.o00000(new byte[n2]);
    }

    public static final /* synthetic */ f \u00d600000() {
        return \u00d200000;
    }
}

