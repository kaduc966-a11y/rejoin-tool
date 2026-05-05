/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.b.c;
import b.t.c.b.b.d.e;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.jc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.c.d.c.b;
import b.t.c.b.b.n.c.d.c.j;
import b.t.c.b.b.n.c.g;
import b.t.c.b.b.n.c.g.d;
import b.t.c.b.b.n.c.g.h;
import b.t.c.b.b.n.c.g.o;
import b.t.c.b.b.n.c.g.r;
import b.t.c.b.b.n.c.t;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.e.i;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.ib;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class s
extends o {
    private final i \u00d400000;
    private final boolean \u00d300000;
    private final b.t.c.b.b.n.c.d.i \u00d500000;
    private final t o00000;
    private final boolean new;

    public s(i i2, boolean bl, b.t.c.b.b.n.c.d.i i3, t t2, boolean bl2) {
        this.\u00d400000 = i2;
        this.\u00d300000 = bl;
        this.\u00d500000 = i3;
        this.o00000 = t2;
        this.new = bl2;
    }

    public /* synthetic */ s(i i2, boolean bl, b.t.c.b.b.n.c.d.i i3, t t2, boolean bl2, int n2, w w2) {
        if ((n2 & 0x10) != 0) {
            bl2 = false;
        }
        this(i2, bl, i3, t2, bl2);
    }

    @Override
    public final boolean \u00d400000() {
        return this.\u00d300000;
    }

    @Override
    public final t o00000() {
        return this.o00000;
    }

    @Override
    public final boolean \u00d600000() {
        return this.new;
    }

    public final b.t.c.b.b.n.c.o oO0000() {
        return this.\u00d500000.\u00d500000().\u00d6O0000();
    }

    @Override
    public final boolean \u00f400000() {
        return this.\u00d500000.\u00d500000().\u00f500000().new();
    }

    @Override
    public final Iterable Object() {
        Object object = this.\u00d400000;
        if (object != null && (object = object.\u00d4\u00f80000()) != null) {
            return (Iterable)object;
        }
        return mc.\u00d500000();
    }

    @Override
    public final g \u00f500000() {
        return this.\u00d500000.new();
    }

    @Override
    public final boolean \u00d500000() {
        return this.\u00d400000 instanceof b.t.c.b.b.q.jc && ((b.t.c.b.b.q.jc)this.\u00d400000).\u00d5O\u00d2000() != null;
    }

    public final b.t.c.b.b.h.c.w OO0000() {
        return b.t.c.b.b.h.e.s.o00000;
    }

    @Override
    public final boolean void() {
        return false;
    }

    public final boolean o00000(l l2, q q2) {
        return l2 instanceof b.t.c.b.b.n.c.e.g && ((b.t.c.b.b.n.c.e.g)l2).\u00d600000() || l2 instanceof b && !((o)this).\u00f400000() && (((b)l2).OO0000() || ((o)this).o00000() == t.\u00f400000) || q2 != null && c.\u00d200000((rc)q2) && this.oO0000().String(l2) && !this.\u00d500000.\u00d500000().\u00f500000().\u00d300000();
    }

    @Override
    public final Iterable Object(q q2) {
        return ((rc)q2).\u00d4\u00f80000();
    }

    public final rc float(q q2) {
        return jc.o00000((rc)q2);
    }

    @Override
    public final e \u00f500000(q q2) {
        ib ib2 = b.t.c.b.b.h.o.float((rc)q2);
        if (ib2 != null) {
            return n.\u00d8O0000(ib2);
        }
        return null;
    }

    @Override
    public final boolean \u00f400000(q q2) {
        return ((rc)q2).\u00d8\u00d6\u00d2000() instanceof h;
    }

    @Override
    public final boolean o00000(q q2, q q3) {
        return this.\u00d500000.\u00d500000().\u00d500000().\u00d200000((rc)q2, (rc)q3);
    }

    @Override
    public final boolean o00000(q q2) {
        return c.\u00d5O0000((rc)q2);
    }

    @Override
    public final boolean \u00d200000(b.t.c.b.b.h.c.r r2) {
        return r2 instanceof j;
    }

    @Override
    protected final r o00000(r r2, b.t.c.b.b.n.c.r r3) {
        r r4 = r2;
        if (r4 == null || (r4 = r.super(r4, (Object)d.class, false, 2, null)) == null) {
            b.t.c.b.b.n.c.r r5 = r3;
            if (r5 != null) {
                return r5.new();
            }
            r4 = null;
        }
        return r4;
    }
}

