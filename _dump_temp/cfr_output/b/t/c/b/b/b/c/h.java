/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.c;

import b.o.d.fc;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.b.c;
import b.t.c.b.b.b.c.f;
import b.t.c.b.b.b.d;
import b.t.c.b.b.d.e;
import b.t.c.b.b.d.k;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.wb;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h {
    public static final h o00000 = new h();

    private h() {
    }

    public final Collection o00000(k object, c c2) {
        ib ib2 = h.o00000(this, (k)object, c2, null, 4, null);
        if (ib2 == null) {
            return ub.\u00d300000();
        }
        object = ib2;
        k k2 = f.\u00f500000.\u00d500000(b.\u00d600000((wb)object));
        if (k2 == null) {
            return ub.super(object);
        }
        k k3 = k2;
        Object[] objectArray = new ib[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = c2.o00000(k3);
        return mc.new(objectArray2);
    }

    public final ib o00000(k k2, c c2, Integer n2) {
        b.t.c.b.b.d.d d2 = n2 != null && fc.o00000((Object)k2, (Object)f.\u00f500000.\u00d200000()) ? d.\u00d300000(n2) : f.\u00f500000.o00000(k2);
        if (d2 != null) {
            return c2.o00000(d2.\u00f400000());
        }
        return null;
    }

    public static /* synthetic */ ib o00000(h h2, k k2, c c2, Integer n2, int n3, Object object) {
        if ((n3 & 4) != 0) {
            n2 = null;
        }
        return h2.o00000(k2, c2, n2);
    }

    public final boolean \u00d400000(ib ib2) {
        return f.\u00f500000.\u00d300000(n.\u00d8O0000(ib2));
    }

    public final boolean \u00d300000(ib ib2) {
        return f.\u00f500000.\u00d200000(n.\u00d8O0000(ib2));
    }

    public final ib o00000(ib ib2) {
        String string = "mutable";
        Object object = n.\u00d8O0000(ib2);
        k k2 = f.\u00f500000.String((e)object);
        if (k2 == null) {
            throw new IllegalArgumentException("Given class " + ib2 + " is not a " + string + " collection");
        }
        object = k2;
        return b.null(ib2).o00000((k)object);
    }

    public final ib new(ib ib2) {
        String string = "read-only";
        Object object = n.\u00d8O0000(ib2);
        k k2 = f.\u00f500000.\u00d500000((e)object);
        if (k2 == null) {
            throw new IllegalArgumentException("Given class " + ib2 + " is not a " + string + " collection");
        }
        object = k2;
        return b.null(ib2).o00000((k)object);
    }
}

