/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.b;

import b.t.c.b.b.q.d.b.e;
import b.t.c.b.b.q.d.b.w$_b;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

final class w {
    public static final w \u00d200000 = new w();
    private static w$_b o00000;

    private w() {
    }

    public final w$_b o00000(Member object) {
        GenericDeclaration genericDeclaration;
        object = object.getClass();
        try {
            genericDeclaration = ((Class)object).getMethod("getParameters", new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return new w$_b(null, null);
        }
        Method method = genericDeclaration;
        genericDeclaration = e.\u00d800000((Class)object).loadClass("java.lang.reflect.Parameter");
        return new w$_b(method, ((Class)genericDeclaration).getMethod("getName", new Class[0]));
    }

    public final List \u00d200000(Member object) {
        Object[] objectArray;
        Object object2;
        Object object3 = o00000;
        if (object3 == null) {
            object2 = this;
            synchronized (object2) {
                Object object4 = o00000;
                if (object4 == null) {
                    objectArray = \u00d200000.o00000((Member)object);
                    o00000 = objectArray;
                    object4 = objectArray;
                }
                objectArray = object4;
                // MONITOREXIT @DISABLED, blocks:[0, 1, 7] lbl12 : MonitorExitStatement: MONITOREXIT : var2_2
                object3 = objectArray;
            }
        }
        object2 = object3;
        Method method = ((w$_b)object3).\u00d200000();
        if (method == null) {
            return null;
        }
        objectArray = method;
        Method method2 = ((w$_b)object2).o00000();
        if (method2 == null) {
            return null;
        }
        object2 = method2;
        Object[] objectArray2 = objectArray = (Object[])objectArray.invoke(object, new Object[0]);
        object = new ArrayList(objectArray.length);
        for (Object object5 : objectArray2) {
            Object object6 = object;
            object6.add((String)((Method)object2).invoke(object5, new Object[0]));
        }
        return (List)object;
    }
}

