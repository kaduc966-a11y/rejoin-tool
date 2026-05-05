/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.c.kb;

public final class kb$_c
extends kb {
    private final String o00000;

    public kb$_c(String string) {
        super(null);
        this.o00000 = string;
    }

    public final String o00000() {
        return this.o00000;
    }

    public final String toString() {
        return "Class(name=" + this.o00000 + ')';
    }

    public final int hashCode() {
        return this.o00000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof kb$_c)) {
            return false;
        }
        object = (kb$_c)object;
        return fc.o00000((Object)this.o00000, (Object)((kb$_c)object).o00000);
    }
}

