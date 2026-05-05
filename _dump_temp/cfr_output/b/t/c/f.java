/*
 * Decompiled with CFR 0.152.
 */
package b.t.c;

import b.s.mc;
import b.t.bb;
import b.t.c.b.b.c.gb;
import b.t.c.b.lb;
import b.t.c.b.r;
import b.t.u;
import b.t.v;
import b.t.w;
import b.t.z;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f {
    public static final z super(u u2) {
        v v2 = u2.privatevoid();
        if (v2 == null || (v2 = f.super(v2)) == null) {
            throw new lb("Cannot calculate JVM erasure for type: ".concat(String.valueOf(u2)));
        }
        return v2;
    }

    public static /* synthetic */ void \u00d200000(u u2) {
    }

    public static final z super(v object) {
        w w2;
        Object object2 = object;
        if (object2 instanceof z) {
            return (z)object;
        }
        if (object2 instanceof bb) {
            u u2;
            Object v0;
            block6: {
                object = ((bb)object).\u00f4\u00d4o000();
                for (Object e2 : (Iterable)object) {
                    v v2 = ((u)e2).privatevoid();
                    v2 = v2 instanceof r ? (r)v2 : null;
                    if (!(v2 != null && ((r)v2).\u00f4\u00d2o000() != gb.void && ((r)v2).\u00f4\u00d2o000() != gb.o00000)) continue;
                    v0 = e2;
                    break block6;
                }
                v0 = null;
            }
            if ((u2 = (u)v0) == null) {
                u2 = w2 = (u)mc.\u00f5O0000((List)object);
            }
            if (u2 == null || (w2 = f.super(w2)) == null) {
                return b.o.d.z.\u00d200000(Object.class);
            }
        } else {
            throw new lb("Cannot calculate JVM erasure for type: ".concat(String.valueOf(object)));
        }
        return w2;
    }
}

