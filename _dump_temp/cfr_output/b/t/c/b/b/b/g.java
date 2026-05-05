/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.m;
import b.o.d.fc;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.b.b.b;
import b.t.c.b.b.b.b.b$_b;
import b.t.c.b.b.b.b.b$_e;
import b.t.c.b.b.b.b.e;
import b.t.c.b.b.b.c;
import b.t.c.b.b.b.d;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.d.f;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.c.p;
import b.t.c.b.b.o.c.z;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.wb;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g {
    public static final b \u00f500000(rc rc2) {
        kb kb2 = rc2.thisdosuper().\u00f4OO000();
        if (kb2 != null) {
            return g.new(kb2);
        }
        return null;
    }

    public static final boolean \u00f400000(rc rc2) {
        return fc.o00000((Object)g.\u00f500000(rc2), (Object)b$_b.\u00f800000);
    }

    public static final boolean o00000(rc rc2) {
        return fc.o00000((Object)g.\u00f500000(rc2), (Object)b$_e.if);
    }

    public static final boolean \u00d400000(rc rc2) {
        kb kb2 = rc2.thisdosuper().\u00f4OO000();
        if (kb2 != null) {
            return g.o00000(kb2);
        }
        return false;
    }

    public static final boolean o00000(wb object) {
        return fc.o00000(object = g.new((wb)object), (Object)b$_b.\u00f800000) || fc.o00000(object, (Object)b$_e.if);
    }

    public static final boolean \u00d300000(rc rc2) {
        return g.\u00d400000(rc2) && g.new(rc2);
    }

    private static final boolean new(rc rc2) {
        return rc2.\u00d4\u00f80000().\u00d400000(d$_b.O\u00d80000) != null;
    }

    public static final boolean new(b.t.c.b.b.d.e e2) {
        return e2.\u00d200000(d.while) && fc.o00000((Object)g.o00000(e2), (Object)b$_b.\u00f800000);
    }

    public static final b new(wb wb2) {
        if (!(wb2 instanceof b.t.c.b.b.q.ib)) {
            return null;
        }
        if (!c.\u00d200000(wb2)) {
            return null;
        }
        return g.o00000(b.t.c.b.b.o.f.b.\u00d600000(wb2));
    }

    private static final b o00000(b.t.c.b.b.d.e e2) {
        if (!e2.\u00d800000() || e2.int()) {
            return null;
        }
        return e.\u00d400000.super().\u00d200000(e2.super().\u00d300000(), e2.class().\u00d400000());
    }

    public static final int if(rc rc2) {
        l l2 = rc2.\u00d4\u00f80000().\u00d400000(d$_b.whilenew);
        if (l2 == null) {
            return 0;
        }
        return ((Number)((p)((j)y.\u00d400000(l2.super(), d.\u00d3\u00d20000))).o00000()).intValue();
    }

    public static final rc \u00d800000(rc object) {
        int n2 = g.\u00d400000((rc)object);
        if (m.new && n2 == 0) {
            object = "Not a function type: ".concat(String.valueOf(object));
            throw new AssertionError(object);
        }
        if (!g.new((rc)object)) {
            return null;
        }
        n2 = g.if((rc)object);
        return ((hc)((rc)object).\u00d4\u00d6\u00d2000().get(n2)).\u00d300000();
    }

    public static final List \u00d500000(rc object) {
        int n2 = g.\u00d400000((rc)object);
        if (m.new && n2 == 0) {
            object = "Not a function type: ".concat(String.valueOf(object));
            throw new AssertionError(object);
        }
        n2 = g.if((rc)object);
        if (n2 == 0) {
            return mc.\u00d500000();
        }
        Object object2 = object = (Iterable)((rc)object).\u00d4\u00d6\u00d2000().subList(0, n2);
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (hc)object3;
            Object object4 = object;
            object4.add(object3.\u00d300000());
        }
        return (List)object;
    }

    public static final rc \u00f800000(rc object) {
        boolean bl = g.\u00d400000((rc)object);
        if (m.new && !bl) {
            object = "Not a function type: ".concat(String.valueOf(object));
            throw new AssertionError(object);
        }
        return ((hc)mc.thissuper(((rc)object).\u00d4\u00d6\u00d2000())).\u00d300000();
    }

    public static final List return(rc object) {
        boolean bl;
        boolean bl2 = g.\u00d400000((rc)object);
        if (m.new && !bl2) {
            String string = "Not a function type: ".concat(String.valueOf(object));
            throw new AssertionError((Object)string);
        }
        List list = ((rc)object).\u00d4\u00d6\u00d2000();
        int n2 = g.if((rc)object) + (g.\u00d300000((rc)object) ? 1 : 0);
        int n3 = list.size() - 1;
        boolean bl3 = bl = n2 <= n3;
        if (m.new && !bl) {
            object = "Not an exact function type: ".concat(String.valueOf(object));
            throw new AssertionError(object);
        }
        return list.subList(n2, n3);
    }

    public static final f OO0000(rc object) {
        l l2 = ((rc)object).\u00d4\u00f80000().\u00d400000(d$_b.thisObject);
        if (l2 == null) {
            return null;
        }
        object = mc.\u00d3o0000(l2.super().values());
        object = object instanceof z ? (z)object : null;
        if (object == null || (object = (String)((j)object).o00000()) == null || (object = f.super((String)object) ? object : null) == null) {
            return null;
        }
        return f.\u00d300000((String)object);
    }

    public static final List o00000(rc object, List object2, List object3, List list, rc rc2, c c2) {
        Object object4;
        ArrayList<hc> arrayList = new ArrayList<hc>(object3.size() + object2.size() + (object != null ? 1 : 0) + 1);
        object2 = (Iterable)object2;
        Object object5 = arrayList;
        Object object6 = object2;
        Collection collection = new ArrayList(mc.o00000((Iterable)object2, 10));
        object6 = object6.iterator();
        while (object6.hasNext()) {
            object4 = object6.next();
            object4 = (rc)object4;
            object2 = collection;
            object2.add((hc)b.t.c.b.b.h.b.b.class(object4));
        }
        ((ArrayList)object5).addAll((List)collection);
        rc rc3 = object;
        b.t.c.b.b.m.e.o00000(arrayList, rc3 != null ? b.t.c.b.b.h.b.b.class(rc3) : null);
        object2 = (Iterable)object3;
        object = arrayList;
        int n2 = 0;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object7;
            Object object8;
            int n3;
            object6 = object2.next();
            if ((n3 = n2++) < 0) {
                mc.\u00d800000();
            }
            object4 = (rc)object6;
            int n4 = n3;
            object5 = object;
            Object object9 = list;
            if (object9 != null && (object9 = (f)object9.get(n4)) != null) {
                Object object10 = object9;
                object8 = !((f)object9).super() ? object10 : null;
            } else {
                object8 = object3 = null;
            }
            if (object8 != null) {
                object3 = new b.t.c.b.b.q.e.m(c2, d$_b.thisObject, y.o00000(yc.o00000(d.\u00f4o0000, new z(((f)object3).\u00d400000()))), false, 8, null);
                object7 = b.t.c.b.b.h.b.b.super((rc)object4, o.\u00d8o\u00f6000.o00000(mc.return((Iterable)((rc)object4).\u00d4\u00f80000(), object3)));
            } else {
                object7 = object4;
            }
            object5.add(b.t.c.b.b.h.b.b.class(object7));
        }
        arrayList.add(b.t.c.b.b.h.b.b.class(rc2));
        return arrayList;
    }

    public static final ib o00000(c c2, o o2, rc rc2, List list, List list2, List list3, rc rc3, boolean bl) {
        list3 = g.o00000(rc2, list, list2, list3, rc3, c2);
        int n2 = list2.size() + list.size() + (rc2 == null ? 0 : 1);
        b.t.c.b.b.q.ib ib2 = g.o00000(c2, n2, bl);
        if (rc2 != null) {
            o2 = g.o00000(o2, c2);
        }
        if (!((Collection)list).isEmpty()) {
            o2 = g.o00000(o2, c2, list.size());
        }
        return oc.o00000(b.t.c.b.b.h.d.super(o2), ib2, list3);
    }

    public static /* synthetic */ ib o00000(c c2, o o2, rc rc2, List list, List list2, List list3, rc rc3, boolean bl, int n2, Object object) {
        if ((n2 & 0x80) != 0) {
            bl = false;
        }
        return g.o00000(c2, o2, rc2, list, list2, list3, rc3, bl);
    }

    public static final o o00000(o o2, c c2) {
        if (o2.\u00d300000(d$_b.O\u00d80000)) {
            return o2;
        }
        return o.\u00d8o\u00f6000.o00000(mc.return((Iterable)o2, new b.t.c.b.b.q.e.m(c2, d$_b.O\u00d80000, y.Object(), false, 8, null)));
    }

    public static final o o00000(o o2, c c2, int n2) {
        if (o2.\u00d300000(d$_b.whilenew)) {
            return o2;
        }
        return o.\u00d8o\u00f6000.o00000(mc.return((Iterable)o2, new b.t.c.b.b.q.e.m(c2, d$_b.whilenew, y.o00000(yc.o00000(d.\u00d3\u00d20000, new p(n2))), false, 8, null)));
    }

    public static final b.t.c.b.b.q.ib o00000(c c2, int n2, boolean bl) {
        if (bl) {
            return c2.\u00d300000(n2);
        }
        return c2.o00000(n2);
    }
}

