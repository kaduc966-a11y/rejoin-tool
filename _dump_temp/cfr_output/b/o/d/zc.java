/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.fc;
import b.o.d.y;
import b.q.f;
import b.t.b;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

public final class zc {
    public static final GenericDeclaration o00000(b objectArray, String string) {
        Object object;
        block3: {
            if (!(objectArray instanceof y)) {
                return null;
            }
            String string2 = f.\u00d200000(string, '(', null, 2, null);
            if (fc.o00000((Object)string2, (Object)"<init>")) {
                throw new UnsupportedOperationException("Generic Java constructors are not supported: " + objectArray + '/' + string);
            }
            for (Object object2 : (Object[])((y)objectArray).iffor().getDeclaredMethods()) {
                Method method = (Method)object2;
                if (!(fc.o00000((Object)method.getName(), (Object)string2) && fc.o00000((Object)zc.o00000(method), (Object)string))) continue;
                object = object2;
                break block3;
            }
            object = null;
        }
        return (GenericDeclaration)object;
    }

    private static final String o00000(Method method) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append(method.getName());
        stringBuilder2.append("(");
        for (Class<?> clazz : method.getParameterTypes()) {
            zc.o00000(stringBuilder2, clazz);
        }
        stringBuilder2.append(")");
        zc.o00000(stringBuilder2, method.getReturnType());
        return stringBuilder.toString();
    }

    private static final void o00000(Appendable appendable, Class clazz) {
        while (clazz.isArray()) {
            appendable.append("[");
            clazz = clazz.getComponentType();
        }
        Class<?> clazz2 = clazz;
        if (fc.o00000((Object)clazz2, Void.TYPE)) {
            appendable.append("V");
            return;
        }
        if (fc.o00000(clazz2, Integer.TYPE)) {
            appendable.append("I");
            return;
        }
        if (fc.o00000(clazz2, Long.TYPE)) {
            appendable.append("J");
            return;
        }
        if (fc.o00000(clazz2, Short.TYPE)) {
            appendable.append("S");
            return;
        }
        if (fc.o00000(clazz2, Byte.TYPE)) {
            appendable.append("B");
            return;
        }
        if (fc.o00000(clazz2, Boolean.TYPE)) {
            appendable.append("Z");
            return;
        }
        if (fc.o00000(clazz2, Character.TYPE)) {
            appendable.append("C");
            return;
        }
        if (fc.o00000(clazz2, Float.TYPE)) {
            appendable.append("F");
            return;
        }
        if (fc.o00000(clazz2, Double.TYPE)) {
            appendable.append("D");
            return;
        }
        appendable.append("L");
        appendable.append(f.super(clazz.getName(), '.', '/', false, 4, null));
        appendable.append(";");
    }
}

