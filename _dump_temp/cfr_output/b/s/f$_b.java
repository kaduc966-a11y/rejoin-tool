/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.w;
import java.util.Collection;
import java.util.Set;

public final class f$_b {
    private f$_b() {
    }

    public final int o00000(Collection object) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2;
            Object e3 = e2 = object.next();
            n2 += e3 != null ? e3.hashCode() : 0;
        }
        return n2;
    }

    public final boolean o00000(Set set, Set set2) {
        if (set.size() != set2.size()) {
            return false;
        }
        return set.containsAll(set2);
    }

    public /* synthetic */ f$_b(w w2) {
        this();
    }
}

