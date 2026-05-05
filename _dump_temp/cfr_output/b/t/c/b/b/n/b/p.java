/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.fc;
import b.qb;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.f.b.b.b;
import b.t.c.b.b.f.b.b.d;
import b.t.c.b.b.f.b.b.i;
import b.t.c.b.b.f.b.g;
import b.t.c.b.b.f.b.s;
import b.t.c.b.b.f.b.t;
import b.t.c.b.b.l.b$_d;
import b.t.c.b.b.l.b$_i;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.n.b.b.c;
import b.t.c.b.b.n.b.b.c$_b;
import b.t.c.b.b.n.b.db;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.b.p$_b$0;
import b.t.c.b.b.n.b.p$_c;
import b.t.c.b.b.n.b.q;
import b.t.c.b.b.n.b.r;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.lc;
import java.util.Collection;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class p {
    public static final p$_c void = new p$_c(null);
    public t \u00d500000;
    private static final Set \u00d400000 = ub.super((Object)c$_b.\u00f600000);
    private static final Set Object;
    private static final b.t.c.b.b.l.d.c \u00d600000;
    private static final b.t.c.b.b.l.d.c \u00d200000;
    private static final b.t.c.b.b.l.d.c o00000;

    public final t \u00d400000() {
        t t2 = this.\u00d500000;
        if (t2 != null) {
            return t2;
        }
        fc.return("");
        return null;
    }

    public final void o00000(t t2) {
        this.\u00d500000 = t2;
    }

    private final b.t.c.b.b.l.d.c Object() {
        return this.\u00d400000().\u00d300000().\u00d500000();
    }

    public final void o00000(q q2) {
        this.o00000(q2.o00000());
    }

    private final boolean \u00d600000() {
        return this.\u00d400000().\u00d300000().\u00d200000();
    }

    public final ib \u00d200000(j j2) {
        g g2 = this.\u00d400000(j2);
        if (g2 == null) {
            return null;
        }
        g g3 = g2;
        return this.\u00d400000().\u00d2O0000().o00000(j2.Object(), g3);
    }

    public final g \u00d400000(j j2) {
        String[] stringArray = this.o00000(j2, \u00d400000);
        if (stringArray == null) {
            return null;
        }
        Object object = stringArray;
        String[] stringArray2 = j2.\u00d200000().null();
        if (stringArray2 == null) {
            return null;
        }
        Object object2 = stringArray2;
        Object object3 = this;
        Object object4 = j2;
        try {
            try {
                object = b.t.c.b.b.l.c.b.e.\u00d300000((String[])object, object2);
            }
            catch (b.t.c.b.b.p.g g2) {
                throw new IllegalStateException("Could not read data from " + object4.o00000(), g2);
            }
        }
        catch (Throwable throwable) {
            if (((p)object3).\u00d600000() || object4.\u00d200000().o00000().\u00d200000(((p)object3).Object())) {
                throw throwable;
            }
            object = null;
        }
        Object object5 = object;
        if (object5 == null) {
            return null;
        }
        object = object5;
        object2 = (b.t.c.b.b.l.c.b.j)((qb)object5).\u00d400000();
        object3 = (b$_d)((qb)object).\u00d300000();
        object4 = new db(j2, this.\u00d500000(j2), new b.t.c.b.b.f.b.b.p(this.\u00d600000(j2), null, 2, null), this.Object(j2));
        return new g((e)object2, (b$_d)object3, j2.\u00d200000().o00000(), (b.t.c.b.b.q.g)object4);
    }

    public final f o00000(lc lc2, j j2) {
        String[] stringArray = this.o00000(j2, Object);
        if (stringArray == null) {
            return null;
        }
        Object object = stringArray;
        String[] stringArray2 = j2.\u00d200000().null();
        if (stringArray2 == null) {
            return null;
        }
        Object object2 = stringArray2;
        Object object3 = this;
        Object object4 = j2;
        try {
            try {
                object = b.t.c.b.b.l.c.b.e.super((String[])object, object2);
            }
            catch (b.t.c.b.b.p.g g2) {
                throw new IllegalStateException("Could not read data from " + object4.o00000(), g2);
            }
        }
        catch (Throwable throwable) {
            if (((p)object3).\u00d600000() || object4.\u00d200000().o00000().\u00d200000(((p)object3).Object())) {
                throw throwable;
            }
            object = null;
        }
        Object object5 = object;
        if (object5 == null) {
            return null;
        }
        object = object5;
        object2 = (b.t.c.b.b.l.c.b.j)((qb)object5).\u00d400000();
        object3 = (b$_i)((qb)object).\u00d300000();
        object4 = new r(j2, (b$_i)object3, (e)object2, this.\u00d500000(j2), this.\u00d600000(j2), this.Object(j2));
        return new d(lc2, (b$_i)object3, (e)object2, j2.\u00d200000().o00000(), (i)object4, this.\u00d400000(), "scope for " + object4 + " in " + lc2, p$_b$0.o\u00f6O000);
    }

    private final s \u00d500000(j j2) {
        if (this.\u00d600000() || j2.\u00d200000().o00000().\u00d200000(this.Object())) {
            return null;
        }
        return new s(j2.\u00d200000().o00000(), b.t.c.b.b.l.d.c.\u00f800000, this.Object(), this.Object().o00000(j2.\u00d200000().o00000().\u00d800000()), j2.o00000());
    }

    private final boolean \u00d600000(j j2) {
        return this.\u00d400000().\u00d300000().\u00d800000() && (j2.\u00d200000().\u00d200000() || fc.o00000((Object)j2.\u00d200000().o00000(), (Object)\u00d600000)) || this.o00000(j2);
    }

    private final boolean o00000(j j2) {
        return !this.\u00d400000().\u00d300000().o00000() && j2.\u00d200000().\u00d200000() && fc.o00000((Object)j2.\u00d200000().o00000(), (Object)\u00d200000);
    }

    private final b Object(j j2) {
        if (!this.\u00d400000().\u00d300000().String() && j2.\u00d200000().\u00d800000()) {
            return b.\u00d300000;
        }
        return b.o00000;
    }

    private final String[] o00000(j object, Set set) {
        String[] stringArray = ((c)(object = object.\u00d200000())).String();
        if (stringArray == null) {
            stringArray = ((c)object).\u00d500000();
        }
        if (stringArray != null) {
            String[] stringArray2 = stringArray;
            if (set.contains((Object)((c)object).\u00d600000())) {
                return stringArray2;
            }
            return null;
        }
        return null;
    }

    private static final Collection \u00d500000() {
        return mc.\u00d500000();
    }

    public static final /* synthetic */ b.t.c.b.b.l.d.c \u00d200000() {
        return o00000;
    }

    static {
        c$_b[] c$_bArray = new c$_b[2];
        Object[] objectArray = c$_bArray;
        c$_bArray[0] = c$_b.\u00d600000;
        objectArray[1] = c$_b.\u00d200000;
        Object = ub.\u00d300000(objectArray);
        int[] nArray = new int[3];
        objectArray = nArray;
        nArray[0] = 1;
        objectArray[1] = (c$_b)true;
        objectArray[2] = (c$_b)2;
        \u00d600000 = new b.t.c.b.b.l.d.c((int[])objectArray);
        int[] nArray2 = new int[3];
        objectArray = nArray2;
        nArray2[0] = 1;
        objectArray[1] = (c$_b)true;
        objectArray[2] = (c$_b)11;
        \u00d200000 = new b.t.c.b.b.l.d.c((int[])objectArray);
        int[] nArray3 = new int[3];
        objectArray = nArray3;
        nArray3[0] = 1;
        objectArray[1] = (c$_b)true;
        objectArray[2] = (c$_b)13;
        o00000 = new b.t.c.b.b.l.d.c((int[])objectArray);
    }

    static /* synthetic */ Collection o00000() {
        return p.\u00d500000();
    }
}

