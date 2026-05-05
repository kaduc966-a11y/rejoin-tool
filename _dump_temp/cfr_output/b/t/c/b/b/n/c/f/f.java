/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.f;

import b.o.d.ib;
import b.s.y;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.i.k;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.n.c.f.b;
import b.t.c.b.b.n.c.f.f$_b$0;
import b.t.c.b.b.n.c.f.g;
import b.t.c.b.b.n.c.f.i;
import b.t.c.b.b.o.c.j;
import b.t.m;
import b.yc;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f
extends g {
    static final /* synthetic */ m[] \u00d2O0000;
    private final b.t.c.b.b.i.f interface;

    public f(q object, b.t.c.b.b.n.c.d.i i2) {
        super(i2, (q)object, d$_b.o00000);
        object = this;
        this.interface = i2.return().o00000(new f$_b$0((f)object));
    }

    @Override
    public final Map super() {
        return (Map)k.o00000(this.interface, (Object)this, \u00d2O0000[0]);
    }

    private static final Map super(f object) {
        Map map;
        Map map2;
        j j2 = i.\u00d200000.super(((g)object).\u00f400000());
        if (j2 != null) {
            object = j2;
            map2 = y.o00000(yc.o00000(b.class.\u00d200000(), object));
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
        mArray[0] = new ib(f.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0);
        \u00d2O0000 = mArray2;
    }

    static /* synthetic */ Map \u00d200000(f f2) {
        return f.super(f2);
    }
}

