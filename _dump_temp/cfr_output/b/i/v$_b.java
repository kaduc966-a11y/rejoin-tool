/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.bd;
import b.i.k;
import b.i.v;
import b.o.d.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class v$_b {
    private v$_b() {
    }

    public final v \u00d200000() {
        throw new bd(null, 1, null);
    }

    public final v super(long l2) {
        long l3;
        long l4 = l2;
        long l5 = l4 / 1000L;
        if ((l4 ^ 0x3E8L) < 0L && l5 * 1000L != l4) {
            l5 += -1L;
        }
        long l6 = l5;
        long l7 = l3 = l2 % 1000L;
        int n2 = (int)((l3 + (0x3E8L & ((l3 ^ 0x3E8L) & (l7 | -l7)) >> 63)) * 1000000L);
        if (l6 < -31557014167219200L) {
            return this.\u00d300000();
        }
        if (l6 > 31556889864403199L) {
            return this.class();
        }
        return this.super(l6, n2);
    }

    public final v super(long l2, long l3) {
        long l4;
        long l5 = l2;
        long l6 = l3;
        long l7 = l6 / 1000000000L;
        if ((l6 ^ 0x3B9ACA00L) < 0L && l7 * 1000000000L != l6) {
            l7 += -1L;
        }
        if ((l5 ^ (l4 = l5 + (l6 = l7))) < 0L && (l5 ^ l6) >= 0L) {
            if (l2 > 0L) {
                return v.\u00d500000.class();
            }
            return v.\u00d500000.\u00d300000();
        }
        long l8 = l4;
        if (l8 < -31557014167219200L) {
            return this.\u00d300000();
        }
        if (l8 > 31556889864403199L) {
            return this.class();
        }
        long l9 = l4 = l3 % 1000000000L;
        int n2 = (int)(l4 + (0x3B9ACA00L & ((l4 ^ 0x3B9ACA00L) & (l9 | -l9)) >> 63));
        return new v(l8, n2);
    }

    public static /* synthetic */ v super(v$_b v$_b, long l2, long l3, int n2, Object object) {
        if ((n2 & 2) != 0) {
            l3 = 0L;
        }
        return v$_b.super(l2, l3);
    }

    public final v super(long l2, int n2) {
        return this.super(l2, (long)n2);
    }

    public final v \u00d200000(CharSequence charSequence) {
        return k.\u00d200000(charSequence).new();
    }

    public final v super(CharSequence charSequence) {
        return k.\u00d200000(charSequence).o00000();
    }

    public final v \u00d400000() {
        return this.super(-3217862419201L, 999999999);
    }

    public final v super() {
        return this.super(3093527980800L, 0);
    }

    public final v \u00d300000() {
        return v.\u00d300000();
    }

    public final v class() {
        return v.\u00d200000();
    }

    public /* synthetic */ v$_b(w w2) {
        this();
    }
}

