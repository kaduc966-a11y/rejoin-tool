/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.s.tc;
import java.util.Map;

final class h
implements Map.Entry,
g {
    private final Object O\u00d8\u00f5000;
    private final Object o\u00d8\u00f5000;

    public h(Object object, Object object2) {
        this.O\u00d8\u00f5000 = object;
        this.o\u00d8\u00f5000 = object2;
    }

    public final Object getKey() {
        return this.O\u00d8\u00f5000;
    }

    public final Object getValue() {
        return this.o\u00d8\u00f5000;
    }

    @Override
    public final boolean equals(Object object) {
        return tc.returnreturnclass.o00000(this, object);
    }

    @Override
    public final int hashCode() {
        return tc.returnreturnclass.\u00d200000(this);
    }

    public final String toString() {
        return tc.returnreturnclass.o00000(this);
    }

    public final Object setValue(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

