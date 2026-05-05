/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g.b;

import b.t.c.b.b.m.d;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.f$_b;
import java.util.Collection;
import java.util.LinkedHashSet;

public final class b {
    public static final Collection o00000(Collection linkedHashSet, Collection collection) {
        if (collection.isEmpty()) {
            return linkedHashSet;
        }
        if (linkedHashSet == null) {
            return collection;
        }
        if (linkedHashSet instanceof LinkedHashSet) {
            ((LinkedHashSet)linkedHashSet).addAll(collection);
            return linkedHashSet;
        }
        linkedHashSet = new LinkedHashSet(linkedHashSet);
        linkedHashSet.addAll(collection);
        return linkedHashSet;
    }

    public static final d o00000(Iterable object) {
        Collection collection = new d();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            f f2 = (f)e2;
            if (!(f2 != null && f2 != f$_b.\u00f6\u00d30000)) continue;
            collection.add(e2);
        }
        return (d)collection;
    }
}

