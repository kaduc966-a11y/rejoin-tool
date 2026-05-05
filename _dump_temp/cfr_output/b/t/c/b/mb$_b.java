/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.t.c.b.b.n.c.b;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.mb;
import java.lang.reflect.Field;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class mb$_b
extends mb {
    private final Field \u00f800000;

    public mb$_b(Field field) {
        super(null);
        this.\u00f800000 = field;
    }

    public final Field OO0000() {
        return this.\u00f800000;
    }

    @Override
    public final String super() {
        return b.\u00d400000(this.\u00f800000.getName()) + "()" + e.\u00d300000(this.\u00f800000.getType());
    }
}

