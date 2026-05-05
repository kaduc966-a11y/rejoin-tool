/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.h;

import b.s.mc;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.b.b;
import b.t.c.b.b.n.c.d.c.e;
import b.t.c.b.b.n.c.d.d;
import b.t.c.b.b.n.c.f.c;
import b.t.c.b.b.q.ib;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f {
    private final d super;
    private final c \u00d200000;

    public f(d d2, c c2) {
        this.super = d2;
        this.\u00d200000 = c2;
    }

    public final d o00000() {
        return this.super;
    }

    public final ib o00000(b object) {
        Object object2 = object.Oo0000();
        if (object2 != null && object.\u00f4o0000() == b.t.c.b.b.n.c.b.k.\u00d300000) {
            return this.\u00d200000.o00000((k)object2);
        }
        b b2 = object.\u00d8o0000();
        if (b2 != null) {
            object2 = b2;
            ib ib2 = this.o00000((b)object2);
            b.t.c.b.b.o.e.f f2 = ib2 != null ? ib2.\u00d3o\u00d2000() : null;
            object = f2 != null ? f2.\u00d200000(object.oO0000(), b.t.c.b.b.j.b.f.\u00f600000) : null;
            if (object instanceof ib) {
                return (ib)object;
            }
            return null;
        }
        if (object2 == null) {
            return null;
        }
        e e2 = (e)mc.\u00f5O0000(this.super.o00000(((k)object2).\u00d300000()));
        if (e2 != null) {
            return e2.o00000((b)object);
        }
        return null;
    }
}

