/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.t.c.b.b.q.d.b.i$_b;
import java.lang.reflect.Method;

final class i {
    public static final i o00000 = new i();
    private static i$_b \u00d200000;

    private i() {
    }

    private final i$_b \u00d200000(Object object) {
        object = object.getClass();
        try {
            object = new i$_b(((Class)object).getMethod("getType", new Class[0]), ((Class)object).getMethod("getAccessor", new Class[0]));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object = new i$_b(null, null);
        }
        return object;
    }

    private final i$_b String(Object object) {
        i$_b i$_b = \u00d200000;
        if (i$_b == null) {
            \u00d200000 = i$_b = this.\u00d200000(object);
        }
        return i$_b;
    }

    public final Class \u00d300000(Object object) {
        Method method = this.String(object).super();
        if (method == null) {
            return null;
        }
        return (Class)method.invoke(object, new Object[0]);
    }

    public final Method o00000(Object object) {
        Method method = this.String(object).\u00d200000();
        if (method == null) {
            return null;
        }
        return (Method)method.invoke(object, new Object[0]);
    }
}

