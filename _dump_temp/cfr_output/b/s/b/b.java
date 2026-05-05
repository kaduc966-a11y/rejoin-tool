/*
 * Decompiled with CFR 0.152.
 */
package b.s.b;

import b.o.d.rb;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    private static final Object new(Map map, Object object, Object object2) {
        return map.getOrDefault(object, object2);
    }

    private static final boolean o00000(Map map, Object object, Object object2) {
        return rb.Object(map).remove(object, object2);
    }
}

