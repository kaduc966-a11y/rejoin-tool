/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.s.mc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;
import b.t.c.b.b.i.j;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.b.db;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.nc;
import b.t.c.b.b.q.t$_b$0;
import b.t.c.b.b.q.t$_b$1;
import b.t.c.b.b.q.t$_c;
import b.t.c.b.b.q.t$_d;
import b.t.c.b.b.q.wb;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class t {
    private final l \u00d400000;
    private final bc new;
    private final j \u00d300000;
    private final j o00000;

    public t(l object, bc bc2) {
        this.\u00d400000 = object;
        this.new = bc2;
        object = this;
        this.\u00d300000 = this.\u00d400000.o00000(new t$_b$0((t)object));
        object = this;
        this.o00000 = this.\u00d400000.o00000(new t$_b$1((t)object));
    }

    public final ib o00000(d d2, List list) {
        return (ib)this.o00000.\u00f800000(new t$_c(d2, list));
    }

    private static final lc new(t t2, k k2) {
        return new db(t2.new, k2);
    }

    private static final ib new(t t2, t$_c object) {
        Object object2;
        d d2 = ((t$_c)object).super();
        object = ((t$_c)object).\u00d200000();
        if (d2.return()) {
            throw new UnsupportedOperationException("Unresolved local class: ".concat(String.valueOf(d2)));
        }
        Object object3 = d2.\u00d500000();
        object2 = object3 != null && (object3 = t2.o00000((d)(object2 = object3), mc.new((Iterable)object, 1))) != null ? (nc)object3 : (nc)t2.\u00d300000.\u00f800000(d2.\u00d800000());
        boolean bl = d2.new();
        Integer n2 = (Integer)mc.\u00f5O0000((List)object);
        return new t$_d(t2.\u00d400000, (wb)object2, d2.o00000(), bl, n2 != null ? n2 : 0);
    }

    static /* synthetic */ lc o00000(t t2, k k2) {
        return t.new(t2, k2);
    }

    static /* synthetic */ ib o00000(t t2, t$_c t$_c) {
        return t.new(t2, t$_c);
    }
}

