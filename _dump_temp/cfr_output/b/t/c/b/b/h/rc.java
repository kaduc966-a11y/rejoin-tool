/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.w;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.e.t;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.qc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.q.e.i;
import b.t.c.b.b.q.e.o;
import java.util.List;

public abstract class rc
implements i,
q {
    private int O\u00d5\u00d8000;

    private rc() {
    }

    public abstract bc thisdosuper();

    public abstract List \u00d4\u00d6\u00d2000();

    public abstract boolean \u00f5\u00d6\u00d2000();

    public abstract f \u00f4\u00d6\u00d2000();

    public abstract zb \u00d5\u00d6\u00d2000();

    @Override
    public o \u00d4\u00f80000() {
        return qc.\u00d200000(this.\u00d5\u00d6\u00d2000());
    }

    public abstract l \u00d8\u00d6\u00d2000();

    public abstract rc OO0000(b var1);

    private final int Stringdosuper() {
        if (hb.super(this)) {
            return super.hashCode();
        }
        int n2 = this.thisdosuper().hashCode();
        n2 = 31 * n2 + ((Object)this.\u00d4\u00d6\u00d2000()).hashCode();
        return 31 * n2 + (this.\u00f5\u00d6\u00d2000() ? 1 : 0);
    }

    public final int hashCode() {
        int n2 = this.O\u00d5\u00d8000;
        if (n2 != 0) {
            return n2;
        }
        this.O\u00d5\u00d8000 = n2 = this.Stringdosuper();
        return n2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rc)) {
            return false;
        }
        return this.\u00f5\u00d6\u00d2000() == ((rc)object).\u00f5\u00d6\u00d2000() && t.o00000.o00000(this.\u00d8\u00d6\u00d2000(), ((rc)object).\u00d8\u00d6\u00d2000());
    }

    public /* synthetic */ rc(w w2) {
        this();
    }
}

