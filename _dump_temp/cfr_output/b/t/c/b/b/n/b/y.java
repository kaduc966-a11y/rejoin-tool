/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.c.b;
import b.t.c.b.b.l.c.b$_i;
import b.t.c.b.b.l.c.b.d;
import b.t.c.b.b.l.c.b.d$_b;
import b.t.c.b.b.l.c.b.e;
import b.t.c.b.b.l.d.g;
import b.t.c.b.b.n.b.t;
import b.t.c.b.b.p.d$_c;

public final class y {
    public static final t o00000(b$_n object, b.t.c.b.b.l.d.e e2, b.t.c.b.b.l.d.d d2, boolean bl, boolean bl2, boolean bl3) {
        b$_i b$_i = (b$_i)g.super((d$_c)object, b.o00000);
        if (b$_i == null) {
            return null;
        }
        b$_i b$_i2 = b$_i;
        if (bl) {
            d$_b d$_b = e.\u00d200000.super((b$_n)object, e2, d2, bl3);
            if (d$_b == null) {
                return null;
            }
            object = d$_b;
            return t.new.o00000((d)object);
        }
        if (bl2 && b$_i2.\u00d4\u00d50000()) {
            return t.new.o00000(e2, b$_i2.\u00d3\u00d50000());
        }
        return null;
    }

    public static /* synthetic */ t o00000(b$_n b$_n, b.t.c.b.b.l.d.e e2, b.t.c.b.b.l.d.d d2, boolean bl, boolean bl2, boolean bl3, int n2, Object object) {
        if ((n2 & 8) != 0) {
            bl = false;
        }
        if ((n2 & 0x10) != 0) {
            bl2 = false;
        }
        if ((n2 & 0x20) != 0) {
            bl3 = true;
        }
        return y.o00000(b$_n, e2, d2, bl, bl2, bl3);
    }
}

