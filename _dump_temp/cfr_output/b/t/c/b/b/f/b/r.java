/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.s.mc;
import b.t.c.b.b.f.b;
import b.t.c.b.b.f.b.eb;
import b.t.c.b.b.f.b.k;
import b.t.c.b.b.f.b.r$_b;
import b.t.c.b.b.f.b.v;
import b.t.c.b.b.f.b.v$_b;
import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_f;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_rb;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.p.d$_b;
import b.t.c.b.b.p.d$_c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class r
implements k {
    private final b o00000;

    public r(b b2) {
        this.o00000 = b2;
    }

    protected final b super() {
        return this.o00000;
    }

    @Override
    public List super(v$_b v$_b) {
        return this.super(v$_b.\u00d600000().\u00f4o\u00d2000(), (List)v$_b.\u00d600000().\u00d300000(this.o00000.OO0000()), v$_b.\u00d400000());
    }

    @Override
    public List super(v v2, b.t.c.b.b.p.v v3, eb eb2) {
        b.t.c.b.b.p.v v4 = v3;
        if (v4 instanceof b$_f) {
            return this.super(((b$_f)v3).\u00f8\u00d8\u00d2000(), (List)((b$_f)v3).\u00d300000(this.o00000.\u00f400000()), v2.\u00d400000());
        }
        if (v4 instanceof b$_z) {
            return this.super(((b$_z)v3).superreturnnew(), (List)((b$_z)v3).\u00d300000(this.o00000.oO0000()), v2.\u00d400000());
        }
        if (v4 instanceof b$_n) {
            switch (r$_b.super[eb2.ordinal()]) {
                case 1: {
                    return this.super(((b$_n)v3).\u00d4\u00d3\u00d3000(), (List)((b$_n)v3).\u00d300000(this.o00000.float()), v2.\u00d400000());
                }
                case 2: {
                    return this.super(((b$_n)v3).\u00d2\u00d2\u00d3000(), (List)((b$_n)v3).\u00d300000(this.o00000.\u00d200000()), v2.\u00d400000());
                }
                case 3: {
                    return this.super(((b$_n)v3).\u00d4\u00d4\u00d3000(), (List)((b$_n)v3).\u00d300000(this.o00000.Object()), v2.\u00d400000());
                }
            }
            throw new IllegalStateException("Unsupported callable kind with property proto".toString());
        }
        throw new IllegalStateException("Unknown message: ".concat(String.valueOf(v3)).toString());
    }

    @Override
    public List \u00d200000(v v2, b$_n object) {
        Object object2;
        r r2 = this;
        List list = ((b$_n)object).\u00f6\u00d3\u00d3000();
        d$_b d$_b = this.o00000.o00000();
        if (d$_b != null) {
            d$_b d$_b2 = d$_b;
            List list2 = list;
            r r3 = r2;
            object = (List)((d$_c)object).\u00d300000(d$_b2);
            r2 = r3;
            list = list2;
            object2 = object;
        } else {
            object2 = null;
        }
        return r2.super(list, (List)object2, v2.\u00d400000());
    }

    @Override
    public List super(v v2, b$_n object) {
        Object object2;
        r r2 = this;
        List list = ((b$_n)object).dothisnew();
        d$_b d$_b = this.o00000.\u00d600000();
        if (d$_b != null) {
            d$_b d$_b2 = d$_b;
            List list2 = list;
            r r3 = r2;
            object = (List)((d$_c)object).\u00d300000(d$_b2);
            r2 = r3;
            list = list2;
            object2 = object;
        } else {
            object2 = null;
        }
        return r2.super(list, (List)object2, v2.\u00d400000());
    }

    @Override
    public List super(v v2, b$_rb b$_rb) {
        return this.super(b$_rb.\u00f4\u00d4\u00d4000(), (List)b$_rb.\u00d300000(this.o00000.\u00d400000()), v2.\u00d400000());
    }

    @Override
    public List \u00d200000(v v2, b.t.c.b.b.p.v v3, eb eb2, int n2, b$_c b$_c) {
        return this.super(b$_c.\u00f8\u00f4o000(), (List)b$_c.\u00d300000(this.o00000.\u00f600000()), v2.\u00d400000());
    }

    @Override
    public List \u00d200000(v v2, b.t.c.b.b.p.v object, eb object2) {
        Object object3 = object;
        if (object3 instanceof b$_z) {
            Object object4;
            Object object5 = this;
            List list = ((b$_z)object).\u00f6\u00f5\u00d3000();
            d$_b d$_b = this.o00000.\u00d2O0000();
            if (d$_b != null) {
                object2 = d$_b;
                List list2 = list;
                object3 = object5;
                object = (List)((b$_z)object).\u00d300000((d$_b)object2);
                object5 = object3;
                list = list2;
                object4 = object;
            } else {
                object4 = null;
            }
            return ((r)object5).super(list, (List)object4, v2.\u00d400000());
        }
        if (object3 instanceof b$_n) {
            switch (r$_b.super[object2.ordinal()]) {
                case 1: 
                case 2: 
                case 3: {
                    Object object6;
                    Object object7 = this;
                    List list = ((b$_n)object).\u00d2\u00d3\u00d3000();
                    d$_b d$_b = this.o00000.void();
                    if (d$_b != null) {
                        object2 = d$_b;
                        List list3 = list;
                        object3 = object7;
                        object = (List)((b$_n)object).\u00d300000((d$_b)object2);
                        object7 = object3;
                        list = list3;
                        object6 = object;
                    } else {
                        object6 = null;
                    }
                    return ((r)object7).super(list, (List)object6, v2.\u00d400000());
                }
            }
            throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(String.valueOf(object2)).toString());
        }
        throw new IllegalStateException("Unknown message: ".concat(String.valueOf(object)).toString());
    }

    @Override
    public List super(v v2, b.t.c.b.b.p.v v3, eb eb2, int n2, b$_c b$_c) {
        List list;
        List list2;
        b$_c b$_c2 = b$_c;
        if (b$_c2 != null) {
            b$_c = b$_c2;
            list2 = this.\u00d200000(v2, v3, eb2, n2, b$_c);
        } else {
            list2 = list = null;
        }
        if (list2 == null) {
            list = mc.\u00d500000();
        }
        return list;
    }

    @Override
    public List super(b$_nb b$_nb, e e2) {
        return this.super(b$_nb.\u00f4o\u00d4000(), (List)b$_nb.\u00d300000(this.o00000.public()), e2);
    }

    @Override
    public List super(b$_b b$_b, e e2) {
        return this.super(b$_b.\u00d2\u00d5\u00d4000(), (List)b$_b.\u00d300000(this.o00000.\u00f500000()), e2);
    }

    private final List super(List iterable, List object, e e2) {
        Object object2;
        if ((iterable = (Collection)iterable).isEmpty()) {
            object2 = object;
            if (object2 == null) {
                object2 = mc.\u00d500000();
            }
        } else {
            object2 = iterable;
        }
        iterable = (Iterable)object2;
        object = iterable;
        iterable = new ArrayList(mc.o00000((Iterable)iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object3 = object.next();
            object3 = (b$_db)object3;
            Iterable<Object> iterable2 = iterable;
            iterable2.add(this.super((b$_db)object3, e2));
        }
        return iterable;
    }
}

