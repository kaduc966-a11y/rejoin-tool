/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.c;

import b.o.d.fc;
import b.t.c.b.b.c.c.i;

public final class d
extends i {
    private final String Object;
    private final String \u00d400000;

    public d(String string, String string2) {
        super(null);
        this.Object = string;
        this.\u00d400000 = string2;
    }

    @Override
    public final String \u00d200000() {
        return this.Object;
    }

    @Override
    public final String o00000() {
        return this.\u00d400000;
    }

    @Override
    public final String toString() {
        return ((i)this).\u00d200000() + ':' + ((i)this).o00000();
    }

    public final int hashCode() {
        return this.Object.hashCode() * 31 + this.\u00d400000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        object = (d)object;
        if (!fc.o00000((Object)this.Object, (Object)((d)object).Object)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d400000, (Object)((d)object).\u00d400000);
    }
}

