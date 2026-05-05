/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.w;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;
import b.t.c.b.b.f.b.v;
import b.t.c.b.b.f.b.v$_b;
import b.t.c.b.b.f.b.v$_c;
import b.t.c.b.b.l.b$_d$_b;
import b.t.c.b.b.l.d.c;
import b.t.c.b.b.n.b.db;
import b.t.c.b.b.n.b.f;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.b.r;
import b.t.c.b.b.n.b.x;
import b.t.c.b.b.o.h.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i$_f {
    private i$_f() {
    }

    public final j super(v v2, boolean bl, boolean bl2, Boolean bl3, boolean bl4, x x2, c c2) {
        Object object;
        if (bl) {
            if (bl3 == null) {
                String string = "isConst should not be null for property (container=" + v2 + ')';
                throw new IllegalStateException(string.toString());
            }
            if (v2 instanceof v$_b && ((v$_b)v2).\u00d800000() == b$_d$_b.OO0000) {
                return f.o00000(x2, ((v$_b)v2).\u00f400000().o00000(b.t.c.b.b.d.f.\u00d300000("DefaultImpls")), c2);
            }
            if (bl3.booleanValue() && v2 instanceof v$_c) {
                Object object2 = v2.\u00d200000();
                r r2 = object2 instanceof r ? (r)object2 : null;
                object2 = r2 != null ? r2.\u00f400000() : null;
                if (object2 != null) {
                    return f.o00000(x2, d.String.o00000(new k(b.q.f.super(((b)object2).\u00d200000(), '/', '.', false, 4, null))), c2);
                }
            }
        }
        if (bl2 && v2 instanceof v$_b && ((v$_b)v2).\u00d800000() == b$_d$_b.oO0000 && (object = ((v$_b)v2).int()) != null && (((v$_b)object).\u00d800000() == b$_d$_b.\u00d4O0000 || ((v$_b)object).\u00d800000() == b$_d$_b.\u00d3O0000 || bl4 && (((v$_b)object).\u00d800000() == b$_d$_b.OO0000 || ((v$_b)object).\u00d800000() == b$_d$_b.\u00d800000))) {
            db db2 = (object = ((v)object).\u00d200000()) instanceof db ? (db)object : null;
            if (db2 != null) {
                return db2.\u00f800000();
            }
            return null;
        }
        if (v2 instanceof v$_c && v2.\u00d200000() instanceof r) {
            r r3 = (r)v2.\u00d200000();
            j j2 = r3.\u00f600000();
            if (j2 == null) {
                j2 = f.o00000(x2, r3.int(), c2);
            }
            return j2;
        }
        return null;
    }

    public /* synthetic */ i$_f(w w2) {
        this();
    }
}

