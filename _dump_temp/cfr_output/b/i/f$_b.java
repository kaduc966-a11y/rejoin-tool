/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.b;
import b.i.f;
import b.i.fb;
import b.i.p;
import b.i.y;
import b.o.d.fc;
import b.o.d.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class f$_b
implements fb {
    private final double \u00d800000;
    private final f \u00f500000;
    private final long \u00f400000;

    private f$_b(double d2, f f2, long l2) {
        this.\u00d800000 = d2;
        this.\u00f500000 = f2;
        this.\u00f400000 = l2;
    }

    @Override
    public final long o00000() {
        return b.String(y.o00000(this.\u00f500000.\u00f600000() - this.\u00d800000, this.\u00f500000.\u00f800000()), this.\u00f400000);
    }

    @Override
    public final fb \u00d400000(long l2) {
        return new f$_b(this.\u00d800000, this.\u00f500000, b.\u00d200000(this.\u00f400000, l2), null);
    }

    @Override
    public final long new(fb fb2) {
        if (!(fb2 instanceof f$_b) || !fc.o00000((Object)this.\u00f500000, (Object)((f$_b)fb2).\u00f500000)) {
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + fb2);
        }
        if (b.\u00d300000(this.\u00f400000, ((f$_b)fb2).\u00f400000) && b.\u00d5o0000(this.\u00f400000)) {
            return b.void.\u00d400000();
        }
        long l2 = b.String(this.\u00f400000, ((f$_b)fb2).\u00f400000);
        long l3 = y.o00000(this.\u00d800000 - ((f$_b)fb2).\u00d800000, this.\u00f500000.\u00f800000());
        if (b.\u00d300000(l3, b.\u00f600000(l2))) {
            return b.void.\u00d400000();
        }
        return b.\u00d200000(l3, l2);
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof f$_b && fc.o00000((Object)this.\u00f500000, (Object)((f$_b)object).\u00f500000) && b.\u00d300000(this.new((fb)object), b.void.\u00d400000());
    }

    @Override
    public final int hashCode() {
        return b.\u00d3O0000(b.\u00d200000(y.o00000(this.\u00d800000, this.\u00f500000.\u00f800000()), this.\u00f400000));
    }

    public final String toString() {
        return "DoubleTimeMark(" + this.\u00d800000 + p.\u00d300000(this.\u00f500000.\u00f800000()) + " + " + b.null(this.\u00f400000) + ", " + this.\u00f500000 + ')';
    }

    public /* synthetic */ f$_b(double d2, f f2, long l2, w w2) {
        this(d2, f2, l2);
    }
}

