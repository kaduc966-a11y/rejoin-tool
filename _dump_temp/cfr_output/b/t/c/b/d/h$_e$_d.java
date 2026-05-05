/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.t.c.b.d.h$_e;
import b.t.c.b.d.i;
import java.lang.reflect.Field;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h$_e$_d
extends h$_e
implements i {
    private final Object private;

    public h$_e$_d(Field field, Object object) {
        super(field, false, null);
        this.private = object;
    }

    @Override
    public final Object o00000(Object[] objectArray) {
        this.\u00d500000(objectArray);
        return ((Field)this.Object()).get(this.private);
    }
}

