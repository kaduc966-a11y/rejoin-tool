/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.c;
import b.g.n;
import b.s.mc;
import java.util.Collection;
import java.util.Iterator;

public final class p$_e$3
implements n {
    final /* synthetic */ Iterable \u00d4o0000;
    final /* synthetic */ n \u00d3o0000;

    p$_e$3(Iterable iterable, n n2) {
        this.\u00d4o0000 = iterable;
        this.\u00d3o0000 = n2;
    }

    @Override
    public final Iterator o00000() {
        Collection collection = mc.\u00d500000(this.\u00d4o0000);
        if (collection.isEmpty()) {
            return this.\u00d3o0000.o00000();
        }
        return c.\u00d5o0000(this.\u00d3o0000, arg_0 -> p$_e$3.o00000(collection, arg_0)).o00000();
    }

    private static final boolean o00000(Collection collection, Object object) {
        return collection.contains(object);
    }
}

