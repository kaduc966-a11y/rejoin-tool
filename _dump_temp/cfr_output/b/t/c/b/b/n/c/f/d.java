/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.f;

import b.o.d.ib;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.i.f;
import b.t.c.b.b.i.k;
import b.t.c.b.b.n.c.b.db;
import b.t.c.b.b.n.c.b.n;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.n.c.f.b;
import b.t.c.b.b.n.c.f.d$_b$0;
import b.t.c.b.b.n.c.f.g;
import b.t.c.b.b.n.c.f.i;
import b.t.c.b.b.o.c.j;
import b.t.m;
import b.yc;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d
extends g {
    static final /* synthetic */ m[] \u00d2O0000;
    private final f \u00d4O0000;

    public d(q object, b.t.c.b.b.n.c.d.i i2) {
        super(i2, (q)object, d$_b.\u00d5\u00d40000);
        object = this;
        this.\u00d4O0000 = i2.return().o00000(new d$_b$0((d)object));
    }

    @Override
    public final Map super() {
        return (Map)k.o00000(this.\u00d4O0000, (Object)this, \u00d2O0000[0]);
    }

    private static final Map \u00d200000(d object) {
        Map map;
        Map map2;
        db db2 = ((g)object).\u00f400000();
        j j2 = db2 instanceof n ? i.\u00d200000.super(((n)((g)object).\u00f400000()).\u00d600000()) : (db2 instanceof b.t.c.b.b.n.c.b.g ? i.\u00d200000.super(mc.o00000(((g)object).\u00f400000())) : null);
        if (j2 != null) {
            object = j2;
            map2 = y.o00000(yc.o00000(b.class.super(), object));
        } else {
            map2 = map = null;
        }
        if (map2 == null) {
            map = y.Object();
        }
        return map;
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new ib(d.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0);
        \u00d2O0000 = mArray2;
    }

    static /* synthetic */ Map super(d d2) {
        return d.\u00d200000(d2);
    }
}

