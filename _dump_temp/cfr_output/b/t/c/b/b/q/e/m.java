/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.e;

import b.dc;
import b.lb;
import b.o.d.w;
import b.o.e.h;
import b.r;
import b.t.c.b.b.b.c;
import b.t.c.b.b.d.k;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.e.m$_b$0;
import b.t.c.b.b.q.g;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m
implements l {
    private final c \u00f400000;
    private final k \u00d800000;
    private final Map \u00d600000;
    private final boolean class;
    private final dc int;

    public m(c object, k k2, Map map, boolean bl) {
        this.\u00f400000 = object;
        this.\u00d800000 = k2;
        this.\u00d600000 = map;
        this.class = bl;
        object = this;
        this.int = r.o00000(lb.\u00d400000, (h)new m$_b$0((m)object));
    }

    public /* synthetic */ m(c c2, k k2, Map map, boolean bl, int n2, w w2) {
        if ((n2 & 8) != 0) {
            bl = false;
        }
        this(c2, k2, map, bl);
    }

    @Override
    public final k \u00d300000() {
        return this.\u00d800000;
    }

    @Override
    public final Map super() {
        return this.\u00d600000;
    }

    @Override
    public final rc \u00d400000() {
        return (rc)this.int.\u00d200000();
    }

    @Override
    public final g \u00d200000() {
        return g.o00000;
    }

    private static final ib \u00d200000(m m2) {
        return m2.\u00f400000.o00000(m2.\u00d300000()).nullint();
    }

    static /* synthetic */ ib super(m m2) {
        return m.\u00d200000(m2);
    }
}

