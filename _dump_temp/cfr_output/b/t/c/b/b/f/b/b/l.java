/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b.b;

import b.o.d.fc;
import b.t.c.b.b.d.f;
import b.t.c.b.b.f.b.b.i;
import b.t.c.b.b.f.b.b.o;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.r;
import b.t.c.b.b.h.w;
import b.t.c.b.b.l.b$_j;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.h;
import b.t.c.b.b.q.b.eb;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.wb;
import java.util.List;

public final class l
extends eb
implements o {
    private final b$_j newforObject;
    private final e \u00d4\u00d8\u00d6000;
    private final d \u00f4\u00d8\u00d6000;
    private final h \u00d8\u00d8\u00d6000;
    private final i O\u00d8\u00d6000;
    private ib \u00d5\u00d8\u00d6000;
    private ib returnforObject;
    private List o\u00d8\u00d6000;
    private ib \u00d3\u00d8\u00d6000;

    public l(b.t.c.b.b.i.l l2, wb wb2, b.t.c.b.b.q.e.o o2, f f2, s s2, b$_j b$_j, e e2, d d2, h h2, i i2) {
        super(l2, wb2, o2, f2, g.o00000, s2);
        this.newforObject = b$_j;
        this.\u00d4\u00d8\u00d6000 = e2;
        this.\u00f4\u00d8\u00d6000 = d2;
        this.\u00d8\u00d8\u00d6000 = h2;
        this.O\u00d8\u00d6000 = i2;
    }

    public final b$_j \u00f8O\u00d2000() {
        return this.newforObject;
    }

    @Override
    public final e \u00f4\u00d8o000() {
        return this.\u00d4\u00d8\u00d6000;
    }

    @Override
    public final d \u00d8\u00d8o000() {
        return this.\u00f4\u00d8\u00d6000;
    }

    public final h Stringintsuper() {
        return this.\u00d8\u00d8\u00d6000;
    }

    @Override
    public final i \u00d5\u00d8o000() {
        return this.O\u00d8\u00d6000;
    }

    @Override
    public final ib \u00f5\u00d6o000() {
        ib ib2 = this.\u00d5\u00d8\u00d6000;
        if (ib2 != null) {
            return ib2;
        }
        fc.return("");
        return null;
    }

    @Override
    public final ib ifStringsuper() {
        ib ib2 = this.returnforObject;
        if (ib2 != null) {
            return ib2;
        }
        fc.return("");
        return null;
    }

    public final void o00000(List list, ib ib2, ib ib3) {
        this.\u00f800000(list);
        this.\u00d5\u00d8\u00d6000 = ib2;
        this.returnforObject = ib3;
        this.o\u00d8\u00d6000 = b.t.c.b.b.q.f.o00000(this);
        this.\u00d3\u00d8\u00d6000 = this.O\u00d8o000();
    }

    @Override
    public final b.t.c.b.b.q.ib \u00f8\u00d6o000() {
        kb kb2;
        if (!hb.super(this.ifStringsuper()) && (kb2 = this.ifStringsuper().thisdosuper().\u00f4OO000()) instanceof b.t.c.b.b.q.ib) {
            return (b.t.c.b.b.q.ib)kb2;
        }
        return null;
    }

    @Override
    public final ib nullint() {
        ib ib2 = this.\u00d3\u00d8\u00d6000;
        if (ib2 == null) {
            fc.return("");
            ib2 = null;
        }
        return ib2;
    }

    public final b.t.c.b.b.q.h \u00f800000(kc kc2) {
        if (kc2.o00000()) {
            return this;
        }
        l l2 = new l(this.whileStringsuper(), this.\u00d8\u00f80000(), this.\u00d4\u00f80000(), this.\u00d5\u00f80000(), this.\u00d50O000(), this.\u00f8O\u00d2000(), this.\u00f4\u00d8o000(), this.\u00d8\u00d8o000(), this.Stringintsuper(), this.\u00d5\u00d8o000());
        l2.o00000(this.\u00d8\u00d6o000(), r.super(kc2.new(this.\u00f5\u00d6o000(), w.\u00d400000)), r.super(kc2.new(this.ifStringsuper(), w.\u00d400000)));
        return l2;
    }

    @Override
    public final List \u00d3\u00d8o000() {
        List list = this.o\u00d8\u00d6000;
        if (list == null) {
            fc.return("");
            list = null;
        }
        return list;
    }
}

