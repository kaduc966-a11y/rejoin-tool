/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.s.mc;
import b.t.c.b.b.n.c.b.j;
import b.t.c.b.b.q.d.b.ab;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class db
extends ab
implements j {
    private final Type \u00f5O0000;
    private final ab newsuper;
    private final Collection \u00f6O0000;
    private final boolean \u00f8O0000;

    public db(Type type) {
        ab ab2;
        this.\u00f5O0000 = type;
        db db2 = this;
        type = db2.newString();
        db db3 = db2;
        if (type instanceof GenericArrayType) {
            ab2 = ab.oO0000.o00000(((GenericArrayType)type).getGenericComponentType());
        } else if (type instanceof Class && ((Class)type).isArray()) {
            ab2 = ab.oO0000.o00000(((Class)type).getComponentType());
        } else {
            throw new IllegalArgumentException("Not an array type (" + this.newString().getClass() + "): " + this.newString());
        }
        db3.newsuper = ab2;
        this.\u00f6O0000 = mc.\u00d500000();
    }

    @Override
    protected final Type newString() {
        return this.\u00f5O0000;
    }

    public final ab ifString() {
        return this.newsuper;
    }

    @Override
    public final Collection \u00d300000() {
        return this.\u00f6O0000;
    }

    @Override
    public final boolean new() {
        return this.\u00f8O0000;
    }
}

