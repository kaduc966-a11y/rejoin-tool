/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.c.kb;

public final class kb$_d
extends kb {
    private final String \u00d200000;

    public kb$_d(String string) {
        super(null);
        this.\u00d200000 = string;
    }

    public final String \u00d200000() {
        return this.\u00d200000;
    }

    public final String toString() {
        return "TypeAlias(name=" + this.\u00d200000 + ')';
    }

    public final int hashCode() {
        return this.\u00d200000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof kb$_d)) {
            return false;
        }
        object = (kb$_d)object;
        return fc.o00000((Object)this.\u00d200000, (Object)((kb$_d)object).\u00d200000);
    }
}

