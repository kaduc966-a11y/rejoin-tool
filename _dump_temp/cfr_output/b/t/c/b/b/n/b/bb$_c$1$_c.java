/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.n.b.bb$_c$1;
import b.t.c.b.b.n.b.bb$_c$1$_b;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.j$_c;
import b.t.c.b.b.n.b.t;
import b.t.c.b.b.q.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bb$_c$1$_c
extends bb$_c$1$_b
implements j$_c {
    final /* synthetic */ bb$_c$1 \u00d300000;

    public bb$_c$1$_c(bb$_c$1 bb$_c$1, t t2) {
        this.\u00d300000 = bb$_c$1;
        super(bb$_c$1, t2);
    }

    @Override
    public final j$_b super(int n2, d d2, g g2) {
        t t2 = t.new.o00000(this.\u00d200000(), n2);
        List list = (List)this.\u00d300000.\u00d300000.get(t2);
        if (list == null) {
            list = new ArrayList();
            ((Map)this.\u00d300000.\u00d300000).put(t2, list);
        }
        return this.\u00d300000.o00000.\u00d200000(d2, g2, list);
    }
}

