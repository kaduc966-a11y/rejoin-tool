/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.c.x;
import b.t.c.b.b.c.z;

public final class x$_t
extends x {
    private final z \u00f400000;

    public x$_t(z z2) {
        super(null);
        this.\u00f400000 = z2;
    }

    public final z \u00d800000() {
        return this.\u00f400000;
    }

    @Override
    public final String toString() {
        return "AnnotationValue(" + this.\u00f400000 + ')';
    }

    public final int hashCode() {
        return this.\u00f400000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_t)) {
            return false;
        }
        object = (x$_t)object;
        return fc.o00000((Object)this.\u00f400000, (Object)((x$_t)object).\u00f400000);
    }
}

