/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.b.g;
import b.t.c.b.b.d.d;
import b.t.c.b.b.f.b.b.c;
import b.t.c.b.b.f.b.b.e;
import b.t.c.b.b.f.b.bb;
import b.t.c.b.b.f.b.ib;
import b.t.c.b.b.f.b.p$_b$0;
import b.t.c.b.b.f.b.p$_b$1;
import b.t.c.b.b.f.b.p$_b$2;
import b.t.c.b.b.f.b.p$_b$3;
import b.t.c.b.b.f.b.p$_b$4;
import b.t.c.b.b.f.b.p$_c$_b$_b$1;
import b.t.c.b.b.f.b.q;
import b.t.c.b.b.f.b.w;
import b.t.c.b.b.f.b.y;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.ob;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.s;
import b.t.c.b.b.h.sb;
import b.t.c.b.b.h.sb$_b;
import b.t.c.b.b.h.yc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_nb$_c;
import b.t.c.b.b.l.b$_nb$_c$_b;
import b.t.c.b.b.l.d.k;
import b.t.c.b.b.l.d.l;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.pc;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class p {
    private final q void;
    private final p \u00d500000;
    private final String \u00d400000;
    private final String Object;
    private final b.o.e.g o00000;
    private final b.o.e.g \u00d600000;
    private final Map \u00d200000;

    public p(q linkedHashMap, p object, List list, String string, String object2) {
        Map map;
        this.void = linkedHashMap;
        this.\u00d500000 = object;
        this.\u00d400000 = string;
        this.Object = object2;
        linkedHashMap = this;
        this.o00000 = this.void.\u00d500000().\u00d200000(new p$_b$0((p)((Object)linkedHashMap)));
        linkedHashMap = this;
        this.\u00d600000 = this.void.\u00d500000().\u00d200000(new p$_b$1((p)((Object)linkedHashMap)));
        p p2 = this;
        if (list.isEmpty()) {
            map = b.s.y.Object();
        } else {
            linkedHashMap = new LinkedHashMap();
            object = ((Iterable)list).iterator();
            int n2 = 0;
            p p3 = p2;
            while (object.hasNext()) {
                int n3 = n2++;
                object2 = (b$_b)object.next();
                ((Map)linkedHashMap).put(((b$_b)object2).voidfloatnew(), new c(this.void, (b$_b)object2, n3));
            }
            p2 = p3;
            map = linkedHashMap;
        }
        p2.\u00d200000 = map;
    }

    public final List o00000() {
        return mc.\u00f5O0000(this.\u00d200000.values());
    }

    public final rc \u00d300000(b$_nb b$_nb) {
        if (b$_nb.\u00d2O\u00d4000()) {
            String string = this.void.\u00f500000().new(b$_nb.voidintnew());
            b.t.c.b.b.h.ib ib2 = p.o00000(this, b$_nb, false, 2, null);
            b.t.c.b.b.h.ib ib3 = p.o00000(this, k.\u00d200000(b$_nb, this.void.String()), false, 2, null);
            return this.void.null().\u00d5O0000().super(b$_nb, string, ib2, ib3);
        }
        return this.o00000(b$_nb, true);
    }

    private final zb o00000(List iterable, o o2, bc bc2, wb wb2) {
        iterable = iterable;
        Object object = iterable;
        iterable = new ArrayList(mc.o00000((Iterable)iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (yc)object2;
            Iterable<zb> iterable2 = iterable;
            iterable2.add(object2.o00000(o2, bc2, wb2));
        }
        iterable = mc.\u00d300000(iterable);
        return zb.ifreturnclass.o00000((List)iterable);
    }

    public final b.t.c.b.b.h.ib o00000(b$_nb b$_nb, boolean bl) {
        Object object;
        b.t.c.b.b.h.ib ib2;
        Object object2;
        Object object3;
        b.t.c.b.b.h.ib ib3 = b$_nb.donullnew() ? this.String(b$_nb.Objectintnew()) : (b$_nb.O\u00d2\u00d4000() ? this.String(b$_nb.\u00d8\u00d2\u00d4000()) : null);
        if (ib3 != null) {
            return ib3;
        }
        bc bc2 = this.\u00d200000(b$_nb);
        if (b.t.c.b.b.h.d.k.o00000(bc2.\u00f4OO000())) {
            String[] stringArray = new String[1];
            String[] stringArray2 = stringArray;
            stringArray[0] = bc2.toString();
            return b.t.c.b.b.h.d.k.\u00d400000.o00000(b.t.c.b.b.h.d.c.newsuper, bc2, stringArray2);
        }
        Object object4 = b$_nb;
        Object object5 = this;
        object4 = new e(this.void.\u00d500000(), new p$_b$2((p)object5, (b$_nb)object4));
        p p2 = this;
        object5 = p2.o00000(p2.void.null().String(), (o)object4, bc2, this.void.\u00d600000());
        Object object6 = object3 = (Iterable)p.o00000(b$_nb, this);
        object3 = new ArrayList(mc.o00000((Iterable)object3, 10));
        int n2 = 0;
        object6 = object6.iterator();
        while (object6.hasNext()) {
            int n3;
            Object object7 = object6.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object7 = (b$_nb$_c)object7;
            Iterable iterable = object3;
            iterable.add(this.o00000((i)mc.\u00f400000(bc2.\u00f5OO000(), n3), (b$_nb$_c)object7));
        }
        object6 = mc.\u00f5O0000((Iterable)((List)object3));
        object3 = bc2.\u00f4OO000();
        if (bl && object3 instanceof h) {
            object6 = oc.o00000((h)object3, (List)object6);
            p p3 = this;
            object3 = p3.o00000(p3.void.null().String(), o.\u00d8o\u00f6000.o00000(mc.return((Iterable)object4, (Iterable)((rc)object6).\u00d4\u00f80000())), bc2, this.void.\u00d600000());
            Object object8 = object6;
            object2 = ((b.t.c.b.b.h.ib)object8).\u00d4o0000(hb.\u00d200000((rc)object8) || b$_nb.\u00d3O\u00d4000()).new((zb)object3);
        } else if (l.oO0000.\u00d200000(b$_nb.\u00d4o\u00d4000()).booleanValue()) {
            object2 = this.\u00d200000((zb)object5, bc2, (List)object6, b$_nb.\u00d3O\u00d4000());
        } else {
            object3 = oc.o00000((zb)object5, bc2, (List)object6, b$_nb.\u00d3O\u00d4000(), null, 16, null);
            if (l.\u00f5O0000.\u00d200000(b$_nb.\u00d4o\u00d4000()).booleanValue()) {
                sb sb2 = sb$_b.o00000(sb.\u00f5\u00f5\u00d8000, (b.t.c.b.b.h.l)object3, true, false, 4, null);
                if (sb2 == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + object3 + '\'').toString());
                }
                object2 = sb2;
            } else {
                object2 = ib2 = object3;
            }
        }
        if ((object = k.\u00d300000(b$_nb, this.void.String())) == null || (object = s.o00000(ib2, this.o00000((b$_nb)(object6 = object), false))) == null) {
            object = ib2;
        }
        return object;
    }

    public static /* synthetic */ b.t.c.b.b.h.ib o00000(p p2, b$_nb b$_nb, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = true;
        }
        return p2.o00000(b$_nb, bl);
    }

    private final bc \u00d200000(b$_nb object) {
        kb kb2;
        if (((b$_nb)object).donullnew()) {
            kb2 = (kb)this.o00000.\u00f800000(((b$_nb)object).Objectintnew());
            if (kb2 == null) {
                b$_nb b$_nb = object;
                kb2 = p.o00000(this, b$_nb, b$_nb.Objectintnew());
            }
        } else if (((b$_nb)object).\u00d3\u00d2\u00d4000()) {
            i i2 = this.\u00d200000(((b$_nb)object).publicintnew());
            if (i2 == null) {
                String[] stringArray = new String[2];
                String[] stringArray2 = stringArray;
                stringArray[0] = String.valueOf(((b$_nb)object).publicintnew());
                stringArray2[1] = this.Object;
                return b.t.c.b.b.h.d.k.\u00d400000.o00000(b.t.c.b.b.h.d.c.\u00d2\u00d30000, stringArray2);
            }
            kb2 = i2;
        } else if (((b$_nb)object).floatintnew()) {
            Object v4;
            block13: {
                object = this.void.\u00f500000().new(((b$_nb)object).\u00d2\u00d2\u00d4000());
                for (Object t2 : (Iterable)this.o00000()) {
                    if (!fc.o00000((Object)((i)t2).\u00d5\u00f80000().\u00d400000(), object)) continue;
                    v4 = t2;
                    break block13;
                }
                v4 = null;
            }
            i i3 = v4;
            if (i3 == null) {
                String[] stringArray = new String[2];
                String[] stringArray3 = stringArray;
                stringArray[0] = object;
                stringArray3[1] = this.void.\u00d600000().toString();
                return b.t.c.b.b.h.d.k.\u00d400000.o00000(b.t.c.b.b.h.d.c.whilesuper, stringArray3);
            }
            kb2 = i3;
        } else if (((b$_nb)object).O\u00d2\u00d4000()) {
            kb2 = (kb)this.\u00d600000.\u00f800000(((b$_nb)object).\u00d8\u00d2\u00d4000());
            if (kb2 == null) {
                Object object2 = object;
                kb2 = p.o00000(this, (b$_nb)object2, ((b$_nb)object2).\u00d8\u00d2\u00d4000());
            }
        } else {
            return b.t.c.b.b.h.d.k.\u00d400000.o00000(b.t.c.b.b.h.d.c.o00000, new String[0]);
        }
        return kb2.\u00d3OO000();
    }

    private final b.t.c.b.b.h.ib \u00d200000(zb zb2, bc bc2, List list, boolean bl) {
        b.t.c.b.b.h.ib ib2;
        b.t.c.b.b.h.ib ib3;
        switch (bc2.\u00f5OO000().size() - list.size()) {
            case 0: {
                ib3 = this.o00000(zb2, bc2, list, bl);
                break;
            }
            case 1: {
                int n2 = list.size() - 1;
                if (n2 >= 0) {
                    ib3 = oc.o00000(zb2, bc2.forint().\u00d300000(n2).\u00d3OO000(), list, bl, null, 16, null);
                    break;
                }
                ib3 = null;
                break;
            }
            default: {
                ib3 = ib2 = null;
            }
        }
        if (ib3 == null) {
            ib2 = b.t.c.b.b.h.d.k.\u00d400000.o00000(b.t.c.b.b.h.d.c.oo0000, list, bc2, new String[0]);
        }
        return ib2;
    }

    private final b.t.c.b.b.h.ib o00000(zb object, bc bc2, List list, boolean bl) {
        if (!g.\u00f400000((rc)(object = oc.o00000((zb)object, bc2, list, bl, null, 16, null)))) {
            return null;
        }
        return this.o00000((rc)object);
    }

    private final b.t.c.b.b.h.ib o00000(rc rc2) {
        Object object;
        Object object2 = (hc)mc.\u00f4O0000(g.return(rc2));
        if (object2 == null || (object2 = object2.\u00d300000()) == null) {
            return null;
        }
        Object object3 = object2;
        kb kb2 = ((rc)object2).thisdosuper().\u00f4OO000();
        Object object4 = object = kb2 != null ? b.\u00d800000(kb2) : null;
        if (((rc)object3).\u00d4\u00d6\u00d2000().size() != 1 || !fc.o00000(object, (Object)b.t.c.b.b.b.d.\u00d300000) && !fc.o00000(object, (Object)bb.o00000())) {
            return (b.t.c.b.b.h.ib)rc2;
        }
        object3 = ((hc)mc.\u00d5O0000(((rc)object3).\u00d4\u00d6\u00d2000())).\u00d300000();
        object = this.void.\u00d600000();
        b.t.c.b.b.q.b b2 = object instanceof b.t.c.b.b.q.b ? (b.t.c.b.b.q.b)object : null;
        if (fc.o00000((Object)(b2 != null ? b.\u00d300000(b2) : null), (Object)w.\u00d200000)) {
            return this.o00000(rc2, (rc)object3);
        }
        return this.o00000(rc2, (rc)object3);
    }

    private final b.t.c.b.b.h.ib o00000(rc rc2, rc rc3) {
        Iterable<rc> iterable;
        Iterable iterable2 = mc.if(g.return(rc2), 1);
        List list = g.\u00d500000(rc2);
        rc rc4 = g.\u00d800000(rc2);
        o o2 = rc2.\u00d4\u00f80000();
        b.t.c.b.b.b.c c2 = b.t.c.b.b.h.b.b.\u00d400000(rc2);
        Object object = iterable2;
        iterable2 = new ArrayList(mc.o00000(iterable2, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (hc)object2;
            iterable = iterable2;
            iterable.add(object2.\u00d300000());
        }
        iterable = (List)iterable2;
        return g.o00000(c2, o2, rc4, list, (List)iterable, null, rc3, true).\u00d4o0000(rc2.\u00f5\u00d6\u00d2000());
    }

    private final i \u00d200000(int n2) {
        i i2;
        while ((i2 = (i)this.\u00d200000.get(n2)) == null) {
            if (this.\u00d500000 != null) continue;
            i2 = null;
            break;
        }
        return i2;
    }

    private final kb o00000(int n2) {
        d d2 = y.super(this.void.\u00f500000(), n2);
        if (d2.return()) {
            return this.void.null().o00000(d2);
        }
        return pc.new(this.void.null().\u00f800000(), d2);
    }

    private final b.t.c.b.b.h.ib String(int n2) {
        if (y.super(this.void.\u00f500000(), n2).return()) {
            return this.void.null().\u00d200000().super();
        }
        return null;
    }

    private final kb \u00d300000(int n2) {
        d d2 = y.super(this.void.\u00f500000(), n2);
        if (d2.return()) {
            return null;
        }
        return pc.o00000(this.void.null().\u00f800000(), d2);
    }

    private final hc o00000(i stringArray, b$_nb$_c d2) {
        if (((b$_nb$_c)d2).\u00d8\u00d2o000() == b$_nb$_c$_b.\u00d3\u00d80000) {
            if (stringArray == null) {
                return new b.t.c.b.b.h.y(this.void.null().\u00f800000().returnforsuper());
            }
            return new ob((i)stringArray);
        }
        stringArray = ib.super.super(((b$_nb$_c)d2).\u00d8\u00d2o000());
        b$_nb b$_nb = k.o00000((b$_nb$_c)d2, this.void.String());
        if (b$_nb == null) {
            String[] stringArray2 = new String[1];
            stringArray = stringArray2;
            stringArray2[0] = d2.toString();
            return new lc(b.t.c.b.b.h.d.k.new(b.t.c.b.b.h.d.c.\u00d6\u00d50000, stringArray));
        }
        d2 = b$_nb;
        return new lc((b.t.c.b.b.h.w)stringArray, this.\u00d300000((b$_nb)d2));
    }

    public final String toString() {
        return this.\u00d400000 + (this.\u00d500000 == null ? "" : ". Child of " + this.\u00d500000.\u00d400000);
    }

    private static final kb o00000(p p2, int n2) {
        return p2.o00000(n2);
    }

    private static final kb \u00d200000(p p2, int n2) {
        return p2.\u00d300000(n2);
    }

    private static final List \u00d200000(p p2, b$_nb b$_nb) {
        return p2.void.null().\u00f500000().super(b$_nb, p2.void.\u00f500000());
    }

    private static final List o00000(b$_nb b$_nb, p p2) {
        Collection collection = b$_nb.superifnew();
        b$_nb b$_nb2 = k.o00000(b$_nb, p2.void.String());
        List list = b$_nb2 != null ? p.o00000(b$_nb2, p2) : null;
        if (list == null) {
            list = mc.\u00d500000();
        }
        return mc.return(collection, (Iterable)list);
    }

    private static final b$_nb String(p p2, b$_nb b$_nb) {
        return k.o00000(b$_nb, p2.void.String());
    }

    private static final int String(b$_nb b$_nb) {
        return b$_nb.\u00d8O\u00d4000();
    }

    private static final b.t.c.b.b.q.ib o00000(p p2, b$_nb object, int n2) {
        d d2 = y.super(p2.void.\u00f500000(), n2);
        b$_nb b$_nb = object;
        object = p2;
        object = b.g.c.whilesuper(b.g.c.\u00f5\u00d30000(b.g.c.o00000((Object)b$_nb, (b.o.e.g)new p$_b$3((p)object)), p$_b$4.\u00d3\u00f8\u00d3000));
        int n3 = b.g.c.\u00f8\u00d30000(b.g.c.o00000((Object)d2, (b.o.e.g)p$_c$_b$_b$1.\u00d4o\u00d3000));
        while (object.size() < n3) {
            object.add(0);
        }
        return p2.void.null().null().o00000(d2, (List)object);
    }

    static /* synthetic */ kb \u00d300000(p p2, int n2) {
        return p.o00000(p2, n2);
    }

    static /* synthetic */ kb String(p p2, int n2) {
        return p.\u00d200000(p2, n2);
    }

    static /* synthetic */ List \u00d300000(p p2, b$_nb b$_nb) {
        return p.\u00d200000(p2, b$_nb);
    }

    static /* synthetic */ b$_nb o00000(p p2, b$_nb b$_nb) {
        return p.String(p2, b$_nb);
    }

    static /* synthetic */ int o00000(b$_nb b$_nb) {
        return p.String(b$_nb);
    }
}

