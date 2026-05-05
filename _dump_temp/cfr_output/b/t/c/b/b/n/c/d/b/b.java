/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.b;

import b.o.d.fc;
import b.o.d.w;
import b.qb;
import b.t.c.b.b.d.d;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.m;
import b.t.c.b.b.h.mc;
import b.t.c.b.b.h.n;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.q;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.t;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.n.c.d.b.b$_b$0;
import b.t.c.b.b.n.c.d.b.b$_c;
import b.t.c.b.b.n.c.d.b.e;
import b.t.c.b.b.n.c.d.b.f;
import b.t.c.b.b.n.c.d.b.g;
import b.t.c.b.b.n.c.d.b.h;
import b.t.c.b.b.n.c.d.b.i;
import b.t.c.b.b.q.kb;
import b.yc;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b
extends b.t.c.b.b.h.h {
    public static final b$_c \u00d200000 = new b$_c(null);
    private final g OO0000;
    private final mc \u00d2O0000;
    private static final i float = f.o00000(t.\u00d200000, false, true, null, 5, null).o00000(e.String);
    private static final i oO0000 = f.o00000(t.\u00d200000, false, true, null, 5, null).o00000(e.\u00d500000);

    public b(mc mc2) {
        this.OO0000 = new g();
        mc mc3 = mc2;
        if (mc3 == null) {
            mc3 = new mc(this.OO0000, null, 2, null);
        }
        this.\u00d2O0000 = mc3;
    }

    public /* synthetic */ b(mc mc2, int n2, w w2) {
        if ((n2 & 1) != 0) {
            mc2 = null;
        }
        this(mc2);
    }

    public final lc \u00d300000(rc rc2) {
        return new lc(b.o00000(this, rc2, null, 2, null));
    }

    private final rc o00000(rc object, i object2) {
        Object object3;
        while ((object3 = ((rc)object).thisdosuper().\u00f4OO000()) instanceof b.t.c.b.b.q.i) {
            object = this.\u00d2O0000.o00000((b.t.c.b.b.q.i)object3, ((i)object2).o00000(true));
        }
        if (object3 instanceof b.t.c.b.b.q.ib) {
            object2 = q.o00000((rc)object).thisdosuper().\u00f4OO000();
            if (!(object2 instanceof b.t.c.b.b.q.ib)) {
                String string = "For some reason declaration for upper bound is not a class but \"" + object2 + "\" while for lower it's \"" + object3 + '\"';
                throw new IllegalStateException(string.toString());
            }
            object3 = this.o00000(q.\u00d300000((rc)object), (b.t.c.b.b.q.ib)object3, float);
            ib ib2 = (ib)((qb)object3).\u00d400000();
            boolean bl = (Boolean)((qb)object3).\u00d300000();
            object = this.o00000(q.o00000((rc)object), (b.t.c.b.b.q.ib)object2, oO0000);
            object2 = (ib)((qb)object).\u00d400000();
            boolean bl2 = (Boolean)((qb)object).\u00d300000();
            return bl || bl2 ? (l)new h(ib2, (ib)object2) : oc.o00000(ib2, (ib)object2);
        }
        throw new IllegalStateException("Unexpected declaration kind: ".concat(String.valueOf(object3)).toString());
    }

    static /* synthetic */ rc o00000(b b2, rc rc2, i i2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            i2 = new i(t.\u00d200000, null, false, false, null, null, 62, null);
        }
        return b2.o00000(rc2, i2);
    }

    private final qb o00000(ib object, b.t.c.b.b.q.ib i2, i object2) {
        Iterable<hc> iterable;
        if (((rc)object).thisdosuper().\u00f5OO000().isEmpty()) {
            return yc.o00000(object, Boolean.FALSE);
        }
        if (b.t.c.b.b.b.c.\u00d800000((rc)object)) {
            hc hc2 = (hc)((rc)object).\u00d4\u00d6\u00d2000().get(0);
            List list = b.s.mc.o00000(new lc(hc2.\u00d200000(), this.o00000(hc2.\u00d300000(), (i)object2)));
            return yc.o00000(oc.o00000(((rc)object).\u00d5\u00d6\u00d2000(), ((rc)object).thisdosuper(), list, ((rc)object).\u00f5\u00d6\u00d2000(), null, 16, null), Boolean.FALSE);
        }
        if (hb.super((rc)object)) {
            String[] stringArray = new String[1];
            String[] stringArray2 = stringArray;
            stringArray[0] = ((rc)object).thisdosuper().toString();
            return yc.o00000(k.new(c.\u00f5\u00d40000, stringArray2), Boolean.FALSE);
        }
        Object object3 = i2.o00000(this);
        Iterable iterable2 = i2.\u00d3OO000().\u00f5OO000();
        bc bc2 = i2.\u00d3OO000();
        zb zb2 = ((rc)object).\u00d5\u00d6\u00d2000();
        Object object4 = iterable2;
        iterable2 = new ArrayList(b.s.mc.o00000(iterable2, 10));
        object4 = object4.iterator();
        while (object4.hasNext()) {
            Object object5 = object4.next();
            object5 = (b.t.c.b.b.q.i)object5;
            iterable = iterable2;
            iterable.add(n.o00000(this.OO0000, object5, (m)object2, this.\u00d2O0000, null, 8, null));
        }
        iterable = (List)iterable2;
        boolean bl = ((rc)object).\u00f5\u00d6\u00d2000();
        b.t.c.b.b.o.e.f f2 = object3;
        b.t.c.b.b.q.ib ib2 = i2;
        ib ib3 = object;
        object = object2;
        i2 = ib3;
        object2 = this;
        object3 = ib2;
        return yc.o00000(oc.o00000(zb2, bc2, (List)iterable, bl, f2, new b$_b$0((b.t.c.b.b.q.ib)object3, (b)object2, (ib)i2, (i)object)), Boolean.TRUE);
    }

    @Override
    public final boolean o00000() {
        return false;
    }

    private static final ib o00000(b.t.c.b.b.q.ib ib2, b b2, ib ib3, i i2, b.t.c.b.b.h.e.b object) {
        d d2 = b.t.c.b.b.o.f.b.o00000((kb)ib2);
        if (d2 == null) {
            return null;
        }
        d d3 = d2;
        b.t.c.b.b.q.ib ib4 = ((b.t.c.b.b.h.e.b)object).o00000(d3);
        if (ib4 == null) {
            return null;
        }
        object = ib4;
        if (fc.o00000((Object)ib4, (Object)ib2)) {
            return null;
        }
        return (ib)b2.o00000(ib3, (b.t.c.b.b.q.ib)object, i2).new();
    }

    public b() {
        this(null, 1, null);
    }

    static /* synthetic */ ib new(b.t.c.b.b.q.ib ib2, b b2, ib ib3, i i2, b.t.c.b.b.h.e.b b3) {
        return b.o00000(ib2, b2, ib3, i2, b3);
    }
}

