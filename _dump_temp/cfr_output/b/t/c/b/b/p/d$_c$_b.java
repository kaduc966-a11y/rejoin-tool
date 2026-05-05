/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.d$1;
import b.t.c.b.b.p.d$_c;
import b.t.c.b.b.p.d$_e;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.i$_c;
import b.t.c.b.b.p.v;
import b.t.c.b.b.p.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class d$_c$_b {
    private final Iterator \u00d200000;
    private Map.Entry \u00d300000;
    private final boolean String;
    final /* synthetic */ d$_c o00000;

    private d$_c$_b(d$_c d$_c, boolean bl) {
        this.o00000 = d$_c;
        this.\u00d200000 = d$_c.\u00d200000(this.o00000).\u00d300000();
        if (this.\u00d200000.hasNext()) {
            this.\u00d300000 = (Map.Entry)this.\u00d200000.next();
        }
        this.String = bl;
    }

    public void o00000(int n2, h h2) throws IOException {
        while (this.\u00d300000 != null && ((d$_e)this.\u00d300000.getKey()).Object() < n2) {
            d$_e d$_e = (d$_e)this.\u00d300000.getKey();
            if (this.String && d$_e.o00000() == i$_c.\u00f400000 && !d$_e.\u00d200000()) {
                h2.\u00d400000(d$_e.Object(), (v)this.\u00d300000.getValue());
            } else {
                z.o00000(d$_e, this.\u00d300000.getValue(), h2);
            }
            if (this.\u00d200000.hasNext()) {
                this.\u00d300000 = (Map.Entry)this.\u00d200000.next();
                continue;
            }
            this.\u00d300000 = null;
        }
    }

    /* synthetic */ d$_c$_b(d$_c d$_c, boolean bl, d$1 d$1) {
        this(d$_c, bl);
    }
}

