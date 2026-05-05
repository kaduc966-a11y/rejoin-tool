/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class y
implements h {
    private final double \u00d4\u00d40000;
    private final double \u00d3\u00d40000;

    public y(double d2, double d3) {
        this.\u00d4\u00d40000 = d2;
        this.\u00d3\u00d40000 = d3;
    }

    public final Double \u00d8\u00d20000() {
        return this.\u00d4\u00d40000;
    }

    public final Double returnnew() {
        return this.\u00d3\u00d40000;
    }

    private final boolean o00000(double d2, double d3) {
        return d2 <= d3;
    }

    public final boolean \u00d400000(double d2) {
        return d2 >= this.\u00d4\u00d40000 && d2 < this.\u00d3\u00d40000;
    }

    @Override
    public final boolean if() {
        return !(this.\u00d4\u00d40000 < this.\u00d3\u00d40000);
    }

    public final boolean equals(Object object) {
        return object instanceof y && (this.if() && ((y)object).if() || this.\u00d4\u00d40000 == ((y)object).\u00d4\u00d40000 && this.\u00d3\u00d40000 == ((y)object).\u00d3\u00d40000);
    }

    public final int hashCode() {
        if (this.if()) {
            return -1;
        }
        return 31 * Double.hashCode(this.\u00d4\u00d40000) + Double.hashCode(this.\u00d3\u00d40000);
    }

    public final String toString() {
        return this.\u00d4\u00d40000 + "..<" + this.\u00d3\u00d40000;
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable) {
        return this.\u00d400000(((Number)((Object)comparable)).doubleValue());
    }
}

