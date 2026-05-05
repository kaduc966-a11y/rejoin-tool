/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;
import b.t.c.b.b.c.x;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_d
extends x {
    private final String new;
    private final String o00000;

    public x$_d(String string, String string2) {
        super(null);
        this.new = string;
        this.o00000 = string2;
    }

    public final String o00000() {
        return this.new;
    }

    public final String \u00d200000() {
        return this.o00000;
    }

    @Override
    public final String toString() {
        return "EnumValue(" + this.new + '.' + this.o00000 + ')';
    }

    public final int hashCode() {
        return this.new.hashCode() * 31 + this.o00000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_d)) {
            return false;
        }
        object = (x$_d)object;
        if (!fc.o00000((Object)this.new, (Object)((x$_d)object).new)) {
            return false;
        }
        return fc.o00000((Object)this.o00000, (Object)((x$_d)object).o00000);
    }
}

