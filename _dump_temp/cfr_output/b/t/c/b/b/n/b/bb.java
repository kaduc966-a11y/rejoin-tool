/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.fc;
import b.t.c.b.b.b;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.f.b.eb;
import b.t.c.b.b.f.b.v;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.c.b.e;
import b.t.c.b.b.l.d.l;
import b.t.c.b.b.n.b.bb$_b$0;
import b.t.c.b.b.n.b.bb$_b$1;
import b.t.c.b.b.n.b.bb$_b$2;
import b.t.c.b.b.n.b.bb$_c$1;
import b.t.c.b.b.n.b.i;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.b.p;
import b.t.c.b.b.n.b.t;
import b.t.c.b.b.n.b.x;
import b.t.c.b.b.o.c.t$_b$_b;
import java.util.HashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class bb
extends i
implements b.t.c.b.b.f.b.j {
    private final b.t.c.b.b.i.j \u00d500000;

    public bb(b.t.c.b.b.i.l object, x x2) {
        super(x2);
        b.t.c.b.b.i.l l2 = object;
        object = this;
        this.\u00d500000 = l2.o00000(new bb$_b$0((bb)object));
    }

    protected b.t.c.b.b.n.b.b \u00d400000(j j2) {
        return (b.t.c.b.b.n.b.b)this.\u00d500000.\u00f800000(j2);
    }

    protected abstract Object super(String var1, Object var2);

    protected abstract Object super(Object var1);

    @Override
    public Object super(v v2, b$_n b$_n, rc rc2) {
        return this.super(v2, b$_n, eb.\u00d400000, rc2, bb$_b$1.\u00d3\u00d8\u00d3000);
    }

    @Override
    public Object \u00d200000(v v2, b$_n b$_n, rc rc2) {
        return this.super(v2, b$_n, eb.o00000, rc2, bb$_b$2.newStringnew);
    }

    private final Object super(v object, b$_n b$_n, eb eb2, rc rc2, b.o.e.f f2) {
        j j2 = i.\u00d400000.super((v)object, true, true, l.new.\u00d200000(b$_n.O\u00d3\u00d3000()), e.super(b$_n), this.\u00d200000(), this.\u00d300000());
        j j3 = this.super((v)object, j2);
        if (j3 == null) {
            return null;
        }
        j2 = j3;
        boolean bl = j3.\u00d200000().o00000().o00000((b.t.c.b.b.l.d.j)p.void.o00000());
        t t2 = this.super(b$_n, ((v)object).\u00d400000(), ((v)object).\u00d300000(), eb2, bl);
        if (t2 == null) {
            return null;
        }
        object = t2;
        Object object2 = f2.o00000(this.\u00d500000.\u00f800000(j2), object);
        if (object2 == null) {
            return null;
        }
        object = object2;
        if (b.t.c.b.b.b.i.o00000(rc2)) {
            return this.super(object);
        }
        return object;
    }

    private final b.t.c.b.b.n.b.b \u00d300000(j j2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        j2.o00000(new bb$_c$1(this, hashMap, j2, hashMap3, hashMap2), this.super(j2));
        return new b.t.c.b.b.n.b.b(hashMap, hashMap2, hashMap3);
    }

    protected final boolean super(d object, Map map) {
        if (!fc.o00000(object, (Object)b.Object.\u00d200000())) {
            return false;
        }
        object = map.get(f.\u00d300000("value"));
        b.t.c.b.b.o.c.t t2 = object instanceof b.t.c.b.b.o.c.t ? (b.t.c.b.b.o.c.t)object : null;
        if (t2 == null) {
            return false;
        }
        object = t2.o00000();
        t$_b$_b t$_b$_b = object instanceof t$_b$_b ? (t$_b$_b)object : null;
        if (t$_b$_b == null) {
            return false;
        }
        object = t$_b$_b;
        return this.super(((t$_b$_b)object).\u00d400000());
    }

    private static final b.t.c.b.b.n.b.b super(bb bb2, j j2) {
        return bb2.\u00d300000(j2);
    }

    private static final Object \u00d300000(b.t.c.b.b.n.b.b b2, t t2) {
        return b2.\u00d200000().get(t2);
    }

    private static final Object \u00d200000(b.t.c.b.b.n.b.b b2, t t2) {
        return b2.\u00d300000().get(t2);
    }

    static /* synthetic */ b.t.c.b.b.n.b.b \u00d200000(bb bb2, j j2) {
        return bb.super(bb2, j2);
    }

    static /* synthetic */ Object \u00d400000(b.t.c.b.b.n.b.b b2, t t2) {
        return bb.\u00d300000(b2, t2);
    }

    static /* synthetic */ Object super(b.t.c.b.b.n.b.b b2, t t2) {
        return bb.\u00d200000(b2, t2);
    }
}

