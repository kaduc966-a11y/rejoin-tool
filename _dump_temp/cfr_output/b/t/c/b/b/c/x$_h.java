/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.t.c.b.b.c.x$_p;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_h
extends x$_p {
    private final long OO0000;

    public x$_h(long l2) {
        super(null);
        this.OO0000 = l2;
    }

    public final Long for() {
        return this.OO0000;
    }

    public final int hashCode() {
        return Long.hashCode(this.OO0000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_h)) {
            return false;
        }
        object = (x$_h)object;
        return this.OO0000 == ((x$_h)object).OO0000;
    }
}

