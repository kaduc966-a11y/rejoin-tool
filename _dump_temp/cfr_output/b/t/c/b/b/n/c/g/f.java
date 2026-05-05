/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.s.mc;
import b.t.c.b.b.b.c.h;
import b.t.c.b.b.h.e.s;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.c.ab;
import b.t.c.b.b.n.c.g.d;
import b.t.c.b.b.n.c.g.e;
import b.t.c.b.b.n.c.g.f$_b;
import b.t.c.b.b.n.c.g.k;
import b.t.c.b.b.n.c.g.m;
import b.t.c.b.b.n.c.g.n;
import b.t.c.b.b.n.c.g.p;
import b.t.c.b.b.n.c.g.t;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f {
    private static final o super = new t(ab.\u00d8O0000);
    private static final t \u00d200000 = new t(ab.o00000);

    public static final boolean o00000(rc rc2) {
        return k.o00000(s.o00000, rc2);
    }

    private static final o o00000(List list) {
        switch (list.size()) {
            case 0: {
                throw new IllegalStateException("At least one Annotations object expected".toString());
            }
            case 1: {
                return (o)mc.\u00d5O0000(list);
            }
        }
        return new b.t.c.b.b.q.e.k(mc.\u00f5O0000((Iterable)list));
    }

    private static final kb o00000(kb kb2, m m2, e e2) {
        h h2 = h.o00000;
        if (n.o00000(e2) && kb2 instanceof ib) {
            if (m2.\u00d300000() == p.\u00d400000 && e2 == e.new && h2.\u00d400000((ib)kb2)) {
                return h2.o00000((ib)kb2);
            }
            if (m2.\u00d300000() == p.Object && e2 == e.\u00d400000 && h2.\u00d300000((ib)kb2)) {
                return h2.new((ib)kb2);
            }
        }
        return null;
    }

    private static final Boolean o00000(m m2, e e2) {
        if (!n.o00000(e2)) {
            return null;
        }
        d d2 = m2.String();
        switch (d2 == null ? -1 : f$_b.o00000[d2.ordinal()]) {
            case 1: {
                return Boolean.TRUE;
            }
            case 2: {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public static final o \u00d200000() {
        return super;
    }

    public static final /* synthetic */ kb \u00d200000(kb kb2, m m2, e e2) {
        return f.o00000(kb2, m2, e2);
    }

    public static final /* synthetic */ Boolean \u00d200000(m m2, e e2) {
        return f.o00000(m2, e2);
    }

    public static final /* synthetic */ o \u00d200000(List list) {
        return f.o00000(list);
    }

    public static final /* synthetic */ t o00000() {
        return \u00d200000;
    }
}

