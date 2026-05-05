/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.m;
import b.o.d.fc;
import b.qd;
import b.t.c.b.b.h.b;
import b.t.c.b.b.h.f;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.jc;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.q;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.u$_b;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.k.o;
import b.t.c.b.b.q.i;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class u
extends f
implements b {
    public static final u$_b \u00d5\u00f5\u00d8000 = new u$_b(null);
    private boolean \u00d4\u00f5\u00d8000;
    public static boolean \u00d3\u00f5\u00d8000;

    public u(ib ib2, ib ib3) {
        super(ib2, ib3);
    }

    private final void whilewhilesuper() {
        boolean bl;
        if (!\u00d3\u00f5\u00d8000 || this.\u00d4\u00f5\u00d8000) {
            return;
        }
        this.\u00d4\u00f5\u00d8000 = true;
        boolean bl2 = bl = !q.\u00d400000(this.\u00f4\u00f4\u00d2000());
        if (m.new && !bl) {
            String string = "Lower bound of a flexible type can not be flexible: " + this.\u00f4\u00f4\u00d2000();
            throw new AssertionError((Object)string);
        }
        boolean bl3 = bl = !q.\u00d400000(this.\u00d8\u00f4\u00d2000());
        if (m.new && !bl) {
            String string = "Upper bound of a flexible type can not be flexible: " + this.\u00d8\u00f4\u00d2000();
            throw new AssertionError((Object)string);
        }
        boolean bl4 = bl = !fc.o00000((Object)this.\u00f4\u00f4\u00d2000(), (Object)this.\u00d8\u00f4\u00d2000());
        if (m.new && !bl) {
            String string = "Lower and upper bounds are equal: " + this.\u00f4\u00f4\u00d2000() + " == " + this.\u00d8\u00f4\u00d2000();
            throw new AssertionError((Object)string);
        }
        bl = b.t.c.b.b.h.e.f.o00000.o00000(this.\u00f4\u00f4\u00d2000(), this.\u00d8\u00f4\u00d2000());
        if (m.new && !bl) {
            String string = "Lower bound " + this.\u00f4\u00f4\u00d2000() + " of a flexible type must be a subtype of the upper bound " + this.\u00d8\u00f4\u00d2000();
            throw new AssertionError((Object)string);
        }
    }

    @Override
    public final ib \u00f5\u00f4\u00d2000() {
        this.whilewhilesuper();
        return this.\u00f4\u00f4\u00d2000();
    }

    @Override
    public final boolean returnwhilesuper() {
        return this.\u00f4\u00f4\u00d2000().thisdosuper().\u00f4OO000() instanceof i && fc.o00000((Object)this.\u00f4\u00f4\u00d2000().thisdosuper(), (Object)this.\u00d8\u00f4\u00d2000().thisdosuper());
    }

    @Override
    public final rc \u00d5O0000(rc rc2) {
        rc rc3;
        rc2 = rc2.\u00d8\u00d6\u00d2000();
        l l2 = rc2;
        if (rc2 instanceof f) {
            rc3 = rc2;
        } else if (l2 instanceof ib) {
            rc3 = oc.o00000((ib)rc2, ((ib)rc2).\u00d4o0000(true));
        } else {
            throw new qd();
        }
        return jc.\u00d200000((l)rc3, rc2);
    }

    @Override
    public final l o00000(zb zb2) {
        return oc.o00000(this.\u00f4\u00f4\u00d2000().new(zb2), this.\u00d8\u00f4\u00d2000().new(zb2));
    }

    @Override
    public final String o00000(b.t.c.b.b.k.b b2, o o2) {
        if (o2.\u00d300000()) {
            return "(" + b2.super(this.\u00f4\u00f4\u00d2000()) + ".." + b2.super(this.\u00d8\u00f4\u00d2000()) + ')';
        }
        b.t.c.b.b.k.b b3 = b2;
        return b3.super(b3.super(this.\u00f4\u00f4\u00d2000()), b2.super(this.\u00d8\u00f4\u00d2000()), b.t.c.b.b.h.b.b.\u00d400000((rc)this));
    }

    @Override
    public final String toString() {
        return "(" + this.\u00f4\u00f4\u00d2000() + ".." + this.\u00d8\u00f4\u00d2000() + ')';
    }

    @Override
    public final l oo0000(boolean bl) {
        return oc.o00000(this.\u00f4\u00f4\u00d2000().\u00d4o0000(bl), this.\u00d8\u00f4\u00d2000().\u00d4o0000(bl));
    }

    public final f oo0000(b.t.c.b.b.h.e.b b2) {
        return new u((ib)b2.\u00d200000(this.\u00f4\u00f4\u00d2000()), (ib)b2.\u00d200000(this.\u00d8\u00f4\u00d2000()));
    }
}

