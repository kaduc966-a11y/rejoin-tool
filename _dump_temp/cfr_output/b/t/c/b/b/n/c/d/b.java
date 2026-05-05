/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d;

import b.t.c.b.b.n.c.b.ab;
import b.t.c.b.b.n.c.b.l;
import b.t.c.b.b.n.c.d.b$_b$0;
import b.t.c.b.b.n.c.d.c.j;
import b.t.c.b.b.n.c.d.e;
import b.t.c.b.b.n.c.d.g;
import b.t.c.b.b.n.c.d.i;
import b.t.c.b.b.q.wb;
import java.util.Map;

public final class b
implements g {
    private final i \u00d600000;
    private final wb \u00d200000;
    private final int \u00d500000;
    private final Map String;
    private final b.t.c.b.b.i.i \u00d300000;

    public b(i object, wb wb2, l l2, int n2) {
        this.\u00d600000 = object;
        this.\u00d200000 = wb2;
        this.\u00d500000 = n2;
        this.String = b.t.c.b.b.m.e.o00000(l2.o00000());
        object = this;
        this.\u00d300000 = this.\u00d600000.return().\u00d200000(new b$_b$0((b)object));
    }

    @Override
    public final b.t.c.b.b.q.i o00000(ab ab2) {
        j j2 = (j)this.\u00d300000.\u00f800000(ab2);
        if (j2 != null) {
            return j2;
        }
        return this.\u00d600000.\u00d400000().o00000(ab2);
    }

    private static final j \u00d200000(b b2, ab ab2) {
        Integer n2 = (Integer)b2.String.get(ab2);
        if (n2 != null) {
            int n3 = ((Number)n2).intValue();
            return new j(e.\u00d200000(e.o00000(b2.\u00d600000, b2), b2.\u00d200000.\u00d4\u00f80000()), ab2, b2.\u00d500000 + n3, b2.\u00d200000);
        }
        return null;
    }

    static /* synthetic */ j o00000(b b2, ab ab2) {
        return b.\u00d200000(b2, ab2);
    }
}

