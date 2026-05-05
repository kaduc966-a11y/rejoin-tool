/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.g;

import b.i;
import b.m;
import b.o.d.fc;
import b.qb;
import b.qd;
import b.s.mc;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.g.b;
import b.t.c.b.b.h.g.c$_b$0;
import b.t.c.b.b.h.g.c$_b$1;
import b.t.c.b.b.h.g.c$_c$_b$1;
import b.t.c.b.b.h.g.c$_d;
import b.t.c.b.b.h.g.d;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.jc;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.q;
import b.t.c.b.b.h.r;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.k.h$_c;
import b.t.c.b.b.o.d.b.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c {
    private static final hc \u00d200000(d object) {
        boolean bl = ((d)object).\u00d200000();
        if (m.new && !bl) {
            b.t.c.b.b.k.b b2 = b.t.c.b.b.k.b.\u00f600000.o00000(c$_b$0.OO\u00d4000);
            object = "Only consistent enhanced type projection can be converted to type projection, but [" + b2.super(((d)object).\u00d400000()) + ": <" + b2.super(((d)object).Object()) + ", " + b2.super(((d)object).o00000()) + ">] was found";
            throw new AssertionError(object);
        }
        if (fc.o00000((Object)((d)object).Object(), (Object)((d)object).o00000()) || ((d)object).\u00d400000().\u00d4\u00d5o000() == w.o00000) {
            return new lc(((d)object).Object());
        }
        if (b.t.c.b.b.b.c.\u00f5O0000(((d)object).Object()) && ((d)object).\u00d400000().\u00d4\u00d5o000() != w.o00000) {
            return new lc(c.super((d)object, w.return), ((d)object).o00000());
        }
        if (b.t.c.b.b.b.c.\u00d300000(((d)object).o00000())) {
            return new lc(c.super((d)object, w.o00000), ((d)object).Object());
        }
        return new lc(c.super((d)object, w.return), ((d)object).o00000());
    }

    private static final d super(hc hc2, b.t.c.b.b.q.i i2) {
        switch (c$_d.o00000[kc.o00000(i2.\u00d4\u00d5o000(), hc2).ordinal()]) {
            case 1: {
                return new d(i2, hc2.\u00d300000(), hc2.\u00d300000());
            }
            case 2: {
                return new d(i2, hc2.\u00d300000(), b.t.c.b.b.o.f.b.null(i2).\u00f800000());
            }
            case 3: {
                b.t.c.b.b.q.i i3 = i2;
                return new d(i3, b.t.c.b.b.o.f.b.null(i3).ifsuper(), hc2.\u00d300000());
            }
        }
        throw new qd();
    }

    public static final hc super(hc object, boolean bl) {
        if (object == null) {
            return null;
        }
        if (object.super()) {
            return object;
        }
        rc rc2 = object.\u00d300000();
        if (!o.o00000(rc2, c$_b$1.\u00f80\u00d4000)) {
            return object;
        }
        w w2 = object.\u00d200000();
        if (w2 == w.return) {
            object = c.super(rc2);
            return new lc(w2, (rc)((b)object).\u00d400000());
        }
        if (bl) {
            object = (rc)c.super(rc2).\u00d300000();
            return new lc(w2, (rc)object);
        }
        return c.super((hc)object);
    }

    private static final hc super(hc hc2) {
        return kc.o00000(new c$_c$_b$1()).new(hc2);
    }

    public static final b super(rc rc2) {
        boolean bl;
        Object object2;
        if (q.\u00d400000(rc2)) {
            b b2 = c.super((rc)q.\u00d300000(rc2));
            b b3 = c.super((rc)q.o00000(rc2));
            return new b(jc.\u00d200000(oc.o00000(q.\u00d300000((rc)b2.\u00d300000()), q.o00000((rc)b3.\u00d300000())), rc2), jc.\u00d200000(oc.o00000(q.\u00d300000((rc)b2.\u00d400000()), q.o00000((rc)b3.\u00d400000())), rc2));
        }
        bc bc2 = rc2.thisdosuper();
        if (e.o00000(rc2)) {
            hc hc2 = ((b.t.c.b.b.o.d.b.c)bc2).\u00f5\u00d2O000();
            rc rc3 = c.super(hc2.\u00d300000(), rc2);
            switch (c$_d.o00000[hc2.\u00d200000().ordinal()]) {
                case 2: {
                    return new b(rc3, b.t.c.b.b.h.b.b.\u00d400000(rc2).\u00f800000());
                }
                case 3: {
                    return new b(c.super((rc)b.t.c.b.b.h.b.b.\u00d400000(rc2).ifsuper(), rc2), rc3);
                }
            }
            throw new AssertionError((Object)"Only nontrivial projections should have been captured, not: ".concat(String.valueOf(hc2)));
        }
        if (rc2.\u00d4\u00d6\u00d2000().isEmpty() || rc2.\u00d4\u00d6\u00d2000().size() != bc2.\u00f5OO000().size()) {
            rc rc4 = rc2;
            return new b(rc4, rc4);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        for (Object object2 : mc.\u00d300000((Iterable)rc2.\u00d4\u00d6\u00d2000(), (Iterable)bc2.\u00f5OO000())) {
            Object object3 = (hc)((qb)object2).\u00d400000();
            object2 = (b.t.c.b.b.q.i)((qb)object2).\u00d300000();
            object2 = c.super((hc)object3, (b.t.c.b.b.q.i)object2);
            if (object3.super()) {
                arrayList.add(object2);
                arrayList2.add(object2);
                continue;
            }
            object3 = c.super((d)object2);
            object2 = (d)((b)object3).new();
            object3 = (d)((b)object3).o00000();
            arrayList.add(object2);
            arrayList2.add(object3);
        }
        object2 = arrayList;
        if (!((Collection)object2).isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                if (!(!((d)object2.next()).\u00d200000())) continue;
                bl = true;
                break;
            }
        } else {
            bl = false;
        }
        boolean bl2 = bl;
        return new b(bl2 ? (rc)b.t.c.b.b.h.b.b.\u00d400000(rc2).ifsuper() : c.super(rc2, arrayList), c.super(rc2, arrayList2));
    }

    private static final rc super(rc iterator, List collection) {
        boolean bl;
        boolean bl2 = bl = ((rc)((Object)iterator)).\u00d4\u00d6\u00d2000().size() == collection.size();
        if (m.new && !bl) {
            iterator = "Incorrect type arguments ".concat(String.valueOf(collection));
            throw new AssertionError(iterator);
        }
        Object object = collection;
        rc rc2 = iterator;
        iterator = object;
        collection = new ArrayList(mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            object = (d)object;
            Collection<hc> collection2 = collection;
            collection2.add(c.\u00d200000((d)object));
        }
        return r.super(rc2, (List)collection, null, null, 6, null);
    }

    private static final b super(d d2) {
        Object object = c.super(d2.Object());
        rc rc2 = (rc)((b)object).new();
        object = (rc)((b)object).o00000();
        Object object2 = c.super(d2.o00000());
        rc rc3 = (rc)((b)object2).new();
        object2 = (rc)((b)object2).o00000();
        return new b(new d(d2.\u00d400000(), (rc)object, rc3), new d(d2.\u00d400000(), rc2, (rc)object2));
    }

    private static final i super(b.t.c.b.b.k.o o2) {
        o2.super(h$_c.super);
        return i.o00000;
    }

    private static final w super(d d2, w w2) {
        if (w2 == d2.\u00d400000().\u00d4\u00d5o000()) {
            return w.\u00d400000;
        }
        return w2;
    }

    private static final Boolean \u00d200000(l l2) {
        return e.o00000(l2);
    }

    private static final rc super(rc rc2, rc rc3) {
        return o.\u00d200000(rc2, rc3.\u00f5\u00d6\u00d2000());
    }

    static /* synthetic */ i \u00d200000(b.t.c.b.b.k.o o2) {
        return c.super(o2);
    }

    static /* synthetic */ Boolean super(l l2) {
        return c.\u00d200000(l2);
    }
}

