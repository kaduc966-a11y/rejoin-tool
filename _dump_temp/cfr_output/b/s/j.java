/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.hc;
import b.nc;
import b.o.d.fc;
import b.s;
import b.v;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j {
    private static final int o00000(byte[] byArray, int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        n2 = s.o00000(byArray, (n2 + n3) / 2);
        while (n4 <= n5) {
            while (fc.o00000(s.o00000(byArray, n4) & 0xFF, n2 & 0xFF) < 0) {
                ++n4;
            }
            while (fc.o00000(s.o00000(byArray, n5) & 0xFF, n2 & 0xFF) > 0) {
                --n5;
            }
            if (n4 > n5) continue;
            n3 = s.o00000(byArray, n4);
            s.o00000(byArray, n4, s.o00000(byArray, n5));
            s.o00000(byArray, n5, (byte)n3);
            ++n4;
            --n5;
        }
        return n4;
    }

    private static final void new(byte[] byArray, int n2, int n3) {
        while (true) {
            int n4;
            if (n2 < (n4 = j.o00000(byArray, n2, n3)) - 1) {
                j.new(byArray, n2, n4 - 1);
            }
            if (n4 >= n3) break;
            n2 = n4;
        }
    }

    private static final int new(short[] sArray, int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        n2 = hc.o00000(sArray, (n2 + n3) / 2);
        while (n4 <= n5) {
            while (fc.o00000(hc.o00000(sArray, n4) & 0xFFFF, n2 & 0xFFFF) < 0) {
                ++n4;
            }
            while (fc.o00000(hc.o00000(sArray, n5) & 0xFFFF, n2 & 0xFFFF) > 0) {
                --n5;
            }
            if (n4 > n5) continue;
            n3 = hc.o00000(sArray, n4);
            hc.o00000(sArray, n4, hc.o00000(sArray, n5));
            hc.o00000(sArray, n5, (short)n3);
            ++n4;
            --n5;
        }
        return n4;
    }

    private static final void o00000(short[] sArray, int n2, int n3) {
        while (true) {
            int n4;
            if (n2 < (n4 = j.new(sArray, n2, n3)) - 1) {
                j.o00000(sArray, n2, n4 - 1);
            }
            if (n4 >= n3) break;
            n2 = n4;
        }
    }

    private static final int new(int[] nArray, int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        n2 = v.new(nArray, (n2 + n3) / 2);
        while (n4 <= n5) {
            while (Integer.compareUnsigned(v.new(nArray, n4), n2) < 0) {
                ++n4;
            }
            while (Integer.compareUnsigned(v.new(nArray, n5), n2) > 0) {
                --n5;
            }
            if (n4 > n5) continue;
            n3 = v.new(nArray, n4);
            v.o00000(nArray, n4, v.new(nArray, n5));
            v.o00000(nArray, n5, n3);
            ++n4;
            --n5;
        }
        return n4;
    }

    private static final void o00000(int[] nArray, int n2, int n3) {
        while (true) {
            int n4;
            if (n2 < (n4 = j.new(nArray, n2, n3)) - 1) {
                j.o00000(nArray, n2, n4 - 1);
            }
            if (n4 >= n3) break;
            n2 = n4;
        }
    }

    private static final int o00000(long[] lArray, int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        long l2 = nc.o00000(lArray, (n2 + n3) / 2);
        while (n4 <= n5) {
            while (Long.compareUnsigned(nc.o00000(lArray, n4), l2) < 0) {
                ++n4;
            }
            while (Long.compareUnsigned(nc.o00000(lArray, n5), l2) > 0) {
                --n5;
            }
            if (n4 > n5) continue;
            long l3 = nc.o00000(lArray, n4);
            nc.o00000(lArray, n4, nc.o00000(lArray, n5));
            nc.o00000(lArray, n5, l3);
            ++n4;
            --n5;
        }
        return n4;
    }

    private static final void new(long[] lArray, int n2, int n3) {
        while (true) {
            int n4;
            if (n2 < (n4 = j.o00000(lArray, n2, n3)) - 1) {
                j.new(lArray, n2, n4 - 1);
            }
            if (n4 >= n3) break;
            n2 = n4;
        }
    }

    public static final void \u00d300000(byte[] byArray, int n2, int n3) {
        j.new(byArray, n2, n3 - 1);
    }

    public static final void \u00d300000(short[] sArray, int n2, int n3) {
        j.o00000(sArray, n2, n3 - 1);
    }

    public static final void \u00d300000(int[] nArray, int n2, int n3) {
        j.o00000(nArray, n2, n3 - 1);
    }

    public static final void \u00d300000(long[] lArray, int n2, int n3) {
        j.new(lArray, n2, n3 - 1);
    }
}

