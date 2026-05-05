/*
 * Decompiled with CFR 0.152.
 */
package b.t;

import b.o.d.fc;
import b.t.c;
import b.t.d;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class y
implements GenericArrayType,
c {
    private final Type \u00f400000;

    public y(Type type) {
        this.\u00f400000 = type;
    }

    @Override
    public final Type getGenericComponentType() {
        return this.\u00f400000;
    }

    @Override
    public final String getTypeName() {
        return d.o00000(this.\u00f400000) + "[]";
    }

    public final boolean equals(Object object) {
        return object instanceof GenericArrayType && fc.o00000((Object)this.getGenericComponentType(), (Object)((GenericArrayType)object).getGenericComponentType());
    }

    public final int hashCode() {
        return this.getGenericComponentType().hashCode();
    }

    public final String toString() {
        return this.getTypeName();
    }
}

