/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.o.d.fc;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.b.m;
import b.t.c.b.b.n.c.cb;
import b.t.c.b.b.n.c.d;
import b.t.c.b.b.n.c.d.h;
import b.t.c.b.b.n.c.e.b;
import b.t.c.b.b.n.c.fb;
import b.t.c.b.b.n.c.i;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.s;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class db {
    public static final s super(ac ac2) {
        return fb.o00000(ac2);
    }

    public static final boolean super(d d2) {
        return d2.\u00d300000().\u00f800000(i.new()) == cb.super;
    }

    public static final boolean super(hc hc2) {
        return hc2 instanceof ic && fc.o00000(hc2.o00000(b.\u00d5\u00d2\u00d6000), (Object)Boolean.TRUE);
    }

    public static final l super(b.t.c.b.b.n.c.d.i iterator, m m22) {
        m m3;
        block4: {
            if (!(m22.\u00d5\u00d50000() != null)) {
                iterator = "Nullability annotations on unbounded wildcards aren't supported";
                throw new IllegalArgumentException(iterator.toString());
            }
            for (m m22 : (Iterable)new h((b.t.c.b.b.n.c.d.i)((Object)iterator), m22, false, 4, null)) {
                boolean bl;
                block3: {
                    l l2 = (l)((Object)m22);
                    for (k k2 : i.o00000()) {
                        if (!fc.o00000((Object)l2.\u00d300000(), (Object)k2)) continue;
                        bl = true;
                        break block3;
                    }
                    bl = false;
                }
                if (!bl) continue;
                m3 = m22;
                break block4;
            }
            m3 = null;
        }
        return (l)((Object)m3);
    }
}

