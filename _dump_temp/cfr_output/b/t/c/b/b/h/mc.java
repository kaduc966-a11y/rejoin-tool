/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.dc;
import b.e.bb;
import b.o.d.w;
import b.qb;
import b.r;
import b.s.ub;
import b.s.y;
import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.d.e;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.e.x;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.lb;
import b.t.c.b.b.h.lb$_b;
import b.t.c.b.b.h.m;
import b.t.c.b.b.h.mc$_b$0;
import b.t.c.b.b.h.mc$_b$1;
import b.t.c.b.b.h.mc$_c;
import b.t.c.b.b.h.mc$_d;
import b.t.c.b.b.h.n;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.rb;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.i.h;
import b.t.c.b.b.i.j;
import b.t.c.b.b.q.e.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class mc {
    public static final mc$_d \u00d600000 = new mc$_d(null);
    private final n \u00d300000;
    private final rb super;
    private final h class;
    private final dc \u00d400000;
    private final j \u00d200000;

    public mc(n object, rb rb2) {
        this.\u00d300000 = object;
        this.super = rb2;
        this.class = new h("Type parameter upper bound erasure results");
        object = this;
        this.\u00d400000 = r.o00000(new mc$_b$0((mc)object));
        object = this;
        this.\u00d200000 = this.class.o00000(new mc$_b$1((mc)object));
    }

    public /* synthetic */ mc(n n2, rb rb2, int n3, w w2) {
        if ((n3 & 2) != 0) {
            rb2 = new rb(false, false);
        }
        this(n2, rb2);
    }

    private final e o00000() {
        return (e)this.\u00d400000.\u00d200000();
    }

    public final rc o00000(b.t.c.b.b.q.i i2, m m2) {
        return (rc)this.\u00d200000.\u00f800000(new mc$_c(i2, m2));
    }

    private final rc o00000(m m2) {
        rc rc2 = m2.o00000();
        if (rc2 == null || (rc2 = b.\u00d600000(rc2)) == null) {
            rc2 = this.o00000();
        }
        return rc2;
    }

    private final rc \u00d200000(b.t.c.b.b.q.i object, m object2) {
        i i2;
        Map map;
        Object object3 = ((m)object2).\u00d200000();
        if (object3 != null && object3.contains(object.forObjectsuper())) {
            return this.o00000((m)object2);
        }
        Object object4 = b.super((rc)object.nullint(), (Set)object3);
        int n2 = bb.\u00d200000(y.\u00d200000(b.s.mc.o00000((Iterable)object4, 10)), 16);
        Object object5 = new LinkedHashMap(n2);
        object4 = object4.iterator();
        while (object4.hasNext()) {
            hc hc2;
            Object object6 = object4.next();
            map = object5;
            i2 = (b.t.c.b.b.q.i)object6;
            if (object3 == null || !object3.contains(i2)) {
                mc mc2 = this;
                hc2 = this.\u00d300000.o00000((b.t.c.b.b.q.i)i2, (m)object2, mc2, mc2.o00000((b.t.c.b.b.q.i)i2, ((m)object2).o00000((b.t.c.b.b.q.i)object)));
            } else {
                hc2 = o.o00000((b.t.c.b.b.q.i)i2, (m)object2);
            }
            object6 = hc2;
            object6 = yc.o00000(i2.\u00d3OO000(), object6);
            map.put(((qb)object6).new(), ((qb)object6).o00000());
        }
        object3 = object5;
        object4 = kc.o00000(lb$_b.o00000(lb.\u00d200000, (Map)object3, false, 2, null));
        object = this.o00000((kc)object4, object.\u00d8\u00d5o000(), (m)object2);
        if (!((Collection)object).isEmpty()) {
            Object object7;
            if (!this.super.o00000()) {
                if (!(object.size() == 1)) {
                    object4 = "Should only be one computed upper bound if no need to intersect all bounds";
                    throw new IllegalArgumentException(object4.toString());
                }
                return (rc)b.s.mc.thisObject((Iterable)object);
            }
            object5 = object7 = (Iterable)b.s.mc.\u00f5O0000((Iterable)object);
            object = new ArrayList(b.s.mc.o00000((Iterable)object7, 10));
            object7 = object5.iterator();
            while (object7.hasNext()) {
                map = object7.next();
                i2 = (rc)((Object)map);
                object2 = object;
                object2.add(((rc)i2).\u00d8\u00d6\u00d2000());
            }
            return x.o00000((List)object);
        }
        return this.o00000((m)object2);
    }

    private final Set o00000(kc kc2, List object, m m2) {
        Set set;
        Set set2 = set = ub.super();
        object = object.iterator();
        while (object.hasNext()) {
            rc rc2 = (rc)object.next();
            kb kb2 = rc2.thisdosuper().\u00f4OO000();
            if (kb2 instanceof ib) {
                set2.add(\u00d600000.o00000(rc2, kc2, m2.\u00d200000(), this.super.new()));
            } else if (kb2 instanceof b.t.c.b.b.q.i) {
                Set set3 = m2.\u00d200000();
                boolean bl = set3 != null ? set3.contains(kb2) : false;
                if (bl) {
                    set2.add(this.o00000(m2));
                } else {
                    set2.addAll(this.o00000(kc2, ((b.t.c.b.b.q.i)kb2).\u00d8\u00d5o000(), m2));
                }
            }
            if (this.super.o00000()) continue;
        }
        return ub.super(set);
    }

    private static final e \u00d200000(mc mc2) {
        String[] stringArray = new String[1];
        String[] stringArray2 = stringArray;
        stringArray[0] = mc2.toString();
        return k.new(c.\u00f8O0000, stringArray2);
    }

    private static final rc \u00d200000(mc mc2, mc$_c mc$_c) {
        return mc2.\u00d200000(mc$_c.\u00d200000(), mc$_c.o00000());
    }

    static /* synthetic */ e o00000(mc mc2) {
        return mc.\u00d200000(mc2);
    }

    static /* synthetic */ rc o00000(mc mc2, mc$_c mc$_c) {
        return mc.\u00d200000(mc2, mc$_c);
    }
}

