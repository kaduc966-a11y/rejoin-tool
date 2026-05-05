/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.s.bc;
import b.s.g;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class q
extends g {
    private static final Iterator new(Iterator iterator) {
        return iterator;
    }

    public static final Iterator o00000(Iterator iterator) {
        return new bc(iterator);
    }

    public static final void o00000(Iterator iterator, b.o.e.g g2) {
        while (iterator.hasNext()) {
            Object e2 = iterator.next();
            g2.\u00f800000(e2);
        }
    }
}

