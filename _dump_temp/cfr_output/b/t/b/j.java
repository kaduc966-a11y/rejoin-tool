/*
 * Decompiled with CFR 0.152.
 */
package b.t.b;

import b.t.b.j$_b;
import java.lang.reflect.Method;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class j {
    public static final j \u00d200000 = new j();
    private static j$_b super;

    private j() {
    }

    private final j$_b o00000() {
        Class<?> clazz;
        try {
            clazz = Class.forName("java.lang.annotation.Repeatable");
        }
        catch (ClassNotFoundException classNotFoundException) {
            return new j$_b(null, null);
        }
        Class<?> clazz2 = clazz;
        return new j$_b(clazz2, clazz2.getMethod("value", new Class[0]));
    }

    public final Class o00000(Class clazz) {
        j$_b j$_b;
        Object object;
        j$_b j$_b2 = super;
        if (j$_b2 == null) {
            object = this;
            synchronized (object) {
                j$_b j$_b3 = super;
                if (j$_b3 == null) {
                    super = j$_b = \u00d200000.o00000();
                    j$_b3 = j$_b;
                }
                j$_b = j$_b3;
                // MONITOREXIT @DISABLED, blocks:[0, 1, 7] lbl11 : MonitorExitStatement: MONITOREXIT : var3_2
                j$_b2 = j$_b;
            }
        }
        j$_b = j$_b2;
        Class clazz2 = j$_b2.o00000();
        if (clazz2 == null) {
            return null;
        }
        object = clazz2;
        Object a = clazz.getAnnotation(object);
        if (a == null) {
            return null;
        }
        object = a;
        Method method = j$_b.\u00d200000();
        if (method == null) {
            return null;
        }
        return (Class)method.invoke(object, new Object[0]);
    }
}

