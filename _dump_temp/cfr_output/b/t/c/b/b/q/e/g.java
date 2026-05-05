/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.e;

import b.qb;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.b.c;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.o.c.bb;
import b.t.c.b.b.o.c.k;
import b.t.c.b.b.o.c.z;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.e.g$_b$0;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.e.m;
import b.yc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class g {
    private static final f class = f.\u00d300000("message");
    private static final f \u00d400000 = f.\u00d300000("replaceWith");
    private static final f \u00d300000 = f.\u00d300000("level");
    private static final f \u00d200000 = f.\u00d300000("expression");
    private static final f super = f.\u00d300000("imports");

    public static final l o00000(c c2, String string, String object, String string2, boolean bl) {
        qb[] qbArray = new qb[2];
        qb[] qbArray2 = qbArray;
        qbArray[0] = yc.o00000(\u00d200000, new z((String)object));
        object = c2;
        qbArray2[1] = yc.o00000(super, new k(mc.\u00d500000(), new g$_b$0((c)object)));
        object = new m(c2, d$_b.\u00d5\u00d80000, y.\u00d600000(qbArray2), false, 8, null);
        qb[] qbArray3 = new qb[3];
        qbArray2 = qbArray3;
        qbArray3[0] = yc.o00000(g.class, new z(string));
        qbArray2[1] = yc.o00000(\u00d400000, new bb((l)object));
        qbArray2[2] = yc.o00000(\u00d300000, new b.t.c.b.b.o.c.f(d.String.o00000(d$_b.\u00f4O0000), f.\u00d300000(string2)));
        return new m(c2, d$_b.\u00f8O0000, y.\u00d600000(qbArray2), bl);
    }

    public static /* synthetic */ l o00000(c c2, String string, String string2, String string3, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string2 = "";
        }
        if ((n2 & 4) != 0) {
            string3 = "WARNING";
        }
        if ((n2 & 8) != 0) {
            bl = false;
        }
        return g.o00000(c2, string, string2, string3, bl);
    }

    private static final rc \u00d200000(c c2, bc bc2) {
        return bc2.returnforsuper().o00000(w.\u00d400000, c2.\u00d600000());
    }

    static /* synthetic */ rc o00000(c c2, bc bc2) {
        return g.\u00d200000(c2, bc2);
    }
}

