/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.m;
import b.o.d.fc;
import b.o.d.w;
import b.t.c.b.b.h.e.i;
import b.t.c.b.b.h.e.j;
import b.t.c.b.b.h.f;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.q;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.sb;
import b.t.c.b.b.h.vc;
import b.t.c.b.b.q.kb;

public final class sb$_b {
    private sb$_b() {
    }

    public final sb o00000(l object, boolean bl, boolean bl2) {
        if (object instanceof sb) {
            return (sb)object;
        }
        if (bl2 || this.o00000((l)object, bl)) {
            if (object instanceof f) {
                bl2 = fc.o00000((Object)((f)object).\u00f4\u00f4\u00d2000().thisdosuper(), (Object)((f)object).\u00d8\u00f4\u00d2000().thisdosuper());
                if (m.new && !bl2) {
                    object = "DefinitelyNotNullType for flexible type (" + object + ") can be created only from type variable with the same constructor for bounds";
                    throw new AssertionError(object);
                }
            }
            return new sb(q.\u00d300000((rc)object).\u00d4o0000(false), bl, null);
        }
        return null;
    }

    public static /* synthetic */ sb o00000(sb$_b sb$_b, l l2, boolean bl, boolean bl2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            bl2 = false;
        }
        return sb$_b.o00000(l2, bl, bl2);
    }

    private final boolean o00000(l l2, boolean bl) {
        if (!this.o00000(l2)) {
            return false;
        }
        if (l2 instanceof vc) {
            return o.\u00d600000(l2);
        }
        kb kb2 = l2.thisdosuper().\u00f4OO000();
        b.t.c.b.b.q.b.m m2 = kb2 instanceof b.t.c.b.b.q.b.m ? (b.t.c.b.b.q.b.m)kb2 : null;
        boolean bl2 = m2 != null ? !m2.\u00d4\u00d6o000() : false;
        if (bl2) {
            return true;
        }
        if (bl && l2.thisdosuper().\u00f4OO000() instanceof b.t.c.b.b.q.i) {
            return o.\u00d600000(l2);
        }
        return !b.t.c.b.b.h.e.l.o00000.o00000(l2);
    }

    private final boolean o00000(l l2) {
        return l2.thisdosuper() instanceof i || l2.thisdosuper().\u00f4OO000() instanceof b.t.c.b.b.q.i || l2 instanceof j || l2 instanceof vc;
    }

    public /* synthetic */ sb$_b(w w2) {
        this();
    }
}

