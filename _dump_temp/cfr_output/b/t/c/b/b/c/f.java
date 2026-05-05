/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.t.c.b.b.c.b.b.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class f {
    private String o00000;
    private final List Object;
    private final List \u00d200000;

    public f(String iterator) {
        this.o00000 = iterator;
        this.Object = new ArrayList(0);
        iterator = b.t.c.b.b.c.b.b.f.o00000.Object();
        f f2 = this;
        Collection collection = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            p p2;
            if (((b.t.c.b.b.c.b.b.f)iterator.next()).o00000() == null) continue;
            collection.add(p2);
        }
        f2.\u00d200000 = (List)collection;
    }

    public final List o00000() {
        return this.Object;
    }

    public final String toString() {
        return this.o00000;
    }
}

