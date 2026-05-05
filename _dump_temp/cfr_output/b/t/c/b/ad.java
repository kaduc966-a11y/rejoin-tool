/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.s.mc;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.fb;
import b.t.c.b.b.d.j;
import b.t.c.b.cc;
import b.t.c.b.cd;
import b.t.c.b.d;
import b.t.c.b.g;
import b.t.c.b.h;
import b.t.c.b.lc;
import b.t.c.b.md;
import b.t.c.b.o;
import b.t.c.b.pb;
import b.t.c.b.r;
import b.t.c.b.s;
import b.t.p$_b;
import b.t.z;
import java.util.List;

public final class ad {
    private static final boolean o00000(d d2) {
        return d2 instanceof g && lc.o00000((s)((Object)d2));
    }

    public static final List o00000(d object, List object22, db db2, List list, cd cd2, boolean bl) {
        List list2;
        List list3 = list2 = mc.o00000();
        d d2 = object;
        if (bl) {
            h h2 = object.o\u00d8O000();
            if (h2 instanceof r) {
                if (md.o00000((o)object)) {
                    if (((r)h2).newfor()) {
                        list3.add(new pb(d2, b.o.r.o00000(b.o.r.\u00d300000((z)((Object)h2)).getDeclaringClass())));
                    }
                } else if (!ad.o00000((d)object)) {
                    object = "Only top-level callables are supported for now: ".concat(String.valueOf(object));
                    throw new IllegalArgumentException(object.toString());
                }
            }
            object22 = object22.iterator();
            while (object22.hasNext()) {
                object = (fb)object22.next();
                list3.add(new cc(d2, (fb)object, list3.size(), p$_b.\u00d600000, cd2));
            }
            if (db2 != null) {
                object = new fb(j.do.\u00d400000());
                ((fb)object).\u00d200000(db2);
                object22 = object;
                list3.add(new cc(d2, (fb)object22, list3.size(), p$_b.class, cd2));
            }
        }
        for (Object object22 : list) {
            list3.add(new cc(d2, (fb)object22, list3.size(), p$_b.\u00d300000, cd2));
        }
        return mc.o00000(list2);
    }
}

