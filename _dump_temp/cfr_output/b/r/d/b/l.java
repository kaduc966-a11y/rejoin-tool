/*
 * Decompiled with CFR 0.152.
 */
package b.r.d.b;

import b.r.b;
import b.r.d.b.l$_b;
import java.lang.reflect.Method;

public final class l {
    public static final l \u00d300000 = new l();
    private static final l$_b o00000 = new l$_b(null, null, null);
    private static l$_b \u00d200000;

    private l() {
    }

    public final String \u00d200000(b object) {
        l$_b l$_b;
        l$_b l$_b2 = \u00d200000;
        if (l$_b2 == null) {
            l$_b2 = l$_b = this.o00000((b)object);
        }
        if (l$_b2 == o00000) {
            return null;
        }
        Object object2 = l$_b.new;
        if (object2 == null || (object2 = ((Method)object2).invoke(object.getClass(), new Object[0])) == null) {
            return null;
        }
        object = object2;
        Object object3 = l$_b.\u00d300000;
        if (object3 == null || (object3 = ((Method)object3).invoke(object, new Object[0])) == null) {
            return null;
        }
        object = object3;
        Method method = l$_b.o00000;
        object = method != null ? method.invoke(object, new Object[0]) : null;
        if (object instanceof String) {
            return (String)object;
        }
        return null;
    }

    private final l$_b o00000(b object) {
        try {
            Method method = Class.class.getDeclaredMethod("getModule", new Class[0]);
            Method method2 = object.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]);
            object = object.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]);
            object = new l$_b(method, method2, (Method)object);
            \u00d200000 = object;
            return object;
        }
        catch (Exception exception) {
            l$_b l$_b;
            \u00d200000 = l$_b = o00000;
            return l$_b;
        }
    }
}

