/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.t.c.b.b.c.x$_p;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_i
extends x$_p {
    private final byte oO0000;

    public x$_i(byte by) {
        super(null);
        this.oO0000 = by;
    }

    public final Byte oO0000() {
        return this.oO0000;
    }

    public final int hashCode() {
        return Byte.hashCode(this.oO0000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_i)) {
            return false;
        }
        object = (x$_i)object;
        return this.oO0000 == ((x$_i)object).oO0000;
    }
}

