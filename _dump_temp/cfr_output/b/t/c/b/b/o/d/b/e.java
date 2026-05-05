/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.d.b;

import b.qb;
import b.s.mc;
import b.s.z;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.i.h;
import b.t.c.b.b.o.d.b.c;
import b.t.c.b.b.o.d.b.d;
import b.t.c.b.b.o.d.b.e$_b$2;
import b.t.c.b.b.o.d.b.e$_c$0;
import b.t.c.b.b.q.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    public static final rc o00000(hc hc2) {
        return new d(hc2, null, false, null, 14, null);
    }

    public static final boolean o00000(rc rc2) {
        return rc2.thisdosuper() instanceof c;
    }

    public static final b.t.c.b.b.h.h o00000(b.t.c.b.b.h.h iArray, boolean bl) {
        if (iArray instanceof b.t.c.b.b.h.qb) {
            i[] iArray2 = ((b.t.c.b.b.h.qb)iArray).return();
            iArray = z.\u00d600000((Object[])((b.t.c.b.b.h.qb)iArray).\u00d800000(), ((b.t.c.b.b.h.qb)iArray).return());
            i[] iArray3 = iArray2;
            Object iArray4 = iArray;
            iArray = new ArrayList(mc.o00000((Iterable)iArray, 10));
            iArray4 = iArray4.iterator();
            while (iArray4.hasNext()) {
                Object e2 = iArray4.next();
                qb object = (qb)e2;
                Object object2 = iArray;
                object2.add(e.new((hc)object.new(), (i)object.o00000()));
            }
            boolean bl2 = bl;
            hc[] hcArray = ((Collection)((List)iArray)).toArray(new hc[0]);
            iArray4 = iArray3;
            return new b.t.c.b.b.h.qb((i[])iArray4, hcArray, bl2);
        }
        return new e$_b$2((b.t.c.b.b.h.h)iArray, bl);
    }

    public static /* synthetic */ b.t.c.b.b.h.h o00000(b.t.c.b.b.h.h h2, boolean bl, int n2, Object object) {
        if ((n2 & 1) != 0) {
            bl = true;
        }
        return e.o00000(h2, bl);
    }

    private static final hc new(hc hc2, i i2) {
        if (i2 == null || hc2.\u00d200000() == w.\u00d400000) {
            return hc2;
        }
        if (i2.\u00d4\u00d5o000() == hc2.\u00d200000()) {
            if (hc2.super()) {
                return new lc(new b.t.c.b.b.h.e(h.\u00d500000, new e$_c$0(hc2)));
            }
            return new lc(hc2.\u00d300000());
        }
        return new lc(e.o00000(hc2));
    }

    private static final rc \u00d300000(hc hc2) {
        return hc2.\u00d300000();
    }

    public static final /* synthetic */ hc o00000(hc hc2, i i2) {
        return e.new(hc2, i2);
    }

    static /* synthetic */ rc new(hc hc2) {
        return e.\u00d300000(hc2);
    }
}

