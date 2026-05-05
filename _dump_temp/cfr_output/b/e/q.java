/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class q
implements h {
    private final float \u00f5\u00d30000;
    private final float \u00f4\u00d30000;

    public q(float f2, float f3) {
        this.\u00f5\u00d30000 = f2;
        this.\u00f4\u00d30000 = f3;
    }

    public final Float \u00f5o0000() {
        return Float.valueOf(this.\u00f5\u00d30000);
    }

    public final Float \u00f4o0000() {
        return Float.valueOf(this.\u00f4\u00d30000);
    }

    private final boolean o00000(float f2, float f3) {
        return f2 <= f3;
    }

    public final boolean \u00d400000(float f2) {
        return f2 >= this.\u00f5\u00d30000 && f2 < this.\u00f4\u00d30000;
    }

    @Override
    public final boolean if() {
        return !(this.\u00f5\u00d30000 < this.\u00f4\u00d30000);
    }

    public final boolean equals(Object object) {
        return object instanceof q && (this.if() && ((q)object).if() || this.\u00f5\u00d30000 == ((q)object).\u00f5\u00d30000 && this.\u00f4\u00d30000 == ((q)object).\u00f4\u00d30000);
    }

    public final int hashCode() {
        if (this.if()) {
            return -1;
        }
        return 31 * Float.hashCode(this.\u00f5\u00d30000) + Float.hashCode(this.\u00f4\u00d30000);
    }

    public final String toString() {
        return this.\u00f5\u00d30000 + "..<" + this.\u00f4\u00d30000;
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable) {
        return this.\u00d400000(((Number)((Object)comparable)).floatValue());
    }
}

