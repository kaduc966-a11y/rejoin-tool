/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.t.c.b.b.c.b;
import b.t.c.b.b.c.cb;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.gb;
import b.t.c.b.b.c.hb;
import b.t.c.b.b.c.k;
import b.t.c.b.b.c.kb$_b;
import b.t.c.b.b.c.kb$_c;
import b.t.c.b.b.c.l;
import b.t.c.b.b.c.p;
import b.t.c.b.b.c.s;
import java.util.List;

public final class jb {
    public static final p o00000(int n2) {
        p p2 = new p();
        Object object = p2;
        p2.\u00d200000("kotlin/Function".concat(String.valueOf(n2)));
        b.o00000((p)object, gb.void);
        b.o00000((p)object, l.\u00d500000);
        b.o00000((p)object, cb.o00000);
        int n3 = 1;
        if (n2 > 0) {
            while (true) {
                ((p)object).\u00f500000().add(new k("P".concat(String.valueOf(n3)), n3, hb.\u00d200000));
                if (n3 == n2) break;
                ++n3;
            }
        }
        n3 = n2 + 1;
        ((p)object).\u00f500000().add(new k("R", n3, hb.o00000));
        List list = ((p)object).\u00f400000();
        db db2 = new db();
        object = db2;
        List list2 = list;
        ((db)object).o00000(new kb$_c("kotlin/Function"));
        List list3 = ((db)object).o00000();
        object = new db();
        db db3 = object;
        hb hb2 = hb.\u00d500000;
        List list4 = list3;
        db3.o00000(new kb$_b(n3));
        hb hb3 = hb2;
        list4.add(new s(hb3, (db)object));
        list2.add(db2);
        return p2;
    }
}

