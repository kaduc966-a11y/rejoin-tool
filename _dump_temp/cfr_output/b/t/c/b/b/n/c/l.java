/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.g.c;
import b.s.mc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.c.d.b.h;
import b.t.c.b.b.n.c.e.b;
import b.t.c.b.b.n.c.l$_b$0;
import b.t.c.b.b.n.c.l$_c;
import b.t.c.b.b.o.f;
import b.t.c.b.b.o.f$_b;
import b.t.c.b.b.o.f$_c;
import b.t.c.b.b.o.i;
import b.t.c.b.b.o.i$_b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.qb;
import java.util.Collection;

public final class l
implements f {
    @Override
    public final f$_c o00000(b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3, ib object) {
        boolean bl;
        block7: {
            if (!(b3 instanceof b) || !((Collection)((b)b3).\u00f8\u00d8o000()).isEmpty()) {
                return f$_c.\u00d300000;
            }
            i$_b i$_b = i.\u00d400000(b2, b3);
            if ((i$_b != null ? i$_b.\u00d200000() : null) != null) {
                return f$_c.\u00d300000;
            }
            b.t.c.b.b.q.mc mc2 = ((b)b3).nullclasssuper();
            object = c.\u00d200000(c.null(c.\u00f5\u00d30000(mc.\u00d5o0000(((b)b3).\u00f5\u00d8o000()), l$_b$0.\u00d80\u00d5000), ((b)b3).\u00d3\u00f4o000()), (Iterable)mc.new((Object)(mc2 != null ? mc2.forclasssuper() : null))).o00000();
            while (object.hasNext()) {
                rc rc2 = (rc)object.next();
                if (!(!((Collection)rc2.\u00d4\u00d6\u00d2000()).isEmpty() && !(rc2.\u00d8\u00d6\u00d2000() instanceof h))) continue;
                bl = true;
                break block7;
            }
            bl = false;
        }
        if (bl) {
            return f$_c.\u00d300000;
        }
        b.t.c.b.b.q.b b4 = (b.t.c.b.b.q.b)b2.o00000(new b.t.c.b.b.n.c.d.b.b(null, 1, null).\u00d400000());
        if (b4 == null) {
            return f$_c.\u00d300000;
        }
        object = b4;
        if (b4 instanceof qb && !((Collection)((qb)object).\u00f8\u00d8o000()).isEmpty()) {
            object = ((qb)object).ifreturnsuper().new(mc.\u00d500000()).\u00d500000();
        }
        if (l$_c.o00000[i.o00000.o00000((b.t.c.b.b.q.b)object, b3, false).\u00d200000().ordinal()] == 1) {
            return f$_c.\u00d400000;
        }
        return f$_c.\u00d300000;
    }

    @Override
    public final f$_b o00000() {
        return f$_b.\u00d300000;
    }

    private static final rc o00000(jc jc2) {
        return jc2.forclasssuper();
    }

    static /* synthetic */ rc \u00d200000(jc jc2) {
        return l.o00000(jc2);
    }
}

