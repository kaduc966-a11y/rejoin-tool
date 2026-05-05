/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.e.f;
import java.util.List;

public abstract class c
extends rc {
    public c() {
        super(null);
    }

    public boolean O\u00d8\u00d2000() {
        return true;
    }

    protected abstract rc \u00f8\u00d6\u00d2000();

    @Override
    public bc thisdosuper() {
        return this.\u00f8\u00d6\u00d2000().thisdosuper();
    }

    @Override
    public List \u00d4\u00d6\u00d2000() {
        return this.\u00f8\u00d6\u00d2000().\u00d4\u00d6\u00d2000();
    }

    @Override
    public boolean \u00f5\u00d6\u00d2000() {
        return this.\u00f8\u00d6\u00d2000().\u00f5\u00d6\u00d2000();
    }

    @Override
    public f \u00f4\u00d6\u00d2000() {
        return this.\u00f8\u00d6\u00d2000().\u00f4\u00d6\u00d2000();
    }

    @Override
    public zb \u00d5\u00d6\u00d2000() {
        return this.\u00f8\u00d6\u00d2000().\u00d5\u00d6\u00d2000();
    }

    @Override
    public final l \u00d8\u00d6\u00d2000() {
        rc rc2 = this.\u00f8\u00d6\u00d2000();
        while (rc2 instanceof c) {
            rc2 = ((c)rc2).\u00f8\u00d6\u00d2000();
        }
        return (l)rc2;
    }

    public String toString() {
        if (this.O\u00d8\u00d2000()) {
            return this.\u00f8\u00d6\u00d2000().toString();
        }
        return "<Not computed yet>";
    }
}

