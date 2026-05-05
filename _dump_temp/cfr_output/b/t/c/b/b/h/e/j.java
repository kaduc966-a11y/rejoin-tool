/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.h.c.ab;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.c.x;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.e.d;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.q.i;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j
extends ib
implements ab {
    private final x \u00d4\u00f6\u00d8000;
    private final d \u00d8\u00f6\u00d8000;
    private final l thisclassString;
    private final zb \u00d5\u00f6\u00d8000;
    private final boolean \u00f4\u00f6\u00d8000;
    private final boolean \u00f5\u00f6\u00d8000;

    public j(x x2, d d2, l l2, zb zb2, boolean bl, boolean bl2) {
        this.\u00d4\u00f6\u00d8000 = x2;
        this.\u00d8\u00f6\u00d8000 = d2;
        this.thisclassString = l2;
        this.\u00d5\u00f6\u00d8000 = zb2;
        this.\u00f4\u00f6\u00d8000 = bl;
        this.\u00f5\u00f6\u00d8000 = bl2;
    }

    public /* synthetic */ j(x x2, d d2, l l2, zb zb2, boolean bl, boolean bl2, int n2, w w2) {
        if ((n2 & 8) != 0) {
            zb2 = zb.ifreturnclass.Object();
        }
        if ((n2 & 0x10) != 0) {
            bl = false;
        }
        if ((n2 & 0x20) != 0) {
            bl2 = false;
        }
        this(x2, d2, l2, zb2, bl, bl2);
    }

    public final x \u00f4\u00f5\u00d2000() {
        return this.\u00d4\u00f6\u00d8000;
    }

    public final d \u00d8\u00f5\u00d2000() {
        return this.\u00d8\u00f6\u00d8000;
    }

    public final l \u00d5\u00f5\u00d2000() {
        return this.thisclassString;
    }

    @Override
    public final zb \u00d5\u00d6\u00d2000() {
        return this.\u00d5\u00f6\u00d8000;
    }

    @Override
    public final boolean \u00f5\u00d6\u00d2000() {
        return this.\u00f4\u00f6\u00d8000;
    }

    public final boolean thispublicsuper() {
        return this.\u00f5\u00f6\u00d8000;
    }

    public j(x x2, l l2, hc hc2, i i2) {
        this(x2, new d(hc2, null, null, i2, 6, null), l2, null, false, false, 56, null);
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
    public final ib new(zb zb2) {
        return new j(this.\u00d4\u00f6\u00d8000, this.\u00d8\u00f5\u00d2000(), this.thisclassString, zb2, ((rc)this).\u00f5\u00d6\u00d2000(), this.\u00f5\u00f6\u00d8000);
    }

    public final j privatesuper(boolean bl) {
        return new j(this.\u00d4\u00f6\u00d8000, this.\u00d8\u00f5\u00d2000(), this.thisclassString, ((rc)this).\u00d5\u00d6\u00d2000(), bl, false, 32, null);
    }

    public final j \u00d3o0000(b object) {
        Object object2;
        x x2;
        d d2;
        Object object3;
        x x3 = this.\u00d4\u00f6\u00d8000;
        d d3 = this.\u00d8\u00f5\u00d2000().\u00d300000((b)object);
        l l2 = this.thisclassString;
        if (l2 != null) {
            object3 = l2;
            d2 = d3;
            x2 = x3;
            object = ((b)object).\u00d200000((q)object3).\u00d8\u00d6\u00d2000();
            x3 = x2;
            d3 = d2;
            object2 = object;
        } else {
            object2 = null;
        }
        boolean bl = ((rc)this).\u00f5\u00d6\u00d2000();
        object3 = ((rc)this).\u00d5\u00d6\u00d2000();
        x2 = object2;
        d2 = d3;
        x x4 = x3;
        return new j(x4, d2, (l)((Object)x2), (zb)object3, bl, false, 32, null);
    }
}

