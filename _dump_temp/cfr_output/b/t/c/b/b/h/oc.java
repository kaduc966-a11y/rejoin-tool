/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.fc;
import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.d.d;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.fb$_b;
import b.t.c.b.b.h.i;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.k;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.lb;
import b.t.c.b.b.h.oc$_b$0;
import b.t.c.b.b.h.oc$_b$1;
import b.t.c.b.b.h.oc$_c$1;
import b.t.c.b.b.h.oc$_d;
import b.t.c.b.b.h.pc;
import b.t.c.b.b.h.u;
import b.t.c.b.b.h.v;
import b.t.c.b.b.h.xc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.c.r;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.q.b.bb;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.wb;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class oc {
    public static final oc new = new oc();
    private static final g o00000 = oc$_c$1.\u00d5o\u00d4000;

    private oc() {
    }

    private final f o00000(bc bc2, List list, b stringArray) {
        kb kb2;
        kb kb3 = kb2 = bc2.\u00f4OO000();
        if (kb2 instanceof b.t.c.b.b.q.i) {
            return ((b.t.c.b.b.q.i)kb2).nullint().\u00f4\u00d6\u00d2000();
        }
        if (kb3 instanceof b.t.c.b.b.q.ib) {
            String[] stringArray2 = stringArray;
            if (stringArray == null) {
                stringArray2 = stringArray = b.t.c.b.b.o.f.b.\u00d200000(b.t.c.b.b.o.f.b.\u00d500000(kb2));
            }
            if (list.isEmpty()) {
                return bb.o00000((b.t.c.b.b.q.ib)kb2, (b)stringArray);
            }
            return bb.o00000((b.t.c.b.b.q.ib)kb2, lb.\u00d200000.o00000(bc2, list), (b)stringArray);
        }
        if (kb3 instanceof h) {
            String[] stringArray3 = new String[1];
            stringArray = stringArray3;
            stringArray3[0] = ((h)kb2).\u00d5\u00f80000().toString();
            return b.t.c.b.b.h.d.k.o00000(d.\u00d800000, true, stringArray);
        }
        if (bc2 instanceof pc) {
            return ((pc)bc2).o\u00d2O000();
        }
        throw new IllegalStateException("Unsupported classifier: " + kb2 + " for constructor: " + bc2);
    }

    public static final ib o00000(zb zb2, bc object, List list, boolean bl, b b2) {
        if (zb2.ifStringnew() && list.isEmpty() && !bl && object.\u00f4OO000() != null) {
            return object.\u00f4OO000().nullint();
        }
        bc bc2 = object;
        List list2 = list;
        f f2 = new.o00000((bc)object, list, b2);
        bc bc3 = object;
        boolean bl2 = bl;
        object = zb2;
        bc bc4 = bc3;
        return oc.o00000(zb2, bc2, list2, bl, f2, new oc$_b$0(bc4, list, (zb)object, bl2));
    }

    public static /* synthetic */ ib o00000(zb zb2, bc bc2, List list, boolean bl, b b2, int n2, Object object) {
        if ((n2 & 0x10) != 0) {
            b2 = null;
        }
        return oc.o00000(zb2, bc2, list, bl, b2);
    }

    public static final ib o00000(h h2, List list) {
        return new k(fb$_b.o00000, false).super(i.class.o00000(null, h2, list), zb.ifreturnclass.Object());
    }

    private final oc$_d o00000(bc object, b b2, List list) {
        kb kb2 = object.\u00f4OO000();
        if (kb2 == null || (kb2 = b2.o00000((wb)(object = kb2))) == null) {
            return null;
        }
        object = kb2;
        if (kb2 instanceof h) {
            return new oc$_d(oc.o00000((h)object, list), null);
        }
        object = object.\u00d3OO000().o00000(b2);
        return new oc$_d(null, (bc)object);
    }

    public static final ib o00000(zb zb2, bc object, List list, boolean bl, f object2) {
        bc bc2 = object;
        f f2 = object2;
        bc bc3 = object;
        object = object2;
        boolean bl2 = bl;
        zb zb3 = zb2;
        object2 = list;
        bc bc4 = bc3;
        object = new v(bc2, list, bl, f2, new oc$_b$1(bc4, (List)object2, zb3, bl2, (f)object));
        if (zb2.ifStringnew()) {
            return (ib)object;
        }
        return new xc((ib)object, zb2);
    }

    public static final ib o00000(zb zb2, bc object, List list, boolean bl, f f2, g g2) {
        object = new v((bc)object, list, bl, f2, g2);
        if (zb2.ifStringnew()) {
            return (ib)object;
        }
        return new xc((ib)object, zb2);
    }

    public static final ib o00000(zb zb2, b.t.c.b.b.q.ib ib2, List list) {
        return oc.o00000(zb2, ib2.\u00d3OO000(), list, false, null, 16, null);
    }

    public static final ib o00000(ib ib2, zb zb2, bc bc2, List list, boolean bl) {
        return oc.o00000(zb2, bc2, list, bl, null, 16, null);
    }

    public static /* synthetic */ ib o00000(ib ib2, zb zb2, bc bc2, List list, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            zb2 = ib2.\u00d5\u00d6\u00d2000();
        }
        if ((n2 & 4) != 0) {
            bc2 = ib2.thisdosuper();
        }
        if ((n2 & 8) != 0) {
            list = ib2.\u00d4\u00d6\u00d2000();
        }
        if ((n2 & 0x10) != 0) {
            bl = ib2.\u00f5\u00d6\u00d2000();
        }
        return oc.o00000(ib2, zb2, bc2, list, bl);
    }

    public static final l o00000(ib ib2, ib ib3) {
        if (fc.o00000((Object)ib2, (Object)ib3)) {
            return ib2;
        }
        return new u(ib2, ib3);
    }

    public static final ib o00000(zb stringArray, r r2, boolean bl) {
        String[] stringArray2 = stringArray;
        String[] stringArray3 = new String[1];
        stringArray = stringArray3;
        stringArray3[0] = "unknown integer literal type";
        return oc.o00000((zb)stringArray2, (bc)r2, mc.\u00d500000(), bl, b.t.c.b.b.h.d.k.o00000(d.class, true, stringArray));
    }

    public static final ib o00000(zb zb2, bc bc2, List list, boolean bl) {
        return oc.o00000(zb2, bc2, list, bl, null, 16, null);
    }

    private static final ib new(bc object, List list, zb zb2, boolean bl, b b2) {
        oc$_d oc$_d = new.o00000((bc)object, b2, list);
        if (oc$_d == null) {
            return null;
        }
        object = oc$_d;
        ib ib2 = oc$_d.new();
        if (ib2 != null) {
            return ib2;
        }
        return oc.o00000(zb2, ((oc$_d)object).o00000(), list, bl, b2);
    }

    private static final ib new(bc object, List list, zb zb2, boolean bl, f f2, b b2) {
        oc$_d oc$_d = new.o00000((bc)object, b2, list);
        if (oc$_d == null) {
            return null;
        }
        object = oc$_d;
        ib ib2 = oc$_d.new();
        if (ib2 != null) {
            return ib2;
        }
        return oc.o00000(zb2, ((oc$_d)object).o00000(), list, bl, f2);
    }

    static /* synthetic */ ib o00000(bc bc2, List list, zb zb2, boolean bl, b b2) {
        return oc.new(bc2, list, zb2, bl, b2);
    }

    static /* synthetic */ ib o00000(bc bc2, List list, zb zb2, boolean bl, f f2, b b2) {
        return oc.new(bc2, list, zb2, bl, f2, b2);
    }
}

