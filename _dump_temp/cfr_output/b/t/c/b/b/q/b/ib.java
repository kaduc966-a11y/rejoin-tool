/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.o.e.h;
import b.s.mc;
import b.t.c.b.b.d.f;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.b;
import b.t.c.b.b.q.b.ib$_c;
import b.t.c.b.b.q.b.ob;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.qc;
import b.t.c.b.b.q.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ib
extends ob
implements jc {
    public static final ib$_c \u00d5\u00d6\u00d6000 = new ib$_c(null);
    private final int O\u00d6\u00d6000;
    private final boolean \u00d3\u00d6\u00d6000;
    private final boolean nullfloatObject;
    private final boolean \u00f8\u00d5\u00d6000;
    private final rc \u00d4\u00d6\u00d6000;
    private final jc o\u00d6\u00d6000;

    public ib(b b2, jc jc2, int n2, o o2, f f2, rc rc2, boolean bl, boolean bl2, boolean bl3, rc rc3, g g2) {
        super(b2, o2, f2, rc2, g2);
        this.O\u00d6\u00d6000 = n2;
        this.\u00d3\u00d6\u00d6000 = bl;
        this.nullfloatObject = bl2;
        this.\u00f8\u00d5\u00d6000 = bl3;
        this.\u00d4\u00d6\u00d6000 = rc3;
        jc jc3 = jc2;
        if (jc3 == null) {
            jc3 = this;
        }
        this.o\u00d6\u00d6000 = jc3;
    }

    @Override
    public int whilenullsuper() {
        return this.O\u00d6\u00d6000;
    }

    @Override
    public boolean \u00d3O\u00d2000() {
        return this.nullfloatObject;
    }

    @Override
    public boolean \u00d4O\u00d2000() {
        return this.\u00f8\u00d5\u00d6000;
    }

    @Override
    public rc \u00d5O\u00d2000() {
        return this.\u00d4\u00d6\u00d6000;
    }

    @Override
    public b OO\u00d2000() {
        return (b)super.\u00d8\u00f80000();
    }

    @Override
    public boolean \u00f80\u00d2000() {
        return this.\u00d3\u00d6\u00d6000 && ((hc)this.OO\u00d2000()).O\u00f5o000().o00000();
    }

    @Override
    public jc oO\u00d2000() {
        if (this.o\u00d6\u00d6000 == this) {
            return this;
        }
        return this.o\u00d6\u00d6000.oO\u00d2000();
    }

    public jc \u00f500000(kc kc2) {
        if (kc2.o00000()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    @Override
    public boolean \u00f4\u00f4o000() {
        return false;
    }

    public Void thisintsuper() {
        return null;
    }

    @Override
    public jc o00000(b b2, f f2, int n2) {
        return new ib(b2, null, n2, this.\u00d4\u00f80000(), f2, this.forclasssuper(), this.\u00f80\u00d2000(), this.\u00d3O\u00d2000(), this.\u00d4O\u00d2000(), this.\u00d5O\u00d2000(), g.o00000);
    }

    @Override
    public s \u00d50O000() {
        return eb.\u00d500000;
    }

    @Override
    public Collection \u00d5\u00f4o000() {
        Iterable iterable = this.OO\u00d2000().\u00d5\u00f4o000();
        Object object = iterable;
        iterable = new ArrayList(mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (b)object2;
            Iterable iterable2 = iterable;
            iterable2.add((jc)object2.\u00f5\u00d8o000().get(this.whilenullsuper()));
        }
        return (List)iterable;
    }

    public static final ib o00000(b b2, jc jc2, int n2, o o2, f f2, rc rc2, boolean bl, boolean bl2, boolean bl3, rc rc3, g g2, h h2) {
        return \u00d5\u00d6\u00d6000.o00000(b2, jc2, n2, o2, f2, rc2, bl, bl2, bl3, rc3, g2, h2);
    }
}

