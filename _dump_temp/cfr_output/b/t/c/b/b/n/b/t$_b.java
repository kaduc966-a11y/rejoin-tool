/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.w;
import b.qd;
import b.t.c.b.b.l.c.b$_f;
import b.t.c.b.b.l.c.b.d;
import b.t.c.b.b.l.c.b.d$_b;
import b.t.c.b.b.l.c.b.d$_c;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.n.b.t;

public final class t$_b {
    private t$_b() {
    }

    public final t o00000(e e2, b$_f b$_f) {
        return this.\u00d200000(e2.new(b$_f.\u00f8\u00d20000()), e2.new(b$_f.classnew()));
    }

    public final t \u00d200000(String string, String string2) {
        return new t(string + string2, null);
    }

    public final t o00000(String string, String string2) {
        return new t(string + '#' + string2, null);
    }

    public final t o00000(d d2) {
        d d3 = d2;
        if (d3 instanceof d$_c) {
            return this.\u00d200000(((d$_c)d2).\u00d300000(), ((d$_c)d2).\u00d200000());
        }
        if (d3 instanceof d$_b) {
            return this.o00000(((d$_b)d2).\u00d600000(), ((d$_b)d2).String());
        }
        throw new qd();
    }

    public final t o00000(t t2, int n2) {
        return new t(t2.super() + '@' + n2, null);
    }

    public /* synthetic */ t$_b(w w2) {
        this();
    }
}

