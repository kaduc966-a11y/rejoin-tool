/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d;

import b.g.c;
import b.o.d.w;
import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.b.q;
import b.t.c.b.b.n.c.b.s;
import b.t.c.b.b.n.c.d.h$_b$0;
import b.t.c.b.b.n.c.d.i;
import b.t.c.b.b.n.c.f.b;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.e.o;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
implements o {
    private final i o\u00d2\u00f6000;
    private final s Stringvoidclass;
    private final boolean O\u00d2\u00f6000;
    private final b.t.c.b.b.i.i \u00f8o\u00f6000;

    public h(i object, s s2, boolean bl) {
        this.o\u00d2\u00f6000 = object;
        this.Stringvoidclass = s2;
        this.O\u00d2\u00f6000 = bl;
        object = this;
        this.\u00f8o\u00f6000 = this.o\u00d2\u00f6000.\u00d500000().\u00d200000().\u00d200000(new h$_b$0((h)object));
    }

    public /* synthetic */ h(i i2, s s2, boolean bl, int n2, w w2) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        this(i2, s2, bl);
    }

    @Override
    public final l \u00d400000(k k2) {
        q q2;
        Object object = this.Stringvoidclass.o00000(k2);
        if (object == null || (object = (l)((g)this.\u00f8o\u00f6000).\u00f800000(q2 = object)) == null) {
            object = b.class.super(k2, this.Stringvoidclass, this.o\u00d2\u00f6000);
        }
        return object;
    }

    public final Iterator iterator() {
        return c.\u00f5\u00d30000(c.null(c.\u00f5\u00d30000(mc.\u00d5o0000(this.Stringvoidclass.\u00d300000()), this.\u00f8o\u00f6000), b.class.super(d$_b.\u00f8O0000, this.Stringvoidclass, this.o\u00d2\u00f6000))).o00000();
    }

    @Override
    public final boolean \u00d5\u00f4\u00d3000() {
        return this.Stringvoidclass.\u00d300000().isEmpty() && !this.Stringvoidclass.new();
    }

    private static final l new(h h2, q q2) {
        return b.class.super(q2, h2.o\u00d2\u00f6000, h2.O\u00d2\u00f6000);
    }

    static /* synthetic */ l o00000(h h2, q q2) {
        return h.new(h2, q2);
    }
}

