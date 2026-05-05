/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.s.mc;
import b.t.c.b.b.o.e.f;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class n {
    public static final Set o00000(Iterable object) {
        Collection collection;
        block2: {
            Collection collection2 = new HashSet();
            object = object.iterator();
            while (object.hasNext()) {
                Iterable iterable;
                if ((Iterable)((f)object.next()).\u00d200000() == null) {
                    collection = null;
                    break block2;
                }
                mc.new(collection2, iterable);
            }
            collection = collection2;
        }
        return (Set)collection;
    }
}

