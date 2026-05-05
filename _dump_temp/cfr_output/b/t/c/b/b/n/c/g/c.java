/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.m;
import b.o.e.g;
import b.qd;
import b.s.mc;
import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.ec;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.jc;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.q;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.s;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.n.c.d.j;
import b.t.c.b.b.n.c.g.c$_b;
import b.t.c.b.b.n.c.g.c$_c;
import b.t.c.b.b.n.c.g.d;
import b.t.c.b.b.n.c.g.e;
import b.t.c.b.b.n.c.g.f;
import b.t.c.b.b.n.c.g.h;
import b.t.c.b.b.n.c.g.n;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.kb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c {
    private final j super;

    public c(j j2) {
        this.super = j2;
    }

    public final rc o00000(rc rc2, g g2, boolean bl) {
        return this.o00000(rc2.\u00d8\u00d6\u00d2000(), g2, 0, bl).new();
    }

    private final c$_c o00000(l l2, g object, int n2, boolean bl) {
        Object object2;
        block13: {
            l l3;
            c$_b c$_b;
            block15: {
                boolean bl2;
                block16: {
                    l l4;
                    block18: {
                        block17: {
                            block14: {
                                if (hb.super(l2)) {
                                    return new c$_c(null, 1);
                                }
                                object2 = l2;
                                if (!(object2 instanceof b.t.c.b.b.h.f)) break block13;
                                bl2 = l2 instanceof ec;
                                c$_b = this.o00000(((b.t.c.b.b.h.f)l2).\u00f4\u00f4\u00d2000(), (g)object, n2, e.new, bl2, bl);
                                object = this.o00000(((b.t.c.b.b.h.f)l2).\u00d8\u00f4\u00d2000(), (g)object, n2, e.\u00d400000, bl2, bl);
                                int n3 = n2 = c$_b.\u00d300000() == ((c$_b)object).\u00d300000() ? 1 : 0;
                                if (m.new && n2 == 0) {
                                    object = "Different tree sizes of bounds: lower = (" + ((b.t.c.b.b.h.f)l2).\u00f4\u00f4\u00d2000() + ", " + c$_b.\u00d300000() + "), upper = (" + ((b.t.c.b.b.h.f)l2).\u00d8\u00f4\u00d2000() + ", " + ((c$_b)object).\u00d300000() + ')';
                                    throw new AssertionError(object);
                                }
                                if (c$_b.new() != null || ((c$_b)object).new() != null) break block14;
                                l3 = null;
                                break block15;
                            }
                            if (!c$_b.o00000() && !((c$_b)object).o00000()) break block16;
                            l4 = ((c$_b)object).new();
                            if (l4 == null) break block17;
                            object = l4;
                            Object object3 = c$_b.new();
                            if (object3 == null) {
                                object3 = object;
                            }
                            if ((l4 = oc.o00000((ib)object3, (ib)object)) != null) break block18;
                        }
                        l4 = c$_b.new();
                    }
                    object = l4;
                    l3 = jc.o00000(l2, (rc)object);
                    break block15;
                }
                if (bl2) {
                    ib ib2;
                    ib ib3 = c$_b.new();
                    if (ib3 == null) {
                        ib3 = ((b.t.c.b.b.h.f)l2).\u00f4\u00f4\u00d2000();
                    }
                    if ((ib2 = ((c$_b)object).new()) == null) {
                        ib2 = ((b.t.c.b.b.h.f)l2).\u00d8\u00f4\u00d2000();
                    }
                    l3 = new b.t.c.b.b.n.c.d.b.h(ib3, ib2);
                } else {
                    ib ib4;
                    ib ib5 = c$_b.new();
                    if (ib5 == null) {
                        ib5 = ((b.t.c.b.b.h.f)l2).\u00f4\u00f4\u00d2000();
                    }
                    if ((ib4 = ((c$_b)object).new()) == null) {
                        ib4 = ((b.t.c.b.b.h.f)l2).\u00d8\u00f4\u00d2000();
                    }
                    l3 = oc.o00000(ib5, ib4);
                }
            }
            l l5 = l3;
            return new c$_c(l5, c$_b.\u00d300000());
        }
        if (object2 instanceof ib) {
            object2 = c.o00000(this, (ib)l2, (g)object, n2, e.o00000, false, bl, 8, null);
            return new c$_c(((c$_b)object2).o00000() ? jc.o00000(l2, ((c$_b)object2).new()) : (l)((c$_b)object2).new(), ((c$_b)object2).\u00d300000());
        }
        throw new qd();
    }

    private final c$_b o00000(ib ib2, g arrayList, int n2, e object, boolean bl, boolean bl2) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        boolean bl3 = n.o00000((e)((Object)object));
        boolean bl4 = bl = !bl2 || !bl;
        if (!bl3 && ib2.\u00d4\u00d6\u00d2000().isEmpty()) {
            return new c$_b(null, 1, false);
        }
        kb kb2 = ib2.thisdosuper().\u00f4OO000();
        if (kb2 == null) {
            return new c$_b(null, 1, false);
        }
        kb kb3 = kb2;
        b.t.c.b.b.n.c.g.m m2 = (b.t.c.b.b.n.c.g.m)arrayList.\u00f800000(n2);
        kb3 = f.\u00d200000(kb3, m2, (e)((Object)object));
        object = f.\u00d200000(m2, (e)((Object)object));
        Object object6 = kb3;
        if (object6 == null || (object6 = object6.\u00d3OO000()) == null) {
            object6 = ib2.thisdosuper();
        }
        Object object7 = object6;
        int n3 = n2 + 1;
        Object object8 = ib2.\u00d4\u00d6\u00d2000();
        Iterable iterable = (Object[])object7.\u00f5OO000();
        Object object9 = object8.iterator();
        Object object10 = iterable.iterator();
        iterable = new ArrayList(Math.min(mc.o00000((Iterable)object8, 10), mc.o00000(iterable, 10)));
        while (object9.hasNext() && object10.hasNext()) {
            c$_c c$_c;
            object5 = (i)object10.next();
            object4 = (hc)object9.next();
            object3 = iterable;
            if (!bl) {
                c$_c = new c$_c(null, 0);
            } else if (!object4.super()) {
                c$_c = this.o00000(object4.\u00d300000().\u00d8\u00d6\u00d2000(), (g)((Object)arrayList), n3, bl2);
            } else if (((b.t.c.b.b.n.c.g.m)arrayList.\u00f800000(n3)).String() == d.\u00d300000) {
                object2 = object4.\u00d300000().\u00d8\u00d6\u00d2000();
                c$_c = new c$_c(oc.o00000(q.\u00d300000((rc)object2).\u00d4o0000(false), q.o00000((rc)object2).\u00d4o0000(true)), 1);
            } else {
                c$_c = new c$_c(null, 1);
            }
            object8 = c$_c;
            n3 += ((c$_c)object8).o00000();
            object3.add(((c$_c)object8).new() != null ? b.super(((c$_c)object8).new(), object4.\u00d200000(), (i)object5) : (kb3 != null && !object4.super() ? b.super(object4.\u00d300000(), object4.\u00d200000(), (i)object5) : (kb3 != null ? b.t.c.b.b.h.o.o00000((i)object5) : null)));
        }
        arrayList = (List)iterable;
        int n4 = n3 - n2;
        if (kb3 == null && object == null) {
            boolean bl5;
            iterable = arrayList;
            if (!((Collection)iterable).isEmpty()) {
                object9 = iterable.iterator();
                while (object9.hasNext()) {
                    if ((hc)object9.next() == null) continue;
                    bl5 = false;
                    break;
                }
            } else {
                bl5 = true;
            }
            if (bl5) {
                return new c$_b(null, n4, false);
            }
        }
        Object[] objectArray = new o[3];
        Object object11 = objectArray;
        objectArray[0] = ib2.\u00d4\u00f80000();
        object9 = f.o00000();
        object3 = object11;
        bl2 = kb3 != null;
        object3[1] = bl2 ? object9 : null;
        object9 = f.\u00d200000();
        object3 = object11;
        bl2 = object != null;
        object3[2] = bl2 ? object9 : null;
        object9 = arrayList;
        object10 = ib2.\u00d4\u00d6\u00d2000();
        Object object12 = object7;
        object3 = b.t.c.b.b.h.d.super(f.\u00d200000(mc.\u00d500000(object11)));
        object5 = object9.iterator();
        object4 = object10.iterator();
        arrayList = new ArrayList<Object[]>(Math.min(mc.o00000((Iterable)object9, 10), mc.o00000((Iterable)object10, 10)));
        while (object5.hasNext() && object4.hasNext()) {
            object2 = (hc)object4.next();
            object11 = (hc)object5.next();
            ArrayList<Object[]> arrayList2 = arrayList;
            Object object13 = object11;
            if (object11 == null) {
                object13 = object2;
            }
            arrayList2.add((Object[])object13);
        }
        List list = arrayList;
        Object object14 = object;
        object11 = oc.o00000((zb)object3, (bc)object12, list, object14 != null ? ((Boolean)object14).booleanValue() : ib2.\u00f5\u00d6\u00d2000(), null, 16, null);
        object9 = m2.\u00d500000() ? this.o00000((ib)object11) : object11;
        boolean bl6 = object != null && m2.\u00d600000();
        return new c$_b((ib)object9, n4, bl6);
    }

    static /* synthetic */ c$_b o00000(c c2, ib ib2, g g2, int n2, e e2, boolean bl, boolean bl2, int n3, Object object) {
        if ((n3 & 8) != 0) {
            bl = false;
        }
        if ((n3 & 0x10) != 0) {
            bl2 = false;
        }
        return c2.o00000(ib2, g2, n2, e2, bl, bl2);
    }

    private final ib o00000(ib ib2) {
        if (this.super.o00000()) {
            return s.o00000(ib2, true);
        }
        return new h(ib2);
    }
}

