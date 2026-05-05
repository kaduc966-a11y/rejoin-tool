/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.o.d.fc;
import b.o.e.g;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.d.k;
import b.t.c.b.b.f.b.ab;
import b.t.c.b.b.f.b.h;
import b.t.c.b.b.f.b.o$_b$0;
import b.t.c.b.b.f.b.t;
import b.t.c.b.b.i.i;
import b.t.c.b.b.i.l;
import b.t.c.b.b.m.e;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.db;
import b.t.c.b.b.q.lc;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class o
implements db {
    private final l \u00d800000;
    private final h \u00f500000;
    private final bc \u00f600000;
    protected t null;
    private final i \u00d600000;

    public o(l object, h h2, bc bc2) {
        this.\u00d800000 = object;
        this.\u00f500000 = h2;
        this.\u00f600000 = bc2;
        object = this;
        this.\u00d600000 = this.\u00d800000.\u00d200000(new o$_b$0((o)object));
    }

    protected final l \u00d200000() {
        return this.\u00d800000;
    }

    protected final h \u00d300000() {
        return this.\u00f500000;
    }

    protected final bc o00000() {
        return this.\u00f600000;
    }

    protected final t String() {
        t t2 = this.null;
        if (t2 != null) {
            return t2;
        }
        fc.return("");
        return null;
    }

    protected final void o00000(t t2) {
        this.null = t2;
    }

    protected abstract ab String(k var1);

    @Override
    public void o00000(k k2, Collection collection) {
        e.o00000(collection, this.\u00d600000.\u00f800000(k2));
    }

    @Override
    public boolean \u00d200000(k k2) {
        return (this.\u00d600000.Stringsuper(k2) ? (lc)this.\u00d600000.\u00f800000(k2) : (lc)this.String(k2)) == null;
    }

    @Override
    public List o00000(k k2) {
        return mc.new(this.\u00d600000.\u00f800000(k2));
    }

    @Override
    public Collection o00000(k k2, g g2) {
        return ub.\u00d300000();
    }

    private static final lc o00000(o o2, k object) {
        Object object2;
        ab ab2 = o2.String((k)object);
        if (ab2 != null) {
            object = ab2;
            ab2.o00000(o2.String());
            object2 = object;
        } else {
            object2 = null;
        }
        return (lc)object2;
    }

    static /* synthetic */ lc \u00d200000(o o2, k k2) {
        return o.o00000(o2, k2);
    }
}

