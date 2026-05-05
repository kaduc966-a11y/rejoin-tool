/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.t.c.b.b.d.k;
import b.t.c.b.b.d.l;
import b.t.c.b.b.i.h;
import b.t.c.b.b.i.i;
import b.t.c.b.b.n.c.bb$_b$0;
import b.t.c.b.b.n.c.jb;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bb
implements jb {
    private final Map \u00d300000;
    private final h \u00d400000;
    private final i new;

    public bb(Map object) {
        this.\u00d300000 = object;
        this.\u00d400000 = new h("Java nullability annotation states");
        object = this;
        this.new = this.\u00d400000.\u00d200000(new bb$_b$0((bb)object));
    }

    @Override
    public final Object o00000(k k2) {
        return this.new.\u00f800000(k2);
    }

    private static final Object new(bb bb2, k k2) {
        return l.o00000(k2, bb2.\u00d300000);
    }

    static /* synthetic */ Object o00000(bb bb2, k k2) {
        return bb.new(bb2, k2);
    }
}

