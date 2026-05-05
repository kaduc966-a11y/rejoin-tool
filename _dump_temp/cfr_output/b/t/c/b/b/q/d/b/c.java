/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.b.j;
import b.t.c.b.b.n.c.b.o;
import b.t.c.b.b.o.h.e;
import b.t.c.b.b.q.d.b.ab;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
extends ab
implements o {
    private final Class \u00d2O0000;
    private final Collection \u00d3O0000;
    private final boolean private;

    public c(Class clazz) {
        this.\u00d2O0000 = clazz;
        this.\u00d3O0000 = mc.\u00d500000();
    }

    protected final Class \u00d4\u00d50000() {
        return this.\u00d2O0000;
    }

    @Override
    public final j \u00d3\u00d50000() {
        if (fc.o00000((Object)this.\u00d4\u00d50000(), Void.TYPE)) {
            return null;
        }
        return e.o00000(this.\u00d4\u00d50000().getName()).new();
    }

    @Override
    public final Collection \u00d300000() {
        return this.\u00d3O0000;
    }

    @Override
    public final boolean new() {
        return this.private;
    }
}

