/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.t.c.b.b.d.k;
import b.t.c.b.b.q.db;
import b.t.c.b.b.q.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class fc {
    public static final List o00000(j j2, k k2) {
        List list = new ArrayList();
        fc.o00000(j2, k2, list);
        return list;
    }

    public static final boolean \u00d200000(j j2, k k2) {
        if (j2 instanceof db) {
            return ((db)j2).\u00d200000(k2);
        }
        return fc.o00000(j2, k2).isEmpty();
    }

    public static final void o00000(j j2, k k2, Collection collection) {
        if (j2 instanceof db) {
            ((db)j2).o00000(k2, collection);
            return;
        }
        collection.addAll(j2.o00000(k2));
    }
}

