/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.b;

import b.m;
import b.o.d.fc;
import b.s.l;
import b.t.c.b.b.b.j;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.mc;
import b.t.c.b.b.h.n;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.t;
import b.t.c.b.b.h.w;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.n.c.b.ab;
import b.t.c.b.b.n.c.b.b;
import b.t.c.b.b.n.c.b.cb;
import b.t.c.b.b.n.c.b.r;
import b.t.c.b.b.n.c.b.s;
import b.t.c.b.b.n.c.b.z;
import b.t.c.b.b.n.c.d.b.c;
import b.t.c.b.b.n.c.d.b.d$_b$0;
import b.t.c.b.b.n.c.d.b.e;
import b.t.c.b.b.n.c.d.b.f;
import b.t.c.b.b.n.c.d.b.g;
import b.t.c.b.b.n.c.d.b.h;
import b.t.c.b.b.n.c.d.b.i;
import b.t.c.b.b.n.c.db;
import b.t.c.b.b.q.e.k;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d {
    private final b.t.c.b.b.n.c.d.i \u00d400000;
    private final b.t.c.b.b.n.c.d.g new;
    private final g o00000;
    private final mc \u00d300000;

    public d(b.t.c.b.b.n.c.d.i i2, b.t.c.b.b.n.c.d.g g2) {
        this.\u00d400000 = i2;
        this.new = g2;
        this.o00000 = new g();
        this.\u00d300000 = new mc(this.o00000, null, 2, null);
    }

    public final rc o00000(r object, i i2) {
        Object object2;
        r r2 = object;
        if (r2 instanceof b.t.c.b.b.n.c.b.o) {
            return (object = ((b.t.c.b.b.n.c.b.o)object).\u00d3\u00d50000()) != null ? this.\u00d400000.\u00d300000().returnforsuper().o00000((j)((Object)object)) : this.\u00d400000.\u00d300000().returnforsuper().returnsuper();
        }
        if (r2 instanceof b.t.c.b.b.n.c.b.c) {
            return this.new((b.t.c.b.b.n.c.b.c)object, i2);
        }
        if (r2 instanceof b.t.c.b.b.n.c.b.j) {
            return d.o00000(this, (b.t.c.b.b.n.c.b.j)object, i2, false, 4, null);
        }
        if (r2 instanceof b.t.c.b.b.n.c.b.m) {
            object2 = ((b.t.c.b.b.n.c.b.m)object).\u00d5\u00d50000();
            if (object2 == null || (object2 = this.o00000((r)(object = object2), i2)) == null) {
                return this.\u00d400000.\u00d300000().returnforsuper().\u00f5O0000();
            }
        } else {
            if (r2 == null) {
                return this.\u00d400000.\u00d300000().returnforsuper().\u00f5O0000();
            }
            throw new UnsupportedOperationException("Unsupported type: ".concat(String.valueOf(object)));
        }
        return object2;
    }

    public final rc o00000(b.t.c.b.b.n.c.b.j object, i object2, boolean bl) {
        Object object3 = object.\u00f5\u00d50000();
        b.t.c.b.b.n.c.b.o o2 = object3 instanceof b.t.c.b.b.n.c.b.o ? (b.t.c.b.b.n.c.b.o)object3 : null;
        j j2 = o2 != null ? o2.\u00d3\u00d50000() : null;
        object = new b.t.c.b.b.n.c.d.h(this.\u00d400000, (s)object, true);
        if (j2 != null) {
            b.t.c.b.b.h.ib ib2 = this.\u00d400000.\u00d300000().returnforsuper().\u00d200000(j2);
            o[] oArray = new o[2];
            object3 = oArray;
            oArray[0] = ib2.\u00d4\u00f80000();
            object3[1] = object;
            object3 = (b.t.c.b.b.h.ib)b.t.c.b.b.h.b.b.super((rc)ib2, new k((o[])object3));
            if (((i)object2).\u00d600000()) {
                return (rc)object3;
            }
            Object object4 = object3;
            return oc.o00000((b.t.c.b.b.h.ib)object4, ((b.t.c.b.b.h.ib)object4).\u00d4o0000(true));
        }
        object3 = this.o00000((r)object3, f.o00000(t.\u00d200000, ((i)object2).\u00d600000(), false, null, 6, null));
        if (((i)object2).\u00d600000()) {
            object2 = bl ? w.return : w.\u00d400000;
            return this.\u00d400000.\u00d300000().returnforsuper().o00000((w)((Object)object2), (rc)object3, (o)object);
        }
        return oc.o00000(this.\u00d400000.\u00d300000().returnforsuper().o00000(w.\u00d400000, (rc)object3, (o)object), this.\u00d400000.\u00d300000().returnforsuper().o00000(w.return, (rc)object3, (o)object).\u00d4o0000(true));
    }

    public static /* synthetic */ rc o00000(d d2, b.t.c.b.b.n.c.b.j j2, i i2, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return d2.o00000(j2, i2, bl);
    }

    private final rc new(b.t.c.b.b.n.c.b.c object, i i2) {
        boolean bl = !i2.\u00d600000() && ((b.t.c.b.b.h.m)i2).Object() != t.o00000;
        boolean bl2 = object.\u00f8\u00d40000();
        if (!bl2 && !bl) {
            b.t.c.b.b.h.ib ib2 = this.o00000((b.t.c.b.b.n.c.b.c)object, i2, (b.t.c.b.b.h.ib)null);
            if (ib2 != null) {
                return ib2;
            }
            return d.new((b.t.c.b.b.n.c.b.c)object);
        }
        b.t.c.b.b.h.ib ib3 = this.o00000((b.t.c.b.b.n.c.b.c)object, i2.o00000(e.String), (b.t.c.b.b.h.ib)null);
        if (ib3 == null) {
            return d.new((b.t.c.b.b.n.c.b.c)object);
        }
        b.t.c.b.b.h.ib ib4 = ib3;
        b.t.c.b.b.h.ib ib5 = this.o00000((b.t.c.b.b.n.c.b.c)object, i2.o00000(e.\u00d500000), ib4);
        if (ib5 == null) {
            return d.new((b.t.c.b.b.n.c.b.c)object);
        }
        object = ib5;
        if (bl2) {
            return new h(ib4, (b.t.c.b.b.h.ib)object);
        }
        return oc.o00000(ib4, (b.t.c.b.b.h.ib)object);
    }

    private final b.t.c.b.b.h.ib o00000(b.t.c.b.b.n.c.b.c object, i i2, b.t.c.b.b.h.ib ib2) {
        Object object2 = ib2;
        if (object2 == null || (object2 = ((rc)object2).\u00d5\u00d6\u00d2000()) == null) {
            object2 = b.t.c.b.b.h.d.super(new b.t.c.b.b.n.c.d.h(this.\u00d400000, (s)object, false, 4, null));
        }
        Object object3 = object2;
        bc bc2 = this.o00000((b.t.c.b.b.n.c.b.c)object, i2);
        if (bc2 == null) {
            return null;
        }
        bc bc3 = bc2;
        boolean bl = this.o00000(i2);
        b.t.c.b.b.h.ib ib3 = ib2;
        if (fc.o00000((Object)(ib3 != null ? ib3.thisdosuper() : null), (Object)bc3) && !object.\u00f8\u00d40000() && bl) {
            return ib2.\u00d4o0000(true);
        }
        object = this.o00000((b.t.c.b.b.n.c.b.c)object, i2, bc3);
        return oc.o00000((zb)object3, bc3, (List)object, bl, null, 16, null);
    }

    private final bc o00000(b.t.c.b.b.n.c.b.c object, i i2) {
        Object object2;
        cb cb2 = object.O\u00d50000();
        if (cb2 == null) {
            return this.o00000((b.t.c.b.b.n.c.b.c)object);
        }
        cb cb3 = cb2;
        Object object3 = cb2;
        if (cb2 instanceof b) {
            b.t.c.b.b.d.k k2 = ((b)cb3).Oo0000();
            if (k2 == null) {
                object = "Class type should have a FQ name: ".concat(String.valueOf(cb3));
                throw new AssertionError(object);
            }
            object3 = k2;
            Object object4 = this.o00000((b.t.c.b.b.n.c.b.c)object, i2, (b.t.c.b.b.d.k)object3);
            if (object4 == null) {
                object4 = object2 = this.\u00d400000.\u00d500000().\u00d400000().super((b)cb3);
            }
            if (object4 == null || (object2 = object2.\u00d3OO000()) == null) {
                return this.o00000((b.t.c.b.b.n.c.b.c)object);
            }
        } else {
            if (object3 instanceof ab) {
                b.t.c.b.b.q.i i3 = this.new.o00000((ab)cb3);
                if (i3 != null) {
                    return i3.\u00d3OO000();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: ".concat(String.valueOf(cb3)));
        }
        return object2;
    }

    private final bc o00000(b.t.c.b.b.n.c.b.c object) {
        object = b.t.c.b.b.d.d.String.o00000(new b.t.c.b.b.d.k(object.privateObject()));
        return this.\u00d400000.\u00d500000().supersuper().\u00d400000().null().o00000((b.t.c.b.b.d.d)object, b.s.mc.o00000((Object)0)).\u00d3OO000();
    }

    private final ib o00000(b.t.c.b.b.n.c.b.c c2, i i2, b.t.c.b.b.d.k object) {
        if (i2.\u00d600000() && fc.o00000(object, (Object)c.o00000())) {
            return this.\u00d400000.\u00d500000().void().\u00d200000();
        }
        b.t.c.b.b.b.c.h h2 = b.t.c.b.b.b.c.h.o00000;
        ib ib2 = b.t.c.b.b.b.c.h.o00000(h2, (b.t.c.b.b.d.k)object, this.\u00d400000.\u00d300000().returnforsuper(), null, 4, null);
        if (ib2 == null) {
            return null;
        }
        object = ib2;
        if (h2.\u00d300000((ib)object) && (i2.\u00d400000() == e.String || ((b.t.c.b.b.h.m)i2).Object() == t.o00000 || this.o00000(c2, (ib)object))) {
            return h2.new((ib)object);
        }
        return object;
    }

    private final boolean o00000(b.t.c.b.b.n.c.b.c object, ib ib2) {
        if (!z.super((r)b.s.mc.\u00f4O0000(object.o\u00d50000()))) {
            return false;
        }
        object = (b.t.c.b.b.q.i)b.s.mc.\u00f4O0000(b.t.c.b.b.b.c.h.o00000.new(ib2).\u00d3OO000().\u00f5OO000());
        if (object == null || (object = object.\u00d4\u00d5o000()) == null) {
            return false;
        }
        return object != w.return;
    }

    private final List o00000(b.t.c.b.b.n.c.b.c c2, List iterable, bc bc2, i i2) {
        iterable = iterable;
        Object object = iterable;
        iterable = new ArrayList(b.s.mc.o00000((Iterable)iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            hc hc2;
            Object object2 = object.next();
            object2 = (b.t.c.b.b.q.i)object2;
            Iterable<hc> iterable2 = iterable;
            if (b.t.c.b.b.h.b.b.super(object2, null, ((b.t.c.b.b.h.m)i2).\u00d200000())) {
                hc2 = b.t.c.b.b.h.o.o00000(object2, i2);
            } else {
                Object object3 = c2;
                bc bc3 = bc2;
                i i3 = i2;
                Object object4 = object2;
                d d2 = this;
                object3 = new b.t.c.b.b.h.e(this.\u00d400000.return(), new d$_b$0(d2, (b.t.c.b.b.q.i)object4, i3, bc3, (b.t.c.b.b.n.c.b.c)object3));
                hc2 = ((n)this.o00000).o00000((b.t.c.b.b.q.i)object2, i2.o00000(c2.\u00f8\u00d40000()), this.\u00d300000, (rc)object3);
            }
            iterable2.add(hc2);
        }
        return iterable;
    }

    private final List o00000(b.t.c.b.b.n.c.b.c object, i iterator, bc object2) {
        int n2 = object.\u00f8\u00d40000() || object.o\u00d50000().isEmpty() && !((Collection)object2.\u00f5OO000()).isEmpty() ? 1 : 0;
        List list = object2.\u00f5OO000();
        if (n2 != 0) {
            return this.o00000((b.t.c.b.b.n.c.b.c)object, list, (bc)object2, (i)((Object)iterator));
        }
        if (list.size() != object.o\u00d50000().size()) {
            object = list;
            iterator = object;
            object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                object2 = iterator.next();
                object2 = (b.t.c.b.b.q.i)object2;
                Object object3 = object;
                String[] stringArray = new String[1];
                String[] stringArray2 = stringArray;
                stringArray[0] = object2.\u00d5\u00f80000().\u00d400000();
                object3.add(new lc(b.t.c.b.b.h.d.k.new(b.t.c.b.b.h.d.c.\u00f6O0000, stringArray2)));
            }
            return b.s.mc.\u00f5O0000((Iterable)((List)object));
        }
        object = b.s.mc.O\u00d20000(object.o\u00d50000());
        iterator = object;
        object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            boolean bl;
            object2 = iterator.next();
            object2 = (l)object2;
            Object object4 = object;
            n2 = ((l)object2).\u00d200000();
            object2 = (r)((l)object2).\u00d300000();
            boolean bl2 = bl = n2 < list.size();
            if (m.new && !bl) {
                object = "Argument index should be less then type parameters count, but " + n2 + " > " + list.size();
                throw new AssertionError(object);
            }
            b.t.c.b.b.q.i i2 = (b.t.c.b.b.q.i)list.get(n2);
            object4.add(this.o00000((r)object2, f.o00000(t.\u00d200000, false, false, null, 7, null), i2));
        }
        return b.s.mc.\u00f5O0000((Iterable)((List)object));
    }

    private final hc o00000(r object, i object2, b.t.c.b.b.q.i i2) {
        if (object instanceof b.t.c.b.b.n.c.b.m) {
            w w2;
            r r2 = ((b.t.c.b.b.n.c.b.m)object).\u00d5\u00d50000();
            w w3 = w2 = ((b.t.c.b.b.n.c.b.m)object).returnString() ? w.return : w.o00000;
            if (r2 == null || this.o00000(w2, i2)) {
                return b.t.c.b.b.h.o.o00000(i2, (b.t.c.b.b.h.m)object2);
            }
            object = db.super(this.\u00d400000, (b.t.c.b.b.n.c.b.m)object);
            object2 = this.o00000(r2, f.o00000(t.\u00d200000, false, false, null, 7, null));
            return b.t.c.b.b.h.b.b.super((rc)(object != null ? b.t.c.b.b.h.b.b.super((rc)object2, o.\u00d8o\u00f6000.o00000(b.s.mc.return((Iterable)((rc)object2).\u00d4\u00f80000(), object))) : object2), w2, i2);
        }
        return new lc(w.\u00d400000, this.o00000((r)object, (i)object2));
    }

    private final boolean o00000(w w2, b.t.c.b.b.q.i i2) {
        if (i2.\u00d4\u00d5o000() == w.\u00d400000) {
            return false;
        }
        return w2 != i2.\u00d4\u00d5o000();
    }

    private final boolean o00000(i i2) {
        if (i2.\u00d400000() == e.String) {
            return false;
        }
        return !i2.\u00d600000() && ((b.t.c.b.b.h.m)i2).Object() != t.o00000;
    }

    private static final b.t.c.b.b.h.d.e new(b.t.c.b.b.n.c.b.c c2) {
        String[] stringArray = new String[1];
        String[] stringArray2 = stringArray;
        stringArray[0] = c2.\u00f5\u00d40000();
        return b.t.c.b.b.h.d.k.new(b.t.c.b.b.h.d.c.whileObject, stringArray2);
    }

    private static final rc new(d d2, b.t.c.b.b.q.i i2, i i3, bc bc2, b.t.c.b.b.n.c.b.c c2) {
        kb kb2 = bc2.\u00f4OO000();
        return d2.\u00d300000.o00000(i2, i3.o00000(kb2 != null ? kb2.nullint() : null).o00000(c2.\u00f8\u00d40000()));
    }

    static /* synthetic */ rc o00000(d d2, b.t.c.b.b.q.i i2, i i3, bc bc2, b.t.c.b.b.n.c.b.c c2) {
        return d.new(d2, i2, i3, bc2, c2);
    }
}

