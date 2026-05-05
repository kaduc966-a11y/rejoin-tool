/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.dc;
import b.t.c.b.d.j;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class j$_b$2
implements InvocationHandler {
    private final Class \u00d500000;
    private final Map \u00d400000;
    private final dc \u00d300000;
    private final dc new;
    private final List o00000;

    public j$_b$2(Class clazz, Map map, dc dc2, dc dc3, List list) {
        this.\u00d500000 = clazz;
        this.\u00d400000 = map;
        this.\u00d300000 = dc2;
        this.new = dc3;
        this.o00000 = list;
    }

    @Override
    public Object invoke(Object object, Method method, Object[] objectArray) {
        return j.o00000(this.\u00d500000, this.\u00d400000, this.\u00d300000, this.new, this.o00000, object, method, objectArray);
    }
}

