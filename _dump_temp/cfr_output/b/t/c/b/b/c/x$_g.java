/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.c.x;
import java.util.List;

public final class x$_g
extends x {
    private final List \u00d300000;

    public x$_g(List list) {
        super(null);
        this.\u00d300000 = list;
    }

    public final List \u00d300000() {
        return this.\u00d300000;
    }

    @Override
    public final String toString() {
        return "ArrayValue(" + this.\u00d300000 + ')';
    }

    public final int hashCode() {
        return ((Object)this.\u00d300000).hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_g)) {
            return false;
        }
        object = (x$_g)object;
        return fc.o00000((Object)this.\u00d300000, (Object)((x$_g)object).\u00d300000);
    }
}

