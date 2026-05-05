/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.d.w;
import b.q.eb;
import java.util.Map;

public final class eb$_b {
    private eb$_b() {
    }

    private final Map o00000() {
        return (Map)eb.\u00d500000().\u00d200000();
    }

    public final eb o00000(int n2) {
        eb eb2 = (eb)((Object)this.o00000().get(n2));
        if (eb2 == null) {
            throw new IllegalArgumentException("Directionality #" + n2 + " is not defined.");
        }
        return eb2;
    }

    public /* synthetic */ eb$_b(w w2) {
        this();
    }
}

