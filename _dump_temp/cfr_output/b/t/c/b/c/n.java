/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.c;

import b.o.d.mc;
import b.o.e.h;
import b.t.c.b.b.h.ab;
import b.t.c.b.b.h.c.k;
import b.t.c.b.b.h.c.o;
import b.t.c.b.b.h.c.q;
import b.t.c.b.c.l;
import b.t.c.b.dd;
import b.t.c.b.v$_b;
import b.t.c.b.v$_c;
import b.t.u;
import b.t.v;
import b.t.z;
import java.lang.reflect.Type;

public abstract class n
implements mc,
b.t.c.b.b.h.c.v,
k,
b.t.c.b.b.h.c.u,
b.t.c.b.b.h.c.h {
    private final v$_b \u00d4\u00d5\u00d8000;

    public n(h h2) {
        n n2 = this;
        v$_b v$_b = h2 instanceof v$_b ? (v$_b)h2 : null;
        if (v$_b == null) {
            h h3 = h2;
            if (h3 != null) {
                h2 = h3;
                n n3 = n2;
                v$_b = b.t.c.b.v.super(h2);
                n2 = n3;
            } else {
                v$_b = null;
            }
        }
        n2.\u00d4\u00d5\u00d8000 = v$_b;
    }

    protected final v$_b \u00f5\u00d8\u00d2000() {
        return this.\u00d4\u00d5\u00d8000;
    }

    @Override
    public Type \u00d3\u00f80000() {
        v$_b v$_b = this.\u00d4\u00d5\u00d8000;
        if (v$_b != null) {
            return (Type)((v$_c)v$_b).newreturn();
        }
        return null;
    }

    public abstract n \u00d3o0000(boolean var1);

    public abstract n nullsuper(boolean var1);

    public abstract u nulldosuper();

    public abstract boolean privatedosuper();

    public abstract boolean fordosuper();

    public abstract boolean \u00d5\u00d8\u00d2000();

    public abstract boolean \u00d3\u00d8\u00d2000();

    public abstract z \u00f4\u00d8\u00d2000();

    public abstract n \u00d8\u00d8\u00d2000();

    public abstract n \u00d4\u00d8\u00d2000();

    public boolean equals(Object object) {
        return object instanceof n && ab.o00000.o00000((o)l.\u00d800000, (q)this, (q)object);
    }

    public int hashCode() {
        v v2 = this.privatevoid();
        return 31 * (31 * (v2 != null ? v2.hashCode() : 0) + ((Object)this.\u00f5\u00f60000()).hashCode()) + Boolean.hashCode(this.\u00f4\u00f60000());
    }

    public String toString() {
        return dd.super(dd.o00000, this, false, 2, null);
    }
}

