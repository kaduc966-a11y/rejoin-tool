/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.qd;
import b.s.mc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.c.o;
import b.t.c.b.b.o.c.t$_b;
import b.t.c.b.b.o.c.t$_b$_b;
import b.t.c.b.b.o.c.t$_b$_c;
import b.t.c.b.b.o.c.t$_c;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.pc;

public final class t
extends j {
    public static final t$_c \u00d600000 = new t$_c(null);

    public t(t$_b t$_b) {
        super(t$_b);
    }

    public t(o o2) {
        this(new t$_b$_b(o2));
    }

    public t(d d2, int n2) {
        this(new o(d2, n2));
    }

    @Override
    public final rc o00000(bc bc2) {
        return oc.o00000(zb.ifreturnclass.Object(), bc2.returnforsuper().null(), mc.o00000(new lc(this.\u00f500000(bc2))));
    }

    public final rc \u00f500000(bc bc2) {
        Object object = (t$_b)this.o00000();
        if (object instanceof t$_b$_c) {
            return ((t$_b$_c)this.o00000()).o00000();
        }
        if (object instanceof t$_b$_b) {
            object = ((t$_b$_b)this.o00000()).\u00d300000();
            Object object2 = ((o)object).o00000();
            int n2 = ((o)object).\u00d200000();
            ib ib2 = pc.\u00d300000(bc2, (d)object2);
            if (ib2 == null) {
                String[] stringArray = new String[2];
                String[] stringArray2 = stringArray;
                stringArray[0] = ((d)object2).toString();
                stringArray2[1] = String.valueOf(n2);
                return k.new(c.\u00d2o0000, stringArray2);
            }
            object2 = b.\u00d600000((rc)ib2.nullint());
            for (int i2 = 0; i2 < n2; ++i2) {
                object2 = bc2.returnforsuper().o00000(w.\u00d400000, (rc)object2);
            }
            return (rc)object2;
        }
        throw new qd();
    }
}

