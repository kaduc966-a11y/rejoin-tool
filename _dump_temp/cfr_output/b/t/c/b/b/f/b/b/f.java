/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.o.d.w;
import b.t.c.b.b.f.b.b.i;
import b.t.c.b.b.f.b.b.n;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.h;
import b.t.c.b.b.q.b.t;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.qb;
import b.t.c.b.b.q.wb;

public final class f
extends t
implements n {
    private final b$_z o\u00d2\u00d6000;
    private final e \u00f8o\u00d6000;
    private final d O\u00d2\u00d6000;
    private final h \u00f5o\u00d6000;
    private final i ifnullObject;

    public f(wb wb2, qb qb2, o o2, b.t.c.b.b.d.f f2, hc$_b hc$_b, b$_z b$_z, e e2, d d2, h h2, i i2, g g2) {
        g g3 = g2;
        if (g3 == null) {
            g3 = g.o00000;
        }
        super(wb2, qb2, o2, f2, hc$_b, g3);
        this.o\u00d2\u00d6000 = b$_z;
        this.\u00f8o\u00d6000 = e2;
        this.O\u00d2\u00d6000 = d2;
        this.\u00f5o\u00d6000 = h2;
        this.ifnullObject = i2;
    }

    public /* synthetic */ f(wb wb2, qb qb2, o o2, b.t.c.b.b.d.f f2, hc$_b hc$_b, b$_z b$_z, e e2, d d2, h h2, i i2, g g2, int n2, w w2) {
        if ((n2 & 0x400) != 0) {
            g2 = null;
        }
        this(wb2, qb2, o2, f2, hc$_b, b$_z, e2, d2, h2, i2, g2);
    }

    public final b$_z forvoidsuper() {
        return this.o\u00d2\u00d6000;
    }

    @Override
    public final e \u00f4\u00d8o000() {
        return this.\u00f8o\u00d6000;
    }

    @Override
    public final d \u00d8\u00d8o000() {
        return this.O\u00d2\u00d6000;
    }

    public final h \u00d5\u00f8o000() {
        return this.\u00f5o\u00d6000;
    }

    @Override
    public final i \u00d5\u00d8o000() {
        return this.ifnullObject;
    }

    @Override
    public final b.t.c.b.b.q.b.i o00000(wb wb2, ic ic2, hc$_b hc$_b, b.t.c.b.b.d.f f2, o o2, g g2) {
        qb qb2 = (qb)ic2;
        b.t.c.b.b.d.f f3 = f2;
        if (f3 == null) {
            f3 = this.\u00d5\u00f80000();
        }
        wb2 = new f(wb2, qb2, o2, f3, hc$_b, this.forvoidsuper(), this.\u00f4\u00d8o000(), this.\u00d8\u00d8o000(), this.\u00d5\u00f8o000(), this.\u00d5\u00d8o000(), g2);
        ((b.t.c.b.b.q.b.i)wb2).thissuper(this.thisvoidsuper());
        return (b.t.c.b.b.q.b.i)wb2;
    }
}

