/*
 * Decompiled with CFR 0.152.
 */
package b.b;

import b.ac;
import b.b.f;
import b.b.h;
import b.e.db;
import b.e.r;
import b.e.w;
import b.e.z;
import b.s;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d {
    public static final int o00000(f f2) {
        return ac.\u00d500000(f2.\u00d200000());
    }

    public static final int o00000(f f2, int n2) {
        return d.o00000(f2, 0, n2);
    }

    public static final int o00000(f f2, int n2, int n3) {
        d.o00000(n2, n3);
        return ac.\u00d500000(f2.o00000(n2 ^= Integer.MIN_VALUE, n3 ^= Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    public static final int o00000(f f2, z z2) {
        if (((w)z2).if()) {
            throw new IllegalArgumentException("Cannot get random in empty range: ".concat(String.valueOf(z2)));
        }
        if (Integer.compareUnsigned(z2.ifnew(), -1) < 0) {
            return d.o00000(f2, z2.\u00f5\u00d20000(), ac.\u00d500000(z2.ifnew() + 1));
        }
        if (Integer.compareUnsigned(z2.\u00f5\u00d20000(), 0) > 0) {
            return ac.\u00d500000(d.o00000(f2, ac.\u00d500000(z2.\u00f5\u00d20000() - 1), z2.ifnew()) + 1);
        }
        return d.o00000(f2);
    }

    public static final long new(f f2) {
        return b.f.super(f2.\u00d500000());
    }

    public static final long o00000(f f2, long l2) {
        return d.o00000(f2, 0L, l2);
    }

    public static final long o00000(f f2, long l2, long l3) {
        d.o00000(l2, l3);
        long l4 = l2 ^ Long.MIN_VALUE;
        long l5 = l3 ^ Long.MIN_VALUE;
        return b.f.super(f2.o00000(l4, l5) ^ Long.MIN_VALUE);
    }

    public static final long o00000(f f2, r r2) {
        if (((db)r2).if()) {
            throw new IllegalArgumentException("Cannot get random in empty range: ".concat(String.valueOf(r2)));
        }
        if (Long.compareUnsigned(r2.O\u00d20000(), -1L) < 0) {
            return d.o00000(f2, r2.\u00f8o0000(), b.f.super(r2.O\u00d20000() + b.f.super(1L)));
        }
        if (Long.compareUnsigned(r2.\u00f8o0000(), 0L) > 0) {
            return b.f.super(d.o00000(f2, b.f.super(r2.\u00f8o0000() - b.f.super(1L)), r2.O\u00d20000()) + b.f.super(1L));
        }
        return d.new(f2);
    }

    public static final byte[] o00000(f f2, byte[] byArray) {
        f2.o00000(byArray);
        return byArray;
    }

    public static final byte[] new(f f2, int n2) {
        return s.return(f2.\u00d300000(n2));
    }

    public static final byte[] o00000(f f2, byte[] byArray, int n2, int n3) {
        f2.o00000(byArray, n2, n3);
        return byArray;
    }

    public static /* synthetic */ byte[] o00000(f f2, byte[] byArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = s.o00000(byArray);
        }
        return d.o00000(f2, byArray, n2, n3);
    }

    public static final void o00000(int n2, int n3) {
        if (!(Integer.compareUnsigned(n3, n2) > 0)) {
            String string = h.super(ac.return(n2), ac.return(n3));
            throw new IllegalArgumentException(string.toString());
        }
    }

    public static final void o00000(long l2, long l3) {
        if (!(Long.compareUnsigned(l3, l2) > 0)) {
            String string = h.super(b.f.\u00d4O0000(l2), b.f.\u00d4O0000(l3));
            throw new IllegalArgumentException(string.toString());
        }
    }
}

