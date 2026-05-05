/*
 * Decompiled with CFR 0.152.
 */
package b.r.c;

import b.o.d.rb;
import b.o.e.f;
import b.o.e.g;
import b.r.b;
import b.r.c.e$_b$1;
import b.r.c.e$_b$2;
import b.r.c.e$_c$1;
import b.r.c.e$_c$2;
import b.r.c.e$_d$_b$_b$_b$1;
import b.r.c.e$_d$_b$_b$_b$2;
import b.r.c.e$_d$_b$_b$_b$3;
import b.r.c.e$_d$_b$_b$_b$4;
import b.r.d.b.o;
import b.r.d.b.q;
import b.r.d.b.s;
import b.r.i;
import b.r.l;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class e {
    private static final Object \u00d300000(g g2, b b2) {
        if (!(g2 instanceof o)) {
            return b.r.c.b.\u00d200000(g2, b2);
        }
        return ((g)rb.o00000((Object)g2, 1)).\u00f800000(b2);
    }

    public static final Object \u00d200000(g g2, b b2) {
        b2 = e.\u00d200000(q.Object(b2));
        return ((g)rb.o00000((Object)g2, 1)).\u00f800000(b2);
    }

    private static final Object \u00d300000(f f2, Object object, b b2) {
        if (!(f2 instanceof o)) {
            return b.r.c.b.super(f2, object, b2);
        }
        return ((f)rb.o00000((Object)f2, 2)).o00000(object, b2);
    }

    public static final Object super(f f2, Object object, b b2) {
        b2 = e.\u00d200000(q.Object(b2));
        return ((f)rb.o00000((Object)f2, 2)).o00000(object, b2);
    }

    private static final Object super(b.o.e.e e2, Object object, Object object2, b b2) {
        if (!(e2 instanceof o)) {
            return b.r.c.b.\u00d200000(e2, object, object2, b2);
        }
        return ((b.o.e.e)rb.o00000((Object)e2, 3)).o00000(object, object2, b2);
    }

    public static final Object \u00d200000(b.o.e.e e2, Object object, Object object2, b b2) {
        b2 = e.\u00d200000(q.Object(b2));
        return ((b.o.e.e)rb.o00000((Object)e2, 3)).o00000(object, object2, b2);
    }

    public static final b super(g g2, b b2) {
        b2 = q.Object(b2);
        if (g2 instanceof o) {
            return ((o)((Object)g2)).o00000(b2);
        }
        l l2 = b2.O\u00d80000();
        if (l2 == i.o00000) {
            return new e$_d$_b$_b$_b$1(b2, g2);
        }
        return new e$_d$_b$_b$_b$2(b2, l2, g2);
    }

    public static final b \u00d200000(f f2, Object object, b b2) {
        b2 = q.Object(b2);
        if (f2 instanceof o) {
            return ((o)((Object)f2)).new(object, b2);
        }
        l l2 = b2.O\u00d80000();
        if (l2 == i.o00000) {
            return new e$_d$_b$_b$_b$3(b2, f2, object);
        }
        return new e$_d$_b$_b$_b$4(b2, l2, f2, object);
    }

    public static final b super(b b2) {
        b b3 = b2 instanceof s ? (s)b2 : null;
        if (b3 == null || (b3 = b3.o\u00f40000()) == null) {
            b3 = b2;
        }
        return b3;
    }

    private static final b super(b b2, g g2) {
        l l2 = b2.O\u00d80000();
        if (l2 == i.o00000) {
            return new e$_c$1(b2, g2);
        }
        return new e$_c$2(b2, l2, g2);
    }

    private static final b \u00d200000(b b2) {
        l l2 = b2.O\u00d80000();
        if (l2 == i.o00000) {
            return new e$_b$1(b2);
        }
        return new e$_b$2(b2, l2);
    }
}

