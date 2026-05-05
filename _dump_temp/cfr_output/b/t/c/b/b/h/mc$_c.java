/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.fc;
import b.t.c.b.b.h.m;
import b.t.c.b.b.q.i;

final class mc$_c {
    private final i o00000;
    private final m \u00d200000;

    public mc$_c(i i2, m m2) {
        this.o00000 = i2;
        this.\u00d200000 = m2;
    }

    public final i \u00d200000() {
        return this.o00000;
    }

    public final m o00000() {
        return this.\u00d200000;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof mc$_c)) {
            return false;
        }
        return fc.o00000((Object)((mc$_c)object).o00000, (Object)this.o00000) && fc.o00000((Object)((mc$_c)object).\u00d200000, (Object)this.\u00d200000);
    }

    public final int hashCode() {
        int n2 = this.o00000.hashCode();
        return n2 + (31 * n2 + this.\u00d200000.hashCode());
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.o00000 + ", typeAttr=" + this.\u00d200000 + ')';
    }
}

