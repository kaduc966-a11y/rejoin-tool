/*
 * Decompiled with CFR 0.152.
 */
package b.r;

import b.bd;
import b.i;
import b.o.d.tc;
import b.o.e.f;
import b.o.e.g;
import b.pc;
import b.r.b;
import b.r.c$_b$1;
import b.r.d.b.q;
import b.r.h;
import b.r.l;
import b.xd;

public final class c {
    private static final void o00000(b b2, Object object) {
        b2.return(xd.String(object));
    }

    private static final void o00000(b b2, Throwable throwable) {
        b2.return(xd.String(pc.o00000(throwable)));
    }

    private static final b o00000(l l2, g g2) {
        return new c$_b$1(l2, g2);
    }

    public static final b Object(g g2, b b2) {
        return new h(b.r.c.b.super(b.r.c.b.super(g2, b2)), b.r.c.b.\u00d200000());
    }

    public static final b o00000(f f2, Object object, b b2) {
        return new h(b.r.c.b.super(b.r.c.b.\u00d200000(f2, object, b2)), b.r.c.b.\u00d200000());
    }

    public static final void \u00d200000(g object, b object2) {
        object = b.r.c.b.super(b.r.c.b.super((g)object, (b)object2));
        object2 = i.o00000;
        object.return(xd.String(object2));
    }

    public static final void \u00d200000(f object, Object object2, b b2) {
        object = b.r.c.b.super(b.r.c.b.\u00d200000((f)object, object2, b2));
        object2 = i.o00000;
        object.return(xd.String(object2));
    }

    private static final Object o00000(g g2, b b2) {
        tc.\u00d200000(0);
        b b3 = b2;
        b3 = new h(b.r.c.b.super(b3));
        g2.\u00f800000(b3);
        Object object = ((h)b3).\u00d5\u00d80000();
        if (object == b.r.c.b.\u00d200000()) {
            q.\u00d200000(b2);
        }
        tc.\u00d200000(1);
        return object;
    }

    private static final l \u00d200000() {
        throw new bd("Implemented as intrinsic");
    }

    public static /* synthetic */ void o00000() {
    }
}

