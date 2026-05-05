/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.g.c;
import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.o.m;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.pc$_b$0;
import b.t.c.b.b.q.pc$_c$_b$1;
import b.t.c.b.b.q.t;
import b.t.c.b.b.q.wb;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class pc {
    public static final kb new(bc bc2, d d2) {
        wb wb2;
        wb wb3;
        Iterator iterator;
        wb wb4;
        block15: {
            bc bc3 = m.o00000(bc2);
            if (bc3 == null) {
                wb wb5 = bc2.new(d2.\u00d800000());
                List list = d2.\u00d400000().class();
                kb kb2 = wb5.\u00f8\u00f80000().\u00d200000((f)mc.Oo0000(list), b.t.c.b.b.j.b.f.null);
                if (kb2 == null) {
                    return null;
                }
                wb5 = kb2;
                for (f f2 : list.subList(1, list.size())) {
                    if (!(wb5 instanceof ib)) {
                        return null;
                    }
                    ib ib2 = (wb5 = ((ib)wb5).\u00d3o\u00d2000().\u00d200000(f2, b.t.c.b.b.j.b.f.null)) instanceof ib ? (ib)wb5 : null;
                    if (ib2 == null) {
                        return null;
                    }
                    wb5 = ib2;
                }
                return wb5;
            }
            wb4 = bc3.new(d2.\u00d800000());
            iterator = d2.\u00d400000().class();
            kb kb3 = wb4.\u00f8\u00f80000().\u00d200000((f)mc.Oo0000((List)((Object)iterator)), b.t.c.b.b.j.b.f.null);
            if (kb3 == null) {
                wb3 = null;
            } else {
                wb4 = kb3;
                for (f f3 : iterator.subList(1, iterator.size())) {
                    if (!(wb4 instanceof ib)) {
                        wb3 = null;
                        break block15;
                    }
                    ib ib3 = (wb4 = ((ib)wb4).\u00d3o\u00d2000().\u00d200000(f3, b.t.c.b.b.j.b.f.null)) instanceof ib ? (ib)wb4 : null;
                    if (ib3 == null) {
                        wb3 = null;
                        break block15;
                    }
                    wb4 = ib3;
                }
                wb3 = wb2 = wb4;
            }
        }
        if (wb3 == null) {
            wb4 = bc2.new(d2.\u00d800000());
            iterator = d2.\u00d400000().class();
            kb kb4 = wb4.\u00f8\u00f80000().\u00d200000((f)mc.Oo0000((List)((Object)iterator)), b.t.c.b.b.j.b.f.null);
            if (kb4 == null) {
                return null;
            }
            wb4 = kb4;
            for (f f3 : iterator.subList(1, iterator.size())) {
                if (!(wb4 instanceof ib)) {
                    return null;
                }
                ib ib4 = (wb4 = ((ib)wb4).\u00d3o\u00d2000().\u00d200000(f3, b.t.c.b.b.j.b.f.null)) instanceof ib ? (ib)wb4 : null;
                if (ib4 == null) {
                    return null;
                }
                wb4 = ib4;
            }
            wb2 = wb4;
        }
        return wb2;
    }

    public static final ib \u00d300000(bc wb2, d d2) {
        if ((wb2 = pc.new(wb2, d2)) instanceof ib) {
            return (ib)wb2;
        }
        return null;
    }

    public static final ib o00000(bc object, d d2, t t2) {
        if ((object = pc.\u00d300000((bc)object, d2)) != null) {
            return object;
        }
        object = c.\u00d6o0000(c.\u00f5\u00d30000(c.o00000((Object)d2, (g)pc$_c$_b$1.\u00d5o\u00d3000), pc$_b$0.\u00d4\u00d3\u00d5000));
        return t2.o00000(d2, (List)object);
    }

    public static final h o00000(bc wb2, d d2) {
        if ((wb2 = pc.new(wb2, d2)) instanceof h) {
            return (h)wb2;
        }
        return null;
    }

    private static final int new(d d2) {
        return 0;
    }

    static /* synthetic */ int o00000(d d2) {
        return pc.new(d2);
    }
}

