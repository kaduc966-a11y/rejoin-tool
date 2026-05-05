/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.t.c.b.b.d.d;
import b.t.c.b.b.n.b.bb$_c$1;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.j$_d;
import b.t.c.b.b.n.b.t;
import b.t.c.b.b.q.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bb$_c$1$_b
implements j$_d {
    private final t class;
    private final ArrayList \u00d400000;
    final /* synthetic */ bb$_c$1 \u00d300000;

    public bb$_c$1$_b(bb$_c$1 var1_1, t t2) {
        this.\u00d300000 = var1_1;
        this.class = t2;
        this.\u00d400000 = new ArrayList();
    }

    protected final t \u00d200000() {
        return this.class;
    }

    @Override
    public j$_b super(d d2, g g2) {
        return this.\u00d300000.o00000.\u00d200000(d2, g2, this.\u00d400000);
    }

    @Override
    public void super() {
        if (!((Collection)this.\u00d400000).isEmpty()) {
            ((Map)this.\u00d300000.\u00d300000).put(this.class, this.\u00d400000);
        }
    }
}

