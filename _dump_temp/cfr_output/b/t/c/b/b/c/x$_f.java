/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.t.c.b.b.c.x$_p;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_f
extends x$_p {
    private final double \u00f800000;

    public x$_f(double d2) {
        super(null);
        this.\u00f800000 = d2;
    }

    public final Double \u00f800000() {
        return this.\u00f800000;
    }

    public final int hashCode() {
        return Double.hashCode(this.\u00f800000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_f)) {
            return false;
        }
        object = (x$_f)object;
        return Double.compare(this.\u00f800000, ((x$_f)object).\u00f800000) == 0;
    }
}

