/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.ce;
import b.o.d.ac;
import b.o.d.p;
import b.o.d.vc;
import b.o.d.y;
import b.o.d.yb;
import b.t.b;
import b.t.c.b.b.c.i;
import b.t.c.b.b.c.u;
import b.t.c.b.bb;
import b.t.c.b.bc;
import b.t.c.b.bd;
import b.t.c.b.cb;
import b.t.c.b.dd;
import b.t.c.b.eb;
import b.t.c.b.fb;
import b.t.c.b.h;
import b.t.c.b.ic;
import b.t.c.b.jc;
import b.t.c.b.k;
import b.t.c.b.kc;
import b.t.c.b.m;
import b.t.c.b.n;
import b.t.c.b.nc;
import b.t.c.b.q$_b$0;
import b.t.c.b.q$_b$1;
import b.t.c.b.q$_b$2;
import b.t.c.b.q$_b$3;
import b.t.c.b.rb;
import b.t.c.b.sb;
import b.t.c.b.sc;
import b.t.c.b.tc;
import b.t.c.b.uc;
import b.t.c.b.x;
import b.t.c.b.xb;
import b.t.c.b.zc;
import b.t.c.g;
import b.t.db;
import b.t.e;
import b.t.f;
import b.t.l;
import b.t.r;
import b.t.s;
import b.t.t;
import b.t.v;
import b.t.z;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class q
extends vc {
    @Override
    public z \u00d200000(Class clazz) {
        return new b.t.c.b.r(clazz);
    }

    @Override
    public z \u00d200000(Class clazz, String string) {
        return new b.t.c.b.r(clazz);
    }

    @Override
    public b super(Class clazz, String string) {
        return n.\u00f400000(clazz);
    }

    @Override
    public z super(Class clazz) {
        return n.\u00d600000(clazz);
    }

    @Override
    public z \u00d300000(Class clazz, String string) {
        return n.\u00d600000(clazz);
    }

    @Override
    public String super(ac ac2) {
        return ((vc)this).super((b.o.d.g)ac2);
    }

    @Override
    public String super(b.o.d.g g2) {
        b.t.k k2 = g.o00000(g2);
        if (k2 != null) {
            return dd.o00000.\u00d200000(k2);
        }
        return super.super(g2);
    }

    @Override
    public b.t.k super(yb yb2) {
        h h2 = q.super(yb2);
        Object object = yb2.\u00f5\u00d5O000();
        String string = yb2.\u00d5\u00d6O000();
        if (!zc.\u00d300000()) {
            if (((String)object).equals("<init>")) {
                if (h2 instanceof b.t.c.b.r && h2.iffor().getAnnotation(ce.class) != null) {
                    object = h2.return(string);
                    return new bc(h2, string, yb2.\u00d4\u00d6O000(), (i)object);
                }
            } else if (h2 instanceof jc) {
                object = h2.\u00d300000((String)object, string);
                return new m(h2, string, yb2.\u00d4\u00d6O000(), (u)object);
            }
        }
        return new bd(h2, (String)object, string, yb2.\u00d4\u00d6O000());
    }

    @Override
    public b.t.i super(b.o.d.s s2) {
        h h2 = q.super(s2);
        String string = s2.\u00d5\u00d6O000();
        if (!zc.\u00d300000()) {
            return new k(new q$_b$0(string, h2, s2));
        }
        return new cb(h2, s2.\u00f5\u00d5O000(), string, s2.\u00d4\u00d6O000());
    }

    @Override
    public t super(b.o.d.i i2) {
        h h2 = q.super(i2);
        String string = i2.\u00d5\u00d6O000();
        if (!zc.\u00d300000()) {
            return new uc(new q$_b$1(string, h2, i2));
        }
        return new nc(h2, i2.\u00f5\u00d5O000(), string, i2.\u00d4\u00d6O000());
    }

    @Override
    public f super(b.o.d.r object) {
        Object object2 = q.super((b.o.d.x)object);
        Object object3 = ((b.o.d.x)object).\u00d5\u00d6O000();
        if (!zc.\u00d300000()) {
            h h2 = object2;
            b.o.d.r r2 = object;
            object = object3;
            object2 = r2;
            object3 = h2;
            return new b.t.c.b.i(new q$_b$2((h)object3, (b.o.d.r)object2, (String)object));
        }
        return new bb((h)object2, ((b.o.d.x)object).\u00f5\u00d5O000(), (String)object3, ((b.o.d.x)object).\u00d4\u00d6O000());
    }

    @Override
    public s super(b.o.d.h object) {
        Object object2 = q.super((b.o.d.x)object);
        Object object3 = ((b.o.d.x)object).\u00d5\u00d6O000();
        if (!zc.\u00d300000()) {
            h h2 = object2;
            b.o.d.h h3 = object;
            object = object3;
            object2 = h3;
            object3 = h2;
            return new tc(new q$_b$3((h)object3, (b.o.d.h)object2, (String)object));
        }
        return new kc((h)object2, ((b.o.d.x)object).\u00f5\u00d5O000(), (String)object3, ((b.o.d.x)object).\u00d4\u00d6O000());
    }

    @Override
    public e super(p p2) {
        return new x(q.super(p2), p2.\u00f5\u00d5O000(), p2.\u00d5\u00d6O000());
    }

    @Override
    public r super(b.o.d.f f2) {
        return new ic(q.super(f2), f2.\u00f5\u00d5O000(), f2.\u00d5\u00d6O000());
    }

    private static h super(b.o.d.x object) {
        if ((object = ((b.o.d.x)object).\u00d3\u00d6O000()) instanceof h) {
            return (h)object;
        }
        return xb.StringObjectObject;
    }

    @Override
    public b.t.u super(v v2, List list, boolean bl) {
        if (v2 instanceof y) {
            return n.o00000(((y)((Object)v2)).iffor(), list, bl);
        }
        return b.t.b.b.super(v2, list, bl, Collections.emptyList());
    }

    @Override
    public b.t.bb super(Object object, String string, l object2, boolean bl) {
        if (object instanceof z) {
            object2 = ((z)object).O\u00d4O000();
        } else if (object instanceof db) {
            object2 = ((db)object).O\u00d4O000();
        } else {
            throw new IllegalArgumentException("Type parameter container must be a class or a callable: ".concat(String.valueOf(object)));
        }
        object2 = object2.iterator();
        while (object2.hasNext()) {
            b.t.bb bb2 = (b.t.bb)object2.next();
            if (!bb2.\u00f5\u00d4o000().equals(string)) continue;
            return bb2;
        }
        throw new IllegalArgumentException("Type parameter " + string + " is not found in container: " + object);
    }

    @Override
    public void super(b.t.bb bb2, List list) {
    }

    @Override
    public b.t.u super(b.t.u u2, b.t.u u3) {
        return b.t.c.b.c.f.o00000(u2, u3);
    }

    @Override
    public b.t.u super(b.t.u u2) {
        return b.t.c.b.c.f.new(u2);
    }

    @Override
    public b.t.u \u00d200000(b.t.u u2) {
        return b.t.c.b.c.f.o00000(u2);
    }

    public static void super() {
        n.o00000();
        sc.o00000();
    }

    private static /* synthetic */ Object \u00d200000(h h2, b.o.d.h h3, String string) {
        if (h2 instanceof jc) {
            b.t.c.b.b.c.e e2 = h2.\u00d500000(h3.\u00f5\u00d5O000(), string);
            return new rb(h2, string, h3.\u00d4\u00d6O000(), e2);
        }
        return new kc(h2, h3.\u00f5\u00d5O000(), string, h3.\u00d4\u00d6O000());
    }

    private static /* synthetic */ Object \u00d200000(h h2, b.o.d.r r2, String string) {
        if (h2 instanceof jc) {
            b.t.c.b.b.c.e e2 = h2.\u00d500000(r2.\u00f5\u00d5O000(), string);
            return new eb(h2, string, r2.\u00d4\u00d6O000(), e2);
        }
        return new bb(h2, r2.\u00f5\u00d5O000(), string, r2.\u00d4\u00d6O000());
    }

    private static /* synthetic */ Object \u00d200000(String string, h h2, b.o.d.i i2) {
        Object object = h.nullvoidsuper.\u00d300000(string);
        if (object != null) {
            object = object.\u00d600000();
            return h2.o00000(Integer.parseInt((String)object.get(1)), string);
        }
        if (h2 instanceof jc) {
            object = h2.\u00d500000(i2.\u00f5\u00d5O000(), string);
            return new sb(h2, string, i2.\u00d4\u00d6O000(), (b.t.c.b.b.c.e)object);
        }
        return new nc(h2, i2.\u00f5\u00d5O000(), string, i2.\u00d4\u00d6O000());
    }

    private static /* synthetic */ Object \u00d200000(String string, h h2, b.o.d.s s2) {
        Object object = h.nullvoidsuper.\u00d300000(string);
        if (object != null) {
            object = object.\u00d600000();
            return h2.o00000(Integer.parseInt((String)object.get(1)), string);
        }
        if (h2 instanceof jc) {
            object = h2.\u00d500000(s2.\u00f5\u00d5O000(), string);
            return new fb(h2, string, s2.\u00d4\u00d6O000(), (b.t.c.b.b.c.e)object);
        }
        return new cb(h2, s2.\u00f5\u00d5O000(), string, s2.\u00d4\u00d6O000());
    }

    static /* synthetic */ Object super(String string, h h2, b.o.d.s s2) {
        return q.\u00d200000(string, h2, s2);
    }

    static /* synthetic */ Object super(String string, h h2, b.o.d.i i2) {
        return q.\u00d200000(string, h2, i2);
    }

    static /* synthetic */ Object super(h h2, b.o.d.r r2, String string) {
        return q.\u00d200000(h2, r2, string);
    }

    static /* synthetic */ Object super(h h2, b.o.d.h h3, String string) {
        return q.\u00d200000(h2, h3, string);
    }
}

