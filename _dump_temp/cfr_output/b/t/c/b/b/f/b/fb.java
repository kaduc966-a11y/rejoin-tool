/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.s.ub;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.f.b.ab;
import b.t.c.b.b.f.b.b.h;
import b.t.c.b.b.f.b.fb$_b$0;
import b.t.c.b.b.f.b.fb$_c;
import b.t.c.b.b.f.b.fb$_d;
import b.t.c.b.b.f.b.g;
import b.t.c.b.b.f.b.q;
import b.t.c.b.b.f.b.t;
import b.t.c.b.b.l.b$_d;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.j;
import b.t.c.b.b.q.f.e;
import b.t.c.b.b.q.fc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.lc;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class fb {
    public static final fb$_d \u00d400000 = new fb$_d(null);
    private final t \u00d300000;
    private final b.o.e.g new;
    private static final Set o00000 = ub.super((Object)b.t.c.b.b.d.d.String.o00000(d$_b.nullObject.super()));

    public fb(t object) {
        this.\u00d300000 = object;
        object = this;
        this.new = this.\u00d300000.\u00d500000().\u00d200000(new fb$_b$0((fb)object));
    }

    public final ib o00000(b.t.c.b.b.d.d d2, g g2) {
        return (ib)this.new.\u00f800000(new fb$_c(d2, g2));
    }

    public static /* synthetic */ ib o00000(fb fb2, b.t.c.b.b.d.d d2, g g2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            g2 = null;
        }
        return fb2.o00000(d2, g2);
    }

    private final ib o00000(fb$_c object) {
        q q2;
        Object object2;
        Object object3 = ((fb$_c)object).\u00d200000();
        Object object4 = this.\u00d300000.private().iterator();
        while (object4.hasNext()) {
            object2 = ((e)object4.next()).o00000((b.t.c.b.b.d.d)object3);
            if (object2 == null) continue;
            return object2;
        }
        if (o00000.contains(object3)) {
            return null;
        }
        g g2 = ((fb$_c)object).super();
        if (g2 == null && (g2 = this.\u00d300000.\u00d600000().o00000((b.t.c.b.b.d.d)object3)) == null) {
            return null;
        }
        object4 = g2;
        b.t.c.b.b.l.d.e e2 = g2.o00000();
        object2 = ((g)object4).\u00d200000();
        object = ((g)object4).String();
        object4 = ((g)object4).\u00d300000();
        Object object5 = ((b.t.c.b.b.d.d)object3).\u00d500000();
        if (object5 != null) {
            h h2 = (object5 = fb.o00000(this, (b.t.c.b.b.d.d)object5, null, 2, null)) instanceof h ? (h)object5 : null;
            if (h2 == null) {
                return null;
            }
            object5 = h2;
            if (!h2.if(((b.t.c.b.b.d.d)object3).o00000())) {
                return null;
            }
            q2 = ((h)object5).\u00d8\u00d3\u00d2000();
        } else {
            Object v3;
            block9: {
                for (Object t2 : (Iterable)fc.o00000(this.\u00d300000.for(), ((b.t.c.b.b.d.d)object3).\u00d800000())) {
                    lc lc2 = (lc)t2;
                    if (!(!(lc2 instanceof ab) || ((ab)lc2).\u00f800000(((b.t.c.b.b.d.d)object3).o00000()))) continue;
                    v3 = t2;
                    break block9;
                }
                v3 = null;
            }
            lc lc3 = v3;
            if (lc3 == null) {
                return null;
            }
            object3 = lc3;
            q2 = this.\u00d300000.o00000((lc)object3, e2, new d(((b$_d)object2).Objectintsuper()), b.t.c.b.b.l.d.h.\u00d300000.o00000(((b$_d)object2).interfaceifsuper()), (j)object, null);
        }
        object3 = q2;
        return new h((q)object3, (b$_d)object2, e2, (j)object, (b.t.c.b.b.q.g)object4);
    }

    private static final ib o00000(fb fb2, fb$_c fb$_c) {
        return fb2.o00000(fb$_c);
    }

    public static final /* synthetic */ Set o00000() {
        return o00000;
    }

    static /* synthetic */ ib \u00d200000(fb fb2, fb$_c fb$_c) {
        return fb.o00000(fb2, fb$_c);
    }
}

