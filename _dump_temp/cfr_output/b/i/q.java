/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.k;
import b.i.q$_b;
import b.o.e.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class q {
    public static final q$_b \u00f400000 = new q$_b(null);
    private final int class;
    private final int \u00d600000;
    private final int \u00d200000;
    private final int super;
    private final int \u00d800000;
    private final int \u00d400000;
    private final int \u00d300000;

    public q(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this.class = n2;
        this.\u00d600000 = n3;
        this.\u00d200000 = n4;
        this.super = n5;
        this.\u00d800000 = n6;
        this.\u00d400000 = n7;
        this.\u00d300000 = n8;
    }

    public final int \u00d200000() {
        return this.class;
    }

    public final int \u00d600000() {
        return this.\u00d600000;
    }

    public final int \u00d500000() {
        return this.\u00d200000;
    }

    public final int \u00d300000() {
        return this.super;
    }

    public final int o00000() {
        return this.\u00d800000;
    }

    public final int String() {
        return this.\u00d400000;
    }

    public final int \u00d800000() {
        return this.\u00d300000;
    }

    public final Object o00000(int n2, f f2) {
        q q2;
        q q3 = q2 = this;
        long l2 = q2.\u00d200000();
        long l3 = 365L * l2;
        l3 = l2 >= 0L ? (l3 += (l2 + 3L) / 4L - (l2 + 99L) / 100L + (l2 + 399L) / 400L) : (l3 -= l2 / -4L - l2 / -100L + l2 / -400L);
        l3 = l3 + (long)((367 * q3.\u00d600000() - 362) / 12) + (long)(q3.\u00d500000() - 1);
        if (q3.\u00d600000() > 2) {
            l3 += -1L;
            if (!k.o00000(q3.\u00d200000())) {
                l3 += -1L;
            }
        }
        long l4 = l3 - 719528L;
        int n3 = q2.\u00d300000() * 3600 + q2.o00000() * 60 + q2.String();
        long l5 = l4 * 86400L + (long)n3 - (long)n2;
        return f2.o00000(l5, this.\u00d800000());
    }

    public final String toString() {
        return "UnboundLocalDateTime(" + this.class + '-' + this.\u00d600000 + '-' + this.\u00d200000 + ' ' + this.super + ':' + this.\u00d800000 + ':' + this.\u00d400000 + '.' + this.\u00d300000 + ')';
    }
}

