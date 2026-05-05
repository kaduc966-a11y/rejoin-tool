/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.g;

import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    private final Object o00000;
    private final Object \u00d200000;

    public b(Object object, Object object2) {
        this.o00000 = object;
        this.\u00d200000 = object2;
    }

    public final Object \u00d300000() {
        return this.o00000;
    }

    public final Object \u00d400000() {
        return this.\u00d200000;
    }

    public final Object new() {
        return this.o00000;
    }

    public final Object o00000() {
        return this.\u00d200000;
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.o00000 + ", upper=" + this.\u00d200000 + ')';
    }

    public final int hashCode() {
        return (this.o00000 == null ? 0 : this.o00000.hashCode()) * 31 + (this.\u00d200000 == null ? 0 : this.\u00d200000.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (!fc.o00000(this.o00000, ((b)object).o00000)) {
            return false;
        }
        return fc.o00000(this.\u00d200000, ((b)object).\u00d200000);
    }
}

