/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.c.x;

public final class x$_k
extends x {
    private final String \u00d400000;

    public x$_k(String string) {
        super(null);
        this.\u00d400000 = string;
    }

    public final String String() {
        return this.\u00d400000;
    }

    @Override
    public final String toString() {
        return "KClassValue(" + this.\u00d400000 + ')';
    }

    public final int hashCode() {
        return this.\u00d400000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_k)) {
            return false;
        }
        object = (x$_k)object;
        return fc.o00000((Object)this.\u00d400000, (Object)((x$_k)object).\u00d400000);
    }
}

