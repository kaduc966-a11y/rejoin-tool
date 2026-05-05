/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.t.c.b.b.c.kb;

public final class kb$_b
extends kb {
    private final int Object;

    public kb$_b(int n2) {
        super(null);
        this.Object = n2;
    }

    public final int \u00d300000() {
        return this.Object;
    }

    public final String toString() {
        return "TypeParameter(id=" + this.Object + ')';
    }

    public final int hashCode() {
        return Integer.hashCode(this.Object);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof kb$_b)) {
            return false;
        }
        object = (kb$_b)object;
        return this.Object == ((kb$_b)object).Object;
    }
}

