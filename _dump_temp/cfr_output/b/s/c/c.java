/*
 * Decompiled with CFR 0.152.
 */
package b.s.c;

import b.ac;
import b.dd;
import b.e.bb;
import b.e.m;
import b.e.x;
import b.f;
import b.hc;
import b.lc;
import b.nc;
import b.o.d.fc;
import b.o.e.e;
import b.o.e.g;
import b.qb;
import b.s;
import b.s.c.b;
import b.s.c.d;
import b.s.gc;
import b.s.j;
import b.s.kb;
import b.s.mc;
import b.s.y;
import b.s.z;
import b.v;
import b.yc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class c
extends d {
    private static final int \u00f6\u00d20000(int[] nArray) {
        return v.new(nArray, 0);
    }

    private static final long \u00d3o0000(long[] lArray) {
        return nc.o00000(lArray, 0);
    }

    private static final byte do(byte[] byArray) {
        return s.o00000(byArray, 0);
    }

    private static final short \u00d6\u00d20000(short[] sArray) {
        return hc.o00000(sArray, 0);
    }

    private static final int do(int[] nArray) {
        return v.new(nArray, 1);
    }

    private static final long \u00d4o0000(long[] lArray) {
        return nc.o00000(lArray, 1);
    }

    private static final byte Objectsuper(byte[] byArray) {
        return s.o00000(byArray, 1);
    }

    private static final short \u00f600000(short[] sArray) {
        return hc.o00000(sArray, 1);
    }

    private static final int Objectsuper(int[] nArray) {
        return v.new(nArray, 2);
    }

    private static final long supernew(long[] lArray) {
        return nc.o00000(lArray, 2);
    }

    private static final byte floatsuper(byte[] byArray) {
        return s.o00000(byArray, 2);
    }

    private static final short interface(short[] sArray) {
        return hc.o00000(sArray, 2);
    }

    private static final int \u00d2o0000(int[] nArray) {
        return v.new(nArray, 3);
    }

    private static final long \u00d8\u00d20000(long[] lArray) {
        return nc.o00000(lArray, 3);
    }

    private static final byte \u00d6o0000(byte[] byArray) {
        return s.o00000(byArray, 3);
    }

    private static final short Objectsuper(short[] sArray) {
        return hc.o00000(sArray, 3);
    }

    private static final int \u00d3o0000(int[] nArray) {
        return v.new(nArray, 4);
    }

    private static final long \u00d600000(long[] lArray) {
        return nc.o00000(lArray, 4);
    }

    private static final byte \u00f6o0000(byte[] byArray) {
        return s.o00000(byArray, 4);
    }

    private static final short \u00f6O0000(short[] sArray) {
        return hc.o00000(sArray, 4);
    }

    private static final int \u00d200000(int[] nArray, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < v.\u00d300000(nArray) : false;
        if (bl) {
            return v.new(nArray, n2);
        }
        return ((ac)g2.\u00f800000(n2)).o00000();
    }

    private static final long \u00d200000(long[] lArray, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < nc.\u00d500000(lArray) : false;
        if (bl) {
            return nc.o00000(lArray, n2);
        }
        return ((f)g2.\u00f800000(n2)).super();
    }

    private static final byte super(byte[] byArray, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < s.o00000(byArray) : false;
        if (bl) {
            return s.o00000(byArray, n2);
        }
        return ((lc)g2.\u00f800000(n2)).super();
    }

    private static final short \u00d200000(short[] sArray, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < hc.\u00d400000(sArray) : false;
        if (bl) {
            return hc.o00000(sArray, n2);
        }
        return ((dd)g2.\u00f800000(n2)).o00000();
    }

    private static final ac \u00d800000(int[] nArray, int n2) {
        return b.int(nArray, n2);
    }

    private static final f \u00d600000(long[] lArray, int n2) {
        return b.\u00d400000(lArray, n2);
    }

    private static final lc \u00d400000(byte[] byArray, int n2) {
        return b.\u00d800000(byArray, n2);
    }

    private static final dd \u00d400000(short[] sArray, int n2) {
        return b.\u00d800000(sArray, n2);
    }

    private static final ac \u00d4O0000(int[] nArray, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (!((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            return ac.return(n3);
        }
        return null;
    }

    private static final f \u00f4o0000(long[] lArray, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            return f.\u00d4O0000(l2);
        }
        return null;
    }

    private static final lc \u00d8o0000(byte[] byArray, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            return lc.\u00d6O0000(by);
        }
        return null;
    }

    private static final dd \u00d600000(short[] sArray, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            return dd.\u00d6O0000(s2);
        }
        return null;
    }

    private static final ac \u00d8o0000(int[] nArray, g g2) {
        int n2 = v.\u00d300000(nArray) + -1;
        if (n2 >= 0) {
            do {
                int n3 = n2--;
                if (!((Boolean)g2.\u00f800000(ac.return(n3 = v.new(nArray, n3)))).booleanValue()) continue;
                return ac.return(n3);
            } while (n2 >= 0);
        }
        return null;
    }

    private static final f \u00f6O0000(long[] lArray, g g2) {
        int n2 = nc.\u00d500000(lArray) + -1;
        if (n2 >= 0) {
            do {
                int n3;
                long l2;
                if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2 = nc.o00000(lArray, n3 = n2--)))).booleanValue()) continue;
                return f.\u00d4O0000(l2);
            } while (n2 >= 0);
        }
        return null;
    }

    private static final lc \u00f6O0000(byte[] byArray, g g2) {
        byte by = s.o00000(byArray) + -1;
        if (by >= 0) {
            do {
                byte by2 = by--;
                if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by2 = (byte)s.o00000(byArray, (int)by2)))).booleanValue()) continue;
                return lc.\u00d6O0000(by2);
            } while (by >= 0);
        }
        return null;
    }

    private static final dd \u00d6O0000(short[] sArray, g g2) {
        short s2 = hc.\u00d400000(sArray) + -1;
        if (s2 >= 0) {
            do {
                short s3 = s2--;
                if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s3 = (short)hc.o00000(sArray, (int)s3)))).booleanValue()) continue;
                return dd.\u00d6O0000(s3);
            } while (s2 >= 0);
        }
        return null;
    }

    private static final int \u00f400000(int[] nArray) {
        return ac.\u00d500000(z.\u00f8O0000(nArray));
    }

    private static final long publicsuper(long[] lArray) {
        return f.super(z.o\u00d30000(lArray));
    }

    private static final byte \u00d4O0000(byte[] byArray) {
        return lc.super(z.\u00d5o0000(byArray));
    }

    private static final short \u00d400000(short[] sArray) {
        return dd.\u00d2O0000(z.\u00f800000(sArray));
    }

    private static final int voidsuper(int[] nArray, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (!((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            return n3;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final long \u00f6o0000(long[] lArray, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            return l2;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final byte \u00d6\u00d20000(byte[] byArray, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            return by;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final short O\u00d20000(short[] sArray, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            return s2;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static final ac \u00f8O0000(int[] nArray) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        return ac.return(v.new(nArray, 0));
    }

    public static final f classnew(long[] lArray) {
        if (nc.o00000(lArray)) {
            return null;
        }
        return f.\u00d4O0000(nc.o00000(lArray, 0));
    }

    public static final lc \u00d2\u00d20000(byte[] byArray) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        return lc.\u00d6O0000(s.o00000(byArray, 0));
    }

    public static final dd int(short[] sArray) {
        if (hc.o00000(sArray)) {
            return null;
        }
        return dd.\u00d6O0000(hc.o00000(sArray, 0));
    }

    private static final ac class(int[] nArray, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (!((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            return ac.return(n3);
        }
        return null;
    }

    private static final f \u00d3\u00d30000(long[] lArray, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            return f.\u00d4O0000(l2);
        }
        return null;
    }

    private static final lc \u00f4\u00d20000(byte[] byArray, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            return lc.\u00d6O0000(by);
        }
        return null;
    }

    private static final dd \u00d2\u00d30000(short[] sArray, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            return dd.\u00d6O0000(s2);
        }
        return null;
    }

    private static final int \u00d300000(int[] nArray, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < v.\u00d300000(nArray) : false;
        if (bl) {
            return v.new(nArray, n2);
        }
        return ((ac)g2.\u00f800000(n2)).o00000();
    }

    private static final long \u00d300000(long[] lArray, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < nc.\u00d500000(lArray) : false;
        if (bl) {
            return nc.o00000(lArray, n2);
        }
        return ((f)g2.\u00f800000(n2)).super();
    }

    private static final byte \u00d200000(byte[] byArray, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < s.o00000(byArray) : false;
        if (bl) {
            return s.o00000(byArray, n2);
        }
        return ((lc)g2.\u00f800000(n2)).super();
    }

    private static final short \u00d300000(short[] sArray, int n2, g g2) {
        boolean bl = n2 >= 0 ? n2 < hc.\u00d400000(sArray) : false;
        if (bl) {
            return hc.o00000(sArray, n2);
        }
        return ((dd)g2.\u00f800000(n2)).o00000();
    }

    public static final ac int(int[] nArray, int n2) {
        boolean bl = n2 >= 0 ? n2 < v.\u00d300000(nArray) : false;
        if (bl) {
            return ac.return(v.new(nArray, n2));
        }
        return null;
    }

    public static final f \u00d400000(long[] lArray, int n2) {
        boolean bl = n2 >= 0 ? n2 < nc.\u00d500000(lArray) : false;
        if (bl) {
            return f.\u00d4O0000(nc.o00000(lArray, n2));
        }
        return null;
    }

    public static final lc \u00d800000(byte[] byArray, int n2) {
        boolean bl = n2 >= 0 ? n2 < s.o00000(byArray) : false;
        if (bl) {
            return lc.\u00d6O0000(s.o00000(byArray, n2));
        }
        return null;
    }

    public static final dd \u00d800000(short[] sArray, int n2) {
        boolean bl = n2 >= 0 ? n2 < hc.\u00d400000(sArray) : false;
        if (bl) {
            return dd.\u00d6O0000(hc.o00000(sArray, n2));
        }
        return null;
    }

    private static final int class(int[] nArray, int n2) {
        return z.String(nArray, n2);
    }

    private static final int super(long[] lArray, long l2) {
        return z.\u00d200000(lArray, l2);
    }

    private static final int \u00d200000(byte[] byArray, byte by) {
        return z.\u00d300000(byArray, by);
    }

    private static final int \u00d300000(short[] sArray, short s2) {
        return z.String(sArray, s2);
    }

    private static final int supernew(int[] nArray, g g2) {
        int n2 = nArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = nArray[i2];
            if (!((Boolean)g2.\u00f800000(ac.return(ac.\u00d500000(n3)))).booleanValue()) continue;
            return i2;
        }
        return -1;
    }

    private static final int \u00f400000(long[] lArray, g g2) {
        int n2 = lArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = lArray[i2];
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(f.super(l2)))).booleanValue()) continue;
            return i2;
        }
        return -1;
    }

    private static final int do(byte[] byArray, g g2) {
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = byArray[i2];
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(lc.super(by)))).booleanValue()) continue;
            return i2;
        }
        return -1;
    }

    private static final int \u00f600000(short[] sArray, g g2) {
        int n2 = sArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = sArray[i2];
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(dd.\u00d2O0000(s2)))).booleanValue()) continue;
            return i2;
        }
        return -1;
    }

    private static final int \u00d3\u00d30000(int[] nArray, g g2) {
        int n2 = nArray.length + -1;
        if (n2 >= 0) {
            do {
                int n3;
                int n4;
                if (!((Boolean)g2.\u00f800000(ac.return(ac.\u00d500000(n4 = nArray[n3 = n2--])))).booleanValue()) continue;
                return n3;
            } while (n2 >= 0);
        }
        return -1;
    }

    private static final int OO0000(long[] lArray, g g2) {
        int n2 = lArray.length + -1;
        if (n2 >= 0) {
            do {
                int n3;
                long l2;
                if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(f.super(l2 = lArray[n3 = n2--])))).booleanValue()) continue;
                return n3;
            } while (n2 >= 0);
        }
        return -1;
    }

    private static final int \u00d6o0000(byte[] byArray, g g2) {
        int n2 = byArray.length + -1;
        if (n2 >= 0) {
            do {
                int n3;
                byte by;
                if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(lc.super(by = byArray[n3 = n2--])))).booleanValue()) continue;
                return n3;
            } while (n2 >= 0);
        }
        return -1;
    }

    private static final int interface(short[] sArray, g g2) {
        int n2 = sArray.length + -1;
        if (n2 >= 0) {
            do {
                int n3;
                short s2;
                if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(dd.\u00d2O0000(s2 = sArray[n3 = n2--])))).booleanValue()) continue;
                return n3;
            } while (n2 >= 0);
        }
        return -1;
    }

    private static final int class(int[] nArray) {
        return ac.\u00d500000(z.\u00d6\u00d20000(nArray));
    }

    private static final long \u00f6O0000(long[] lArray) {
        return f.super(z.\u00f5O0000(lArray));
    }

    private static final byte \u00f600000(byte[] byArray) {
        return lc.super(z.fornew(byArray));
    }

    private static final short \u00d8\u00d20000(short[] sArray) {
        return dd.\u00d2O0000(z.\u00f8o0000(sArray));
    }

    private static final int \u00f4o0000(int[] nArray, g g2) {
        int n2 = v.\u00d300000(nArray) + -1;
        if (n2 >= 0) {
            do {
                int n3 = n2--;
                if (!((Boolean)g2.\u00f800000(ac.return(n3 = v.new(nArray, n3)))).booleanValue()) continue;
                return n3;
            } while (n2 >= 0);
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final long \u00d4\u00d30000(long[] lArray, g g2) {
        int n2 = nc.\u00d500000(lArray) + -1;
        if (n2 >= 0) {
            do {
                int n3;
                long l2;
                if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2 = nc.o00000(lArray, n3 = n2--)))).booleanValue()) continue;
                return l2;
            } while (n2 >= 0);
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final byte \u00f600000(byte[] byArray, g g2) {
        byte by = s.o00000(byArray) + -1;
        if (by >= 0) {
            do {
                byte by2 = by--;
                if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by2 = (byte)s.o00000(byArray, (int)by2)))).booleanValue()) continue;
                return by2;
            } while (by >= 0);
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final short intnew(short[] sArray, g g2) {
        short s2 = hc.\u00d400000(sArray) + -1;
        if (s2 >= 0) {
            do {
                short s3 = s2--;
                if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s3 = (short)hc.o00000(sArray, (int)s3)))).booleanValue()) continue;
                return s3;
            } while (s2 >= 0);
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final int \u00d200000(int[] nArray, int n2) {
        return z.for(nArray, n2);
    }

    private static final int \u00d300000(long[] lArray, long l2) {
        return z.String(lArray, l2);
    }

    private static final int super(byte[] byArray, byte by) {
        return z.\u00d200000(byArray, by);
    }

    private static final int super(short[] sArray, short s2) {
        return z.\u00d300000(sArray, s2);
    }

    public static final ac \u00f8o0000(int[] nArray) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        return ac.return(v.new(nArray, v.\u00d300000(nArray) - 1));
    }

    public static final f \u00d6O0000(long[] lArray) {
        if (nc.o00000(lArray)) {
            return null;
        }
        return f.\u00d4O0000(nc.o00000(lArray, nc.\u00d500000(lArray) - 1));
    }

    public static final lc int(byte[] byArray) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        return lc.\u00d6O0000(s.o00000(byArray, s.o00000(byArray) - 1));
    }

    public static final dd \u00d4o0000(short[] sArray) {
        if (hc.o00000(sArray)) {
            return null;
        }
        return dd.\u00d6O0000(hc.o00000(sArray, hc.\u00d400000(sArray) - 1));
    }

    private static final ac \u00f6o0000(int[] nArray, g g2) {
        int n2 = v.\u00d300000(nArray) + -1;
        if (n2 >= 0) {
            do {
                int n3 = n2--;
                if (!((Boolean)g2.\u00f800000(ac.return(n3 = v.new(nArray, n3)))).booleanValue()) continue;
                return ac.return(n3);
            } while (n2 >= 0);
        }
        return null;
    }

    private static final f Objectsuper(long[] lArray, g g2) {
        int n2 = nc.\u00d500000(lArray) + -1;
        if (n2 >= 0) {
            do {
                int n3;
                long l2;
                if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2 = nc.o00000(lArray, n3 = n2--)))).booleanValue()) continue;
                return f.\u00d4O0000(l2);
            } while (n2 >= 0);
        }
        return null;
    }

    private static final lc \u00d8O0000(byte[] byArray, g g2) {
        byte by = s.o00000(byArray) + -1;
        if (by >= 0) {
            do {
                byte by2 = by--;
                if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by2 = (byte)s.o00000(byArray, (int)by2)))).booleanValue()) continue;
                return lc.\u00d6O0000(by2);
            } while (by >= 0);
        }
        return null;
    }

    private static final dd \u00d2\u00d20000(short[] sArray, g g2) {
        short s2 = hc.\u00d400000(sArray) + -1;
        if (s2 >= 0) {
            do {
                short s3 = s2--;
                if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s3 = (short)hc.o00000(sArray, (int)s3)))).booleanValue()) continue;
                return dd.\u00d6O0000(s3);
            } while (s2 >= 0);
        }
        return null;
    }

    private static final int \u00d6o0000(int[] nArray) {
        return b.super(nArray, (b.b.f)b.b.f.super);
    }

    private static final long \u00f400000(long[] lArray) {
        return b.\u00d300000(lArray, (b.b.f)b.b.f.super);
    }

    private static final byte \u00f6\u00d20000(byte[] byArray) {
        return b.super(byArray, (b.b.f)b.b.f.super);
    }

    private static final short \u00d6o0000(short[] sArray) {
        return b.super(sArray, (b.b.f)b.b.f.super);
    }

    public static final int super(int[] nArray, b.b.f f2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return v.new(nArray, f2.o00000(v.\u00d300000(nArray)));
    }

    public static final long \u00d300000(long[] lArray, b.b.f f2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return nc.o00000(lArray, f2.o00000(nc.\u00d500000(lArray)));
    }

    public static final byte super(byte[] byArray, b.b.f f2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return s.o00000(byArray, f2.o00000(s.o00000(byArray)));
    }

    public static final short super(short[] sArray, b.b.f f2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException("Array is empty.");
        }
        return hc.o00000(sArray, f2.o00000(hc.\u00d400000(sArray)));
    }

    private static final ac \u00d6\u00d20000(int[] nArray) {
        return b.\u00d200000(nArray, (b.b.f)b.b.f.super);
    }

    private static final f \u00f800000(long[] lArray) {
        return b.super(lArray, (b.b.f)b.b.f.super);
    }

    private static final lc \u00d8\u00d20000(byte[] byArray) {
        return b.\u00d300000(byArray, (b.b.f)b.b.f.super);
    }

    private static final dd \u00d4O0000(short[] sArray) {
        return b.\u00d300000(sArray, (b.b.f)b.b.f.super);
    }

    public static final ac \u00d200000(int[] nArray, b.b.f f2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        return ac.return(v.new(nArray, f2.o00000(v.\u00d300000(nArray))));
    }

    public static final f super(long[] lArray, b.b.f f2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        return f.\u00d4O0000(nc.o00000(lArray, f2.o00000(nc.\u00d500000(lArray))));
    }

    public static final lc \u00d300000(byte[] byArray, b.b.f f2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        return lc.\u00d6O0000(s.o00000(byArray, f2.o00000(s.o00000(byArray))));
    }

    public static final dd \u00d300000(short[] sArray, b.b.f f2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        return dd.\u00d6O0000(hc.o00000(sArray, f2.o00000(hc.\u00d400000(sArray))));
    }

    private static final int \u00d4o0000(int[] nArray) {
        return ac.\u00d500000(z.ifsuper(nArray));
    }

    private static final long intnew(long[] lArray) {
        return f.super(z.\u00d3\u00d30000(lArray));
    }

    private static final byte supernew(byte[] byArray) {
        return lc.super(z.\u00d8o0000(byArray));
    }

    private static final short voidsuper(short[] sArray) {
        return dd.\u00d2O0000(z.private(sArray));
    }

    private static final int \u00f6O0000(int[] nArray, g g2) {
        ac ac2 = null;
        boolean bl = false;
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (!((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            if (bl) {
                throw new IllegalArgumentException("Array contains more than one matching element.");
            }
            ac2 = ac.return(n3);
            bl = true;
        }
        if (!bl) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return ac2.o00000();
    }

    private static final long \u00d6o0000(long[] lArray, g g2) {
        f f2 = null;
        boolean bl = false;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            if (bl) {
                throw new IllegalArgumentException("Array contains more than one matching element.");
            }
            f2 = f.\u00d4O0000(l2);
            bl = true;
        }
        if (!bl) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return f2.super();
    }

    private static final byte \u00f6\u00d20000(byte[] byArray, g g2) {
        lc lc2 = null;
        boolean bl = false;
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            if (bl) {
                throw new IllegalArgumentException("Array contains more than one matching element.");
            }
            lc2 = lc.\u00d6O0000(by);
            bl = true;
        }
        if (!bl) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return lc2.super();
    }

    private static final short \u00d8o0000(short[] sArray, g g2) {
        dd dd2 = null;
        boolean bl = false;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            if (bl) {
                throw new IllegalArgumentException("Array contains more than one matching element.");
            }
            dd2 = dd.\u00d6O0000(s2);
            bl = true;
        }
        if (!bl) {
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return dd2.o00000();
    }

    public static final ac \u00f4o0000(int[] nArray) {
        if (v.\u00d300000(nArray) == 1) {
            return ac.return(v.new(nArray, 0));
        }
        return null;
    }

    public static final f \u00d2\u00d20000(long[] lArray) {
        if (nc.\u00d500000(lArray) == 1) {
            return f.\u00d4O0000(nc.o00000(lArray, 0));
        }
        return null;
    }

    public static final lc \u00d2o0000(byte[] byArray) {
        if (s.o00000(byArray) == 1) {
            return lc.\u00d6O0000(s.o00000(byArray, 0));
        }
        return null;
    }

    public static final dd \u00f6\u00d20000(short[] sArray) {
        if (hc.\u00d400000(sArray) == 1) {
            return dd.\u00d6O0000(hc.o00000(sArray, 0));
        }
        return null;
    }

    private static final ac O\u00d20000(int[] nArray, g g2) {
        ac ac2 = null;
        boolean bl = false;
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (!((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            if (bl) {
                return null;
            }
            ac2 = ac.return(n3);
            bl = true;
        }
        if (!bl) {
            return null;
        }
        return ac2;
    }

    private static final f \u00d6O0000(long[] lArray, g g2) {
        f f2 = null;
        boolean bl = false;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            if (bl) {
                return null;
            }
            f2 = f.\u00d4O0000(l2);
            bl = true;
        }
        if (!bl) {
            return null;
        }
        return f2;
    }

    private static final lc interface(byte[] byArray, g g2) {
        lc lc2 = null;
        boolean bl = false;
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            if (bl) {
                return null;
            }
            lc2 = lc.\u00d6O0000(by);
            bl = true;
        }
        if (!bl) {
            return null;
        }
        return lc2;
    }

    private static final dd \u00f6o0000(short[] sArray, g g2) {
        dd dd2 = null;
        boolean bl = false;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            if (bl) {
                return null;
            }
            dd2 = dd.\u00d6O0000(s2);
            bl = true;
        }
        if (!bl) {
            return null;
        }
        return dd2;
    }

    public static final List \u00f800000(int[] object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        return b.\u00d300000((int[])object, bb.\u00d200000(v.\u00d300000((int[])object) - n2, 0));
    }

    public static final List \u00d300000(long[] object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        return b.\u00d200000((long[])object, bb.\u00d200000(nc.\u00d500000((long[])object) - n2, 0));
    }

    public static final List \u00d300000(byte[] object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        return b.\u00d200000((byte[])object, bb.\u00d200000(s.o00000((byte[])object) - n2, 0));
    }

    public static final List class(short[] object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        return b.\u00d300000((short[])object, bb.\u00d200000(hc.\u00d400000((short[])object) - n2, 0));
    }

    public static final List \u00f600000(int[] object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        return b.\u00d600000((int[])object, bb.\u00d200000(v.\u00d300000((int[])object) - n2, 0));
    }

    public static final List \u00f400000(long[] object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        return b.class((long[])object, bb.\u00d200000(nc.\u00d500000((long[])object) - n2, 0));
    }

    public static final List \u00f400000(byte[] object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        return b.class((byte[])object, bb.\u00d200000(s.o00000((byte[])object) - n2, 0));
    }

    public static final List \u00f400000(short[] object, int n2) {
        if (!(n2 >= 0)) {
            object = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(object.toString());
        }
        return b.\u00d600000((short[])object, bb.\u00d200000(hc.\u00d400000((short[])object) - n2, 0));
    }

    private static final List \u00d6O0000(int[] nArray, g g2) {
        for (int i2 = z.\u00d3O0000(nArray); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(ac.return(v.new(nArray, i2)))).booleanValue()) continue;
            return b.\u00d600000(nArray, i2 + 1);
        }
        return mc.\u00d500000();
    }

    private static final List \u00d2\u00d20000(long[] lArray, g g2) {
        for (int i2 = z.nullnew(lArray); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, i2)))).booleanValue()) continue;
            return b.class(lArray, i2 + 1);
        }
        return mc.\u00d500000();
    }

    private static final List class(byte[] byArray, g g2) {
        for (int i2 = z.\u00f6O0000(byArray); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, i2)))).booleanValue()) continue;
            return b.class(byArray, i2 + 1);
        }
        return mc.\u00d500000();
    }

    private static final List donew(short[] sArray, g g2) {
        for (int i2 = z.\u00d3\u00d30000(sArray); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, i2)))).booleanValue()) continue;
            return b.\u00d600000(sArray, i2 + 1);
        }
        return mc.\u00d500000();
    }

    private static final List classnew(int[] nArray, g g2) {
        boolean bl = false;
        ArrayList<ac> arrayList = new ArrayList<ac>();
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (bl) {
                arrayList.add(ac.return(n3));
                continue;
            }
            if (((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            arrayList.add(ac.return(n3));
            bl = true;
        }
        return arrayList;
    }

    private static final List \u00d8O0000(long[] lArray, g g2) {
        boolean bl = false;
        ArrayList<f> arrayList = new ArrayList<f>();
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (bl) {
                arrayList.add(f.\u00d4O0000(l2));
                continue;
            }
            if (((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            arrayList.add(f.\u00d4O0000(l2));
            bl = true;
        }
        return arrayList;
    }

    private static final List \u00f4o0000(byte[] byArray, g g2) {
        boolean bl = false;
        ArrayList<lc> arrayList = new ArrayList<lc>();
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (bl) {
                arrayList.add(lc.\u00d6O0000(by));
                continue;
            }
            if (((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            arrayList.add(lc.\u00d6O0000(by));
            bl = true;
        }
        return arrayList;
    }

    private static final List \u00f4O0000(short[] sArray, g g2) {
        boolean bl = false;
        ArrayList<dd> arrayList = new ArrayList<dd>();
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (bl) {
                arrayList.add(dd.\u00d6O0000(s2));
                continue;
            }
            if (((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            arrayList.add(dd.\u00d6O0000(s2));
            bl = true;
        }
        return arrayList;
    }

    private static final List donew(int[] nArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (!((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            collection.add(ac.return(n3));
        }
        return (List)collection;
    }

    private static final List Oo0000(long[] lArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            collection.add(f.\u00d4O0000(l2));
        }
        return (List)collection;
    }

    private static final List O\u00d20000(byte[] byArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            collection.add(lc.\u00d6O0000(by));
        }
        return (List)collection;
    }

    private static final List voidsuper(short[] sArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            collection.add(dd.\u00d6O0000(s2));
        }
        return (List)collection;
    }

    private static final List \u00d600000(int[] nArray, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            int n5 = v.new(nArray, i2);
            if (!((Boolean)f2.o00000(n4 = n2++, ac.return(n5))).booleanValue()) continue;
            collection.add(ac.return(n5));
        }
        return (List)collection;
    }

    private static final List \u00f600000(long[] lArray, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            int n4 = n2++;
            long l3 = l2;
            int n5 = n4;
            if (!((Boolean)f2.o00000(n5, f.\u00d4O0000(l3))).booleanValue()) continue;
            collection.add(f.\u00d4O0000(l3));
        }
        return (List)collection;
    }

    private static final List \u00d800000(byte[] byArray, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)f2.o00000(n4 = n2++, lc.\u00d6O0000(by))).booleanValue()) continue;
            collection.add(lc.\u00d6O0000(by));
        }
        return (List)collection;
    }

    private static final List \u00f400000(short[] sArray, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)f2.o00000(n4 = n2++, dd.\u00d6O0000(s2))).booleanValue()) continue;
            collection.add(dd.\u00d6O0000(s2));
        }
        return (List)collection;
    }

    private static final Collection \u00d300000(int[] nArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            int n5 = v.new(nArray, i2);
            if (!((Boolean)f2.o00000(n4 = n2++, ac.return(n5))).booleanValue()) continue;
            collection.add(ac.return(n5));
        }
        return collection;
    }

    private static final Collection \u00d300000(long[] lArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            int n4 = n2++;
            long l3 = l2;
            int n5 = n4;
            if (!((Boolean)f2.o00000(n5, f.\u00d4O0000(l3))).booleanValue()) continue;
            collection.add(f.\u00d4O0000(l3));
        }
        return collection;
    }

    private static final Collection super(byte[] byArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)f2.o00000(n4 = n2++, lc.\u00d6O0000(by))).booleanValue()) continue;
            collection.add(lc.\u00d6O0000(by));
        }
        return collection;
    }

    private static final Collection \u00d300000(short[] sArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)f2.o00000(n4 = n2++, dd.\u00d6O0000(s2))).booleanValue()) continue;
            collection.add(dd.\u00d6O0000(s2));
        }
        return collection;
    }

    private static final List interface(int[] nArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            collection.add(ac.return(n3));
        }
        return (List)collection;
    }

    private static final List intnew(long[] lArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            collection.add(f.\u00d4O0000(l2));
        }
        return (List)collection;
    }

    private static final List \u00f800000(byte[] byArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            collection.add(lc.\u00d6O0000(by));
        }
        return (List)collection;
    }

    private static final List int(short[] sArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            collection.add(dd.\u00d6O0000(s2));
        }
        return (List)collection;
    }

    private static final Collection \u00d200000(int[] nArray, Collection collection, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            collection.add(ac.return(n3));
        }
        return collection;
    }

    private static final Collection \u00d200000(long[] lArray, Collection collection, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            collection.add(f.\u00d4O0000(l2));
        }
        return collection;
    }

    private static final Collection super(byte[] byArray, Collection collection, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            collection.add(lc.\u00d6O0000(by));
        }
        return collection;
    }

    private static final Collection super(short[] sArray, Collection collection, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            collection.add(dd.\u00d6O0000(s2));
        }
        return collection;
    }

    private static final Collection \u00d300000(int[] nArray, Collection collection, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (!((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            collection.add(ac.return(n3));
        }
        return collection;
    }

    private static final Collection \u00d300000(long[] lArray, Collection collection, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            collection.add(f.\u00d4O0000(l2));
        }
        return collection;
    }

    private static final Collection \u00d200000(byte[] byArray, Collection collection, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            collection.add(lc.\u00d6O0000(by));
        }
        return collection;
    }

    private static final Collection \u00d200000(short[] sArray, Collection collection, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            collection.add(dd.\u00d6O0000(s2));
        }
        return collection;
    }

    public static final List super(int[] nArray, m m2) {
        if (((x)m2).if()) {
            return mc.\u00d500000();
        }
        int n2 = m2.\u00d5o0000();
        int n3 = m2.\u00d3o0000() + 1;
        return b.super(v.return(z.o00000(nArray, n2, n3)));
    }

    public static final List \u00d200000(long[] lArray, m m2) {
        if (((x)m2).if()) {
            return mc.\u00d500000();
        }
        int n2 = m2.\u00d5o0000();
        int n3 = m2.\u00d3o0000() + 1;
        return b.\u00d200000(nc.return(z.o00000(lArray, n2, n3)));
    }

    public static final List super(byte[] byArray, m m2) {
        if (((x)m2).if()) {
            return mc.\u00d500000();
        }
        int n2 = m2.\u00d5o0000();
        int n3 = m2.\u00d3o0000() + 1;
        return b.\u00d200000(s.return(z.\u00d300000(byArray, n2, n3)));
    }

    public static final List \u00d200000(short[] sArray, m m2) {
        if (((x)m2).if()) {
            return mc.\u00d500000();
        }
        int n2 = m2.\u00d5o0000();
        int n3 = m2.\u00d3o0000() + 1;
        return b.super(hc.return(z.\u00d200000(sArray, n2, n3)));
    }

    public static final List super(int[] nArray, Iterable object) {
        int n2 = mc.o00000((Iterable)object, 10);
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        ArrayList<ac> arrayList = new ArrayList<ac>(n2);
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            arrayList.add(ac.return(v.new(nArray, n3)));
        }
        return arrayList;
    }

    public static final List super(long[] lArray, Iterable object) {
        int n2 = mc.o00000((Iterable)object, 10);
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        ArrayList<f> arrayList = new ArrayList<f>(n2);
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            arrayList.add(f.\u00d4O0000(nc.o00000(lArray, n3)));
        }
        return arrayList;
    }

    public static final List super(byte[] byArray, Iterable object) {
        int n2 = mc.o00000((Iterable)object, 10);
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        ArrayList<lc> arrayList = new ArrayList<lc>(n2);
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            arrayList.add(lc.\u00d6O0000(s.o00000(byArray, n3)));
        }
        return arrayList;
    }

    public static final List \u00d200000(short[] sArray, Iterable object) {
        int n2 = mc.o00000((Iterable)object, 10);
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        ArrayList<dd> arrayList = new ArrayList<dd>(n2);
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            arrayList.add(dd.\u00d6O0000(hc.o00000(sArray, n3)));
        }
        return arrayList;
    }

    public static final int[] \u00d200000(int[] nArray, Collection collection) {
        return v.return(z.\u00d200000(nArray, collection));
    }

    public static final long[] \u00d200000(long[] lArray, Collection collection) {
        return nc.return(z.\u00d300000(lArray, collection));
    }

    public static final byte[] super(byte[] byArray, Collection collection) {
        return s.return(z.\u00d300000(byArray, collection));
    }

    public static final short[] super(short[] sArray, Collection collection) {
        return hc.return(z.\u00d300000(sArray, collection));
    }

    public static final int[] \u00d200000(int[] nArray, m m2) {
        return v.return(z.o00000(nArray, m2));
    }

    public static final long[] super(long[] lArray, m m2) {
        return nc.return(z.\u00d200000(lArray, m2));
    }

    public static final byte[] \u00d200000(byte[] byArray, m m2) {
        return s.return(z.\u00d200000(byArray, m2));
    }

    public static final short[] super(short[] sArray, m m2) {
        return hc.return(z.o00000(sArray, m2));
    }

    public static final List \u00d600000(int[] nArray, int n2) {
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        if (n2 >= v.\u00d300000(nArray)) {
            return mc.\u00f5O0000(v.new(nArray));
        }
        if (n2 == 1) {
            return mc.o00000(ac.return(v.new(nArray, 0)));
        }
        int n3 = 0;
        ArrayList<ac> arrayList = new ArrayList<ac>(n2);
        int n4 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = v.new(nArray, i2);
            arrayList.add(ac.return(n5));
            if (++n3 == n2) break;
        }
        return arrayList;
    }

    public static final List class(long[] lArray, int n2) {
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        if (n2 >= nc.\u00d500000(lArray)) {
            return mc.\u00f5O0000(nc.\u00d400000(lArray));
        }
        if (n2 == 1) {
            return mc.o00000(f.\u00d4O0000(nc.o00000(lArray, 0)));
        }
        int n3 = 0;
        ArrayList<f> arrayList = new ArrayList<f>(n2);
        int n4 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n4; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            arrayList.add(f.\u00d4O0000(l2));
            if (++n3 == n2) break;
        }
        return arrayList;
    }

    public static final List class(byte[] byArray, int n2) {
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        if (n2 >= s.o00000(byArray)) {
            return mc.\u00f5O0000(s.\u00d400000(byArray));
        }
        if (n2 == 1) {
            return mc.o00000(lc.\u00d6O0000(s.o00000(byArray, 0)));
        }
        int n3 = 0;
        ArrayList<lc> arrayList = new ArrayList<lc>(n2);
        int n4 = s.o00000(byArray);
        for (int i2 = 0; i2 < n4; ++i2) {
            byte by = s.o00000(byArray, i2);
            arrayList.add(lc.\u00d6O0000(by));
            if (++n3 == n2) break;
        }
        return arrayList;
    }

    public static final List \u00d600000(short[] sArray, int n2) {
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        if (n2 >= hc.\u00d400000(sArray)) {
            return mc.\u00f5O0000(hc.\u00d500000(sArray));
        }
        if (n2 == 1) {
            return mc.o00000(dd.\u00d6O0000(hc.o00000(sArray, 0)));
        }
        int n3 = 0;
        ArrayList<dd> arrayList = new ArrayList<dd>(n2);
        int n4 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n4; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            arrayList.add(dd.\u00d6O0000(s2));
            if (++n3 == n2) break;
        }
        return arrayList;
    }

    public static final List \u00d300000(int[] nArray, int n2) {
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        int n3 = v.\u00d300000(nArray);
        if (n2 >= n3) {
            return mc.\u00f5O0000(v.new(nArray));
        }
        if (n2 == 1) {
            return mc.o00000(ac.return(v.new(nArray, n3 - 1)));
        }
        ArrayList<ac> arrayList = new ArrayList<ac>(n2);
        for (n2 = n3 - n2; n2 < n3; ++n2) {
            arrayList.add(ac.return(v.new(nArray, n2)));
        }
        return arrayList;
    }

    public static final List \u00d200000(long[] lArray, int n2) {
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        int n3 = nc.\u00d500000(lArray);
        if (n2 >= n3) {
            return mc.\u00f5O0000(nc.\u00d400000(lArray));
        }
        if (n2 == 1) {
            return mc.o00000(f.\u00d4O0000(nc.o00000(lArray, n3 - 1)));
        }
        ArrayList<f> arrayList = new ArrayList<f>(n2);
        for (n2 = n3 - n2; n2 < n3; ++n2) {
            arrayList.add(f.\u00d4O0000(nc.o00000(lArray, n2)));
        }
        return arrayList;
    }

    public static final List \u00d200000(byte[] byArray, int n2) {
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        int n3 = s.o00000(byArray);
        if (n2 >= n3) {
            return mc.\u00f5O0000(s.\u00d400000(byArray));
        }
        if (n2 == 1) {
            return mc.o00000(lc.\u00d6O0000(s.o00000(byArray, n3 - 1)));
        }
        ArrayList<lc> arrayList = new ArrayList<lc>(n2);
        for (n2 = n3 - n2; n2 < n3; ++n2) {
            arrayList.add(lc.\u00d6O0000(s.o00000(byArray, n2)));
        }
        return arrayList;
    }

    public static final List \u00d300000(short[] sArray, int n2) {
        if (!(n2 >= 0)) {
            String string = "Requested element count " + n2 + " is less than zero.";
            throw new IllegalArgumentException(string.toString());
        }
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        int n3 = hc.\u00d400000(sArray);
        if (n2 >= n3) {
            return mc.\u00f5O0000(hc.\u00d500000(sArray));
        }
        if (n2 == 1) {
            return mc.o00000(dd.\u00d6O0000(hc.o00000(sArray, n3 - 1)));
        }
        ArrayList<dd> arrayList = new ArrayList<dd>(n2);
        for (n2 = n3 - n2; n2 < n3; ++n2) {
            arrayList.add(dd.\u00d6O0000(hc.o00000(sArray, n2)));
        }
        return arrayList;
    }

    private static final List int(int[] nArray, g g2) {
        for (int i2 = z.\u00d3O0000(nArray); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(ac.return(v.new(nArray, i2)))).booleanValue()) continue;
            return b.\u00f800000(nArray, i2 + 1);
        }
        return mc.\u00f5O0000(v.new(nArray));
    }

    private static final List \u00f8o0000(long[] lArray, g g2) {
        for (int i2 = z.nullnew(lArray); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, i2)))).booleanValue()) continue;
            return b.\u00d300000(lArray, i2 + 1);
        }
        return mc.\u00f5O0000(nc.\u00d400000(lArray));
    }

    private static final List O\u00d30000(byte[] byArray, g g2) {
        for (int i2 = z.\u00f6O0000(byArray); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, i2)))).booleanValue()) continue;
            return b.\u00d300000(byArray, i2 + 1);
        }
        return mc.\u00f5O0000(s.\u00d400000(byArray));
    }

    private static final List \u00d6\u00d20000(short[] sArray, g g2) {
        for (int i2 = z.\u00d3\u00d30000(sArray); i2 >= 0; --i2) {
            if (((Boolean)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, i2)))).booleanValue()) continue;
            return b.class(sArray, i2 + 1);
        }
        return mc.\u00f5O0000(hc.\u00d500000(sArray));
    }

    private static final List \u00f4O0000(int[] nArray, g g2) {
        int n2;
        ArrayList<ac> arrayList = new ArrayList<ac>();
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3 && ((Boolean)g2.\u00f800000(ac.return(n2 = v.new(nArray, i2)))).booleanValue(); ++i2) {
            arrayList.add(ac.return(n2));
        }
        return arrayList;
    }

    private static final List \u00d4\u00d20000(long[] lArray, g g2) {
        long l2;
        ArrayList<f> arrayList = new ArrayList<f>();
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2 && ((Boolean)g2.\u00f800000(f.\u00d4O0000(l2 = nc.o00000(lArray, i2)))).booleanValue(); ++i2) {
            arrayList.add(f.\u00d4O0000(l2));
        }
        return arrayList;
    }

    private static final List \u00f400000(byte[] byArray, g g2) {
        byte by;
        ArrayList<lc> arrayList = new ArrayList<lc>();
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2 && ((Boolean)g2.\u00f800000(lc.\u00d6O0000(by = s.o00000(byArray, i2)))).booleanValue(); ++i2) {
            arrayList.add(lc.\u00d6O0000(by));
        }
        return arrayList;
    }

    private static final List \u00d3\u00d30000(short[] sArray, g g2) {
        short s2;
        ArrayList<dd> arrayList = new ArrayList<dd>();
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2 && ((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2 = hc.o00000(sArray, i2)))).booleanValue(); ++i2) {
            arrayList.add(dd.\u00d6O0000(s2));
        }
        return arrayList;
    }

    private static final void intnew(int[] nArray) {
        z.o\u00d30000(nArray);
    }

    private static final void \u00f4O0000(long[] lArray) {
        z.\u00f5o0000(lArray);
    }

    private static final void \u00f400000(byte[] byArray) {
        z.for(byArray);
    }

    private static final void \u00d3\u00d20000(short[] sArray) {
        z.\u00d8\u00d20000(sArray);
    }

    private static final void \u00d400000(int[] nArray, int n2, int n3) {
        z.String(nArray, n2, n3);
    }

    private static final void \u00d400000(long[] lArray, int n2, int n3) {
        z.\u00d500000(lArray, n2, n3);
    }

    private static final void \u00d400000(byte[] byArray, int n2, int n3) {
        z.String(byArray, n2, n3);
    }

    private static final void \u00d300000(short[] sArray, int n2, int n3) {
        z.String(sArray, n2, n3);
    }

    public static final List O\u00d20000(int[] object) {
        if (v.\u00d500000(object)) {
            return mc.\u00d500000();
        }
        List list = mc.OO0000(v.new(object));
        object = list;
        mc.oO0000(list);
        return object;
    }

    public static final List \u00d8O0000(long[] object) {
        if (nc.o00000(object)) {
            return mc.\u00d500000();
        }
        List list = mc.OO0000(nc.\u00d400000(object));
        object = list;
        mc.oO0000(list);
        return object;
    }

    public static final List \u00f800000(byte[] object) {
        if (s.\u00d500000(object)) {
            return mc.\u00d500000();
        }
        List list = mc.OO0000(s.\u00d400000(object));
        object = list;
        mc.oO0000(list);
        return object;
    }

    public static final List \u00d2O0000(short[] object) {
        if (hc.o00000(object)) {
            return mc.\u00d500000();
        }
        List list = mc.OO0000(hc.\u00d500000(object));
        object = list;
        mc.oO0000(list);
        return object;
    }

    private static final int[] \u00d8\u00d20000(int[] nArray) {
        return v.return(z.oo0000(nArray));
    }

    private static final long[] O\u00d20000(long[] lArray) {
        return nc.return(z.ifsuper(lArray));
    }

    private static final byte[] OO0000(byte[] byArray) {
        return s.return(z.oO0000(byArray));
    }

    private static final short[] floatsuper(short[] sArray) {
        return hc.return(z.\u00f5O0000(sArray));
    }

    public static final void \u00f600000(int[] nArray) {
        b.\u00d300000(nArray, (b.b.f)b.b.f.super);
    }

    public static final void \u00f6o0000(long[] lArray) {
        b.\u00d200000(lArray, (b.b.f)b.b.f.super);
    }

    public static final void \u00d8O0000(byte[] byArray) {
        b.\u00d200000(byArray, (b.b.f)b.b.f.super);
    }

    public static final void \u00d800000(short[] sArray) {
        b.\u00d200000(sArray, (b.b.f)b.b.f.super);
    }

    public static final void \u00d300000(int[] nArray, b.b.f f2) {
        for (int i2 = z.\u00d3O0000(nArray); i2 > 0; --i2) {
            int n2 = f2.o00000(i2 + 1);
            int n3 = v.new(nArray, i2);
            v.o00000(nArray, i2, v.new(nArray, n2));
            v.o00000(nArray, n2, n3);
        }
    }

    public static final void \u00d200000(long[] lArray, b.b.f f2) {
        for (int i2 = z.nullnew(lArray); i2 > 0; --i2) {
            int n2 = f2.o00000(i2 + 1);
            long l2 = nc.o00000(lArray, i2);
            nc.o00000(lArray, i2, nc.o00000(lArray, n2));
            nc.o00000(lArray, n2, l2);
        }
    }

    public static final void \u00d200000(byte[] byArray, b.b.f f2) {
        for (int i2 = z.\u00f6O0000(byArray); i2 > 0; --i2) {
            int n2 = f2.o00000(i2 + 1);
            byte by = s.o00000(byArray, i2);
            s.o00000(byArray, i2, s.o00000(byArray, n2));
            s.o00000(byArray, n2, by);
        }
    }

    public static final void \u00d200000(short[] sArray, b.b.f f2) {
        for (int i2 = z.\u00d3\u00d30000(sArray); i2 > 0; --i2) {
            int n2 = f2.o00000(i2 + 1);
            short s2 = hc.o00000(sArray, i2);
            hc.o00000(sArray, i2, hc.o00000(sArray, n2));
            hc.o00000(sArray, n2, s2);
        }
    }

    public static final void \u00d8o0000(int[] nArray) {
        if (v.\u00d300000(nArray) > 1) {
            b.\u00f6O0000(nArray);
            z.o\u00d30000(nArray);
        }
    }

    public static final void int(long[] lArray) {
        if (nc.\u00d500000(lArray) > 1) {
            b.\u00d3\u00d20000(lArray);
            z.\u00f5o0000(lArray);
        }
    }

    public static final void \u00d3\u00d20000(byte[] byArray) {
        if (s.o00000(byArray) > 1) {
            b.\u00f4o0000(byArray);
            z.for(byArray);
        }
    }

    public static final void \u00f4o0000(short[] sArray) {
        if (hc.\u00d400000(sArray) > 1) {
            b.\u00d8O0000(sArray);
            z.\u00d8\u00d20000(sArray);
        }
    }

    public static final List \u00d6O0000(int[] nArray) {
        nArray = v.return(Arrays.copyOf(nArray, nArray.length));
        b.\u00f6O0000(nArray);
        return b.super(nArray);
    }

    public static final List \u00d800000(long[] lArray) {
        lArray = nc.return(Arrays.copyOf(lArray, lArray.length));
        b.\u00d3\u00d20000(lArray);
        return b.\u00d200000(lArray);
    }

    public static final List classnew(byte[] byArray) {
        byArray = s.return(Arrays.copyOf(byArray, byArray.length));
        b.\u00f4o0000(byArray);
        return b.\u00d200000(byArray);
    }

    public static final List O\u00d20000(short[] sArray) {
        sArray = hc.return(Arrays.copyOf(sArray, sArray.length));
        b.\u00d8O0000(sArray);
        return b.super(sArray);
    }

    public static final int[] \u00d4\u00d20000(int[] nArray) {
        if (v.\u00d500000(nArray)) {
            return nArray;
        }
        nArray = v.return(Arrays.copyOf(nArray, nArray.length));
        b.\u00f6O0000(nArray);
        return nArray;
    }

    public static final long[] \u00f4o0000(long[] lArray) {
        if (nc.o00000(lArray)) {
            return lArray;
        }
        lArray = nc.return(Arrays.copyOf(lArray, lArray.length));
        b.\u00d3\u00d20000(lArray);
        return lArray;
    }

    public static final byte[] \u00d3O0000(byte[] byArray) {
        if (s.\u00d500000(byArray)) {
            return byArray;
        }
        byArray = s.return(Arrays.copyOf(byArray, byArray.length));
        b.\u00f4o0000(byArray);
        return byArray;
    }

    public static final short[] \u00d2o0000(short[] sArray) {
        if (hc.o00000(sArray)) {
            return sArray;
        }
        sArray = hc.return(Arrays.copyOf(sArray, sArray.length));
        b.\u00d8O0000(sArray);
        return sArray;
    }

    public static final int[] Oo0000(int[] nArray) {
        if (v.\u00d500000(nArray)) {
            return nArray;
        }
        nArray = v.return(Arrays.copyOf(nArray, nArray.length));
        b.\u00d8o0000(nArray);
        return nArray;
    }

    public static final long[] \u00d2O0000(long[] lArray) {
        if (nc.o00000(lArray)) {
            return lArray;
        }
        lArray = nc.return(Arrays.copyOf(lArray, lArray.length));
        b.int(lArray);
        return lArray;
    }

    public static final byte[] publicsuper(byte[] byArray) {
        if (s.\u00d500000(byArray)) {
            return byArray;
        }
        byArray = s.return(Arrays.copyOf(byArray, byArray.length));
        b.\u00d3\u00d20000(byArray);
        return byArray;
    }

    public static final short[] \u00f8\u00d20000(short[] sArray) {
        if (hc.o00000(sArray)) {
            return sArray;
        }
        sArray = hc.return(Arrays.copyOf(sArray, sArray.length));
        b.\u00f4o0000(sArray);
        return sArray;
    }

    public static final List \u00d3O0000(int[] nArray) {
        nArray = v.return(Arrays.copyOf(nArray, nArray.length));
        b.\u00f6O0000(nArray);
        return b.O\u00d20000(nArray);
    }

    public static final List \u00d400000(long[] lArray) {
        lArray = nc.return(Arrays.copyOf(lArray, lArray.length));
        b.\u00d3\u00d20000(lArray);
        return b.\u00d8O0000(lArray);
    }

    public static final List O\u00d20000(byte[] byArray) {
        byArray = s.return(Arrays.copyOf(byArray, byArray.length));
        b.\u00f4o0000(byArray);
        return b.\u00f800000(byArray);
    }

    public static final List publicsuper(short[] sArray) {
        sArray = hc.return(Arrays.copyOf(sArray, sArray.length));
        b.\u00d8O0000(sArray);
        return b.\u00d2O0000(sArray);
    }

    private static final byte[] \u00d2O0000(byte[] byArray) {
        return byArray;
    }

    private static final int[] \u00d3\u00d20000(int[] nArray) {
        return nArray;
    }

    private static final long[] \u00f8o0000(long[] lArray) {
        return lArray;
    }

    private static final short[] \u00d8o0000(short[] sArray) {
        return sArray;
    }

    private static final byte[] \u00f4\u00d20000(byte[] byArray) {
        return s.return(byArray);
    }

    private static final int[] supernew(int[] nArray) {
        return v.return(nArray);
    }

    private static final long[] \u00d3O0000(long[] lArray) {
        return nc.return(lArray);
    }

    private static final short[] Oo0000(short[] sArray) {
        return hc.return(sArray);
    }

    public static final boolean super(int[] nArray, int[] nArray2) {
        int[] nArray3 = nArray;
        if (nArray == null) {
            nArray3 = null;
        }
        int[] nArray4 = nArray2;
        if (nArray2 == null) {
            nArray4 = null;
        }
        return Arrays.equals(nArray3, nArray4);
    }

    public static final boolean \u00d300000(long[] lArray, long[] lArray2) {
        long[] lArray3 = lArray;
        if (lArray == null) {
            lArray3 = null;
        }
        long[] lArray4 = lArray2;
        if (lArray2 == null) {
            lArray4 = null;
        }
        return Arrays.equals(lArray3, lArray4);
    }

    public static final boolean super(byte[] byArray, byte[] byArray2) {
        byte[] byArray3 = byArray;
        if (byArray == null) {
            byArray3 = null;
        }
        byte[] byArray4 = byArray2;
        if (byArray2 == null) {
            byArray4 = null;
        }
        return Arrays.equals(byArray3, byArray4);
    }

    public static final boolean \u00d300000(short[] sArray, short[] sArray2) {
        short[] sArray3 = sArray;
        if (sArray == null) {
            sArray3 = null;
        }
        short[] sArray4 = sArray2;
        if (sArray2 == null) {
            sArray4 = null;
        }
        return Arrays.equals(sArray3, sArray4);
    }

    public static final int \u00d4O0000(int[] nArray) {
        int[] nArray2 = nArray;
        if (nArray == null) {
            nArray2 = null;
        }
        return Arrays.hashCode(nArray2);
    }

    public static final int \u00f6\u00d20000(long[] lArray) {
        long[] lArray2 = lArray;
        if (lArray == null) {
            lArray2 = null;
        }
        return Arrays.hashCode(lArray2);
    }

    public static final int \u00f4O0000(byte[] byArray) {
        byte[] byArray2 = byArray;
        if (byArray == null) {
            byArray2 = null;
        }
        return Arrays.hashCode(byArray2);
    }

    public static final int \u00d600000(short[] sArray) {
        short[] sArray2 = sArray;
        if (sArray == null) {
            sArray2 = null;
        }
        return Arrays.hashCode(sArray2);
    }

    public static final String \u00f8\u00d20000(int[] nArray) {
        Object object;
        block3: {
            block2: {
                object = nArray;
                if (nArray == null) break block2;
                String string = mc.o00000(v.new(object), ", ", "[", "]", 0, null, null, 56, null);
                object = string;
                if (string != null) break block3;
            }
            object = "null";
        }
        return object;
    }

    public static final String \u00d8o0000(long[] lArray) {
        Object object;
        block3: {
            block2: {
                object = lArray;
                if (lArray == null) break block2;
                String string = mc.o00000(nc.\u00d400000(object), ", ", "[", "]", 0, null, null, 56, null);
                object = string;
                if (string != null) break block3;
            }
            object = "null";
        }
        return object;
    }

    public static final String \u00d4\u00d20000(byte[] byArray) {
        Object object;
        block3: {
            block2: {
                object = byArray;
                if (byArray == null) break block2;
                String string = mc.o00000(s.\u00d400000(object), ", ", "[", "]", 0, null, null, 56, null);
                object = string;
                if (string != null) break block3;
            }
            object = "null";
        }
        return object;
    }

    public static final String classnew(short[] sArray) {
        Object object;
        block3: {
            block2: {
                object = sArray;
                if (sArray == null) break block2;
                String string = mc.o00000(hc.\u00d500000(object), ", ", "[", "]", 0, null, null, 56, null);
                object = string;
                if (string != null) break block3;
            }
            object = "null";
        }
        return object;
    }

    private static final int[] super(int[] nArray, int[] nArray2, int n2, int n3, int n4) {
        z.o00000(nArray, nArray2, n2, n3, n4);
        return nArray2;
    }

    static /* synthetic */ int[] super(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = v.\u00d300000(nArray);
        }
        z.o00000(nArray, nArray2, n2, n3, n4);
        return nArray2;
    }

    private static final long[] super(long[] lArray, long[] lArray2, int n2, int n3, int n4) {
        z.o00000(lArray, lArray2, n2, n3, n4);
        return lArray2;
    }

    static /* synthetic */ long[] super(long[] lArray, long[] lArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = nc.\u00d500000(lArray);
        }
        z.o00000(lArray, lArray2, n2, n3, n4);
        return lArray2;
    }

    private static final byte[] super(byte[] byArray, byte[] byArray2, int n2, int n3, int n4) {
        z.o00000(byArray, byArray2, n2, n3, n4);
        return byArray2;
    }

    static /* synthetic */ byte[] super(byte[] byArray, byte[] byArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = s.o00000(byArray);
        }
        z.o00000(byArray, byArray2, n2, n3, n4);
        return byArray2;
    }

    private static final short[] super(short[] sArray, short[] sArray2, int n2, int n3, int n4) {
        z.o00000(sArray, sArray2, n2, n3, n4);
        return sArray2;
    }

    static /* synthetic */ short[] super(short[] sArray, short[] sArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = hc.\u00d400000(sArray);
        }
        z.o00000(sArray, sArray2, n2, n3, n4);
        return sArray2;
    }

    private static final int[] \u00d400000(int[] nArray) {
        return v.return(Arrays.copyOf(nArray, nArray.length));
    }

    private static final long[] \u00f8\u00d20000(long[] lArray) {
        return nc.return(Arrays.copyOf(lArray, lArray.length));
    }

    private static final byte[] voidsuper(byte[] byArray) {
        return s.return(Arrays.copyOf(byArray, byArray.length));
    }

    private static final short[] \u00f6o0000(short[] sArray) {
        return hc.return(Arrays.copyOf(sArray, sArray.length));
    }

    private static final int[] \u00f400000(int[] nArray, int n2) {
        return v.return(Arrays.copyOf(nArray, n2));
    }

    private static final long[] \u00d800000(long[] lArray, int n2) {
        return nc.return(Arrays.copyOf(lArray, n2));
    }

    private static final byte[] \u00d600000(byte[] byArray, int n2) {
        return s.return(Arrays.copyOf(byArray, n2));
    }

    private static final short[] \u00d200000(short[] sArray, int n2) {
        return hc.return(Arrays.copyOf(sArray, n2));
    }

    private static final int[] super(int[] object, int n2, g g2) {
        if (!(n2 >= 0)) {
            object = "Invalid new array size: " + n2 + '.';
            throw new IllegalArgumentException(object.toString());
        }
        int n3 = v.\u00d300000((int[])object);
        object = v.return(Arrays.copyOf((int[])object, n2));
        while (n3 < n2) {
            v.o00000((int[])object, n3, ((ac)g2.\u00f800000(n3)).o00000());
            ++n3;
        }
        return object;
    }

    private static final long[] super(long[] object, int n2, g g2) {
        if (!(n2 >= 0)) {
            object = "Invalid new array size: " + n2 + '.';
            throw new IllegalArgumentException(object.toString());
        }
        int n3 = nc.\u00d500000((long[])object);
        object = nc.return(Arrays.copyOf((long[])object, n2));
        while (n3 < n2) {
            nc.o00000((long[])object, n3, ((f)g2.\u00f800000(n3)).super());
            ++n3;
        }
        return object;
    }

    private static final byte[] \u00d300000(byte[] object, int n2, g g2) {
        if (!(n2 >= 0)) {
            object = "Invalid new array size: " + n2 + '.';
            throw new IllegalArgumentException(object.toString());
        }
        int n3 = s.o00000((byte[])object);
        object = s.return(Arrays.copyOf((byte[])object, n2));
        while (n3 < n2) {
            s.o00000((byte[])object, n3, ((lc)g2.\u00f800000(n3)).super());
            ++n3;
        }
        return object;
    }

    private static final short[] super(short[] object, int n2, g g2) {
        if (!(n2 >= 0)) {
            object = "Invalid new array size: " + n2 + '.';
            throw new IllegalArgumentException(object.toString());
        }
        int n3 = hc.\u00d400000((short[])object);
        object = hc.return(Arrays.copyOf((short[])object, n2));
        while (n3 < n2) {
            hc.o00000((short[])object, n3, ((dd)g2.\u00f800000(n3)).o00000());
            ++n3;
        }
        return object;
    }

    private static final int[] \u00d200000(int[] nArray, int n2, int n3) {
        return v.return(z.o00000(nArray, n2, n3));
    }

    private static final long[] super(long[] lArray, int n2, int n3) {
        return nc.return(z.o00000(lArray, n2, n3));
    }

    private static final byte[] super(byte[] byArray, int n2, int n3) {
        return s.return(z.\u00d300000(byArray, n2, n3));
    }

    private static final short[] \u00d400000(short[] sArray, int n2, int n3) {
        return hc.return(z.\u00d200000(sArray, n2, n3));
    }

    public static final void \u00d200000(int[] nArray, int n2, int n3, int n4) {
        z.o00000(nArray, n2, n3, n4);
    }

    public static /* synthetic */ void \u00d200000(int[] nArray, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n3 = 0;
        }
        if ((n5 & 4) != 0) {
            n4 = v.\u00d300000(nArray);
        }
        b.\u00d200000(nArray, n2, n3, n4);
    }

    public static final void \u00d200000(long[] lArray, long l2, int n2, int n3) {
        z.\u00d200000(lArray, l2, n2, n3);
    }

    public static /* synthetic */ void \u00d200000(long[] lArray, long l2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = nc.\u00d500000(lArray);
        }
        b.\u00d200000(lArray, l2, n2, n3);
    }

    public static final void \u00d200000(byte[] byArray, byte by, int n2, int n3) {
        z.\u00d200000(byArray, by, n2, n3);
    }

    public static /* synthetic */ void \u00d200000(byte[] byArray, byte by, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = s.o00000(byArray);
        }
        b.\u00d200000(byArray, by, n2, n3);
    }

    public static final void \u00d200000(short[] sArray, short s2, int n2, int n3) {
        z.o00000(sArray, s2, n2, n3);
    }

    public static /* synthetic */ void \u00d200000(short[] sArray, short s2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = hc.\u00d400000(sArray);
        }
        b.\u00d200000(sArray, s2, n2, n3);
    }

    public static final m \u00f4\u00d20000(int[] nArray) {
        return z.whilesuper(nArray);
    }

    public static /* synthetic */ void \u00f800000(int[] nArray) {
    }

    public static final m \u00d4O0000(long[] lArray) {
        return z.\u00d6o0000(lArray);
    }

    public static /* synthetic */ void OO0000(long[] lArray) {
    }

    public static final m \u00f8\u00d20000(byte[] byArray) {
        return z.\u00d3\u00d20000(byArray);
    }

    public static /* synthetic */ void \u00f6O0000(byte[] byArray) {
    }

    public static final m intnew(short[] sArray) {
        return z.o\u00d20000(sArray);
    }

    public static /* synthetic */ void \u00f4\u00d20000(short[] sArray) {
    }

    public static final int int(int[] nArray) {
        return z.\u00d3O0000(nArray);
    }

    public static /* synthetic */ void \u00f4O0000(int[] nArray) {
    }

    public static final int voidsuper(long[] lArray) {
        return z.nullnew(lArray);
    }

    public static /* synthetic */ void \u00f8O0000(long[] lArray) {
    }

    public static final int interface(byte[] byArray) {
        return z.\u00f6O0000(byArray);
    }

    public static /* synthetic */ void \u00d8o0000(byte[] byArray) {
    }

    public static final int class(short[] sArray) {
        return z.\u00d3\u00d30000(sArray);
    }

    public static /* synthetic */ void do(short[] sArray) {
    }

    private static final int[] \u00d400000(int[] nArray, int n2) {
        return v.return(z.\u00d300000(nArray, n2));
    }

    private static final long[] \u00d200000(long[] lArray, long l2) {
        return nc.return(z.o00000(lArray, l2));
    }

    private static final byte[] \u00d300000(byte[] byArray, byte by) {
        return s.return(z.o00000(byArray, by));
    }

    private static final short[] \u00d200000(short[] sArray, short s2) {
        return hc.return(z.o00000(sArray, s2));
    }

    public static final int[] super(int[] nArray, Collection object) {
        int n2 = v.\u00d300000(nArray);
        nArray = Arrays.copyOf(nArray, v.\u00d300000(nArray) + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((ac)object.next()).o00000();
            nArray[n2++] = n3;
        }
        return v.return(nArray);
    }

    public static final long[] super(long[] lArray, Collection object) {
        int n2 = nc.\u00d500000(lArray);
        lArray = Arrays.copyOf(lArray, nc.\u00d500000(lArray) + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            long l2 = ((f)object.next()).super();
            lArray[n2++] = l2;
        }
        return nc.return(lArray);
    }

    public static final byte[] \u00d200000(byte[] byArray, Collection object) {
        int n2 = s.o00000(byArray);
        byArray = Arrays.copyOf(byArray, s.o00000(byArray) + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            byte by = ((lc)object.next()).super();
            byArray[n2++] = by;
        }
        return s.return(byArray);
    }

    public static final short[] \u00d200000(short[] sArray, Collection object) {
        int n2 = hc.\u00d400000(sArray);
        sArray = Arrays.copyOf(sArray, hc.\u00d400000(sArray) + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            short s2 = ((dd)object.next()).o00000();
            sArray[n2++] = s2;
        }
        return hc.return(sArray);
    }

    private static final int[] \u00d200000(int[] nArray, int[] nArray2) {
        return v.return(z.\u00d200000(nArray, nArray2));
    }

    private static final long[] super(long[] lArray, long[] lArray2) {
        return nc.return(z.\u00d200000(lArray, lArray2));
    }

    private static final byte[] \u00d300000(byte[] byArray, byte[] byArray2) {
        return s.return(z.o00000(byArray, byArray2));
    }

    private static final short[] super(short[] sArray, short[] sArray2) {
        return hc.return(z.\u00d200000(sArray, sArray2));
    }

    public static final void \u00f6O0000(int[] nArray) {
        if (v.\u00d300000(nArray) > 1) {
            j.\u00d300000(nArray, 0, v.\u00d300000(nArray));
        }
    }

    public static final void \u00d3\u00d20000(long[] lArray) {
        if (nc.\u00d500000(lArray) > 1) {
            j.\u00d300000(lArray, 0, nc.\u00d500000(lArray));
        }
    }

    public static final void \u00f4o0000(byte[] byArray) {
        if (s.o00000(byArray) > 1) {
            j.\u00d300000(byArray, 0, s.o00000(byArray));
        }
    }

    public static final void \u00d8O0000(short[] sArray) {
        if (hc.\u00d400000(sArray) > 1) {
            j.\u00d300000(sArray, 0, hc.\u00d400000(sArray));
        }
    }

    public static final void super(int[] nArray, int n2, int n3) {
        kb.return.\u00d200000(n2, n3, v.\u00d300000(nArray));
        if (n2 < n3 - 1) {
            j.\u00d300000(nArray, n2, n3);
        }
    }

    public static /* synthetic */ void super(int[] nArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = v.\u00d300000(nArray);
        }
        b.super(nArray, n2, n3);
    }

    public static final void \u00d200000(long[] lArray, int n2, int n3) {
        kb.return.\u00d200000(n2, n3, nc.\u00d500000(lArray));
        if (n2 < n3 - 1) {
            j.\u00d300000(lArray, n2, n3);
        }
    }

    public static /* synthetic */ void super(long[] lArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = nc.\u00d500000(lArray);
        }
        b.\u00d200000(lArray, n2, n3);
    }

    public static final void \u00d200000(byte[] byArray, int n2, int n3) {
        kb.return.\u00d200000(n2, n3, s.o00000(byArray));
        if (n2 < n3 - 1) {
            j.\u00d300000(byArray, n2, n3);
        }
    }

    public static /* synthetic */ void super(byte[] byArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = s.o00000(byArray);
        }
        b.\u00d200000(byArray, n2, n3);
    }

    public static final void super(short[] sArray, int n2, int n3) {
        kb.return.\u00d200000(n2, n3, hc.\u00d400000(sArray));
        if (n2 < n3 - 1) {
            j.\u00d300000(sArray, n2, n3);
        }
    }

    public static /* synthetic */ void super(short[] sArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = hc.\u00d400000(sArray);
        }
        b.super(sArray, n2, n3);
    }

    public static final void \u00d300000(int[] nArray, int n2, int n3) {
        b.super(nArray, n2, n3);
        z.String(nArray, n2, n3);
    }

    public static final void \u00d300000(long[] lArray, int n2, int n3) {
        b.\u00d200000(lArray, n2, n3);
        z.\u00d500000(lArray, n2, n3);
    }

    public static final void \u00d300000(byte[] byArray, int n2, int n3) {
        b.\u00d200000(byArray, n2, n3);
        z.String(byArray, n2, n3);
    }

    public static final void \u00d200000(short[] sArray, int n2, int n3) {
        b.super(sArray, n2, n3);
        z.String(sArray, n2, n3);
    }

    private static final byte[] \u00d600000(byte[] byArray) {
        return Arrays.copyOf(byArray, byArray.length);
    }

    private static final int[] classnew(int[] nArray) {
        return Arrays.copyOf(nArray, nArray.length);
    }

    private static final long[] Objectsuper(long[] lArray) {
        return Arrays.copyOf(lArray, lArray.length);
    }

    private static final short[] \u00d6O0000(short[] sArray) {
        return Arrays.copyOf(sArray, sArray.length);
    }

    public static final ac[] floatsuper(int[] nArray) {
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        ac[] acArray = new ac[n3];
        while (n2 < n3) {
            int n4 = n2++;
            acArray[n4] = ac.return(v.new(nArray, n4));
        }
        return acArray;
    }

    public static final f[] \u00d6o0000(long[] lArray) {
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        f[] fArray = new f[n3];
        while (n2 < n3) {
            int n4 = n2++;
            fArray[n4] = f.\u00d4O0000(nc.o00000(lArray, n4));
        }
        return fArray;
    }

    public static final lc[] \u00f8o0000(byte[] byArray) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        lc[] lcArray = new lc[n3];
        while (n2 < n3) {
            int n4 = n2++;
            lcArray[n4] = lc.\u00d6O0000(s.o00000(byArray, n4));
        }
        return lcArray;
    }

    public static final dd[] \u00d2\u00d20000(short[] sArray) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        dd[] ddArray = new dd[n3];
        while (n2 < n3) {
            int n4 = n2++;
            ddArray[n4] = dd.\u00d6O0000(hc.o00000(sArray, n4));
        }
        return ddArray;
    }

    public static final byte[] super(lc[] lcArray) {
        int n2 = lcArray.length;
        byte[] byArray = new byte[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            int n4 = n3 = i2;
            byte[] byArray2 = byArray;
            byArray2[n4] = n3 = (int)lcArray[n3].super();
        }
        return s.return(byArray);
    }

    private static final byte[] \u00d6O0000(byte[] byArray) {
        return s.return(Arrays.copyOf(byArray, byArray.length));
    }

    public static final int[] \u00d200000(ac[] acArray) {
        int n2 = acArray.length;
        int[] nArray = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            int n4 = n3 = i2;
            int[] nArray2 = nArray;
            nArray2[n4] = n3 = acArray[n3].o00000();
        }
        return v.return(nArray);
    }

    private static final int[] \u00d2\u00d20000(int[] nArray) {
        return v.return(Arrays.copyOf(nArray, nArray.length));
    }

    public static final long[] super(f[] fArray) {
        int n2 = fArray.length;
        int n3 = 0;
        long[] lArray = new long[n2];
        while (n3 < n2) {
            long l2;
            int n4;
            int n5 = n4 = n3++;
            long[] lArray2 = lArray;
            lArray2[n5] = l2 = fArray[n4].super();
        }
        return nc.return(lArray);
    }

    private static final long[] \u00d2o0000(long[] lArray) {
        return nc.return(Arrays.copyOf(lArray, lArray.length));
    }

    public static final short[] super(dd[] ddArray) {
        int n2 = ddArray.length;
        short[] sArray = new short[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            int n4 = n3 = i2;
            short[] sArray2 = sArray;
            sArray2[n4] = n3 = (int)ddArray[n3].o00000();
        }
        return hc.return(sArray);
    }

    private static final short[] supernew(short[] sArray) {
        return hc.return(Arrays.copyOf(sArray, sArray.length));
    }

    private static final Map O\u00d30000(int[] nArray, g g2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(bb.\u00d200000(y.\u00d200000(v.\u00d300000(nArray)), 16));
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            ((Map)linkedHashMap).put(ac.return(n3), g2.\u00f800000(ac.return(n3)));
        }
        return linkedHashMap;
    }

    private static final Map \u00f800000(long[] lArray, g g2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(bb.\u00d200000(y.\u00d200000(nc.\u00d500000(lArray)), 16));
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            ((Map)linkedHashMap).put(f.\u00d4O0000(l2), g2.\u00f800000(f.\u00d4O0000(l2)));
        }
        return linkedHashMap;
    }

    private static final Map \u00d2o0000(byte[] byArray, g g2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(bb.\u00d200000(y.\u00d200000(s.o00000(byArray)), 16));
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            ((Map)linkedHashMap).put(lc.\u00d6O0000(by), g2.\u00f800000(lc.\u00d6O0000(by)));
        }
        return linkedHashMap;
    }

    private static final Map class(short[] sArray, g g2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(bb.\u00d200000(y.\u00d200000(hc.\u00d400000(sArray)), 16));
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            ((Map)linkedHashMap).put(dd.\u00d6O0000(s2), g2.\u00f800000(dd.\u00d6O0000(s2)));
        }
        return linkedHashMap;
    }

    private static final Map \u00d200000(int[] nArray, Map map, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            map.put(ac.return(n3), g2.\u00f800000(ac.return(n3)));
        }
        return map;
    }

    private static final Map \u00d200000(long[] lArray, Map map, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            map.put(f.\u00d4O0000(l2), g2.\u00f800000(f.\u00d4O0000(l2)));
        }
        return map;
    }

    private static final Map super(byte[] byArray, Map map, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            map.put(lc.\u00d6O0000(by), g2.\u00f800000(lc.\u00d6O0000(by)));
        }
        return map;
    }

    private static final Map \u00d200000(short[] sArray, Map map, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            map.put(dd.\u00d6O0000(s2), g2.\u00f800000(dd.\u00d6O0000(s2)));
        }
        return map;
    }

    private static final List \u00d4\u00d30000(int[] nArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            mc.new(collection, (Iterable)g2.\u00f800000(ac.return(n3)));
        }
        return (List)collection;
    }

    private static final List \u00d2o0000(long[] lArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            mc.new(collection, (Iterable)g2.\u00f800000(f.\u00d4O0000(l2)));
        }
        return (List)collection;
    }

    private static final List \u00d4\u00d20000(byte[] byArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            mc.new(collection, (Iterable)g2.\u00f800000(lc.\u00d6O0000(by)));
        }
        return (List)collection;
    }

    private static final List \u00f4o0000(short[] sArray, g g2) {
        Collection collection = new ArrayList();
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            mc.new(collection, (Iterable)g2.\u00f800000(dd.\u00d6O0000(s2)));
        }
        return (List)collection;
    }

    private static final List \u00d300000(int[] nArray, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            mc.new(collection, (Iterable)f2.o00000(n2++, ac.return(n4)));
        }
        return (List)collection;
    }

    private static final List class(long[] lArray, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            mc.new(collection, (Iterable)f2.o00000(n2++, f.\u00d4O0000(l2)));
        }
        return (List)collection;
    }

    private static final List \u00d400000(byte[] byArray, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray, i2);
            mc.new(collection, (Iterable)f2.o00000(n2++, lc.\u00d6O0000(by)));
        }
        return (List)collection;
    }

    private static final List \u00d600000(short[] sArray, b.o.e.f f2) {
        Collection collection = new ArrayList();
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            mc.new(collection, (Iterable)f2.o00000(n2++, dd.\u00d6O0000(s2)));
        }
        return (List)collection;
    }

    private static final Collection \u00d200000(int[] nArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            Iterable iterable = (Iterable)f2.o00000(n2++, ac.return(n4));
            mc.new(collection, iterable);
        }
        return collection;
    }

    private static final Collection \u00d200000(long[] lArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            Iterable iterable = (Iterable)f2.o00000(n2++, f.\u00d4O0000(l2));
            mc.new(collection, iterable);
        }
        return collection;
    }

    private static final Collection \u00d300000(byte[] byArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray, i2);
            Iterable iterable = (Iterable)f2.o00000(n2++, lc.\u00d6O0000(by));
            mc.new(collection, iterable);
        }
        return collection;
    }

    private static final Collection \u00d200000(short[] sArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            Iterable iterable = (Iterable)f2.o00000(n2++, dd.\u00d6O0000(s2));
            mc.new(collection, iterable);
        }
        return collection;
    }

    private static final Collection super(int[] nArray, Collection collection, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            Iterable iterable = (Iterable)g2.\u00f800000(ac.return(n3));
            mc.new(collection, iterable);
        }
        return collection;
    }

    private static final Collection super(long[] lArray, Collection collection, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            Iterable iterable = (Iterable)g2.\u00f800000(f.\u00d4O0000(l2));
            mc.new(collection, iterable);
        }
        return collection;
    }

    private static final Collection \u00d400000(byte[] byArray, Collection collection, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            Iterable iterable = (Iterable)g2.\u00f800000(lc.\u00d6O0000(by));
            mc.new(collection, iterable);
        }
        return collection;
    }

    private static final Collection \u00d400000(short[] sArray, Collection collection, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            Iterable iterable = (Iterable)g2.\u00f800000(dd.\u00d6O0000(s2));
            mc.new(collection, iterable);
        }
        return collection;
    }

    private static final Map \u00d4o0000(int[] nArray, g g2) {
        Map map = new LinkedHashMap();
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            int n3 = v.new(nArray, i2);
            Object object = g2.\u00f800000(ac.return(n3));
            Object object2 = map2.get(object);
            if (object2 == null) {
                List list = new ArrayList();
                map2.put(object, list);
                object2 = list;
            }
            ((List)object2).add(ac.return(n3));
        }
        return map;
    }

    private static final Map classnew(long[] lArray, g g2) {
        Map map = new LinkedHashMap();
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            long l2 = nc.o00000(lArray, i2);
            Object object = g2.\u00f800000(f.\u00d4O0000(l2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                List list = new ArrayList();
                map2.put(object, list);
                object2 = list;
            }
            ((List)object2).add(f.\u00d4O0000(l2));
        }
        return map;
    }

    private static final Map \u00d8\u00d20000(byte[] byArray, g g2) {
        Map map = new LinkedHashMap();
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            byte by = s.o00000(byArray, i2);
            Object object = g2.\u00f800000(lc.\u00d6O0000(by));
            Object object2 = map2.get(object);
            if (object2 == null) {
                List list = new ArrayList();
                map2.put(object, list);
                object2 = list;
            }
            ((List)object2).add(lc.\u00d6O0000(by));
        }
        return map;
    }

    private static final Map \u00d3o0000(short[] sArray, g g2) {
        Map map = new LinkedHashMap();
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            short s2 = hc.o00000(sArray, i2);
            Object object = g2.\u00f800000(dd.\u00d6O0000(s2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                List list = new ArrayList();
                map2.put(object, list);
                object2 = list;
            }
            ((List)object2).add(dd.\u00d6O0000(s2));
        }
        return map;
    }

    private static final Map super(int[] nArray, g g2, g g3) {
        Map map = new LinkedHashMap();
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            int n3 = v.new(nArray, i2);
            Object object = g2.\u00f800000(ac.return(n3));
            Object object2 = map2.get(object);
            if (object2 == null) {
                List list = new ArrayList();
                map2.put(object, list);
                object2 = list;
            }
            ((List)object2).add(g3.\u00f800000(ac.return(n3)));
        }
        return map;
    }

    private static final Map super(long[] lArray, g g2, g g3) {
        Map map = new LinkedHashMap();
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            long l2 = nc.o00000(lArray, i2);
            Object object = g2.\u00f800000(f.\u00d4O0000(l2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                List list = new ArrayList();
                map2.put(object, list);
                object2 = list;
            }
            ((List)object2).add(g3.\u00f800000(f.\u00d4O0000(l2)));
        }
        return map;
    }

    private static final Map super(byte[] byArray, g g2, g g3) {
        Map map = new LinkedHashMap();
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            byte by = s.o00000(byArray, i2);
            Object object = g2.\u00f800000(lc.\u00d6O0000(by));
            Object object2 = map2.get(object);
            if (object2 == null) {
                List list = new ArrayList();
                map2.put(object, list);
                object2 = list;
            }
            ((List)object2).add(g3.\u00f800000(lc.\u00d6O0000(by)));
        }
        return map;
    }

    private static final Map super(short[] sArray, g g2, g g3) {
        Map map = new LinkedHashMap();
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            short s2 = hc.o00000(sArray, i2);
            Object object = g2.\u00f800000(dd.\u00d6O0000(s2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                List list = new ArrayList();
                map2.put(object, list);
                object2 = list;
            }
            ((List)object2).add(g3.\u00f800000(dd.\u00d6O0000(s2)));
        }
        return map;
    }

    private static final Map super(int[] nArray, Map map, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            int n3 = v.new(nArray, i2);
            Object object = g2.\u00f800000(ac.return(n3));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(ac.return(n3));
        }
        return map;
    }

    private static final Map super(long[] lArray, Map map, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            long l2 = nc.o00000(lArray, i2);
            Object object = g2.\u00f800000(f.\u00d4O0000(l2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(f.\u00d4O0000(l2));
        }
        return map;
    }

    private static final Map \u00d200000(byte[] byArray, Map map, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            byte by = s.o00000(byArray, i2);
            Object object = g2.\u00f800000(lc.\u00d6O0000(by));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(lc.\u00d6O0000(by));
        }
        return map;
    }

    private static final Map super(short[] sArray, Map map, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            short s2 = hc.o00000(sArray, i2);
            Object object = g2.\u00f800000(dd.\u00d6O0000(s2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(dd.\u00d6O0000(s2));
        }
        return map;
    }

    private static final Map super(int[] nArray, Map map, g g2, g g3) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            int n3 = v.new(nArray, i2);
            Object object = g2.\u00f800000(ac.return(n3));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(g3.\u00f800000(ac.return(n3)));
        }
        return map;
    }

    private static final Map super(long[] lArray, Map map, g g2, g g3) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            long l2 = nc.o00000(lArray, i2);
            Object object = g2.\u00f800000(f.\u00d4O0000(l2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(g3.\u00f800000(f.\u00d4O0000(l2)));
        }
        return map;
    }

    private static final Map super(byte[] byArray, Map map, g g2, g g3) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            byte by = s.o00000(byArray, i2);
            Object object = g2.\u00f800000(lc.\u00d6O0000(by));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(g3.\u00f800000(lc.\u00d6O0000(by)));
        }
        return map;
    }

    private static final Map super(short[] sArray, Map map, g g2, g g3) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            Map map2 = map;
            short s2 = hc.o00000(sArray, i2);
            Object object = g2.\u00f800000(dd.\u00d6O0000(s2));
            Object object2 = map2.get(object);
            if (object2 == null) {
                object2 = new ArrayList();
                map2.put(object, object2);
            }
            ((List)object2).add(g3.\u00f800000(dd.\u00d6O0000(s2)));
        }
        return map;
    }

    private static final List \u00f800000(int[] object, g g2) {
        int[] nArray = object;
        object = new ArrayList(v.\u00d300000((int[])object));
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            object.add(g2.\u00f800000(ac.return(n3)));
        }
        return (List)object;
    }

    private static final List O\u00d20000(long[] object, g g2) {
        long[] lArray = object;
        object = new ArrayList(nc.\u00d500000((long[])object));
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            object.add(g2.\u00f800000(f.\u00d4O0000(l2)));
        }
        return (List)object;
    }

    private static final List \u00d2\u00d30000(byte[] object, g g2) {
        byte[] byArray = object;
        object = new ArrayList(s.o00000((byte[])object));
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            object.add(g2.\u00f800000(lc.\u00d6O0000(by)));
        }
        return (List)object;
    }

    private static final List \u00d8\u00d20000(short[] object, g g2) {
        short[] sArray = object;
        object = new ArrayList(hc.\u00d400000((short[])object));
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            object.add(g2.\u00f800000(dd.\u00d6O0000(s2)));
        }
        return (List)object;
    }

    private static final List class(int[] object, b.o.e.f f2) {
        int[] nArray = object;
        object = new ArrayList(v.\u00d300000((int[])object));
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            object.add(f2.o00000(n2++, ac.return(n4)));
        }
        return (List)object;
    }

    private static final List \u00d600000(long[] object, b.o.e.f f2) {
        long[] lArray = object;
        object = new ArrayList(nc.\u00d500000((long[])object));
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            object.add(f2.o00000(n2++, f.\u00d4O0000(l2)));
        }
        return (List)object;
    }

    private static final List \u00d600000(byte[] object, b.o.e.f f2) {
        byte[] byArray = object;
        object = new ArrayList(s.o00000((byte[])object));
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray, i2);
            object.add(f2.o00000(n2++, lc.\u00d6O0000(by)));
        }
        return (List)object;
    }

    private static final List \u00d800000(short[] object, b.o.e.f f2) {
        short[] sArray = object;
        object = new ArrayList(hc.\u00d400000((short[])object));
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            object.add(f2.o00000(n2++, dd.\u00d6O0000(s2)));
        }
        return (List)object;
    }

    private static final Collection super(int[] nArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            collection.add(f2.o00000(n2++, ac.return(n4)));
        }
        return collection;
    }

    private static final Collection super(long[] lArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            collection.add(f2.o00000(n2++, f.\u00d4O0000(l2)));
        }
        return collection;
    }

    private static final Collection \u00d200000(byte[] byArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray, i2);
            collection.add(f2.o00000(n2++, lc.\u00d6O0000(by)));
        }
        return collection;
    }

    private static final Collection super(short[] sArray, Collection collection, b.o.e.f f2) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            collection.add(f2.o00000(n2++, dd.\u00d6O0000(s2)));
        }
        return collection;
    }

    private static final Collection \u00d400000(int[] nArray, Collection collection, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            collection.add(g2.\u00f800000(ac.return(n3)));
        }
        return collection;
    }

    private static final Collection \u00d400000(long[] lArray, Collection collection, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            collection.add(g2.\u00f800000(f.\u00d4O0000(l2)));
        }
        return collection;
    }

    private static final Collection \u00d300000(byte[] byArray, Collection collection, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            collection.add(g2.\u00f800000(lc.\u00d6O0000(by)));
        }
        return collection;
    }

    private static final Collection \u00d300000(short[] sArray, Collection collection, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            collection.add(g2.\u00f800000(dd.\u00d6O0000(s2)));
        }
        return collection;
    }

    public static final Iterable \u00d2O0000(int[] nArray) {
        return new gc(() -> c.\u00d800000(nArray));
    }

    public static final Iterable \u00d6\u00d20000(long[] lArray) {
        return new gc(() -> c.\u00f4\u00d20000(lArray));
    }

    public static final Iterable \u00d3o0000(byte[] byArray) {
        return new gc(() -> c.\u00d800000(byArray));
    }

    public static final Iterable \u00f4O0000(short[] sArray) {
        return new gc(() -> c.\u00f400000(sArray));
    }

    private static final boolean \u00d3O0000(int[] nArray, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            return false;
        }
        return true;
    }

    private static final boolean \u00d3o0000(long[] lArray, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            return false;
        }
        return true;
    }

    private static final boolean classnew(byte[] byArray, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            return false;
        }
        return true;
    }

    private static final boolean \u00d4o0000(short[] sArray, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            return false;
        }
        return true;
    }

    private static final boolean interface(int[] nArray) {
        return z.\u00d5\u00d20000(nArray);
    }

    private static final boolean floatsuper(long[] lArray) {
        return z.\u00d5O0000(lArray);
    }

    private static final boolean \u00f8O0000(byte[] byArray) {
        return z.\u00f8\u00d20000(byArray);
    }

    private static final boolean OO0000(short[] sArray) {
        return z.\u00f5o0000(sArray);
    }

    private static final boolean \u00f8\u00d20000(int[] nArray, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (!((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            return true;
        }
        return false;
    }

    private static final boolean interface(long[] lArray, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            return true;
        }
        return false;
    }

    private static final boolean \u00d3o0000(byte[] byArray, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            return true;
        }
        return false;
    }

    private static final boolean do(short[] sArray, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            return true;
        }
        return false;
    }

    private static final int \u00d8O0000(int[] nArray, g g2) {
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            if (!((Boolean)g2.\u00f800000(ac.return(n4))).booleanValue()) continue;
            ++n2;
        }
        return n2;
    }

    private static final int floatsuper(long[] lArray, g g2) {
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            ++n2;
        }
        return n2;
    }

    private static final int intnew(byte[] byArray, g g2) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            ++n2;
        }
        return n2;
    }

    private static final int \u00d6o0000(short[] sArray, g g2) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            ++n2;
        }
        return n2;
    }

    private static final Object \u00d200000(int[] nArray, Object object, b.o.e.f f2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            object = f2.o00000(object, ac.return(n3));
        }
        return object;
    }

    private static final Object \u00d300000(long[] lArray, Object object, b.o.e.f f2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            object = f2.o00000(object, f.\u00d4O0000(l2));
        }
        return object;
    }

    private static final Object \u00d200000(byte[] byArray, Object object, b.o.e.f f2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            object = f2.o00000(object, lc.\u00d6O0000(by));
        }
        return object;
    }

    private static final Object super(short[] sArray, Object object, b.o.e.f f2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            object = f2.o00000(object, dd.\u00d6O0000(s2));
        }
        return object;
    }

    private static final Object super(int[] nArray, Object object, e e2) {
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            object = e2.o00000(n2++, object, ac.return(n4));
        }
        return object;
    }

    private static final Object \u00d200000(long[] lArray, Object object, e e2) {
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            object = e2.o00000(n2++, object, f.\u00d4O0000(l2));
        }
        return object;
    }

    private static final Object super(byte[] byArray, Object object, e e2) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray, i2);
            object = e2.o00000(n2++, object, lc.\u00d6O0000(by));
        }
        return object;
    }

    private static final Object super(short[] sArray, Object object, e e2) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            object = e2.o00000(n2++, object, dd.\u00d6O0000(s2));
        }
        return object;
    }

    private static final Object \u00d300000(int[] nArray, Object object, b.o.e.f f2) {
        int n2 = z.\u00d3O0000(nArray);
        while (n2 >= 0) {
            object = f2.o00000(ac.return(v.new(nArray, n2--)), object);
        }
        return object;
    }

    private static final Object super(long[] lArray, Object object, b.o.e.f f2) {
        int n2 = z.nullnew(lArray);
        while (n2 >= 0) {
            object = f2.o00000(f.\u00d4O0000(nc.o00000(lArray, n2--)), object);
        }
        return object;
    }

    private static final Object \u00d300000(byte[] byArray, Object object, b.o.e.f f2) {
        int n2 = z.\u00f6O0000(byArray);
        while (n2 >= 0) {
            object = f2.o00000(lc.\u00d6O0000(s.o00000(byArray, n2--)), object);
        }
        return object;
    }

    private static final Object \u00d300000(short[] sArray, Object object, b.o.e.f f2) {
        int n2 = z.\u00d3\u00d30000(sArray);
        while (n2 >= 0) {
            object = f2.o00000(dd.\u00d6O0000(hc.o00000(sArray, n2--)), object);
        }
        return object;
    }

    private static final Object \u00d400000(int[] nArray, Object object, e e2) {
        for (int i2 = z.\u00d3O0000(nArray); i2 >= 0; --i2) {
            object = e2.o00000(i2, ac.return(v.new(nArray, i2)), object);
        }
        return object;
    }

    private static final Object \u00d400000(long[] lArray, Object object, e e2) {
        for (int i2 = z.nullnew(lArray); i2 >= 0; --i2) {
            object = e2.o00000(i2, f.\u00d4O0000(nc.o00000(lArray, i2)), object);
        }
        return object;
    }

    private static final Object \u00d200000(byte[] byArray, Object object, e e2) {
        for (int i2 = z.\u00f6O0000(byArray); i2 >= 0; --i2) {
            object = e2.o00000(i2, lc.\u00d6O0000(s.o00000(byArray, i2)), object);
        }
        return object;
    }

    private static final Object \u00d400000(short[] sArray, Object object, e e2) {
        for (int i2 = z.\u00d3\u00d30000(sArray); i2 >= 0; --i2) {
            object = e2.o00000(i2, dd.\u00d6O0000(hc.o00000(sArray, i2)), object);
        }
        return object;
    }

    private static final void \u00f600000(int[] nArray, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            g2.\u00f800000(ac.return(n3));
        }
    }

    private static final void \u00f8O0000(long[] lArray, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            g2.\u00f800000(f.\u00d4O0000(l2));
        }
    }

    private static final void \u00f6o0000(byte[] byArray, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            g2.\u00f800000(lc.\u00d6O0000(by));
        }
    }

    private static final void \u00d2o0000(short[] sArray, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            g2.\u00f800000(dd.\u00d6O0000(s2));
        }
    }

    private static final void \u00f600000(int[] nArray, b.o.e.f f2) {
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            f2.o00000(n2++, ac.return(n4));
        }
    }

    private static final void \u00f400000(long[] lArray, b.o.e.f f2) {
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            f2.o00000(n2++, f.\u00d4O0000(l2));
        }
    }

    private static final void \u00d300000(byte[] byArray, b.o.e.f f2) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray, i2);
            f2.o00000(n2++, lc.\u00d6O0000(by));
        }
    }

    private static final void \u00d400000(short[] sArray, b.o.e.f f2) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            f2.o00000(n2++, dd.\u00d6O0000(s2));
        }
    }

    public static final int OO0000(int[] nArray) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                int n5;
                if (Integer.compareUnsigned(n2, n5 = v.new(nArray, n3)) < 0) {
                    n2 = n5;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        return n2;
    }

    public static final long Oo0000(long[] lArray) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                long l3;
                if (Long.compareUnsigned(l2, l3 = nc.o00000(lArray, n2)) < 0) {
                    l2 = l3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return l2;
    }

    public static final byte Oo0000(byte[] byArray) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                byte by2;
                if (fc.o00000(by & 0xFF, (by2 = s.o00000(byArray, n2)) & 0xFF) < 0) {
                    by = by2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return by;
    }

    public static final short \u00d4\u00d20000(short[] sArray) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                short s3;
                if (fc.o00000(s2 & 0xFFFF, (s3 = hc.o00000(sArray, n2)) & 0xFFFF) < 0) {
                    s2 = s3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return s2;
    }

    private static final int Objectsuper(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        int n2 = v.new(nArray, 0);
        int n3 = z.\u00d3O0000(nArray);
        if (n3 == 0) {
            return n2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(ac.return(n2));
        int n4 = 1;
        if (n3 > 0) {
            while (true) {
                int n5;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(ac.return(n5 = v.new(nArray, n4)))) < 0) {
                    n2 = n5;
                    comparable = comparable2;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        return n2;
    }

    private static final long supernew(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = z.nullnew(lArray);
        if (n2 == 0) {
            return l2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(f.\u00d4O0000(l2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                long l3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(f.\u00d4O0000(l3 = nc.o00000(lArray, n3)))) < 0) {
                    l2 = l3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return l2;
    }

    private static final byte \u00d800000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        byte by = s.o00000(byArray, 0);
        int n2 = z.\u00f6O0000(byArray);
        if (n2 == 0) {
            return by;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                byte by2;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by2 = s.o00000(byArray, n3)))) < 0) {
                    by = by2;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return by;
    }

    private static final short floatsuper(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 == 0) {
            return s2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                short s3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s3 = hc.o00000(sArray, n3)))) < 0) {
                    s2 = s3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return s2;
    }

    private static final ac \u00f400000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        int n2 = v.new(nArray, 0);
        int n3 = z.\u00d3O0000(nArray);
        if (n3 == 0) {
            return ac.return(n2);
        }
        Comparable comparable = (Comparable)g2.\u00f800000(ac.return(n2));
        int n4 = 1;
        if (n3 > 0) {
            while (true) {
                int n5;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(ac.return(n5 = v.new(nArray, n4)))) < 0) {
                    n2 = n5;
                    comparable = comparable2;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        return ac.return(n2);
    }

    private static final f \u00d8\u00d20000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = z.nullnew(lArray);
        if (n2 == 0) {
            return f.\u00d4O0000(l2);
        }
        Comparable comparable = (Comparable)g2.\u00f800000(f.\u00d4O0000(l2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                long l3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(f.\u00d4O0000(l3 = nc.o00000(lArray, n3)))) < 0) {
                    l2 = l3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return f.\u00d4O0000(l2);
    }

    private static final lc \u00d2\u00d20000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        byte by = s.o00000(byArray, 0);
        int n2 = z.\u00f6O0000(byArray);
        if (n2 == 0) {
            return lc.\u00d6O0000(by);
        }
        Comparable comparable = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                byte by2;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by2 = s.o00000(byArray, n3)))) < 0) {
                    by = by2;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return lc.\u00d6O0000(by);
    }

    private static final dd \u00d8O0000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 == 0) {
            return dd.\u00d6O0000(s2);
        }
        Comparable comparable = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                short s3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s3 = hc.o00000(sArray, n3)))) < 0) {
                    s2 = s3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return dd.\u00d6O0000(s2);
    }

    private static final double \u00f6\u00d20000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, n2)))).doubleValue();
                d2 = Math.max(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final double \u00d3O0000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))).doubleValue();
                d2 = Math.max(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final double voidsuper(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))).doubleValue();
                d2 = Math.max(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final double OO0000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))).doubleValue();
                d2 = Math.max(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final float intnew(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, n2)))).floatValue();
                f2 = Math.max(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f2;
    }

    private static final float \u00d2O0000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))).floatValue();
                f2 = Math.max(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f2;
    }

    private static final float Oo0000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))).floatValue();
                f2 = Math.max(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f2;
    }

    private static final float \u00f800000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))).floatValue();
                f2 = Math.max(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f2;
    }

    private static final Comparable \u00d6\u00d20000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(ac.return(v.new(nArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(ac.return(v.new(nArray, n2)))) < 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable donew(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)));
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))) < 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable donew(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)));
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))) < 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable \u00f8o0000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))) < 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Double \u00d2O0000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, n2)))).doubleValue();
                d2 = Math.max(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final Double \u00d600000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))).doubleValue();
                d2 = Math.max(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final Double \u00f4O0000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))).doubleValue();
                d2 = Math.max(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final Double \u00d3\u00d20000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))).doubleValue();
                d2 = Math.max(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final Float \u00f8o0000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, n2)))).floatValue();
                f2 = Math.max(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Float.valueOf(f2);
    }

    private static final Float \u00d3\u00d20000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))).floatValue();
                f2 = Math.max(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Float.valueOf(f2);
    }

    private static final Float \u00d6O0000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))).floatValue();
                f2 = Math.max(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Float.valueOf(f2);
    }

    private static final Float \u00f6O0000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))).floatValue();
                f2 = Math.max(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Float.valueOf(f2);
    }

    private static final Comparable \u00d6o0000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(ac.return(v.new(nArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(ac.return(v.new(nArray, n2)))) < 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable publicsuper(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)));
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))) < 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable \u00d3\u00d20000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)));
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))) < 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable Oo0000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))) < 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Object \u00d400000(int[] nArray, Comparator comparator, g g2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        Object object = g2.\u00f800000(ac.return(v.new(nArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(ac.return(v.new(nArray, n2)))) < 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d200000(long[] lArray, Comparator comparator, g g2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        Object object = g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)));
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))) < 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d200000(byte[] byArray, Comparator comparator, g g2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        Object object = g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)));
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))) < 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d200000(short[] sArray, Comparator comparator, g g2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        Object object = g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))) < 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object super(int[] nArray, Comparator comparator, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        Object object = g2.\u00f800000(ac.return(v.new(nArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(ac.return(v.new(nArray, n2)))) < 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d300000(long[] lArray, Comparator comparator, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        Object object = g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)));
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))) < 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d300000(byte[] byArray, Comparator comparator, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        Object object = g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)));
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))) < 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d300000(short[] sArray, Comparator comparator, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        Object object = g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))) < 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    public static final ac \u00d8O0000(int[] nArray) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                int n5;
                if (Integer.compareUnsigned(n2, n5 = v.new(nArray, n3)) < 0) {
                    n2 = n5;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        return ac.return(n2);
    }

    public static final f \u00f600000(long[] lArray) {
        if (nc.o00000(lArray)) {
            return null;
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                long l3;
                if (Long.compareUnsigned(l2, l3 = nc.o00000(lArray, n2)) < 0) {
                    l2 = l3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f.\u00d4O0000(l2);
    }

    public static final lc \u00d6\u00d20000(byte[] byArray) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                byte by2;
                if (fc.o00000(by & 0xFF, (by2 = s.o00000(byArray, n2)) & 0xFF) < 0) {
                    by = by2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return lc.\u00d6O0000(by);
    }

    public static final dd \u00d3o0000(short[] sArray) {
        if (hc.o00000(sArray)) {
            return null;
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                short s3;
                if (fc.o00000(s2 & 0xFFFF, (s3 = hc.o00000(sArray, n2)) & 0xFFFF) < 0) {
                    s2 = s3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return dd.\u00d6O0000(s2);
    }

    public static final int class(int[] nArray, Comparator comparator) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                int n5 = v.new(nArray, n3);
                if (comparator.compare(ac.return(n2), ac.return(n5)) < 0) {
                    n2 = n5;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        return n2;
    }

    public static final long \u00d600000(long[] lArray, Comparator comparator) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                long l3 = nc.o00000(lArray, n2);
                if (comparator.compare(f.\u00d4O0000(l2), f.\u00d4O0000(l3)) < 0) {
                    l2 = l3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return l2;
    }

    public static final byte \u00d400000(byte[] byArray, Comparator comparator) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                byte by2 = s.o00000(byArray, n2);
                if (comparator.compare(lc.\u00d6O0000(by), lc.\u00d6O0000(by2)) < 0) {
                    by = by2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return by;
    }

    public static final short \u00d300000(short[] sArray, Comparator comparator) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                short s3 = hc.o00000(sArray, n2);
                if (comparator.compare(dd.\u00d6O0000(s2), dd.\u00d6O0000(s3)) < 0) {
                    s2 = s3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return s2;
    }

    public static final ac \u00d600000(int[] nArray, Comparator comparator) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                int n5 = v.new(nArray, n3);
                if (comparator.compare(ac.return(n2), ac.return(n5)) < 0) {
                    n2 = n5;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        return ac.return(n2);
    }

    public static final f \u00d400000(long[] lArray, Comparator comparator) {
        if (nc.o00000(lArray)) {
            return null;
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                long l3 = nc.o00000(lArray, n2);
                if (comparator.compare(f.\u00d4O0000(l2), f.\u00d4O0000(l3)) < 0) {
                    l2 = l3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f.\u00d4O0000(l2);
    }

    public static final lc \u00d600000(byte[] byArray, Comparator comparator) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                byte by2 = s.o00000(byArray, n2);
                if (comparator.compare(lc.\u00d6O0000(by), lc.\u00d6O0000(by2)) < 0) {
                    by = by2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return lc.\u00d6O0000(by);
    }

    public static final dd class(short[] sArray, Comparator comparator) {
        if (hc.o00000(sArray)) {
            return null;
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                short s3 = hc.o00000(sArray, n2);
                if (comparator.compare(dd.\u00d6O0000(s2), dd.\u00d6O0000(s3)) < 0) {
                    s2 = s3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return dd.\u00d6O0000(s2);
    }

    public static final int publicsuper(int[] nArray) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                int n5;
                if (Integer.compareUnsigned(n2, n5 = v.new(nArray, n3)) > 0) {
                    n2 = n5;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        return n2;
    }

    public static final long class(long[] lArray) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                long l3;
                if (Long.compareUnsigned(l2, l3 = nc.o00000(lArray, n2)) > 0) {
                    l2 = l3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return l2;
    }

    public static final byte class(byte[] byArray) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                byte by2;
                if (fc.o00000(by & 0xFF, (by2 = s.o00000(byArray, n2)) & 0xFF) > 0) {
                    by = by2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return by;
    }

    public static final short \u00f8O0000(short[] sArray) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                short s3;
                if (fc.o00000(s2 & 0xFFFF, (s3 = hc.o00000(sArray, n2)) & 0xFFFF) > 0) {
                    s2 = s3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return s2;
    }

    private static final int interfacenew(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        int n2 = v.new(nArray, 0);
        int n3 = z.\u00d3O0000(nArray);
        if (n3 == 0) {
            return n2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(ac.return(n2));
        int n4 = 1;
        if (n3 > 0) {
            while (true) {
                int n5;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(ac.return(n5 = v.new(nArray, n4)))) > 0) {
                    n2 = n5;
                    comparable = comparable2;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        return n2;
    }

    private static final long \u00f4O0000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = z.nullnew(lArray);
        if (n2 == 0) {
            return l2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(f.\u00d4O0000(l2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                long l3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(f.\u00d4O0000(l3 = nc.o00000(lArray, n3)))) > 0) {
                    l2 = l3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return l2;
    }

    private static final byte publicsuper(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        byte by = s.o00000(byArray, 0);
        int n2 = z.\u00f6O0000(byArray);
        if (n2 == 0) {
            return by;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                byte by2;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by2 = s.o00000(byArray, n3)))) > 0) {
                    by = by2;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return by;
    }

    private static final short \u00d3O0000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 == 0) {
            return s2;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                short s3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s3 = hc.o00000(sArray, n3)))) > 0) {
                    s2 = s3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return s2;
    }

    private static final ac \u00d2o0000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        int n2 = v.new(nArray, 0);
        int n3 = z.\u00d3O0000(nArray);
        if (n3 == 0) {
            return ac.return(n2);
        }
        Comparable comparable = (Comparable)g2.\u00f800000(ac.return(n2));
        int n4 = 1;
        if (n3 > 0) {
            while (true) {
                int n5;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(ac.return(n5 = v.new(nArray, n4)))) > 0) {
                    n2 = n5;
                    comparable = comparable2;
                }
                if (n4 == n3) break;
                ++n4;
            }
        }
        return ac.return(n2);
    }

    private static final f \u00d4O0000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = z.nullnew(lArray);
        if (n2 == 0) {
            return f.\u00d4O0000(l2);
        }
        Comparable comparable = (Comparable)g2.\u00f800000(f.\u00d4O0000(l2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                long l3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(f.\u00d4O0000(l3 = nc.o00000(lArray, n3)))) > 0) {
                    l2 = l3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return f.\u00d4O0000(l2);
    }

    private static final lc interfacenew(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        byte by = s.o00000(byArray, 0);
        int n2 = z.\u00f6O0000(byArray);
        if (n2 == 0) {
            return lc.\u00d6O0000(by);
        }
        Comparable comparable = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                byte by2;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(lc.\u00d6O0000(by2 = s.o00000(byArray, n3)))) > 0) {
                    by = by2;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return lc.\u00d6O0000(by);
    }

    private static final dd \u00d2O0000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 == 0) {
            return dd.\u00d6O0000(s2);
        }
        Comparable comparable = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s2));
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                short s3;
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(dd.\u00d6O0000(s3 = hc.o00000(sArray, n3)))) > 0) {
                    s2 = s3;
                    comparable = comparable2;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return dd.\u00d6O0000(s2);
    }

    private static final double \u00d3\u00d20000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, n2)))).doubleValue();
                d2 = Math.min(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final double O\u00d30000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))).doubleValue();
                d2 = Math.min(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final double \u00d3O0000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))).doubleValue();
                d2 = Math.min(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final double interfacenew(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        double d2 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))).doubleValue();
                d2 = Math.min(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final float \u00d2\u00d20000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, n2)))).floatValue();
                f2 = Math.min(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f2;
    }

    private static final float \u00f8\u00d20000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))).floatValue();
                f2 = Math.min(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f2;
    }

    private static final float \u00d2O0000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))).floatValue();
                f2 = Math.min(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f2;
    }

    private static final float \u00d4\u00d30000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        float f2 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))).floatValue();
                f2 = Math.min(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f2;
    }

    private static final Comparable \u00d600000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(ac.return(v.new(nArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(ac.return(v.new(nArray, n2)))) > 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable int(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)));
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))) > 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable OO0000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)));
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))) > 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable \u00d800000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))) > 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Double Oo0000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, n2)))).doubleValue();
                d2 = Math.min(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final Double \u00d800000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))).doubleValue();
                d2 = Math.min(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final Double Objectsuper(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))).doubleValue();
                d2 = Math.min(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final Double \u00d4\u00d20000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        double d2 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)))).doubleValue();
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                double d3 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))).doubleValue();
                d2 = Math.min(d2, d3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return d2;
    }

    private static final Float \u00d2\u00d30000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(ac.return(v.new(nArray, n2)))).floatValue();
                f2 = Math.min(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Float.valueOf(f2);
    }

    private static final Float do(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))).floatValue();
                f2 = Math.min(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Float.valueOf(f2);
    }

    private static final Float \u00f8o0000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))).floatValue();
                f2 = Math.min(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Float.valueOf(f2);
    }

    private static final Float \u00f4\u00d20000(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        float f2 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)))).floatValue();
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                float f3 = ((Number)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))).floatValue();
                f2 = Math.min(f2, f3);
                if (n2 == n3) break;
                ++n2;
            }
        }
        return Float.valueOf(f2);
    }

    private static final Comparable \u00f4\u00d20000(int[] nArray, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(ac.return(v.new(nArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(ac.return(v.new(nArray, n2)))) > 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable \u00d2\u00d30000(long[] lArray, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)));
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))) > 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable \u00d600000(byte[] byArray, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)));
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))) > 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Comparable classnew(short[] sArray, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        Comparable comparable = (Comparable)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                Comparable comparable2;
                if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))) > 0) {
                    comparable = comparable2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return comparable;
    }

    private static final Object \u00d200000(int[] nArray, Comparator comparator, g g2) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        Object object = g2.\u00f800000(ac.return(v.new(nArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(ac.return(v.new(nArray, n2)))) > 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d400000(long[] lArray, Comparator comparator, g g2) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        Object object = g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)));
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))) > 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d400000(byte[] byArray, Comparator comparator, g g2) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        Object object = g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)));
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))) > 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d400000(short[] sArray, Comparator comparator, g g2) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        Object object = g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))) > 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object \u00d300000(int[] nArray, Comparator comparator, g g2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        Object object = g2.\u00f800000(ac.return(v.new(nArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3O0000(nArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(ac.return(v.new(nArray, n2)))) > 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object super(long[] lArray, Comparator comparator, g g2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        Object object = g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, 0)));
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(f.\u00d4O0000(nc.o00000(lArray, n2)))) > 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object super(byte[] byArray, Comparator comparator, g g2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        Object object = g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, 0)));
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(lc.\u00d6O0000(s.o00000(byArray, n2)))) > 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    private static final Object super(short[] sArray, Comparator comparator, g g2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        Object object = g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, 0)));
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                Object object2;
                if (comparator.compare(object, object2 = g2.\u00f800000(dd.\u00d6O0000(hc.o00000(sArray, n2)))) > 0) {
                    object = object2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return object;
    }

    public static final ac \u00d600000(int[] nArray) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                int n5;
                if (Integer.compareUnsigned(n2, n5 = v.new(nArray, n3)) > 0) {
                    n2 = n5;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        return ac.return(n2);
    }

    public static final f do(long[] lArray) {
        if (nc.o00000(lArray)) {
            return null;
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                long l3;
                if (Long.compareUnsigned(l2, l3 = nc.o00000(lArray, n2)) > 0) {
                    l2 = l3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f.\u00d4O0000(l2);
    }

    public static final lc intnew(byte[] byArray) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                byte by2;
                if (fc.o00000(by & 0xFF, (by2 = s.o00000(byArray, n2)) & 0xFF) > 0) {
                    by = by2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return lc.\u00d6O0000(by);
    }

    public static final dd \u00f800000(short[] sArray) {
        if (hc.o00000(sArray)) {
            return null;
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                short s3;
                if (fc.o00000(s2 & 0xFFFF, (s3 = hc.o00000(sArray, n2)) & 0xFFFF) > 0) {
                    s2 = s3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return dd.\u00d6O0000(s2);
    }

    public static final int \u00d300000(int[] nArray, Comparator comparator) {
        if (v.\u00d500000(nArray)) {
            throw new NoSuchElementException();
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                int n5 = v.new(nArray, n3);
                if (comparator.compare(ac.return(n2), ac.return(n5)) > 0) {
                    n2 = n5;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        return n2;
    }

    public static final long class(long[] lArray, Comparator comparator) {
        if (nc.o00000(lArray)) {
            throw new NoSuchElementException();
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                long l3 = nc.o00000(lArray, n2);
                if (comparator.compare(f.\u00d4O0000(l2), f.\u00d4O0000(l3)) > 0) {
                    l2 = l3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return l2;
    }

    public static final byte \u00d300000(byte[] byArray, Comparator comparator) {
        if (s.\u00d500000(byArray)) {
            throw new NoSuchElementException();
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                byte by2 = s.o00000(byArray, n2);
                if (comparator.compare(lc.\u00d6O0000(by), lc.\u00d6O0000(by2)) > 0) {
                    by = by2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return by;
    }

    public static final short \u00d600000(short[] sArray, Comparator comparator) {
        if (hc.o00000(sArray)) {
            throw new NoSuchElementException();
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                short s3 = hc.o00000(sArray, n2);
                if (comparator.compare(dd.\u00d6O0000(s2), dd.\u00d6O0000(s3)) > 0) {
                    s2 = s3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return s2;
    }

    public static final ac \u00d400000(int[] nArray, Comparator comparator) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                int n5 = v.new(nArray, n3);
                if (comparator.compare(ac.return(n2), ac.return(n5)) > 0) {
                    n2 = n5;
                }
                if (n3 == n4) break;
                ++n3;
            }
        }
        return ac.return(n2);
    }

    public static final f \u00d300000(long[] lArray, Comparator comparator) {
        if (nc.o00000(lArray)) {
            return null;
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                long l3 = nc.o00000(lArray, n2);
                if (comparator.compare(f.\u00d4O0000(l2), f.\u00d4O0000(l3)) > 0) {
                    l2 = l3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f.\u00d4O0000(l2);
    }

    public static final lc class(byte[] byArray, Comparator comparator) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                byte by2 = s.o00000(byArray, n2);
                if (comparator.compare(lc.\u00d6O0000(by), lc.\u00d6O0000(by2)) > 0) {
                    by = by2;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return lc.\u00d6O0000(by);
    }

    public static final dd \u00d400000(short[] sArray, Comparator comparator) {
        if (hc.o00000(sArray)) {
            return null;
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                short s3 = hc.o00000(sArray, n2);
                if (comparator.compare(dd.\u00d6O0000(s2), dd.\u00d6O0000(s3)) > 0) {
                    s2 = s3;
                }
                if (n2 == n3) break;
                ++n2;
            }
        }
        return dd.\u00d6O0000(s2);
    }

    private static final boolean voidsuper(int[] nArray) {
        return v.\u00d500000(nArray);
    }

    private static final boolean \u00d4\u00d20000(long[] lArray) {
        return nc.o00000(lArray);
    }

    private static final boolean \u00d4o0000(byte[] byArray) {
        return s.\u00d500000(byArray);
    }

    private static final boolean \u00d3O0000(short[] sArray) {
        return hc.o00000(sArray);
    }

    private static final boolean publicsuper(int[] nArray, g g2) {
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            if (!((Boolean)g2.\u00f800000(ac.return(n3))).booleanValue()) continue;
            return false;
        }
        return true;
    }

    private static final boolean interfacenew(long[] lArray, g g2) {
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            if (!((Boolean)g2.\u00f800000(f.\u00d4O0000(l2))).booleanValue()) continue;
            return false;
        }
        return true;
    }

    private static final boolean int(byte[] byArray, g g2) {
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            if (!((Boolean)g2.\u00f800000(lc.\u00d6O0000(by))).booleanValue()) continue;
            return false;
        }
        return true;
    }

    private static final boolean \u00f8\u00d20000(short[] sArray, g g2) {
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            if (!((Boolean)g2.\u00f800000(dd.\u00d6O0000(s2))).booleanValue()) continue;
            return false;
        }
        return true;
    }

    private static final int[] do(int[] nArray, g g2) {
        int[] nArray2 = nArray;
        int n2 = v.\u00d300000(nArray2);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray2, i2);
            g2.\u00f800000(ac.return(n3));
        }
        return nArray;
    }

    private static final long[] \u00d6\u00d20000(long[] lArray, g g2) {
        long[] lArray2 = lArray;
        int n2 = nc.\u00d500000(lArray2);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray2, i2);
            g2.\u00f800000(f.\u00d4O0000(l2));
        }
        return lArray;
    }

    private static final byte[] \u00d4O0000(byte[] byArray, g g2) {
        byte[] byArray2 = byArray;
        int n2 = s.o00000(byArray2);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray2, i2);
            g2.\u00f800000(lc.\u00d6O0000(by));
        }
        return byArray;
    }

    private static final short[] \u00d4O0000(short[] sArray, g g2) {
        short[] sArray2 = sArray;
        int n2 = hc.\u00d400000(sArray2);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray2, i2);
            g2.\u00f800000(dd.\u00d6O0000(s2));
        }
        return sArray;
    }

    private static final int[] \u00f400000(int[] nArray, b.o.e.f f2) {
        int[] nArray2 = nArray;
        int n2 = 0;
        int n3 = v.\u00d300000(nArray2);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray2, i2);
            f2.o00000(n2++, ac.return(n4));
        }
        return nArray;
    }

    private static final long[] \u00d300000(long[] lArray, b.o.e.f f2) {
        long[] lArray2 = lArray;
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray2);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray2, i2);
            f2.o00000(n2++, f.\u00d4O0000(l2));
        }
        return lArray;
    }

    private static final byte[] class(byte[] byArray, b.o.e.f f2) {
        byte[] byArray2 = byArray;
        int n2 = 0;
        int n3 = s.o00000(byArray2);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray2, i2);
            f2.o00000(n2++, lc.\u00d6O0000(by));
        }
        return byArray;
    }

    private static final short[] int(short[] sArray, b.o.e.f f2) {
        short[] sArray2 = sArray;
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray2);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray2, i2);
            f2.o00000(n2++, dd.\u00d6O0000(s2));
        }
        return sArray;
    }

    private static final int int(int[] nArray, b.o.e.f f2) {
        if (v.\u00d500000(nArray)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                n2 = ((ac)f2.o00000(ac.return(n2), ac.return(v.new(nArray, n3)))).o00000();
                if (n3 == n4) break;
                ++n3;
            }
        }
        return n2;
    }

    private static final long \u00d800000(long[] lArray, b.o.e.f f2) {
        if (nc.o00000(lArray)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                l2 = ((f)f2.o00000(f.\u00d4O0000(l2), f.\u00d4O0000(nc.o00000(lArray, n2)))).super();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return l2;
    }

    private static final byte \u00d200000(byte[] byArray, b.o.e.f f2) {
        if (s.\u00d500000(byArray)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                by = ((lc)f2.o00000(lc.\u00d6O0000(by), lc.\u00d6O0000(s.o00000(byArray, n2)))).super();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return by;
    }

    private static final short \u00d300000(short[] sArray, b.o.e.f f2) {
        if (hc.o00000(sArray)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                s2 = ((dd)f2.o00000(dd.\u00d6O0000(s2), dd.\u00d6O0000(hc.o00000(sArray, n2)))).o00000();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return s2;
    }

    private static final int \u00d200000(int[] nArray, e e2) {
        if (v.\u00d500000(nArray)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                n2 = ((ac)e2.o00000(n3, ac.return(n2), ac.return(v.new(nArray, n3)))).o00000();
                if (n3 == n4) break;
                ++n3;
            }
        }
        return n2;
    }

    private static final long super(long[] lArray, e e2) {
        if (nc.o00000(lArray)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                l2 = ((f)e2.o00000(n2, f.\u00d4O0000(l2), f.\u00d4O0000(nc.o00000(lArray, n2)))).super();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return l2;
    }

    private static final byte \u00d300000(byte[] byArray, e e2) {
        if (s.\u00d500000(byArray)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                by = ((lc)e2.o00000(n2, lc.\u00d6O0000(by), lc.\u00d6O0000(s.o00000(byArray, n2)))).super();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return by;
    }

    private static final short super(short[] sArray, e e2) {
        if (hc.o00000(sArray)) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                s2 = ((dd)e2.o00000(n2, dd.\u00d6O0000(s2), dd.\u00d6O0000(hc.o00000(sArray, n2)))).o00000();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return s2;
    }

    private static final ac class(int[] nArray, e e2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                n2 = ((ac)e2.o00000(n3, ac.return(n2), ac.return(v.new(nArray, n3)))).o00000();
                if (n3 == n4) break;
                ++n3;
            }
        }
        return ac.return(n2);
    }

    private static final f \u00d300000(long[] lArray, e e2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                l2 = ((f)e2.o00000(n2, f.\u00d4O0000(l2), f.\u00d4O0000(nc.o00000(lArray, n2)))).super();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f.\u00d4O0000(l2);
    }

    private static final lc \u00d200000(byte[] byArray, e e2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                by = ((lc)e2.o00000(n2, lc.\u00d6O0000(by), lc.\u00d6O0000(s.o00000(byArray, n2)))).super();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return lc.\u00d6O0000(by);
    }

    private static final dd \u00d200000(short[] sArray, e e2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                s2 = ((dd)e2.o00000(n2, dd.\u00d6O0000(s2), dd.\u00d6O0000(hc.o00000(sArray, n2)))).o00000();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return dd.\u00d6O0000(s2);
    }

    private static final ac \u00d200000(int[] nArray, b.o.e.f f2) {
        if (v.\u00d500000(nArray)) {
            return null;
        }
        int n2 = v.new(nArray, 0);
        int n3 = 1;
        int n4 = z.\u00d3O0000(nArray);
        if (n4 > 0) {
            while (true) {
                n2 = ((ac)f2.o00000(ac.return(n2), ac.return(v.new(nArray, n3)))).o00000();
                if (n3 == n4) break;
                ++n3;
            }
        }
        return ac.return(n2);
    }

    private static final f \u00d400000(long[] lArray, b.o.e.f f2) {
        if (nc.o00000(lArray)) {
            return null;
        }
        long l2 = nc.o00000(lArray, 0);
        int n2 = 1;
        int n3 = z.nullnew(lArray);
        if (n3 > 0) {
            while (true) {
                l2 = ((f)f2.o00000(f.\u00d4O0000(l2), f.\u00d4O0000(nc.o00000(lArray, n2)))).super();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return f.\u00d4O0000(l2);
    }

    private static final lc super(byte[] byArray, b.o.e.f f2) {
        if (s.\u00d500000(byArray)) {
            return null;
        }
        byte by = s.o00000(byArray, 0);
        int n2 = 1;
        int n3 = z.\u00f6O0000(byArray);
        if (n3 > 0) {
            while (true) {
                by = ((lc)f2.o00000(lc.\u00d6O0000(by), lc.\u00d6O0000(s.o00000(byArray, n2)))).super();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return lc.\u00d6O0000(by);
    }

    private static final dd super(short[] sArray, b.o.e.f f2) {
        if (hc.o00000(sArray)) {
            return null;
        }
        short s2 = hc.o00000(sArray, 0);
        int n2 = 1;
        int n3 = z.\u00d3\u00d30000(sArray);
        if (n3 > 0) {
            while (true) {
                s2 = ((dd)f2.o00000(dd.\u00d6O0000(s2), dd.\u00d6O0000(hc.o00000(sArray, n2)))).o00000();
                if (n2 == n3) break;
                ++n2;
            }
        }
        return dd.\u00d6O0000(s2);
    }

    private static final int super(int[] nArray, b.o.e.f f2) {
        int n2 = z.\u00d3O0000(nArray);
        if (n2 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int n3 = v.new(nArray, n2--);
        while (n2 >= 0) {
            n3 = ((ac)f2.o00000(ac.return(v.new(nArray, n2--)), ac.return(n3))).o00000();
        }
        return n3;
    }

    private static final long super(long[] lArray, b.o.e.f f2) {
        int n2 = z.nullnew(lArray);
        if (n2 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long l2 = nc.o00000(lArray, n2--);
        while (n2 >= 0) {
            l2 = ((f)f2.o00000(f.\u00d4O0000(nc.o00000(lArray, n2--)), f.\u00d4O0000(l2))).super();
        }
        return l2;
    }

    private static final byte int(byte[] byArray, b.o.e.f f2) {
        int n2 = z.\u00f6O0000(byArray);
        if (n2 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte by = s.o00000(byArray, n2--);
        while (n2 >= 0) {
            by = ((lc)f2.o00000(lc.\u00d6O0000(s.o00000(byArray, n2--)), lc.\u00d6O0000(by))).super();
        }
        return by;
    }

    private static final short class(short[] sArray, b.o.e.f f2) {
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s2 = hc.o00000(sArray, n2--);
        while (n2 >= 0) {
            s2 = ((dd)f2.o00000(dd.\u00d6O0000(hc.o00000(sArray, n2--)), dd.\u00d6O0000(s2))).o00000();
        }
        return s2;
    }

    private static final int super(int[] nArray, e e2) {
        int n2 = z.\u00d3O0000(nArray);
        if (n2 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int n3 = v.new(nArray, n2--);
        while (n2 >= 0) {
            n3 = ((ac)e2.o00000(n2, ac.return(v.new(nArray, n2)), ac.return(n3))).o00000();
            --n2;
        }
        return n3;
    }

    private static final long class(long[] lArray, e e2) {
        int n2 = z.nullnew(lArray);
        if (n2 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        long l2 = nc.o00000(lArray, n2--);
        while (n2 >= 0) {
            l2 = ((f)e2.o00000(n2, f.\u00d4O0000(nc.o00000(lArray, n2)), f.\u00d4O0000(l2))).super();
            --n2;
        }
        return l2;
    }

    private static final byte super(byte[] byArray, e e2) {
        int n2 = z.\u00f6O0000(byArray);
        if (n2 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        byte by = s.o00000(byArray, n2--);
        while (n2 >= 0) {
            by = ((lc)e2.o00000(n2, lc.\u00d6O0000(s.o00000(byArray, n2)), lc.\u00d6O0000(by))).super();
            --n2;
        }
        return by;
    }

    private static final short \u00d400000(short[] sArray, e e2) {
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 < 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        short s2 = hc.o00000(sArray, n2--);
        while (n2 >= 0) {
            s2 = ((dd)e2.o00000(n2, dd.\u00d6O0000(hc.o00000(sArray, n2)), dd.\u00d6O0000(s2))).o00000();
            --n2;
        }
        return s2;
    }

    private static final ac \u00d400000(int[] nArray, e e2) {
        int n2 = z.\u00d3O0000(nArray);
        if (n2 < 0) {
            return null;
        }
        int n3 = v.new(nArray, n2--);
        while (n2 >= 0) {
            n3 = ((ac)e2.o00000(n2, ac.return(v.new(nArray, n2)), ac.return(n3))).o00000();
            --n2;
        }
        return ac.return(n3);
    }

    private static final f \u00d200000(long[] lArray, e e2) {
        int n2 = z.nullnew(lArray);
        if (n2 < 0) {
            return null;
        }
        long l2 = nc.o00000(lArray, n2--);
        while (n2 >= 0) {
            l2 = ((f)e2.o00000(n2, f.\u00d4O0000(nc.o00000(lArray, n2)), f.\u00d4O0000(l2))).super();
            --n2;
        }
        return f.\u00d4O0000(l2);
    }

    private static final lc \u00d400000(byte[] byArray, e e2) {
        int n2 = z.\u00f6O0000(byArray);
        if (n2 < 0) {
            return null;
        }
        byte by = s.o00000(byArray, n2--);
        while (n2 >= 0) {
            by = ((lc)e2.o00000(n2, lc.\u00d6O0000(s.o00000(byArray, n2)), lc.\u00d6O0000(by))).super();
            --n2;
        }
        return lc.\u00d6O0000(by);
    }

    private static final dd \u00d300000(short[] sArray, e e2) {
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 < 0) {
            return null;
        }
        short s2 = hc.o00000(sArray, n2--);
        while (n2 >= 0) {
            s2 = ((dd)e2.o00000(n2, dd.\u00d6O0000(hc.o00000(sArray, n2)), dd.\u00d6O0000(s2))).o00000();
            --n2;
        }
        return dd.\u00d6O0000(s2);
    }

    private static final ac \u00d400000(int[] nArray, b.o.e.f f2) {
        int n2 = z.\u00d3O0000(nArray);
        if (n2 < 0) {
            return null;
        }
        int n3 = v.new(nArray, n2--);
        while (n2 >= 0) {
            n3 = ((ac)f2.o00000(ac.return(v.new(nArray, n2--)), ac.return(n3))).o00000();
        }
        return ac.return(n3);
    }

    private static final f \u00d200000(long[] lArray, b.o.e.f f2) {
        int n2 = z.nullnew(lArray);
        if (n2 < 0) {
            return null;
        }
        long l2 = nc.o00000(lArray, n2--);
        while (n2 >= 0) {
            l2 = ((f)f2.o00000(f.\u00d4O0000(nc.o00000(lArray, n2--)), f.\u00d4O0000(l2))).super();
        }
        return f.\u00d4O0000(l2);
    }

    private static final lc \u00f600000(byte[] byArray, b.o.e.f f2) {
        int n2 = z.\u00f6O0000(byArray);
        if (n2 < 0) {
            return null;
        }
        byte by = s.o00000(byArray, n2--);
        while (n2 >= 0) {
            by = ((lc)f2.o00000(lc.\u00d6O0000(s.o00000(byArray, n2--)), lc.\u00d6O0000(by))).super();
        }
        return lc.\u00d6O0000(by);
    }

    private static final dd \u00d200000(short[] sArray, b.o.e.f f2) {
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 < 0) {
            return null;
        }
        short s2 = hc.o00000(sArray, n2--);
        while (n2 >= 0) {
            s2 = ((dd)f2.o00000(dd.\u00d6O0000(hc.o00000(sArray, n2--)), dd.\u00d6O0000(s2))).o00000();
        }
        return dd.\u00d6O0000(s2);
    }

    private static final List super(int[] nArray, Object object, b.o.e.f f2) {
        if (v.\u00d500000(nArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(v.\u00d300000(nArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            object2 = f2.o00000(object2, ac.return(n3));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d400000(long[] lArray, Object object, b.o.e.f f2) {
        if (nc.o00000(lArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(nc.\u00d500000(lArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            object2 = f2.o00000(object2, f.\u00d4O0000(l2));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List super(byte[] byArray, Object object, b.o.e.f f2) {
        if (s.\u00d500000(byArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(s.o00000(byArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            object2 = f2.o00000(object2, lc.\u00d6O0000(by));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d400000(short[] sArray, Object object, b.o.e.f f2) {
        if (hc.o00000(sArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(hc.\u00d400000(sArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            object2 = f2.o00000(object2, dd.\u00d6O0000(s2));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d200000(int[] nArray, Object object, e e2) {
        if (v.\u00d500000(nArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(v.\u00d300000(nArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = e2.o00000(i2, object2, ac.return(v.new(nArray, i2)));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List super(long[] lArray, Object object, e e2) {
        if (nc.o00000(lArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(nc.\u00d500000(lArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = e2.o00000(i2, object2, f.\u00d4O0000(nc.o00000(lArray, i2)));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d300000(byte[] byArray, Object object, e e2) {
        if (s.\u00d500000(byArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(s.o00000(byArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = e2.o00000(i2, object2, lc.\u00d6O0000(s.o00000(byArray, i2)));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d200000(short[] sArray, Object object, e e2) {
        if (hc.o00000(sArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(hc.\u00d400000(sArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = e2.o00000(i2, object2, dd.\u00d6O0000(hc.o00000(sArray, i2)));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d800000(int[] nArray, b.o.e.f f2) {
        if (v.\u00d500000(nArray)) {
            return mc.\u00d500000();
        }
        int n2 = v.new(nArray, 0);
        ArrayList<ac> arrayList = new ArrayList<ac>(v.\u00d300000(nArray));
        arrayList.add(ac.return(n2));
        ArrayList<ac> arrayList2 = arrayList;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 1; i2 < n3; ++i2) {
            n2 = ((ac)f2.o00000(ac.return(n2), ac.return(v.new(nArray, i2)))).o00000();
            arrayList2.add(ac.return(n2));
        }
        return arrayList2;
    }

    private static final List int(long[] lArray, b.o.e.f f2) {
        if (nc.o00000(lArray)) {
            return mc.\u00d500000();
        }
        long l2 = nc.o00000(lArray, 0);
        ArrayList<f> arrayList = new ArrayList<f>(nc.\u00d500000(lArray));
        arrayList.add(f.\u00d4O0000(l2));
        ArrayList<f> arrayList2 = arrayList;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 1; i2 < n2; ++i2) {
            l2 = ((f)f2.o00000(f.\u00d4O0000(l2), f.\u00d4O0000(nc.o00000(lArray, i2)))).super();
            arrayList2.add(f.\u00d4O0000(l2));
        }
        return arrayList2;
    }

    private static final List \u00f400000(byte[] byArray, b.o.e.f f2) {
        if (s.\u00d500000(byArray)) {
            return mc.\u00d500000();
        }
        byte by = s.o00000(byArray, 0);
        ArrayList<lc> arrayList = new ArrayList<lc>(s.o00000(byArray));
        arrayList.add(lc.\u00d6O0000(by));
        ArrayList<lc> arrayList2 = arrayList;
        int n2 = s.o00000(byArray);
        for (int i2 = 1; i2 < n2; ++i2) {
            by = ((lc)f2.o00000(lc.\u00d6O0000(by), lc.\u00d6O0000(s.o00000(byArray, i2)))).super();
            arrayList2.add(lc.\u00d6O0000(by));
        }
        return arrayList2;
    }

    private static final List \u00f600000(short[] sArray, b.o.e.f f2) {
        if (hc.o00000(sArray)) {
            return mc.\u00d500000();
        }
        short s2 = hc.o00000(sArray, 0);
        ArrayList<dd> arrayList = new ArrayList<dd>(hc.\u00d400000(sArray));
        arrayList.add(dd.\u00d6O0000(s2));
        ArrayList<dd> arrayList2 = arrayList;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 1; i2 < n2; ++i2) {
            s2 = ((dd)f2.o00000(dd.\u00d6O0000(s2), dd.\u00d6O0000(hc.o00000(sArray, i2)))).o00000();
            arrayList2.add(dd.\u00d6O0000(s2));
        }
        return arrayList2;
    }

    private static final List \u00d300000(int[] nArray, e e2) {
        if (v.\u00d500000(nArray)) {
            return mc.\u00d500000();
        }
        int n2 = v.new(nArray, 0);
        ArrayList<ac> arrayList = new ArrayList<ac>(v.\u00d300000(nArray));
        arrayList.add(ac.return(n2));
        ArrayList<ac> arrayList2 = arrayList;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 1; i2 < n3; ++i2) {
            n2 = ((ac)e2.o00000(i2, ac.return(n2), ac.return(v.new(nArray, i2)))).o00000();
            arrayList2.add(ac.return(n2));
        }
        return arrayList2;
    }

    private static final List \u00d400000(long[] lArray, e e2) {
        if (nc.o00000(lArray)) {
            return mc.\u00d500000();
        }
        long l2 = nc.o00000(lArray, 0);
        ArrayList<f> arrayList = new ArrayList<f>(nc.\u00d500000(lArray));
        arrayList.add(f.\u00d4O0000(l2));
        ArrayList<f> arrayList2 = arrayList;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 1; i2 < n2; ++i2) {
            l2 = ((f)e2.o00000(i2, f.\u00d4O0000(l2), f.\u00d4O0000(nc.o00000(lArray, i2)))).super();
            arrayList2.add(f.\u00d4O0000(l2));
        }
        return arrayList2;
    }

    private static final List class(byte[] byArray, e e2) {
        if (s.\u00d500000(byArray)) {
            return mc.\u00d500000();
        }
        byte by = s.o00000(byArray, 0);
        ArrayList<lc> arrayList = new ArrayList<lc>(s.o00000(byArray));
        arrayList.add(lc.\u00d6O0000(by));
        ArrayList<lc> arrayList2 = arrayList;
        int n2 = s.o00000(byArray);
        for (int i2 = 1; i2 < n2; ++i2) {
            by = ((lc)e2.o00000(i2, lc.\u00d6O0000(by), lc.\u00d6O0000(s.o00000(byArray, i2)))).super();
            arrayList2.add(lc.\u00d6O0000(by));
        }
        return arrayList2;
    }

    private static final List class(short[] sArray, e e2) {
        if (hc.o00000(sArray)) {
            return mc.\u00d500000();
        }
        short s2 = hc.o00000(sArray, 0);
        ArrayList<dd> arrayList = new ArrayList<dd>(hc.\u00d400000(sArray));
        arrayList.add(dd.\u00d6O0000(s2));
        ArrayList<dd> arrayList2 = arrayList;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 1; i2 < n2; ++i2) {
            s2 = ((dd)e2.o00000(i2, dd.\u00d6O0000(s2), dd.\u00d6O0000(hc.o00000(sArray, i2)))).o00000();
            arrayList2.add(dd.\u00d6O0000(s2));
        }
        return arrayList2;
    }

    private static final List \u00d400000(int[] nArray, Object object, b.o.e.f f2) {
        if (v.\u00d500000(nArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(v.\u00d300000(nArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            object2 = f2.o00000(object2, ac.return(n3));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d200000(long[] lArray, Object object, b.o.e.f f2) {
        if (nc.o00000(lArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(nc.\u00d500000(lArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            object2 = f2.o00000(object2, f.\u00d4O0000(l2));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d400000(byte[] byArray, Object object, b.o.e.f f2) {
        if (s.\u00d500000(byArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(s.o00000(byArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            object2 = f2.o00000(object2, lc.\u00d6O0000(by));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d200000(short[] sArray, Object object, b.o.e.f f2) {
        if (hc.o00000(sArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(hc.\u00d400000(sArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            object2 = f2.o00000(object2, dd.\u00d6O0000(s2));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d300000(int[] nArray, Object object, e e2) {
        if (v.\u00d500000(nArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(v.\u00d300000(nArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = e2.o00000(i2, object2, ac.return(v.new(nArray, i2)));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d300000(long[] lArray, Object object, e e2) {
        if (nc.o00000(lArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(nc.\u00d500000(lArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = e2.o00000(i2, object2, f.\u00d4O0000(nc.o00000(lArray, i2)));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d400000(byte[] byArray, Object object, e e2) {
        if (s.\u00d500000(byArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(s.o00000(byArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = e2.o00000(i2, object2, lc.\u00d6O0000(s.o00000(byArray, i2)));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final List \u00d300000(short[] sArray, Object object, e e2) {
        if (hc.o00000(sArray)) {
            return mc.o00000(object);
        }
        Object object2 = new ArrayList<Object>(hc.\u00d400000(sArray) + 1);
        ((ArrayList)object2).add(object);
        ArrayList<Object> arrayList = object2;
        object2 = object;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            object2 = e2.o00000(i2, object2, dd.\u00d6O0000(hc.o00000(sArray, i2)));
            arrayList.add(object2);
        }
        return arrayList;
    }

    private static final int \u00f8O0000(int[] nArray, g g2) {
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(ac.return(n4))).o00000());
        }
        return n2;
    }

    private static final int \u00d8o0000(long[] lArray, g g2) {
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(f.\u00d4O0000(l2))).o00000());
        }
        return n2;
    }

    private static final int \u00f8\u00d20000(byte[] byArray, g g2) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray, i2);
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(lc.\u00d6O0000(by))).o00000());
        }
        return n2;
    }

    private static final int publicsuper(short[] sArray, g g2) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(dd.\u00d6O0000(s2))).o00000());
        }
        return n2;
    }

    private static final double \u00d3o0000(int[] nArray, g g2) {
        double d2 = 0.0;
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            d2 += ((Number)g2.\u00f800000(ac.return(n3))).doubleValue();
        }
        return d2;
    }

    private static final double \u00f4\u00d20000(long[] lArray, g g2) {
        double d2 = 0.0;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            d2 += ((Number)g2.\u00f800000(f.\u00d4O0000(l2))).doubleValue();
        }
        return d2;
    }

    private static final double \u00d3\u00d30000(byte[] byArray, g g2) {
        double d2 = 0.0;
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            d2 += ((Number)g2.\u00f800000(lc.\u00d6O0000(by))).doubleValue();
        }
        return d2;
    }

    private static final double supernew(short[] sArray, g g2) {
        double d2 = 0.0;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            d2 += ((Number)g2.\u00f800000(dd.\u00d6O0000(s2))).doubleValue();
        }
        return d2;
    }

    private static final double floatsuper(int[] nArray, g g2) {
        double d2 = 0.0;
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            d2 += ((Number)g2.\u00f800000(ac.return(n3))).doubleValue();
        }
        return d2;
    }

    private static final double \u00f6\u00d20000(long[] lArray, g g2) {
        double d2 = 0.0;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            d2 += ((Number)g2.\u00f800000(f.\u00d4O0000(l2))).doubleValue();
        }
        return d2;
    }

    private static final double \u00f8O0000(byte[] byArray, g g2) {
        double d2 = 0.0;
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            d2 += ((Number)g2.\u00f800000(lc.\u00d6O0000(by))).doubleValue();
        }
        return d2;
    }

    private static final double O\u00d30000(short[] sArray, g g2) {
        double d2 = 0.0;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            d2 += ((Number)g2.\u00f800000(dd.\u00d6O0000(s2))).doubleValue();
        }
        return d2;
    }

    private static final int OO0000(int[] nArray, g g2) {
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            n2 += ((Number)g2.\u00f800000(ac.return(n4))).intValue();
        }
        return n2;
    }

    private static final int \u00d4o0000(long[] lArray, g g2) {
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            n2 += ((Number)g2.\u00f800000(f.\u00d4O0000(l2))).intValue();
        }
        return n2;
    }

    private static final int \u00d4\u00d30000(byte[] byArray, g g2) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray, i2);
            n2 += ((Number)g2.\u00f800000(lc.\u00d6O0000(by))).intValue();
        }
        return n2;
    }

    private static final int \u00f8O0000(short[] sArray, g g2) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            n2 += ((Number)g2.\u00f800000(dd.\u00d6O0000(s2))).intValue();
        }
        return n2;
    }

    private static final long \u00d800000(int[] nArray, g g2) {
        long l2 = 0L;
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            l2 += ((Number)g2.\u00f800000(ac.return(n3))).longValue();
        }
        return l2;
    }

    private static final long voidsuper(long[] lArray, g g2) {
        long l2 = 0L;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l3 = nc.o00000(lArray, i2);
            l2 += ((Number)g2.\u00f800000(f.\u00d4O0000(l3))).longValue();
        }
        return l2;
    }

    private static final long supernew(byte[] byArray, g g2) {
        long l2 = 0L;
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            l2 += ((Number)g2.\u00f800000(lc.\u00d6O0000(by))).longValue();
        }
        return l2;
    }

    private static final long Objectsuper(short[] sArray, g g2) {
        long l2 = 0L;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            l2 += ((Number)g2.\u00f800000(dd.\u00d6O0000(s2))).longValue();
        }
        return l2;
    }

    private static final int \u00d8\u00d20000(int[] nArray, g g2) {
        int n2 = 0;
        int n3 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = v.new(nArray, i2);
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(ac.return(n4))).o00000());
        }
        return n2;
    }

    private static final int \u00f600000(long[] lArray, g g2) {
        int n2 = 0;
        int n3 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = nc.o00000(lArray, i2);
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(f.\u00d4O0000(l2))).o00000());
        }
        return n2;
    }

    private static final int \u00d4o0000(byte[] byArray, g g2) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = s.o00000(byArray, i2);
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(lc.\u00d6O0000(by))).o00000());
        }
        return n2;
    }

    private static final int \u00f400000(short[] sArray, g g2) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            n2 = ac.\u00d500000(n2 + ((ac)g2.\u00f800000(dd.\u00d6O0000(s2))).o00000());
        }
        return n2;
    }

    private static final long \u00d4\u00d20000(int[] nArray, g g2) {
        long l2 = 0L;
        int n2 = v.\u00d300000(nArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray, i2);
            l2 = f.super(l2 + ((f)g2.\u00f800000(ac.return(n3))).super());
        }
        return l2;
    }

    private static final long class(long[] lArray, g g2) {
        long l2 = 0L;
        int n2 = nc.\u00d500000(lArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l3 = nc.o00000(lArray, i2);
            l2 = f.super(l2 + ((f)g2.\u00f800000(f.\u00d4O0000(l3))).super());
        }
        return l2;
    }

    private static final long floatsuper(byte[] byArray, g g2) {
        long l2 = 0L;
        int n2 = s.o00000(byArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray, i2);
            l2 = f.super(l2 + ((f)g2.\u00f800000(lc.\u00d6O0000(by))).super());
        }
        return l2;
    }

    private static final long \u00f6\u00d20000(short[] sArray, g g2) {
        long l2 = 0L;
        int n2 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray, i2);
            l2 = f.super(l2 + ((f)g2.\u00f800000(dd.\u00d6O0000(s2))).super());
        }
        return l2;
    }

    public static final List super(int[] nArray, Object[] objectArray) {
        int n2 = Math.min(v.\u00d300000(nArray), objectArray.length);
        ArrayList<qb> arrayList = new ArrayList<qb>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectArray[i2];
            int n3 = v.new(nArray, i2);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(ac.return(n3), object));
        }
        return arrayList;
    }

    public static final List super(long[] lArray, Object[] objectArray) {
        int n2 = Math.min(nc.\u00d500000(lArray), objectArray.length);
        ArrayList<qb> arrayList = new ArrayList<qb>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectArray[i2];
            long l2 = nc.o00000(lArray, i2);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(f.\u00d4O0000(l2), object));
        }
        return arrayList;
    }

    public static final List super(byte[] byArray, Object[] objectArray) {
        int n2 = Math.min(s.o00000(byArray), objectArray.length);
        ArrayList<qb> arrayList = new ArrayList<qb>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectArray[i2];
            byte by = s.o00000(byArray, i2);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(lc.\u00d6O0000(by), object));
        }
        return arrayList;
    }

    public static final List super(short[] sArray, Object[] objectArray) {
        int n2 = Math.min(hc.\u00d400000(sArray), objectArray.length);
        ArrayList<qb> arrayList = new ArrayList<qb>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectArray[i2];
            short s2 = hc.o00000(sArray, i2);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(dd.\u00d6O0000(s2), object));
        }
        return arrayList;
    }

    private static final List super(int[] nArray, Object[] objectArray, b.o.e.f f2) {
        int n2 = Math.min(v.\u00d300000(nArray), objectArray.length);
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(f2.o00000(ac.return(v.new(nArray, i2)), objectArray[i2]));
        }
        return arrayList;
    }

    private static final List super(long[] lArray, Object[] objectArray, b.o.e.f f2) {
        int n2 = Math.min(nc.\u00d500000(lArray), objectArray.length);
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(f2.o00000(f.\u00d4O0000(nc.o00000(lArray, i2)), objectArray[i2]));
        }
        return arrayList;
    }

    private static final List super(byte[] byArray, Object[] objectArray, b.o.e.f f2) {
        int n2 = Math.min(s.o00000(byArray), objectArray.length);
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(f2.o00000(lc.\u00d6O0000(s.o00000(byArray, i2)), objectArray[i2]));
        }
        return arrayList;
    }

    private static final List super(short[] sArray, Object[] objectArray, b.o.e.f f2) {
        int n2 = Math.min(hc.\u00d400000(sArray), objectArray.length);
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(f2.o00000(dd.\u00d6O0000(hc.o00000(sArray, i2)), objectArray[i2]));
        }
        return arrayList;
    }

    public static final List \u00d200000(int[] nArray, Iterable object) {
        int n2 = v.\u00d300000(nArray);
        ArrayList<qb> arrayList = new ArrayList<qb>(Math.min(mc.o00000((Iterable)object, 10), n2));
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 >= n2) break;
            int n4 = v.new(nArray, n3++);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(ac.return(n4), e2));
        }
        return arrayList;
    }

    public static final List \u00d200000(long[] lArray, Iterable object) {
        int n2 = nc.\u00d500000(lArray);
        ArrayList<qb> arrayList = new ArrayList<qb>(Math.min(mc.o00000((Iterable)object, 10), n2));
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 >= n2) break;
            long l2 = nc.o00000(lArray, n3++);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(f.\u00d4O0000(l2), e2));
        }
        return arrayList;
    }

    public static final List \u00d200000(byte[] byArray, Iterable object) {
        int n2 = s.o00000(byArray);
        ArrayList<qb> arrayList = new ArrayList<qb>(Math.min(mc.o00000((Iterable)object, 10), n2));
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 >= n2) break;
            byte by = s.o00000(byArray, n3++);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(lc.\u00d6O0000(by), e2));
        }
        return arrayList;
    }

    public static final List super(short[] sArray, Iterable object) {
        int n2 = hc.\u00d400000(sArray);
        ArrayList<qb> arrayList = new ArrayList<qb>(Math.min(mc.o00000((Iterable)object, 10), n2));
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 >= n2) break;
            short s2 = hc.o00000(sArray, n3++);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(dd.\u00d6O0000(s2), e2));
        }
        return arrayList;
    }

    private static final List super(int[] nArray, Iterable object, b.o.e.f f2) {
        int n2 = v.\u00d300000(nArray);
        ArrayList<Object> arrayList = new ArrayList<Object>(Math.min(mc.o00000((Iterable)object, 10), n2));
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 >= n2) break;
            arrayList.add(f2.o00000(ac.return(v.new(nArray, n3++)), e2));
        }
        return arrayList;
    }

    private static final List super(long[] lArray, Iterable object, b.o.e.f f2) {
        int n2 = nc.\u00d500000(lArray);
        ArrayList<Object> arrayList = new ArrayList<Object>(Math.min(mc.o00000((Iterable)object, 10), n2));
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 >= n2) break;
            arrayList.add(f2.o00000(f.\u00d4O0000(nc.o00000(lArray, n3++)), e2));
        }
        return arrayList;
    }

    private static final List super(byte[] byArray, Iterable object, b.o.e.f f2) {
        int n2 = s.o00000(byArray);
        ArrayList<Object> arrayList = new ArrayList<Object>(Math.min(mc.o00000((Iterable)object, 10), n2));
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 >= n2) break;
            arrayList.add(f2.o00000(lc.\u00d6O0000(s.o00000(byArray, n3++)), e2));
        }
        return arrayList;
    }

    private static final List super(short[] sArray, Iterable object, b.o.e.f f2) {
        int n2 = hc.\u00d400000(sArray);
        ArrayList<Object> arrayList = new ArrayList<Object>(Math.min(mc.o00000((Iterable)object, 10), n2));
        int n3 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (n3 >= n2) break;
            arrayList.add(f2.o00000(dd.\u00d6O0000(hc.o00000(sArray, n3++)), e2));
        }
        return arrayList;
    }

    public static final List \u00d300000(int[] nArray, int[] nArray2) {
        int n2 = Math.min(v.\u00d300000(nArray), v.\u00d300000(nArray2));
        ArrayList<qb> arrayList = new ArrayList<qb>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = v.new(nArray2, i2);
            int n4 = v.new(nArray, i2);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(ac.return(n4), ac.return(n3)));
        }
        return arrayList;
    }

    public static final List \u00d200000(long[] lArray, long[] lArray2) {
        int n2 = Math.min(nc.\u00d500000(lArray), nc.\u00d500000(lArray2));
        ArrayList<qb> arrayList = new ArrayList<qb>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            long l2 = nc.o00000(lArray2, i2);
            long l3 = nc.o00000(lArray, i2);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(f.\u00d4O0000(l3), f.\u00d4O0000(l2)));
        }
        return arrayList;
    }

    public static final List \u00d200000(byte[] byArray, byte[] byArray2) {
        int n2 = Math.min(s.o00000(byArray), s.o00000(byArray2));
        ArrayList<qb> arrayList = new ArrayList<qb>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = s.o00000(byArray2, i2);
            byte by2 = s.o00000(byArray, i2);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(lc.\u00d6O0000(by2), lc.\u00d6O0000(by)));
        }
        return arrayList;
    }

    public static final List \u00d200000(short[] sArray, short[] sArray2) {
        int n2 = Math.min(hc.\u00d400000(sArray), hc.\u00d400000(sArray2));
        ArrayList<qb> arrayList = new ArrayList<qb>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            short s2 = hc.o00000(sArray2, i2);
            short s3 = hc.o00000(sArray, i2);
            ArrayList<qb> arrayList2 = arrayList;
            arrayList2.add(yc.o00000(dd.\u00d6O0000(s3), dd.\u00d6O0000(s2)));
        }
        return arrayList;
    }

    private static final List super(int[] nArray, int[] nArray2, b.o.e.f f2) {
        int n2 = Math.min(v.\u00d300000(nArray), v.\u00d300000(nArray2));
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(f2.o00000(ac.return(v.new(nArray, i2)), ac.return(v.new(nArray2, i2))));
        }
        return arrayList;
    }

    private static final List super(long[] lArray, long[] lArray2, b.o.e.f f2) {
        int n2 = Math.min(nc.\u00d500000(lArray), nc.\u00d500000(lArray2));
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(f2.o00000(f.\u00d4O0000(nc.o00000(lArray, i2)), f.\u00d4O0000(nc.o00000(lArray2, i2))));
        }
        return arrayList;
    }

    private static final List super(byte[] byArray, byte[] byArray2, b.o.e.f f2) {
        int n2 = Math.min(s.o00000(byArray), s.o00000(byArray2));
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(f2.o00000(lc.\u00d6O0000(s.o00000(byArray, i2)), lc.\u00d6O0000(s.o00000(byArray2, i2))));
        }
        return arrayList;
    }

    private static final List super(short[] sArray, short[] sArray2, b.o.e.f f2) {
        int n2 = Math.min(hc.\u00d400000(sArray), hc.\u00d400000(sArray2));
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(f2.o00000(dd.\u00d6O0000(hc.o00000(sArray, i2)), dd.\u00d6O0000(hc.o00000(sArray2, i2))));
        }
        return arrayList;
    }

    public static final int super(ac[] acArray) {
        int n2 = 0;
        int n3 = acArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = acArray[i2].o00000();
            n2 = ac.\u00d500000(n2 + n4);
        }
        return n2;
    }

    public static final long \u00d200000(f[] fArray) {
        long l2 = 0L;
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            long l3 = fArray[i2].super();
            l2 = f.super(l2 + l3);
        }
        return l2;
    }

    public static final int \u00d200000(lc[] lcArray) {
        int n2 = 0;
        int n3 = lcArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            byte by = lcArray[i2].super();
            n2 = ac.\u00d500000(n2 + ac.\u00d500000(by & 0xFF));
        }
        return n2;
    }

    public static final int \u00d200000(dd[] ddArray) {
        int n2 = 0;
        int n3 = ddArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            short s2 = ddArray[i2].o00000();
            n2 = ac.\u00d500000(n2 + ac.\u00d500000(s2 & 0xFFFF));
        }
        return n2;
    }

    private static final int \u00f6o0000(int[] nArray) {
        return ac.\u00d500000(z.\u00f5o0000(nArray));
    }

    private static final long interface(long[] lArray) {
        return f.super(z.\u00f600000(lArray));
    }

    private static final int \u00d400000(byte[] byArray) {
        int n2 = 0;
        int n3 = s.o00000(byArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = s.o00000(byArray, i2);
            int n5 = n2;
            n2 = n4;
            n4 = n5;
            n2 = ac.\u00d500000(n2 & 0xFF);
            n2 = ac.\u00d500000(n4 + n2);
        }
        return n2;
    }

    private static final int \u00f8o0000(short[] sArray) {
        int n2 = 0;
        int n3 = hc.\u00d400000(sArray);
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = hc.o00000(sArray, i2);
            int n5 = n2;
            n2 = n4;
            n4 = n5;
            n2 = ac.\u00d500000(n2 & 0xFFFF);
            n2 = ac.\u00d500000(n4 + n2);
        }
        return n2;
    }

    private static final Iterator \u00d800000(int[] nArray) {
        return v.o00000(nArray);
    }

    private static final Iterator \u00f4\u00d20000(long[] lArray) {
        return nc.\u00d300000(lArray);
    }

    private static final Iterator \u00d800000(byte[] byArray) {
        return s.\u00d300000(byArray);
    }

    private static final Iterator \u00f400000(short[] sArray) {
        return hc.new(sArray);
    }
}

