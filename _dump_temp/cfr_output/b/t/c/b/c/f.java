/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.c;

import b.o.d.fc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.kb;
import b.t.c.b.c.c;
import b.t.c.b.c.e;
import b.t.c.b.c.e$_b;
import b.t.c.b.c.h;
import b.t.c.b.c.k;
import b.t.c.b.c.n;
import b.t.c.b.lb;
import b.t.c.b.zc;
import b.t.u;
import b.t.v;
import b.t.z;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f {
    public static final u o00000(u u2, u u3) {
        if (zc.\u00d300000()) {
            return new c(oc.o00000((ib)((c)u2).\u00f8\u00d8\u00d2000(), (ib)((c)u3).\u00f8\u00d8\u00d2000()), null, 2, null);
        }
        return e$_b.o00000(e.o\u00d6\u00d8000, (n)u2, (n)u3, false, null, 8, null);
    }

    public static final u new(u u2) {
        if (zc.\u00d300000()) {
            rc rc2 = ((c)u2).\u00f8\u00d8\u00d2000();
            if (!(rc2 instanceof ib)) {
                String string = "Non-simple type cannot be a mutable collection type: ".concat(String.valueOf(u2));
                throw new IllegalArgumentException(string.toString());
            }
            kb kb2 = rc2.thisdosuper().\u00f4OO000();
            b.t.c.b.b.q.ib ib2 = kb2 instanceof b.t.c.b.b.q.ib ? (b.t.c.b.b.q.ib)kb2 : null;
            if (ib2 == null) {
                throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: ".concat(String.valueOf(u2)));
            }
            kb2 = ib2;
            return new c(oc.o00000((ib)rc2, null, f.o00000((b.t.c.b.b.q.ib)kb2).\u00d3OO000(), null, false, 26, null), null, 2, null);
        }
        v v2 = ((h)u2).privatevoid();
        Object object = v2 instanceof z ? (z)v2 : null;
        if (object == null || (object = object.\u00d8\u00d3O000()) == null) {
            throw new lb("Non-class type cannot be a mutable collection type: ".concat(String.valueOf(u2)));
        }
        Object object2 = object;
        b.t.c.b.b.d.k k2 = b.t.c.b.b.b.c.f.\u00f500000.\u00d500000(new b.t.c.b.b.d.e((String)object2));
        if (k2 == null) {
            throw new IllegalArgumentException("Not a readonly collection: ".concat(String.valueOf(u2)));
        }
        object2 = k2;
        return new h(((h)u2).privatevoid(), ((h)u2).\u00f5\u00f60000(), ((h)u2).\u00f4\u00f60000(), ((h)u2).\u00d8\u00f50000(), ((n)((h)u2)).nulldosuper(), ((n)((h)u2)).privatedosuper(), ((n)((h)u2)).fordosuper(), ((n)((h)u2)).\u00d5\u00d8\u00d2000(), k.o00000((b.t.c.b.b.d.k)object2, (z)v2), null, 512, null);
    }

    private static final b.t.c.b.b.q.ib o00000(b.t.c.b.b.q.ib ib2) {
        b.t.c.b.b.d.k k2 = b.t.c.b.b.b.c.f.\u00f500000.\u00d500000(b.\u00d600000(ib2));
        if (k2 == null) {
            throw new IllegalArgumentException("Not a readonly collection: ".concat(String.valueOf(ib2)));
        }
        b.t.c.b.b.d.k k3 = k2;
        return b.null(ib2).o00000(k3);
    }

    public static final u o00000(u object) {
        if (zc.\u00d300000()) {
            rc rc2 = ((c)object).\u00f8\u00d8\u00d2000();
            if (!(rc2 instanceof ib)) {
                object = "Non-simple type cannot be a Nothing type: ".concat(String.valueOf(object));
                throw new IllegalArgumentException(object.toString());
            }
            return new c(oc.o00000((ib)rc2, null, b.t.c.b.b.h.b.b.\u00d400000(rc2).\u00d2o0000().\u00d3OO000(), null, false, 26, null), null, 2, null);
        }
        h cfr_ignored_0 = (h)object;
        if (!fc.o00000((Object)((h)object).privatevoid(), (Object)b.o.d.z.\u00d200000(Void.class))) {
            object = "Nothing type's classifier must be Void::class: ".concat(String.valueOf(object));
            throw new IllegalArgumentException(object.toString());
        }
        return new h(((h)object).privatevoid(), ((h)object).\u00f5\u00f60000(), ((h)object).\u00f4\u00f60000(), ((h)object).\u00d8\u00f50000(), ((n)((h)object)).nulldosuper(), ((n)((h)object)).privatedosuper(), true, ((n)((h)object)).\u00d5\u00d8\u00d2000(), ((n)((h)object)).\u00f4\u00d8\u00d2000(), null, 512, null);
    }
}

