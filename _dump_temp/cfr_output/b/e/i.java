/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.g;
import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class i
implements g {
    private final Comparable \u00f5\u00d20000;
    private final Comparable \u00f4\u00d20000;

    public i(Comparable comparable, Comparable comparable2) {
        this.\u00f5\u00d20000 = comparable;
        this.\u00f4\u00d20000 = comparable2;
    }

    @Override
    public Comparable OO0000() {
        return this.\u00f5\u00d20000;
    }

    @Override
    public Comparable \u00f800000() {
        return this.\u00f4\u00d20000;
    }

    public boolean equals(Object object) {
        return object instanceof i && (this.if() && ((i)object).if() || fc.o00000((Object)this.OO0000(), (Object)((i)object).OO0000()) && fc.o00000((Object)this.\u00f800000(), (Object)((i)object).\u00f800000()));
    }

    public int hashCode() {
        if (this.if()) {
            return -1;
        }
        return 31 * this.OO0000().hashCode() + this.\u00f800000().hashCode();
    }

    public String toString() {
        return this.OO0000() + ".." + this.\u00f800000();
    }
}

