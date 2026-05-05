/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.t.c.b.b.c.x$_p;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_e
extends x$_p {
    private final char if;

    public x$_e(char c2) {
        super(null);
        this.if = c2;
    }

    public final Character \u00f600000() {
        return Character.valueOf(this.if);
    }

    public final int hashCode() {
        return Character.hashCode(this.if);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_e)) {
            return false;
        }
        object = (x$_e)object;
        return this.if == ((x$_e)object).if;
    }
}

