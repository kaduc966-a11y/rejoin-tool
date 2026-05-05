/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.h;
import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class cb
implements h {
    private final Comparable \u00f8\u00d40000;
    private final Comparable privateObject;

    public cb(Comparable comparable, Comparable comparable2) {
        this.\u00f8\u00d40000 = comparable;
        this.privateObject = comparable2;
    }

    @Override
    public Comparable OO0000() {
        return this.\u00f8\u00d40000;
    }

    @Override
    public Comparable \u00d5O0000() {
        return this.privateObject;
    }

    public boolean equals(Object object) {
        return object instanceof cb && (this.if() && ((cb)object).if() || fc.o00000((Object)this.OO0000(), (Object)((cb)object).OO0000()) && fc.o00000((Object)this.\u00d5O0000(), (Object)((cb)object).\u00d5O0000()));
    }

    public int hashCode() {
        if (this.if()) {
            return -1;
        }
        return 31 * this.OO0000().hashCode() + this.\u00d5O0000().hashCode();
    }

    public String toString() {
        return this.OO0000() + "..<" + this.\u00d5O0000();
    }
}

