/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.f;

import b.qb;
import b.s.mc;
import b.s.ub;
import b.s.y;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.c.b.db;
import b.t.c.b.b.n.c.b.g;
import b.t.c.b.b.n.c.f.b;
import b.t.c.b.b.n.c.f.e;
import b.t.c.b.b.n.c.f.i$_b$0;
import b.t.c.b.b.o.c.f;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.c.k;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.e.d;
import b.t.c.b.b.q.e.h;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i {
    public static final i \u00d200000 = new i();
    private static final Map \u00d300000;
    private static final Map super;

    private i() {
    }

    public final Set super(String string) {
        EnumSet enumSet = (EnumSet)\u00d300000.get(string);
        if (enumSet != null) {
            return enumSet;
        }
        return ub.\u00d300000();
    }

    public final j super(List iterable) {
        Object object;
        Iterator iterator = iterable;
        iterable = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!(object instanceof g)) continue;
            iterable.add(object);
        }
        iterator = iterable;
        iterable = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object = (g)iterator.next();
            b.t.c.b.b.d.f f2 = object.\u00d200000();
            object = \u00d200000.super(f2 != null ? f2.\u00d400000() : null);
            mc.new((Collection)iterable, (Iterable)object);
        }
        iterable = (List)iterable;
        iterator = iterable;
        iterable = new ArrayList(mc.o00000((Iterable)iterable, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            object = (d)((Object)object);
            Iterable<f> iterable2 = iterable;
            iterable2.add(new f(b.t.c.b.b.d.d.String.o00000(d$_b.\u00d5\u00d60000), b.t.c.b.b.d.f.\u00d300000(((Enum)object).name())));
        }
        return new k((List)iterable, i$_b$0.\u00f8\u00d6\u00d4000);
    }

    public final j super(db object) {
        f f2;
        g g2 = object instanceof g ? (g)object : null;
        if (g2 != null) {
            object = g2;
            Map map = super;
            b.t.c.b.b.d.f f3 = object.\u00d200000();
            h h2 = (h)((Object)map.get(f3 != null ? f3.\u00d400000() : null));
            if (h2 != null) {
                object = h2;
                f2 = new f(b.t.c.b.b.d.d.String.o00000(d$_b.\u00f4o0000), b.t.c.b.b.d.f.\u00d300000(((Enum)object).name()));
            } else {
                f2 = null;
            }
        } else {
            f2 = null;
        }
        return f2;
    }

    private static final rc \u00d200000(bc bc2) {
        b.t.c.b.b.q.e.i i2 = e.super(b.class.super(), bc2.returnforsuper().o00000(d$_b.\u00d5\u00d40000));
        if (i2 == null || (i2 = i2.forclasssuper()) == null) {
            i2 = b.t.c.b.b.h.d.k.new(c.\u00d2\u00d50000, new String[0]);
        }
        return i2;
    }

    static {
        qb[] qbArray = new qb[10];
        qb[] qbArray2 = qbArray;
        qbArray[0] = yc.o00000("PACKAGE", EnumSet.noneOf(d.class));
        qbArray2[1] = yc.o00000("TYPE", EnumSet.of((Enum)d.oo0000, (Enum)d.privatenew));
        qbArray2[2] = yc.o00000("ANNOTATION_TYPE", EnumSet.of((Enum)d.\u00d6o0000));
        qbArray2[3] = yc.o00000("TYPE_PARAMETER", EnumSet.of((Enum)d.\u00f8\u00d20000));
        qbArray2[4] = yc.o00000("FIELD", EnumSet.of((Enum)d.\u00d8O0000));
        qbArray2[5] = yc.o00000("LOCAL_VARIABLE", EnumSet.of((Enum)d.\u00d3O0000));
        qbArray2[6] = yc.o00000("PARAMETER", EnumSet.of((Enum)d.ifObject));
        qbArray2[7] = yc.o00000("CONSTRUCTOR", EnumSet.of((Enum)d.\u00d5\u00d30000));
        qbArray2[8] = yc.o00000("METHOD", EnumSet.of((Enum)d.\u00d200000, (Enum)d.\u00f6o0000, (Enum)d.o\u00d30000));
        qbArray2[9] = yc.o00000("TYPE_USE", EnumSet.of((Enum)d.\u00f8O0000));
        \u00d300000 = y.\u00d600000(qbArray2);
        qb[] qbArray3 = new qb[3];
        qbArray2 = qbArray3;
        qbArray3[0] = yc.o00000("RUNTIME", (Object)h.\u00d200000);
        qbArray2[1] = yc.o00000("CLASS", (Object)h.class);
        qbArray2[2] = yc.o00000("SOURCE", (Object)h.\u00d400000);
        super = y.\u00d600000(qbArray2);
    }

    static /* synthetic */ rc super(bc bc2) {
        return i.\u00d200000(bc2);
    }
}

