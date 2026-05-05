/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.d.c;

import b.t.c.b.b.q.d.b.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class i {
    public static final i o00000 = new i();

    private i() {
    }

    public final String o00000(Method method) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (Class<?> clazz : method.getParameterTypes()) {
            stringBuilder.append(e.\u00d300000(clazz));
        }
        stringBuilder.append(")");
        stringBuilder.append(e.\u00d300000(method.getReturnType()));
        return stringBuilder.toString();
    }

    public final String o00000(Constructor classArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (Class<?> clazz : classArray.getParameterTypes()) {
            stringBuilder.append(e.\u00d300000(clazz));
        }
        stringBuilder.append(")V");
        return stringBuilder.toString();
    }

    public final String o00000(Field field) {
        return e.\u00d300000(field.getType());
    }
}

