/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.t.c.b.b.c.x$_p;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_r
extends x$_p {
    private final float \u00d8O0000;

    public x$_r(float f2) {
        super(null);
        this.\u00d8O0000 = f2;
    }

    public final Float \u00d8O0000() {
        return Float.valueOf(this.\u00d8O0000);
    }

    public final int hashCode() {
        return Float.hashCode(this.\u00d8O0000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_r)) {
            return false;
        }
        object = (x$_r)object;
        return Float.compare(this.\u00d8O0000, ((x$_r)object).\u00d8O0000) == 0;
    }
}

