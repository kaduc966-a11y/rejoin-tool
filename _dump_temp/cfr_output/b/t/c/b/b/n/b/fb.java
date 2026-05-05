/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.e.e;
import b.q.f;
import b.t.c.b.b.d.j;
import b.t.c.b.b.d.k;
import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.eb;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.pc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.n.b.ab;
import b.t.c.b.b.n.b.c;
import b.t.c.b.b.n.b.cb;
import b.t.c.b.b.n.b.g;
import b.t.c.b.b.n.b.m;
import b.t.c.b.b.n.b.s;
import b.t.c.b.b.q.ec;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.vb;
import b.t.c.b.b.q.wb;

public final class fb {
    public static final Object o00000(rc object, g g2, m m2, ab ab2, c c2, e e2) {
        while (true) {
            Object object2;
            Object object3;
            if ((object3 = ab2.super((rc)object)) != null) {
                object = object3;
                continue;
            }
            if (b.t.c.b.b.b.g.o00000((rc)object)) {
                object = b.t.c.b.b.b.b.super((rc)object);
                continue;
            }
            object3 = s.super(b.t.c.b.b.h.e.s.o00000, (q)object, g2, m2);
            if (object3 != null) {
                object2 = object3;
                object2 = s.super(g2, object2, m2.\u00d300000());
                e2.o00000(object, object2, m2);
                return object2;
            }
            object3 = ((rc)object).thisdosuper();
            if (object3 instanceof pc) {
                rc rc2 = ((pc)object3).O\u00d2O000();
                if (rc2 == null) {
                    rc2 = ab2.super(((pc)object3).\u00d5OO000());
                }
                object = b.\u00d600000(rc2);
                continue;
            }
            kb kb2 = object3.\u00f4OO000();
            if (kb2 == null) {
                throw new UnsupportedOperationException("no descriptor for type constructor of ".concat(String.valueOf(object)));
            }
            object3 = kb2;
            if (b.t.c.b.b.h.d.k.o00000(kb2)) {
                object2 = g2.o00000("error/NonExistentClass");
                ab2.super((rc)object, (ib)object3);
                c c3 = c2;
                if (c3 != null) {
                    c3.o00000(object2);
                }
                return object2;
            }
            if (object3 instanceof ib && b.t.c.b.b.b.c.\u00d800000((rc)object)) {
                if (((rc)object).\u00d4\u00d6\u00d2000().size() != 1) {
                    throw new UnsupportedOperationException("arrays must have one type argument");
                }
                object2 = (hc)((rc)object).\u00d4\u00d6\u00d2000().get(0);
                object = object2.\u00d300000();
                if (object2.\u00d200000() == w.o00000) {
                    object2 = g2.o00000("java/lang/Object");
                    c c4 = c2;
                    if (c4 != null) {
                        object = c4;
                        c4.\u00d200000();
                        ((c)object).o00000(object2);
                        ((c)object).o00000();
                    }
                } else {
                    c c5 = c2;
                    if (c5 != null) {
                        c5.\u00d200000();
                    }
                    object2 = fb.o00000((rc)object, g2, m2.o00000(object2.\u00d200000(), true), ab2, c2, e2);
                    c c6 = c2;
                    if (c6 != null) {
                        c6.o00000();
                    }
                }
                return g2.\u00d200000("[" + g2.o00000(object2));
            }
            if (object3 instanceof ib) {
                Object object4;
                if (b.t.c.b.b.o.b.\u00d300000((wb)object3) && !m2.\u00d200000() && (object2 = (rc)eb.\u00d300000(b.t.c.b.b.h.e.s.o00000, (q)object)) != null) {
                    m2 = m2.\u00d600000();
                    object = object2;
                    continue;
                }
                if (m2.o00000() && b.t.c.b.b.b.c.\u00d500000((ib)object3)) {
                    object4 = g2.o00000();
                } else {
                    object4 = ab2.\u00d300000(((ib)object3).\u00f4o\u00d2000());
                    if (object4 == null) {
                        ib ib2 = ((ib)object3).privateintsuper() == ec.\u00d400000 ? (ib)((ib)object3).\u00d8\u00f80000() : (ib)object3;
                        object4 = g2.o00000(fb.o00000(ib2.\u00f4o\u00d2000(), ab2));
                    }
                }
                object2 = object4;
                e2.o00000(object, object2, m2);
                return object2;
            }
            if (object3 instanceof i) {
                object2 = b.\u00d200000((i)object3);
                object2 = ((rc)object).\u00f5\u00d6\u00d2000() ? b.int((rc)object2) : object2;
                e e3 = b.t.c.b.b.m.f.o00000();
                object = fb.o00000((rc)object2, g2, m2, ab2, null, e3);
                c c7 = c2;
                if (c7 != null) {
                    c7.o00000(object3.\u00d5\u00f80000(), object);
                }
                return object;
            }
            if (!(object3 instanceof h) || !m2.\u00d500000()) break;
            object = ((h)object3).ifStringsuper();
        }
        throw new UnsupportedOperationException("Unknown type ".concat(String.valueOf(object)));
    }

    public static /* synthetic */ Object o00000(rc rc2, g g2, m m2, ab ab2, c c2, e e2, int n2, Object object) {
        if ((n2 & 0x20) != 0) {
            e2 = b.t.c.b.b.m.f.o00000();
        }
        return fb.o00000(rc2, g2, m2, ab2, c2, e2);
    }

    public static final boolean o00000(b.t.c.b.b.q.b b2) {
        if (b2 instanceof vb) {
            return true;
        }
        return b.t.c.b.b.b.c.for(b2.\u00d3\u00f4o000()) && !o.\u00d600000(b2.\u00d3\u00f4o000()) && !(b2 instanceof b.t.c.b.b.q.cb);
    }

    public static final String o00000(ib object, ab ab2) {
        Object object2 = ab2.\u00d200000((ib)object);
        if (object2 != null) {
            return object2;
        }
        object2 = object.\u00d8\u00f80000();
        String string = j.\u00d200000(object.\u00d5\u00f80000()).\u00d300000();
        if (object2 instanceof lc) {
            object = ((lc)object2).OOO000();
            if (((k)object).\u00d600000()) {
                return string;
            }
            return f.super(((k)object).super(), '.', '/', false, 4, null) + '/' + string;
        }
        ib ib2 = object2 instanceof ib ? (ib)object2 : null;
        if (ib2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + object2 + " for " + object);
        }
        object = ib2;
        String string2 = ab2.super((ib)object);
        if (string2 == null) {
            string2 = fb.o00000((ib)object, ab2);
        }
        object = string2;
        return (String)object + '$' + string;
    }

    public static /* synthetic */ String o00000(ib ib2, ab ab2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            ab2 = cb.super;
        }
        return fb.o00000(ib2, ab2);
    }
}

