/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.c;
import b.g.n;
import java.util.Iterator;
import java.util.List;

public final class p$_e$4
implements n {
    final /* synthetic */ n nullsuper;
    final /* synthetic */ n oo0000;

    p$_e$4(n n2, n n3) {
        this.nullsuper = n2;
        this.oo0000 = n3;
    }

    @Override
    public final Iterator o00000() {
        List list = c.\u00d6o0000(this.nullsuper);
        if (list.isEmpty()) {
            return this.oo0000.o00000();
        }
        return c.\u00d5o0000(this.oo0000, arg_0 -> p$_e$4.o00000(list, arg_0)).o00000();
    }

    private static final boolean o00000(List list, Object object) {
        return list.contains(object);
    }
}

