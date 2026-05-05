/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.d.b;

import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.h.c.ab;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.d.b.b;
import b.t.c.b.b.o.d.b.c;
import b.t.c.b.b.o.e.f;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
extends ib
implements ab {
    private final hc O\u00f6\u00d8000;
    private final c whileStringString;
    private final boolean \u00d3\u00f6\u00d8000;
    private final zb o\u00f6\u00d8000;

    public d(hc hc2, c c2, boolean bl, zb zb2) {
        this.O\u00f6\u00d8000 = hc2;
        this.whileStringString = c2;
        this.\u00d3\u00f6\u00d8000 = bl;
        this.o\u00f6\u00d8000 = zb2;
    }

    public /* synthetic */ d(hc hc2, c c2, boolean bl, zb zb2, int n2, w w2) {
        if ((n2 & 2) != 0) {
            c2 = new b(hc2);
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        if ((n2 & 8) != 0) {
            zb2 = zb.ifreturnclass.Object();
        }
        this(hc2, c2, bl, zb2);
    }

    public final c \u00d4\u00f5\u00d2000() {
        return this.whileStringString;
    }

    @Override
    public final boolean \u00f5\u00d6\u00d2000() {
        return this.\u00d3\u00f6\u00d8000;
    }

    @Override
    public final zb \u00d5\u00d6\u00d2000() {
        return this.o\u00f6\u00d8000;
    }

    @Override
    public final List \u00d4\u00d6\u00d2000() {
        return mc.\u00d500000();
    }

    @Override
    public final f \u00f4\u00d6\u00d2000() {
        return k.o00000(b.t.c.b.b.h.d.d.\u00f600000, true, new String[0]);
    }

    @Override
    public final String toString() {
        return "Captured(" + this.O\u00f6\u00d8000 + ')' + (((rc)this).\u00f5\u00d6\u00d2000() ? "?" : "");
    }

    public final d \u00f5o0000(boolean bl) {
        if (bl == ((rc)this).\u00f5\u00d6\u00d2000()) {
            return this;
        }
        return new d(this.O\u00f6\u00d8000, this.\u00d4\u00f5\u00d2000(), bl, ((rc)this).\u00d5\u00d6\u00d2000());
    }

    @Override
    public final ib new(zb zb2) {
        return new d(this.O\u00f6\u00d8000, this.\u00d4\u00f5\u00d2000(), ((rc)this).\u00f5\u00d6\u00d2000(), zb2);
    }

    public final d nullsuper(b.t.c.b.b.h.e.b b2) {
        return new d(this.O\u00f6\u00d8000.super(b2), this.\u00d4\u00f5\u00d2000(), ((rc)this).\u00f5\u00d6\u00d2000(), ((rc)this).\u00d5\u00d6\u00d2000());
    }
}

