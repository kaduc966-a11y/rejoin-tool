/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.b;

import b.m;
import java.util.HashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f {
    private final f \u00d200000;
    private final int o00000;
    private final HashMap \u00d300000;

    private final Integer o00000(Object object) {
        boolean bl;
        boolean bl2 = bl = this.\u00d200000 == null || this.\u00d200000.\u00d300000.size() + this.\u00d200000.o00000 == this.o00000;
        if (m.new && !bl) {
            object = "Parent changed in parallel with child: indexes will be wrong";
            throw new AssertionError(object);
        }
        Object object2 = this.\u00d200000;
        if (object2 == null || (object2 = ((f)object2).o00000(object)) == null) {
            object2 = (Integer)this.\u00d300000.get(object);
        }
        return object2;
    }

    public final int new(Object object) {
        int n2;
        Integer n3 = this.o00000(object);
        if (n3 != null) {
            return n3;
        }
        int n4 = n2 = this.o00000 + this.\u00d300000.size();
        ((Map)this.\u00d300000).put(object, n4);
        return n2;
    }
}

