/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.n;
import b.i;
import b.r.c.b;
import java.util.Collection;
import java.util.Iterator;

public abstract class l {
    public abstract Object o00000(Object var1, b.r.b var2);

    public abstract Object o00000(Iterator var1, b.r.b var2);

    public final Object o00000(Iterable iterable, b.r.b b2) {
        if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
            return i.o00000;
        }
        Object object = this.o00000(iterable.iterator(), b2);
        if (object == b.\u00d200000()) {
            return object;
        }
        return i.o00000;
    }

    public final Object o00000(n n2, b.r.b b2) {
        Object object = this.o00000(n2.o00000(), b2);
        if (object == b.\u00d200000()) {
            return object;
        }
        return i.o00000;
    }
}

