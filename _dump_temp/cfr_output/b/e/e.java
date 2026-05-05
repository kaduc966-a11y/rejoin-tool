/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.ab;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class e
implements ab {
    private final float o\u00d50000;
    private final float newString;

    public e(float f2, float f3) {
        this.o\u00d50000 = f2;
        this.newString = f3;
    }

    public final Float \u00f5\u00d30000() {
        return Float.valueOf(this.o\u00d50000);
    }

    public final Float StringObject() {
        return Float.valueOf(this.newString);
    }

    public final boolean new(float f2, float f3) {
        return f2 <= f3;
    }

    public final boolean \u00d500000(float f2) {
        return f2 >= this.o\u00d50000 && f2 <= this.newString;
    }

    @Override
    public final boolean if() {
        return !(this.o\u00d50000 <= this.newString);
    }

    public final boolean equals(Object object) {
        return object instanceof e && (this.if() && ((e)object).if() || this.o\u00d50000 == ((e)object).o\u00d50000 && this.newString == ((e)object).newString);
    }

    public final int hashCode() {
        if (this.if()) {
            return -1;
        }
        return 31 * Float.hashCode(this.o\u00d50000) + Float.hashCode(this.newString);
    }

    public final String toString() {
        return this.o\u00d50000 + ".." + this.newString;
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable, Comparable comparable2) {
        return this.new(((Number)((Object)comparable)).floatValue(), ((Number)((Object)comparable2)).floatValue());
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable) {
        return this.\u00d500000(((Number)((Object)comparable)).floatValue());
    }
}

