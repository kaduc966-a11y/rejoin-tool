/*
 * Decompiled with CFR 0.152.
 */
package b.t.c;

import b.ce;
import b.qb;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.l.c.b.e;
import b.t.c.b.b.l.c.b.j;
import b.t.c.b.b.l.d.c;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.p.v;
import b.t.c.b.b.q.ic;
import b.t.c.b.bd;
import b.t.c.b.hd;
import b.t.c.b.xb;
import b.t.c.g$_b$_b$1;
import b.t.k;
import b.yb;
import java.io.Serializable;

public final class g {
    public static final k o00000(yb object) {
        ce ce2 = object.getClass().getAnnotation(ce.class);
        if (ce2 == null) {
            return null;
        }
        Object object2 = ce2;
        Object object3 = ce2.\u00d200000();
        Object object4 = !(((String[])object3).length == 0) ? object3 : null;
        if (object4 == null) {
            return null;
        }
        Serializable serializable = e.\u00d200000(object4, object2.\u00d400000());
        object3 = (j)((qb)serializable).\u00d400000();
        serializable = (b$_z)((qb)serializable).\u00d300000();
        object2 = new c(object2.void(), (object2.o00000() & 8) != 0);
        object = (b.t.c.b.b.q.qb)hd.super(object.getClass(), b.t.c.e.\u00d6O0000, (v)((Object)serializable), (b.t.c.b.b.l.d.e)object3, new d(((b$_z)serializable).voidclassnew()), (b.t.c.b.b.l.d.j)object2, g$_b$_b$1.\u00d3\u00f4\u00d3000);
        return new bd(xb.StringObjectObject, (ic)object, null, 4, null);
    }
}

