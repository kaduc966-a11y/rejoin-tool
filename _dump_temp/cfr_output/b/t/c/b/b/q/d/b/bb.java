/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.o.d.fc;
import b.s.mc;
import b.s.z;
import b.t.c.b.b.n.c.b.m;
import b.t.c.b.b.q.d.b.ab;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bb
extends ab
implements m {
    private final WildcardType \u00d5O0000;
    private final Collection \u00d6O0000;
    private final boolean \u00d8O0000;

    public bb(WildcardType wildcardType) {
        this.\u00d5O0000 = wildcardType;
        this.\u00d6O0000 = mc.\u00d500000();
    }

    protected final WildcardType \u00d8\u00d50000() {
        return this.\u00d5O0000;
    }

    public final ab \u00f4\u00d50000() {
        Object object = this.\u00d8\u00d50000().getUpperBounds();
        Object[] objectArray = this.\u00d8\u00d50000().getLowerBounds();
        if (((Type[])object).length > 1 || objectArray.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + this.\u00d8\u00d50000());
        }
        if (objectArray.length == 1) {
            return ab.oO0000.o00000((Type)z.\u00f6O0000(objectArray));
        }
        if (((Type[])object).length == 1) {
            if (!fc.o00000(object = (Type)z.\u00f6O0000(object), Object.class)) {
                return ab.oO0000.o00000((Type)object);
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean returnString() {
        return !fc.o00000(z.\u00d6o0000(this.\u00d8\u00d50000().getUpperBounds()), Object.class);
    }

    @Override
    public final Collection \u00d300000() {
        return this.\u00d6O0000;
    }

    @Override
    public final boolean new() {
        return this.\u00d8O0000;
    }
}

