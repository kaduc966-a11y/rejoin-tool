/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.f;

import b.o.d.fc;
import b.qb;
import b.s.y;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.ab;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.n.c.b.s;
import b.t.c.b.b.n.c.d.i;
import b.t.c.b.b.n.c.f.d;
import b.t.c.b.b.n.c.f.f;
import b.t.c.b.b.n.c.f.g;
import b.t.c.b.b.n.c.f.j;
import b.t.c.b.b.q.e.l;
import b.yc;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    public static final b class = new b();
    private static final b.t.c.b.b.d.f \u00d200000 = b.t.c.b.b.d.f.\u00d300000("message");
    private static final b.t.c.b.b.d.f super = b.t.c.b.b.d.f.\u00d300000("allowedTargets");
    private static final b.t.c.b.b.d.f \u00d400000 = b.t.c.b.b.d.f.\u00d300000("value");
    private static final Map \u00d300000;

    private b() {
    }

    public final b.t.c.b.b.d.f \u00d300000() {
        return \u00d200000;
    }

    public final b.t.c.b.b.d.f super() {
        return super;
    }

    public final b.t.c.b.b.d.f \u00d200000() {
        return \u00d400000;
    }

    public final l super(q q2, i i2, boolean bl) {
        b.t.c.b.b.d.d d2 = q2.\u00d4\u00d40000();
        if (fc.o00000((Object)d2, (Object)b.t.c.b.b.d.d.String.o00000(ab.\u00f5O0000))) {
            return new d(q2, i2);
        }
        if (fc.o00000((Object)d2, (Object)b.t.c.b.b.d.d.String.o00000(ab.\u00d5O0000))) {
            return new f(q2, i2);
        }
        if (fc.o00000((Object)d2, (Object)b.t.c.b.b.d.d.String.o00000(ab.oo0000))) {
            return new g(i2, q2, d$_b.\u00f4\u00d30000);
        }
        if (fc.o00000((Object)d2, (Object)b.t.c.b.b.d.d.String.o00000(ab.\u00f6O0000))) {
            return null;
        }
        return new b.t.c.b.b.n.c.d.c.b(i2, q2, bl);
    }

    public static /* synthetic */ l super(b b2, q q2, i i2, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return b2.super(q2, i2, bl);
    }

    public final l super(k object, s s2, i i2) {
        q q2;
        if (fc.o00000(object, (Object)d$_b.\u00f8O0000) && ((q2 = s2.o00000(ab.\u00f6O0000)) != null || s2.new())) {
            return new j(q2, i2);
        }
        k k2 = (k)\u00d300000.get(object);
        if (k2 != null) {
            object = k2;
            q q3 = s2.o00000((k)object);
            if (q3 != null) {
                object = q3;
                return b.super(b.class, (q)object, i2, false, 4, null);
            }
            return null;
        }
        return null;
    }

    static {
        qb[] qbArray = new qb[3];
        qb[] qbArray2 = qbArray;
        qbArray[0] = yc.o00000(d$_b.\u00d5\u00d40000, ab.\u00f5O0000);
        qbArray2[1] = yc.o00000(d$_b.o00000, ab.\u00d5O0000);
        qbArray2[2] = yc.o00000(d$_b.\u00f4\u00d30000, ab.oo0000);
        \u00d300000 = y.\u00d600000(qbArray2);
    }
}

