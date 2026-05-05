/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.k$_b$1;
import b.g.n;
import b.o.e.f;
import java.util.Iterator;

public final class k
implements n {
    private final n \u00d8O0000;
    private final n thissuper;
    private final f \u00d5O0000;

    public k(n n2, n n3, f f2) {
        this.\u00d8O0000 = n2;
        this.thissuper = n3;
        this.\u00d5O0000 = f2;
    }

    @Override
    public final Iterator o00000() {
        return new k$_b$1(this);
    }

    public static final /* synthetic */ n \u00d200000(k k2) {
        return k2.\u00d8O0000;
    }

    public static final /* synthetic */ n o00000(k k2) {
        return k2.thissuper;
    }

    public static final /* synthetic */ f \u00d300000(k k2) {
        return k2.\u00d5O0000;
    }
}

