/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.o.d.w;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.s;
import b.t.c.b.b.i.l;
import b.t.c.b.b.o.d;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b;
import b.t.c.b.b.q.b.i;
import b.t.c.b.b.q.b.j;
import b.t.c.b.b.q.b.q;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.sb;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j$_c {
    private j$_c() {
    }

    private final kc super(h h2) {
        if (h2.\u00f8\u00d6o000() == null) {
            return null;
        }
        return kc.o00000(h2.ifStringsuper());
    }

    public final q super(l object, h h2, sb object2) {
        List list;
        mc mc2;
        mc mc3;
        kc kc2 = this.super(h2);
        if (kc2 == null) {
            return null;
        }
        kc kc3 = kc2;
        sb sb2 = object2.return(kc3);
        if (sb2 == null) {
            return null;
        }
        b.t.c.b.b.q.e.i i2 = sb2;
        object = new j((l)object, h2, (sb)i2, null, object2.\u00d4\u00f80000(), object2.O\u00f5o000(), h2.\u00f4\u00f80000(), null);
        List list2 = i.o00000((ic)object, object2.\u00f5\u00d8o000(), kc3);
        if (list2 == null) {
            return null;
        }
        List list3 = list2;
        i2 = s.o00000(b.t.c.b.b.h.q.\u00d300000(i2.\u00d3\u00f4o000().\u00d8\u00d6\u00d2000()), h2.nullint());
        mc mc4 = object2.Stringclasssuper();
        if (mc4 != null) {
            mc3 = mc4;
            mc2 = d.o00000((b)object, kc3.new(mc3.forclasssuper(), b.t.c.b.b.h.w.\u00d400000), o.\u00d8o\u00f6000.o00000());
        } else {
            mc2 = null;
        }
        mc3 = mc2;
        ib ib2 = h2.\u00f8\u00d6o000();
        if (ib2 != null) {
            Object object3 = object2 = (Iterable)object2.\u00d4\u00f4o000();
            object2 = new ArrayList(b.s.mc.o00000((Iterable)object2, 10));
            int n2 = 0;
            object3 = object3.iterator();
            while (object3.hasNext()) {
                int n3;
                Object object4 = object3.next();
                if ((n3 = n2++) < 0) {
                    b.s.mc.\u00d800000();
                }
                object4 = (mc)object4;
                Object object5 = object2;
                object5.add(d.o00000(ib2, kc3.new(object4.forclasssuper(), b.t.c.b.b.h.w.\u00d400000), ((b.t.c.b.b.o.e.b.i)object4.\u00f4O\u00d2000()).Object(), o.\u00d8o\u00f6000.o00000(), n3));
            }
            list = (List)object2;
        } else {
            list = b.s.mc.\u00d500000();
        }
        object2 = list;
        ((i)object).o00000(mc3, null, (List)object2, h2.\u00d8\u00d6o000(), list3, (rc)i2, ab.\u00d600000, h2.\u00d50O000());
        return (q)object;
    }

    public static final /* synthetic */ kc super(j$_c j$_c, h h2) {
        return j$_c.super(h2);
    }

    public /* synthetic */ j$_c(w w2) {
        this();
    }
}

