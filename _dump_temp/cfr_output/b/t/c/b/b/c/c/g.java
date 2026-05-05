/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.c;

import b.o.d.fc;
import b.t.c.b.b.c.c.i;

public final class g
extends i {
    private final String o00000;
    private final String \u00d200000;

    public g(String string, String string2) {
        super(null);
        this.o00000 = string;
        this.\u00d200000 = string2;
    }

    @Override
    public final String \u00d200000() {
        return this.o00000;
    }

    @Override
    public final String o00000() {
        return this.\u00d200000;
    }

    @Override
    public final String toString() {
        return ((i)this).\u00d200000() + ((i)this).o00000();
    }

    public final int hashCode() {
        return this.o00000.hashCode() * 31 + this.\u00d200000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        if (!fc.o00000((Object)this.o00000, (Object)((g)object).o00000)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d200000, (Object)((g)object).\u00d200000);
    }
}

