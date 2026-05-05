/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.qd;
import b.t.c.b.b.f.b.b.i;
import b.t.c.b.b.f.b.b.o;
import b.t.c.b.b.h.w;
import b.t.c.b.b.n.b.r;
import b.t.c.b.b.q.d.c.n;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.ib;
import b.t.c.b.h;
import b.t.c.b.hd;
import b.t.c.b.j$_b;
import b.t.c.b.jc;
import b.t.c.b.lb;
import b.t.c.b.nb;
import b.t.c.b.xb;
import b.t.c.b.y;
import b.t.c.b.z;
import b.t.c.e;
import b.t.l;

public final class j {
    private static final l \u00d200000(w w2) {
        switch (j$_b.o00000[w2.ordinal()]) {
            case 1: {
                return l.\u00d500000;
            }
            case 2: {
                return l.new;
            }
            case 3: {
                return l.o00000;
            }
        }
        throw new qd();
    }

    public static final z o00000(b.t.c.b.b.q.i wb2) {
        if ((wb2 = wb2.\u00d8\u00f80000()) instanceof ib) {
            return j.o00000((ib)wb2);
        }
        if (wb2 instanceof hc) {
            h h2;
            Object object = ((hc)wb2).\u00d8\u00f80000();
            if (object instanceof ib) {
                h2 = j.o00000((ib)object);
            } else {
                object = wb2;
                o o2 = object instanceof o ? (o)object : null;
                if (o2 == null) {
                    throw new lb("Non-class callable descriptor must be deserialized: ".concat(String.valueOf(wb2)));
                }
                h2 = j.o00000(o2);
            }
            object = h2;
            return (z)wb2.o00000(new nb((h)object), b.i.o00000);
        }
        throw new lb("Unknown type parameter container: ".concat(String.valueOf(wb2)));
    }

    private static final b.t.c.b.r o00000(ib ib2) {
        Class clazz = hd.super(ib2);
        b.t.c.b.r r2 = (b.t.c.b.r)(clazz != null ? b.o.r.o00000(clazz) : null);
        if (r2 == null) {
            throw new lb("Type parameter container is not resolved: " + ib2.\u00d8\u00f80000());
        }
        return r2;
    }

    private static final h o00000(o o2) {
        i i2 = o2.\u00d5\u00d8o000();
        if (i2 instanceof r) {
            b.t.c.b.b.n.b.j j2 = ((r)i2).\u00f600000();
            Object object = j2 instanceof n ? (n)j2 : null;
            if (object == null || (object = ((n)object).\u00d400000()) == null || (object = (jc)b.o.d.z.o00000((Class)object)) == null) {
                throw new lb("Container of top-level deserialized member is not resolved: " + o2 + " (" + ((r)i2).\u00f600000());
            }
            return (h)object;
        }
        if (i2 instanceof y) {
            return ((y)i2).OO0000();
        }
        if (i2 instanceof e) {
            return xb.StringObjectObject;
        }
        throw new lb("Container of deserialized member is not resolved: ".concat(String.valueOf(o2)));
    }

    public static final /* synthetic */ l o00000(w w2) {
        return j.\u00d200000(w2);
    }
}

