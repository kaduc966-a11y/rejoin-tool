/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.h;

import b.o.d.fc;
import b.t.c.b.b.b.d;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.b;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.sb;
import b.t.c.b.b.q.wb;
import java.util.Collection;

public final class c {
    public static final boolean o00000(hc iterator) {
        sb sb2 = iterator instanceof sb ? (sb)((Object)iterator) : null;
        if (sb2 == null) {
            return false;
        }
        iterator = sb2;
        if (eb.super(sb2.\u00d50O000())) {
            return false;
        }
        if (b.new(iterator.\u00f5\u00f6o000())) {
            return false;
        }
        if (n.\u00d600000(iterator.\u00f5\u00f6o000())) {
            return false;
        }
        if (!((iterator = (Iterable)iterator.\u00f5\u00d8o000()) instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                if (!c.o00000(((jc)iterator.next()).forclasssuper())) continue;
                return true;
            }
        }
        return false;
    }

    public static final boolean o00000(wb wb2) {
        return b.new(wb2) && !c.o00000((ib)wb2);
    }

    public static final boolean \u00d200000(rc rc2) {
        kb kb2 = rc2.thisdosuper().\u00f4OO000();
        if (kb2 != null) {
            kb kb3 = kb2;
            return b.\u00d300000(kb2) && c.o00000(kb3) || b.\u00d300000(rc2);
        }
        return false;
    }

    private static final boolean o00000(rc rc2) {
        return c.\u00d200000(rc2) || c.o00000(rc2, true);
    }

    private static final boolean o00000(ib ib2) {
        return fc.o00000((Object)b.t.c.b.b.o.f.b.\u00d800000(ib2), (Object)d.forsuper);
    }

    private static final boolean o00000(rc i2, boolean bl) {
        i i3 = (i2 = i2.thisdosuper().\u00f4OO000()) instanceof i ? (i)i2 : null;
        if (i3 == null) {
            return false;
        }
        i2 = i3;
        return (bl || !b.o00000((wb)i2)) && c.o00000(b.t.c.b.b.h.b.b.\u00d200000((i)i2));
    }
}

