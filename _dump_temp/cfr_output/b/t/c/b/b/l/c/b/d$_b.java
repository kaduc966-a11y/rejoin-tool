/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c.b;

import b.o.d.fc;
import b.t.c.b.b.l.c.b.d;

public final class d$_b
extends d {
    private final String \u00d300000;
    private final String \u00d400000;

    public d$_b(String string, String string2) {
        super(null);
        this.\u00d300000 = string;
        this.\u00d400000 = string2;
    }

    public final String \u00d600000() {
        return this.\u00d300000;
    }

    public final String String() {
        return this.\u00d400000;
    }

    @Override
    public final String o00000() {
        return this.\u00d600000() + ':' + this.String();
    }

    public final String \u00d800000() {
        return this.\u00d300000;
    }

    public final String \u00d500000() {
        return this.\u00d400000;
    }

    public final int hashCode() {
        return this.\u00d300000.hashCode() * 31 + this.\u00d400000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d$_b)) {
            return false;
        }
        object = (d$_b)object;
        if (!fc.o00000((Object)this.\u00d300000, (Object)((d$_b)object).\u00d300000)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d400000, (Object)((d$_b)object).\u00d400000);
    }
}

