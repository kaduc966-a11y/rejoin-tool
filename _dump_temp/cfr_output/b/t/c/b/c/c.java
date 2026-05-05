/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.c;

import b.o.d.fc;
import b.o.d.w;
import b.qd;
import b.t.c.b.b.b.c.h;
import b.t.c.b.b.b.g;
import b.t.c.b.b.h.ec;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.s;
import b.t.c.b.b.h.sb;
import b.t.c.b.b.h.sb$_b;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.t$_d;
import b.t.c.b.b.q.wb;
import b.t.c.b.c.c$_b$0;
import b.t.c.b.c.c$_b$1;
import b.t.c.b.c.c$_b$2;
import b.t.c.b.c.c$_b$3;
import b.t.c.b.c.c$_b$4;
import b.t.c.b.c.c$_c;
import b.t.c.b.c.k;
import b.t.c.b.c.m;
import b.t.c.b.c.n;
import b.t.c.b.hd;
import b.t.c.b.j;
import b.t.c.b.lb;
import b.t.c.b.mc;
import b.t.c.b.ob;
import b.t.c.b.p;
import b.t.c.b.r;
import b.t.c.b.v$_b;
import b.t.c.b.zc;
import b.t.c.f;
import b.t.q;
import b.t.u;
import b.t.v;
import b.t.z;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
extends n {
    static final /* synthetic */ b.t.m[] \u00f5\u00d5\u00d8000;
    private final rc \u00d5\u00d5\u00d8000;
    private final boolean \u00f4\u00d5\u00d8000;
    private final v$_b \u00d8\u00d5\u00d8000;
    private final v$_b forsuperString;

    public c(rc object, b.o.e.h object2, boolean bl) {
        super((b.o.e.h)object2);
        this.\u00d5\u00d5\u00d8000 = object;
        this.\u00f4\u00d5\u00d8000 = bl;
        object = this;
        this.\u00d8\u00d5\u00d8000 = b.t.c.b.v.super(new c$_b$0((c)object));
        object = object2;
        object2 = this;
        this.forsuperString = b.t.c.b.v.super(new c$_b$1((c)object2, (b.o.e.h)object));
    }

    public final rc \u00f8\u00d8\u00d2000() {
        return this.\u00d5\u00d5\u00d8000;
    }

    public c(rc rc2, b.o.e.h h2) {
        this(rc2, h2, false);
    }

    public /* synthetic */ c(rc rc2, b.o.e.h h2, int n2, w w2) {
        if ((n2 & 2) != 0) {
            h2 = null;
        }
        this(rc2, h2);
    }

    @Override
    public final v privatevoid() {
        return (v)this.\u00d8\u00d5\u00d8000.\u00f800000(this, \u00f5\u00d5\u00d8000[0]);
    }

    private final v \u00d4O0000(rc object) {
        Object object2;
        if (this.\u00f4\u00d5\u00d8000 && (object2 = (object2 = ((rc)object).thisdosuper().\u00f4OO000()) instanceof t$_d ? (t$_d)object2 : null) != null) {
            object = object2;
            return new ob(b.\u00d800000((wb)object));
        }
        object2 = ((rc)object).thisdosuper().\u00f4OO000();
        if (object2 instanceof ib) {
            Class clazz = hd.super((ib)object2);
            if (clazz == null) {
                return null;
            }
            object2 = clazz;
            if (b.t.c.b.b.b.c.\u00d800000((rc)object)) {
                Object object3 = (hc)b.s.mc.\u00d8O0000(((rc)object).\u00d4\u00d6\u00d2000());
                if (object3 == null || (object3 = object3.\u00d300000()) == null) {
                    return new r((Class)object2);
                }
                object = object3;
                v v2 = this.\u00d4O0000(b.t.c.b.b.h.b.b.int((rc)object));
                if (v2 == null) {
                    throw new lb("Cannot determine classifier for array element type: ".concat(String.valueOf(this)));
                }
                object = v2;
                return new r(hd.super(b.o.r.new(f.super((v)object))));
            }
            if (!o.\u00d600000((rc)object)) {
                Object object4 = e.String((Class)object2);
                if (object4 == null) {
                    object4 = object2;
                }
                return new r((Class)object4);
            }
            return new r((Class)object2);
        }
        if (object2 instanceof i) {
            return new mc(j.o00000((i)object2), (i)object2, null, 4, null);
        }
        return null;
    }

    @Override
    public final List \u00f5\u00f60000() {
        return (List)this.forsuperString.\u00f800000(this, \u00f5\u00d5\u00d8000[1]);
    }

    private final q o00000(hc hc2, b.o.e.h object) {
        if (hc2.super()) {
            return q.\u00d400000.o00000();
        }
        object = new c(hc2.\u00d300000(), (b.o.e.h)object);
        switch (c$_c.o00000[hc2.\u00d200000().ordinal()]) {
            case 1: {
                return q.\u00d400000.\u00d200000((u)object);
            }
            case 2: {
                return q.\u00d400000.o00000((u)object);
            }
            case 3: {
                return q.\u00d400000.\u00d300000((u)object);
            }
        }
        throw new qd();
    }

    @Override
    public final boolean \u00f4\u00f60000() {
        return this.\u00d5\u00d5\u00d8000.\u00f5\u00d6\u00d2000();
    }

    @Override
    public final List \u00d8\u00f50000() {
        return hd.super(this.\u00d5\u00d5\u00d8000);
    }

    @Override
    public final n \u00d3o0000(boolean bl) {
        if (!b.t.c.b.b.h.q.\u00d400000(this.\u00d5\u00d5\u00d8000) && this.\u00f4\u00f60000() == bl) {
            return this;
        }
        return new c(o.o00000(this.\u00d5\u00d5\u00d8000, bl), null, 2, null);
    }

    @Override
    public final n nullsuper(boolean bl) {
        rc rc2;
        b.t.c.b.b.h.ib ib2;
        if (bl) {
            sb sb2 = sb$_b.o00000(sb.\u00f5\u00f5\u00d8000, this.\u00d5\u00d5\u00d8000.\u00d8\u00d6\u00d2000(), true, false, 4, null);
            if (sb2 == null) {
                return this;
            }
            ib2 = sb2;
        } else {
            rc2 = this.\u00d5\u00d5\u00d8000;
            ib2 = rc2 instanceof sb ? (sb)rc2 : null;
            if (ib2 == null || (ib2 = ib2.\u00d3\u00f5\u00d2000()) == null) {
                return this;
            }
        }
        rc2 = ib2;
        return new c(rc2, null, 2, null);
    }

    @Override
    public final u nulldosuper() {
        c c2;
        b.t.c.b.b.h.ib ib2 = s.\u00d300000(this.\u00d5\u00d5\u00d8000);
        if (ib2 != null) {
            b.t.c.b.b.h.ib ib3 = ib2;
            c2 = new c(ib3, this.\u00f5\u00d8\u00d2000(), true);
        } else {
            c2 = null;
        }
        return c2;
    }

    @Override
    public final boolean privatedosuper() {
        return s.\u00d200000(this.\u00d5\u00d5\u00d8000);
    }

    @Override
    public final boolean fordosuper() {
        return b.t.c.b.b.b.c.\u00f600000(this.\u00d5\u00d5\u00d8000);
    }

    @Override
    public final z \u00f4\u00d8\u00d2000() {
        kb kb2 = this.\u00d5\u00d5\u00d8000.thisdosuper().\u00f4OO000();
        ib ib2 = kb2 instanceof ib ? (ib)kb2 : null;
        if (ib2 == null) {
            return null;
        }
        kb2 = ib2;
        if (!h.o00000.\u00d400000((ib)kb2)) {
            return null;
        }
        if (zc.\u00d300000()) {
            kb kb3 = kb2;
            c$_b$2 c$_b$2 = new c$_b$2((ib)kb3);
            kb3 = kb2;
            return new m((z)this.privatevoid(), b.\u00d800000(kb2).super(), c$_b$2, new c$_b$3((ib)kb3));
        }
        return k.o00000(b.\u00d800000(kb2), (z)this.privatevoid());
    }

    @Override
    public final boolean \u00d5\u00d8\u00d2000() {
        return g.o00000(this.\u00d5\u00d5\u00d8000);
    }

    @Override
    public final boolean \u00d3\u00d8\u00d2000() {
        return this.\u00d5\u00d5\u00d8000 instanceof ec;
    }

    @Override
    public final n \u00d8\u00d8\u00d2000() {
        l l2 = this.\u00d5\u00d5\u00d8000.\u00d8\u00d6\u00d2000();
        if (l2 instanceof b.t.c.b.b.h.f) {
            return new c(((b.t.c.b.b.h.f)l2).\u00f4\u00f4\u00d2000(), null, 2, null);
        }
        return null;
    }

    @Override
    public final n \u00d4\u00d8\u00d2000() {
        l l2 = this.\u00d5\u00d5\u00d8000.\u00d8\u00d6\u00d2000();
        if (l2 instanceof b.t.c.b.b.h.f) {
            return new c(((b.t.c.b.b.h.f)l2).\u00d8\u00f4\u00d2000(), null, 2, null);
        }
        return null;
    }

    @Override
    public final boolean equals(Object object) {
        if (zc.\u00d300000()) {
            return object instanceof c && fc.o00000((Object)this.\u00d5\u00d5\u00d8000, (Object)((c)object).\u00d5\u00d5\u00d8000) && fc.o00000((Object)this.privatevoid(), (Object)((c)object).privatevoid()) && fc.o00000((Object)this.\u00f5\u00f60000(), (Object)((c)object).\u00f5\u00f60000());
        }
        return super.equals(object);
    }

    @Override
    public final int hashCode() {
        if (zc.\u00d300000()) {
            v v2 = this.privatevoid();
            return 31 * (31 * this.\u00d5\u00d5\u00d8000.hashCode() + (v2 != null ? v2.hashCode() : 0)) + ((Object)this.\u00f5\u00f60000()).hashCode();
        }
        return super.hashCode();
    }

    private static final v \u00d400000(c c2) {
        c c3 = c2;
        return c3.\u00d4O0000(c3.\u00d5\u00d5\u00d8000);
    }

    private static final n new(c c2) {
        return c2;
    }

    private static final List o00000(c c2, b.o.e.h h2) {
        Iterable<q> iterable = c2.\u00d5\u00d5\u00d8000.\u00d4\u00d6\u00d2000();
        if (iterable.isEmpty()) {
            return b.s.mc.\u00d500000();
        }
        iterable = iterable;
        Object object = iterable;
        iterable = new ArrayList(b.s.mc.o00000((Iterable)iterable, 10));
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            b.o.e.h h3;
            int n3;
            Object object2 = object.next();
            if ((n3 = n2++) < 0) {
                b.s.mc.\u00d800000();
            }
            object2 = (hc)object2;
            Iterable<q> iterable2 = iterable;
            if (h2 == null) {
                h3 = null;
            } else {
                object2 = c2;
                h3 = p.\u00d300000(new c$_b$4((c)object2), n3);
            }
            iterable2.add(c2.o00000((hc)object2, h3));
        }
        return iterable;
    }

    private static final List new(ib object, m m2) {
        Object object2 = object = (Iterable)object.\u00d8\u00d6o000();
        object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (i)object3;
            Object object4 = object;
            object4.add(new mc(m2, (i)object3, null, 4, null));
        }
        return (List)object;
    }

    private static final List \u00d400000(ib object, m iterator) {
        object = object.\u00d3OO000().\u00d5OO000();
        iterator = object;
        object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object2 = iterator.next();
            object2 = (rc)object2;
            Object object3 = object;
            object3.add(new c((rc)object2, null, 2, null));
        }
        return (List)object;
    }

    static {
        b.t.m[] mArray = new b.t.m[2];
        b.t.m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(c.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        mArray2[1] = new b.o.d.ib(c.class, "arguments", "getArguments()Ljava/util/List;", 0);
        \u00f5\u00d5\u00d8000 = mArray2;
    }

    static /* synthetic */ v \u00d300000(c c2) {
        return c.\u00d400000(c2);
    }

    static /* synthetic */ List new(c c2, b.o.e.h h2) {
        return c.o00000(c2, h2);
    }

    static /* synthetic */ List \u00d300000(ib ib2, m m2) {
        return c.new(ib2, m2);
    }

    static /* synthetic */ List o00000(ib ib2, m m2) {
        return c.\u00d400000(ib2, m2);
    }

    static /* synthetic */ n o00000(c c2) {
        return c.new(c2);
    }
}

