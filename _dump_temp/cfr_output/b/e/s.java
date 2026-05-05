/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.ab;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class s
implements ab {
    private final double \u00d3\u00d50000;
    private final double \u00d4\u00d50000;

    public s(double d2, double d3) {
        this.\u00d3\u00d50000 = d2;
        this.\u00d4\u00d50000 = d3;
    }

    public final Double O\u00d40000() {
        return this.\u00d3\u00d50000;
    }

    public final Double \u00f8\u00d30000() {
        return this.\u00d4\u00d50000;
    }

    public final boolean new(double d2, double d3) {
        return d2 <= d3;
    }

    public final boolean \u00d500000(double d2) {
        return d2 >= this.\u00d3\u00d50000 && d2 <= this.\u00d4\u00d50000;
    }

    @Override
    public final boolean if() {
        return !(this.\u00d3\u00d50000 <= this.\u00d4\u00d50000);
    }

    public final boolean equals(Object object) {
        return object instanceof s && (this.if() && ((s)object).if() || this.\u00d3\u00d50000 == ((s)object).\u00d3\u00d50000 && this.\u00d4\u00d50000 == ((s)object).\u00d4\u00d50000);
    }

    public final int hashCode() {
        if (this.if()) {
            return -1;
        }
        return 31 * Double.hashCode(this.\u00d3\u00d50000) + Double.hashCode(this.\u00d4\u00d50000);
    }

    public final String toString() {
        return this.\u00d3\u00d50000 + ".." + this.\u00d4\u00d50000;
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable, Comparable comparable2) {
        return this.new(((Number)((Object)comparable)).doubleValue(), ((Number)((Object)comparable2)).doubleValue());
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable) {
        return this.\u00d500000(((Number)((Object)comparable)).doubleValue());
    }
}

