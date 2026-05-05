/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.o.d.w;
import b.t.c.b.b.h.cb;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.e.e;
import b.t.c.b.b.h.e.g;
import b.t.c.b.b.h.e.g$_b;
import b.t.c.b.b.h.e.q;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.uc;
import b.t.c.b.b.o.i;

public final class k
implements q {
    private final b \u00d500000;
    private final g String;
    private final i \u00d300000;

    public k(b b2, g g2) {
        this.\u00d500000 = b2;
        this.String = g2;
        this.\u00d300000 = i.o00000(this.o00000());
    }

    public /* synthetic */ k(b b2, g g2, int n2, w w2) {
        if ((n2 & 2) != 0) {
            g2 = g$_b.new;
        }
        this(b2, g2);
    }

    @Override
    public final b o00000() {
        return this.\u00d500000;
    }

    public final g Object() {
        return this.String;
    }

    @Override
    public final i \u00d200000() {
        return this.\u00d300000;
    }

    @Override
    public final boolean o00000(rc rc2, rc rc3) {
        k k2 = this;
        b b2 = k2.o00000();
        g g2 = this.Object();
        return k2.o00000(e.o00000(true, false, null, g2, b2, 6, null), rc2.\u00d8\u00d6\u00d2000(), rc3.\u00d8\u00d6\u00d2000());
    }

    @Override
    public final boolean \u00d200000(rc rc2, rc rc3) {
        k k2 = this;
        b b2 = k2.o00000();
        g g2 = this.Object();
        return k2.\u00d200000(e.o00000(false, false, null, g2, b2, 6, null), rc2.\u00d8\u00d6\u00d2000(), rc3.\u00d8\u00d6\u00d2000());
    }

    public final boolean \u00d200000(cb cb2, l l2, l l3) {
        return uc.\u00d200000.\u00d200000(cb2, l2, l3);
    }

    public final boolean o00000(cb cb2, l l2, l l3) {
        return uc.super(uc.\u00d200000, cb2, l2, l3, false, 8, null);
    }
}

