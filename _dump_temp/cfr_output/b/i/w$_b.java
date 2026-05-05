/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.f.e;
import b.i.b;
import b.i.c;
import b.i.fb;
import b.i.m;
import b.i.p;
import b.i.w;
import b.i.y;
import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class w$_b
implements fb {
    private final long \u00d400000;
    private final w return;
    private final long \u00d500000;

    private w$_b(long l2, w w2, long l3) {
        this.\u00d400000 = l2;
        this.return = w2;
        this.\u00d500000 = l3;
    }

    @Override
    public final long o00000() {
        return b.String(c.\u00d300000(w.\u00d200000(this.return), this.\u00d400000, this.return.\u00d800000()), this.\u00d500000);
    }

    @Override
    public final fb \u00d400000(long l2) {
        long l3;
        m m2 = this.return.\u00d800000();
        if (b.\u00d5o0000(l2)) {
            long l4 = c.new(this.\u00d400000, m2, l2);
            return new w$_b(l4, this.return, b.void.\u00d400000(), null);
        }
        long l5 = b.String(l2, m2);
        long l6 = b.\u00d200000(b.String(l2, l5), this.\u00d500000);
        long l7 = c.new(this.\u00d400000, m2, l5);
        long l8 = b.String(l6, m2);
        l7 = c.new(l7, m2, l8);
        long l9 = b.String(l6, l8);
        long l10 = b.oO0000(l9);
        if (l7 != 0L && l10 != 0L && (l7 ^ l10) < 0L) {
            l3 = y.o00000(e.new(l10), m2);
            l7 = c.new(l7, m2, l3);
            l9 = b.String(l9, l3);
        }
        long l11 = ((l3 = l7) - 1L | 1L) == Long.MAX_VALUE ? b.void.\u00d400000() : l9;
        return new w$_b(l3, this.return, l11, null);
    }

    @Override
    public final long new(fb fb2) {
        if (!(fb2 instanceof w$_b) || !fc.o00000((Object)this.return, (Object)((w$_b)fb2).return)) {
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + fb2);
        }
        return b.\u00d200000(c.\u00d300000(this.\u00d400000, ((w$_b)fb2).\u00d400000, this.return.\u00d800000()), b.String(this.\u00d500000, ((w$_b)fb2).\u00d500000));
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof w$_b && fc.o00000((Object)this.return, (Object)((w$_b)object).return) && b.\u00d300000(this.new((fb)object), b.void.\u00d400000());
    }

    @Override
    public final int hashCode() {
        return b.\u00d3O0000(this.\u00d500000) * 37 + Long.hashCode(this.\u00d400000);
    }

    public final String toString() {
        return "LongTimeMark(" + this.\u00d400000 + p.\u00d300000(this.return.\u00d800000()) + " + " + b.null(this.\u00d500000) + ", " + this.return + ')';
    }

    public /* synthetic */ w$_b(long l2, w w2, long l3, b.o.d.w w3) {
        this(l2, w2, l3);
    }
}

