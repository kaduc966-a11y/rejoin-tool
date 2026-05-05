/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c.b;

import b.o.d.fc;
import b.t.c.b.b.l.c.b.d;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d$_c
extends d {
    private final String super;
    private final String \u00d200000;

    public d$_c(String string, String string2) {
        super(null);
        this.super = string;
        this.\u00d200000 = string2;
    }

    public final String \u00d300000() {
        return this.super;
    }

    public final String \u00d200000() {
        return this.\u00d200000;
    }

    @Override
    public final String o00000() {
        return this.\u00d300000() + this.\u00d200000();
    }

    public final int hashCode() {
        return this.super.hashCode() * 31 + this.\u00d200000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d$_c)) {
            return false;
        }
        object = (d$_c)object;
        if (!fc.o00000((Object)this.super, (Object)((d$_c)object).super)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d200000, (Object)((d$_c)object).\u00d200000);
    }
}

