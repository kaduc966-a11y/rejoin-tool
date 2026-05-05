/*
 * Decompiled with CFR 0.152.
 */
package b.o.b;

import b.g.c;
import b.g.n;
import b.o.e.h;
import b.s.mc;
import b.s.ub;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public final class b {
    public static final Object \u00d400000(Optional optional) {
        return optional.orElse(null);
    }

    public static final Object o00000(Optional optional, Object object) {
        if (optional.isPresent()) {
            return optional.get();
        }
        return object;
    }

    public static final Object o00000(Optional optional, h h2) {
        if (optional.isPresent()) {
            return optional.get();
        }
        return h2.newreturn();
    }

    public static final Collection o00000(Optional optional, Collection collection) {
        if (optional.isPresent()) {
            collection.add(optional.get());
        }
        return collection;
    }

    public static final List o00000(Optional optional) {
        if (optional.isPresent()) {
            return mc.o00000(optional.get());
        }
        return mc.\u00d500000();
    }

    public static final Set Object(Optional optional) {
        if (optional.isPresent()) {
            return ub.super(optional.get());
        }
        return ub.\u00d300000();
    }

    public static final n \u00d200000(Optional optional) {
        if (optional.isPresent()) {
            return c.\u00d200000(optional.get());
        }
        return c.\u00d200000();
    }
}

