/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.t.c.b.b.g.c;
import b.t.c.b.b.g.g$_b$0;
import b.t.z;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class g {
    private final ConcurrentHashMap \u00d200000 = new ConcurrentHashMap();
    private final AtomicInteger o00000 = new AtomicInteger(0);

    public final c o00000(z z2) {
        return new c(this.\u00d200000(z2));
    }

    public final int \u00d200000(z z2) {
        return this.o00000(z2.\u00d8\u00d3O000());
    }

    public final int o00000(String object) {
        g g2 = this;
        String string = object;
        object = this;
        return g2.o00000(g2.\u00d200000, string, new g$_b$0((g)object));
    }

    public abstract int o00000(ConcurrentHashMap var1, String var2, b.o.e.g var3);

    public final Map o00000() {
        return this.\u00d200000;
    }

    public final Collection \u00d200000() {
        return this.\u00d200000.values();
    }

    private static final int o00000(g g2, String string) {
        return g2.o00000.getAndIncrement();
    }

    static /* synthetic */ int \u00d200000(g g2, String string) {
        return g.o00000(g2, string);
    }
}

