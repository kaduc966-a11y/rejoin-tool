/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.w;

public abstract class mb
implements hc {
    public String toString() {
        if (this.super()) {
            return "*";
        }
        if (this.\u00d200000() == w.\u00d400000) {
            return this.\u00d300000().toString();
        }
        return (Object)((Object)this.\u00d200000()) + " " + this.\u00d300000();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof hc)) {
            return false;
        }
        object = (hc)object;
        if (this.super() != object.super()) {
            return false;
        }
        if (this.\u00d200000() != object.\u00d200000()) {
            return false;
        }
        return this.\u00d300000().equals(object.\u00d300000());
    }

    public int hashCode() {
        int n2;
        int n3;
        int n4 = this.\u00d200000().hashCode();
        if (o.o00000(this.\u00d300000())) {
            n3 = 31 * n4;
            n2 = 19;
        } else {
            n3 = 31 * n4;
            n2 = this.super() ? 17 : this.\u00d300000().hashCode();
        }
        return n3 + n2;
    }
}

