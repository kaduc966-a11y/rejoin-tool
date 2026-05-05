/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.fc;
import b.o.d.y;
import b.o.i;
import java.util.Collection;

public final class nb
implements y {
    private final Class O\u00f8o000;
    private final String \u00f8\u00f6o000;

    public nb(Class clazz, String string) {
        this.O\u00f8o000 = clazz;
        this.\u00f8\u00f6o000 = string;
    }

    @Override
    public final Class iffor() {
        return this.O\u00f8o000;
    }

    @Override
    public final Collection thisvoid() {
        throw new i();
    }

    public final boolean equals(Object object) {
        return object instanceof nb && fc.o00000((Object)this.iffor(), (Object)((nb)object).iffor());
    }

    public final int hashCode() {
        return this.iffor().hashCode();
    }

    public final String toString() {
        return this.iffor().toString() + " (Kotlin reflection is not available)";
    }
}

